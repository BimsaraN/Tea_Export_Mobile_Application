package com.example.ransilutea

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startActivity = findViewById<Button>(R.id.getstartbtn)
        startActivity.setOnClickListener {
            val Intent = Intent(this,get_start::class.java)
            startActivity(Intent)
        }

    }
}