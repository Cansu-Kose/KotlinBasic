package com.example.kotlinbasics.file1

//interface içerisinde datalarımız initialize etmiyoruz define ediyoruz
//Daha sonra zaten implement ettiğimiz classlar içinde onları initialize edicez
//interface ler kolay implemente edilir ama içindeki yapıları kullanmak zorundayız
//classlarımız içinde birdek fazla interface implemente edebiliyoruz

fun main() {
    val littleGirl = Daughter()
    println(littleGirl.eyeColor)
    println(littleGirl.hairColor)
    littleGirl.sayFatherName()
    littleGirl.sayMotherName()
}

interface Mother {
    var hairColor: String
    fun sayMotherName()
}

interface Father {
    var eyeColor: String
    fun sayFatherName()
}

class Daughter(): Father,Mother {
    override var eyeColor = "mavi"
    override fun sayFatherName() {
        println("cansu")
    }

    override var hairColor = "siyah"
    override fun sayMotherName() {
        println("cansu")
    }
}