package com.example.ransilutea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FrontDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front_dashboard)

        val sellerActivity = findViewById<Button>(R.id.sellerbtn)
        sellerActivity.setOnClickListener {
            val Intent = Intent(this,Sellerdashboard::class.java)
            startActivity(Intent)
        }

        val buyerActivity = findViewById<Button>(R.id.buyerbtn)
        buyerActivity.setOnClickListener {
            val Intent = Intent(this,Buyerdashboard::class.java)
            startActivity(Intent)
        }
    }
}