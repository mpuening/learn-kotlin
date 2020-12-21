package io.github.learnkotlin.koans

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IntroductionKoanTests {

	// Hello World!
	fun helloWorld(): String = "Hello World"

	@Test
	fun testHelloWorld() {
		assertEquals("Hello World", helloWorld())
	}

	// Named Arguments
	fun joinOptions(options: Collection<String>) =
		options.joinToString(prefix = "[", postfix = "]")

	@Test
	fun testJoinOptions() {
		assertEquals("[A, B, C, D]", joinOptions(listOf("A", "B", "C", "D")))
	}
}