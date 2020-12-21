package io.github.learnkotlin.lang.example

class Chihuahua(name: String) : Dog(name) {
	
	override fun bark(): String {
		return "Yo quiero Taco Bell"
	}
}