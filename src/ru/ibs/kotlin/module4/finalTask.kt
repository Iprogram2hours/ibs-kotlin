package ru.ibs.kotlin.module4

fun finalTask(aircraftList:List<Aircraft>) {
    while (true) {
        when(selectOption()) {
            "1" -> findCargo(aircraftList)
            "2" -> findPassenger(aircraftList)
            "3" -> findDefaultAircraft(aircraftList)
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
        |   1. Просмотр грузовых самолетов.
        |   2. Просмотр пассажирских самолетов.
        |   3. Просмотр непассажирских и негрузовых самолетов.
        |   4. Выход""".trimMargin())
    return readLine().toString()
}

private fun findCargo(aircraftList:List<Aircraft>) {
    aircraftList
        .filter { el:Aircraft -> el is Cargo }
        .forEach(Aircraft::info)
}

private fun findPassenger(aircraftList:List<Aircraft>) {
    aircraftList
        .filter { el:Aircraft -> el is Passenger }
        .forEach(Aircraft::info)
}

private fun findDefaultAircraft(aircraftList:List<Aircraft>) {
    aircraftList
        .filter { el:Aircraft -> el !is Passenger && el !is Cargo }
        .forEach(Aircraft::info)
}

private fun quit() {
    println("Выход из программы")
}

