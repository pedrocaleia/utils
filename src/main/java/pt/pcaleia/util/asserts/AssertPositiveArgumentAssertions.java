package pt.pcaleia.util.asserts;


import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * @author Pedro Caleia
 */
final class AssertPositiveArgumentAssertions {
	
	
	private static final String MUST_BE_POSITIVE_MESSAGE = "The '%s' argument must be a positive number (> 0).";
	
	
	public static void assertPositive( byte number, String argumentName ) {
		assertPositive( (Number) number, argumentName );
	}
	
	
	public static void assertPositive( short number, String argumentName ) {
		assertPositive( (Number) number, argumentName );
	}
	
	
	public static void assertPositive( int number, String argumentName ) {
		assertPositive( (Number) number, argumentName );
	}
	
	
	public static void assertPositive( long number, String argumentName ) {
		assertPositive( (Number) number, argumentName );
	}
	
	
	public static void assertPositive( float number, String argumentName ) {
		assertPositive( (Number) number, argumentName );
	}
	
	
	public static void assertPositive( double number, String argumentName ) {
		assertPositive( (Number) number, argumentName );
	}
	
	
	private static void assertPositive( Number number, String argumentName ) {
		if( number.doubleValue() <= 0 ) {
			String message = String.format( MUST_BE_POSITIVE_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );
		}
	}
	
	
	public static void assertPositive( BigDecimal number, String argumentName ) {
		ArgumentAssertions.assertNotNull( number, argumentName );
		
		if( number.compareTo( BigDecimal.ZERO ) <= 0 ) {
			String message = String.format( MUST_BE_POSITIVE_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );			
		}
	}
	
	
	public static void assertPositive( BigInteger number, String argumentName ) {
		ArgumentAssertions.assertNotNull( number, argumentName );
		
		if( number.compareTo( BigInteger.ZERO ) <= 0 ) {
			String message = String.format( MUST_BE_POSITIVE_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );			
		}
	}

}
