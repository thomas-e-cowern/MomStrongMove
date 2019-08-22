package com.example.momstrongmove

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_follow_meg.*

class FollowMegActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_follow_meg)

        val momstrongutah = momstrongutah_button
        val momstrongmove = momstrongmove_button

        momstrongutah.setOnClickListener {
            val url = "https://www.instagram.com/momstrongutah/"
            val go = Intent(Intent.ACTION_VIEW)
            go.data = Uri.parse(url)
            startActivity(go)
        }

        momstrongmove.setOnClickListener {
            val url = "https://www.instagram.com/momstrongmove/"
            val go = Intent(Intent.ACTION_VIEW)
            go.data = Uri.parse(url)
            startActivity(go)
        }
    }




}
