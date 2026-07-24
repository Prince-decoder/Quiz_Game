package com.ashu.quiz_game.Model

data class Question(
    val id:Int,
    val Q:String,
    val Image:Int,
    val option: Options,
    val correct: Int
)

data class Options(
    val op1: String,
    val op2: String,
    val op3: String,
    val op4: String
)