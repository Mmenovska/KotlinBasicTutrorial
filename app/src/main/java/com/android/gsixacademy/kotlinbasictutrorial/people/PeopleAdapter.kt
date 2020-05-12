package com.android.gsixacademy.kotlinbasictutrorial.people

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.gsixacademy.kotlinbasictutrorial.R
import com.android.gsixacademy.kotlinbasictutrorial.models.PersonResult
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.people_list_item.view.*

class PeopleAdapter(
    val itemListPeople: ArrayList<PersonResult>,
    val peopleAdapterClickEvent: (PeopleAdapterClickEvent) -> Unit
) :
RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.people_list_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return itemListPeople.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var myViewHolder = holder as MyViewHolder
        myViewHolder.bindData(itemListPeople[position], position)
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindData(itemModel: PersonResult, position: Int) {
            itemView.text_view_name.text = itemModel.name
            itemView.text_view_popularity.text = itemModel.popularity
            Picasso.get().load("https://image.tmdb.org/t/p/original/${itemModel.profile_path}").fit().fit().into(itemView.image_view_profile)
        }
    }
}