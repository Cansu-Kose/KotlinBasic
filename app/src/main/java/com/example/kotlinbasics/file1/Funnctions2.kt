package com.example.kotlinbasics.file1

fun main() {
    human("cansu",25)
    human(age = 28, name = "zeynep")
    humans("cansu","zeynep","özkan")
}

fun human(name: String,age: Int) {
    println("İsim: $name | Yas: $age")
}

fun humans(vararg names: String) {
    for (name in names) {
        println("İsim: $name")
    }
}