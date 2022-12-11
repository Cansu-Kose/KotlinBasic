package com.example.kotlinbasics.file1

fun main() {
    val book = Book345()
    println(book.bookType)
    println(book.pageSize)
    book.sayBookName()
}

abstract class Library {
    abstract var pageSize : Int
    abstract var bookType : String
    abstract fun sayBookName()
}

class Book345: Library() {
    override var pageSize = 23
    override var bookType = "History"

    override fun sayBookName() {
        println("Book345")
    }

}
