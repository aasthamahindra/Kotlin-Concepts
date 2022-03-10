package com.example.kotlinbasics.OOP

// Data class cannot be open, abstract, sealed or inner classes
data class User(val id: Long, var name: String)

fun main() {

    val user1 = User(1, "Aastha")
    val name = user1.name
    println("$name")

    user1.name = "Nayan"
    val user2 = User(1, "Nayan")
    println(user1 == user2)

    println("User Details: $user1")

    val updatedUser = user1.copy(name = "Aastha")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // print 1
    println(updatedUser.component2()) //print Aastha

    val (id1, name1) = updatedUser
    println("id=$id1, name= $name1")
}