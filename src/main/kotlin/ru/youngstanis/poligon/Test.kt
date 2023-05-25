package ru.youngstanis.poligon

import java.io.IOException

fun main(args: Array<String>) {
    // stringContainsTest()
    // exceptionsFromRules()
    testHashSet()
    // val arrList = arrayListOf(8, 4, 1, 6, 15, 3)
    // quickSort(arrList, 0, arrList.size - 1)
    // println(arrList)
}


fun stringContainsTest() {
    val stringList = listOf(
        "eccm/folder1/folder2/folder3",
        "eccm/folder1//folder3",
        "eccm///folder3",
        "",
        "/folder/test",
        "//test",
        "///test",
        "eccm/folder/test///help",
        "eccm/test1/test1/",
        "/////////",
        "//",
        "/"
    )

    val regex = "^eccm/\\w+(/\\w+)*/$".toRegex()

    stringList.forEach { elem ->
        println(elem + " - > " + elem.contains(regex))
    }
}

fun exceptionsFromRules() {
    val stringList = listOf(
        "eccm/test/",
        "eccm/folder/test/",
        "eccm/folder1/folder2/folder3",
        "eccm/folder1//folder3",
        "eccm/folder/test///help",
        "eccm/test1/test1/"
    )

    val regex = "^eccm/\\w+(/\\w+)*/$".toRegex()

    stringList.forEach { elem ->
        println(elem + " - > " + elem.contains(regex))
    }
}

fun testHashSet() {
    val set = setOf("CPU Utilization 5 Min", "CPU Utilization 5 Sec", "CPU Utilization 1 Min")
    val setSize = set.size

    // space complexity O(n)

    val secList = ArrayList<String>()
    val minList = ArrayList<String>()
    val hourList = ArrayList<String>()

    // time complexity O(n)

    for(line in set) {
        val splitLine = line.split(" ")
        when (splitLine[splitLine.size - 1]) {
            "Sec" -> secList.add(line)
            "Min" -> minList.add(line)
            "Hour" -> hourList.add(line)
            else -> throw IOException("Incorrect the unit of time")
        }
    }

    quickSort(secList, 0, secList.size - 1)
    quickSort(minList, 0, minList.size - 1)
    quickSort(hourList, 0, hourList.size - 1)

    val result = linkedSetOf<String>()

    result.addAll(secList)
    result.addAll(minList)
    result.addAll(hourList)

    println(result)
}

fun quickSort(arr: ArrayList<String>?, left: Int, right: Int) {

    if(arr == null || left >= right || arr.size < 2) {
        return
    }

    var i = left
    var j = right
    val middleIndex = i + (j - i) / 2
    var splitLine = arr[middleIndex].split(" ")
    val middleElemTime = Integer.parseInt(splitLine[splitLine.size - 2])

    while (i <= j) {
        splitLine = arr[i].split(" ")
        while (Integer.parseInt(splitLine[splitLine.size - 2]) < middleElemTime) {
            i += 1
        }
        splitLine = arr[j].split(" ")
        while (Integer.parseInt(splitLine[splitLine.size - 2]) > middleElemTime) {
            j -= 1
        }

        if(i <= j) {
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
            i++
            j--
        }
    }

    if(left < j) {
        quickSort(arr, left, j)
    }
    if(right > i) {
        quickSort(arr, i, right)
    }
}