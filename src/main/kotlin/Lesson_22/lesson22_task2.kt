package org.example.Lesson_22

fun main() {
    val regularBook = RegularBook1("1984", "George Orwell")

    val dataBook = DataBook1("1984", "George Orwell")

    println(regularBook) // Выводит хешкод класса
    println(dataBook) // Выводит свойства и их значения
}

class RegularBook1(val name: String, val author: String)

data class DataBook1(val name: String, val author: String)