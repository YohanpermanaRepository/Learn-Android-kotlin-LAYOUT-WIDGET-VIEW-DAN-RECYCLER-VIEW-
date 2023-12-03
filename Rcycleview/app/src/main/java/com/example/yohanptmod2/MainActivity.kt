package com.example.modul22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.modul22.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = ArrayList<Users>()

        list.addAll(
            arrayOf(
                Users("Baris1","SAtu"),
                Users("Baris2","SAtu"),
                Users("Baris4","SAtu"),
                Users("Baris5","SAtu"),
                Users("Baris6","SAtu"),
                Users("Baris7","SAtu"),
                Users("Baris8","SAtu"),
                Users("Baris9","SAtu"),
                Users("Baris10","SAtu"),
                Users("Baris11","SAtu"),
                Users("Baris12","SAtu"),
                Users("Baris13","SAtu"),
                Users("Baris14","SAtu"),
                Users("Baris15","SAtu"),

            )
        )

        val myAdapter = MainAdapter(list)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = myAdapter
    }
}