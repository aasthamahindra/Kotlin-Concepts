package com.example.kotlinbasics.OOP

import kotlin.math.floor

fun main() {
    val stringList: List<String> = listOf(
        "Aastha", "Nayan", "Isha", "Archit", "Nandini")
    val mixedTypeList: List<Any> = listOf(
        "Aastha", 20, "Mahindra", 5.5, 900, "6050")

    for(value in mixedTypeList){
        /*
        if (value is Int)
            println("Integer: $value")
        else if (value is Double)
            println("Double: $value with floor value ${floor(value)}")
        else if (value is String)
            println("String: $value of length ${value.length}")
        else
            println("Unknown Type")
         */

        when(value){
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value with floor value ${floor(value)}")
            is String -> println("String: $value of length ${value.length}")
            else -> println("Unknown Type")
        }
    }

    //Smart Cast
    val obj1: Any = "I have a dream"
    if(obj1 !is String){
        println("Not a string")
    }else{
        //obj is automatically cast to a string in this scope
        println("Found a string of length ${obj1.length}")
    }

    //Explicit (unsafe) casting using the "as" keyword --> can go wrong
    val str1: String = obj1 as String
    println(str1.length)

    // The below example will give an ClassCastException : class java.lang.Integer cannot be cast to class java.lang.String
    val obj2: Any = 1337
    val str2: String = obj2 as String
    println(str2)

    //Explicit (safe) casting using the "as? keyword
    val obj3: Any = 1337
    val str3: String? = obj3 as? String //Works
    println(str3) //Prints null
}