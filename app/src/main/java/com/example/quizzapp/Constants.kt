package com.example.quizzapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val CORRECT_ANSWERS: String = "0"
    const val TOTAL_QUESTIONS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {

        val questions = ArrayList<Question>()
        val questionOne =
            Question(
                1,
                "What country does this flag belong to?",
                R.drawable.belgium,
                listOf("Belgium", "Argentina", "Brazil", "Jamaica"),
                0
            )
        val questionTwo =
            Question(
                2,
                "What country does this flag belong to?",
                R.drawable.brazil,
                listOf("Brazil", "Argentina", "Cameroon", "Russia"),
                0
            )
        val questionThree =
            Question(
                3,
                "What country does this flag belong to?",
                R.drawable.argentina,
                listOf("Serbia", "Argentina", "Brazil", "Jamaica"),
                1
            )
        val questionFour =
            Question(
                4,
                "What country does this flag belong to?",
                R.drawable.denmark,
                listOf("Belgium", "Denmark", "Brazil", "Mexico"),
                1
            )
        val questionFive =
            Question(
                5,
                "What country does this flag belong to?",
                R.drawable.fiji,
                listOf("Russia", "France", "Netherlands", "Fiji"),
                3
            )
        val questionSix =
            Question(
                6,
                "What country does this flag belong to?",
                R.drawable.australia,
                listOf("Australia", "Kenia", "New Zealand", "Japan"),
                0
            )
        val questionSeven =
            Question(
                7,
                "What country does this flag belong to?",
                R.drawable.germany,
                listOf("USA", "Germany", "China", "Mexico"),
                1
            )
        val questionEight =
            Question(
                8,
                "What country does this flag belong to?",
                R.drawable.india,
                listOf("Russia", "France", "India", "Maldives"),
                2
            )
        val questionNine =
            Question(
                9,
                "What country does this flag belong to?",
                R.drawable.kuwait,
                listOf("Ukraine", "Kuwait", "Belgium", "Japan"),
                1
            )

        val questionTen =
            Question(
                10,
                "What country does this flag belong to?",
                R.drawable.new_zealand,
                listOf("Italy", "Israel", "Kazakhstan", "New Zealand"),
                3
            )
        questions.add(questionOne)
        questions.add(questionTwo)
        questions.add(questionThree)
        questions.add(questionFour)
        questions.add(questionFive)
        questions.add(questionSix)
        questions.add(questionSeven)
        questions.add(questionEight)
        questions.add(questionNine)
        questions.add(questionTen)
        return questions
    }

}