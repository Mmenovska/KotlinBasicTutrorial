package com.android.gsixacademy.kotlinbasictutrorial.movies
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.gsixacademy.kotlinbasictutrorial.CarsAdapter
import com.android.gsixacademy.kotlinbasictutrorial.CarsAdapterClickEvent
import com.android.gsixacademy.kotlinbasictutrorial.R
import com.android.gsixacademy.kotlinbasictutrorial.api.ServiceBuilder
import com.android.gsixacademy.kotlinbasictutrorial.api.TheMovieDbApi
import com.android.gsixacademy.kotlinbasictutrorial.models.MovieResult
import com.android.gsixacademy.kotlinbasictutrorial.models.PopularMovies
import kotlinx.android.synthetic.main.activity_recycleview.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class PopularMoviesActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycleview)


        val request = ServiceBuilder.buildService(TheMovieDbApi::class.java)
        val call = request.getPopularMovies("8dd3a40cdacd660d79bce7c46bad942e")
        call.enqueue(object : Callback<PopularMovies> {
            override fun onResponse(call: Call<PopularMovies>, response: Response<PopularMovies>) {
                if (response.isSuccessful) {
                    val popularMovies = response.body()
                    val moviesList = popularMovies?.results
                  if (moviesList!=null){
                      var moviesAdapter = MoviesAdapter (moviesList){

                      }
                      recycle_view_activities.adapter = moviesAdapter
                  }
                }
            }

            override fun onFailure(call: Call<PopularMovies>, t: Throwable) {

            }
        })


    }
}