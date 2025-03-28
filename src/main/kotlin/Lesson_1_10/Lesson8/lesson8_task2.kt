package org.example.Lesson_1_10.Lesson8

fun main() {

    val ingredients = arrayOf("хлеб", "сыр", "колбаса")
    println("Введите название ингредиента")
    val inputIngredient = readln()

    var isFind = false

    for (i in ingredients) {
        if (i == inputIngredient) {
            println("Ингредиент $i в рецепте есть")
            isFind = true
            break
        }

    }
    if (!isFind) {
        println("Такого ингредиента в рецепте нет")
    }

}