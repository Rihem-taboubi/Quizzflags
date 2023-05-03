package com.example.quizflags

data class Question(
    val id :Int,
    val Question: String,
    val image: Int,
    val OptionOne: String,
    val OptionTwo : String,
    val OptionThree : String,
    val OptionFour : String,
    val correctAnswer : Int,
)
