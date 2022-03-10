package com.example.kotlinbasics.OOP

/*
The class that inherits the feature of another class is called the Sub class or Child class ir Derived class.
The class whose features are inherited is called Super class or Parent class or Base class.
 */

// All classes in Kotlin are "final" by default
// You cannot inherit from a "sealed" or "final" class
// So, we need to use "open" keyword to make it inheritable

/*
Super class
open class Vehicle{
    //properties
    //methods

}
*/

// Sub class of Vehicle class
// Super class of ElectricBike class
// Car inherits Vehicle
open class Bike(val name: String, val brand: String){
    open var range = 0.0

    fun extendRange(amount: Double){
        if(amount>0){
            range+= amount
        }
    }

    open fun drive(distance: Double){
        println("Drove for $distance km")
    }
}

// Sub class of Bike class
class ElectricBike(name: String, brand: String, batteryLife: Double) : Bike(name, brand){

    override var range = batteryLife * 6

    override fun drive(distance: Double){
        //overriding function from parent class
        println("Drove for $distance km on electricity")
    }
    fun drive() {
        println("Drove for $range km on electricity")

    }
}

fun main() {
    var myBike = Bike("S1", "Ola Electric")
    var myEBike = ElectricBike("S1", "Ola Electric", 85.0)

    //Poly
    myBike.drive(200.0)
    myEBike.drive(201.12)
    myEBike.extendRange(200.0)
    myEBike.drive()
}