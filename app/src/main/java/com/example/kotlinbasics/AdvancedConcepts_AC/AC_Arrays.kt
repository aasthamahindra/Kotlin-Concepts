package com.example.kotlinbasics.AdvancedConcepts_AC

fun main() {

    //val numbers:IntArray = intArrayOf(1,2,3,4,5,6)
    //val numbers = intArrayOf(1,2,3,4,5,6) -->Type inference
    val numbers = arrayOf(1,2,3,4,5,6)
    println(numbers) //this will give us address of the array --> @36d64342

    //To print array in Kotlin, we use a utility method --> contentToString()
    println("Initial Values: ${numbers.contentToString()}")

    for(element in numbers){
        print("${element+2} ")
    }
    println()
    for(element in numbers){
        print("$element ")
    }
    println()
    //Access a particular item
    println(numbers[3])
    //println(numbers[6]) --> ArrayIndexOutOfBound

    //Change the value of an item at a particular index
    numbers[0] = 7
    numbers[1] = 5
    println("Changed Values: ${numbers.contentToString()}")

    val days = arrayOf("Sunday", "Monday", "Tuesday")
    println(days.contentToString())

    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Grape", 3.5))
    println(fruits.contentToString())
    println("${fruits}")
}

data class Fruit(val name: String, val price: Double)