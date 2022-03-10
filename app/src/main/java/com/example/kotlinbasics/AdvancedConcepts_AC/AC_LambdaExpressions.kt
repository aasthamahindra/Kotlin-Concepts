package com.example.kotlinbasics.AdvancedConcepts_AC

/*
- Lambda expression is a function which has no name
- Lambda expressions and anonymous functions are functions are 'functions literals', i.e. functions
  that are not declared, but passes immediately as an expression
- It is defined with curly braces {} which takes variables as a parameter(if any) and a body of function
- The body of a function is written after the variable followed by -> operator.
- SYNTAX: {variable(s) -> body_of_lambda}
 */
fun main() {
   addNumbers(5,10)
    //Using lambda expression
    //val sum: (Int, Int) -> Int = {a:Int, b:Int -> a+b}
    //println(sum(10,5))
    val sum = {a:Int, b:Int -> println(a+b)}
    print("Result from lambda expression: ")
    sum(10,5)
}

//Normal function: Addition of two numbers
fun addNumbers(a: Int, b: Int){
    val add = a + b
    println("Result from normal function: $add")
}