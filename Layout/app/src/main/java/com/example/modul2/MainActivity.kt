package com.example.modul2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linear)
    }

    fun lanjut(view: View) {
        val kedua = Intent(this, MainActivity2::class.java)
        startActivity(kedua)
    }
}