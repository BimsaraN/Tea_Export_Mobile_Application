package com.example.ransilutea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class get_start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_start)

        val loginActivity = findViewById<Button>(R.id.logbtn)
        loginActivity.setOnClickListener {
            val Intent = Intent(this,Login::class.java)
            startActivity(Intent)
        }

        val signupActivity = findViewById<Button>(R.id.signbtn)
        signupActivity.setOnClickListener {
            val Intent = Intent(this,Signup::class.java)
            startActivity(Intent)
        }

    }
}