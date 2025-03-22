package org.example.Lesson7

const val STUB_NULL = 0

fun main() {
    val range = 1000..9999
    var userCode: Int
    var smsCode: Int

    do {
        smsCode = range.random()
        println("Код подтверждения: $smsCode")
        println("Введите код из смс")
        userCode = readln().toIntOrNull() ?: STUB_NULL
    } while (userCode != smsCode)
    println("Добро пожаловать")
    return
}