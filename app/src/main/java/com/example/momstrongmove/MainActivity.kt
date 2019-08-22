package com.example.momstrongmove

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.widget.AppCompatImageButton
import android.util.Log
import android.widget.Button
import com.example.momstrongmove.ui.main.SectionsPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)

        val settings : AppCompatImageButton
        val megMessage : AppCompatImageButton
        settings = tool_bar_top_settings
        megMessage = tool_bar_top_meg_message

        settings.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }

        megMessage.setOnClickListener {
            val intent = Intent(this, MegMessageActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }

        // Bottom Navigation Menu
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNavViewBar)
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        // Bottom tabs are highlighted when selected
        val menu = bottomNavigation.menu
        val menuItem = menu.getItem(0)
        menuItem.setChecked(true)
        
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.progress -> {
                Log.i("Clicking", "Progress Clicked")

                return@OnNavigationItemSelectedListener true
            }
            R.id.home_strong -> {
                Log.i("Clicking", "Home Strong Clicked")
                val intent = Intent(this, HomeStrongActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                this.overridePendingTransition(0, 0)
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
            R.id.gym_strong -> {
                Log.i("Clicking", "Gym Strong Clicked")
                val intent = Intent(this, GymStrongActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                this.overridePendingTransition(0, 0)
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
        }

        false
    }
}
