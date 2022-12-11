package com.example.kotlinbasics.file1

fun main() {
    println(surName) // bu bir fonksiyon oldugu için ekrana tipini yazdırır ve biz tipini görmüş oluruz
    println(sum(5,20))
}

val surName = {firstName: String,surName:String -> println("$firstName $surName")}

val sum : (Int,Int) -> Int = {
        first,second -> first+second
}