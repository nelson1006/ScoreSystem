package com.example.game

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Game2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game2)

        //接收數值
        var score2: Int = intent.getIntExtra("key", 0)
        val intent = Intent(this, Game3::class.java)
        val btnplus2 = findViewById<Button>(R.id.button5)
        val btnminus2 = findViewById<Button>(R.id.button6)
        //var bundle = Bundle()
        //只有score一個變數要傳，Bundle可有可無

        //加分
        btnplus2.setOnClickListener {
            score2 += 10
            intent.putExtra("key", score2)
            startActivity(intent)
            //navigateToNextActivity()
        }
        //扣分
        btnminus2.setOnClickListener {
            score2 -= 10
            intent.putExtra("key", score2)
            startActivity(intent)
            //navigateToNextActivity()
        }

    }

    //傳送score
    //private fun navigateToNextActivity() {
        //val intent = Intent(this, Game3::class.java)
        //intent.putExtra("key", score2)
        //startActivity(intent)
    //}
}