package ru.youngstanis.patterns

import java.io.IOException
import java.lang.Error

class Space private constructor(
    val name: String = "Milky Way",
    val age: Int? = null,
    val length: Int? = null,
    val starsNumber: Int? = null
) {

    data class Builder(
        var name: String = "",
        var age: Int? = null,
        var length: Int? = null,
        var starsNumber: Int? = null
    ) {

        fun name(name: String) = apply { this.name = name }
        fun age(age: Int) = apply { this.age = age }
        fun length(length: Int?) = apply { this.length = length }
        fun starsNumber(starsNumber: Int?) = apply { this.starsNumber = starsNumber }
        fun build() = Space(
            name = name,
            age = age,
            length = length,
            starsNumber = starsNumber
        )
    }

    override fun toString(): String {
        return "Space(name='$name', age=$age, length=$length, starsNumber=$starsNumber)"
    }
}

fun main() {

    val space = Space.Builder()
        .name("fbdf")
        .length(46464)
        .age(7456456)
        .starsNumber(78768)
        .build()

    println(space)

    val betterSpace = BetterSpace(
        age = 5456,
        length = 788787,
        starsNumber = 9999
    )

    println(betterSpace)
}

/**
 * Это лучше, чем паттерн билдер, потому что в билдере можно случайно заменить поле его же функцией
 * Нет много шаблонного кода
 */
data class BetterSpace(
    val name: String = "",
    val age: Int? = null,
    val length: Int? = null,
    val starsNumber: Int? = null
) {

    init {
        require(name.isNotBlank()) {
            throw IOException("Name cannot be blank")
        }
    }

    companion object {
        fun random() = BetterSpace (
            name = "Ex1",
            age = 4254,
            length = 5778,
            starsNumber = 454
        )
    }
}