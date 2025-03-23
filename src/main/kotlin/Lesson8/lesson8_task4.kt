package org.example.Lesson8

fun main() {
    val ingredients = arrayOf("хлеб", "помидор", "сыр", "ветчина")

    println(ingredients.joinToString(", "))

    println("Введите ингредиент который хотите заменить")
    val ingToChange = readln().lowercase()

    if (ingToChange in ingredients) {

        println("Введите ингредиент который хотите добавить")
        val newIng = readln().lowercase()

        ingredients[ingredients.indexOf(ingToChange)] = newIng
        println(ingredients.joinToString(", "))

    } else {
        println("Такого ингредиента нет")

    }

}