package org.example.Lesson_20

fun main() {

    val robot = Robot()
    robot.say()
    val modifier: (it: String) -> String = { it.split(" ").map { it.reversed() }.joinToString() }
    robot.setModifier(modifier)
    robot.say()


}

class Robot() {
    private val listOfPhrases =
        listOf("Hello world!", "Hello Moscow!", "Happy New Year!", "Happy birthday!", "Happy halloween!")
    private var modifier: ((it: String) -> String) = { it }

    fun say() {
        println(modifier(listOfPhrases.random()))
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}