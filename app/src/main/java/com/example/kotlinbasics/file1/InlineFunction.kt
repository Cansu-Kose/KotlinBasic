package com.example.kotlinbasics.file1

fun main() {
    bloodGroup({ print("A ")},{ print(" +")})
}

inline fun bloodGroup(first:() -> Unit,second:() -> Unit) {
    first()
    print("RH")
    second()
}