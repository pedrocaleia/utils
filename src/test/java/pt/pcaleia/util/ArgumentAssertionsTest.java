package pt.pcaleia.util;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


/**
 * @author Pedro Caleia
 */
public final class ArgumentAssertionsTest {
	
	
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
	public void testThatAssertNotNullThrowsAnIAEWhenBothArgumentsAreNull() {
		Executable executable = () -> ArgumentAssertions.assertNotNull( null, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}

}
