package ru.youngstanis.kotlinbasics.conditions

const val AGE_OF_MAJORITY = 18

fun main(args: Array<String>) {

    val userAge = readLine()!!.toInt()

    if(userAge >= AGE_OF_MAJORITY) {
        println("����� �������� ������� �����")
    }
    else {
        println("��������� �� ������� �����")
    }

}