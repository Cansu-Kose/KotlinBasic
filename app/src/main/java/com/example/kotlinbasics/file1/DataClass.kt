package com.example.kotlinbasics.file1

fun main() {
    val arthur = Student(1.60f,70,39)
    val modifiedArthur = Dietitian(arthur)
    val hans = arthur.copy(1.59f)
    val modifiedHans = Dietitian(hans)
    println(modifiedHans.checkChildStatus())
    println(modifiedArthur.checkChildStatus())

    println(hans.hashCode().equals(arthur.hashCode())) //hashCode un obje üzerinden farklılıkları

}

//data class larda en az bir property vermek zorundayız
data class Student(var height:Float , var weight:Int, var footNumber:Int) {
    lateinit var status: Status //lateinit yani geç initialize bunu sonra tanımlıycam demek istiyorum.
}

class Dietitian(var child:Student) {
    fun checkChildStatus():Status {
        if (child.height < 1.70 && child.weight > 60) {
            child.status = Status.Fat
        }
        else if (child.height in 1.70f..1.90f && child.weight in 70..90) {
            child.status = Status.Normal
        }
        else if (child.height < 1.70 && child.weight < 60) {
            child.status = Status.Thin
        }
        else {
            child.status = Status.Processing
        }
        return child.status
    }
}

enum class Status() {
    Fat,Normal,Thin,Processing
}