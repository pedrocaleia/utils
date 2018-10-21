package pt.pcaleia.util;


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
		Executable executable = () -> ArgumentAssertions.assertNotEmpty( null, "theArgument" );
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

}
