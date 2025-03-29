package org.example.Lesson13

fun main() {
    println("Добавьте контакты в телефонную книгу")

    val phoneBook: MutableList<PhoneBook5> = mutableListOf()
    var work = true
    while (work) {
        println("Введите данные контакта имя, номер телефона, компанию")
        val contactName = readln()
        try {
            val contactCompany = readln().ifBlank { null }
            val contactNumber = readln().toLong()
            phoneBook.add(PhoneBook5(contactName, contactNumber, contactCompany))
        } catch (e: NumberFormatException) {
            println("Номер телефона не верного формата, запись контакта не добавлена")
        } catch (e: NullPointerException) {
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

class PhoneBook5(val name: String, val phone: Long, var company: String?) {

    fun printInfo() {
        println("Имя:${this.name} Номер:${this.phone} Компания: ${this.company}")
    }

}