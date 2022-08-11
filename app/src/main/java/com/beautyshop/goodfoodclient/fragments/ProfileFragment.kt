package com.beautyshop.goodfoodclient.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.beautyshop.goodfoodclient.R
import com.beautyshop.goodfoodclient.databinding.ProfileFragmentBinding
import com.beautyshop.goodfoodclient.utilities.SharedPreferences

class ProfileFragment : Fragment() {
private lateinit var binding: ProfileFragmentBinding
    companion object {
        fun newInstance() = ProfileFragment()
    }

    private lateinit var viewModel: ProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= ProfileFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sharedPreferences = SharedPreferences(requireContext())
        binding.nameProfile.text = sharedPreferences.name
        binding.mailProfile.text=sharedPreferences.mail
    }

}