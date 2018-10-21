package pt.pcaleia.util;


/**
 * @author Pedro Caleia
 */
public final class ArgumentAssertions {
	
	
	private static final String NULL_MESSAGE = "The '%s' argument cannot be null.";
	private static final String NULL_OR_EMPTY_MESSAGE = "The '%s' argument cannot be null or empty.";

	
	private ArgumentAssertions() {
		throw new AssertionError( ArgumentAssertions.class.getSimpleName() + " class cannot be instantiated." );
	}
	
	
	public static void assertNotNull( Object argument, String argumentName ) {
		assertNotEmpty( argumentName, "argumentName" );
		
		if( argument == null ) {
			String message = String.format( NULL_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );
		}
	}
	
	
	public static void assertNotEmpty( String argument, String argumentName ) {
		if( argumentName == null || argumentName.trim().isEmpty() ) {
			String message = String.format( NULL_OR_EMPTY_MESSAGE, "argumentName" );
			throw new IllegalArgumentException( message );
		}
		
		if( argument == null || argument.trim().isEmpty() ) {
			String message = String.format( NULL_OR_EMPTY_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );
		}
	}

}
