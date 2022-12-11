package com.example.kotlinbasics.file1

fun main() {
    Publisher().Book1().printPublisherName()
    Publisher.Book2().printPublisherName()
}

open class Author() {
    var author1 = "cansu kose"
    var author2 = "zeynep kose"

}

class Publisher() {
    var publisherName = "cansu yayıncılık"
    inner class Book1:Author() { //inner class herhangi bir extend işlemi yapılmamasına ragmen kendinden önceki bir üst classı inherit edebilir
                                 //normalde iki class ı inherit edemeyiz book1 e ama inner ile hem author u hemde publisher class ımın
                                 // içindekileri inherit edebiliyorum.
        fun printPublisherName() {
            println(publisherName)
            println("Yazar: $author1")
        }
    }
    class Book2 { //bu nested class
        var publisherName = "zeynep yayıncılık"
        fun printPublisherName() {
            println(publisherName)
        }
    }
}