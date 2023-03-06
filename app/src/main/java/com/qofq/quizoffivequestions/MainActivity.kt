package com.qofq.quizoffivequestions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qofq.quizoffivequestions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val quest1 = "What is the coldest time of the year?"
    val quest2 = "What is the biggest animal in the world?"
    val quest3 = "Where is th Eiffel tower situated?"
    val quest4 = "What is the smallest continent?"
    val quest5 = "What is name of nearest star?"
    val answe1 = "Winter"
    val answe2 = "Whale"
    val answe3 = "Paris"
    val answe4 = "Australia"
    val answe5 = "Sun"
    val questions5 = listOf(quest1,quest2,quest3,quest4,quest5)
    val answer5 = listOf(answe1,answe2,answe3,answe4,answe5 )
    var numOfQ = -1
    var winerIs = 0
    var gameOverVar: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.text = "Start!"
        binding.button.setOnClickListener {
            binding.button.text = "I think it is!"
            if (numOfQ>-1) {
                if (binding.editTextAns.text.toString() == answer5 [numOfQ]) winerIs++
                binding.editTextAns.text.clear()
             }
            if (numOfQ==4) gameOverVar = true
            if (gameOverVar)  binding.textViewQuestQ.text = "Your score is " + winerIs.toString()
            if (numOfQ<4) numOfQ++
            if (!gameOverVar) binding.textViewQuestQ.text = questions5[numOfQ]

        }


    }
}