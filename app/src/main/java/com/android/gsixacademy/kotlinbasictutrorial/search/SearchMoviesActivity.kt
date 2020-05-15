package com.android.gsixacademy.kotlinbasictutrorial.search

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.android.gsixacademy.kotlinbasictutrorial.R
import com.android.gsixacademy.kotlinbasictutrorial.api.ServiceBuilder
import com.android.gsixacademy.kotlinbasictutrorial.api.TheMovieDbApi
import com.android.gsixacademy.kotlinbasictutrorial.models.PopularMovies
import com.android.gsixacademy.kotlinbasictutrorial.movies.MoviesAdapter
import kotlinx.android.synthetic.main.activity_search.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchMoviesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)



        button_search.setOnClickListener {
            val request = ServiceBuilder.buildService(TheMovieDbApi::class.java)
            val call = request.searchMovies(
                "8dd3a40cdacd660d79bce7c46bad942e",
                edit_text_search.text.toString()
            )
            call.enqueue(object : Callback<PopularMovies> {
                override fun onResponse(
                    call: Call<PopularMovies>,
                    response: Response<PopularMovies>
                ) {
                    if (response.isSuccessful) {
                        val popularMovies = response.body()
                        val moviesList = popularMovies?.results
                        if (moviesList != null) {
                            var moviesAdapter = MoviesAdapter(moviesList) {

                            }
                            recycle_view_search.adapter = moviesAdapter
                        }
                    }

                }

                override fun onFailure(call: Call<PopularMovies>, t: Throwable) {
                }
            })
        }
    }
}




