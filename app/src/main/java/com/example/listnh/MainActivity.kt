package com.example.listnh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listnh.adapter.MainAdapter
import com.example.listnh.databinding.ActivityMainBinding
import com.example.listnh.utils.SampleData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rvimage.adapter = MainAdapter(SampleData.collection)
        }
    }
}