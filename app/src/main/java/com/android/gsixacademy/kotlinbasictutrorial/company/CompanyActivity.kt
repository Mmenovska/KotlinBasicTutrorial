package com.android.gsixacademy.kotlinbasictutrorial.company

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.gsixacademy.kotlinbasictutrorial.R
import com.android.gsixacademy.kotlinbasictutrorial.api.ServiceBuilder
import com.android.gsixacademy.kotlinbasictutrorial.api.TheMovieDbApi
import com.android.gsixacademy.kotlinbasictutrorial.models.CompanyDetail
import kotlinx.android.synthetic.main.activity_recycleview.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class CompanyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycleview)


        val request = ServiceBuilder.buildService(TheMovieDbApi::class.java)
        val call = request.getCompanyDetails("8dd3a40cdacd660d79bce7c46bad942e")
        call.enqueue(object : Callback<CompanyDetail> {
            override fun onResponse(call: Call<CompanyDetail>, response: Response<CompanyDetail>) {
                if (response.isSuccessful) {
                    val companyDetail = response.body()
                    val companyList = companyDetail?.results
                    if (companyList!=null){
                        var companyAdapter = CompanyAdapter(companyList){}

                        recycle_view_activities.adapter = companyAdapter
                        }

                    }
                }


            override fun onFailure(call: Call<CompanyDetail>, t: Throwable) {

            }
        })




    }
    }


