package io.github.learnkotlin.lang.example

interface Animal {
	val name: String
	fun eat(food: String): Animal
	fun sleep(hours: Int = 8): Animal
}