package ru.youngstanis.searchs

import java.io.IOException

// TODO реализовать паттерн фабрику + сюда ее добавить
// добавить рекурсивную реализацию
// https://habr.com/ru/articles/421873/
// Сделать сортировку пузырьком

fun binarySearch(target: Int, vararg arr: Int): Int {
    if (!isSorted(*arr)) {
        throw IOException("Массив ${arr.contentToString()} не отсортирован!")
    } else {
        return nonRecSearch(target, *arr)
    }
}

private fun isSorted(vararg arr: Int): Boolean {
    for (i in 1 until arr.size) {
        if (arr[i] < arr[i - 1]) {
            return false
        }
    }
    return true
}

fun nonRecSearch(target: Int, vararg arr: Int): Int {
    var l = 0
    var r = arr.size - 1

    while (l < r) {
        val middle = l + (r - l) / 2

        if (arr[middle] == target) {
            return middle
        } else if (arr[middle] < target) {
            l = middle + 1
        } else {
            r = middle - 1
        }
    }
    return l
}

fun main() {
    try {
        val arr1 = intArrayOf(3, 4, 5, -9, 8, 3)
        println("Индекс найденного элемента ${binarySearch(target = -9, *arr1)}")
    } catch (e: IOException) {
        println(e.message)
    }

    try {
        val arr2 = intArrayOf(1, 2, 2, 6, 8, 11)
        println("Индекс найденного элемента ${binarySearch(target = 8, *arr2)}")
    } catch (e: IOException) {
        println(e.message)
    }
}
