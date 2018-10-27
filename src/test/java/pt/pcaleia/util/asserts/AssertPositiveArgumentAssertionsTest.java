package pt.pcaleia.util.asserts;


import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


/**
 * @author Pedro Caleia
 */
public final class AssertPositiveArgumentAssertionsTest {
	
	
	@Test
	public void testThatAssertPositiveForByteReturnsWhenTheNumberIsPositive() {
		NumberArgumentAssertions.assertPositive( (byte) 1, "number" );
	}
	
	
	@Test
	public void testThatAssertPositiveForByteThrowsWhenTheNumberIsZero() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( (byte) 0, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForByteThrowsWhenTheNumberIsNegative() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( (byte) -1, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForByteThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( (byte) 1, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertPositiveForShortReturnsWhenTheNumberIsPositive() {
		NumberArgumentAssertions.assertPositive( (short) 1, "number" );
	}
	
	
	@Test
	public void testThatAssertPositiveForShortThrowsWhenTheNumberIsZero() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( (short) 0, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForShortThrowsWhenTheNumberIsNegative() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( (short) -1, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForShortThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( (short) 1, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertPositiveForIntReturnsWhenTheNumberIsPositive() {
		NumberArgumentAssertions.assertPositive( 1, "number" );
	}
	
	
	@Test
	public void testThatAssertPositiveForIntThrowsWhenTheNumberIsZero() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( 0, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForIntThrowsWhenTheNumberIsNegative() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( -1, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForIntThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( 1, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertPositiveForLongReturnsWhenTheNumberIsPositive() {
		NumberArgumentAssertions.assertPositive( 1L, "number" );
	}
	
	
	@Test
	public void testThatAssertPositiveForLongThrowsWhenTheNumberIsZero() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( 0L, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForLongThrowsWhenTheNumberIsNegative() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( -1L, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForLongThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( 1L, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertPositiveForFloatReturnsWhenTheNumberIsPositive() {
		NumberArgumentAssertions.assertPositive( 1F, "number" );
	}
	
	
	@Test
	public void testThatAssertPositiveForFloatThrowsWhenTheNumberIsZero() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( 0F, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForFloatThrowsWhenTheNumberIsNegative() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( -1F, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForFloatThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( 1F, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertPositiveForDoubleReturnsWhenTheNumberIsPositive() {
		NumberArgumentAssertions.assertPositive( 1D, "number" );
	}
	
	
	@Test
	public void testThatAssertPositiveForDoubleThrowsWhenTheNumberIsZero() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( 0D, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForDoubleThrowsWhenTheNumberIsNegative() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( -1D, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForDoubleThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( 1D, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertPositiveForBigDecimalReturnsWhenTheNumberIsPositive() {
		NumberArgumentAssertions.assertPositive( BigDecimal.ONE, "number" );
	}
	
	
	@Test
	public void testThatAssertPositiveForBigDecimalThrowsWhenTheNumberIsZero() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( BigDecimal.ZERO, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForBigDecimalThrowsWhenTheNumberIsNegative() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( new BigDecimal( "-1" ), "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForBigDecimalThrowsWhenTheNumberIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( (BigDecimal) null, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForBigDecimalThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( BigDecimal.ONE, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertPositiveForBigIntegerReturnsWhenTheNumberIsPositive() {
		NumberArgumentAssertions.assertPositive( BigInteger.ONE, "number" );
	}
	
	
	@Test
	public void testThatAssertPositiveForBigIntegerThrowsWhenTheNumberIsZero() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( BigInteger.ZERO, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForBigIntegerThrowsWhenTheNumberIsNegative() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( new BigInteger( "-1" ), "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForBigIntegerThrowsWhenTheNumberIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( (BigInteger) null, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertPositiveForBigIntegerThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertPositive( BigInteger.ONE, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
}
