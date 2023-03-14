package com.ozeito.tradly.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ozeito.tradly.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
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
        binding.btnCreate.setOnClickListener {
            Intent(this,PhoneNumberActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.txtSignin.setOnClickListener {
            Intent(this,LoginActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }
    }

}