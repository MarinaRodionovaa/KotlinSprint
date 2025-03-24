package org.example.Lesson10

fun main() {
    println("Введите логин")
    val inputLogin = readln()
    println("Введите пароль")
    val inputPassword = readln()
    checkLengthAuthorization(inputLogin, inputPassword)

}

fun checkLengthAuthorization(userLogin: String, userPassword: String) {
    if (userLogin.length >= 4 && userPassword.length >= 4) {
        println("Добро пожаловать")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}