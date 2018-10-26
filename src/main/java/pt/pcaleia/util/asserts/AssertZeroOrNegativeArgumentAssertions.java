package pt.pcaleia.util.asserts;


import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * @author Pedro Caleia
 */
final class AssertZeroOrNegativeArgumentAssertions {
	
	
	private static final String MUST_BE_ZERO_OR_NEGATIVE_MESSAGE = "The '%s' argument must be 0 or be a negative number (<= 0).";
	
	
	public static void assertZeroOrNegative( byte number, String argumentName ) {
		assertZeroOrNegative( (Number) number, argumentName );
	}
	
	
	public static void assertZeroOrNegative( short number, String argumentName ) {
		assertZeroOrNegative( (Number) number, argumentName );
	}
	
	
	public static void assertZeroOrNegative( int number, String argumentName ) {
		assertZeroOrNegative( (Number) number, argumentName );
	}
	
	
	public static void assertZeroOrNegative( long number, String argumentName ) {
		assertZeroOrNegative( (Number) number, argumentName );
	}
	
	
	public static void assertZeroOrNegative( float number, String argumentName ) {
		assertZeroOrNegative( (Number) number, argumentName );
	}
	
	
	public static void assertZeroOrNegative( double number, String argumentName ) {
		assertZeroOrNegative( (Number) number, argumentName );
	}
	
	
	private static void assertZeroOrNegative( Number number, String argumentName ) {
		if( number.doubleValue() > 0 ) {
			String message = String.format( MUST_BE_ZERO_OR_NEGATIVE_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );
		}
	}
	
	
	public static void assertZeroOrNegative( BigDecimal number, String argumentName ) {
		ArgumentAssertions.assertNotNull( number, argumentName );
		
		if( number.compareTo( BigDecimal.ZERO ) > 0 ) {
			String message = String.format( MUST_BE_ZERO_OR_NEGATIVE_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );			
		}
	}
	
	
	public static void assertZeroOrNegative( BigInteger number, String argumentName ) {
		ArgumentAssertions.assertNotNull( number, argumentName );
		
		if( number.compareTo( BigInteger.ZERO ) > 0 ) {
			String message = String.format( MUST_BE_ZERO_OR_NEGATIVE_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );			
		}
	}

}
