package ru.ibs.kotlin.module4

abstract class Aircraft(_number:String, _tankCapacity:Long, _maxFlightRange:Double) {

    protected var number:String = _number
    protected var tankCapacity:Long = _tankCapacity
    protected var maxFlightRange:Double = _maxFlightRange
    protected val fuelConsumption:Double
        get() = maxFlightRange/tankCapacity

    open fun info() {
        println("Number: $number; tankCapacity: $tankCapacity; maxFlightRange: $maxFlightRange; fuelConsumption: $fuelConsumption")
    }
}