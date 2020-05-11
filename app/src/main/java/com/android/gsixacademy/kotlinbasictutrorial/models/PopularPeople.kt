package com.android.gsixacademy.kotlinbasictutrorial.models

class PopularPeople (
    val page: Int?,
    val total_results:Int?,
    val total_pages : Int?,
    val results: ArrayList<PersonResult>
    ) {
}