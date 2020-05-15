package com.android.gsixacademy.kotlinbasictutrorial.search

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.android.gsixacademy.kotlinbasictutrorial.R
import com.android.gsixacademy.kotlinbasictutrorial.api.ServiceBuilder
import com.android.gsixacademy.kotlinbasictutrorial.api.TheMovieDbApi
import com.android.gsixacademy.kotlinbasictutrorial.models.PopularMovies
import com.android.gsixacademy.kotlinbasictutrorial.models.PopularPeople
import com.android.gsixacademy.kotlinbasictutrorial.movies.MoviesAdapter
import com.android.gsixacademy.kotlinbasictutrorial.people.PeopleAdapter
import kotlinx.android.synthetic.main.activity_recycleview.*
import kotlinx.android.synthetic.main.activity_search.*
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class SearchPeopleActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

    button_search.setOnClickListener {
        val request = ServiceBuilder.buildService(TheMovieDbApi::class.java)
        val call = request.searchPerson("8dd3a40cdacd660d79bce7c46bad942e", edit_text_search.text.toString())

        call.enqueue(object : retrofit2.Callback<PopularPeople> {
            override fun onResponse(call: Call<PopularPeople>, response: Response<PopularPeople>) {
                if (response.isSuccessful) {
                    val popularPeople = response.body()
                    val popularPeopleList = popularPeople?.results
                    if (popularPeopleList != null) {
                        var peopleAdapter = PeopleAdapter(popularPeopleList) {}
                        recycle_view_search.layoutManager = GridLayoutManager(applicationContext, 2)
                        recycle_view_search.adapter = peopleAdapter

                    }
                }
            }





            override fun onFailure(call: Call<PopularPeople>, t: Throwable) {

            }
        })


    }
    }


}










