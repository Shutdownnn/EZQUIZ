package com.example.ezquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_end.*

class End : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        val bundle = intent.extras
        val names = bundle!!.getString("name")
        textView11.setText(names)


    }
}