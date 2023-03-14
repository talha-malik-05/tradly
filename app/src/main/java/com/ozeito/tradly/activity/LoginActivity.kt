package com.ozeito.tradly.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ozeito.tradly.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initiate()
        setListener()

    }

    private fun initiate(){

    }

    private fun setListener(){
        binding.btnLogin.setOnClickListener {
            Intent(this,MainActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }
        binding.txtSignup.setOnClickListener {
            Intent(this,RegisterActivity::class.java).also {
                startActivity(it)
            }
        }
    }

}