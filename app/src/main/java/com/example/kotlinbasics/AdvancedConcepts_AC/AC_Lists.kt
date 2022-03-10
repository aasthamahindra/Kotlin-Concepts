package com.example.kotlinbasics.AdvancedConcepts_AC

fun main() {

    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1, 2, 3, true, false, "String")
    println(anyTypes.size)
    println(months[1])

    //List is immutable by default, change it into a mutable list and add elements
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April","May", "June", "July", "August","September", "October",
        "November", "December")
    additionalMonths.addAll(newMonths)

    println("New list: $additionalMonths")
    for(month in months){
        println(listOf(month))
    }

    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thur")
    println(days)
    days[2] = "Sat"
    println(days)
    //days.removeAt(2)
    val removeList = mutableListOf<String>("Mon", "Wed")
    days.removeAll(removeList)
    println(days)

}