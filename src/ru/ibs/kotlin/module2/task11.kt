package ru.ibs.kotlin.module2

//Напишите программу, в которой будет храниться информация по рабочим местам
//(при запуске программа создает несколько  записей).
//Используйте коллекцию map для хранения информации. Номера рабочих мест это ключи коллекции,
//а значение — это ФИО сотрудника, занимающего данное место. Добавьте несколько сотрудников в коллекцию
//и добавьте возможность для пользователя узнать кто занимает рабочее месте по его номеру

private var workers: MutableMap<Long, String> = mutableMapOf(
    Pair(12345, "Белов Александр Николаевич"),
    Pair(23456, "Холмогоров Космос Юрьевич"),
)

fun task11() {
    workers[34567] = "Пчелкин Виктор Павлович"
    workers[45678] = "Филатов Валерий Константинович"

    while (true) {
        when(selectOption()) {
            "1" -> addWorker()
            "2" -> findWorker()
            "3" -> {
                quit()
                return
            }
            else -> println("Неверный пункт меню! Попробуйте еще раз.")
        }
    }
}

private fun selectOption() : String {
    println("""Выберите пункт меню:
        |   1. Добавить сотрудника.
        |   2. Найти сотрудника.
        |   3. Выход""".trimMargin())
    return readLine().toString()
}

private fun findWorker() {
    println("Введите номер рабочего места:")
    val number = readLine().toString()
    if (number.isBlank())
        println("Недопустимы номер рабочего места!")
    else {
        val worker = workers[number.toLong()]
        if (worker != null)
            println("ФИО сотрудника: $worker")
        else
            println("Сотрудник не найден!")
    }
}

private fun addWorker() {
    println("Введите номер рабочего места:")
    val number = readLine().toString()
    if (number.isBlank())
        println("Недопустимы номер рабочего места!")

    println("Введите ФИО сотрудника:")
    val name = readLine().toString()
    if (name.isNotBlank())
        workers[number.toLong()] = name
    else {
        println("Невозможно добавить сотрудника без ФИО!")
        return
    }
}

private fun quit() {
    workers.clear()
    println("Выход из программы")
}