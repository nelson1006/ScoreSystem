package com.example.game

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Game1 : AppCompatActivity() {

    //var score1 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game1)

        var score1 = 0
        val intent = Intent(this, Game2::class.java)
        val btnplus1 = findViewById<Button>(R.id.button3)
        val btnminus1 = findViewById<Button>(R.id.button4)
        //var bundle = Bundle()
        //只有score這個變數要傳，Bundle可有可無

        //加分
        btnplus1.setOnClickListener {
            score1 += 10
            intent.putExtra("key", score1)
            startActivity(intent)
            //navigateToNextActivity()
        }
        //扣分
        btnminus1.setOnClickListener {
            score1 -= 10
            intent.putExtra("key", score1)
            startActivity(intent)
            //navigateToNextActivity()
        }

    }

    //傳送score，但這個副函式有問題，會導致程式崩潰，只能將程式碼都貼上去
    //private fun navigateToNextActivity() {
        //val intent = Intent(this, Game2::class.java)
        //intent.putExtra("key", score1)
        //startActivity(intent)
    //}
}