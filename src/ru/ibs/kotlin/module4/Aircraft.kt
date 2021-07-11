package ru.ibs.kotlin.module4

abstract class Aircraft(_number:String, _tankCapacity:Long, _maxFlightRange:Double) {

    var number:String = _number
    var tankCapacity:Long = _tankCapacity
    var maxFlightRange:Double = _maxFlightRange
    val fuelConsumption:Double
        get() = maxFlightRange/tankCapacity
}