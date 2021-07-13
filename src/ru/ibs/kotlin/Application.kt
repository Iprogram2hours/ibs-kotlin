package ru.ibs.kotlin

import ru.ibs.kotlin.module1.module1
import ru.ibs.kotlin.module2.module2
import ru.ibs.kotlin.module3.module3
import ru.ibs.kotlin.module4.*


fun main(args: Array<String>) {
    module1()
    module2()
    module3()
    module4()

    val aircraftList: List<Aircraft> = arrayListOf(
        Boeing747("Boeing-747", 1000, 1000.0, 250),
        An124("АН-124", 2000, 1000.0, 140),
        MiG35("МиГ-35", 500, 2000.0),
        Boeing747("Boeing-737", 1000, 1000.0, 250),
        An124("АН-136", 2000, 1000.0, 140),
        MiG35("F-35", 500, 2000.0)
    )
    finalTask(aircraftList)
}