package com.example.medguru

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, FirstPage :: class.java)
        startActivity(intent)

    }
}