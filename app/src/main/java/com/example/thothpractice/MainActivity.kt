package com.example.thothpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // to do
            }
        })

        // 1. Kotlin Interface 가 아닌 Java Interface 이어야 한다.
        // 2. 그 Interface 는 딱 하나의 메소드만 가져야 한다.

        button.setOnClickListener {
            // to do
        }
    }
}