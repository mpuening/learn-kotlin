package io.github.learnkotlin.lang.example

abstract class Cat(val catName: String) : Animal {
	override val name = catName

	override fun eat(food: String): Cat {
		return this
	}

	override fun sleep(hours: Int): Cat {
		return this
	}

	abstract fun purr(): String
}