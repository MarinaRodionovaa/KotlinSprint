package org.example.Lesson_1_10.Lesson8

fun main() {

    val ingredients = arrayOf("хлеб", "сыр", "колбаса")
    println("Введите название ингредиента")
    val inputIngredient = readln()

    if (inputIngredient in ingredients) {
        println("Ингредиент $inputIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}