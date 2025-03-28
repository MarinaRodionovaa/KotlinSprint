package org.example.Lesson_1_10.Lesson10

const val STUB_NULL = 0

fun main() {
    println("Введите длину пароля")
    val password = passwordGenerate(readln().toIntOrNull() ?: STUB_NULL)
    println(password)

}

fun passwordGenerate(passwordLength: Int): String {
    val rangeOfSymbols = ' '..'/'
    val rangeOfNumbers = 0..9
    var pass = ""
    for (i in 1..passwordLength) {
        if (i % 2 != 0) {
            pass += rangeOfNumbers.random()
        } else {
            pass += rangeOfSymbols.random()
        }
    }
    return pass
}