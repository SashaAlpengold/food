package com.example.food

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class SignInActivity : AppCompatActivity() {

    lateinit var signInButton: Button
    lateinit var signUpButton: Button
    lateinit var emailEdt: EditText
    lateinit var passwordEdt: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        signInButton = findViewById(R.id.signIn)
        signUpButton = findViewById(R.id.signUp)
        emailEdt = findViewById(R.id.emailEdt)
        passwordEdt = findViewById(R.id.passwordEdt)

        signInButton.setOnClickListener(){
            if (emailEdt.text.isNotEmpty() && passwordEdt.text.isNotEmpty()){
                if (emailEdt.text.toString() == "admin" && passwordEdt.text.toString() == "admin"){
                    val intent = Intent(this, MenuActivity::class.java)
                    startActivity(intent)
                }else{
                    val alertWrong = AlertDialog.Builder(this)
                        .setTitle("Error")
                        .setMessage("Неверный логин или пароль")
                        .setPositiveButton("ok", null)
                        .create()
                        .show()
                }
            }else{
                val alertEmpty = AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Не все поля заполнены")
                    .setPositiveButton("ok", null)
                    .create()
                    .show()
            }
        }

        signUpButton.setOnClickListener(){
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}