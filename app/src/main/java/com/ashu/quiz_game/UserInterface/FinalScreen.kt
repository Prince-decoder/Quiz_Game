package com.ashu.quiz_game.UserInterface

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.ashu.quiz_game.ViewModel.QuizViewModel

@Composable
fun FinalScreen(modifier: Modifier,name: String,viewModel: QuizViewModel)
{
    Column(modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text("Congratulation", fontSize = 30.sp)
        Text("$name you have completed the quiz")
        Text("Total score ${viewModel.total_correct()}/10")
    }
}