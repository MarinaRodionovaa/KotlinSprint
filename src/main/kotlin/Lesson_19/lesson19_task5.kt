package org.example.Lesson_19

fun main() {
    val personList: MutableList<Person> = mutableListOf()
    for (i in 1..5) {
        println("Введите имя и пол вводите в формате жен/муж, через enter")
        personList.add(Person(readln(), Sex.fromValue(readln())!!))

    }

    personList.forEach { it.printInfo() }
}

enum class Sex(val value: String) {
    MALE("муж"),
    FEMALE("жен");

    companion object {
        fun fromValue(value: String): Sex? {
            return entries.find { it.value == value }
        }
    }
}

class Person(val name: String, val sex: Sex) {
    fun printInfo() {
        println("$name , ${sex.value}")

    }
}

