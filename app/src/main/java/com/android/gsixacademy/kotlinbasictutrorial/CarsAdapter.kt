package com.android.gsixacademy.kotlinbasictutrorial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycleview_list_item.view.*

class CarsAdapter (val items : ArrayList<Car>) :RecyclerView.Adapter <RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.recycleview_list_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var myViewHolder = holder as MyViewHolder
        myViewHolder.bindData(items[position])
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindData(itemModel: Car) {
            itemView.text_view_description.text = itemModel.description
            itemView.text_view_title.text = itemModel.title
            itemView.image_view_car.setImageResource(itemModel.imageResource)
        }
    }
}