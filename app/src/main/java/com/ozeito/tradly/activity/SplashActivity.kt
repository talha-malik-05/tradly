package com.ozeito.tradly.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ozeito.tradly.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.splashLayout.alpha = 0F
        binding.splashLayout.animate().setDuration(1500).alpha(1F).withEndAction {
            Intent(this,OnboardingActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }

    }
}