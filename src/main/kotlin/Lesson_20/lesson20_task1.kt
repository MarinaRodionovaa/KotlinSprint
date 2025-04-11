package org.example.Lesson_20

fun main() {
    val congratulateLambda: (String) -> String = { username: String -> "С наступающим Новым Годом, $username!" }
    println(congratulateLambda("Alex"))
}