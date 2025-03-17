package org.example.Lesson5

fun main() {

    val userLogin = "Zaphod"
    val userPassword = "PanGalactic"

    println("Введите логин")
    val enteredLogin = readLine() ?: ""

    if (enteredLogin != userLogin) {
        print("Такого пользователя не существует\nЗарегистрируйтесь в системе!")
    } else {
        println("Введите пароль")
        val enteredPassword = readLine() ?: ""
        if (enteredPassword == userPassword) {
            print("Добро-пожаловать на борд!")
        } else {
            print("Пароль не верный")
        }
    }

}