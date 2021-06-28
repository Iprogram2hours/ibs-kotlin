package ru.ibs.kotlin.module3

fun task15() {
    val printArray = {array: Array<String> ->
        for (str in array) {
            println(str)
        }
    }

    printArray(arrayOf("Один", "Два", "Три", "Четыре"))
    printArray(arrayOf("Пять", "Шесть", "Семь", "Восемь"))
}