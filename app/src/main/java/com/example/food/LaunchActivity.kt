package com.example.food

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatDelegate

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        val timer = object : CountDownTimer(3000, 1000){
            override fun onTick(p0: Long) {
            }

            override fun onFinish() {
                val intent = Intent(this@LaunchActivity,MainActivity::class.java)
                startActivity(intent)
            }
        }
        timer.start()
    }
}