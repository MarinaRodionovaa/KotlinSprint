package org.example.Lesson_1_10.Lesson8

fun main() {
    val ingredients = arrayOf("хлеб", "помидор", "сыр", "ветчина")

    println(ingredients.joinToString(", "))

    println("Введите ингредиент который хотите заменить")
    val indexOfNewIng = ingredients.indexOf(readln().lowercase())

    if (indexOfNewIng != -1) {

        println("Введите ингредиент который хотите добавить")
        val newIng = readln().lowercase()
        ingredients[indexOfNewIng] = newIng
        println("Готово! Вы сохранили следующий список: ${ ingredients.joinToString(", ") }")

    } else {
        println("Такого ингредиента нет")

    }

}