package org.example.Lesson_16

//Задача 3 к Уроку 16
//
//Создай класс, описывающий пользователя, который хранит поля логин и пароль.
//
//Пароль не должен быть виден в теле главной функции, но должен быть способ проверить, что пароль введен верно.
//Функция валидации должна принимать строку и возвращать результат проверки (и только его – без распечатки или генерации других строк).
//
//Выведи информацию о корректности введенного пароля.

fun main() {
    val user = User()
    println(user.checkPassword("password"))
}

class User() {
    private val login: String = "admin"
    private val password: String = "123456"

    fun checkPassword(pass: String): Boolean {
        return password == pass
    }
}
