package com.rsschool.quiz.data

// only for this app, don't blame
object QuizGame {
    val questionsList = listOf(
        Question(
            id = 1,
            question = "Какой норматив не сдается в школе",
            answers = arrayListOf(
                "Опорный прыжок через козла",
                "Лазание по канату",
                "Бег с препятствиями",
                "Челночный бег",
                "Подтягивание на перекладине"
            ),
            rightAnswer = "Бег с препятствиями",
            userChoice = ""
        ),
        Question(
            id = 2,
            question = "Что произойдет, если смешать сульфат меди и гидроксид натрия?",
            answers = arrayListOf(
                "Жидкость приобретает зеленый цвет",
                "Произойдет выделение газа",
                "Выпадет осадок синего цвета",
                "Жидкость приобретает жёлтый цвет",
                "Выпадет осадок красного цвета"
            ),
            rightAnswer = "Выпадет осадок синего цвета",
            userChoice = ""
        ),
        Question(
            id = 3,
            question = "Прямая, которая делит угол пополам, проходя через его вершину называется…",
            answers = arrayListOf(
                "Гипотенуза",
                "Медиана",
                "Биссектриса",
                "Чевиана",
                "Симедиана"
            ),
            rightAnswer = "Биссектриса",
            userChoice = ""
        ),
        Question(
            id = 4,
            question = "На планете Земля есть … материков?",
            answers = arrayListOf(
                "6",
                "5",
                "7",
                "4",
                "8"
            ),
            rightAnswer = "6",
            userChoice = ""
        ),
        Question(
            id = 5,
            question = "У древних греков — Афина, а у древних римлян — …?",
            answers = arrayListOf(
                "Минерва",
                "Венера",
                "Юнона",
                "Деметра",
                "Веста"
            ),
            rightAnswer = "Минерва",
            userChoice = ""
        ),
    )

    fun calcResult(): Int {
        val step = 100 / questionsList.size
        return questionsList.fold(0) { acc, question ->
            if (question.userChoice == question.rightAnswer) acc + step else acc
        }
    }
}