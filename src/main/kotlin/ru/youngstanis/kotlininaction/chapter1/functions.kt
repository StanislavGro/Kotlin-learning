package ru.youngstanis.kotlininaction.chapter1

fun main() {
    println(max(15, 6))
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}