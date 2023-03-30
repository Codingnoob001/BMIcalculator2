package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    var theItems : MutableList<data> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmirecycler)

        //importing views
        val bmi = findViewById<TextView>(R.id.leftTextView)
        //val date = findViewById<TextView>(R.id.leftBottomTextView)
        val value = findViewById<TextView>(R.id.Result)

        /* adapter stuff*/
        var adapter = BmiAdapter(theItems)
        var recycler = findViewById<RecyclerView>(R.id.BMI)
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this )

        adapter.notifyDataSetChanged();

        //passing result to new activity
        val message = intent.getStringExtra("Message")
       val result = findViewById<TextView>(R.id.Result).apply {
           text = message.toString()
       }

        //trying to display values
        val text = bmi.text.toString()
       //val textlink = date.text.toString()
       val vals = result.text.toString()
       val disp = data(text, vals)

        theItems.add(disp)



       //(application as BmiApplication).db.BmiDao().deleteAll()
        //(application as BmiApplication).db.BmiDao().insertAll(TODO())
           /** BmiEntity(
                DisplayBmi(
                    title = text,
                    BmiValue = vals?
        ))**/

    }
}