package org.example.Lesson_1_10.Lesson6

fun main() {
    println("Пройдите регистрацию")
    println("Придумайте логин")
    val userLogin = readln()
    println("Придумайте пароль")
    val userPass = readln()
    println("Вы успешно зарегистрированы\nПройдите авторизацию")

    var enteredLogin: String
    var enteredPass: String

    do {
        println("Введите логин")
        enteredLogin = readln()
        println("Введите пароль")
        enteredPass = readln()
    } while (enteredLogin != userLogin && enteredPass != userPass)

    println("Авторизация прошла успешно")

}