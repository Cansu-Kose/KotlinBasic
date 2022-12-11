package com.example.kotlinbasics.file1

fun main() {
    println(15 divide 5)
    println(15.divide(3)) //infix fonksiyonlarımız extension fonksiyon olduğu için bunları extension fonksiyon gibide kullanabiliriz

    1..10 step 5 //step ve until kotlindeki hazır bir infix fonksiyondur
    0 until 10
}

infix fun Int.divide(dividing: Int):Int = this / dividing