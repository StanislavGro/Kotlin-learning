package ru.youngstanis.kotlininaction.chapter3.args

import java.lang.StringBuilder

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder()
    result.append(prefix)

    for((index, elem) in this.withIndex()) {
        if(index > 0) result.append(separator)
        result.append(elem)
    }

    result.append(postfix)
    return result.toString()
}