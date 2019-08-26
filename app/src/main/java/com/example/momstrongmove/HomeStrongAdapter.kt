package com.example.momstrongmove

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_home_strong.view.*
import kotlinx.android.synthetic.main.video_row.view.*

class HomeStrongAdapter(val homeFeed: Models.HomeFeed) : RecyclerView.Adapter<CustomViewHolder>() {

//    val videoTitles = listOf<String>("First Video", "Second Video", "Third Video", "Fourth Video")

    override fun getItemCount(): Int {
        return homeFeed.videos.size
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row, p0, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(p0: CustomViewHolder, p1: Int) {
        val video = homeFeed.videos.get(p1)
        p0.view.video_row_label.text = video.name
        p0.view.home_comment_label.text = video.channel.toString()
        p0.view.home_duration_label.text = "Duration: " + video.numberOfViews.toString()

        val thumbnailImageView = p0.view.home_video_pic
        Picasso.get().load(video.imageUrl).into(thumbnailImageView)

    }
}

class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

}