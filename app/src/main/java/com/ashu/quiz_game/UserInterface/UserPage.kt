package com.ashu.quiz_game.UserInterface

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashu.quiz_game.R

@Composable
fun UserScreen(modifier: Modifier,onClick:(String)-> Unit)
{
    var name by remember { mutableStateOf("") }
    Column(modifier.fillMaxSize().padding()
        .paint(painterResource(R.drawable.ic_bg),
            contentScale = ContentScale.Crop),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Card(modifier = Modifier.padding(8.dp), colors = CardDefaults.cardColors(colorResource(R.color.pink)))
        {
            Column(modifier = Modifier.padding(10.dp),verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Text("Welcome to Quiz Game",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic)

                Text(
                    text = "Enter Name")
                Spacer(modifier = Modifier.height(12.dp))
                OutlinedTextField(value = name, onValueChange = {name=it}, label = {Text("eg:John")})
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = {
                    if(name.isNotEmpty())
                    onClick(name)})
                {
                    Text("Start")
                }
            }
        }
    }
}