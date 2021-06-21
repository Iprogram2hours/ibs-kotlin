package ru.ibs.kotlin.module2

private var result = 0

fun task7() {
    val question1 = """Выберите единственный фильм на иностранном языке, получивший Оскар за лучший фильм
        |   1. Война и мир (1965)
        |   2. Крадущийся тигр, затаившийся дракон (2000)
        |   3. Миллионер из трущоб (2009)
        |   4. Паразиты (2019)""".trimMargin()
    val question2 = """Выберите режиссера, которго по праву можно назвать основоположником жанра триллер в кино
        |   1. Стэнли Кубрик
        |   2. Кристофер Нолан
        |   3. Альфред Хичкок
        |   4. Дэвид Линч""".trimMargin()
    val question3 = """Выберите фильм, в котором звучала знаменитая цитата "Я мзду не беру, мне за державу обидно!"
        |   1. Бриллиантовая рука (1969)
        |   2. Белое солнце пустыни (1970)
        |   3. Сталкер (1979)
        |   4. Курьер (1986)""".trimMargin()
    val question4 = """Выберите фильм, в котором не играл Генри Фонда"
        |   1. Молодой мистер Линкольн (1939) 
        |   2. Касабланка (1942)
        |   3. Война и мир (1956)
        |   4. 12 разгневанных мужчин (1957)""".trimMargin()
    val question5 = """Выберите фильм, который не был срежиссирован Квентином Тарантино"
        |   1. Бешеные псы (1992)
        |   2. Криминальное чтиво (1994) 
        |   3. От заката до рассвета (1996)
        |   4. Джеки Браун (1997)""".trimMargin()

    askQuestion(question1, 4)
    askQuestion(question2, 3)
    askQuestion(question3, 2)
    askQuestion(question4, 2)
    askQuestion(question5, 3)

    val responseTemplate = "Правильных ответов: $result."
    when (result) {
        0 -> println("$responseTemplate Все ответы в молоко!")
        1 -> println("$responseTemplate Раз в год и палка стреляет!")
        2 -> println("$responseTemplate Неудовлетворительно. Смотрите больше фильмов!")
        3 -> println("$responseTemplate Ваши знания кино на удовлетворительно!")
        4 -> println("$responseTemplate У Вас хорошие знания кино!")
        5 -> println("$responseTemplate Вы отлично разбираетесь в кино!")
    }
    result = 0
}

private fun askQuestion(question: String, rightAnswer: Int) {
    println(question)
    val answer = readLine()
    if (answer.toString().toInt() == rightAnswer)
        result++
}