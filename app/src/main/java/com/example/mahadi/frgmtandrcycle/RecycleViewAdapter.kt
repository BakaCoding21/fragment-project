package com.example.mahadi.frgmtandrcycle

import android.content.Context
import android.support.v7.widget.RecyclerView.Adapter
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.mahadi.frgmtandrcycle.R.id
import com.example.mahadi.frgmtandrcycle.R.layout

/**
 * Created by Mahadi on 3/11/2018.
 */

class RecycleViewAdapter(internal var context: Context, internal var contactList: List<Contact>) : Adapter<RecycleViewAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v: View
        v = LayoutInflater.from(context).inflate(layout.item_contact, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text = contactList[position].name
        holder.phone_num.text = contactList[position].phn
        holder.imageView.setImageResource(contactList[position].photo)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    class MyViewHolder(itemView: View) : ViewHolder(itemView) {
        internal var name: TextView
        internal var phone_num: TextView
        internal var imageView: ImageView

        init {
            name = itemView.findViewById<View>(id.name_contact) as TextView
            phone_num = itemView.findViewById<View>(id.ph_number) as TextView
            imageView = itemView.findViewById<View>(id.img) as ImageView
        }
    }

}