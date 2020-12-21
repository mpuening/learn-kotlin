package io.github.learnkotlin.lang.example

abstract class Dog(val dogName: String) : Animal {
	override val name = dogName

	override fun eat(food: String): Dog {
		return this
	}

	override fun sleep(hours: Int): Dog {
		return this
	}

	abstract fun bark(): String
}