package pt.pcaleia.util.test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.opentest4j.AssertionFailedError;

import pt.pcaleia.util.test.resources.ClassWithInterface;
import pt.pcaleia.util.test.resources.ClassWithSuperClass;
import pt.pcaleia.util.test.resources.ClassWithoutInterfaces;
import pt.pcaleia.util.test.resources.ClassWithoutSuperClass;
import pt.pcaleia.util.test.resources.FinalClass;
import pt.pcaleia.util.test.resources.NotFinalClass;
import pt.pcaleia.util.test.resources.UtilityClass;
import pt.pcaleia.util.test.resources.UtilityClassNotFinal;
import pt.pcaleia.util.test.resources.UtilityClassThatDoesntThrowExceptionInConstructor;
import pt.pcaleia.util.test.resources.UtilityClassThatThrowsWrongExceptionInDefaultConstructor;
import pt.pcaleia.util.test.resources.UtilityClassWithDefaultConstructorButIsPublic;
import pt.pcaleia.util.test.resources.UtilityClassWithInterface;
import pt.pcaleia.util.test.resources.UtilityClassWithMoreThanOneConstructor;
import pt.pcaleia.util.test.resources.UtilityClassWithNonStaticMethod;
import pt.pcaleia.util.test.resources.UtilityClassWithSuperclass;
import pt.pcaleia.util.test.resources.UtilityClassWithoutDefaultConstructor;


/**
 * @author Pedro Caleia
 */
public final class ClassAssertionsTest {
	
	
	@Test
	public void testThatClassAssertionsClassIsAnUtilityClass() {
		ClassAssertions.assertUtilityClass( ClassAssertions.class );
	}
	
	
	@Test
	public void testThatAssertFinalReturnsWhenArgumentIsAFinalClass() {
		ClassAssertions.assertFinal( FinalClass.class );
	}
	
	
	@Test
	public void testThatAssertFinalThrowsWhenArgumentIsNotAFinalClass() {
		Executable executable = () -> ClassAssertions.assertFinal( NotFinalClass.class );
		Assertions.assertThrows( AssertionFailedError.class, executable );
	}
	
	
	@Test
	public void TestThatAssertFinalThrowsWhenArgumentIsNull() {
		Executable executable = () -> ClassAssertions.assertFinal( null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNoSuperclassReturnsWhenArgumentIsAClassWithoutASuperclass() {
		ClassAssertions.assertNoSuperclass( ClassWithoutSuperClass.class );
	}
	
	
	@Test
	public void testThatAssertNoSuperclassThrowsWhenArgumentIsAClassWithASuperclass() {
		Executable executable = () -> ClassAssertions.assertNoSuperclass( ClassWithSuperClass.class );
		Assertions.assertThrows( AssertionFailedError.class, executable );
	}
	
	
	@Test
	public void TestThatAssertNoSuperclassThrowsWhenArgumentIsNull() {
		Executable executable = () -> ClassAssertions.assertNoSuperclass( null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNoInterfacesReturnsWhenArgumentIsAClassWithoutInterfaces() {
		ClassAssertions.assertNoInterfaces( ClassWithoutInterfaces.class );
	}
	
	
	@Test
	public void testThatAssertNoInterfacesThrowsWhenArgumentIsAClassWithAtLeastOneInterface() {
		Executable executable = () -> ClassAssertions.assertNoInterfaces( ClassWithInterface.class );
		Assertions.assertThrows( AssertionFailedError.class, executable );
	}
	
	
	@Test
	public void TestThatAssertNoInterfacesThrowsWhenArgumentIsNull() {
		Executable executable = () -> ClassAssertions.assertNoInterfaces( null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertUtilityClassReturnsWhenArgumentIsAnUtilityClass() {
		ClassAssertions.assertUtilityClass( UtilityClass.class );
	}
	
	
	@Test
	public void testThatAssertUtilityClassThrowsWhenArgumentIsAnUtilityClassButItIsNotFinal() {
		Executable executable = () -> ClassAssertions.assertUtilityClass( UtilityClassNotFinal.class );
		Assertions.assertThrows( AssertionFailedError.class, executable );
	}
	
	
	@Test
	public void testThatAssertUtilityClassThrowsWhenArgumentIsAnUtilityClassButHasAnSuperclass() {
		Executable executable = () -> ClassAssertions.assertUtilityClass( UtilityClassWithSuperclass.class );
		Assertions.assertThrows( AssertionFailedError.class, executable );
	}
	
	
	@Test
	public void testThatAssertUtilityClassThrowsWhenArgumentIsAnUtilityClassButHasAnInterface() {
		Executable executable = () -> ClassAssertions.assertUtilityClass( UtilityClassWithInterface.class );
		Assertions.assertThrows( AssertionFailedError.class, executable );
	}
	
	
	@Test
	public void testThatAssertUtilityClassThrowsWhenArgumentIsAnUtilityClassButHasMoreThanOneConstructor() {
		Executable executable = () -> ClassAssertions.assertUtilityClass( UtilityClassWithMoreThanOneConstructor.class );
		Assertions.assertThrows( AssertionFailedError.class, executable );
	}
	
	
	@Test
	public void testThatAssertUtilityClassThrowsWhenArgumentIsAnUtilityClassButDoesntHaveTheDefaultConstructor() {
		Executable executable = () -> ClassAssertions.assertUtilityClass( UtilityClassWithoutDefaultConstructor.class );
		Assertions.assertThrows( AssertionFailedError.class, executable );
	}
	
	
	@Test
	public void testThatAssertUtilityClassThrowsWhenArgumentIsAnUtilityClassButTheDefaultConstructorIsPublic() {
		Executable executable = () -> ClassAssertions.assertUtilityClass( UtilityClassWithDefaultConstructorButIsPublic.class );
		Assertions.assertThrows( AssertionFailedError.class, executable );
	}
	
	
	@Test
	public void testThatAssertUtilityClassThrowsWhenArgumentIsAnUtilityClassButTheDefaultConstructorDoesntThrowAnException() {
		Executable executable = () -> ClassAssertions.assertUtilityClass( UtilityClassThatDoesntThrowExceptionInConstructor.class );
		Assertions.assertThrows( AssertionFailedError.class, executable );
	}
	
	
	@Test
	public void testThatAssertUtilityClassThrowsWhenArgumentIsAnUtilityClassButTheDefaultConstructorThrowsWrongException() {
		Executable executable = () -> ClassAssertions.assertUtilityClass( UtilityClassThatThrowsWrongExceptionInDefaultConstructor.class );
		Assertions.assertThrows( AssertionFailedError.class, executable );
	}
	
	
	@Test
	public void testThatAssertUtilityClassThrowsWhenArgumentIsAnUtilityClassButWithNonStaticMethod() {
		Executable executable = () -> ClassAssertions.assertUtilityClass( UtilityClassWithNonStaticMethod.class );
		Assertions.assertThrows( AssertionFailedError.class, executable );
	}

}
