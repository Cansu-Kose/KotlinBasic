package com.example.kotlinbasics.file1


/*
* Arkadaşlarınızın adını ve yaşını tutabileceğiniz bir veri seti oluşturup ,
* istediğiniz bir yaşa, adı kullanarak erişiniz
*/

fun main(args: Array<String>) {

    val friends = mapOf<String , Int >("cansu kose" to 25 , "zeynep kose" to 26, "ozkan can kose" to 28)
    val mutableFriends = mutableMapOf<String , Int >("cansu kose" to 25 , "zeynep kose" to 26, "ozkan can kose" to 28)
    mutableFriends["nermin köse"] = 4
    mutableFriends["omer kose"] = 5
    println(friends["cansu kose"])

}
