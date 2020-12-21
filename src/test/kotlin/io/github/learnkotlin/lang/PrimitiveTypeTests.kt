package io.github.learnkotlin.lang

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PrimitiveTypeTests {

	@Test
	fun testPrimitiveTypeValues() {
		// Values are immutable

		// Syntax for being explicit in type
		val bool: Boolean = true
		assertEquals(true, bool)

		val ch: Char = 'c'
		assertEquals('c', ch)

		val byte: Byte = 2
		assertEquals(2, byte)

		val short: Short = 4
		assertEquals(4, short)

		val int: Int = 256;
		assertEquals(256, int)

		val long: Long = 1024
		assertEquals(1024, long)

		val float: Float = 123.456F
		assertEquals(123.456, float.toDouble(), 0.01)

		val double: Double = 456.789
		assertEquals(456.789, double, 0.01)

		// Type inference
		val integer = 123456789
		assertEquals(123456789, integer)

		val real = 12345.67890
		assertEquals(12345.67890, real, 0.01)

		// Generic
		val integerNumber: Number = 7
		assertEquals(7, integerNumber)

		val realNumber: Number = 7.0
		assertEquals(7.0, realNumber.toDouble(), 0.01)
	}

	@Test
	fun testPrimitiveTypeVariables() {
		// Variable are mutable
		var n = 0;

		for (i in 1..10) {
			n += i
		}

		assertEquals(55, n)
	}

	@Test
	fun testPrimitiveTypeOperators() {
		var n = 123.456

		// Primitives have methods as operators
		n = n.plus(7.0)
		n = n.minus(0.456)

		assertEquals(130.0, n, 0.01)

		n = n.div(2.0);
		n = n.times(4.0)
		n = n.unaryMinus()

		assertEquals(-260.0, n, 0.01)
	}
}