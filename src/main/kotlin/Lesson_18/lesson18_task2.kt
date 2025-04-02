package org.example.Lesson_18

//Задача 2 к Уроку 18
//
//В игре используются типы игральных костей с разным количеством граней: 4, 6 и 8.
//
//Опиши их иерархию, создав по классу на каждый тип. У каждой кости должен быть метод, бросающий кость и печатающий значение в консоль.
//
//Для демонстрации полиморфизма “включения”:
//
//- создай несколько объектов с разными гранями;
//- собери из них список объектов, указав тип списка;
//- выполни итерацию по списку и вызови у каждого объекта метод броска кости.

fun main(){
    val listOfDice:List<Dice> = listOf(DiceFacet4(),DiceFacet6(),DiceFacet8())
    listOfDice.forEach{it.rollDice()}
}

interface Dice {
    val numberOfFacet: Int
    fun rollDice()
}

class DiceFacet4: Dice {
    override val numberOfFacet: Int = 4
    override fun rollDice() {
        val range = 1..numberOfFacet
        println(range.random())
    }
}

class DiceFacet6: Dice {
    override val numberOfFacet: Int = 6
    override fun rollDice() {
        val range = 1..numberOfFacet
        println(range.random())
    }
}

class DiceFacet8: Dice {
    override val numberOfFacet: Int = 8
    override fun rollDice() {
        val range = 1..numberOfFacet
        println(range.random())
    }
}