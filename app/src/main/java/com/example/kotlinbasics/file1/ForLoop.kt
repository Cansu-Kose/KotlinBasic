package com.example.kotlinbasics.file1

fun main() {
    val employee = mutableListOf<String>("cansu","aleyna","enes","oguzhan")
    for (person in employee) {
        when(person) {
            "cansu" -> println("$person Android Developer")
            "aleyna" -> println("$person IOS Developer")
            "enes" -> println("$person DevOps Engineer")
            "oguzhan" -> println("$person IOS Developer")
        }
    }

    for (i in 1..10) println(i)
    for (a in 1 until 5) println(a)
    for (b in 10 downTo 0 step 2) println(b)
}