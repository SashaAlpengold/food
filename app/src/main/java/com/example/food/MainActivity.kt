package com.example.food

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var signInButton: Button
    lateinit var signUpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signInButton = findViewById(R.id.signIn)
        signUpButton = findViewById(R.id.signUp)

        signInButton.setOnClickListener(){
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }

        signUpButton.setOnClickListener(){
            val intent = Intent(this, SignUpActivity::class.java)
        }
    }
}