package com.example.luigi.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.luigi.coderswag.Adapters.CategoryAdapter
import com.example.luigi.coderswag.R
import com.example.luigi.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter
    //lateinit var adapter: ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //adapter = ArrayAdapter(this,
                //android.R.layout.simple_list_item_1,
                //DataService.categories)
        adapter = CategoryAdapter(this,
                DataService.categories)

        categoryListView.adapter = adapter
    }
}
