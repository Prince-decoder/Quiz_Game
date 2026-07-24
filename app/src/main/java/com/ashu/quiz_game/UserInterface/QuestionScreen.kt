package com.ashu.quiz_game.UserInterface

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashu.quiz_game.Model.Options
import com.ashu.quiz_game.Model.Question
import com.ashu.quiz_game.R

@Composable
fun QuestionScreen(modifier: Modifier, Question: Question, correctAns:()-> Unit, onNext:()-> Unit)
{
    var firstClick1 by remember { mutableStateOf(false) }
    var firstClick2 by remember { mutableStateOf(false) }
    var firstClick3 by remember { mutableStateOf(false) }
    var firstClick4 by remember { mutableStateOf(false) }

    var isCorrect1 by remember { mutableStateOf(false) }
    var isCorrect2 by remember { mutableStateOf(false) }
    var isCorrect3 by remember { mutableStateOf(false) }
    var isCorrect4 by remember { mutableStateOf(false) }

    var title by remember { mutableStateOf("Submit") }
    var fClick by remember { mutableStateOf(false) }

    Column(modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Q:-"+" "+Question.Q, fontWeight = FontWeight.Bold, fontSize = 25.sp,
            fontStyle = FontStyle.Italic, modifier = Modifier.padding(8.dp))
        Image(painter = painterResource( Question.Image),"", Modifier.size(150.dp))

        Spacer(modifier = Modifier.height(8.dp))

        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp), onClick = {firstClick1=true
                                                                         firstClick2=false
                                                                         firstClick3=false
                                                                         firstClick4=false}, colors =
            if (firstClick1)
            {
                if (isCorrect1){
                    CardDefaults.cardColors(Color.Green)
                }else
                CardDefaults.cardColors(Color.Blue)
            }
            else{
                if (isCorrect1){
                    CardDefaults.cardColors(Color.Green)
                }else
                    CardDefaults.cardColors()
            }
        )
        {
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                Text(Question.option.op1, fontSize = 20.sp, modifier = Modifier)
            }
        }

        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp), onClick = {firstClick2=true
            firstClick1=false
            firstClick3=false
            firstClick4=false}, colors =
            if (firstClick2)
            {
                if (isCorrect2){
                    CardDefaults.cardColors(Color.Green)
                }else
                    CardDefaults.cardColors(Color.Blue)
            }
            else{
                if (isCorrect2){
                    CardDefaults.cardColors(Color.Green)
                }else
                    CardDefaults.cardColors()
            }
        )
        {
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                Text(Question.option.op2,fontSize = 20.sp, modifier = Modifier)
            }
        }

        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp), onClick = {firstClick3=true
            firstClick2=false
            firstClick1=false
            firstClick4=false}, colors =
            if (firstClick3)
            {
                if (isCorrect3){
                    CardDefaults.cardColors(Color.Green)
                }else
                    CardDefaults.cardColors(Color.Blue)
            }
            else{
                if (isCorrect3){
                    CardDefaults.cardColors(Color.Green)
                }else
                    CardDefaults.cardColors()
            }
        )
        {
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                Text(Question.option.op3,fontSize = 20.sp, modifier = Modifier)
            }
        }

        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp), onClick = {firstClick4=true
            firstClick2=false
            firstClick3=false
            firstClick1=false}, colors =
            if (firstClick4)
            {
                if (isCorrect4){
                    CardDefaults.cardColors(Color.Green)
                }else
                    CardDefaults.cardColors(Color.Blue)
            }
            else{
                if (isCorrect4){
                    CardDefaults.cardColors(Color.Green)
                }else
                    CardDefaults.cardColors()
            }
        )
        {
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                Text(Question.option.op4,fontSize = 20.sp, modifier = Modifier)
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            if (fClick)
            {
                onNext()
                firstClick1=false
                firstClick2=false
                firstClick3=false
                firstClick4=false
                isCorrect1=false
                isCorrect2=false
                isCorrect3=false
                isCorrect4=false
                fClick=false
                title="Submit"
            }
            else{
                fClick=true
                when(Question.correct){
                    1->{isCorrect1=true
                        if (firstClick1){
                            correctAns()
                        }}
                    2->{isCorrect2=true
                        if (firstClick2){
                            correctAns()
                        }}
                    3->{isCorrect3=true
                        if (firstClick3){
                            correctAns()
                        }}
                    4->{isCorrect4=true
                        if (firstClick4){
                            correctAns()
                        }}
                }
                title="Next"
            }
        }) {
            Text(title)
        }
    }
}

//@Preview(showSystemUi = true)
//@Composable
//fun demo()
//{
//    QuestionScreen(Modifier,Question(1, Q = "Which Country flag is this?", Image = R.drawable.ic_flag_of_argentina, option = Options(
//        op1 = "Argentina",
//        op2 = "Uruguay",
//        op3 = "Chile",
//        op4 = "Colombia"
//    ), correct = 1)) { }
//}