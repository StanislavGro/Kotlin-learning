package ru.youngstanis.kotlininaction.chapter2.sum

fun main(args: Array<String>) {
    println(evalLikeInJava(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalLikeInKotlin(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalDivideExpr(Divide(Num(3), Num(15))))
}

// Именно так мы писали на Java
fun evalLikeInJava(e: Expr): Int {
    if (e is Num) {
        return e.value
    }
    if (e is Sum) {
        return evalLikeInJava(e.left) + evalLikeInJava(e.right)
    }
    throw IllegalArgumentException("Unknown expression")
}

// Теперь напишу это же, но в стиле Kotlin
fun evalLikeInKotlin(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> evalLikeInKotlin(e.left) + evalLikeInKotlin(e.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun evalDivideExpr(e: Expr): Double =
    when (e) {
        is Num -> (e.value).toDouble()
        is Divide -> evalDivideExpr(e.dividend) / evalDivideExpr(e.divider)
        else -> throw IllegalArgumentException("Unknown expression")
    }