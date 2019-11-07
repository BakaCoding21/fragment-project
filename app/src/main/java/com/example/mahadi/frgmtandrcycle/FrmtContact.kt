package com.example.mahadi.frgmtandrcycle

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mahadi.frgmtandrcycle.R.drawable
import com.example.mahadi.frgmtandrcycle.R.layout
import java.util.*

/**
 * Created by Mahadi on 3/7/2018.
 */

class FrmtContact : Fragment() {
    internal var v: View? = null
    internal var recyclerView: RecyclerView? = null
    internal var listCont: MutableList<Contact>? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(layout.contact_frmt, container, false)
        recyclerView = view.findViewById<View>(R.id.rv_artikel) as RecyclerView
        val viewAdapter = listCont?.let { RecycleViewAdapter(context, it) }
        recyclerView!!.layoutManager = LinearLayoutManager(activity)
        recyclerView!!.adapter = viewAdapter
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        listCont = ArrayList()
        (listCont as ArrayList<Contact>).add(Contact("Mahadi Hasan", "01717677540", drawable.ic_launcher_background))
        (listCont as ArrayList<Contact>).add(Contact("Mahadi Hasan", "01717677540", drawable.ic_launcher_background))
        (listCont as ArrayList<Contact>).add(Contact("Mahadi Hasan", "01717677540", drawable.ic_launcher_background))
        (listCont as ArrayList<Contact>).add(Contact("Mahadi Hasan", "01717677540", drawable.ic_launcher_background))
        (listCont as ArrayList<Contact>).add(Contact("Mahadi Hasan", "01717677540", drawable.ic_launcher_background))
        (listCont as ArrayList<Contact>).add(Contact("Mahadi Hasan", "01717677540", drawable.ic_launcher_background))
        (listCont as ArrayList<Contact>).add(Contact("Mahadi Hasan", "01717677540", drawable.ic_launcher_background))
        (listCont as ArrayList<Contact>).add(Contact("Mahadi Hasan", "01717677540", drawable.ic_launcher_background))
        (listCont as ArrayList<Contact>).add(Contact("Mahadi Hasan", "01717677540", drawable.ic_launcher_background))
        (listCont as ArrayList<Contact>).add(Contact("Mahadi Hasan", "01717677540", drawable.ic_launcher_background))
        (listCont as ArrayList<Contact>).add(Contact("Mahadi Hasan", "01717677540", drawable.ic_launcher_background))
        (listCont as ArrayList<Contact>).add(Contact("Mahadi Hasan", "01717677540", drawable.ic_launcher_background))
        (listCont as ArrayList<Contact>).add(Contact("Mahadi Hasan", "01717677540", drawable.ic_launcher_background))
        (listCont as ArrayList<Contact>).add(Contact("Mahadi Hasan", "01717677540", drawable.ic_launcher_background))
        (listCont as ArrayList<Contact>).add(Contact("Mahadi Hasan", "01717677540", drawable.ic_launcher_background))
        (listCont as ArrayList<Contact>).add(Contact("Mahadi Hasan", "01717677540", drawable.ic_launcher_background))
    }
}