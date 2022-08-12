package com.beautyshop.goodfoodclient.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cn.pedant.SweetAlert.SweetAlertDialog
import com.beautyshop.goodfoodclient.R
import com.beautyshop.goodfoodclient.databinding.FragmentRestaurantFullBinding
import com.beautyshop.goodfoodclient.databinding.ProfileFragmentBinding


class RestaurantFullFragment : Fragment() {
    private lateinit var binding: FragmentRestaurantFullBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRestaurantFullBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.booking.setOnClickListener {
            context?.let {
                val dialog = SweetAlertDialog(it, SweetAlertDialog.SUCCESS_TYPE)
                dialog.progressHelper.barColor = Color.parseColor("#FF000000")
                dialog.titleText = "Вы успешно забронировали столик"
                dialog.setCancelable(false)
                dialog.show()
            }
        }
    }
}