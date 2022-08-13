package com.beautyshop.goodfoodclient.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import com.beautyshop.goodfoodclient.R
import com.beautyshop.goodfoodclient.databinding.ActivityLoginBinding
import com.beautyshop.goodfoodclient.databinding.RegistrationFragmentBinding
import com.beautyshop.goodfoodclient.utilities.SharedPreferences

class RegistrationFragment : Fragment() {
private lateinit var binding:RegistrationFragmentBinding
    companion object {
        fun newInstance() = RegistrationFragment()
    }

    private lateinit var viewModel: RegistrationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= RegistrationFragmentBinding.inflate(inflater,container,false)
    return binding.root}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        SharedPreferences(requireContext()).mail=binding.gmail.toString()
        SharedPreferences(requireContext()).name=binding.name.toString()




        }
    }





