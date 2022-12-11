package com.example.kotlinbasics.file1

fun main() {
    val min: Int

    println("Birinci değeriniz nedir?")
    val firstValue = readLine()!!.toInt()

    println("İkinci değeriniz nedir?")
    val secondValue = readLine()!!.toInt()

    if (firstValue > secondValue && firstValue > 0 && secondValue > 0) {
        min = secondValue
        println("Minimum degeriniz: $min")
    }
    else if (secondValue > firstValue && secondValue > 0 && firstValue > 0) {
        min = firstValue
        println("Minimum degeriniz: $min")
    }
    else {
        println("Pozitif deger giriniz")
    }

}