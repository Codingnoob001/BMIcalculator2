package com.example.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn = findViewById<Button>(R.id.btn)





        btn.setOnClickListener {
           callActivity()
            }
    }
        fun callActivity(){
            val height = findViewById<TextView>(R.id.height)
            val weight = findViewById<TextView>(R.id.weight)
            val h = (height.text).toString().toFloat() /100
            val w = weight.text.toString().toFloat()
            val res = (w/(h*h)).toString()

            val intent =  Intent(this, MainActivity2::class.java).also {
                it.putExtra("Message", res)
                startActivity(it)
        }

    }
}