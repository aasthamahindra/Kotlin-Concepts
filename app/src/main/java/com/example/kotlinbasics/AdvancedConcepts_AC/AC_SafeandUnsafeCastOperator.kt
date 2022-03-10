package com.example.kotlinbasics.AdvancedConcepts_AC

/*
- Unsafe cast operator: as:: Sometimes it is not possible to cast a variable and it throws an exception.
- Safe cast operator: as?:: Safely cast to a type. It returns null if casting is not possible rather
  than throwing  ClassCastException
 */

fun main() {
    val obj: Any? = "String unsafe cast"
    val str: String? = obj as String?
    println(str)

    val location:Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt:Int? = location as? Int //cannot perform this cast ->null
    println(safeString)
    println(safeInt)
}