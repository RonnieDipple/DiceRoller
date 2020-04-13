package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resultText: TextView = findViewById(R.id.result_text)
        val rollButton: Button = findViewById(R.id.roll_button)
        val countUpButton: Button = findViewById(R.id.count_up_button)
        rollButton.setOnClickListener { rollDice(resultText) }

        countUpButton.setOnClickListener {
            countUp(resultText)
        }
    }

    private fun rollDice(resultText: TextView){
//        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val randomInt =(1..6).random()
        resultText.text = randomInt.toString()

    }

    private fun countUp(resultText: TextView) {
        if (resultText.text.toString() =="Hello World!") {
            val num = 1
            resultText.text = num.toString()

        }else if (resultText.text.toString() =="6"){
            return
        }

        var myText = resultText.text.toString().toInt()
        myText += 1
        resultText.text = myText.toString()


    }




    }

