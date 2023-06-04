package ru.youngstanis.kotlininaction.chapter3

val StringBuilder.lastChar: Char
    get() = get(length - 1)

fun StringBuilder.lastChar() = get(length - 1)

val String.lastChar: Char
    get() = get(length - 1)

fun main(args: Array<String>) {
    println(StringBuilder("Kotlin").lastChar)
    println(StringBuilder("Kotlin").lastChar())
    println("Start".lastChar)
}
