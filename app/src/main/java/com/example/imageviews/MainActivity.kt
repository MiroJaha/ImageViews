package com.example.imageviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private var change=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView= findViewById(R.id.imageView)

    }

    fun change(view: View) {
        if (change==0){
            imageView.isVisible= false
            change=1
        }
        else{
            imageView.isVisible= true
            change=0
        }
    }
}