package com.example.kotlinbasics.file1

fun main() {
    tellMeCurrentDay(Days.Sunday)
    tellMeCurrentNewDay(DaysNew.Friday)
}

enum class Days {
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}

fun tellMeCurrentDay(day: Days) {
    when(day) {
        Days.Monday -> println("Pazartesi")
        Days.Tuesday -> println("Salı")
        Days.Thursday -> println("Çarşamba")
        Days.Wednesday -> println("Perşembe")
        Days.Friday -> println("Cuma")
        Days.Saturday -> println("Cumartesi")
        Days.Sunday -> println("Pazar")
    }
}

fun tellMeCurrentNewDay(day: DaysNew) {
    println(day.day)
}

enum class DaysNew(val day: String) {
    Monday("Pazartesi"),
    Tuesday("Salı"),
    Thursday("Çarşamba"),
    Wednesday("Perşembe"),
    Friday("Cuma"),
    Saturday("Cumartesi"),
    Sunday("Pazar")
}