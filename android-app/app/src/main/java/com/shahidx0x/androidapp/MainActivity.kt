package com.shahidx0x.androidapp

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)
        textView.text = "Android app setup started."
        textView.textSize = 18f
        setContentView(textView)
    }
}
