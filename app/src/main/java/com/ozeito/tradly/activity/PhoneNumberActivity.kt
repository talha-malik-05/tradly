package com.ozeito.tradly.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ozeito.tradly.databinding.ActivityPhoneNumberBinding

class PhoneNumberActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPhoneNumberBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhoneNumberBinding.inflate(layoutInflater)
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
        binding.btnSend.setOnClickListener {
            Intent(this,CodeVerificationActivity::class.java).also {
                startActivity(it)
            }
        }
    }

}