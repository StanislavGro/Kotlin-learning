package ru.youngstanis.kotlininaction.chapter2

import ru.youngstanis.kotlininaction.chapter2.geometry.*

fun main() {
    println(max(15, 6))
    val rectangle = Rectangle(500, 435)
    println(rectangle.isSquare)
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}