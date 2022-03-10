package com.example.kotlinbasics

fun main(){

    //when expressions are replacement for switch statements from other programming languages
    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12,1,2 -> println("Winter")
        else -> println("Invalid Season")
    }

    // TODO: Course Task
    var age = 20
    when(age){
        !in 0..20 -> println("You may drink") //in 21..150 -> println("You may drink")
        in 16..17 -> println("You may drive")
        in 18..20 -> println("You may vote")
        else -> println("You're too young")
    }

    var x: Any = 13.37f
    when(x){
        is Int -> println("$x is an integer")
        is Double -> println("$x is a double")
        is String -> println("$x is a string")
        else -> println("$x is none of the above")
    }
}