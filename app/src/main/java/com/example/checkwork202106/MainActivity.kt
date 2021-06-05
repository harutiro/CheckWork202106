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

        val actionMoji = mutableListOf(
            ":Life is Tech!",
            "名古屋土曜",
            "Androidコース",
            "あみだ班"
        )
        val actionColor = mutableListOf(
            "#e60033",
            "#316745",
            "#4d4398",
            "#432f2f"
        )
        val actionSize = mutableListOf(
            32F,
            24F,
            40F,
            16F
        )

        val action = mutableListOf(
            mutableListOf(":Life is Tech!","名古屋土曜", "Androidコース", "あみだ班"),
            mutableListOf("#e60033", "#316745", "#4d4398", "#432f2f"),
            mutableListOf(32F, 24F, 40F, 16F)

        )


        findViewById<Button>(R.id.button).setOnClickListener{
            zyoutai++
            num++

            if(zyoutai == 4){
                zyoutai = 0
            }

            textView.text = num.toString() + actionMoji[zyoutai]
            textView.setTextColor(Color.parseColor(actionColor[zyoutai]))
            textView.textSize = actionSize[zyoutai]



//            when(zyoutai){
//                0 -> {
//                    textView.text = "$num:Life is Tech!"
//                    textView.setTextColor(Color.parseColor("#e60033"))
//                    textView.textSize = 32F
//                }
//                1 -> {
//                    textView.text = "$num:名古屋土曜"
//                    textView.setTextColor(Color.parseColor("#316745"))
//                    textView.textSize = 24F
//                }
//                2 -> {
//                    textView.text = "$num:Androidコース"
//                    textView.setTextColor(Color.parseColor("#4d4398"))
//                    textView.textSize = 40F
//
//                }
//                3 -> {
//                    textView.text = "$num:あみだ班"
//                    textView.setTextColor(Color.parseColor("#432f2f"))
//                    textView.textSize = 16F
//
//                }
//
//            }







        }


    }
}