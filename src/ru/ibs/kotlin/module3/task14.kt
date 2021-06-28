package ru.ibs.kotlin.module3

fun task14() {
    printPerformer("Нечаев Андрей Олегович", "старший системный инженер")
    printPerformer("Нечаев Андрей Олегович", 25, "старший системный инженер")
    printPerformer("Нечаев Андрей Олегович", "не женат", "старший системный инженер")
    printPerformer("Нечаев Андрей Олегович", 25, "не женат", "старший системный инженер")
}

private fun printPerformer(fullName: String, position: String) {
    println("Сотрудник: $fullName, должность: $position")
}

private fun printPerformer(fullName: String, age: Int, position: String) {
    println("Сотрудник: $fullName, возраст (лет): $age, должность: $position")
}

private fun printPerformer(fullName: String, maritalStatus: String, position: String) {
    println("Сотрудник: $fullName, семейное положение: $maritalStatus, должность: $position")
}

private fun printPerformer(fullName: String, age: Int, maritalStatus: String, position: String) {
    println("Сотрудник: $fullName, возраст: $age семейное положение: $maritalStatus, должность: $position")
}