package com.beautyshop.goodfoodclient

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.beautyshop.goodfoodclient.databinding.ActivityLoginBinding
import com.beautyshop.goodfoodclient.databinding.AuthorizationClientFragmentBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.register.setOnClickListener {

               findNavController(R.id.registrationFragment)

        }
        binding.authorization.setOnClickListener {
            findNavController(R.id.authorizationClientFragment)
        }

    }
}