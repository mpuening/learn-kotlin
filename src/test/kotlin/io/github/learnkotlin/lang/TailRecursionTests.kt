package io.github.learnkotlin.lang

import java.math.BigInteger
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import org.springframework.util.StopWatch


class TailRecursionTests {

	@Test
	fun testFibonacciTailRecursion() {
		val n = 100
		val first = BigInteger("0")
		val second = BigInteger("1")

		// Make sure methods work
		val fibonacciNumber1 = fibonacci1(n, first, second)
		assertEquals(BigInteger("354224848179261915075"), fibonacciNumber1)
		assertEquals(n + 1, TailRecursionTests.fibonacciCount1)

		val fibonacciNumber2 = fibonacci2(n, first, second)
		assertEquals(BigInteger("354224848179261915075"), fibonacciNumber2)
		assertEquals(n + 1, TailRecursionTests.fibonacciCount2)

		// Now verify stack improvements
		var stackOverflowed = false
		try {
			fibonacci1(n * 1000, first, second)
		} catch (ex: StackOverflowError) {
			stackOverflowed = true
		}
		assertTrue(stackOverflowed)

		stackOverflowed = false
		try {
			fibonacci2(n * 1000, first, second)
		} catch (ex: StackOverflowError) {
			stackOverflowed = true
		}
		assertFalse(stackOverflowed)
	}

	@Test
	fun testFactorialTailRecursion() {
		val factorialNumber1 = factorial1(6)
		assertEquals(720, factorialNumber1)
		assertEquals(6, TailRecursionTests.factorialCount1)

		val factorialNumber2 = factorial2(6)
		assertEquals(720, factorialNumber2)
		assertEquals(6, TailRecursionTests.factorialCount2)

		// Now verify stack improvements
		var stackOverflowed = false
		try {
			factorial1(60000)
		} catch (ex: StackOverflowError) {
			stackOverflowed = true
		}
		assertTrue(stackOverflowed)

		stackOverflowed = false
		try {
			factorial2(60000)
		} catch (ex: StackOverflowError) {
			stackOverflowed = true
		}
		assertFalse(stackOverflowed)
	}

	companion object {
		var fibonacciCount1 = 0
		var fibonacciCount2 = 0

		var factorialCount1 = 0
		var factorialCount2 = 0
	}

	fun fibonacci1(n: Int, a: BigInteger, b: BigInteger): BigInteger {
		TailRecursionTests.fibonacciCount1++
		return if (n == 0) a else fibonacci1(n - 1, b, a + b)
	}

	tailrec fun fibonacci2(n: Int, a: BigInteger, b: BigInteger): BigInteger {
		// Even incrementation is part of loop
		TailRecursionTests.fibonacciCount2++
		return if (n == 0) a else fibonacci2(n - 1, b, a + b)
	}

	fun factorial1(n: Long): Long {
		TailRecursionTests.factorialCount1++
		return if (n <= 1) {
			n
		} else {
			n * factorial1(n - 1)
		}
	}

	tailrec fun factorial2(n: Long, intermediateProduct: Long = 1): Long {
		// Even incrementation is part of loop
		TailRecursionTests.factorialCount2++
		val nextProduct = n * intermediateProduct
		return if (n <= 1) {
			nextProduct
		} else {
			factorial2(n - 1, nextProduct)
		}
	}

}