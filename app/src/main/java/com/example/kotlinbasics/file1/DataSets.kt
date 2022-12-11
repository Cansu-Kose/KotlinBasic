package com.example.kotlinbasics.file1

/**
 *  Mutable Collections ||  Immutable Collections
 *  ------------------- || ----------------------
 *  MutableMapOf()      ||   SetOf()
 *  MutableListOf()     ||   MapOf()
 *  MutableSetOf()      ||   ListOf()
 *  ArrayListOf()       ||
 *  -----------------------------------------------
 */


fun main() {

    val sampleList = listOf<Any>(1,3,5,7,8,"ali",'b',true)
    println(sampleList[0])  //burada sampleList.add diyemeyiz çünkü immutable bir collection

    val sampleSecondList = mutableListOf<Any>(1,3,5,7,8,"ali",'b',true)
    sampleSecondList.add(98)
    sampleSecondList.removeAt(5)
    sampleSecondList.remove('b')
    sampleSecondList.removeFirst()
    println(sampleSecondList)

    val arraySample = Array(5) {0} // array imizin size ını 5 yaptık
    arraySample[3] = 5
    println(arraySample[3])

    val students = mapOf<String , Int >("cansu kose" to 1 , "zeynep kose" to 3, "ozkan can kose" to 2)
    println(students["cansu kose"])  // print de 1 degerini görüyorum

    val mutableStudents = mutableMapOf<String , Int >("cansu kose" to 1 , "zeynep kose" to 3, "ozkan can kose" to 2)
    mutableStudents["nermin köse"] = 4
    mutableStudents["omer kose"] = 5 //mutableStudents.put("omer kose",5)
    println(students["cansu kose"])  // print de 1 degerini görüyorum
    println(mutableStudents)

    val setSample = setOf<Int>(1,2,3,3)
    println(setSample) // cıktı 123 olur bana 1233 vermez ama arraylist de tekrar eden dataları görebilirim



}