package ru.ibs.kotlin.module3


fun task13() {
    assert(count("Иванов", "Петров", "Сидоров") == 3)
    assert(count("Иванов", "Петров", "Сидоров", "Попов") == 4)
}

private fun count(vararg names: String) : Int {
    return names.count()
}