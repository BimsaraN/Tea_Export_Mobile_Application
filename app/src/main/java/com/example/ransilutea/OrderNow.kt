package com.example.ransilutea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OrderNow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_now)

        val addorderActivity = findViewById<Button>(R.id.addorderbtn)
        addorderActivity.setOnClickListener {
            val Intent = Intent(this,AddOrder::class.java)
            startActivity(Intent)
        }
        val updateorderActivity = findViewById<Button>(R.id.updatebtn)
        updateorderActivity.setOnClickListener {
            val Intent = Intent(this,UpdateOrder::class.java)
            startActivity(Intent)
        }
    }
}