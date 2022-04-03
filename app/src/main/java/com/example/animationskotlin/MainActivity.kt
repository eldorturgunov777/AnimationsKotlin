package com.example.animationskotlin

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var img:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        img = findViewById(R.id.img)
        val bounce = findViewById<Button>(R.id.bt_bounce)
        val sequential = findViewById<Button>(R.id.bt_sequential)
        val togather = findViewById<Button>(R.id.bt_togather)
        bounce.setOnClickListener { v: View? ->
            val animation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.bounce
            )
            img.startAnimation(animation)
        }
        sequential.setOnClickListener { v: View? ->
            val animation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.sequential
            )
            img.startAnimation(animation)
        }
        togather.setOnClickListener { v: View? ->
            val animation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.togather
            )
            img.startAnimation(animation)
        }
    }
}