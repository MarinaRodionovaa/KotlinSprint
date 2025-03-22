package org.example.Lesson7

const val MIN_VALUE = 6

fun main() {
    val lowLetterRange = 'a'..'z'
    val UpLetterRange = 'A'..'Z'
    val numberRange = '0'..'9'

    val rangeList = listOf(UpLetterRange, lowLetterRange, numberRange)

    println("Введите кол-во символов в пароле")
    val input = readln().toIntOrNull() ?: MIN_VALUE
    val lengthPassword = if (input < MIN_VALUE) MIN_VALUE else input

    var password = ""

    for (i in 1..lengthPassword) {
        password += (rangeList.random()).random()
    }
    println("Сгенерированный пароль: $password")

}