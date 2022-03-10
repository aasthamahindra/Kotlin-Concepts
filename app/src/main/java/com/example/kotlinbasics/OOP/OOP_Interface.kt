package com.example.kotlinbasics.OOP

// Interfaces are used to extend the functionality of classes
// Interface is basically a contract that a class may choose to sign.
// If it does, the class is obliged to provide implementation for the properties and functions of the interface.

interface Drivable{
    // May provide a default implementation for some or all of its properties and functions, but it doesn't have to
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

//If MCar class extends the Drivable interface, then it needs to implement the property
//that is created in the interface but not implemented.

//Super class
open class MCar(override val maxSpeed: Double, val name: String, val brand: String): Drivable{
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if (amount > 0){
            range += amount
        }
    }
    open fun drive(distance: Double){
        println("Drove for $distance km")
    }

    //For interface
    override fun drive(): String {
        return "driving the interface"
    }

}

//Sub class
class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double) : MCar(maxSpeed, name, brand){

    override var range = batteryLife * 6

    override fun drive(distance: Double){
        //overriding function from parent class
        println("Drove for $distance km on electricity")
    }

    override fun drive(): String {
        return super.drive()
    }
    override fun brake() {
        super.brake()
        println("Brake inside electric car")
    }
}

fun main() {
    var audiA3 = MCar(200.0, "A3", "Audi")
    var teslaS = ElectricCar(240.0, "S-Model", "Tesla", 200.0)
    teslaS.extendRange(200.0)

    teslaS.drive()

    teslaS.brake()
    audiA3.brake()
}

