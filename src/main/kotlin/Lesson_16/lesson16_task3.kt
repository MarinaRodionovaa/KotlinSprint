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
    val user = User("12345")
    println(user.checkPassword("password"))
}

class User(private val password: String) {
    private val login: String = "admin"

    fun checkPassword(pass: String): Boolean {
        return password == pass
    }
}
