package com.android.gsixacademy.kotlinbasictutrorial.company

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.gsixacademy.kotlinbasictutrorial.R
import com.android.gsixacademy.kotlinbasictutrorial.models.CompanyResult
import com.android.gsixacademy.kotlinbasictutrorial.models.MovieResult
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.company_list_item.view.*
import kotlinx.android.synthetic.main.movie_list_item.view.*

class CompanyAdapter (
    val itemList : ArrayList<CompanyResult>,
    val companyAdapterClickEvent : (CompanyAdapterClickEvent) -> Unit
) : RecyclerView.Adapter <RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.company_list_item,
                parent,
                false
            )
        )
    }

override fun getItemCount(): Int {
    return itemList.size
}

override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    var myViewHolder = holder as MyViewHolder
    myViewHolder.bindData(itemList[position], position)
}

inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bindData(itemModel: CompanyResult, position: Int) {
        itemView.text_view_company_name.text = itemModel.name
        itemView.text_view_origin.text = itemModel.origin_country
        Picasso.get().load("https://image.tmdb.org/t/p/original/${itemModel.logo_path}").fit().into(itemView.image_view_company_logo)
        itemView.text_view_id.text = itemModel.id.toString()
    }
}

}