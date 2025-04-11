package org.example.Lesson_22

fun main(){
    val regularBook1 = RegularBook("1984", "George Orwell")
    val regularBook2 = RegularBook("1984", "George Orwell")

    val dataBook1 = DataBook("1984", "George Orwell")
    val dataBook2 = DataBook("1984", "George Orwell")

    println(regularBook1 == regularBook2) // Сравнивает ссылки на объекты
    println(dataBook1 == dataBook2) // Сравнивает свойства объекта
}

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)