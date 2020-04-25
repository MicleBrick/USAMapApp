package com.github.miclebrick.usamapapp

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.PointF
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.core.graphics.minus
import androidx.core.graphics.toPointF
import kotlinx.android.synthetic.main.activity_state_details.*
import kotlin.math.abs

class StateDetailsActivity : AppCompatActivity() {
    companion object {
        fun open(context: Context, state: State) {
            Toast.makeText(context, "Opening state ${state.name}", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, StateDetailsActivity::class.java)
            intent.putExtra("state", state.name)
            context.startActivity(intent)
        }
    }

    private lateinit var state: State
    private lateinit var scaleDetector: ScaleGestureDetector
    private lateinit var flingDetector: GestureDetector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state_details)
        setBackground()
        loadState()
        setupNavigation()
    }

    private fun setBackground() {

    }

    @SuppressLint("SetTextI18n")
    private fun loadState() {
        val stateName = checkNotNull(intent.getStringExtra("state"))
        state = State.valueOf(stateName)
        stateNameView.text = state.name
        populationView.text = "Population: ${state.population}"
        capitalView.text = "Capital: ${state.capital}"
        setupVideo()
    }

    private fun setupVideo() {
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

    private fun setupNavigation() {
        setupZoomOut()
        setupFling()
    }

    private fun setupZoomOut() {
        scaleDetector = ScaleGestureDetector(this, ScaleListener())
    }

    private inner class ScaleListener : ScaleGestureDetector.SimpleOnScaleGestureListener() {
        override fun onScale(detector: ScaleGestureDetector): Boolean {
            if (detector.scaleFactor < 1) {
                goHome()
                return true
            }
            return false
        }
    }

    private fun goHome() {
        Toast.makeText(this, "Returning to map", Toast.LENGTH_SHORT).show()
        val intent = Intent(this@StateDetailsActivity, HomepageActivity::class.java)
        startActivity(intent)
    }

    private fun setupFling() {
        flingDetector = GestureDetector(this, GestureListener())
    }

    private inner class GestureListener : GestureDetector.SimpleOnGestureListener() {
        override fun onDown(e: MotionEvent): Boolean {
            return true
        }

        override fun onFling(e1: MotionEvent, e2: MotionEvent, vx: Float, vy: Float): Boolean {
            val nextState = State.values()
                .filter { it != state }
                .filter { cosineSimilarity(offset(it), PointF(-vx, -vy)) < 30 }
                .minBy { manhattanDistance(it.viewPoint.toPointF(), state.viewPoint.toPointF()) }
                ?: return false
            open(this@StateDetailsActivity, nextState)
            return true
        }

        private fun cosineSimilarity(p1: PointF, p2: PointF) =
            (p1.x * p2.x + p1.y * p2.y) / (p1.length() * p2.length())

        private fun manhattanDistance(p1: PointF, p2: PointF) =
            abs(p2.x - p1.x) + abs(p2.y - p1.y)

        private fun offset(s: State): PointF {
            return s.viewPoint.toPointF() - state.viewPoint.toPointF()
        }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        scaleDetector.onTouchEvent(event)
        flingDetector.onTouchEvent(event)
        return true
    }
}
