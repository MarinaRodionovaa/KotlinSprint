package org.example.Lesson7

const val MIN_VALUE = 6

fun main() {
    val lowLetterRange = 'a'..'z'
    val upLetterRange = 'A'..'Z'
    val numberRange = '0'..'9'
    val rangeOfCharacters = lowLetterRange + upLetterRange + numberRange

    println("Введите кол-во символов в пароле")
    val input = readln().toIntOrNull() ?: MIN_VALUE
    val lengthPassword = if (input < MIN_VALUE) MIN_VALUE else input

    val password: MutableList<Char> = mutableListOf()
    password.add(lowLetterRange.random())
    password.add(upLetterRange.random())
    password.add(numberRange.random())

    for (i in 1..(lengthPassword - password.size)) {
        password.add(rangeOfCharacters.random())
    }
    password.shuffle()
    println("Сгенерированный пароль: ${password.joinToString("")}")

}