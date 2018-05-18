package com.example.luigi.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import android.widget.Toast
import com.example.luigi.coderswag.Adapters.CategoryAdapter
import com.example.luigi.coderswag.Adapters.CategoryRecycleAdapter
import com.example.luigi.coderswag.R
import com.example.luigi.coderswag.Services.DataService
import com.example.luigi.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Array Adapter
    //lateinit var adapter: CategoryAdapter

    //Array Adapter
    //lateinit var adapter: ArrayAdapter<Category>

    //Recycler Adapter
    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Array Adapter
        //adapter = ArrayAdapter(this,
                //android.R.layout.simple_list_item_1,
                //DataService.categories)

        //Custom Adapter
        //adapter = CategoryAdapter(this,
               // DataService.categories)

        //Recycler Adapter
        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            var productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        //You can do this optimization if knows that cell height never change
        categoryListView.setHasFixedSize(true)


        //Did Select View
        //categoryListView.setOnItemClickListener { parent, view, position, id ->
         //   val category = DataService.categories[position]
         //   Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
       // }
    }
}
