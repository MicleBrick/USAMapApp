package com.github.miclebrick.usamapapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.BitmapFactory
import android.os.Bundle
import android.preference.PreferenceManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_homepage.*


class HomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (splashScreen()) {
            return
        }
        setContentView(R.layout.activity_homepage)
        imageView.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.usa_map))
    }

    private fun splashScreen(): Boolean {
        val prefs = getPreferences(Context.MODE_PRIVATE)
        if (!prefs.getBoolean("first_time", true)) {
            return false
        }
        prefs.edit().putBoolean("first_time", false).apply()
        startActivity(Intent(this, SplashActivity::class.java))
        finish()
        return true
    }
}
