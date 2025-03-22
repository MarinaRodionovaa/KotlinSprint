package org.example.Lesson7

fun main() {
    val numberRange = 0..9
    val letterRange = 'a'..'z'
    val countOfPassword = 6
    var password = ""
    for (i in 1..countOfPassword) {
        if (i % 2 == 0) {
            password += (letterRange).random()
        } else {
            password += (numberRange).random()
        }

    }
    println("Сгенерированный пароль: $password")
}