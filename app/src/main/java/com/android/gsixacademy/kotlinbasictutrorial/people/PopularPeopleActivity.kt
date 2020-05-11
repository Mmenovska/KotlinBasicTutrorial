package com.android.gsixacademy.kotlinbasictutrorial.people

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.gsixacademy.kotlinbasictutrorial.R
import com.android.gsixacademy.kotlinbasictutrorial.api.ServiceBuilder
import com.android.gsixacademy.kotlinbasictutrorial.api.TheMovieDbApi
import com.android.gsixacademy.kotlinbasictutrorial.models.PopularMovies
import com.android.gsixacademy.kotlinbasictutrorial.models.PopularPeople
import com.android.gsixacademy.kotlinbasictutrorial.movies.MoviesAdapter
import kotlinx.android.synthetic.main.activity_recycleview.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PopularPeopleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycleview)

        val request = ServiceBuilder.buildService(TheMovieDbApi::class.java)
        val call = request.getPopularPeople("8dd3a40cdacd660d79bce7c46bad942e")

        call.enqueue(object : Callback<PopularPeople> {
            override fun onResponse(call: Call<PopularPeople>, response: Response<PopularPeople>) {
                if (response.isSuccessful) {
                    val popularPeople = response.body()
                    val popularPeopleList = popularPeople?.results
                    if (popularPeople != null) {
                        var moviesAdapter = MoviesAdapter(moviesList) {

                        }
                        recycle_view_activities.adapter = moviesAdapter

                    }
                }
            }





            override fun onFailure(call: Call<PopularPeople>, t: Throwable) {

            }
        })


    }
}






