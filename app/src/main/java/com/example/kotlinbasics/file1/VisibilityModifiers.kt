package com.example.kotlinbasics.file1

fun main() {
    var car = Car()
    var bmw = Bmw()
    Called()
}

open class Car() {
    private var serialNumber = 24
    protected var modal = 0 //protected private gibi sadece tanımlandığı yerde kullanılabilir ama extend edilme durumu yoksa
                            //yani tanımlandığı class da ve extend edildiği subclass da ekleme ve erişilme durumu olabiliyor
    var color = "Mavi" //kotlinde varsayılan olarak public dir
    internal var brand = "" //sadece tanımlandıgı modül içersinde erişilebilir yani file1 in altındaki yerlerde.
    internal fun changeBrand() { }
}

class Mercedes:Car() {
    init {
        var mrModel = modal
    }
}

class Bmw {
    init {
        var car = Car()
    }
}

//------ Get Set ----------//

fun String.combain(words:String):String {
    return this+words
}

class Person() {
    var name = "Ali"
        get() = field.combain(" cagrıldı")
        set(value) {
            field = value.combain(" yeni deger üretildi")
        }
}

class Called() {
    var person = Person()
    init {
        person.name = "-------"
        println(person.name)
    }
}
