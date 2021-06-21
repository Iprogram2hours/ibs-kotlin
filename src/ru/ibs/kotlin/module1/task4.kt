package ru.ibs.kotlin.module1

fun task4() {
    println("Введите имя пользователя и нажмите Enter:")
    val userText: String? = readLine()
    val username = userText.toString()
    println("Добро пожаловать, $username")
}