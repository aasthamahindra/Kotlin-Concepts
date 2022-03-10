package com.example.kotlinbasics.Practice

/*
A program that adds five Numbers (Double) to an arrayList and then calculates the average of those numbers.
Please use a for (in) loop in this exercise.
 */

fun main() {
    /* List:
    val num = listOf<Double>(1.0,2.0,3.0,4.0,5.0)
    var sum = 0.0
    for(i in num){
        sum += i
    }
    println("Sum: $sum")
     */

    val arrayListSum: ArrayList<Double> = ArrayList<Double>(5)
    var l = mutableListOf<Double>()
    arrayListSum.add(20.5)
    arrayListSum.add(2.5)
    arrayListSum.add(10.0)
    arrayListSum.add(12.5)
    arrayListSum.add(15.0)
    var sum = 0.0
    for(i in arrayListSum){
       sum += i
    }
    println("Sum: $sum")

}