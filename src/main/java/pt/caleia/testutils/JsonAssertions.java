package pt.caleia.testutils;


import java.io.IOException;

import org.junit.jupiter.api.Assertions;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import pt.caleia.testutils.exceptions.InvalidJsonException;


/**
 * @author Pedro Caleia
 */
public final class JsonAssertions {
	
	
	private static final ObjectMapper DEFAULT_MAPPER = new ObjectMapper();
	
	
	private JsonAssertions() {
		throw new AssertionError( JsonAssertions.class.getSimpleName() + " class cannot be instantiated." );
	}
	
	
	public static void assertEquals( JsonNode actual, JsonNode expected ) throws IOException {
		if( actual == null ) {
			throw new IllegalArgumentException( "The 'actual' argument is null and therefore not a valid Json String." );
		}
		else if( expected == null ) {
			throw new IllegalArgumentException( "The 'expected' argument is null and therefore not a valid Json String." );
		}
		
		// When using an ObjectMapper to convert an Object into a JsonNode, using the method ObjectMapper#valueToTree, long types get converted into
		// a LongNode but if you convert a String into a JsonNode, using the method ObjectMapper#readTree, small numeric values get converted into the type 
		// IntNode, which makes the equals comparison fail between the LongNode and the IntNode.
		// Because of this the JsonNode objects need to be converted to String and back to JsonNode using the ObjectMapper#readTree method to ensure that
		// all the values are transformed into Objects of the same type.
		
		JsonNode actualJsonNode = DEFAULT_MAPPER.readTree( actual.toString() );
		JsonNode expectedJsonNode = DEFAULT_MAPPER.readTree( expected.toString() );
		Assertions.assertEquals( actualJsonNode, expectedJsonNode );
	}
	
	
	public static void assertEquals( String actual, String expected ) throws IOException {
		JsonNode actualJsonNode = jsonStringToJsonNode( actual, "actual" );
		JsonNode expectedJsonNode = jsonStringToJsonNode( expected, "expected" );
		
		assertEquals( actualJsonNode, expectedJsonNode );
	}
	
	
	public static void assertEquals( JsonNode actual, String expected ) throws IOException {
		JsonNode expectedJsonNode = jsonStringToJsonNode( expected, "expected" );
		assertEquals( actual, expectedJsonNode );
	}
	
	
	public static void assertEquals( String actual, JsonNode expected ) throws IOException {
		JsonNode actualJsonNode = DEFAULT_MAPPER.readTree( actual );
		assertEquals( actualJsonNode, expected );
	}
	
	
	private static JsonNode jsonStringToJsonNode( String json, String argumentName ) throws IOException {
		if( json == null ) {
			throw new IllegalArgumentException( String.format( "The '%s' argument is null and therefore not a valid Json String.", argumentName ) );
		}
		
		JsonNode jsonNode;
		try {
			jsonNode = DEFAULT_MAPPER.readTree( json );
			if( jsonNode == null ) {
				throw new InvalidJsonException( String.format( "The '%s' argument is not a valid Json String.", argumentName ) );
			}
		}
		catch( JsonParseException jpe ) {
			throw new InvalidJsonException( String.format( "The '%s' argument is not a valid Json String.", argumentName ) );
		}
		
		return jsonNode;
	}
	
}
