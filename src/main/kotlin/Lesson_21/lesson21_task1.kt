package org.example.Lesson_21

fun main() {
    println("hello".getVowelLetters())
}

fun String.getVowelLetters(): Int {
    val vowelLetters = listOf("a", "e", "i", "o", "u")
    var vowelCounter = 0
    this.split("").forEach {
        if (it in vowelLetters) {
            vowelCounter += 1
        }
    }
    return vowelCounter

}