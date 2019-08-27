package com.example.momstrongmove


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_year.*

/**
 * A simple [Fragment] subclass.
 */
class fragment_year : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_year, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        year_recyclerView.layoutManager = GridLayoutManager(activity?.applicationContext, 4, LinearLayoutManager.HORIZONTAL, false)
        year_recyclerView.adapter = YearAdapter()

    }


}
