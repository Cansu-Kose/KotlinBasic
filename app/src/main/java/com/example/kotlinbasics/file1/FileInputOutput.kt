package com.example.kotlinbasics.file1

import java.io.File

fun main() {
    val filePath = "app/src/main/java/com/example/kotlinbasics/file1/output.txt"
    val process = FileProcess()
    process.showText(filePath)
    process.readText(filePath)
}

class FileProcess() {
    lateinit var text:String
    fun showText(filePath: String) {
        try {
            println(text)
        }
        catch (e:UninitializedPropertyAccessException) {
            println("Hata aldınız. Lütfen output.txt dosyasından detayları inceleyiniz")
            var err = e.stackTrace[0]
            var errStack = """
                Developer: Cansu Kose
                ---------------------
                
                ${err.fileName}
                ${err.className}
                ${err.methodName}
                ${err.lineNumber}
                ${e.message}
                
                """ .trimIndent()
            File(filePath).writeText(errStack)

        }
    }

    fun readText(filePath: String) {
        print(File(filePath).readText())
    }
}