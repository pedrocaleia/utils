package pt.pcaleia.util.test.exceptions;


import pt.pcaleia.util.ArgumentAssertions;


/**
 * @author Pedro Caleia
 */
@SuppressWarnings( "serial" )
public final class InvalidJsonException extends RuntimeException {
	
	
	public InvalidJsonException( String message ) {
		super( message );
		
		ArgumentAssertions.assertNotEmpty( message, "message" );
	}
	
}
