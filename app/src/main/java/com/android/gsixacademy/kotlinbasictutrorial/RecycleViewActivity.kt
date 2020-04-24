package com.android.gsixacademy.kotlinbasictutrorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recycleview.*

class RecycleViewActivity:AppCompatActivity() {
    var listCars: ArrayList<String> =
        arrayListOf(
            "McLaren",
            "Jaguar",
            "Audi",
            "Honda"
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycleview)


        var carsAdpter = CarsAdapter (listCars)
        recycle_view_activities.adapter = carsAdpter
    }
}