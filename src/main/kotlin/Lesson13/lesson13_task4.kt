package org.example.Lesson13

fun main() {
    println("Добавьте контакты в телефонную книгу")

    val phoneBook: MutableList<PhoneBook4> = mutableListOf()
    var work = true
    while (work) {
        println("Введите данные контакта имя, номер телефона, компанию")
        val contactName = readln()
        val contactNumber = readln().toLongOrNull()
        val contactCompany = readln().ifBlank { null }
        if (contactNumber != null) {
            phoneBook.add(PhoneBook4(contactName, contactNumber, contactCompany))
        } else {
            println("Номер телефона не заполнен, запись контакта не добавлена")
        }

        println("Хотите добавить еще один контакт? Да/Нет")
        if (readln().equals("да", ignoreCase = true)) {
            continue
        } else {
            work = false
        }

    }

    phoneBook.forEach { it.printInfo() }
}

class PhoneBook4(val name: String, val phone: Long, var company: String?) {

    fun printInfo() {
        println("Имя:${this.name} Номер:${this.phone} Компания: ${this.company}")
    }

}