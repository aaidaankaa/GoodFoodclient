package com.beautyshop.goodfoodclient.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.beautyshop.goodfoodclient.R
import com.beautyshop.goodfoodclient.databinding.SearchFragmentBinding

class SearchFragment : Fragment() {
    private lateinit var _binding: SearchFragmentBinding
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = SearchFragment()
    }

    private lateinit var viewModel: SearchViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = SearchFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(SearchViewModel::class.java)
        val list = arrayOf("12", "213", "fd", "fdsfs")
        with(binding) {
            searchButton.setOnClickListener {
                list.filter { it == inputSearch.text.toString() }
            }
        }
    }

}