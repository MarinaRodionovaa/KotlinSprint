package org.example.Lesson_20

fun main() {
    val listOfElements = listOf(
        "Элемент 1",
        "Элемент 2",
        "Элемент 3",
        "Элемент 4",
        "Элемент 5",
        "Элемент 6",
        "Элемент 7",
        "Элемент 8",
        "Элемент 9",
        "Элемент 10"
    )

    val listOfElementsLambda = listOfElements.map { { println("Нажат элемент $it") } }

    for (element in 1..listOfElementsLambda.size step 2) {
        listOfElementsLambda[element]()

    }
}

