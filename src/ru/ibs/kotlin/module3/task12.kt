package ru.ibs.kotlin.module3

fun task12() {
    assert(isLeapYear(2000))
    assert(!isLeapYear(2100))
    assert(isLeapYear(2004))
}

private fun isLeapYear(year : Long) : Boolean {
    return year % 4 == 0L && (year % 100 != 0L || year % 400 == 0L)
}