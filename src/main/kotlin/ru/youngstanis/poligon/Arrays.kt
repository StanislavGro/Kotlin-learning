package ru.youngstanis.poligon

fun main() {
    val arr = Array<Any>(5) { i -> i * i}

    val intArr: IntArray = intArrayOf(1, 2, 3)
    intArr.forEach { print("$it ") }

    println()

    val arr2 = IntArray(5)
    arr2.forEach { print("$it ") }

    println()

    val arr3 = ByteArray(4) { 127 }

    arr3.forEach { print("$it ") }

    println()

    val arr4 = DoubleArray(7) { (it * 1).toDouble() } //безопасно, либо null либо NumberFormatEx

    arr4.forEach { print("$it ") }

    // val arr5 = DoubleArray(7) { (it * 1) as Double } //небезопасно, в случае чего ClassCastEx

}
