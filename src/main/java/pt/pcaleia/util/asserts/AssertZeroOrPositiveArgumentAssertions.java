package pt.pcaleia.util.asserts;


import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * @author Pedro Caleia
 */
final class AssertZeroOrPositiveArgumentAssertions {
	
	
	private static final String MUST_BE_ZERO_OR_POSITIVE_MESSAGE = "The '%s' argument must be 0 or be a positive number (>= 0).";
	
	
	public static void assertZeroOrPositive( byte number, String argumentName ) {
		assertZeroOrPositive( (Number) number, argumentName );
	}
	
	
	public static void assertZeroOrPositive( short number, String argumentName ) {
		assertZeroOrPositive( (Number) number, argumentName );
	}
	
	
	public static void assertZeroOrPositive( int number, String argumentName ) {
		assertZeroOrPositive( (Number) number, argumentName );
	}
	
	
	public static void assertZeroOrPositive( long number, String argumentName ) {
		assertZeroOrPositive( (Number) number, argumentName );
	}
	
	
	public static void assertZeroOrPositive( float number, String argumentName ) {
		assertZeroOrPositive( (Number) number, argumentName );
	}
	
	
	public static void assertZeroOrPositive( double number, String argumentName ) {
		assertZeroOrPositive( (Number) number, argumentName );
	}
	
	
	private static void assertZeroOrPositive( Number number, String argumentName ) {
		ArgumentAssertions.assertNotNull( number, argumentName );
		
		if( number.doubleValue() < 0 ) {
			String message = String.format( MUST_BE_ZERO_OR_POSITIVE_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );
		}
	}
	
	
	public static void assertZeroOrPositive( BigDecimal number, String argumentName ) {
		ArgumentAssertions.assertNotNull( number, argumentName );
		
		if( number.compareTo( BigDecimal.ZERO ) < 0 ) {
			String message = String.format( MUST_BE_ZERO_OR_POSITIVE_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );			
		}
	}
	
	
	public static void assertZeroOrPositive( BigInteger number, String argumentName ) {
		ArgumentAssertions.assertNotNull( number, argumentName );
		
		if( number.compareTo( BigInteger.ZERO ) < 0 ) {
			String message = String.format( MUST_BE_ZERO_OR_POSITIVE_MESSAGE, argumentName );
			throw new IllegalArgumentException( message );			
		}
	}

}
