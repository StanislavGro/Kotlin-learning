package ru.youngstanis.kotlinbasics.arithmetic

fun main(args: Array<String>) {

    println("Lesson 2 Arithmetic Operation ")

    val a = 5
    val b = 7

    println(a + b)

    val sum = a * b

    println(sum)

    // А тут уже ошибка!
    // val c
    val c:Int

    val intNum1 = 10
    val intNum2 = 3

    println(intNum1 / intNum2)

    val floatNum1 = 10.0f
    val floatNum2 = 3f

    println(floatNum1 / floatNum2)

    val doubleNum1 = 10.0
    val doubleNum2 = 3.0

    println(doubleNum1 / doubleNum2)

    println(intNum1 % intNum2)
    // println(doubleNum1 % doubleNum2)

    // Получается тип флоат
    val d = intNum1 + floatNum1

    println(d)

    // Получается тип дабл
    val f = intNum2 + floatNum2 + doubleNum2

    println(f)

    println(d::class)
    println(d::class.simpleName)

    println(f::class)
    println(f::class.simpleName)

    var counter = 0

    counter++
    counter = counter + 1
    counter += 1

    println(counter)

    counter--
    counter -= 1
    counter = counter - 1

    println(counter)

    ++counter
    --counter


    println(doubleNum1 / intNum2)

    // Логические операторы как в java
}