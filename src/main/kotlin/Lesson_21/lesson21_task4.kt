package org.example.Lesson_21

import java.io.File

fun main() {
    val file = File("input.txt")
    file.createNewFile()
    file.writeTextInLower("123 ")
    file.writeTextInLower("456 ")

}

fun File.writeTextInLower(text: String) {
    this.writeText(text.lowercase() + this.readText())
}