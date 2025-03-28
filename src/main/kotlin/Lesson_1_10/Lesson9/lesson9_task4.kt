package org.example.Lesson_1_10.Lesson9

fun main() {
    println("Введите пять названий ингредиентов блюда ")
    val ingredients = readln().split(", ")
    println(ingredients.sorted())

}