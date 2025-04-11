package org.example.Lesson_19

import org.example.Lesson_19.Category.STATIONERY

fun main() {
    val product = Product(1,"Карандаш", STATIONERY)
    product.printInfo()
}

class Product(val id: Int, val name: String, val type: Category) {
    fun printInfo() {
        println("id: $id, Товар: $name Категория: ${type.getName()}")
    }
}

enum class Category {
    CLOTH,
    STATIONERY,
    OTHER;

    fun getName(): String {
        val result = when (this) {
            CLOTH -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            OTHER -> "разное"
        }

        return result
    }

}