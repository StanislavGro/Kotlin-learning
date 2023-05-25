package ru.youngstanis.kotlininaction.chapter2.diapasone

fun main() {
    println(isLetter('F'))
    println(isLetter('5'))
    println(isNotDigit('d'))
    println(isNotDigit('1'))

    println(universalWay('d'))
    println(universalWay('5'))
}

fun isLetter(letter: Char) = letter in 'a'..'z' || letter in 'A'..'Z'
fun isNotDigit(letter: Char) = letter !in '0'..'9'

fun universalWay(letter: Char) =
    when(letter) {
        in 'a'..'z', in 'A'..'Z' -> "This is a character"
        in '0'..'9' -> "This is a digit"
        else -> "I don't know what is it"
    }