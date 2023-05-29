package com.example.game

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnstart = findViewById<Button>(R.id.button)
        val btngame = findViewById<Button>(R.id.btngame)
        val textView = findViewById<TextView>(R.id.textView)
        //var bundle = Bundle()

        btngame.setOnClickListener{
            //bundle.putInt("score",0)
            //intent.putExtras(bundle)
            //startActivityForResult(intent, 1)
            startActivity(Intent(this, Game1::class.java))
        }

        btnstart.setOnClickListener {
            draw(textView)
        }
    }

    private fun draw(textView: TextView) {
        val totalItems = 15 // 總共的選項數量
        val drawCount = 10 // 抽籤次數

        val itemList = mutableListOf<Int>() // 建立儲存選項的清單
        for (i in 1..totalItems) {
            itemList.add(i)
        }

        val random = Random.Default // 使用 Random 的預設實例
        val drawResult = mutableListOf<Int>() // 儲存抽籤結果的清單

        for (i in 1..drawCount) {
            val randomIndex = random.nextInt(itemList.size) // 隨機產生一個索引值
            val selectedItem = itemList.removeAt(randomIndex) // 從清單中移除被抽中的選項
            drawResult.add(selectedItem) // 將被抽中的選項加入抽籤結果的清單
        }

        // 輸出抽籤結果
        val resultString = drawResult.joinToString(", ")
        textView.text = resultString
    }
}