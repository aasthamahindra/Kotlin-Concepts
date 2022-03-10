package com.example.kotlinbasics

fun main() {

    //Nullable: Returns a null type
    //var name : String = "Aastha"
    // name = null --> COMPILATION ERROR

    //datatypeName? = nullable datatype
    var nullableName :String? = "Denis"
    //nullableName = null

    //var len = name.length
    //var len2 = nullableName.length --> ERROR
    var len2 = nullableName?.length
    //nullableName?.let { println(it.length) }


    // Elvis Operator (?:)
    val name = nullableName ?: "Guest"
    println("Name is: $name")
}