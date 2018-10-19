package pt.pcaleia.util.test.exceptions;


/**
 * @author Pedro Caleia
 */
@SuppressWarnings( "serial" )
public final class InvalidJsonException extends RuntimeException {
	
	
	public InvalidJsonException( String message ) {
		super( message );
	}
	
}
