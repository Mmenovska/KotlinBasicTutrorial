package com.android.gsixacademy.kotlinbasictutrorial.movies

import com.android.gsixacademy.kotlinbasictutrorial.CarsAdapterClickEvent
import com.android.gsixacademy.kotlinbasictutrorial.models.Car
import com.android.gsixacademy.kotlinbasictutrorial.models.MovieResult

sealed class MoviesAdapterClickEvent {
    data class MoviesAdapterItemClicked (var movieResult: MovieResult) : MoviesAdapterClickEvent()

}