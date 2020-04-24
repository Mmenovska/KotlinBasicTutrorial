package com.android.gsixacademy.kotlinbasictutrorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var listActivities: ArrayList<String> =
        arrayListOf(
            "RelativeLayoutActivity",
            "CalculatorActivity",
            "TodoListActivity",
            "CalculatorSecondActivity"
        )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var activitiesAdapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, listActivities)
        list_view_activities.adapter = activitiesAdapter

        list_view_activities.setOnItemClickListener { adapterView, view, i, l ->
            var className = listActivities[i]
            Toast.makeText(applicationContext, className, Toast.LENGTH_LONG).show()
            when (className) {
                "RelativeLayoutActivity" -> startActivity(
                    Intent(
                        applicationContext,
                        RelativeLayoutActivity::class.java
                    )
                )
                "CalculatorActivity" -> startActivity(
                    Intent(
                        applicationContext,
                        CalculatorActivity::class.java
                    )
                )
                "TodoListActivity" -> startActivity(
                    Intent(applicationContext, TodoListActivity::class.java)
                )
//                "CalculatorSecondActivity" -> startActivity(
//                    Intent(
//                        applicationContext,
//                        CalculatorSecondActivity::class.java
//                    )
//                )
            }

        }

    }
}




