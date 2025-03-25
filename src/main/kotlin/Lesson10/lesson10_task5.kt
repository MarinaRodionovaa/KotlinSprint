package org.example.Lesson10

const val LOGIN = "admin"
const val PASSWORD = "admin"

fun main() {


    println("Введите логин")
    val inputLogin = readln()
    println("Введите пароль")
    val inputPass = readln()

    val token = authorization(inputLogin, inputPass)

    if (token == null) {
        println("Не верный логин либо пароль")
    } else {
        println(getCart(token))
    }

}

fun getCart(token: String): List<String> {
    val cart = listOf("молоко", "хлопья для завтрака", "чай")
    return cart
}

fun authorization(login: String, password: String?): String? {

    val rangeNumbers = '0'..'9'
    val uppLetterNumbers = 'a'..'z'
    val lowLetterNumbers = 'A'..'Z'
    val range = rangeNumbers + uppLetterNumbers + lowLetterNumbers
    val token: MutableList<Char> =
        mutableListOf(rangeNumbers.random(), uppLetterNumbers.random(), lowLetterNumbers.random())

    if (login == LOGIN && password == PASSWORD) {
        for (i in 1..(32 - token.size)) {
            token.add(range.random())
        }
        token.shuffle()
        return token.joinToString("")
    } else {
        return null
    }

}