package com.example.momstrongmove


import android.icu.util.Calendar
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_month.*

/**
 * A simple [Fragment] subclass.
 */
class fragment_month : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_month, container, false)

//        val calendar = Calendar.getInstance()
//        calendar.set(2019, 7)
//
//        calendarView.setDate(calendar)
    }


}
