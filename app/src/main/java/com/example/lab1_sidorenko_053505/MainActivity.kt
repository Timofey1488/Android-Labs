package com.example.lab1_sidorenko_053505

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nameList = ArrayList<String>()
        nameList.add("Метры")
        nameList.add("Километры")
        nameList.add("Сантиметры")

        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,nameList)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)




    }
}