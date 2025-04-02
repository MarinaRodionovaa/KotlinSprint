package org.example.Lesson_16

fun main() {

    val gamer = Gamer("Bob")
    val gamer1 = Gamer("Rick")

    gamer.getDamage(gamer1)
    gamer1.getDamage(gamer)
    gamer1.getDamage(gamer)
    gamer1.getDamage(gamer)
    gamer1.getHeal()
    gamer1.getDamage(gamer)
    gamer1.getHeal()

}

class Gamer(val name: String) {
    private var health = 100
    private var impactForce = 30
    private var isDead = false

    fun getDamage(gamer: Gamer) {
        if (!isDead) {
            health -= gamer.impactForce
            println("${gamer.name} -> ${this.name}")
            println("$name  получил урон $impactForce")
            if (health <= 0) {
                getDeath()
            } else {
                println("${this.name} Здоровье: $health\n")
            }
        } else {
            println("$name  уже мертв")
        }
    }

    fun getHeal() {
        if (!isDead) {
            health += 10
            println("$name  получил лечение \n$name Здоровье: $health\n")
        } else {
            println("$name мертв, лечение не доступно")
        }

    }

    private fun getDeath() {
        health = 0
        impactForce = 0
        isDead = true
        println("$name мертв x.x")
    }

}