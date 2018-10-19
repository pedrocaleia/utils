package pt.pcaleia.testutils;


import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import pt.pcaleia.testutils.Resources;


public final class ResourcesTest {
	
	
	@Test
	public void testThatGetResourceAsStringReturnsAValidResultWhenTheArgumentIsAValidFile() throws IOException {
		String result = Resources.getResourceAsString( "just_a_resource_file.txt" );
		Assertions.assertEquals( "success", result );
	}
	
	
	@Test
	public void testThatGetResourceAsStringThrowsAnIAEWhenTheArgumentIsNotAValidFile() throws IOException {
		Executable executable = () -> Resources.getResourceAsString( "inexistent_resource_file.txt" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatGetResourceAsStringThrowsAnIAEWhenTheArgumentIsNull() throws IOException {
		Executable executable = () -> Resources.getResourceAsString( null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
}
