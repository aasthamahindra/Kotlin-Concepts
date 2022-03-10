package com.example.kotlinbasics.AdvancedConcepts_AC

fun main() {
    val arrayList = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    println("This is ArrayList")
    for(i in arrayList){
        println(i)
    }

    //Using collections
    val arrayList2: ArrayList<String> = ArrayList<String>(5)
    var list:MutableList<String> = mutableListOf<String>()
    list.add("One")
    list.add("Two")
    arrayList2.addAll(list)
    //Filled elements in ArrayList using collections
    val itr = arrayList2.iterator()
    while(itr.hasNext()){
        println(itr.next())
    }
    println("Size of ArrayList: ${arrayList2.size}")

    //get() function
    println(arrayList.get(0))
}