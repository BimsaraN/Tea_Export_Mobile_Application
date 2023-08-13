package com.example.ransilutea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Products : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val teabagsActivity = findViewById<ImageButton>(R.id.teabagbtn)
        teabagsActivity.setOnClickListener {
            val Intent = Intent(this,TeaBags::class.java)
            startActivity(Intent)
        }

        val tealeavesActivity = findViewById<ImageButton>(R.id.tealeavesbtn)
        tealeavesActivity.setOnClickListener {
            val Intent = Intent(this,TeaLeaves::class.java)
            startActivity(Intent)
        }

        val lemonteaActivity = findViewById<ImageButton>(R.id.lemonteabtn)
        lemonteaActivity.setOnClickListener {
            val Intent = Intent(this,LemonTea::class.java)
            startActivity(Intent)
        }

        val strawberryteaActivity = findViewById<ImageButton>(R.id.strawberryteabtn)
        strawberryteaActivity.setOnClickListener {
            val Intent = Intent(this,StrawberryTea::class.java)
            startActivity(Intent)
        }

        val iceteaActivity = findViewById<ImageButton>(R.id.iceteabtn)
        iceteaActivity.setOnClickListener {
            val Intent = Intent(this,IceTea::class.java)
            startActivity(Intent)
        }

        val blackActivity = findViewById<ImageButton>(R.id.blackteabtn)
        blackActivity.setOnClickListener {
            val Intent = Intent(this,BlackTea::class.java)
            startActivity(Intent)
        }

    }
}