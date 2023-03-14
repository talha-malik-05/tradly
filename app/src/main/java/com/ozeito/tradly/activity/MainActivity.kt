package com.ozeito.tradly.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ozeito.tradly.R
import com.ozeito.tradly.databinding.ActivityMainBinding
import com.ozeito.tradly.utils.Consts

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initiate()
        setListener()

    }

    private fun initiate(){

    }

    private fun setListener(){

    }

}