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
import com.example.mahadi.frgmtandrcycle.model.ArticleModel

/**
 * Created by Mahadi on 3/11/2018.
 */

class RecycleViewArticleAdapter(internal var context: Context, internal var articleList: List<ArticleModel>) : Adapter<RecycleViewArticleAdapter.MyViewHolder>() {
    internal var listCont: MutableList<ArticleModel>? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v: View
        v = LayoutInflater.from(context).inflate(layout.item_article, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txttitle.text = articleList[position].title
        holder.txtcreated.text = articleList[position].created_at

    }

    override fun getItemCount(): Int {
        return articleList.size
    }

    fun setData(datas: List<ArticleModel>) {
        listCont?.addAll(datas)
        notifyDataSetChanged()
    }

    class MyViewHolder(itemView: View) : ViewHolder(itemView) {
        internal var txttitle: TextView
        internal var txtcreated: TextView

        init {
            txttitle = itemView.findViewById<View>(id.txtJudulArticle) as TextView
            txtcreated = itemView.findViewById<View>(id.txtTanggal) as TextView
        }
    }

}