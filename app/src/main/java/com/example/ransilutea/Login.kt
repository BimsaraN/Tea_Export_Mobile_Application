package com.example.ransilutea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val logActivity = findViewById<Button>(R.id.signup1btn)
        logActivity.setOnClickListener {
            val Intent = Intent(this,Signup::class.java)
            startActivity(Intent)
        }

        val dashboardActivity = findViewById<Button>(R.id.log1button)
        dashboardActivity.setOnClickListener {
            val Intent = Intent(this,FrontDashboard::class.java)
            startActivity(Intent)
        }
    }
}