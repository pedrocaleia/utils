package pt.pcaleia.util.asserts;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


/**
 * @author Pedro Caleia
 */
public final class CollectionsArgumentAssertionsTest {
	
	
	private static final List<String> EMPTY_COLLECTION = new ArrayList<>();
	private static final List<String> NON_NULL_ELEMENTS_COLLECTION = new ArrayList<>();
	private static final List<String> SOME_NULL_ELEMENTS_COLLECTION = new ArrayList<>();
	private static final List<String> ALL_NULL_ELEMENTS_COLLECTION = new ArrayList<>();
	
	private static final String[] EMPTY_ARRAY = new String[ 0 ];
	private static final String[] NON_NULL_ELEMENTS_ARRAY = new String[ 3 ];
	private static final String[] SOME_NULL_ELEMENTS_ARRAY = new String[ 3 ];
	private static final String[] ALL_NULL_ELEMENTS_ARRAY = new String[ 2 ];
	
	
	@BeforeAll
	public static void beforeAll() {
		NON_NULL_ELEMENTS_COLLECTION.add( "string one" );
		NON_NULL_ELEMENTS_COLLECTION.add( "string two" );
		NON_NULL_ELEMENTS_COLLECTION.add( "string three" );
		
		SOME_NULL_ELEMENTS_COLLECTION.add( "string one" );
		SOME_NULL_ELEMENTS_COLLECTION.add( null );
		SOME_NULL_ELEMENTS_COLLECTION.add( "string two" );
		
		ALL_NULL_ELEMENTS_COLLECTION.add( null );
		ALL_NULL_ELEMENTS_COLLECTION.add( null );
		
		NON_NULL_ELEMENTS_ARRAY[ 0 ] = "string one";
		NON_NULL_ELEMENTS_ARRAY[ 1 ] = "string two";
		NON_NULL_ELEMENTS_ARRAY[ 2 ] = "string three";
		
		SOME_NULL_ELEMENTS_ARRAY[ 0 ] = "string one";
		SOME_NULL_ELEMENTS_ARRAY[ 1 ] = null;
		SOME_NULL_ELEMENTS_ARRAY[ 2 ] = "string three";
		
		ALL_NULL_ELEMENTS_ARRAY[ 0 ] = null;
		ALL_NULL_ELEMENTS_ARRAY[ 1 ] = null;
	}
	
	
	@Test
	public void testThatAssertNotEmptyForCollectionReturnsWhenTheCollectionOnlyHasNonNullElements() {
		ArgumentAssertions.assertNotEmpty( NON_NULL_ELEMENTS_COLLECTION, "theCollection" );
	}
	
	
	@Test
	public void testThatAssertNotEmptyForCollectionReturnsWhenTheCollectionHasBothNullAndNonNullElements() {
		ArgumentAssertions.assertNotEmpty( SOME_NULL_ELEMENTS_COLLECTION, "theCollection" );
	}
	
	
	@Test
	public void testThatAssertNotEmptyForCollectionThrowsWhenTheCollectionOnlyHasNullElements() {
		Executable executable = () -> ArgumentAssertions.assertNotEmpty( ALL_NULL_ELEMENTS_COLLECTION, "theCollection" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyForCollectionThrowsWhenTheCollectionIsEmpty() {
		Executable executable = () -> ArgumentAssertions.assertNotEmpty( EMPTY_COLLECTION, "theCollection" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyForCollectionThrowsWhenTheCollectionIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNotEmpty( (Collection<?>) null, "theCollection" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyForCollectionThrowsWhenTheSecondArgumentIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNotEmpty( NON_NULL_ELEMENTS_COLLECTION, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertNonNullElementsForCollectionReturnsWhenTheCollectionOnlyHasNonNullElements() {
		ArgumentAssertions.assertNonNullElements( NON_NULL_ELEMENTS_COLLECTION, "theCollection" );
	}
	
	
	@Test
	public void testThatAssertNonNullElementsForCollectionReturnsWhenTheCollectionIsEmpty() {
		ArgumentAssertions.assertNonNullElements( EMPTY_COLLECTION, "theCollection" );
	}
	
	
	@Test
	public void testThatAssertNonNullElementsForCollectionThrowsWhenTheCollectionHasBothNullAndNonNullElements() {
		Executable executable = () -> ArgumentAssertions.assertNonNullElements( SOME_NULL_ELEMENTS_COLLECTION, "theCollection" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNonNullElementsForCollectionThrowsWhenTheCollectionOnlyHasNullElements() {
		Executable executable = () -> ArgumentAssertions.assertNonNullElements( ALL_NULL_ELEMENTS_COLLECTION, "theCollection" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNonNullElementsForCollectionThrowsWhenTheCollectionIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNonNullElements( (Collection<?>) null, "theCollection" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNonNullElementsForCollectionThrowsWhenTheSecondArgumentIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNonNullElements( NON_NULL_ELEMENTS_COLLECTION, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertNotEmptyAndNonNullElementsForCollectionReturnsWhenTheCollectionOnlyHasNonNullElements() {
		ArgumentAssertions.assertNotEmptyAndNonNullElements( NON_NULL_ELEMENTS_COLLECTION, "theCollection" );
	}
	
	
	@Test
	public void testThatAssertNotEmptyAndNonNullElementsForCollectionReturnsWhenTheCollectionIsEmpty() {
		Executable executable = () -> ArgumentAssertions.assertNotEmptyAndNonNullElements( EMPTY_COLLECTION, "theCollection" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyAndNonNullElementsForCollectionThrowsWhenTheCollectionHasBothNullAndNonNullElements() {
		Executable executable = () -> ArgumentAssertions.assertNotEmptyAndNonNullElements( SOME_NULL_ELEMENTS_COLLECTION, "theCollection" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyAndNonNullElementsForCollectionThrowsWhenTheCollectionOnlyHasNullElements() {
		Executable executable = () -> ArgumentAssertions.assertNotEmptyAndNonNullElements( ALL_NULL_ELEMENTS_COLLECTION, "theCollection" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyAndNonNullElementsForCollectionThrowsWhenTheCollectionIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNotEmptyAndNonNullElements( (Collection<?>) null, "theCollection" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyAndNonNullElementsForCollectionThrowsWhenTheSecondArgumentIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNotEmptyAndNonNullElements( NON_NULL_ELEMENTS_COLLECTION, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertNotEmptyForArrayReturnsWhenTheArrayOnlyHasNonNullElements() {
		ArgumentAssertions.assertNotEmpty( NON_NULL_ELEMENTS_ARRAY, "theArray" );
	}
	
	
	@Test
	public void testThatAssertNotEmptyForArrayReturnsWhenTheArrayHasBothNullAndNonNullElements() {
		ArgumentAssertions.assertNotEmpty( SOME_NULL_ELEMENTS_ARRAY, "theArray" );
	}
	
	
	@Test
	public void testThatAssertNotEmptyForArrayThrowsWhenTheArrayOnlyHasNullElements() {
		Executable executable = () -> ArgumentAssertions.assertNotEmpty( ALL_NULL_ELEMENTS_ARRAY, "theArray" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyForArrayThrowsWhenTheArrayIsEmpty() {
		Executable executable = () -> ArgumentAssertions.assertNotEmpty( EMPTY_ARRAY, "theArray" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyForArrayThrowsWhenTheArrayIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNotEmpty( (String[]) null, "theArray" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyForArrayThrowsWhenTheSecondArgumentIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNotEmpty( NON_NULL_ELEMENTS_ARRAY, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertNonNullElementsForArrayReturnsWhenTheArrayOnlyHasNonNullElements() {
		ArgumentAssertions.assertNonNullElements( NON_NULL_ELEMENTS_ARRAY, "theArray" );
	}
	
	
	@Test
	public void testThatAssertNonNullElementsForArrayReturnsWhenTheArrayIsEmpty() {
		ArgumentAssertions.assertNonNullElements( EMPTY_ARRAY, "theArray" );
	}
	
	
	@Test
	public void testThatAssertNonNullElementsForArrayThrowsWhenTheArrayHasBothNullAndNonNullElements() {
		Executable executable = () -> ArgumentAssertions.assertNonNullElements( SOME_NULL_ELEMENTS_ARRAY, "theArray" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNonNullElementsForArrayThrowsWhenTheArrayOnlyHasNullElements() {
		Executable executable = () -> ArgumentAssertions.assertNonNullElements( ALL_NULL_ELEMENTS_ARRAY, "theArray" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNonNullElementsForArrayThrowsWhenTheArrayIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNonNullElements( (String[]) null, "theArray" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNonNullElementsForArrayThrowsWhenTheSecondArgumentIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNonNullElements( NON_NULL_ELEMENTS_ARRAY, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertNotEmptyAndNonNullElementsForArrayReturnsWhenTheArrayOnlyHasNonNullElements() {
		ArgumentAssertions.assertNotEmptyAndNonNullElements( NON_NULL_ELEMENTS_ARRAY, "theArray" );
	}
	
	
	@Test
	public void testThatAssertNotEmptyAndNonNullElementsForArrayReturnsWhenTheArrayIsEmpty() {
		Executable executable = () -> ArgumentAssertions.assertNotEmptyAndNonNullElements( EMPTY_ARRAY, "theArray" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyAndNonNullElementsForArrayThrowsWhenTheArrayHasBothNullAndNonNullElements() {
		Executable executable = () -> ArgumentAssertions.assertNotEmptyAndNonNullElements( SOME_NULL_ELEMENTS_ARRAY, "theArray" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyAndNonNullElementsForArrayThrowsWhenTheArrayOnlyHasNullElements() {
		Executable executable = () -> ArgumentAssertions.assertNotEmptyAndNonNullElements( ALL_NULL_ELEMENTS_ARRAY, "theArray" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyAndNonNullElementsForArrayThrowsWhenTheArrayIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNotEmptyAndNonNullElements( (String[]) null, "theArray" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNotEmptyAndNonNullElementsForArrayThrowsWhenTheSecondArgumentIsNull() {
		Executable executable = () -> ArgumentAssertions.assertNotEmptyAndNonNullElements( NON_NULL_ELEMENTS_ARRAY, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
}
