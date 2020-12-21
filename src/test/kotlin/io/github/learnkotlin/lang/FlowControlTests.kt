package io.github.learnkotlin.lang

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FlowControlTests {

	@Test
	fun testIfStatement() {
		val number = -10
		var result: Int;

		if (number > 0) {
			result = number
		} else {
			result = -number
		}
		assertEquals(10, result)
	}

	@Test
	fun testIfExpression() {
		val number = -10

		// Ladder ecpression, replacement of Ternary operator
		val result = if (number > 0) {
			println("Positive")
			number
		} else if (number == 0) {
			println("Zero")
			"Zero"
		} else {
			println("Negative")
			-number
		}
		assertEquals(10, result)
	}

	@Test
	fun testWhenExpression() {

		val a = 12
		val b = 5

		val operator = "*"

		// Switch statement replacement
		val result = when (operator) {
			// Lambdas with and without blocks
			"+" -> {
				println("Plus")
				a + b
			}
			"-" -> a - b
			"*" -> a * b
			"/" -> a / b
			else -> "$operator operator is invalid operator."
		}
		assertEquals(60, result)
	}

	@Test
	fun testWhenExpression2() {
		// Just like switch statements show bad design, so do when statements
		val x: Any = "BadDesignAnyone?"
		val length = when (x) {
			is Int -> x
			is String -> x.length
			is IntArray -> x.size
			else -> 0
		}
		assertEquals(16, length)
	}

	@Test
	fun testWhileLoop() {
		// While loops are similar to Java
		var sum = 0
		var i = 10

		while (i != 0) {
			sum += i
			--i
		}
		assertEquals(55, sum)
	}

	@Test
	fun testForLoop() {
		// For loops are not similar to Java
		var sum = 0

		for (i in 1..10) {
			sum += i
		}
		assertEquals(55, sum)

		sum = 0;
		var languages = arrayOf("C", "Kotlin", "Python", "Java")
		for (l in languages) {
			sum += l.length
		}
		assertEquals(17, sum)
		
		// If you want indices
		sum = 0;
		for (i in languages.indices) {
			sum += languages[i].length
		}
		assertEquals(17, sum)
	}
}