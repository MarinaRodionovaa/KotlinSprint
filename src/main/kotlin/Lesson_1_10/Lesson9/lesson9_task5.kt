package org.example.Lesson_1_10.Lesson9

fun main() {
    println("Введите  пять названий ингредиентов")
    var ingredients: MutableSet<String> = mutableSetOf()
    for (i in 1..5) {
        ingredients.add(readln().lowercase())
    }

    val sortedIngredients = ingredients.sorted().toMutableList()
    sortedIngredients[0] = sortedIngredients[0].replaceFirstChar { it.uppercase() }

    println(sortedIngredients)

}