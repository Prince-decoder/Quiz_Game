package com.ashu.quiz_game.Repository

import com.ashu.quiz_game.Model.Options
import com.ashu.quiz_game.Model.Question
import com.ashu.quiz_game.R

class Questions_Repository {
    private var Questions = mutableListOf<Question>()
    init {
        val q1 = Question(1, Q = "Which Country flag is this?", Image = R.drawable.ic_flag_of_argentina, option = Options(
            op1 = "Argentina",
            op2 = "Uruguay",
            op3 = "Chile",
            op4 = "Colombia"
        ), correct = 1)
        Questions.add(q1)

        val q2 = Question(2, Q = "Which Country flag is this?", Image = R.drawable.ic_flag_of_fiji, option = Options(
            op1 = "Tuvalu",
            op2 = "Fiji",
            op3 = "Vanuatu",
            op4 = "Samoa"
        ), correct = 2)
        Questions.add(q2)

        val q3 = Question(3, Q = "Which Country flag is this?", Image = R.drawable.ic_flag_of_india, option = Options(
            op1 = "Pakistan",
            op2 = "Bangladesh",
            op3 = "India",
            op4 = "Sri Lanka"
        ), correct = 3)
        Questions.add(q3)

        val q4 = Question(4, Q = "Which Country flag is this?", Image = R.drawable.ic_flag_of_brazil, option = Options(
            op1 = "Portugal",
            op2 = "Mexico",
            op3 = "Spain",
            op4 = "Brazil"
        ), correct = 4)
        Questions.add(q4)

        val q5 = Question(5, Q = "Which Country flag is this?", Image = R.drawable.ic_flag_of_australia, option = Options(
            op1 = "New Zealand",
            op2 = "United Kingdom",
            op3 = "Australia",
            op4 = "United States"
        ), correct = 3)
        Questions.add(q5)

        val q6 = Question(6, Q = "Which Country flag is this?", Image = R.drawable.ic_flag_of_belgium, option = Options(
            op1 = "Germany",
            op2 = "France",
            op3 = "Netherlands",
            op4 = "Belgium"
        ), correct = 4)
        Questions.add(q6)

        val q7 = Question(7, Q = "Which Country flag is this?", Image = R.drawable.ic_flag_of_denmark, option = Options(
            op1 = "Denmark",
            op2 = "Sweden",
            op3 = "Norway",
            op4 = "Finland"
        ), correct = 1)
        Questions.add(q7)

        val q8 = Question(8, Q = "Which Country flag is this?", Image = R.drawable.ic_flag_of_germany, option = Options(
            op1 = "Austria",
            op2 = "Germany",
            op3 = "Poland",
            op4 = "Switzerland"
        ), correct = 2)
        Questions.add(q8)

        val q9 = Question(9, Q = "Which Country flag is this?", Image = R.drawable.ic_flag_of_new_zealand, option = Options(
            op1 = "Australia",
            op2 = "United Kingdom",
            op3 = "Fiji",
            op4 = "New Zealand"
        ), correct = 4)
        Questions.add(q9)

        val q10 = Question(10, Q = "Which Country flag is this?", Image = R.drawable.ic_flag_of_kuwait, option = Options(
            op1 = "United Arab Emirates",
            op2 = "Qatar",
            op3 = "Kuwait",
            op4 = "Oman"
        ), correct = 3)
        Questions.add(q10)
    }

    fun getQuestions(): List<Question> {
        return Questions
    }
}