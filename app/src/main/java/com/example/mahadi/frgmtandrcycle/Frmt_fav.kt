package com.example.mahadi.frgmtandrcycle

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mahadi.frgmtandrcycle.R.layout

/**
 * Created by Mahadi on 3/7/2018.
 */

class Frmt_fav : Fragment() {
    internal var v: View? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        v = inflater.inflate(layout.fav_frmt, container, false)
        return v
    }
}