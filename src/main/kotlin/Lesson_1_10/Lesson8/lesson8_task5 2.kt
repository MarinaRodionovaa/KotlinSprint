package org.example.Lesson_1_10.Lesson8

const val STUB_NULL = 0

fun main() {
    println("Введите кол-во ингредиентов")
    val countOfIng = readln().toIntOrNull() ?: STUB_NULL
    val ingredients: Array<String> = Array(countOfIng, { " " })

    for (i in ingredients) {
        println("Введите ингредиент №${ingredients.indexOf(i) + 1}")
        ingredients[ingredients.indexOf(i)] = readln()
    }

    println(ingredients.joinToString(", "))

}