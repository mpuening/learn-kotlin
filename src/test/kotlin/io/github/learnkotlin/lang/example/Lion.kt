package io.github.learnkotlin.lang.example

class Lion(name: String) : Cat(name) {
	
	override fun purr(): String {
		return "ROAR!"
	}
}