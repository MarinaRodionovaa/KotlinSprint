package org.example.Lesson13

const val STUB_NULL1 = "<не указано>"

fun main() {
    val phoneBook = listOf(
        PhoneBook3("Ростислав", 89123456789, null),
        PhoneBook3("Андрей", 89123456799, null),
        PhoneBook3("Алина", 89003456700, "null")
    )

    val companies = phoneBook.mapNotNull { it.company }
    println(companies)
}

class PhoneBook3(val name: String, val phone: Long, var company: String?) {

    fun printInfo() {
        println("Имя:${this.name} Номер:${this.phone} Компания: ${this.company ?: STUB_NULL1}")
    }

}