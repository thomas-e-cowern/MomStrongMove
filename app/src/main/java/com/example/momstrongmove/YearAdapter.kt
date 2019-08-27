package com.example.momstrongmove

import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_year.view.*
import kotlinx.android.synthetic.main.year_row.view.*

class YearAdapter: RecyclerView.Adapter<YearViewHolder>() {

    val months = listOf<String>("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): YearViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        val monthRow = layoutInflater.inflate(R.layout.year_row, p0, false)
        return YearViewHolder(monthRow)
    }

    override fun getItemCount(): Int {
        return 12
    }

    override fun onBindViewHolder(p0: YearViewHolder, p1: Int) {
        val month = months.get(p1)
        p0.view.year_row_month_textView.text = month
    }

}

class YearViewHolder(val view: View): RecyclerView.ViewHolder(view) {

}