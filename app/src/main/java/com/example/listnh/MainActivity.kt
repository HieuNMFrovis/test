package com.example.listnh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listnh.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var gridViewFragment: GridViewFragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavigator.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_theme -> replaceFragment()
                else -> {
                }
            }
            true
        }
    }

    private fun replaceFragment() {
        val fragmentManager = supportFragmentManager
        gridViewFragment = gridViewFragment ?: GridViewFragment()
        val fragmentTransition = fragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.fragment_layout,  gridViewFragment!!)
        fragmentTransition.commit()
    }
}