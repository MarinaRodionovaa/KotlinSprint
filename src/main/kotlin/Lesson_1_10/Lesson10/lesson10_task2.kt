package org.example.Lesson_1_10.Lesson10

const val MIN_LENGTH= 4

fun main() {
    println("Введите логин")
    val inputLogin = readln()
    println("Введите пароль")
    val inputPassword = readln()
    checkLengthAuthorization(inputLogin, inputPassword)

}

fun checkLengthAuthorization(userLogin: String, userPassword: String) {
    if (userLogin.length >= MIN_LENGTH && userPassword.length >= MIN_LENGTH) {
        println("Добро пожаловать")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}