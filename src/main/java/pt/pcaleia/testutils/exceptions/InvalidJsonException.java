package pt.pcaleia.testutils.exceptions;


@SuppressWarnings( "serial" )
public final class InvalidJsonException extends RuntimeException {
	
	
	public InvalidJsonException( String message ) {
		super( message );
	}
	
}
