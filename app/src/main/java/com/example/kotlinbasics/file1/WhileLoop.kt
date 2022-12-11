package com.example.kotlinbasics.file1

fun main() {
    var age= 0
    val todayAge = 25
    //while(true) dersek sonsuz bir döngüye sokarız
    while (age < todayAge) {
        age++
        println("Şimdiki yaşınız: $age")
    }

    val classRoom = mutableListOf<String>("cansu","zeynep","özkan")
    while (classRoom.size < 10) {
        classRoom.add("yeni ogrenci")
    }
    println(classRoom)

}