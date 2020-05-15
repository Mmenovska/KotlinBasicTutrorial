package com.android.gsixacademy.kotlinbasictutrorial.tvshow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.gsixacademy.kotlinbasictutrorial.R
import com.android.gsixacademy.kotlinbasictutrorial.api.ServiceBuilder
import com.android.gsixacademy.kotlinbasictutrorial.api.TheMovieDbApi
import com.android.gsixacademy.kotlinbasictutrorial.models.PopularTv
import com.android.gsixacademy.kotlinbasictutrorial.models.TvShow
import kotlinx.android.synthetic.main.activity_recycleview.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TvShowActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycleview)




        val request = ServiceBuilder.buildService(TheMovieDbApi::class.java)
        val call = request.getLatestTvShows("8dd3a40cdacd660d79bce7c46bad942e")
        call.enqueue(object : Callback<PopularTv> {
            override fun onResponse(call: Call<PopularTv>, response: Response<PopularTv>) {
                if (response.isSuccessful) {
                    val popularTvShows = response.body()
                    val tvShowList = popularTvShows?.results
                    if (tvShowList != null) {
                        var tvShowAdapter = TvShowAdapter(tvShowList) {}
                        recycle_view_activities.adapter = tvShowAdapter
                    }

                }
            }


            override fun onFailure(call: Call<PopularTv>, t: Throwable) {

            }
        })
        }
    }


