package ru.ibs.kotlin.module2

fun task9() {
    var countryTable: Array<Array<String>> = Array(3) { Array(3) { "" } }
    countryTable[0] = arrayOf("Россия", "Великобритания", "США", "Мексика")
    countryTable[1] = arrayOf("Москва", "Лондон", "Вашингтон", "Мехико")
    countryTable[2] = arrayOf("Российский рубль", "Фунт Стерлинга", "Доллар", "Песо")

    assert(countryTable[0].size == countryTable[1].size && countryTable[0].size == countryTable[2].size)

    for(column in 0 until countryTable[0].size) {
        for(row in 0 until countryTable.size) {
            print("\t${countryTable[row][column]}")
        }
        println()
    }

}