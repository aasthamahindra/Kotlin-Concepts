package com.example.kotlinbasics

fun main() {

    // break: Once break is executed, it gets out of the entire loop
    for( i in 1..20){
        print("$i ")
        if(i/2 == 5){
            break
        }
    }
    print("\nDone with the loop")
    println()

    // continue: Skips the current iteration when condition is met
    // 10/2 = 5
    // 11/2 = 5.5 which is 5 in terms of an Int
    for( x in 1..20){

        if(x/2 == 5){
            continue
        }
        print("$x ")
    }
    print("\nDone with the loop")

}