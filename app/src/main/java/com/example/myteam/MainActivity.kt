package com.example.myteam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Это комметарий
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "msg", Toast.LENGTH_SHORT).show()
    }
}