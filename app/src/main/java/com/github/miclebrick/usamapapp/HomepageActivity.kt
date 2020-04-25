package com.github.miclebrick.usamapapp

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_homepage.*


class HomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        imageView.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.usa_map))
    }
}
