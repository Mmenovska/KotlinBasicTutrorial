package com.android.gsixacademy.kotlinbasictutrorial.api

import com.android.gsixacademy.kotlinbasictutrorial.models.PopularMovies
import com.android.gsixacademy.kotlinbasictutrorial.models.PopularPeople
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TheMovieDbApi {
    @GET ("/3/movie/popular")
    fun getPopularMovies (@Query ("api_key") key : String) : Call<PopularMovies>

    @GET ("/3/person/popular")
    fun getPopularPeople (@Query("api_key") key : String) : Call <PopularPeople>
}