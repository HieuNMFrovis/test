package com.example.listnh

import android.graphics.ColorSpace
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listnh.adapter.MainAdapter
import com.example.listnh.databinding.ActivityMainBinding
import com.example.listnh.model.ImageModel
import com.example.listnh.utils.SampleData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var ImageModel = ArrayList<ColorSpace.Model>()
    var name = arrayOf(
        "image2",
        "image2",
        "image2",
        "image2",
        "image2",
        "image2",
        "image2",
        "image2",
        "image2",
        "image2"
    )
    var images = intArrayOf(
        R.drawable.image2,
        R.drawable.image2,
        R.drawable.image2,
        R.drawable.image2,
        R.drawable.image2,
        R.drawable.image2,
        R.drawable.image2,
        R.drawable.image2,
        R.drawable.image2,
        R.drawable.image2,)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    class CustomAdapter(
        var itemModel: ArrayList <ImageModel>,
    )
}