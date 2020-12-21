package io.github.learnkotlin.lang

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import io.github.learnkotlin.lang.example.*

fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)

fun Dog.trim(): Boolean {
	return true
}

class ExtensionFunctionTests {
	
	@Test
	fun testStringExtension() {
		val trimmed = "!!hmmmm!!".removeFirstLastChar()
		assertEquals("!hmmmm!", trimmed)
	}
	
	@Test
	fun testDogExtension() {
		val schnauzer = Schnauzer("Rex")
		val trimmed = schnauzer.trim()
		assertEquals(true, trimmed)
	}
}