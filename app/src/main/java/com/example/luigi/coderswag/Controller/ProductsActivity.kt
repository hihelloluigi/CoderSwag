package com.example.luigi.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.luigi.coderswag.R
import com.example.luigi.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringArrayExtra(EXTRA_CATEGORY)
    }
}
