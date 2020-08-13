package com.github.prmiguel.androidkotlin.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var number : String = ""
    lateinit var operations : TextView
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operations = findViewById(R.id.operations)
        result = findViewById(R.id.result)
    }

    fun onClickNumber7(view: View) {
        number += "7"
        operations.text = number
        Log.d("TAG", "Print number 7")
        Log.d("Number", number)
    }

    fun onClickNumber8(view: View) {
        number += "8"
        operations.text = number
        Log.d("TAG", "Print number 8")
        Log.d("Number", number)
    }

    fun onClickNumber9(view: View) {
        number += "9"
        operations.text = number
        Log.d("TAG", "Print number 9")
        Log.d("Number", number)
    }

    fun onClickNumber4(view: View) {
        number += "4"
        operations.text = number
        Log.d("TAG", "Print number 4")
        Log.d("Number", number)
    }

    fun onClickNumber5(view: View) {
        number += "5"
        operations.text = number
        operations.setText(number)
        Log.d("TAG", "Print number 5")
        Log.d("Number", number)
    }

    fun onClickNumber6(view: View) {
        number += "6"
        operations.text = number
        operations.setText(number)
        Log.d("TAG", "Print number 6")
        Log.d("Number", number)
    }

    fun onClickNumber1(view: View) {
        number += "1"
        operations.text = number
        operations.setText(number)
        Log.d("TAG", "Print number 1")
        Log.d("Number", number)
    }

    fun onClickNumber2(view: View) {
        number += "2"
        operations.text = number
        Log.d("TAG", "Print number 2")
        Log.d("Number", number)
    }

    fun onClickNumber3(view: View) {
        number += "3"
        operations.text = number
        Log.d("TAG", "Print number 3")
        Log.d("Number", number)
    }

    fun onClickDotSign(view: View) {
        number += "."
        operations.text = number
        Log.d("TAG", "Print .")
        Log.d("Number", number)
    }

    fun onClickNumber0(view: View) {
        number += "0"
        operations.text = number
        Log.d("TAG", "Print number 0")
        Log.d("Number", number)
    }

    fun onClickMultiplicationSign(view: View) {
        number += "*"
        operations.text = number
        Log.d("TAG", "Print multiplication")
        Log.d("Number", number)
    }

    fun onClickDivisionSign(view: View) {
        number += "/"
        operations.text = number
        Log.d("TAG", "Print division")
        Log.d("Number", number)
    }

    fun onClickSubtractionSign(view: View) {
        number += "-"
        operations.text = number
        Log.d("TAG", "Print subtraction")
        Log.d("Number", number)
    }

    fun onClickAdditionSign(view: View) {
        number += "+"
        operations.text = number
        Log.d("TAG", "Print addition")
        Log.d("Number", number);
    }

    fun onClickEqualSign(view: View) {
        number += "="
        operations.text = number
        Log.d("TAG", "Print equal")
        Log.d("Number", number);
    }
}