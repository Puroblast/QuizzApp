package com.example.quizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.quizzapp.databinding.ActivityQuestionsBinding


class QuestionsActivity : AppCompatActivity() {

    private val binding: ActivityQuestionsBinding by viewBinding()
    private var questionNumber = 0
    private val questionList = Constants.getQuestions()
    private var correctAnswers = 0
    private var answer = ""
    private var question = questionList[questionNumber]
    private var selectedPosition = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)
        setupQuestion()

        binding.answerOne.setOnClickListener {
            clear()
            binding.answerOne.setBackgroundResource(R.drawable.clicked_view_bg)
            answer = binding.answerOne.text.toString()
            selectedPosition = 0
        }
        binding.answerTwo.setOnClickListener {
            clear()
            binding.answerTwo.setBackgroundResource(R.drawable.clicked_view_bg)
            answer = binding.answerTwo.text.toString()
            selectedPosition = 1
        }
        binding.answerThree.setOnClickListener {
            clear()
            binding.answerThree.setBackgroundResource(R.drawable.clicked_view_bg)
            answer = binding.answerThree.text.toString()
            selectedPosition = 2
        }
        binding.answerFour.setOnClickListener {
            clear()
            binding.answerFour.setBackgroundResource(R.drawable.clicked_view_bg)
            answer = binding.answerFour.text.toString()
            selectedPosition = 3
        }

        binding.submitBtn.setOnClickListener {
            if(selectedPosition == -1) {
                Toast.makeText(this,"You should choose answer",Toast.LENGTH_SHORT).show()
            } else if (binding.submitBtn.text == "FINISH") {
                result()
            } else if (binding.submitBtn.text == "Next Question") {
                questionNumber +=1
                setupQuestion()
            } else {
                binding.submitBtn.text = "Next Question"
                check()
            }
        }

    }

    private fun result() {
        TODO("Not yet implemented")
    }

    private fun setupQuestion() {
        clear()
        question = questionList[questionNumber]
        binding.progressBar.progress = questionNumber + 1
        binding.progressCount.text = "${questionNumber + 1}/${questionList.size}"
        binding.flagImage.setImageResource(question.image)
        binding.question.text = question.questionText
        binding.answerOne.text = question.answers[0]
        binding.answerTwo.text = question.answers[1]
        binding.answerThree.text = question.answers[2]
        binding.answerFour.text = question.answers[3]

    }

    fun clear() {
        binding.answerOne.setBackgroundResource(R.drawable.default_border_bg)
        binding.answerTwo.setBackgroundResource(R.drawable.default_border_bg)
        binding.answerThree.setBackgroundResource(R.drawable.default_border_bg)
        binding.answerFour.setBackgroundResource(R.drawable.default_border_bg)
        binding.submitBtn.text = "SUBMIT"
        selectedPosition = -1
    }

    fun check() {
        if (questionNumber == questionList.size - 1) {
            binding.submitBtn.text = "FINISH"
        }
        if (selectedPosition == question.correctAnswer) {
            correctAnswers += 1
            when (selectedPosition) {
                0 -> binding.answerOne.setBackgroundResource(R.drawable.correct_option_border)
                1 -> binding.answerTwo.setBackgroundResource(R.drawable.correct_option_border)
                2 -> binding.answerThree.setBackgroundResource(R.drawable.correct_option_border)
                3 -> binding.answerFour.setBackgroundResource(R.drawable.correct_option_border)
            }
        } else {
            when (selectedPosition) {
                0 -> binding.answerOne.setBackgroundResource(R.drawable.wrong_option_border)
                1 -> binding.answerTwo.setBackgroundResource(R.drawable.wrong_option_border)
                2 -> binding.answerThree.setBackgroundResource(R.drawable.wrong_option_border)
                3 -> binding.answerFour.setBackgroundResource(R.drawable.wrong_option_border)
            }
            when (question.correctAnswer) {
                0 -> binding.answerOne.setBackgroundResource(R.drawable.correct_option_border)
                1 -> binding.answerTwo.setBackgroundResource(R.drawable.correct_option_border)
                2 -> binding.answerThree.setBackgroundResource(R.drawable.correct_option_border)
                3 -> binding.answerFour.setBackgroundResource(R.drawable.correct_option_border)
            }
        }
    }

}