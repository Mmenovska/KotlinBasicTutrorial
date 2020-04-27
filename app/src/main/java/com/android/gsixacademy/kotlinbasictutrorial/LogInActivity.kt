package com.android.gsixacademy.kotlinbasictutrorial

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LogInActivity : AppCompatActivity() {

    var mySharedPreferences = null
    var myPreferencesEditor : SharedPreferences.Editor? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

       var  mySharedPreferences = getSharedPreferences("KotlinBasicTutorialPreferences", Context.MODE_PRIVATE)
        var myPreferencesEditor = mySharedPreferences!!.edit()

        button_sign_in.setOnClickListener {
           var userName = edit_text_user_name.text.toString()
            var userPass =edit_text_password.text.toString()

            myPreferencesEditor?.putString("userName", userName)
            myPreferencesEditor?.putString("password", userPass)
            myPreferencesEditor.apply()

            startActivity(Intent (applicationContext, UserSignedInActivity :: class.java))

        }

    }
}