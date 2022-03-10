package com.example.kotlinbasics

fun main(){

    /*var heightPerson1 = 170
    var heightPerson2 = 189

    if (heightPerson1 > heightPerson2){
        println("Use Raw Force")
    }else if (heightPerson1 == heightPerson2){
        println("Anything")
    } else{
        println("Use Technique")
    }*/

    // TODO : Course Task
    val age = 20
    if (age >=21){
        println("You may drink in the USA")
    } else if(age>=18){
        println("You may vote")
    } else if(age>=16){
        println("You may drive")
    } else{
        println("You are too young!!!")
    }

    val name = "Aastha"
    if(name == "Aastha"){
        println("Welcome Home!!!")
    } else{
        println("Who are you?")
    }

    val isRainy = true
    if(isRainy)
        println("It's true")

}
