package com.github.miclebrick.usamapapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.github.miclebrick.usamapapp.splash_pages.Splash1
import com.github.miclebrick.usamapapp.splash_pages.Splash2
import com.github.miclebrick.usamapapp.splash_pages.Splash3
import com.github.miclebrick.usamapapp.splash_pages.Splash4
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        pagerView.adapter = SplashPagerAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(pagerView)
        button.setOnClickListener {
            startActivity(Intent(this, HomepageActivity::class.java))
        }
    }

    private inner class SplashPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
        override fun getCount(): Int = 4

        override fun getItem(position: Int): Fragment = when (position) {
            0 -> Splash1()
            1 -> Splash2()
            2 -> Splash3()
            3 -> Splash4()
            else -> error("Unknown item $position")
        }
    }
}
