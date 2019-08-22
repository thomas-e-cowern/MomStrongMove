package com.example.momstrongmove

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_account.*

class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val editButton = account_edit_button
        editButton.setOnClickListener {
            name_text_field.isClickable = true
        }
    }
}
