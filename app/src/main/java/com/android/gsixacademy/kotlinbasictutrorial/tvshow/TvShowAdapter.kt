package com.android.gsixacademy.kotlinbasictutrorial.tvshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.gsixacademy.kotlinbasictutrorial.R
import com.android.gsixacademy.kotlinbasictutrorial.models.LatestTvShows
import com.android.gsixacademy.kotlinbasictutrorial.models.TvResult
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.tv_show_list.view.*

class TvShowAdapter (
    val itemListTv: ArrayList<TvResult>,
    val tvShowAdapterClickEvent : (TvShowAdapterClickEvent) -> Unit
    ) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.tv_show_list,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return itemListTv.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var myViewHolder = holder as MyViewHolder
        myViewHolder.bindData(itemListTv[position], position)
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindData(itemModel: TvResult, position: Int) {
            itemView.text_view_tv_name.text = itemModel.name
            itemView.text_view_overview.text = itemModel.overview
            itemView.text_view_popularity.text = itemModel.popularity
            Picasso.get().load("https://image.tmdb.org/t/p/w342${itemModel.poster_path}").fit().into(itemView.image_view_poster_tv)

        }

    }
}