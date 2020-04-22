package com.android.gsixacademy.kotlinbasictutrorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recycleview.*

class RecycleViewActivity:AppCompatActivity() {
    var listActivities: ArrayList<String> =
        arrayListOf(
            "RelativeLayoutActivity",
            "CalculatorActivity",
            "TodoListActivity",
            "CalculatorSecondActivity"
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycleview)

        var activitiesAdapter = ActivitiesAdapter (listActivities)
        recycle_view_activities.adapter = activitiesAdapter
    }
}