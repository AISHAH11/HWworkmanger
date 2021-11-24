package com.twq.w7_day4_mvvm.view.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.twq.w7_day4_mvvm.R
import com.twq.w7_day4_mvvm.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}