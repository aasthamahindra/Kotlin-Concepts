package com.example.kotlinbasics

import android.hardware.biometrics.BiometricManager

fun main(){
    // mutable variable - var
    //type inference - finds out the type from context
    var myName = "Nayan"
    //"var" variable value overwritten
    myName = "Aastha"

    // immutable variable - val
    val myLastName = "Mahindra"
    //"val" variable value cannot be overwritten - This will give error
    //myLastName = "Mahindra"

    //print method to display whatever we want on the console
    println("Hello " + myName + " " + myLastName)

    // data types of numbers -> val variable-name : data type = value
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 1234456776
    val myLong: Long = 39_12345_11111_232_111

    // floating point number types
    val myFloat: Float = 12.01233f
    val myDouble: Double = 12.001233231212121

    //Boolean
    var isSunny: Boolean = true
    isSunny = false

    //Characters
    val letterChar = 'A'
    val digitChar = '1'

    //Strings
    val str = "Hello World"
    val firstCharInStr = str[0]
    val lastCharInStr = str[str.length-1]
    // Replace println("Last character: " + lastCharInStr)
    // with println("Last character: $lastCharInStr")
    // called String Template Expression or String Interpolation
    println("First character: $firstCharInStr")
    println("Last character: $lastCharInStr")
    println("The string is: $str, the first character is: $firstCharInStr, " +
            "the last character is: $lastCharInStr, " +
            "and the length of string is: ${str.length}")

}