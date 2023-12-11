package com.czb.custom_view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.Drawable
import android.text.TextPaint
import android.util.AttributeSet
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import androidx.core.view.GestureDetectorCompat

class TouchView : View {

  val gestureDetectorCompat by lazy {
    GestureDetectorCompat(context, object : GestureDetector.SimpleOnGestureListener() {
      override fun onDown(e: MotionEvent): Boolean {
        return true
      }

      override fun onShowPress(e: MotionEvent) {
        super.onShowPress(e)
      }

      override fun onSingleTapUp(e: MotionEvent): Boolean {
        return super.onSingleTapUp(e)
      }

      override fun onScroll(
        e1: MotionEvent,
        e2: MotionEvent,
        distanceX: Float,
        distanceY: Float
      ): Boolean {
        return super.onScroll(e1, e2, distanceX, distanceY)
      }

      override fun onLongPress(e: MotionEvent) {
        super.onLongPress(e)
      }

      override fun onFling(
        e1: MotionEvent,
        e2: MotionEvent,
        velocityX: Float,
        velocityY: Float
      ): Boolean {
        return super.onFling(e1, e2, velocityX, velocityY)
      }

      /**
       * 确认是单击而不是双击，也就是过了双击确认的时间，就会调用这个函数
       * @param e MotionEvent
       * @return Boolean
       */
      override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
        return super.onSingleTapConfirmed(e)
      }

      override fun onDoubleTap(e: MotionEvent): Boolean {

        return true
      }

      /**
       * 双击结束后，按住不松手，会继续回调事件，按住会继续回调事件，直到手抬起
       * @param e MotionEvent
       * @return Boolean
       */
      override fun onDoubleTapEvent(e: MotionEvent): Boolean {
        return super.onDoubleTapEvent(e)
      }

      override fun onContextClick(e: MotionEvent): Boolean {
        return super.onContextClick(e)
      }
    })
  }

  constructor(context: Context) : super(context)
  constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
  constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
    context,
    attrs,
    defStyle
  )

  override fun onTouchEvent(event: MotionEvent): Boolean {
    return event.actionMasked == MotionEvent.ACTION_DOWN
  }


}