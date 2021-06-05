package com.example.checkwork202106

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var zyoutai = -1
        var num = 0

        val textView = findViewById<TextView>(R.id.textView)

        findViewById<Button>(R.id.button).setOnClickListener{
            zyoutai++
            num++

            if(zyoutai == 4){
                zyoutai = 0
            }


            when(zyoutai){
                0 -> {
                    textView.text = "$num:Life is Tech!"
                    textView.setTextColor(Color.parseColor("#e60033"))
                    textView.textSize = 32F
                }
                1 -> {

                }
                2 -> {

                }
                3 -> {

                }

            }

        }


    }
}