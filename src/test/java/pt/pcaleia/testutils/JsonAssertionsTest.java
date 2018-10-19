package pt.pcaleia.testutils;


import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.opentest4j.AssertionFailedError;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import pt.pcaleia.util.test.JsonAssertions;
import pt.pcaleia.util.test.exceptions.InvalidJsonException;


public final class JsonAssertionsTest {
	
	
	private static final ObjectMapper DEFAULT_MAPPER = new ObjectMapper();
	
	
	@Test
	public void testThatConstructorThrowsAnAE() throws Exception {
		Constructor<JsonAssertions> constructor = JsonAssertions.class.getDeclaredConstructor();
		constructor.setAccessible( true );
		
		Executable executable = () -> {
			try {
				constructor.newInstance();
			}
			catch( InvocationTargetException ite ) {
				throw ite.getCause();
			}
		};
		Assertions.assertThrows( AssertionError.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsJsonNodeJsonNodeSuccedesWhenArgumentsAreEqual() throws IOException {
		JsonNode actualJsonNode = DEFAULT_MAPPER.readTree( "{ \"property\": \"value\" }" );
		JsonNode expectedJsonNode = DEFAULT_MAPPER.readTree( "{ \"property\": \"value\" }" );
		
		JsonAssertions.assertEquals( actualJsonNode, expectedJsonNode );
	}
	
	
	@Test
	public void testThatAssertEqualsJsonNodeJsonNodeFailsWhenArgumentsAreNotEqual() throws IOException {
		JsonNode actualJsonNode = DEFAULT_MAPPER.readTree( "{ \"property\": \"value1\" }" );
		JsonNode expectedJsonNode = DEFAULT_MAPPER.readTree( "{ \"property\": \"value2\" }" );
		
		Executable executable = () -> JsonAssertions.assertEquals( actualJsonNode, expectedJsonNode );
		Assertions.assertThrows( AssertionFailedError.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsJsonNodeJsonNodeThrowsAnIAEWhenTheFirstArgumentIsNull() throws IOException {
		JsonNode expectedJsonNode = DEFAULT_MAPPER.readTree( "{ \"property\": \"value2\" }" );
		
		Executable executable = () -> JsonAssertions.assertEquals( (JsonNode) null, expectedJsonNode );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsJsonNodeJsonNodeThrowsAnIAEWhenTheSecondArgumentIsNull() throws IOException {
		JsonNode actualJsonNode = DEFAULT_MAPPER.readTree( "{ \"property\": \"value1\" }" );
		
		Executable executable = () -> JsonAssertions.assertEquals( actualJsonNode, (JsonNode) null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsJsonNodeJsonNodeThrowsAnIAEWhenBothArgumentsAreNull() {
		Executable executable = () -> JsonAssertions.assertEquals( (JsonNode) null, (JsonNode) null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsStringStringSuccedesWhenArgumentsAreEqual() throws IOException {
		JsonAssertions.assertEquals( "{ \"property\": \"value\" }", "{ \"property\": \"value\" }" );
	}
	
	
	@Test
	public void testThatAssertEqualsStringStringFailsWhenArgumentsAreNotEqual() {
		Executable executable = () -> JsonAssertions.assertEquals( "{ \"property\": \"value1\" }", "{ \"property\": \"value2\" }" );
		Assertions.assertThrows( AssertionFailedError.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsStringStringThrowsAnIAEWhenTheFirstArgumentIsNull() {
		Executable executable = () -> JsonAssertions.assertEquals( (String) null, "{ \"property\": \"value2\" }" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsStringStringThrowsAnIAEWhenTheSecondArgumentIsNull() {
		Executable executable = () -> JsonAssertions.assertEquals( "{ \"property\": \"value1\" }", (String) null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsStringStringThrowsAnIAEWhenBothArgumentsAreNull() {
		Executable executable = () -> JsonAssertions.assertEquals( (String) null, (String) null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsStringStringThrowsAnIJEWhenTheFirstArgumentIsAInvalidJson() {
		Executable executable = () -> JsonAssertions.assertEquals( " blabla } ", "{ \"property\": \"value2\" }" );
		Assertions.assertThrows( InvalidJsonException.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsStringStringThrowsAnIJEWhenTheSecondArgumentIsAInvalidJson() {
		Executable executable = () -> JsonAssertions.assertEquals( "{ \"property\": \"value1\" }", "{ \"property\": \"value2\" " );
		Assertions.assertThrows( InvalidJsonException.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsStringStringThrowsAnIJEWhenBothArgumentsAreAInvalidJsons() {
		Executable executable = () -> JsonAssertions.assertEquals( " blabla } ", "{ \"property\": \"value2\" " );
		Assertions.assertThrows( InvalidJsonException.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsStringStringThrowsAnIJEWhenTheFirstArgumentIsAEmptyString() {
		Executable executable = () -> JsonAssertions.assertEquals( "", "{ \"property\": \"value2\" }" );
		Assertions.assertThrows( InvalidJsonException.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsStringStringThrowsAnIJEWhenTheSecondArgumentIsAEmptyString() {
		Executable executable = () -> JsonAssertions.assertEquals( "{ \"property\": \"value1\" }", "\t" );
		Assertions.assertThrows( InvalidJsonException.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsStringStringThrowsAnIAEWhenBothArgumentsEmptyStrings() {
		Executable executable = () -> JsonAssertions.assertEquals( "   ", "   \t   " );
		Assertions.assertThrows( InvalidJsonException.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsJsonNodeStringSuccedesWhenArgumentsAreEqual() throws IOException {
		JsonNode actualJsonNode = DEFAULT_MAPPER.readTree( "{ \"property\": \"value\" }" );
		String expected = "{ \"property\": \"value\" }";
		
		JsonAssertions.assertEquals( actualJsonNode, expected );
	}
	
	
	@Test
	public void testThatAssertEqualsJsonNodeStringFailsWhenArgumentsAreNotEqual() throws IOException {
		JsonNode actualJsonNode = DEFAULT_MAPPER.readTree( "{ \"property\": \"value1\" }" );
		String expected = "{ \"property\": \"value2\" }";
		
		Executable executable = () -> JsonAssertions.assertEquals( actualJsonNode, expected );
		Assertions.assertThrows( AssertionFailedError.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsJsonNodeStringThrowsAnIAEWhenTheFirstArgumentIsNull() throws IOException {
		String expected = "{ \"property\": \"value1\" }";
		
		Executable executable = () -> JsonAssertions.assertEquals( (JsonNode) null, expected );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsJsonNodeStringThrowsAnIAEWhenTheSecondArgumentIsNull() throws IOException {
		JsonNode actualJsonNode = DEFAULT_MAPPER.readTree( "{ \"property\": \"value2\" }" );
		
		Executable executable = () -> JsonAssertions.assertEquals( actualJsonNode, (String) null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsStringJsonNodeSuccedesWhenArgumentsAreEqual() throws IOException {
		String actual = "{ \"property\": \"value\" }";
		JsonNode expectedJsonNode = DEFAULT_MAPPER.readTree( "{ \"property\": \"value\" }" );
		
		JsonAssertions.assertEquals( actual, expectedJsonNode );
	}
	
	
	@Test
	public void testThatAssertEqualsStringJsonNodeFailsWhenArgumentsAreNotEqual() throws IOException {
		String actual = "{ \"property\": \"value2\" }";
		JsonNode expectedJsonNode = DEFAULT_MAPPER.readTree( "{ \"property\": \"value1\" }" );
		
		Executable executable = () -> JsonAssertions.assertEquals( actual, expectedJsonNode );
		Assertions.assertThrows( AssertionFailedError.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsStringJsonNodeThrowsAnIAEWhenTheFirstArgumentIsNull() throws IOException {
		JsonNode expectedJsonNode = DEFAULT_MAPPER.readTree( "{ \"property\": \"value1\" }" );
		
		Executable executable = () -> JsonAssertions.assertEquals( (String) null, expectedJsonNode );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertEqualsStringJsonNodeThrowsAnIAEWhenTheSecondArgumentIsNull() throws IOException {
		String actual = "{ \"property\": \"value2\" }";
		
		Executable executable = () -> JsonAssertions.assertEquals( actual, (JsonNode) null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
}
