package org.example.Lesson13

const val STUB_NULL = "<не указано>"

fun main() {
    val phoneBook = listOf(PhoneBook2("Ростислав", 89123456789, null),
        PhoneBook2("Андрей", 89123456799, null),
        PhoneBook2("Алина", 89003456700, "null"))

    phoneBook.forEach { println(it.company?: STUB_NULL) }
}

class PhoneBook2(val name: String, val phone: Long, var company: String?) {

    fun printInfo() {
        println("Имя:${this.name} Номер:${this.phone} Компания: ${this.company ?: STUB_NULL}")
    }

}