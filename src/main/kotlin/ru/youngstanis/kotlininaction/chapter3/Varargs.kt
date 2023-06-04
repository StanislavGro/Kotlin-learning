package ru.youngstanis.kotlininaction.chapter3

// varargs говорит, что у нас переменное число аргументов, поэтому переменные до него
// можно объявлять, а после - нет
fun varargs(v: String, vararg args: String) {
    println(args)
}

fun main(args: Array<String>) {
    val arr: Array<String> = arrayOf("2", "3")
    varargs("f", *arr, "fb")
}
