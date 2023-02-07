package com.example.ezquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_eight.*
import kotlinx.android.synthetic.main.activity_nine.*

class nine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nine)

        A10.setOnClickListener {
            val intent = Intent(this@nine, End::class.java)
            intent.putExtra("name", "ตอบคำถามครบแล้ว และถูกหมดทุกข้อ")
            startActivity(intent)
        }

        B10.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "มั่วรึเปล่าาา", Toast.LENGTH_SHORT)
            myToast.show()
        }

        C10.setOnClickListener {
            val intent = Intent(this@nine, End::class.java)
            intent.putExtra("name", "ตอบคำถามครบแล้ว และถูกหมดทุกข้อ")
            startActivity(intent)
        }

        D10.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "มั่วรึเปล่าาา", Toast.LENGTH_SHORT)
            myToast.show()
        }
    }
}