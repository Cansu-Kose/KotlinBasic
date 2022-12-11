package com.example.kotlinbasics.file1

fun main() {
    val voice = VoiceControl() //object instance oluşturduk
    voice.printLoudly()
    Identity("cansu","kose","ardahan")
}

class VoiceControl {
    fun printLoudly() {
        println("Voice Control")
    }
}

class Identity(name: String,surName: String) {
    var fName: String ?= null
    var sName: String ?= null
    var summary = mutableMapOf<String,String>()
    init {
        this.fName = name
        this.sName = surName
        println("İsim: $fName | Soyisim: $sName ")
    }

    constructor(firstName:String, secondName:String, bornCity:String) :this(firstName,secondName) {
        summary["İsim"] = firstName
        summary["Soyisim"] = secondName
        summary["Dogum Yeri"] = bornCity
        println("Kimlik bilgileriniz: \t $summary")
    }
}