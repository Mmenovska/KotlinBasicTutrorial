//package com.android.gsixacademy.kotlinbasictutrorial
//
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import kotlinx.android.synthetic.main.activity_calculator.*
//import kotlinx.android.synthetic.main.activity_calculator_layout.*
//
//class CalculatorSecondActivity:AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_calculator)



//        button_num_one.setOnClickListener {appendOnExpresstion("1", true)}
//        button_num_two.setOnClickListener {appendOnExpresstion("2",true) }
//        button_num_three.setOnClickListener {appendOnExpresstion("3",true)}
//        button_num_four.setOnClickListener {appendOnExpresstion("4",true)}
//        button_num_five.setOnClickListener {appendOnExpresstion("5",true)}
//        button_num_six.setOnClickListener {appendOnExpresstion("6",true)}
//        button_num_seven.setOnClickListener {appendOnExpresstion("7",true)}
//        button_num_eight.setOnClickListener {appendOnExpresstion("8",true)}
//        button_num_nine.setOnClickListener {appendOnExpresstion("9",true)}
//        button_null.setOnClickListener {appendOnExpresstion("0",true)}
//
//        button_mul.setOnClickListener { appendOnExpresstion("*",false) }
//        button_div.setOnClickListener { appendOnExpresstion("/",false) }
//        button_sub.setOnClickListener { appendOnExpresstion("-", false) }
//        button_add.setOnClickListener { appendOnExpresstion("+",false) }
//        button_equ.setOnClickListener { appendOnExpresstion("=",false) }
//        button_del.setOnClickListener { appendOnExpresstion("C", false) }
//    }
//
//
//        fun appendOnExpresstion (string : String, canClear : Boolean){
//            if (canClear){
//                text_view_calc_second_bar.text = " "
//                text_view_calc_bar.append(string)
//            } else {
//                text_view_calc_bar.append(text_view_calc_second_bar.text)
//                text_view_calc_bar.append(string)
//                text_view_calc_second_bar.text = " "
//
//            }
//        }
//    }









