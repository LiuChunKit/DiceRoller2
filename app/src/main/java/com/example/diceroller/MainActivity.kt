package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.text.isDigitsOnly
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
    lateinit var diceImage3 : ImageView

    //private ImageView imageViewDice;
    //private Random random = new Random();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        diceImage3 = findViewById(R.id.dice_image3)
    }

    private fun rollDice() {
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
        diceImage3.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage() : Int{
        val randomInt = Random.nextInt(6) + 1

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    /*private fun countUp() {

        val resultText: TextView = findViewById(R.id.resultText)
        val resultText2: TextView = findViewById(R.id.resultText2)
        val resultText3: TextView = findViewById(R.id.resultText3)

        val resultArr = arrayOf(resultText, resultText2, resultText3)

        for(chkResultArr in resultArr){
            if(chkResultArr.text.toString().toIntOrNull() == null){
                chkResultArr.text = "1"
            }
            else{
                val onScreenResult = chkResultArr.text.toString().toInt()
                if(onScreenResult < 6){
                    chkResultArr.text = (onScreenResult + 1).toString()
                }
                else{
                    chkResultArr.text = onScreenResult.toString()
                }
            }
        }
    }

    private fun resetBtn(){

        val resultText: TextView = findViewById(R.id.resultText)
        val resultText2: TextView = findViewById(R.id.resultText2)
        val resultText3: TextView = findViewById(R.id.resultText3)

        resultText.text = "0"
        resultText2.text = "0"
        resultText3.text = "0"

    }*/
}