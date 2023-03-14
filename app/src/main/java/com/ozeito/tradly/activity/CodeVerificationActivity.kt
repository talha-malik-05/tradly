package com.ozeito.tradly.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ozeito.tradly.databinding.ActivityCodeVerificationBinding

class CodeVerificationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCodeVerificationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCodeVerificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initiate()
        setListener()

    }

    private fun initiate(){

    }

    private fun setListener(){
        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
        binding.btnVerify.setOnClickListener {
            Intent(this,MainActivity::class.java).also {
                startActivity(it)
                finishAffinity()
            }
        }
    }

}