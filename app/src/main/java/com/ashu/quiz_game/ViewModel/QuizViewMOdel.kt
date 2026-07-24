package com.ashu.quiz_game

import androidx.lifecycle.ViewModel
import com.ashu.quiz_game.Model.Question
import com.ashu.quiz_game.Repository.Questions_Repository

class QuizViewModel: ViewModel() {

    private val repo= Questions_Repository()
    private var correct_ans=0
    fun GetQuestions() : List<Question>
    {
        return repo.getQuestions()
    }

    fun Correct()
    {
        correct_ans++
    }
    fun total_correct(): Int
    {
        return correct_ans
    }
}
