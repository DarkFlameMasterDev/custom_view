package com.czb.custom_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.czb.custom_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  private lateinit var mainBinding: ActivityMainBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    mainBinding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(mainBinding.root)
    initView()
  }

  private fun initView() {
    mainBinding.root.onInterceptTouchEvent()
  }
}