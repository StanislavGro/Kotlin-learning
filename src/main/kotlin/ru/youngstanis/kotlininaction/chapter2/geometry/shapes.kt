package ru.youngstanis.kotlininaction.chapter2.geometry

import java.util.Random

class Rectangle(val width: Int, val height: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(5), random.nextInt(5))
}

fun createRandomRectangle2(): Rectangle = Rectangle(Random().nextInt(), Random().nextInt())