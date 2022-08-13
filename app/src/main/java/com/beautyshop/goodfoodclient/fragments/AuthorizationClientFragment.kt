package com.beautyshop.goodfoodclient.fragments

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.beautyshop.goodfoodclient.MainActivity
import com.beautyshop.goodfoodclient.R
import com.beautyshop.goodfoodclient.databinding.AuthorizationClientFragmentBinding

class AuthorizationClientFragment : Fragment() {
lateinit var binding: AuthorizationClientFragmentBinding
    companion object {
        fun newInstance() = AuthorizationClientFragment()
    }

    private lateinit var viewModel: AuthorizationClientViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= AuthorizationClientFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.login.setOnClickListener {
            if (binding.gmailED.text.isNullOrEmpty() && binding.passwordED.text.isNullOrEmpty()) {
                binding.gmailED.error = "Укажите свой логин"
                binding.passwordED.error = "Укажите свой пароль"
            } else {
            startActivity(Intent(requireActivity(), MainActivity::class.java))}}

        }}

