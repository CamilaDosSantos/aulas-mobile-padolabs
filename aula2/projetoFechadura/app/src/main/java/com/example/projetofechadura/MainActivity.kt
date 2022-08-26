package com.example.projetofechadura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn = findViewById<Button>(R.id.button2)

        btn.setOnClickListener{
            startActivity(intent(packegeContext: this,ManActivity::class ))
        }

    }
}