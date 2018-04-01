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
	}
	
	
	/**
	 * When using an {@link com.fasterxml.jackson.databind.ObjectMapper ObjectMapper} to convert an {@link Object Object} into a 
	 * {@link com.fasterxml.jackson.databind.JsonNode JsonNode} (using the method {@link com.fasterxml.jackson.databind.ObjectMapper#valueToTree valueToTree}), 
	 * {@code long} types get converted into a {@link com.fasterxml.jackson.databind.node.LongNode LongNode}.
	 * 
	 * If you convert a {@link java.util.String String} into a {@link com.fasterxml.jackson.databind.JsonNode JsonNode} (using the method 
	 * {@link com.fasterxml.jackson.databind.ObjectMapper#readTree readTree}) small numeric values get converted into the type 
	 * {@link com.fasterxml.jackson.databind.node.IntNode IntNode} which makes the equals comparison fail.
	 * 
	 * @param actual
	 *            Actual value
	 * @param expected
	 *            Expected value 
	 */
	public static void assertEquals( JsonNode actual, JsonNode expected ) throws IOException {
		if( actual == null ) {
			throw new IllegalArgumentException( "The 'actual' argument is null and therefore not a valid Json String." );
		}
		else if( expected == null ) {
			throw new IllegalArgumentException( "The 'expected' argument is null and therefore not a valid Json String." );
		}
		
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
	
	
	public static void assertEquals( Object actual, String expectedPathFirst, String ... expectedPathMore ) throws IOException {
		JsonNode actualJsonNode = DEFAULT_MAPPER.valueToTree( actual );
		String expected = Resources.getResourceAsString( expectedPathFirst, expectedPathMore );
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
