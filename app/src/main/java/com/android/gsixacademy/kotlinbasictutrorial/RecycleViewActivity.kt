package com.android.gsixacademy.kotlinbasictutrorial

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recycleview.*

class RecycleViewActivity:AppCompatActivity() {

    var listCars: ArrayList<Car> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycleview)

        listCars.add(Car ("McLaren", "The McLaren 720S is a sports car designed and manufactured by British automobile manufacturer McLaren Automotive. It is the second all-new car in the McLaren Super Series, replacing the 650S beginning in May 2017.\n" +
                "\n" +
                "The 720S was launched at the Geneva Motor Show on 7 March 2017 and is built on a modified carbon monocoque, which is lighter and stiffer in contrast to the 650S.", R.drawable.mclaren))
        listCars.add (Car("Audi", "The Audi R8[2] is a mid-engine, 2-seater sports car,[2][3] which uses Audi's trademark quattro permanent all-wheel drive system.[2] It was introduced by the German car manufacturer Audi AG in 2006.", R.drawable.audi_r))
        listCars.add(Car("Honda", "The Honda NSX (second generation), marketed as the Acura NSX in North America and China, is a 2-seater, all-wheel drive, mid-engine hybrid sports car developed and manufactured by Honda in the United States. It succeeds the original NSX that was produced in Japan from 1990 to 2005.", R.drawable.honda_nsx))
        listCars.add(Car("Jaguar", "The Jaguar F-Type (X152) is a two-door, two-seater sports car, manufactured by British luxury car manufacturer Jaguar Land Rover under their Jaguar Cars marque since 2013. \n" + "\n" + "The car was launched initially as a 2-door soft-top convertible, with a 2-door fastback coupé version launched in 2013.", R.drawable.jaguar_f))
        listCars.add (Car("Aston Martin", "The Aston Martin DB11 is a grand tourer[2] produced by British luxury car manufacturer Aston Martin since 2016. It debuted at the Geneva Motor Show in March 2016 as a replacement to the DB9.[3] It is the first model launched in Aston Martin's 'second century' plan and the first car launched since the company's tie-up with Daimler AG.", R.drawable.aston_martin))
        listCars.add(Car("Maserati", "The Maserati GranTurismo and GranCabrio (Tipo M145) are a series of a grand tourers produced by the Italian automobile manufacturer Maserati from 2007 to 2019. ... The GranTurismo set a record for the most quickly developed car in the auto industry, going from design to production stage in just nine months.", R.drawable.maserati_granturismo))
        listCars.add(Car("Mercedes", "The Mercedes-AMG GT (C190 / R190) is a sports car produced in coupé and roadster bodystyles by German automobile manufacturer Mercedes-AMG. ... After the SLS AMG, it is the second sports car developed entirely in-house by Mercedes-AMG.", R.drawable.mercedes_amg))
        listCars.add(Car("Nissan", "The Nissan GT-R is a high-performance sports car and grand tourer produced by Nissan, which was unveiled in 2007. It is the successor to the Skyline GT-R, although no longer part of the Skyline range itself, that name now being used for Nissan's luxury-sport market.", R.drawable.nissan ))

        for (i in 0..100){
            listCars.add(Car("Nissan", "The Nissan GT-R is a high-performance sports car and grand tourer produced by Nissan, which was unveiled in 2007. It is the successor to the Skyline GT-R, although no longer part of the Skyline range itself, that name now being used for Nissan's luxury-sport market." +i, R.drawable.nissan ))
        }



        var carsAdpter = CarsAdapter (listCars) {
              if (it is CarsAdapterClickEvent.CarsAdapterItemClick){
                  var carClicked = it.car
                  Toast.makeText(applicationContext, carClicked.title, Toast.LENGTH_LONG).show()
              }
        }
        recycle_view_activities.adapter = carsAdpter
    }
}