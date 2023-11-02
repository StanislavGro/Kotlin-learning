package ru.youngstanis.kotlininaction.chapter5

import ru.youngstanis.kotlininaction.chapter3.args.joinToString

fun main() {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(7, 33))
    println()

    // { println(70 / 7) } ()
    run { println(70 / 7) }
    println()

    val ages = listOf(47, 2, 16, 85, 64, 99, 12, 18)
    println(ages.maxBy({it}))
    println()

    // Можем вынести за скобки если просле ничего нет
    println(ages.maxBy(){it})
    println()

    // Или даже просто убрать если это один аргумент,
    // а если несколько то через запятую в аргументах функции пишем ЛВ
    println(ages.maxBy{it})
    println()

    println(ages.joinToString(
        separator = " ",
        transform = { age -> (age * 2).toString()}
    ))
    println()

    println(ages.joinToString(" ") { age -> (age * 2).toString() })
    println()

    val maxLambda = { num:Int -> num }
    println(ages.maxBy(maxLambda))
    println()

    val sumLambda = {a: Int, b: Int ->
        println("Computing the sum of $a and $b...")
        a + b
    }
    println(sumLambda(15, 37))
}

// fun <E> List<E>.joinToString() {
// }
