package com.android.gsixacademy.kotlinbasictutrorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recycleview.*

class RecycleViewActivity:AppCompatActivity() {

    var listCars: ArrayList<Car> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycleview)

        listCars.add(Car ("McLaren", "MC description", R.drawable.mclaren))
        listCars.add (Car("Audi", "Audi description", R.drawable.audi_r))
        listCars.add(Car("Honda", "Honda description", R.drawable.honda_nsx))
        listCars.add(Car("Jaguar", "Jaguar description", R.drawable.jaguar_f))
        listCars.add (Car("Aston Martin", "Aston Martin description", R.drawable.aston_martin))
        listCars.add(Car("Maserati", "Maserati description", R.drawable.maserati_granturismo))
        listCars.add (Car("McLaren", "McLaren description", R.drawable.mclaren))
        listCars.add(Car("Mercedes", "Mercedes description", R.drawable.mercedes_amg))
        listCars.add(Car("Nissan", "Nissan description", R.drawable.nissan ))

        for (i in 0..100){
            listCars.add(Car("Nissan", "Nissan description"+i, R.drawable.nissan ))
        }



        var carsAdpter = CarsAdapter (listCars)
        recycle_view_activities.adapter = carsAdpter
    }
}