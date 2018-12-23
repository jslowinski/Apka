package com.swapi.swapikotlin.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.swapi.swapikotlin.R

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val actionBar = supportActionBar
        actionBar!!.title = "Koszyk"
        actionBar.setDisplayHomeAsUpEnabled(true)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}