package ru.ibs.kotlin.module4

class Boeing747(_number:String, _tankCapacity:Long, _maxFlightRange:Double, _passengerCapacity:Int)
    : Aircraft(_number, _tankCapacity, _maxFlightRange) {

        var passengerCapacity:Int = _passengerCapacity
}