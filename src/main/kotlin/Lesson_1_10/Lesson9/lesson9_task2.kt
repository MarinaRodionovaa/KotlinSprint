package org.example.Lesson_1_10.Lesson9

fun main() {
    val baseList = mutableListOf("хлеб", "ветчина", "сыр")

    println("В рецепте есть базовые ингредиенты: $baseList")
    println("Желаете добавить еще?")

    if (readln().equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        baseList.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: $baseList")
    } else {
        return
    }

}

