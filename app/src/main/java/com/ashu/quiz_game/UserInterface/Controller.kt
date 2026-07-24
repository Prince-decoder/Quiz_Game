package com.ashu.quiz_game.UserInterface

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.ashu.quiz_game.ViewModel.QuizViewModel


@Composable
fun Controller(modifier: Modifier, viewModel: QuizViewModel, onFinal:()-> Unit)
{
    val questionsList =viewModel.GetQuestions()
    var i by remember { mutableStateOf(0) }
    var question= questionsList[i]
    QuestionScreen(modifier = modifier,questionsList[i],{
        if(i<questionsList.size-1){
            i++
        }
        else{
            onFinal()
        }
    },)
}