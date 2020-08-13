package com.github.prmiguel.androidkotlin.controls

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ButtonActivity : AppCompatActivity() {

    private lateinit var button1: Button
    private lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        button1 = findViewById(R.id.btn1)
        button1.setOnClickListener {
            button1.text = "Update Button Text"
        }

        button2 = findViewById(R.id.btn2)
        button2.setOnClickListener {
            button2.setBackgroundColor(Color.CYAN)
            button2.setTextColor(Color.BLACK)
        }
    }

}