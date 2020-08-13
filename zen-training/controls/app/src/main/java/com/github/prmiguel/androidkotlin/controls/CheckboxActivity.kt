package com.github.prmiguel.androidkotlin.controls

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class CheckboxActivity : AppCompatActivity() {

    private lateinit var checkbox: CheckBox
    private lateinit var btnActivate: Button
    private lateinit var ckb2: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox)

        checkbox = findViewById(R.id.chk1)
        btnActivate = findViewById(R.id.btn2)
        ckb2 = findViewById(R.id.ckb2)

        btnActivate.setOnClickListener{
            ckb2.isEnabled = true
        }
    }

    fun get_state_click(view: View) {
        val state = "State: " + if (checkbox.isChecked) "Checked" else "Not Checked"
        Toast.makeText(this, state, Toast.LENGTH_SHORT).show()
    }
}