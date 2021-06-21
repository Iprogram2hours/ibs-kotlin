package ru.ibs.kotlin.module2

fun task8() {
    println("Введите начальную сумму вклада:")
    val depositAmount = readLine().toString().toDouble()

    println("Введите длительность вкладов (в месяцах):")
    val duration = readLine().toString().toInt()

    println("Введите ежемесячный процент по вкладу:")
    val monthPercent = readLine().toString().toDouble()

    var totalAmount = depositAmount;
    var monthIncome: Double
    for (i in 1..duration) {
        monthIncome = totalAmount * (monthPercent / 100.0)
        totalAmount += monthIncome
        println("Месяц: $i. " +
                "Общая сумма на вкладе: ${round(totalAmount, 2)}. " +
                "Доход за месяц: ${round(monthIncome, 2)}")
    }
}

private fun round(number: Double, scale: Int): Double {
    var pow = 10
    for (i in 1 until scale) pow *= 10
    val tmp = number * pow
    return ((if (tmp - tmp.toInt() >= 0.5) tmp + 1 else tmp).toInt()).toDouble() / pow
}