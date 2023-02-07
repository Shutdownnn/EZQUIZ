package com.example.ezquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_five.*
import kotlinx.android.synthetic.main.activity_four.*

class five : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        A6.setOnClickListener {
            val intent = Intent(this@five, six::class.java)
            startActivity(intent)
        }

        B6.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "มั่วรึเปล่าาา", Toast.LENGTH_SHORT)
            myToast.show()
        }

        C6.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "มั่วรึเปล่าาา", Toast.LENGTH_SHORT)
            myToast.show()
        }


        D6.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "มั่วรึเปล่าาา", Toast.LENGTH_SHORT)
            myToast.show()
        }
    }
}