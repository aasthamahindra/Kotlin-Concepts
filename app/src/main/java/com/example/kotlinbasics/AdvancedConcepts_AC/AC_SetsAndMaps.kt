package com.example.kotlinbasics.AdvancedConcepts_AC

//Sets eliminates duplicate data
//Maps hold data in the form of key value pair. Keys are unique.

fun main() {

    val fruits = setOf("Orange","Apple", "Grape", "Apple")
    println(fruits.size) // =3, because set doesn't count duplicates
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Watermelon")
    newFruits.add("Pear")
    println(newFruits)

    val daysofTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    //println(daysofTheWeek.get(3))
    for(key in daysofTheWeek.keys){
        println("$key is to ${daysofTheWeek[key]}")
    }

    val fruitsMap = mapOf(1 to FruitClass("Grape", 2.5), 2 to FruitClass("Apple", 1.5))

    val newDaysOfWeek = daysofTheWeek.toMutableMap()
    newDaysOfWeek[2] = "Thursday"
    newDaysOfWeek[4] = "Friday"
    print(newDaysOfWeek.toSortedMap())
}

data class FruitClass(val name: String, val price: Double)

