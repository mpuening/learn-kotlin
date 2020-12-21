package io.github.learnkotlin.lang.example

class Schnauzer(name: String) : Dog(name) {

	override fun bark(): String {
		return "Ruff"
	}

	// This is how to create "class static" methods
	companion object {
		@Suppress("UNUSED_PARAMETER")
		fun purchase(name: String, price: Double) = Schnauzer(name)
	}
}