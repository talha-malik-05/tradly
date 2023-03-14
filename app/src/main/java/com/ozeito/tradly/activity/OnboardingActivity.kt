package com.ozeito.tradly.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ozeito.tradly.R
import com.ozeito.tradly.databinding.ActivityOnboardingBinding
import com.ozeito.tradly.utils.Consts

class OnboardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardingBinding
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initiate()
        setListener()

    }

    private fun initiate(){
        binding.introImage.setImageResource(Consts.ONBOARDINGS_IMAGES[currentIndex])
        binding.introTitle.text = Consts.ONBOARDINGS_TITLES[currentIndex]
    }

    private fun setListener(){
        binding.btnNext.setOnClickListener {
            if (currentIndex == Consts.ONBOARDINGS_IMAGES.size-1){
                Intent(this,LoginActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            }else{
                currentIndex++
                changeView()
            }
        }
    }

    private fun changeView() {
        if (currentIndex == Consts.ONBOARDINGS_IMAGES.size-1){
            binding.btnNext.text = "Finish"
        }
        if (currentIndex > -1 && currentIndex < Consts.ONBOARDINGS_IMAGES.size){
            binding.introImage.setImageResource(Consts.ONBOARDINGS_IMAGES[currentIndex])
            binding.introTitle.text = Consts.ONBOARDINGS_TITLES[currentIndex]
        }
        when (currentIndex) {
            1 -> {
                binding.imgCircle1.setImageResource(R.drawable.dot_not_selected)
                binding.imgCircle2.setImageResource(R.drawable.dot_selected)
                binding.imgCircle3.setImageResource(R.drawable.dot_not_selected)
            }
            2 -> {
                binding.imgCircle1.setImageResource(R.drawable.dot_not_selected)
                binding.imgCircle2.setImageResource(R.drawable.dot_not_selected)
                binding.imgCircle3.setImageResource(R.drawable.dot_selected)
            }
        }
    }

}