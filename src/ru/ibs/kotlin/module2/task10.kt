package ru.ibs.kotlin.module2

private var cities: MutableList<String> = mutableListOf()

fun task10() {
    while (true) {
        when(selectOption()) {
            "1" -> addCity()
            "2" -> printList()
            "3" -> printFilteredList()
            "4" -> {
                quit()
                return
            }
            else -> println("Неверный пункт меню! Попробуйте еще раз.")
        }
    }
}

private fun selectOption() : String {
    println("""Выберите пункт меню:
        |   1. Добавить город.
        |   2. Просмотреть список всех городов.
        |   3. Просмотреть список уникальных городов.
        |   4. Выход""".trimMargin())
    return readLine().toString()
}

private fun addCity() {
    println("Введите название города:")
    val name = readLine().toString().trim()
    if (name.isBlank()) {
        println("Невозможно добавить город без названия")
        return
    } else {
        cities.add(name)
        println("Был добавлен город $name")
    }
}

private fun printList() {
    println("Список всех городов:")
    for (city in cities) {
        println(city)
    }
}

private fun printFilteredList() {
    println("Список уникальных городов:")
    for (city in cities.stream().distinct()) {
        println(city)
    }
}

private fun quit() {
    cities.clear()
    println("Выход из программы")
}