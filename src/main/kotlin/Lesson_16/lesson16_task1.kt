package org.example.Lesson_16

fun main() {
    val dice = Dice()
    dice.printValue()
}

class Dice {
    private val range = 1..6
    private val count = range.random()

    fun printValue() {
        println(count)
    }
}