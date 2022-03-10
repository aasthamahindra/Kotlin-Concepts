package com.example.kotlinbasics.OOP

var b = 3
fun main() {
    myFunction(5)
    //b = 3  --> This will give error --> unresolved reference
}

//This is a parameter
fun myFunction(a:Int){
    //This is a variable
    var a = 3
    var b = 5 //Scope of b is within this function
    println("a: $a")
}

/*
- Why does Kotlin allow same variable and argument names?
  This is called shadowing and it is useful for decoupling your code from other parts of the system.
  It is possible because names are bound to current scope.

NOTE: try to avoid shadowing for two reasons:
 - your code becomes hard to read as two different things have the same name, which leads to confusion.
 - once shadowed, you can no longer access the original variable within a scope.
 */