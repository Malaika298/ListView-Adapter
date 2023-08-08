package com.example.listviewadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import com.example.listviewadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tasklist = arrayListOf<String>()

        tasklist.add("Attend Exam")
        tasklist.add("Improve Online Presence")
        tasklist.add("Work On Resume")
        tasklist.add("Complete the App Dev Project")
        tasklist.add("Learn Kotlin")
        tasklist.add("Visit LGS")

        val adapterForMyListView = ArrayAdapter(this, android.R.layout.simple_list_item_1, tasklist)

        binding.ListView.adapter = adapterForMyListView
        
        binding.ListView.setOnItemClickListener { parent, view, position, id ->

            val text = "Clicked on item: " + (view as TextView).text.toString()

            Toast.makeText(this, "$text", Toast.LENGTH_SHORT).show()
        }
    }
}