package com.example.momstrongmove

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.util.Log

class HomeStrongActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_strong)

        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNavViewBar)

        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val menu = bottomNavigation.menu

        val menuItem = menu.getItem(1)

        menuItem.setChecked(true)
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.progress -> {
                Log.i("Clicking", "Progress Clicked")
//                val progressFragment = ProgressFragment.newInstance()
//                openFragment(progressFragment)

                val intent = Intent(this, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
            R.id.home_strong -> {
                Log.i("Clicking", "Home Strong Clicked")
//                val intent = Intent(this, HomeStrongActivity::class.java)
//                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
            R.id.gym_strong -> {
                Log.i("Clicking", "Gym Strong Clicked")
                val intent = Intent(this, GymStrongActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
        }

        false
    }
}
