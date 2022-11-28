package com.example.quizzapp

data class Question(
    val id: Int,
    val questionText: String,
    val image: Int,
    val answers: List<String>,
    val correctAnswer: Int
)
