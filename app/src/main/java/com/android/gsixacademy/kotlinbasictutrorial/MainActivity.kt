package com.android.gsixacademy.kotlinbasictutrorial



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Contacts
import android.widget.ArrayAdapter
import android.widget.Toast
import com.android.gsixacademy.kotlinbasictutrorial.company.CompanyActivity
import com.android.gsixacademy.kotlinbasictutrorial.movies.PopularMoviesActivity
import com.android.gsixacademy.kotlinbasictutrorial.people.PopularPeopleActivity
import com.android.gsixacademy.kotlinbasictutrorial.tvshow.TvShowActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    var listActivities: ArrayList<String> =
        arrayListOf(
            "RelativeLayoutActivity",
            "CalculatorActivity",
            "TodoListActivity",
        "RecycleViewActivity",
        "RealCalculatorActivity",
            "LogInActivity",
            "PopularMoviesActivity",
            "PopularPeopleActivity",
            "CompanyActivity",
            "TvShowActivity"
        )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Picasso.get().load("https://149349300.v2.pressablecdn.com/wp-content/uploads/2019/06/3d-cube-background-4k-yo.jpg").fit().into(image_view_background)

        var activitiesAdapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, listActivities)
        list_view_activities.adapter = activitiesAdapter

        list_view_activities.setOnItemClickListener { adapterView, view, i, l ->
            var className = listActivities[i]
            Toast.makeText(applicationContext, className, Toast.LENGTH_LONG).show()
            when (className) {
                "RelativeLayoutActivity" -> startActivity(
                    Intent(
                        applicationContext,
                        RelativeLayoutActivity::class.java
                    )
                )
                "CalculatorActivity" -> startActivity(
                    Intent(
                        applicationContext,
                        CalculatorActivity::class.java
                    )
                )
                "RecycleViewActivity" -> startActivity(Intent(applicationContext, RecycleViewActivity :: class.java))
                "TodoListActivity" -> startActivity(
                    Intent(applicationContext, TodoListActivity::class.java)
                )
                "RealCalculatorActivity" -> startActivity(Intent(applicationContext, RealCalculatorActivity::class.java))
                "LogInActivity" -> startActivity(Intent(applicationContext, LogInActivity::class.java))
                "PopularMoviesActivity" -> startActivity(Intent(applicationContext, PopularMoviesActivity::class.java))
                "PopularPeopleActivity" -> startActivity(Intent(applicationContext, PopularPeopleActivity::class.java))
                "CompanyActivity" -> startActivity(Intent(applicationContext, CompanyActivity::class.java))
                "TvShowActivity" -> startActivity(Intent(applicationContext, TvShowActivity::class.java))

            }

        }

    }
}




