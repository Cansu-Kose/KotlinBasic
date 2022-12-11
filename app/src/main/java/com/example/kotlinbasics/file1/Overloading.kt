package com.example.kotlinbasics.file1

fun main() {
    sayNotes("merve",80,true)
}

fun sayNotes(studentName: String, note:Int) {
    println("$studentName isimli öğrencinin notu : $note")
}

fun sayNotes(studentName: String, note: Int, congratsDoc: Boolean) {
    if (congratsDoc) println("Tebrikler başarı belgesi kazandınız")
    println("$studentName isimli öğrencinin notu : $note")
}

fun sayNotes(studentName: String, suggestion: String) {
    println("$studentName isimli öğrencinin önerisi : $suggestion")
}