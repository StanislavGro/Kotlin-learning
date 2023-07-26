package ru.youngstanis.poligon

import org.joda.time.DateTime
import org.joda.time.DateTimeZone

fun main() {
    val dateTimeZone = DateTimeZone.UTC
    println(dateTimeZone)
    println(dateTimeZone.toTimeZone().toZoneId().rules)
    println()

    val nskTimeToUTC = DateTime(2023, 7, 20, 12, 34, 0, DateTimeZone.getDefault())
    println(nskTimeToUTC.withZone(dateTimeZone))
}
