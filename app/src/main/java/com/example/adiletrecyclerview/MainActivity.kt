package com.example.adiletrecyclerview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import com.example.adiletrecyclerview.adapter.FioAdapter
import com.example.adiletrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val adapter=FioAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvFio.adapter=adapter

        supportActionBar?.hide()
    }
}