package ru.youngstanis.kotlininaction.chapter2.enums

import ru.youngstanis.kotlininaction.chapter2.enums.ColorEnum.BLUE
import ru.youngstanis.kotlininaction.chapter2.enums.ColorEnum.GREEN
import ru.youngstanis.kotlininaction.chapter2.enums.ColorEnum.INDIGO
import ru.youngstanis.kotlininaction.chapter2.enums.ColorEnum.ORANGE
import ru.youngstanis.kotlininaction.chapter2.enums.ColorEnum.RED
import ru.youngstanis.kotlininaction.chapter2.enums.ColorEnum.VIOLET
import ru.youngstanis.kotlininaction.chapter2.enums.ColorEnum.YELLOW

fun main(args: Array<String>) {
    println(ColorEnum.BLUE.rgb())
    println(getMnemonic(ColorEnum.VIOLET))
    println(getWarmth(ColorEnum.ORANGE))
    println(mix(YELLOW, RED))
    println(optimizedMix(BLUE, VIOLET))
    // println(optimizedMix(BLUE, BLUE))
}

fun getMnemonic(color: ColorEnum) =
    when (color) {
        ColorEnum.RED -> "������"
        ColorEnum.ORANGE -> "�������"
        ColorEnum.YELLOW -> "������"
        ColorEnum.GREEN -> "�����"
        ColorEnum.BLUE -> "���"
        ColorEnum.INDIGO -> "�����"
        ColorEnum.VIOLET -> "�����"
    }

fun getWarmth(color: ColorEnum) =
    when (color) {
        RED, ORANGE, YELLOW -> "������"
        GREEN -> "�����������"
        BLUE, INDIGO, VIOLET -> "��������"
    }

// ���������� ������������� ���
fun mix(c1: ColorEnum, c2: ColorEnum) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("������� ����")
    }

// ����������� ����������
fun optimizedMix(c1: ColorEnum, c2: ColorEnum) =
    when {
        (c1 == RED && c2 == YELLOW ) || (c1 == YELLOW && c2 == RED) -> ORANGE
        (c1 == YELLOW && c2 == BLUE ) || (c1 == BLUE && c2 == YELLOW) -> GREEN
        (c1 == BLUE && c2 == VIOLET ) || (c1 == VIOLET && c2 == BLUE) -> INDIGO
        else -> throw Exception("Dirty color")
    }