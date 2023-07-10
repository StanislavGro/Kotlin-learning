package ru.youngstanis.poligon

import java.util.Random

lateinit var lateVariable: String

fun main(args: Array<String>) {
    val lazyProperty: Int by lazy { getRandomValue() }
    println(lazyProperty)

    lateVariable = "Happy Happy Happy"

    println(lateVariable)
}

fun getRandomValue(): Int {
    val random = Random()
    return random.nextInt(3)
}
