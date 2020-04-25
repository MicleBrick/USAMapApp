package com.github.miclebrick.usamapapp

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Matrix
import android.graphics.PointF
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
import kotlin.math.abs
import kotlin.math.min
import kotlin.math.roundToInt
import kotlin.math.roundToLong

class MapView(
    context: Context,
    attr: AttributeSet?
) : androidx.appcompat.widget.AppCompatImageView(context, attr) {
    private var customMatrix = Matrix()
    private var mode = NONE
    private var last = PointF()
    private var start = PointF()
    private var minScale = 1f
    private var maxScale = 4f
    private var m: FloatArray
    private var redundantXSpace = 0f
    private var redundantYSpace = 0f
    private var width = 0f
    private var height = 0f
    private var saveScale = 1f
    private var right = 0f
    private var bottom = 0f
    private var origWidth = 0f
    private var origHeight = 0f
    private var scaleDetector: ScaleGestureDetector
    private var bmWidth = 0f
    private var bmHeight = 0f

    private lateinit var bitmap: Bitmap

    override fun setImageBitmap(bm: Bitmap) {
        super.setImageBitmap(bm)
        bitmap = bm
        bmWidth = bm.width.toFloat()
        bmHeight = bm.height.toFloat()
    }

    private inner class ScaleListener : SimpleOnScaleGestureListener() {
        override fun onScaleBegin(detector: ScaleGestureDetector): Boolean {
            mode = ZOOM
            return true
        }

        override fun onScale(detector: ScaleGestureDetector): Boolean {
            var mScaleFactor = detector.scaleFactor
            val origScale = saveScale
            saveScale *= mScaleFactor
            if (saveScale > maxScale) {
                saveScale = maxScale
                mScaleFactor = maxScale / origScale
            } else if (saveScale < minScale) {
                saveScale = minScale
                mScaleFactor = minScale / origScale
            }
            right = width * saveScale - width - 2 * redundantXSpace * saveScale
            bottom = height * saveScale - height - 2 * redundantYSpace * saveScale
            if (origWidth * saveScale <= width || origHeight * saveScale <= height) {
                customMatrix.postScale(mScaleFactor, mScaleFactor, width / 2, height / 2)
                if (mScaleFactor < 1) {
                    customMatrix.getValues(m)
                    val x = m[Matrix.MTRANS_X]
                    val y = m[Matrix.MTRANS_Y]
                    if (mScaleFactor < 1) {
                        if ((origWidth * saveScale).roundToLong() < width) {
                            if (y < -bottom) {
                                customMatrix.postTranslate(0f, -(y + bottom))
                            } else {
                                if (y > 0) {
                                    customMatrix.postTranslate(0f, -y)
                                }
                            }
                        } else {
                            if (x < -right) {
                                customMatrix.postTranslate(-(x + right), 0f)
                            } else {
                                if (x > 0) {
                                    customMatrix.postTranslate(-x, 0f)
                                }
                            }
                        }
                    }
                }
            } else {
                customMatrix.postScale(
                    mScaleFactor,
                    mScaleFactor,
                    detector.focusX,
                    detector.focusY
                )
                customMatrix.getValues(m)
                val x = m[Matrix.MTRANS_X]
                val y = m[Matrix.MTRANS_Y]
                if (mScaleFactor < 1) {
                    if (x < -right) {
                        customMatrix.postTranslate(-(x + right), 0f)
                    } else {
                        if (x > 0) {
                            customMatrix.postTranslate(-x, 0f)
                        }
                    }
                    if (y < -bottom) {
                        customMatrix.postTranslate(0f, -(y + bottom))
                    } else if (y > 0) {
                        customMatrix.postTranslate(0f, -y)
                    }
                }
            }
            return true
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        width = MeasureSpec.getSize(widthMeasureSpec).toFloat()
        height = MeasureSpec.getSize(heightMeasureSpec).toFloat()
        val scale: Float
        val scaleX = width / bmWidth
        val scaleY = height / bmHeight
        scale = min(scaleX, scaleY)
        customMatrix.setScale(scale, scale)
        imageMatrix = customMatrix
        saveScale = 1f
        redundantYSpace = height - scale * bmHeight
        redundantXSpace = width - scale * bmWidth
        redundantYSpace /= 2f
        redundantXSpace /= 2f
        customMatrix.postTranslate(redundantXSpace, redundantYSpace)
        origWidth = width - 2 * redundantXSpace
        origHeight = height - 2 * redundantYSpace
        right = width * saveScale - width - 2 * redundantXSpace * saveScale
        bottom = height * saveScale - height - 2 * redundantYSpace * saveScale
        imageMatrix = customMatrix
    }

    companion object {
        const val NONE = 0
        const val DRAG = 1
        const val ZOOM = 2
        const val CLICK = 3
    }

    init {
        super.setClickable(true)
        scaleDetector = ScaleGestureDetector(context, ScaleListener())
        customMatrix.setTranslate(1f, 1f)
        m = FloatArray(9)
        imageMatrix = customMatrix
        scaleType = ScaleType.MATRIX
        setOnTouchListener { _, event ->
            scaleDetector.onTouchEvent(event)
            customMatrix.getValues(m)
            val x = m[Matrix.MTRANS_X]
            val y = m[Matrix.MTRANS_Y]
            val curr = PointF(event.x, event.y)
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    last[event.x] = event.y
                    start.set(last)
                    mode = DRAG
                }
                MotionEvent.ACTION_POINTER_DOWN -> {
                    last[event.x] = event.y
                    start.set(last)
                    mode = ZOOM
                }
                MotionEvent.ACTION_MOVE -> {
                    if (mode == ZOOM || mode == DRAG && saveScale > minScale) {
                        var deltaX = curr.x - last.x
                        var deltaY = curr.y - last.y
                        val scaleWidth = (origWidth * saveScale).roundToInt()
                        val scaleHeight = (origHeight * saveScale).roundToInt()
                        if (scaleWidth < width) {
                            deltaX = 0f
                            if (y + deltaY > 0) {
                                deltaY = -y
                            } else if (y + deltaY < -bottom) {
                                deltaY = -(y + bottom)
                            }
                        } else if (scaleHeight < height) {
                            deltaY = 0f
                            if (x + deltaX > 0) {
                                deltaX = -x
                            } else if (x + deltaX < -right) {
                                deltaX = -(x + right)
                            }
                        } else {
                            if (x + deltaX > 0) {
                                deltaX = -x
                            } else if (x + deltaX < -right) {
                                deltaX = -(x + right)
                            }
                            if (y + deltaY > 0) {
                                deltaY = -y
                            } else if (y + deltaY < -bottom) {
                                deltaY = -(y + bottom)
                            }
                        }
                        customMatrix.postTranslate(deltaX, deltaY)
                        last[curr.x] = curr.y
                    }
                }
                MotionEvent.ACTION_UP -> {
                    mode = NONE
                    val xDiff = abs(curr.x - start.x).toInt()
                    val yDiff = abs(curr.y - start.y).toInt()
                    if (xDiff < CLICK && yDiff < CLICK) {
                        performClick()
                        findState(event)?.let(::onStateTouched)
                    }
                }
                MotionEvent.ACTION_POINTER_UP -> mode = NONE
            }
            imageMatrix = customMatrix
            invalidate()
            true
        }
    }

    private fun findState(event: MotionEvent): State? {
        val inverse = Matrix()
        imageMatrix.invert(inverse)
        val touchPoint = floatArrayOf(event.x, event.y)
        inverse.mapPoints(touchPoint)
        val w1 = drawable.intrinsicWidth
        val w2 = 800
        val h1 = drawable.intrinsicHeight
        val h2 = 566
        val x = (touchPoint[0] / w1 * w2).toInt()
        val y = (touchPoint[1] / h1 * h2).toInt()
        return State.values().firstOrNull {
            it.nameRect.intersects(x - 5, y - 5, x + 5, y + 5)
        }
    }

    private fun onStateTouched(state: State) {
        val intent = Intent(context, StateDetailsActivity::class.java)
        intent.putExtra("state", state.name)
        context.startActivity(intent)
    }
}