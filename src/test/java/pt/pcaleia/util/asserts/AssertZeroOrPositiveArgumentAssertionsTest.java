package pt.pcaleia.util.asserts;


import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


/**
 * @author Pedro Caleia
 */
public final class AssertZeroOrPositiveArgumentAssertionsTest {
	
	
	@Test
	public void testThatAssertZeroOrPositiveForByteReturnsWhenTheNumberIsPositive() {
		NumberArgumentAssertions.assertZeroOrPositive( (byte) 1, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForByteReturnsWhenTheNumberIsZero() {
		NumberArgumentAssertions.assertZeroOrPositive( (byte) 0, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForByteThrowsWhenTheNumberIsNegative() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( (byte) -1, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForByteThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( (byte) 1, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertZeroOrPositiveForShortReturnsWhenTheNumberIsPositive() {
		NumberArgumentAssertions.assertZeroOrPositive( (short) 1, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForShortReturnsWhenTheNumberIsZero() {
		NumberArgumentAssertions.assertZeroOrPositive( (short) 0, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForShortThrowsWhenTheNumberIsNegative() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( (short) -1, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForShortThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( (short) 1, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertZeroOrPositiveForIntReturnsWhenTheNumberIsPositive() {
		NumberArgumentAssertions.assertZeroOrPositive( 1, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForIntReturnsWhenTheNumberIsZero() {
		NumberArgumentAssertions.assertZeroOrPositive( 0, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForIntThrowsWhenTheNumberIsNegative() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( -1, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForIntThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( 1, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertZeroOrPositiveForLongReturnsWhenTheNumberIsPositive() {
		NumberArgumentAssertions.assertZeroOrPositive( 1L, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForLongReturnsWhenTheNumberIsZero() {
		NumberArgumentAssertions.assertZeroOrPositive( 0L, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForLongThrowsWhenTheNumberIsNegative() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( -1L, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForLongThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( 1L, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertZeroOrPositiveForFloatReturnsWhenTheNumberIsPositive() {
		NumberArgumentAssertions.assertZeroOrPositive( 1F, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForFloatReturnsWhenTheNumberIsZero() {
		NumberArgumentAssertions.assertZeroOrPositive( 0F, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForFloatThrowsWhenTheNumberIsNegative() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( -1F, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForFloatThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( 1F, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertZeroOrPositiveForDoubleReturnsWhenTheNumberIsPositive() {
		NumberArgumentAssertions.assertZeroOrPositive( 1D, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForDoubleReturnsWhenTheNumberIsZero() {
		NumberArgumentAssertions.assertZeroOrPositive( 0D, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForDoubleThrowsWhenTheNumberIsNegative() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( -1D, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForDoubleThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( 1D, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertZeroOrPositiveForBigDecimalReturnsWhenTheNumberIsPositive() {
		NumberArgumentAssertions.assertZeroOrPositive( BigDecimal.ONE, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForBigDecimalReturnsWhenTheNumberIsZero() {
		NumberArgumentAssertions.assertZeroOrPositive( BigDecimal.ZERO, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForBigDecimalThrowsWhenTheNumberIsNegative() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( new BigDecimal( "-1" ), "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForBigDecimalThrowsWhenTheNumberIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( (BigDecimal) null, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForBigDecimalThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( BigDecimal.ONE, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertZeroOrPositiveForBigIntegerReturnsWhenTheNumberIsPositive() {
		NumberArgumentAssertions.assertZeroOrPositive( BigInteger.ONE, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForBigIntegerReturnsWhenTheNumberIsZero() {
		NumberArgumentAssertions.assertZeroOrPositive( BigInteger.ZERO, "number" );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForBigIntegerThrowsWhenTheNumberIsNegative() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( new BigInteger( "-1" ), "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForBigIntegerThrowsWhenTheNumberIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( (BigInteger) null, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertZeroOrPositiveForBigIntegerThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertZeroOrPositive( BigInteger.ONE, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
}
