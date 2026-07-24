package com.ashu.quiz_game

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ashu.quiz_game.UserInterface.Controller
import com.ashu.quiz_game.UserInterface.FinalScreen
import com.ashu.quiz_game.UserInterface.UserScreen
import com.ashu.quiz_game.ViewModel.QuizViewModel
import com.ashu.quiz_game.ui.theme.Quiz_GameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel: QuizViewModel= viewModel()
            val navHOstContoler= rememberNavController()
            Quiz_GameTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(navHOstContoler,"Start")
                    {
                        composable("Start")
                        {
                            UserScreen(modifier = Modifier,{
                                navHOstContoler.currentBackStackEntry?.savedStateHandle?.set("User",it)
                                navHOstContoler.navigate("Questions")
                            })
                        }
                        composable("Questions") {
                            Controller(modifier = Modifier.padding(innerPadding),viewModel) {
                                navHOstContoler.navigate("FinalPage")
                            }
                        }
                        composable("FinalPage") {
                            val name=navHOstContoler.previousBackStackEntry?.savedStateHandle?.get<String>("User")?:"Boka"
                            FinalScreen(modifier = Modifier.padding(innerPadding),name,viewModel)
                        }
                    }
                }
            }
        }
    }
}