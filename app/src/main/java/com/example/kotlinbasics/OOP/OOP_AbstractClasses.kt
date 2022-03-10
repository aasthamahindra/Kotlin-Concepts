package com.example.kotlinbasics.OOP

//An abstract class cannot be instantiated
//(you cannot create objects of an abstract class)
//However, you can inherit subclasses from an abstract class
//The members (properties and methods) of an abstract class are non-abstract
//Unless you explicitly use the abstract keyword to make them abstract

abstract class Mammal(private val name: String, private val origin: String,
                      private val weight: Double){ //Concrete (Non abstract) properties

    //Abstract Property (Must be overridden by subclasses)
    abstract var maxSpeed: Double

    //Abstract Methods (Must be implemented by subclasses)
    abstract fun run()
    abstract fun breathe()

    //Concrete (Non Abstract) Method
    fun displayDetails(){
        println("Name: $name, Origin: $origin, Weight: $weight, Max Speed: $maxSpeed")
    }
}

class Human(
    name: String, origin: String, weight: Double,
    override var maxSpeed: Double): Mammal(name, origin, weight){
    override fun run() {
        println("Runs on two legs")
    }

    override fun breathe() {
        println("Breathe through nose or mouth")
    }
}

class Elephant(name: String, origin: String, weight: Double,
               override var maxSpeed: Double): Mammal(name, origin, weight){

    override fun run() {
        println("Runs on four legs")
    }

    override fun breathe() {
        println("Breathe through the trunk")
    }
}

fun main() {
    val human = Human("Aastha", "India", 60.0, 28.0)
    val elephant = Elephant("Rosy", "India", 5400.0, 25.0)

    //val mammal = Mammal("Aastha", "India", 60.0, 28.0) --> Cannot create an instance of an abstract class

    human.run()
    elephant.run()

    human.breathe()
    elephant.breathe()
}
