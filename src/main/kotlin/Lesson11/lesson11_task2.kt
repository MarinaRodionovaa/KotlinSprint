package org.example.Lesson11

fun main() {

    val user1 = User2(1, "admin", "admin", "admin@gmail.com")

    println("Заполни информацию о себе")
    user1.entryBio()
    println("Cмените пароль")
    user1.changePassword()
    user1.printInfo()

}

class User2(val userId: Int, val login: String, var password: String, val email: String, var bio: String = "") {

    fun printInfo() {
        println(" $userId,  $login, $password, $email, $bio")
    }

    fun entryBio() {
        this.bio = readln()
    }

    fun changePassword() {
        println("Введите старый пароль")
        if (readln() == this.password) {
            println("Введите новый пароль")
            this.password = readln()
            println("Пароль успешно изменен")
        } else {
            println("Пароль был введен не верно")
        }
    }

}