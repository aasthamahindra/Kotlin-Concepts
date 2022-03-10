package com.example.kotlinbasics.OOP

import java.lang.IllegalArgumentException

fun main() {

    var myCar = Car()
    //myCar.owner
    println("Brand is: ${myCar.myBrand}")

    myCar.maxSpeed = -5 // throws exception
    println("Max Speed: ${myCar.maxSpeed}")
}

class Car(){

    // lateinit: initialize the variable later
    lateinit var owner: String

    val myBrand: String = "BMW"

    // Custom Getter
    get() {
        return field.lowercase()
    }

    /*
    ---- Default ----
    var maxSpeed: Int = 250
    get() = field
    set(value){
        field = value
    }
     */

    var maxSpeed: Int = 250
        get() = field
        set(value){
            field = if(value>0) value else throw IllegalArgumentException("Max speed cannot be less than 0")
        }

    init {
        this.owner = "Frank"
    }
}