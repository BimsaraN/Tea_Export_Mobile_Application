package com.example.ransilutea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_order)

        val reviewActivity = findViewById<Button>(R.id.paynowbtn)
        reviewActivity.setOnClickListener {
            val Intent = Intent(this,Payment::class.java)
            startActivity(Intent)
        }
    }
}