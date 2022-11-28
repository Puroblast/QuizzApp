package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.quizzapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private val binding: ActivityResultBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val correctAnswers = intent.getStringExtra(Constants.CORRECT_ANSWERS)
        val name = intent.getStringExtra(Constants.USER_NAME)
        val totalQuestions = intent.getStringExtra(Constants.TOTAL_QUESTIONS)

        binding.scoreView.text = "Your result is : $correctAnswers out of $totalQuestions"
        binding.nameView.text = name

        binding.finishBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}