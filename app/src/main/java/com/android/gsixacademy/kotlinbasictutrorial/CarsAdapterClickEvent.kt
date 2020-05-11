package com.android.gsixacademy.kotlinbasictutrorial

import com.android.gsixacademy.kotlinbasictutrorial.models.Car

sealed class CarsAdapterClickEvent {
data class CarsAdapterItemClick (var car: Car):CarsAdapterClickEvent()

}