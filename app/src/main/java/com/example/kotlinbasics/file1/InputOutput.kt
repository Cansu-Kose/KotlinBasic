package com.example.kotlinbasics.file1

import java.util.*

fun main() {

    println("Bir isim giriniz")
    val firstInput = readLine() // readLine string tabanlı bir fonksiyon
    println("Bir yaş giriniz")
    val secondInput = readLine()!!.toInt()
    println(firstInput)
    println(secondInput)
    println(secondInput::class.simpleName)

    println("Sayı giriniz")
    val data = Scanner(System.`in`)
    val lastData = data.next()
    val lastIntData = data.nextInt()
    println(lastData)
    println(lastIntData)

}