package ru.ibs.kotlin.module4

class An124(_number:String, _tankCapacity:Long, _maxFlightRange:Double, override var carryingCapacity: Int)
    : Aircraft(_number, _tankCapacity, _maxFlightRange), Cargo {

    override fun info() {
        println("Number: $number; tankCapacity: $tankCapacity; maxFlightRange: " +
                "$maxFlightRange; fuelConsumption: $fuelConsumption; carryingCapacity: $carryingCapacity")
    }
}