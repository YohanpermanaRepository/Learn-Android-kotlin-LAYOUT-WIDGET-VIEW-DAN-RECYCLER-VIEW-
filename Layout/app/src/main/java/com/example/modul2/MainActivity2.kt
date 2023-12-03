package com.example.modul2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relatif)
    }

    fun lanjut(view: View) {
        val kedua = Intent(this, MainActivity::class.java)
        startActivity(kedua)
    }
}