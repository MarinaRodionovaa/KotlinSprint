package org.example.Lesson_15

abstract class Users(val name: String) {

    fun writeMessage() {
        println("Пишет сообщение")
    }

    fun readMessage() {
        println("Читает сообщение")

    }
}

class User(name: String) : Users(name)

class Administrator(name: String) : Users(name) {
    fun deleteMessage() {
        println("Удаляет сообщение")
    }

    fun deleteUser() {
        println("Удаляет пользователя")
    }

}

