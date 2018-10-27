package pt.pcaleia.util.asserts;


import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


/**
 * @author Pedro Caleia
 */
public final class AssertNegativeArgumentAssertionsTest {
	
	
	@Test
	public void testThatAssertNegativeForByteReturnsWhenTheNumberIsNegative() {
		NumberArgumentAssertions.assertNegative( (byte) -1, "number" );
	}
	
	
	@Test
	public void testThatAssertNegativeForByteThrowsWhenTheNumberIsZero() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( (byte) 0, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForByteThrowsWhenTheNumberIsPositive() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( (byte) 1, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForByteThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( (byte) -1, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertNegativeForShortReturnsWhenTheNumberIsNegative() {
		NumberArgumentAssertions.assertNegative( (short) -1, "number" );
	}
	
	
	@Test
	public void testThatAssertNegativeForShortThrowsWhenTheNumberIsZero() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( (short) 0, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForShortThrowsWhenTheNumberIsPositive() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( (short) 1, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForShortThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( (short) -1, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertNegativeForIntReturnsWhenTheNumberIsNegative() {
		NumberArgumentAssertions.assertNegative( -1, "number" );
	}
	
	
	@Test
	public void testThatAssertNegativeForIntThrowsWhenTheNumberIsZero() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( 0, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForIntThrowsWhenTheNumberIsPositive() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( 1, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForIntThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( -1, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertNegativeForLongReturnsWhenTheNumberIsNegative() {
		NumberArgumentAssertions.assertNegative( -1L, "number" );
	}
	
	
	@Test
	public void testThatAssertNegativeForLongThrowsWhenTheNumberIsZero() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( 0L, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForLongThrowsWhenTheNumberIsPositive() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( 1L, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForLongThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( -1L, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertNegativeForFloatReturnsWhenTheNumberIsNegative() {
		NumberArgumentAssertions.assertNegative( -1F, "number" );
	}
	
	
	@Test
	public void testThatAssertNegativeForFloatThrowsWhenTheNumberIsZero() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( 0F, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForFloatThrowsWhenTheNumberIsPositive() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( 1F, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForFloatThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( -1F, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertNegativeForDoubleReturnsWhenTheNumberIsNegative() {
		NumberArgumentAssertions.assertNegative( -1D, "number" );
	}
	
	
	@Test
	public void testThatAssertNegativeForDoubleThrowsWhenTheNumberIsZero() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( 0D, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForDoubleThrowsWhenTheNumberIsPositive() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( 1D, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForDoubleThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( -1D, null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertNegativeForBigDecimalReturnsWhenTheNumberIsNegative() {
		NumberArgumentAssertions.assertNegative( new BigDecimal( "-1" ), "number" );
	}
	
	
	@Test
	public void testThatAssertNegativeForBigDecimalThrowsWhenTheNumberIsZero() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( BigDecimal.ZERO, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForBigDecimalThrowsWhenTheNumberIsPositive() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( BigDecimal.ONE, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForBigDecimalThrowsWhenTheNumberIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( (BigDecimal) null, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForBigDecimalThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( new BigDecimal( "-1" ), null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	
	
	@Test
	public void testThatAssertNegativeForBigIntegerReturnsWhenTheNumberIsNegative() {
		NumberArgumentAssertions.assertNegative( new BigInteger( "-1" ), "number" );
	}
	
	
	@Test
	public void testThatAssertNegativeForBigIntegerThrowsWhenTheNumberIsZero() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( BigInteger.ZERO, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForBigIntegerThrowsWhenTheNumberIsPositive() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( BigInteger.ONE, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForBigIntegerThrowsWhenTheNumberIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( (BigInteger) null, "number" );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
	
	@Test
	public void testThatAssertNegativeForBigIntegerThrowsWhenTheArgumentNameIsNull() {
		Executable executable = () -> NumberArgumentAssertions.assertNegative( new BigInteger( "-1" ), null );
		Assertions.assertThrows( IllegalArgumentException.class, executable );
	}
	
}
