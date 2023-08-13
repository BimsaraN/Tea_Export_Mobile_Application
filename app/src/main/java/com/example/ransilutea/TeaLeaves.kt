package com.example.ransilutea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TeaLeaves : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tea_leaves)

        val orderActivity = findViewById<Button>(R.id.buybtn)
        orderActivity.setOnClickListener {
            val Intent = Intent(this,OrderNow::class.java)
            startActivity(Intent)
        }

        val addcartActivity = findViewById<Button>(R.id.cartbtn)
        addcartActivity.setOnClickListener {
            val Intent = Intent(this,Cart::class.java)
            startActivity(Intent)
        }

        val reviewActivity = findViewById<Button>(R.id.reviewbtn)
        reviewActivity.setOnClickListener {
            val Intent = Intent(this,Reviews::class.java)
            startActivity(Intent)
        }


    }
}