package org.example.Lesson9

const val STUB_NULL = 0

fun main() {
    var ingredients = listOf(2, 50, 15)

    println("Введите кол-во порций")
    val countOfPortions = readln().toIntOrNull() ?: STUB_NULL

    ingredients = ingredients.map {
        it * countOfPortions
    }
    println(
        "На $countOfPortions порций вам понадобится: " +
                "Яиц – ${ingredients[0]},молока – ${ingredients[1]}, сливочного масла – ${ingredients[2]} "
    )
}