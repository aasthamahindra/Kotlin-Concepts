package com.example.kotlinbasics

fun main() {
    // Calling functions
    myFunc()
    println(addUp(5, 3)) //passing arguments
    println(averageValue(5.0,6.0))
}

// Method - A function within the class

// fun-keyword function-name(parameterOne :type, parameterTwo: type) : ReturnType
fun addUp(a: Int , b:Int) : Int{ //passing parameters
    return a+b
}

fun myFunc(){
    println("Called from my function")
}

//TODO: Function to build the average of two values
fun averageValue(x: Double, y: Double) : Double {
    return (x+y)/2
}

/*
Advantages of Functions:
- Reuse the code
- Easy to work in a team
- Use pre-built functions by using import
 */

