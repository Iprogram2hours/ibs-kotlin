package ru.ibs.kotlin.module4

class Boeing747(_number:String, _tankCapacity:Long, _maxFlightRange:Double, override var passengerCapacity: Int)
    : Aircraft(_number, _tankCapacity, _maxFlightRange), Passenger {

}