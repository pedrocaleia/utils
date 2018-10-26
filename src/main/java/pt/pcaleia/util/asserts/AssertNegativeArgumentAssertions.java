package pt.pcaleia.util.asserts;


import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * @author Pedro Caleia
 */
final class AssertNegativeArgumentAssertions {
	
	
	private static final String MUST_BE_NEGATIVE_MESSAGE = "The '%s' argument must be a negative number (< 0).";
	
	
	public static void assertNegative( byte number, String argumentName ) {
		assertNegative( (Number) number, argumentName );
	}
	
	
	public static void assertNegative( short number, String argumentName ) {
		assertNegative( (Number) number, argumentName );
	}
	
	
	public static void assertNegative( int number, String argumentName ) {
		assertNegative( (Number) number, argumentName );
	}
	
	
	public static void assertNegative( long number, String argumentName ) {
		assertNegative( (Number) number, argumentName );
	}
	
	
	public static void assertNegative( float number, String argumentName ) {
		assertNegative( (Number) number, argumentName );
	}
	
	
	public static void assertNegative( double number, String argumentName ) {
		assertNegative( (Number) number, argumentName );
	}
	
	
	private static void assertNegative( Number number, String argumentName ) {
		if( number.doubleValue() >= 0 ) {
			String message = String.format( MUST_BE_NEGATIVE_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );
		}
	}
	
	
	public static void assertNegative( BigDecimal number, String argumentName ) {
		ArgumentAssertions.assertNotNull( number, argumentName );
		
		if( number.compareTo( BigDecimal.ZERO ) >= 0 ) {
			String message = String.format( MUST_BE_NEGATIVE_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );			
		}
	}
	
	
	public static void assertNegative( BigInteger number, String argumentName ) {
		ArgumentAssertions.assertNotNull( number, argumentName );
		
		if( number.compareTo( BigInteger.ZERO ) >= 0 ) {
			String message = String.format( MUST_BE_NEGATIVE_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );			
		}
	}

}
