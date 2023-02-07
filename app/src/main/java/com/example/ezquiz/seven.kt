package com.example.ezquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_seven.*

class seven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven)

        A8.setOnClickListener {
            val intent = Intent(this@seven, eight::class.java)
            startActivity(intent)
        }

        B8.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "มั่วรึเปล่าาา", Toast.LENGTH_SHORT)
            myToast.show()
        }

        C8.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "มั่วรึเปล่าาา", Toast.LENGTH_SHORT)
            myToast.show()
        }


        D8.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "มั่วรึเปล่าาา", Toast.LENGTH_SHORT)
            myToast.show()
        }
    }
}