package com.example.kotlinbasics.file1

fun main() {
    val father = Dad()
    father.psychological("mutlu")
    println(5.topla(15))
}

fun Dad.psychological(mood:String) {
    println("Ruh hali: $mood")
}

fun Int.topla(topla : Int):Int {
    return this+topla
}