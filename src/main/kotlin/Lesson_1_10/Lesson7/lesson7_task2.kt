package org.example.Lesson_1_10.Lesson7

const val STUB_NULL_1 = 0

fun main() {
    val range = 1000..9999
    var userCode: Int
    var smsCode: Int

    do {
        smsCode = range.random()
        println("Код подтверждения: $smsCode")
        println("Введите код из смс")
        userCode = readln().toIntOrNull() ?: STUB_NULL_1
    } while (userCode != smsCode)
    println("Добро пожаловать")
    return
}