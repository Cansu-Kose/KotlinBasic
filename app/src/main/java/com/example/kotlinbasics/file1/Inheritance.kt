package com.example.kotlinbasics.file1

fun main() {
    val child = Son()
    child.characteristic("mavi","sarı")
    child.psychological("mutsuz")
}

open class Dad {
    fun characteristic(eyeColor: String, hairColor: String) {
        println("Göz rengi: $eyeColor")
        println("Saç rengi: $hairColor")
    }
}

class Son:Dad() {

}