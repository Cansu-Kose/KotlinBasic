package com.example.kotlinbasics.file1


/**
 * Type    Size(bits)     MinValue                          MaxValue
 * -------------------------------------------------------------------------------------
 * Byte      8             -128                             127
 * Short     16            -32768                           32767
 * Int       32            -2,147,483,648                   2,147,483,647
 * Long      64            -9,223,372,036,854,775,808       9,223,372,036,854,775,807
 * Type    Size(bits)
 * ---------------------------------------------------------------------------------------
 * Type    Size(bits)     Significant bits    Exponent bits     Decimel digits
 * ---------------------------------------------------------------------------------------
 * Float     32              24                  8               6-7
 * Double    64              53                 11               15-16
 *  ---------------------------------------------------------------------------------------
 */

fun main() {

    val value = 9223372044444 // kotlin default olarak long ve ınt degeri verir byte ve short vermez
    val valueSecond = 50
    println(value::class.simpleName)
    println(valueSecond::class.simpleName)

    val floatSample : Float = 3.1454645747f
    val doubleSample : Double = 3.143533335555664466644664

    println(floatSample) // . dan sonra sadece 7 digit bastı
    println(doubleSample) // . dan sonra sadece 16 digit

}