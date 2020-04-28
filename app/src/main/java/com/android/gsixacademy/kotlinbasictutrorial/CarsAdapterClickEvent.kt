package com.android.gsixacademy.kotlinbasictutrorial

sealed class CarsAdapterClickEvent {
data class CarsAdapterItemClick (var car: Car):CarsAdapterClickEvent()

}