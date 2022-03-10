package com.example.kotlinbasics

fun main(){

    //Arithmetic operators (+, -, *, / , %)
    var result = 5+3
    result /= 3  //result = result/2 (numerator and denominator should be of same data types
    result *= 4
    result += 2
    result -= 2
    result %= 3  // % gives remainder 15%3 = 0 , 15%4 = 3

   println(result)
    /*
    val a = 5.0
    val b = 3
    var c : Double = a/b
    println(c) */

    // Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5 == 3
    val notEqual = 5!=3
    val greaterVal = 5 > 3
    val lesserVal = 5<3
    val greaterEqual = 5>=3
    val lesserEqual = 5<=3
    // using string template expression
    println("isEqual: $isEqual\nnotEqual: $notEqual\ngreaterVal: $greaterVal\n" +
            "lesserVal: $lesserVal\ngreaterEqual: $greaterEqual\nlesserEqual: $lesserEqual")

    // Assignment operators (+=, -=, *=, /=, %=)

    // Increment & Decrement operators(++, --)
    var myNum = 5
    myNum++
    println(myNum) //6
    println(myNum++) // same as before and stored as myNum+1 = 7
    println(++myNum) //8
    var myNum2 = 5
    myNum2--
    println(myNum2)
    println(myNum2--)
    println(--myNum2)
}