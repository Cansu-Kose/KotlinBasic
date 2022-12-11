package com.example.kotlinbasics.file1

fun main() {

    var firstNumber = 13
    val secondNumber = 6

    println(firstNumber / secondNumber)
    println(firstNumber % secondNumber)
    println(firstNumber + secondNumber)
    println(firstNumber - secondNumber)
    println(firstNumber * secondNumber)

    firstNumber += secondNumber // firstNumber = firstNumber + secondNumber
    println(firstNumber)

    val result : Boolean = firstNumber > secondNumber
    val result1 : Boolean = firstNumber < secondNumber
    val result2 : Boolean = firstNumber >= secondNumber
    val result3 : Boolean = firstNumber <= secondNumber
    val result4 : Boolean = firstNumber == secondNumber
    val result5 : Boolean = firstNumber != secondNumber
    println(result)
    println(result1)
    println(result2)
    println(result3)
    println(result4)
    println(result5)

}