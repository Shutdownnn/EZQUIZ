package com.example.ezquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_one.*
import kotlinx.android.synthetic.main.activity_three.*

class three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        A4.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "มั่วรึเปล่าาา", Toast.LENGTH_SHORT)
            myToast.show()
        }

        B4.setOnClickListener {
            val intent = Intent(this@three, four::class.java)
            startActivity(intent)
        }

        C4.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "มั่วรึเปล่าาา", Toast.LENGTH_SHORT)
            myToast.show()
        }


        D4.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "มั่วรึเปล่าาา", Toast.LENGTH_SHORT)
            myToast.show()
        }
    }
}