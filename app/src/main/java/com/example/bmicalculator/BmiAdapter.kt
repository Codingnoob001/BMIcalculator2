package com.example.bmicalculator

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BmiAdapter(private val items: List<data>): RecyclerView.Adapter<BmiAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val leftTextView: TextView
        val RightTextView: TextView
      //  val leftbottom: TextView

        init {
            leftTextView = itemView.findViewById(R.id.leftTextView)
            RightTextView = itemView.findViewById(R.id.Result)
          //  leftbottom = itemView.findViewById(R.id.leftBottomTextView)

        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.bmirecycler, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val items = items.get(position)
        holder.leftTextView.text = items.title
        holder.RightTextView.text = items.Righttitle
        //holder.leftbottom.text = items.leftbottom


    }

    override fun getItemCount(): Int {

        return items.size
    }

}

