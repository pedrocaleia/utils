package pt.pcaleia.util.test;


import java.io.IOException;

import org.junit.jupiter.api.Assertions;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import pt.pcaleia.util.ArgumentAssertions;
import pt.pcaleia.util.test.exceptions.InvalidJsonException;


/**
 * @author Pedro Caleia
 */
public final class JsonAssertions {
	
	
	private static final ObjectMapper DEFAULT_MAPPER = new ObjectMapper();
	private static final String INVALID_JSON = "The '%s' argument is not a valid Json String.";
	
	
	private JsonAssertions() {
		throw new AssertionError( JsonAssertions.class.getSimpleName() + " class cannot be instantiated." );
	}
	
	
	public static void assertEquals( JsonNode actual, JsonNode expected ) throws IOException {
		ArgumentAssertions.assertNotNull( actual, "actual" );
		ArgumentAssertions.assertNotNull( expected, "expected" );
		
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
		JsonNode actualJsonNode = jsonStringToJsonNode( actual, "actual" );
		assertEquals( actualJsonNode, expected );
	}
	
	
	private static JsonNode jsonStringToJsonNode( String json, String argumentName ) throws IOException {
		ArgumentAssertions.assertNotNull( json, argumentName );
		
		JsonNode jsonNode;
		try {
			jsonNode = DEFAULT_MAPPER.readTree( json );
			if( jsonNode == null ) {
				throw new InvalidJsonException( String.format( INVALID_JSON, argumentName ) );
			}
		}
		catch( JsonParseException jpe ) {
			throw new InvalidJsonException( String.format( INVALID_JSON, argumentName ) );
		}
		
		return jsonNode;
	}
	
}
