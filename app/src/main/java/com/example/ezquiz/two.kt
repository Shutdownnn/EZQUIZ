package com.example.ezquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_one.*
import kotlinx.android.synthetic.main.activity_two.*

class two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        A3.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "มั่วรึเปล่าาา", Toast.LENGTH_SHORT)
            myToast.show()
        }

        B3.setOnClickListener {
            val intent = Intent(this@two, three::class.java)
            startActivity(intent)
        }

        C3.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "มั่วรึเปล่าาา", Toast.LENGTH_SHORT)
            myToast.show()
        }


        D3.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "มั่วรึเปล่าาา", Toast.LENGTH_SHORT)
            myToast.show()
        }
    }
}