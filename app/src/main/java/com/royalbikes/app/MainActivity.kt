package com.royalbikes.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val timer = TimerManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startBtn = findViewById<Button>(R.id.startBtn)
        val stopBtn = findViewById<Button>(R.id.stopBtn)
        val statusTxt = findViewById<TextView>(R.id.statusTxt)

        startBtn.setOnClickListener {
            timer.startTimer()
            statusTxt.text = "Ride Started"
        }

        stopBtn.setOnClickListener {
            val duration = timer.stopTimer()
            val cost = timer.calculateCost(duration)
            statusTxt.text = "Cost: KES $cost"
        }
    }
}

