package ru.youngstanis.testpoligon

fun main(args: Array<String>) {
    stringContainsTest()
    exceptionsFromRules()
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

    stringList.forEach {elem ->
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

    stringList.forEach {elem ->
        println(elem + " - > " + elem.contains(regex))
    }
}