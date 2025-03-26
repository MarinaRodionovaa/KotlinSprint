package org.example.Lesson13

const val STUB_NULL = "<не указано>"

fun main() {
    val phoneBook = PhoneBook1("Ростислав", 89123456789, null)
    phoneBook.printInfo()

}

class PhoneBook1(val name: String, val phone: Long, var company: String?) {

    fun printInfo() {
        println("Имя:${this.name} Номер:${this.phone} Компания: ${this.company ?: STUB_NULL}")
    }

}