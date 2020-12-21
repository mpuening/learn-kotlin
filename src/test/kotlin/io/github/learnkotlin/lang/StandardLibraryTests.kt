package io.github.learnkotlin.lang

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StandardLibraryTests {

	@Test
	fun testMath() {
		val sqrt = Math.sqrt(100.0);
		assertEquals(10.0, sqrt, 0.01);
	}

	@Test
	fun testArrays() {
		val ints = intArrayOf(1, 2, 3);
		assertEquals(3, ints.size);
		assertEquals(3, ints[2]);

		val strings = arrayOf("A", "B", "C");
		assertEquals(3, strings.size);
		assertEquals("C", strings[2]);
	}

	@Test
	fun testLists() {
		val ints = listOf(1, 2, 3);
		assertEquals(3, ints.size);
		assertEquals(3, ints[2]);

		val strings = listOf("A", "B", "C");
		assertEquals(3, strings.size);
		assertEquals("C", strings[2]);
	}

	@Test
	fun testSets() {
		val ints = setOf(1, 2, 3);
		assertEquals(3, ints.size);
		assertEquals(true, ints.contains(2));

		val strings = setOf("A", "B", "C");
		assertEquals(3, strings.size);
		assertEquals(true, strings.contains("B"));
	}

	@Test
	fun testMaps() {
		val ints = mapOf("1" to 1, "2" to 2, "3" to 3);
		assertEquals(3, ints.size);
		assertEquals(2, ints.get("2"));
		assertEquals(1, ints["1"]);
	}

	@Test
	fun testFunctionInvoke() {
		val todo = {
			TODO()
		}
		var blowsUp1: Boolean
		try {
			todo.invoke();
		} catch (ex: Throwable) {
			blowsUp1 = true
		}
		assertEquals(true, blowsUp1);
		var blowsUp2: Boolean
		try {
			todo();
		} catch (ex: Throwable) {
			blowsUp2 = true
		}
		assertEquals(true, blowsUp2);
	}

	@Test
	fun testObjectApply() {
		val result = this.apply(
			{
				setFirstName("First")
				setLastName("First")
			}
		)
		assertEquals(this, result);
	}

	@Suppress("UNUSED_PARAMETER")
	fun setFirstName(name: String) {
		// just pretending
	}

	@Suppress("UNUSED_PARAMETER")
	fun setLastName(name: String) {
		// just pretending
	}
}