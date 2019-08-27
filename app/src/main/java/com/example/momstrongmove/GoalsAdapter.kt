package com.example.momstrongmove

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.goal_row.view.*

class GoalsAdapter: RecyclerView.Adapter<GoalsViewHolder>() {

    val goals = listOf<String>("goal 1", "goal 2", "goal 3")

    override fun getItemCount(): Int {
        return 3
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): GoalsViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        val goalsRow = layoutInflater.inflate(R.layout.goal_row, p0, false)
        return GoalsViewHolder(goalsRow)
    }

    override fun onBindViewHolder(p0: GoalsViewHolder, p1: Int) {
        val goal = goals.get(p1)
        p0.view.goals_row_textView.text = goal
    }
    
}

class GoalsViewHolder(val view: View): RecyclerView.ViewHolder(view) {

}