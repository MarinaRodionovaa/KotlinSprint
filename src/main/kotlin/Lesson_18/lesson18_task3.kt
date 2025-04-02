package org.example.Lesson_18

//Задача 3 к Уроку 18
//
//В тамагочи есть лиса, собака и кошка. Они могут только есть и спать.
//
//Лиса ест ягоды, собака – кости, а кошка – рыбу. У каждого животного есть имя.
//Эти действия отображаются в консоли по такому шаблону: “[имя] -> [действие]”.
//
//– опиши эти классы, используя полиморфизм;
//– создай по одному объекту животного, сохрани их в список с принудительным указанием типа списка;
//– в цикле вызывай метод приема пищи для каждого экземпляра.

fun main() {
    val animals: List<Animal> = listOf(Fox("Лиса"), Dog("Пес"), Cat("Кит"))
    animals.forEach { it.eat() }

}

abstract class Animal(open val name: String) {
    abstract fun eat()
    open fun sleep() {
        println("$name -> спит")
    }
}

class Fox(override val name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(override val name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(override val name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

