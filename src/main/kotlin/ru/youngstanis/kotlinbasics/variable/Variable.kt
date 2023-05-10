package ru.youngstanis.kotlinbasics.variable

fun main(args:Array<String>) {
    println("*Variable*")

    val numberOFOrders: Int = 42

    var notificationText: String = "Небольшое уведомление!!"

    println(numberOFOrders)
    // println(notificationText)

    notificationText = "Другое уведомление"

    println(notificationText)

    // Целочисленные переменные
    val intNum1: Int = -2147483648 // 32 bit or 4 byte
    val intNum2: Int = 2147483647
    val longNum: Long // 64 bit or 8 byte
    val shortNum: Short // 16 bit or 2 byte
    val byteNum: Byte // 8 bit or 1 byte
    val unsignedNum: UInt = 214748684u // 32 bit or 4 byte

    // Вещественные числа
    val doubleNum: Double = 234.54 // 64 bit or 8 byte
    val floatNum: Float = 478465.4f // 32 bit or 4 byte

    // Строковые числа
    val stringValue: String = "Это было давно, касту еще не знали даже в пределах Ростова..."
    val charValue: Char = '1'

    // Логические числа
    val trueValue: Boolean = true
    val falseValue: Boolean = false
}