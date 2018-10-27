package pt.pcaleia.util.asserts;


import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


/**
 * @author Pedro Caleia
 */
public final class AssertZeroOrNegativeArgumentAssertionsTest {
	
	
	@Test
	public void testThatAssertZeroOrNegativeForByteReturnsWhenTheNumberIsNegative() {
		NumberArgumentAssertions.assertZeroOrNegative( (byte) -1, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForByteReturnsWhenTheNumberIsZero() {
		NumberArgumentAssertions.assertZeroOrNegative( (byte) 0, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForByteThrowsWhenTheNumberIsPositive() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( (byte) 1, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForByteThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( (byte) -1, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertZeroOrNegativeForShortReturnsWhenTheNumberIsNegative() {
		NumberArgumentAssertions.assertZeroOrNegative( (short) -1, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForShortReturnsWhenTheNumberIsZero() {
		NumberArgumentAssertions.assertZeroOrNegative( (short) 0, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForShortThrowsWhenTheNumberIsPositive() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( (short) 1, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForShortThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( (short) -1, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertZeroOrNegativeForIntReturnsWhenTheNumberIsNegative() {
		NumberArgumentAssertions.assertZeroOrNegative( -1, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForIntReturnsWhenTheNumberIsZero() {
		NumberArgumentAssertions.assertZeroOrNegative( 0, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForIntThrowsWhenTheNumberIsPositive() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( 1, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForIntThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( -1, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertZeroOrNegativeForLongReturnsWhenTheNumberIsNegative() {
		NumberArgumentAssertions.assertZeroOrNegative( -1L, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForLongReturnsWhenTheNumberIsZero() {
		NumberArgumentAssertions.assertZeroOrNegative( 0L, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForLongThrowsWhenTheNumberIsPositive() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( 1L, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForLongThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( -1L, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertZeroOrNegativeForFloatReturnsWhenTheNumberIsNegative() {
		NumberArgumentAssertions.assertZeroOrNegative( -1F, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForFloatReturnsWhenTheNumberIsZero() {
		NumberArgumentAssertions.assertZeroOrNegative( 0F, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForFloatThrowsWhenTheNumberIsPositive() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( 1F, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForFloatThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( -1F, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertZeroOrNegativeForDoubleReturnsWhenTheNumberIsNegative() {
		NumberArgumentAssertions.assertZeroOrNegative( -1D, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForDoubleReturnsWhenTheNumberIsZero() {
		NumberArgumentAssertions.assertZeroOrNegative( 0D, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForDoubleThrowsWhenTheNumberIsPositive() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( 1D, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForDoubleThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( -1D, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertZeroOrNegativeForBigDecimalReturnsWhenTheNumberIsNegative() {
		NumberArgumentAssertions.assertZeroOrNegative( new BigDecimal( "-1" ), "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForBigDecimalReturnsWhenTheNumberIsZero() {
		NumberArgumentAssertions.assertZeroOrNegative( BigDecimal.ZERO, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForBigDecimalThrowsWhenTheNumberIsPositive() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( BigDecimal.ONE, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForBigDecimalThrowsWhenTheNumberIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( (BigDecimal) null, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForBigDecimalThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( new BigDecimal( "-1" ), null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertZeroOrNegativeForBigIntegerReturnsWhenTheNumberIsNegative() {
		NumberArgumentAssertions.assertZeroOrNegative( new BigInteger( "-1" ), "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForBigIntegerReturnsWhenTheNumberIsZero() {
		NumberArgumentAssertions.assertZeroOrNegative( BigInteger.ZERO, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForBigIntegerThrowsWhenTheNumberIsPositive() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( BigInteger.ONE, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForBigIntegerThrowsWhenTheNumberIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( (BigInteger) null, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrNegativeForBigIntegerThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrNegative( new BigInteger( "-1" ), null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
}
