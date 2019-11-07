package com.example.mahadi.frgmtandrcycle

import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.mahadi.frgmtandrcycle.adapter.ArticleAdapter
import com.example.mahadi.frgmtandrcycle.api.masterAPI
import com.example.mahadi.frgmtandrcycle.model.ArticleModel
import com.example.mahadi.frgmtandrcycle.network.ApiNetwork
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.article_frmt.*
import java.util.*

class ArticleActivity : Fragment() {

    internal var v: View? = null
    internal var recyclerView: RecyclerView? = null
    internal var listCont: MutableList<ArticleModel>? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.article_frmt, container, false)
        recyclerView = view.findViewById<View>(R.id.rv_artikel) as RecyclerView
        val viewAdapter = listCont?.let { RecycleViewArticleAdapter(context, it) }
        recyclerView!!.layoutManager = LinearLayoutManager(activity)
        recyclerView!!.adapter = viewAdapter
        return view
    }

    private lateinit var articleAdapter: RecycleViewArticleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        val retrofit = masterAPI.getRetrofit.create(ApiNetwork::class.java)
        retrofit.getArtikel()
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { articleAdapter.setData(it.data)})

    }


}
