package ru.ibs.kotlin.module3

fun task16() {
    assert(sqrt(1.0) == 1.0)
    assert(sqrt(0.015625) == 0.125)
    assert(sqrt(15625.0) == 125.0)
    assert(sqrt(12321.0) == 111.0)
    assert(sqrt(0.9801) == 0.99)
    assert(sqrt(0.0001) == 0.01)
    assert(sqrt(0.000001) == 0.001)
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
