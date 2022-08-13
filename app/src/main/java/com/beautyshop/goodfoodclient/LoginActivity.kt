package com.beautyshop.goodfoodclient
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.beautyshop.goodfoodclient.databinding.ActivityLoginBinding
import com.beautyshop.goodfoodclient.databinding.AuthorizationClientFragmentBinding
import com.beautyshop.goodfoodclient.fragments.AuthorizationClientFragment
import com.beautyshop.goodfoodclient.fragments.RegistrationFragment

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
 binding= ActivityLoginBinding.inflate(layoutInflater)
   setContentView(binding.root)}}
//       binding.register.setOnClickListener {
//
//               findNavController()?.navigate(R.id.registrationFragment)
//
//       }
//        binding.authorization.setOnClickListener {
//            findNavController(R.id.authorizationClientFragment)
//
//}

