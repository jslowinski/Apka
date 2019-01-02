package com.swapi.swapikotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class FoodDetail : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar!!.title = "Szczegóły"
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
        val message = intent.getStringExtra("OpeningCrawl")
        val name = intent.getStringExtra("Name")

        val titleText: TextView = findViewById(R.id.food_name)
        titleText.text = name

        findViewById<TextView>(R.id.food_description).apply {
            text = message
        }


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        return true
    }
}
