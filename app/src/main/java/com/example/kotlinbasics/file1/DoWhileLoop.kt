package com.example.kotlinbasics.file1

fun main() {
    val class3A = mutableMapOf<Int,String>(1 to "cansu",2 to "özkan")
    val class3B = mutableMapOf<Int,String>(3 to "ayşe",4 to "fatma",5 to "merve")
    var totalStudent = class3A.size + class3B.size
    do {
        println("Öğrencinin ismini girin: ")
        val whichStudent = readLine()!!
        println("Öğrencinin sınıfını girin: ")
        val whichClass = readLine()!!
        if (whichClass == "a") {
            totalStudent++
            class3A[totalStudent] = whichStudent
        }
        else if (whichClass == "b") {
            totalStudent++
            class3B[totalStudent] = whichStudent
        }
        else if (whichClass == "c") {
            println("Bu sınıf kapalı. Kayda tekrar başlayın")
            println("A sınıfı öğrencileri : \t $class3A")
            println("B sınıfı öğrencileri : \t $class3B")
            break
        }
        else {
            println("Bu sınıf yanlıs tekrar deneyin")
            continue
        }
        println("$whichStudent isimli öğrenci $totalStudent numarasıyla $whichClass sınıfına kayıt edildi. ")

    } while (totalStudent < 9)
    println("A sınıfı öğrencileri : \t $class3A")
    println("B sınıfı öğrencileri : \t $class3B")
}