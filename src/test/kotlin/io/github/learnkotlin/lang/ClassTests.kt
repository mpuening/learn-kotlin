package io.github.learnkotlin.lang

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import io.github.learnkotlin.lang.example.*

class ClassTests {

	@Test
	fun testDogs() {
		val peter = Schnauzer("Peter")
		assertEquals("Peter", peter.name)
		peter.apply {
			eat("Hotdog")
			sleep(1)
		}
		val sound = peter.bark();
		assertEquals("Ruff", sound)

		val gidget = Chihuahua("Gidget")
		assertEquals("Gidget", gidget.name)
		val what = gidget.eat(food = "Tacos").sleep().bark()
		assertEquals("Yo quiero Taco Bell", what)
	}

	@Test
	fun testCats() {
		val checkers = Tabby("Checkers")
		assertEquals("Checkers", checkers.name)
		checkers.apply {
			eat("Catnip")
			sleep(23)
		}
		val sound = checkers.purr();
		assertEquals("purrrrrr", sound)

		val leo = Lion("Leo")
		assertEquals("Leo", leo.name)
		val what = leo.eat("Meat").sleep(15).purr()
		assertEquals("ROAR!", what)
	}

	@Test
	fun testCompanionObject() {
		val schnauzer = Schnauzer.purchase("Puppy Dog", 10.0)
		assertEquals("Puppy Dog", schnauzer.name)
	}

	@Test
	fun testDataClass() {
		val messina = Poko("Jim Messina", 73, "Blue")
		assertEquals("Jim Messina", messina.name)
		assertEquals(73, messina.age)
		assertEquals("Blue", messina.favoriteColor)

		val person = Poko(age = 24, name = "Joe", favoriteColor = "Black")
		assertEquals("Joe", person.name)
		assertEquals(24, person.age)
		assertEquals("Black", person.favoriteColor)

		person.age += 1
		assertEquals(25, person.age)

		person.favoriteColor = "Yellow"
		assertEquals("Yellow", person.favoriteColor)

		// Deconstructing an object
		val (name, age) = person
		assertEquals("Joe", name)
		assertEquals(25, age)

	}
}