package com.example.session2

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.session2.databinding.ActivitySignInBinding
import com.example.session2.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binder: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }
}