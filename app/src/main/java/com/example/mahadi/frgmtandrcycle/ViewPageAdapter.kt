package com.example.mahadi.frgmtandrcycle

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import java.util.*

class ViewPageAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {
    private val lstFrmt: MutableList<Fragment> = ArrayList()
    private val lstTitles: MutableList<String> = ArrayList()
    override fun getItem(position: Int): Fragment {
        return lstFrmt[position]
    }

    override fun getCount(): Int {
        return lstTitles.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return lstTitles[position]
    }

    fun AddFrmt(fragment: Fragment, titles: String) {
        lstFrmt.add(fragment)
        lstTitles.add(titles)
    }
}