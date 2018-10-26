package pt.pcaleia.util.asserts;


import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;


/**
 * @author Pedro Caleia
 */
final class CollectionArgumentAssertions {
	
	
	private static final String MUST_HAVE_NON_NULL_ELEMENTS_MESSAGE = "The %s argument must have at least 1 non-null element.";
	private static final String CANNOT_HAVE_NULL_ELEMENTS_MESSAGE = "The %s argument cannot have null elements.";
	
	
	public static <E> void assertNotEmpty( Collection<E> collection, String argumentName ) {
		ArgumentAssertions.assertNotNull( argumentName, "argumentName" );
		ArgumentAssertions.assertNotNull( collection, argumentName );
		
		if( collection.size() == 0 ) {
			String message = String.format( MUST_HAVE_NON_NULL_ELEMENTS_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );
		}
		else {
			Predicate<E> nullPredicate = element -> element == null;
			long count = collection.parallelStream().filter( nullPredicate ).count();
			if( collection.size() == count ) {
				String message = String.format( MUST_HAVE_NON_NULL_ELEMENTS_MESSAGE, argumentName );
				throw new IllegalArgumentException( message );
			}
		}
	}
	
	
	public static <E> void assertNonNullElements( Collection<E> collection, String argumentName ) {
		ArgumentAssertions.assertNotNull( argumentName, "argumentName" );
		ArgumentAssertions.assertNotNull( collection, argumentName );
		
		if( collection.size() > 0 ) {
			Predicate<E> nullPredicate = element -> element == null;
			long count = collection.parallelStream().filter( nullPredicate ).count();
			if( count > 0 ) {
				String message = String.format( CANNOT_HAVE_NULL_ELEMENTS_MESSAGE, argumentName );
				throw new IllegalArgumentException( message );
			}
		}
	}
	
	
	public static <E> void assertNotEmptyAndNonNullElements( Collection<E> collection, String argumentName ) {
		ArgumentAssertions.assertNotNull( argumentName, "argumentName" );
		ArgumentAssertions.assertNotNull( collection, argumentName );
		
		if( collection.size() == 0 ) {
			String message = String.format( MUST_HAVE_NON_NULL_ELEMENTS_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );
		}
		else {
			Predicate<E> nullPredicate = element -> element == null;
			long count = collection.parallelStream().filter( nullPredicate ).count();
			if( count > 0 ) {
				String message = String.format( CANNOT_HAVE_NULL_ELEMENTS_MESSAGE, argumentName );
				throw new IllegalArgumentException( message );
			}
		}
	}
	
	
	public static <E> void assertNotEmpty( E[] array, String argumentName ) {
		ArgumentAssertions.assertNotNull( argumentName, "argumentName" );
		ArgumentAssertions.assertNotNull( array, argumentName );
		
		if( array.length == 0 ) {
			String message = String.format( MUST_HAVE_NON_NULL_ELEMENTS_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );
		}
		else {
			Predicate<E> nullPredicate = element -> element == null;
			long count = Arrays.stream( array ).parallel().filter( nullPredicate ).count();
			if( array.length == count ) {
				String message = String.format( MUST_HAVE_NON_NULL_ELEMENTS_MESSAGE, argumentName );
				throw new IllegalArgumentException( message );
			}
		}
	}
	
	
	public static <E> void assertNonNullElements( E[] array, String argumentName ) {
		ArgumentAssertions.assertNotNull( argumentName, "argumentName" );
		ArgumentAssertions.assertNotNull( array, argumentName );
		
		if( array.length > 0 ) {
			Predicate<E> nullPredicate = element -> element == null;
			long count = Arrays.stream( array ).parallel().filter( nullPredicate ).count();
			if( count > 0 ) {
				String message = String.format( CANNOT_HAVE_NULL_ELEMENTS_MESSAGE, argumentName );
				throw new IllegalArgumentException( message );
			}
		}
	}
	
	
	public static <E> void assertNotEmptyAndNonNullElements( E[] array, String argumentName ) {
		ArgumentAssertions.assertNotNull( argumentName, "argumentName" );
		ArgumentAssertions.assertNotNull( array, argumentName );
		
		if( array.length == 0 ) {
			String message = String.format( MUST_HAVE_NON_NULL_ELEMENTS_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );
		}
		else {
			Predicate<E> nullPredicate = element -> element == null;
			long count = Arrays.stream( array ).parallel().filter( nullPredicate ).count();
			if( count > 0 ) {
				String message = String.format( CANNOT_HAVE_NULL_ELEMENTS_MESSAGE, argumentName );
				throw new IllegalArgumentException( message );
			}
		}
	}

}
