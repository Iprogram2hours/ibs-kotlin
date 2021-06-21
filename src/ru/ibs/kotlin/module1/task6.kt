package ru.ibs.kotlin.module1

fun task6() {
    println("Введите первое число (a):")
    val stringA = readLine()
    println("Введите второе число (b):")
    val stringB = readLine()
    val a = stringA.toString().toDouble()
    val b = stringB.toString().toDouble()
    val comparisonResult = a > b
    println("Comparison result: $comparisonResult")
}