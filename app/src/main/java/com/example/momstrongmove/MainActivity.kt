package com.example.momstrongmove

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.view.ViewPager
import android.util.Log
import android.widget.Switch
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNavViewBar)

        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.progress -> {
                Log.i("Clicking", "Progress Clicked")
//                val progressFragment = ProgressFragment.newInstance()
//                openFragment(progressFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.home_strong -> {
                Log.i("Clicking", "Home Strong Clicked")
                return@OnNavigationItemSelectedListener true
            }
            R.id.gym_strong -> {
                Log.i("Clicking", "Gym Strong Clicked")
                return@OnNavigationItemSelectedListener true
            }
        }

        false
    }
}
