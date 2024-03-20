package com.example.myrecyclerview

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import layout.GridEnhypenAdapter


class MainActivity : AppCompatActivity() {
    private lateinit var rvEnhypen: RecyclerView
    private var list: ArrayList<Enhypen> = arrayListOf()
    private fun showRecyclerGrid() {
        rvEnhypen.layoutManager = GridLayoutManager(this, 2)
        val gridEnhypenAdapter = GridEnhypenAdapter(list)
        rvEnhypen.adapter = gridEnhypenAdapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvEnhypen = findViewById(R.id.rv_enhypen);
        rvEnhypen?.setHasFixedSize(true);

        list.addAll(EnhypenData.listData);
        showRecyclerList();
    }

    private fun showRecyclerList() {
        rvEnhypen?.layoutManager = LinearLayoutManager(this)
        val listEnhypenAdapter = ListEnhypenAdapter(list)
        rvEnhypen.adapter = listEnhypenAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode){
            R.id.action_list -> {
                showRecyclerList()
            }
            R.id.action_grid -> {
                showRecyclerGrid()
            }
            R.id.action_cardview -> {
            }
        }
    }
}