package com.beautyshop.goodfoodclient.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.beautyshop.goodfoodclient.adapters.RestaurantAdapter
import com.beautyshop.goodfoodclient.databinding.SearchFragmentBinding
import com.beautyshop.goodfoodclient.models.Constants
import com.beautyshop.goodfoodclient.models.Restaurants

class SearchFragment : Fragment() {
    private lateinit var _binding: SearchFragmentBinding
    private val binding get() = _binding

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
        val cafe = Constants.restaurants
            with(binding) {
                recyclerviewfragments.adapter = RestaurantAdapter(cafe, findNavController())

                searchButton.setOnClickListener {
                    val cafes = cafe.filter { binding.inputSearch.text.toString() == it.nameOfRestaurants }
                    binding.recyclerviewfragments.adapter = RestaurantAdapter(cafes as ArrayList<Restaurants>, findNavController())

                }
            }
    }

}