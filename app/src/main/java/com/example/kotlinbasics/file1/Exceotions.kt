package com.example.kotlinbasics.file1

fun main() {
    if (divide(5,0).equals(true)){
        println("ok")
    }
    else {
        throwSomething()
        throw Throwable("Bu islem sıfıra bolunemedigi icin gerceklesememistir")
        //Throwable errorlar ve exceptionlar için bir base class görevi görüyor
    }
}

fun divide(first:Int,second:Int) {
    try {
        first/second
    }
    catch (e:ArithmeticException) {
        println("Hata alınan class ismi: ${e.stackTrace[1].className}")
        println("Hata alınan method ismi: ${e.stackTrace[1].methodName}")
        println("Hata alınan satır: ${e.stackTrace[1].lineNumber}")
    }
    finally {
        println("Hata blokları bu kadar")
    }
}

// throw

fun throwSomething() {
    throw Throwable("Bu islem sıfıra bolunemedigi icin gerceklesememistir")
}