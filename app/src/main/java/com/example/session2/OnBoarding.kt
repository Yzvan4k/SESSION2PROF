package com.example.session2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.session2.databinding.ActivityOnBoardingBinding

class OnBoarding : AppCompatActivity() {
    private lateinit var binding:ActivityOnBoardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.pager.isUserInputEnabled = false
    }
}