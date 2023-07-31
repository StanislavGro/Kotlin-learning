package ru.youngstanis.poligon

import java.util.Locale

fun main() {
    println(Locale.getAvailableLocales().any{ it.language == "kaz" })

    val aplha2Locale = Locale("kk")
    println(aplha2Locale.displayLanguage)

    val alpha3Locale = Locale("rus")
    println(alpha3Locale.displayLanguage)

    val alpha4Locale = Locale("en-US")
    println(alpha4Locale.displayLanguage)
}
