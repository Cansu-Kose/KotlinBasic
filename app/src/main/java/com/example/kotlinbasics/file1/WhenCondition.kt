package com.example.kotlinbasics.file1

fun main() {
    when(readLine()!!.toInt()) {
        in 80..100 -> println("Harf notunuz: AA")
        in 60..80 -> println("Harf notunuz: BB")
        in 40..60 -> println("Harf notunuz: CC")
        in 0..40 -> println("Kaldınız")
        !in 0..100 -> println("Yanlış bir not")
    }
}