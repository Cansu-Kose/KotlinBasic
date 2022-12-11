package com.example.kotlinbasics.file1

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    val newKing = Prince()
    newKing.say()
}

open class King() {
    var family = mutableMapOf<String,String>()
    init {
        family["King"] = "Philip"
        family["Queen"] = "Elizabeth"
    }
    open fun say() {
        println("Uk Royal Family: $family")
    }
}

class Prince:King() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun say() {
        family.replace("King","Philip","Charles")
        family.replace("Queen","Elizabeth","Diana")
        println("Uk Royal Family: $family")
    }
}