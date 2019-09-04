package com.example.momstrongmove

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.gym_detail_row.view.*

class GymStrongDetailAdapter : RecyclerView.Adapter<DetailCustomViewHolder>() {

    val details = listOf<String>("Detail One", "Detail Two", "Detail Three")

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): DetailCustomViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        val cellForRow = layoutInflater.inflate(R.layout.gym_detail_row, p0, false)
        return DetailCustomViewHolder(cellForRow)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(p0: DetailCustomViewHolder, p1: Int) {
        val detail = details.get(p1)
        p0.view.gym_detail_row_section_title.text = detail
    }

}

class DetailCustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {

}