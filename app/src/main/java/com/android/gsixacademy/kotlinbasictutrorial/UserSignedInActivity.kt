package com.android.gsixacademy.kotlinbasictutrorial

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_user_signed_in.*

class UserSignedInActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_signed_in)

        var mySharedPreferences = getSharedPreferences("KotlinBasicTutorialPreferences", Context.MODE_PRIVATE)
        var userName = mySharedPreferences.getString("userName", "/")

        text_view_signed_in.text = "Signed in with $userName"

        button_sign_out.setOnClickListener {
            mySharedPreferences.edit().remove("userName")
            onBackPressed()
            Toast.makeText(applicationContext, "Succesfully signed out", Toast.LENGTH_SHORT).show()


        }
    }

}