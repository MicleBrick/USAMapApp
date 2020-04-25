package com.github.miclebrick.usamapapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_state_details.*

class StateDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state_details)
        fillData()
    }

    @SuppressLint("SetTextI18n")
    private fun fillData() {
        val stateName = checkNotNull(intent.getStringExtra("state"))
        val state = State.valueOf(stateName)
        stateNameView.text = state.name
        populationView.text = "Population: ${state.population}"
        capitalView.text = "Capital: ${state.capital}"
        setupVideo(state)
    }

    private fun setupVideo(state: State) {
        youtubeWebView.apply {
            webViewClient = object : WebViewClient() {
                override fun shouldOverrideUrlLoading(v: WebView, r: WebResourceRequest) = false
            }
            settings.apply {
                @SuppressLint("SetJavaScriptEnabled")
                javaScriptEnabled = true
                loadWithOverviewMode = true
                useWideViewPort = true
            }
            loadUrl("https://www.youtube.com/embed/${state.youtubeId}")
        }
    }
}
