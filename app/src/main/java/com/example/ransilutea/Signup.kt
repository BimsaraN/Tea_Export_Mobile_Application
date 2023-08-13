package com.example.ransilutea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val dashboardActivity = findViewById<Button>(R.id.subbutton)
        dashboardActivity.setOnClickListener {
            val Intent = Intent(this,FrontDashboard::class.java)
            startActivity(Intent)
        }
    }
}