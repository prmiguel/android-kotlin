package com.github.prmiguel.androidkotlin.controls

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TextViewActivity : AppCompatActivity() {

    private lateinit var tvHolaMundo: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)

        tvHolaMundo = findViewById(R.id.tvHolaMundo)
        tvHolaMundo.text = "Hola Mundo.... (updated)"
    }
}