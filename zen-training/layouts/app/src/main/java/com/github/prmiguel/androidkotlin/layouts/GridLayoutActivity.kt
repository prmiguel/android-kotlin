package com.github.prmiguel.androidkotlin.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class GridLayoutActivity : AppCompatActivity() {

    var number : String = "";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_layout)
    }

    fun onClickNumber7(view: View) {
        number += "1";
        Log.d("TAG", "Print number 7");
        Log.d("Number", number);
    }

    fun onClickNumber8(view: View) {
        Log.d("TAG", "Print number 8");
        Log.d("Number", number);
    }

    fun onClickNumber9(view: View) {
        Log.d("TAG", "Print number 9");
        Log.d("Number", number);
    }

    fun onClickNumber4(view: View) {
        Log.d("TAG", "Print number 4");
        Log.d("Number", number);
    }

    fun onClickNumber5(view: View) {
        Log.d("TAG", "Print number 5");
        Log.d("Number", number);
    }

    fun onClickNumber6(view: View) {
        Log.d("TAG", "Print number 6");
        Log.d("Number", number);
    }

    fun onClickNumber1(view: View) {
        Log.d("TAG", "Print number 1");
        Log.d("Number", number);
    }

    fun onClickNumber2(view: View) {
        Log.d("TAG", "Print number 2");
        Log.d("Number", number);
    }

    fun onClickNumber3(view: View) {
        Log.d("TAG", "Print number 3");
        Log.d("Number", number);
    }

    fun onClickDotSign(view: View) {
        Log.d("TAG", "Print .");
        Log.d("Number", number);
    }

    fun onClickNumber0(view: View) {
        Log.d("TAG", "Print number 0");
        Log.d("Number", number);
    }

    fun onClickMultiplicationSign(view: View) {
        Log.d("TAG", "Print multiplication");
        Log.d("Number", number);
    }

    fun onClickDivisionSign(view: View) {
        Log.d("TAG", "Print division");
        Log.d("Number", number);
    }

    fun onClickSubtractionSign(view: View) {
        Log.d("TAG", "Print subtraction");
        Log.d("Number", number);
    }

    fun onClickAdditionSign(view: View) {
        Log.d("TAG", "Print addition");
        Log.d("Number", number);
    }
}