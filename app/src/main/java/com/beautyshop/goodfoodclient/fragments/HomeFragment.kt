package com.beautyshop.goodfoodclient.fragments

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.beautyshop.goodfoodclient.LoginActivity
import com.beautyshop.goodfoodclient.R
import com.beautyshop.goodfoodclient.databinding.HomeFragmentBinding
import com.beautyshop.goodfoodclient.databinding.ProfileFragmentBinding
import com.beautyshop.goodfoodclient.utilities.SharedPreferences

class HomeFragment : Fragment() {
    private lateinit var binding: HomeFragmentBinding
    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= HomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}

