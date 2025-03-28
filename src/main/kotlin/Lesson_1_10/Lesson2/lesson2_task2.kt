package org.example.Lesson_1_10.Lesson2

fun main() {

    val numbersOfEmployers: Int = 50
    val numbersOfIntern: Int = 30

    val usualSalary: Int = 30000
    val internSalary: Int = 20000

    val expenseUsualSalary: Int = usualSalary * numbersOfEmployers
    val expense: Int = usualSalary * numbersOfEmployers + internSalary * numbersOfIntern
    val meanSalary: Int = expense / (numbersOfEmployers + numbersOfIntern)

    println(
        "Расходы на выплату зарплаты постоянных сотрудников: $expenseUsualSalary\n" +
                "Общие расходы по ЗП после прихода стажеров: $expense\n" +
                "Средняя ЗП одного сотрудника после устройства стажеров: $meanSalary"
    )

}