package pt.pcaleia.util;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import pt.pcaleia.util.Resources;
import pt.pcaleia.util.test.ClassAssertions;


/**
 * @author Pedro Caleia
 */
public final class ResourcesTest {
	
	
	@Test
	public void testThatResourcesClassIsAnUtilityClass() {
		ClassAssertions.assertUtilityClass( Resources.class );
	}
	
	
	@Test
	public void testThatGetResourceAsStringPathReturnsAValidResultWhenTheArgumentIsAValidFile() throws IOException {
		Path path = Paths.get( "just_a_resource_file.txt" );
		String result = Resources.getResourceAsString( path );
		
		Assertions.assertEquals( "success", result );
	}
	
	
	@Test
	public void testThatGetResourceAsStringPathThrowsAnIAEWhenTheArgumentIsNotAValidFile() throws IOException {
		Path path = Paths.get( "inexistent_resource_file.txt" );
		Executable executable = () -> Resources.getResourceAsString( path );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatGetResourceAsStringPathThrowsAnIAEWhenTheArgumentIsNull() throws IOException {
		Executable executable = () -> Resources.getResourceAsString( (Path) null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatGetResourceAsStringStringVarArgsReturnsAValidResultWhenTheArgumentIsAValidFile() throws IOException {
		String result = Resources.getResourceAsString( "just_a_resource_file.txt" );
		
		Assertions.assertEquals( "success", result );
	}
	
	
	@Test
	public void testThatGetResourceAsStringStringVarArgsThrowsAnIAEWhenTheArgumentIsNotAValidFile() throws IOException {
		Executable executable = () -> Resources.getResourceAsString( "inexistent_resource_file.txt" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatGetResourceAsStringStringVarArgsThrowsAnIAEWhenTheFirstArgumentIsNull() throws IOException {
		Executable executable = () -> Resources.getResourceAsString( (String) null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
}
