package com.example.momstrongmove

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class GymStrongAdapter: RecyclerView.Adapter<GymCustomViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): GymCustomViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        val cellForRow = layoutInflater.inflate(R.layout.gym_workout_row, p0, false)
        return GymCustomViewHolder(cellForRow)
    }

    override fun getItemCount(): Int {
        return 6
    }

    override fun onBindViewHolder(p0: GymCustomViewHolder, p1: Int) {

    }

}

class GymCustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    init {
        view.setOnClickListener {
            println("Test")

            val intent = Intent(view.context,GymStrongDetailActivity::class.java)

            view.context.startActivity(intent)
        }
    }

}