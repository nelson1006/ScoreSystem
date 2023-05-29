package com.example.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Game3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game3)

        var score3 = intent.getIntExtra("key", 0)

        val btntomain = findViewById<Button>(R.id.btntomain)
        val printscore = findViewById<TextView>(R.id.textViewScore)

        printscore.text = score3.toString()

        btntomain.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}