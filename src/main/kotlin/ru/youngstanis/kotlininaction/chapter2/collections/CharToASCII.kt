package ru.youngstanis.kotlininaction.chapter2.collections

import java.util.TreeMap

fun main() {
    val treeSet = TreeMap<Char, String>()
    for(c in 'A'..'F') {
        val binChar = Integer.toBinaryString(c.code)
        treeSet[c] = binChar
    }

    for((letter, binary) in treeSet) {
        println("$letter = $binary")
    }
}