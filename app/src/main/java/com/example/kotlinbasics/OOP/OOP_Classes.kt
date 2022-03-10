package com.example.kotlinbasics.OOP

fun main() {

    var aastha = Person("Aastha", "Mahindra", 20)
    aastha.age = 21 //overwritten
    println("Age: ${aastha.age}")

    var nayan = Person("Nayan", "Mahindra")
    var anita = Person()
    var lastnameSood = Person(lastName = "Sood")

    aastha.hobby = "Play Video Games"

    aastha.stateHobby()

}

//Assigned default values
class Person constructor(firstName: String = "Anita", lastName: String = "Mahindra"){

    // Member variables - Properties
    var age: Int? = null
    var hobby: String = "Watch Netflix"
    var firstName: String? = null

    // init --> Initializer block which is called once an object is created
    // This block is called each time a new object is created
    init {
        this.firstName = firstName
        println("Person created with firstname: $firstName and lastname: $lastName")
    }

    //Member secondary constructor
    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age    // this keyword is used to point to the class
        println("Person created with firstname: $firstName, lastname: $lastName, and age: $age")
    }


    //Member functions - Methods (Function within a class)
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }

}