package com.example.collapsingtoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import android.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import kotlinx.android.synthetic.main.activity_main.recyclerView
import kotlinx.android.synthetic.main.activity_main.toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        val list = arrayListOf<String>()
        for (x in 0..50) list.add("Item$x")

        val adapter = CustomAdapter(list)
        val manager = LinearLayoutManager(this, VERTICAL,false)
        recyclerView.layoutManager = manager
        recyclerView.adapter = adapter
    }
}
