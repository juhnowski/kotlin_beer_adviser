package com.juhnowski.ilya.beeradviser

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class FindBeerActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_beer)

    }

    fun findBeer(view: View){
        val colorBeer = findViewById<Spinner?>(R.id.color_beer)
        val suggestBeer = findViewById<TextView?>(R.id.suggest_beer).apply {
            this?.text=""
            getBrands(colorBeer?.selectedItem as String).forEach { this?.append(it); this?.append("\n")}
        }

    }


}

    fun getBrands(color:String): List<String> {
        val result: MutableList<String> = mutableListOf()
        when(color) {
            "amber"-> {
                result.add("Jack Amber")
                result.add("Amber moose")
            }
            "light" -> {
                result.add("Jale pale ale")
                result.add("Gout staut")
            }
            "brown" -> {
                result.add("Brown ele")
                result.add("Ale brown")
            }
            "dark" -> {
                result.add("Dark ele")
                result.add("Ale dark")
            }
        }
        return result
    }
