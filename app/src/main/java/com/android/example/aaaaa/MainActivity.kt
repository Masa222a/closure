package com.android.example.aaaaa

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main(){
    fun result(x: Int, y: Int, func: (Int) -> Unit) {
        val result = x + y
        Handler(Looper.getMainLooper()).postDelayed({
            println(func(result))
        }, 1000)
    }
    result(1, 2){it}
}


