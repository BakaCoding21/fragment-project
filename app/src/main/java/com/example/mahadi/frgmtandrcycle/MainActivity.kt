package com.example.mahadi.frgmtandrcycle

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.mahadi.frgmtandrcycle.R.*

class MainActivity : AppCompatActivity() {
    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager? = null
    private var viewPageAdapter: ViewPageAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        tabLayout = findViewById<View>(id.tabLayout_id) as TabLayout
        viewPager = findViewById<View>(id.pageViewId) as ViewPager
        viewPageAdapter = ViewPageAdapter(supportFragmentManager)
//     Add Fragment
        viewPageAdapter!!.AddFrmt(Frmt_call(), "")
        viewPageAdapter!!.AddFrmt(FrmtContact(), "")
        viewPageAdapter!!.AddFrmt(Frmt_fav(), "")
        viewPageAdapter!!.AddFrmt(ArticleActivity(), "")
        viewPageAdapter!!.AddFrmt(FrmtContact(), "")
        viewPageAdapter!!.AddFrmt(Frmt_fav(), "")
        viewPager!!.adapter = viewPageAdapter
        tabLayout!!.setupWithViewPager(viewPager)
        tabLayout!!.getTabAt(0)!!.setIcon(drawable.ic_call_black_24dp)
        tabLayout!!.getTabAt(1)!!.setIcon(drawable.ic_group_black_24dp)
        tabLayout!!.getTabAt(2)!!.setIcon(drawable.ic_favorite_black_24dp)
        tabLayout!!.getTabAt(3)!!.setIcon(drawable.ic_call_black_24dp)
        tabLayout!!.getTabAt(4)!!.setIcon(drawable.ic_group_black_24dp)
        tabLayout!!.getTabAt(5)!!.setIcon(drawable.ic_favorite_black_24dp)

        //Remove ActionBar Shadow


        val actionBar = supportActionBar
        actionBar!!.elevation = 0f
    }
}