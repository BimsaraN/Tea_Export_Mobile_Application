package com.example.ransilutea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Buyerdashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buyerdashboard)

        val productsActivity = findViewById<ImageButton>(R.id.productbtn)
        productsActivity.setOnClickListener {
            val Intent = Intent(this,Products::class.java)
            startActivity(Intent)
        }

        val cartActivity = findViewById<ImageButton>(R.id.cartbtn)
        cartActivity.setOnClickListener {
            val Intent = Intent(this,Cart::class.java)
            startActivity(Intent)
        }

        val profileActivity = findViewById<ImageButton>(R.id.profilebtn)
        profileActivity.setOnClickListener {
            val Intent = Intent(this,Profile::class.java)
            startActivity(Intent)
        }

        val contactusActivity = findViewById<ImageButton>(R.id.contactusbtn)
        contactusActivity.setOnClickListener {
            val Intent = Intent(this,ContactUs::class.java)
            startActivity(Intent)
        }
    }
}