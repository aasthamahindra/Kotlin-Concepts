package com.example.kotlinbasics

fun main(){
    /*
    while loop executes a block of code repeatedly as long as a given condition is true
    while(condition){
        //code to executed as long as condition is true
    }
    */
    var x = 1
    while (x <= 10){
        print("$x ")
       x++
    }
    println("\nOut of while loop")

    // TODO: Course Task
    var y = 100
    while(y >=0 ){
        print("$y ")
        y -= 2
    }

    /*
    do-while loop: slightly different from while loop
    Do not check before they at least execute for once
     */
    var a = 1
    println()
    do{
        print("$a ")
        a++
    } while(a <= 10)
    println("\nOut of do-while loop")

    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp == "cold") {
        roomTemp++
        if (roomTemp >=20){
            feltTemp = "comfy"
            println("It's comfy now")
        }
    }

    /*
    for-loop: A for-loop is used to iterate through ranges, arrays, collections, or anything
     */
    for(num in 1..10){
        print("$num ")
    }
    println()
    for(i in 1 until 10){
        print("$i ")
    }
    println()
    for(x in 10 downTo 1 step 2) // for(i in 10.downTo(1).step(2){}
    {
        print("$x ")
    }



}