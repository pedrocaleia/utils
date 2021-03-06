package pt.pcaleia.util.asserts;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import pt.pcaleia.util.test.ClassAssertions;
import pt.pcaleia.util.test.TestConstants;


/**
 * @author Pedro Caleia
 */
public final class ArgumentAssertionsTest {
	
	
	@Test
	public void testThatArgumentAssertionsClassIsAnUtilityClass() {
		ClassAssertions.assertUtilityClass( ArgumentAssertions.class );
	}
	
	
	@Test
	public void testThatAssertNullReturnsWhenBothArgumentsAreValid() {
		ArgumentAssertions.assertNull( null, "theArgument" );
	}
	
	
	@Test
	public void testThatAssertNullThrowsWhenTheFirstArgumentIsNotNull() {
		Executable executable = () -> ArgumentAssertions.assertNull( "just a not null object", "theArgument" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNullThrowsWhenTheSecondArgumentIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNotNull( null, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotNullReturnsWhenBothArgumentsAreValid() {
		ArgumentAssertions.assertNotNull( "just a not null object", "theArgument" );
	}
	
	
	@Test
	public void testThatAssertNotNullThrowsAnIAEWhenTheFirstArgumentIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNotNull( null, "theArgument" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotNullThrowsAnIAEWhenTheSecondArgumentIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNotNull( "just a not null object", null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyReturnsWhenBothArgumentsAreValid() {
		ArgumentAssertions.assertNotEmpty( "just a string", "theArgument" );
	}
	
	
	@Test
	public void testThatAssertNotEmptyThrowsAnIAEWhenTheFirstArgumentIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNotEmpty( (String) null, "theArgument" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyThrowsAnIAEWhenTheSecondArgumentIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNotEmpty( "just a string", null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyThrowsAnIAEWhenTheFirstArgumentIsAnEmptyString() {
		Executable executable = () -> ArgumentAssertions.assertNotEmpty( TestConstants.WHITE_SPACE_STRING, "theArgument" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyThrowsAnIAEWhenTheSecondArgumentIsAnEmptyString() {
		Executable executable = () -> ArgumentAssertions.assertNotEmpty( "just a string", TestConstants.WHITE_SPACE_STRING );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}

}
