package ru.ibs.kotlin.module4

class Aircraft {

    var number:String = "Default Number"
    var tankCapacity:Long = 1
    var maxFlightRange:Double = 1.0
    val fuelConsumption:Double
        get() = maxFlightRange/tankCapacity
}