package ru.ibs.kotlin.module3

import ru.ibs.kotlin.module2.round

fun task16() {
    testSqrt(1.0, 0,1.0)
    testSqrt(0.015625, 3,0.125)
    testSqrt(15625.0, 0,125.0)
    testSqrt(12321.0, 0,111.0)
    testSqrt(0.9801, 2,0.99)
}

private fun testSqrt(x: Double, accuracy: Int, test: Double) {
    val res = sqrt(x)
    println("res: $res, rounded: ${round(res, accuracy)}, comparing: ${test == res}")
}

private fun sqrt(x: Double): Double {
    if (x == 0.0 || x == 1.0)
        return x

    var start = 0.0
    var end = if (x < 1.0) 1.0 else x
    while (start <= end) {
        val mid = start + (end - start) / 2.0
        when {
            mid == x / mid -> return mid
            mid < x / mid -> start = mid
            else -> end = mid
        }
    }
    return start
}
