package com.example.kotlinbasics.Practice

fun main() {

    var samsung = MobilePhone("Android","Samsung","Galaxy S20 Ultra", 50)
    //var oneplus = MobilePhone("Android", "OnePlus", "Nord")
    //var apple = MobilePhone("iOS", "Apple","iPhone 13")
    samsung.chargeBattery(30)
}

//TODO:Create a class MobilePhone. It should have three primary constructor variables, osName, brand and model.
// Use the initializer to print those details. Create three objects of that class in the Main function.
class MobilePhone (osName: String, brand: String, model: String, var battery: Int){

    init {
        println("The phone $model from $brand uses $osName as its operating system")
    }

    fun  chargeBattery(amountCharged: Int){
        println("Battery before: $battery")
        println("How much it was charged: $amountCharged")
        println("Battery now: ${battery+amountCharged}")
    }
}