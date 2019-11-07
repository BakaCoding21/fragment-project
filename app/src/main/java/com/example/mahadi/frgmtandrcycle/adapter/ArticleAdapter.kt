package com.example.mahadi.frgmtandrcycle.adapter

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import com.example.mahadi.frgmtandrcycle.R
import com.example.mahadi.frgmtandrcycle.model.ArticleModel
import java.util.ArrayList

class ArticleAdapter : RecyclerView.Adapter<DataViewHolderArticle>(),Filterable {
    override fun onBindViewHolder(holder: DataViewHolderArticle?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private var articleSearchList:MutableList<ArticleModel> = mutableListOf()
    private val dataArticle: MutableList<ArticleModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolderArticle {
        return DataViewHolderArticle(LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false))

    }
    init {
        articleSearchList = dataArticle
    }
    override fun getItemCount(): Int {
        return articleSearchList!!.size
    }
    override fun getFilter(): Filter {

        return object : Filter() {
            override fun performFiltering(charSequence: CharSequence): Filter.FilterResults {
                val charString = charSequence.toString()
                if (charString.isEmpty()) {
                    articleSearchList=dataArticle
                } else {
                    var filteredList = arrayListOf<ArticleModel>()
                    for (row in dataArticle) {

                        if (row.title!!.toLowerCase().contains(charString.toLowerCase()))  {
                            filteredList.add(row)
                        }
                    }

                    articleSearchList = filteredList
                }

                val filterResults = Filter.FilterResults()
                filterResults.values = articleSearchList
                return filterResults
            }

            override fun publishResults(charSequence: CharSequence, filterResults: Filter.FilterResults) {
                articleSearchList = filterResults.values as ArrayList<ArticleModel>
                notifyDataSetChanged()
            }
        }
    }


    fun setData(datas: List<ArticleModel>) {
        dataArticle.addAll(datas)
        notifyDataSetChanged()
    }


}

class DataViewHolderArticle(itemView: View, var article: ArticleModel? = null) : RecyclerView.ViewHolder(itemView) {
    var txtJudulArticle: TextView
    var txtCreatedAtArticle: TextView
    companion object {
        val ARTICLE_TITLEARTICLE_KEY = "JUDULARTICLE"
        val ARTICLE_CONTENT_KEY = "CONTENTARTICLE"
        val ARTICLE_TANGGALARTICLE_KEY = "TANGGALTERBIT"
        val ARTICLE_FOTOARTICLE_KEY = "FOTOARTICLE"


    }

    init {
        txtJudulArticle = itemView.findViewById(R.id.txtJudulArticle)
        txtCreatedAtArticle = itemView.findViewById(R.id.txtTanggal)
    }
}