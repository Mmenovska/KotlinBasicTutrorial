package com.android.gsixacademy.kotlinbasictutrorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculator_layout.*

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_layout)

        button_add.setOnClickListener {
            var sum = edit_text_number_one.text.toString().toInt()+ edit_text_number_two.text.toString().toInt()
            var mojText = sum.toString()
            text_view_result_value.text = mojText
        }
        button_sub.setOnClickListener {
            var sub = edit_text_number_one.text.toString().toInt() - edit_text_number_two.text.toString().toInt()
            var mojText = sub.toString()
            text_view_result_value.text = mojText
        }
        button_div.setOnClickListener {
            var div = edit_text_number_one.text.toString().toInt() / edit_text_number_two.text.toString().toInt()
            var mojText = div.toString()
            text_view_result_value.text = mojText
        }
        button_mul.setOnClickListener {
            var mul = edit_text_number_one.text.toString().toInt() * edit_text_number_two.text.toString().toInt()
            var mojText = mul.toString()
            text_view_result_value.text = mojText
        }
    }
}