package com.example.myapplication4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import kotlin.concurrent.timer
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Timer1 = findViewById<TextView>(R.id.textViewTimer)
        val Button1 = findViewById<Button>(R.id.button)
        val Text1 = findViewById<TextView>(R.id.textView2)


        val timer = object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                println(millisUntilFinished / 1000)
            }

            override fun onFinish() {
                println("Finish")
            }


        }

        timer.start()
    }
}