package com.example.kotlinbasics

fun main(){

    //TODO: Write a for loop that runs from 0 to 10000. Once it's at 9001 it should write "IT'S OVER 9000!!!"
    for(i in 0..10000){
        if(i>=9001){
            print("It's over 9000!!! ")
        } else{
            print("$i ")
        }
    }

    //TODO: Write a while loop that checks the humidity (not the humidityLevel).
    // The variable humidityLevel starts at 80. The variable humidity is initialized with "humid".
    // If it is "humid" then it should reduce the "humidityLevel" by 5 and print "humidity decreased"
    // Once the humidityLevel is below 60 it should print "it's comfy now" and set the humidity to "comfy"
    var humidityLevel = 80
    var humidity = "humid"
    while(humidityLevel >= 60){
        if(humidity == "humid"){
            humidityLevel -= 5
            println("Humidity decreased")
        }
    }
    println("It's comfy now!")
    humidity = "comfy"

}