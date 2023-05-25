package ru.youngstanis.kotlininaction.chapter2.collections

fun main() {
    val list = arrayListOf("10", "11", "1001")
    for((index, value) in list.withIndex()) {
        println("$index = $value")
    }
}