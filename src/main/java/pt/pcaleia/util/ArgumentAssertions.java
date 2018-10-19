package pt.pcaleia.util;


/**
 * @author Pedro Caleia
 */
public final class ArgumentAssertions {
	
	
	private static final String NULL_MESSAGE = "The '%s' argument cannot be null.";

	
	private ArgumentAssertions() {
		throw new AssertionError( ArgumentAssertions.class.getSimpleName() + " class cannot be instantiated." );
	}
	
	
	public static void assertNotNull( Object argument, String argumentName ) {
		if( argumentName == null ) {
			String message = String.format( NULL_MESSAGE, "argumentName" );
			throw new IllegalArgumentException( message );
		}
		
		if( argument == null ) {
			String message = String.format( NULL_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );
		}
	}

}
