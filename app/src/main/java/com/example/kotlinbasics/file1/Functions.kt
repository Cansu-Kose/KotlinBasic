package com.example.kotlinbasics.file1

fun main() {
    evenOrOdd(25)
    println(division(50,20))
}

fun evenOrOdd(number: Int) {
    if (number %2 == 0) println("Sayınız cift")
    else println("Sayınız tek")
}

fun division(firstNumber: Int,secondNumber: Int):Int { //bu fonksiyon belirtildiği gibi Int bir değer döndürüyor
    return firstNumber / secondNumber
}