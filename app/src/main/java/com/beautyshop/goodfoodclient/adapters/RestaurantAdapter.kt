package com.beautyshop.goodfoodclient.adapters

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.beautyshop.goodfoodclient.R
import com.beautyshop.goodfoodclient.fragments.SearchFragmentDirections
import com.beautyshop.goodfoodclient.models.Restaurants

class RestaurantAdapter(private val array: ArrayList<Restaurants>, private val navController: NavController) :
    RecyclerView.Adapter<RestaurantAdapter.ViewHolder>() {
    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val imageView = view.findViewById<ImageView>(R.id.restaurantImage)
        val name = view.findViewById<TextView>(R.id.restaurantName)
        val address = view.findViewById<TextView>(R.id.restaurantAddress)}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_restaurant, parent, false)
        return ViewHolder(view)
    }



    override fun onBindViewHolder(holder: RestaurantAdapter.ViewHolder, position: Int) {
        val item = array[position]
        holder.name.text = item.nameOfRestaurants
        holder.address.text = item.address
        holder.imageView.setImageResource(item.image)
        holder.itemView.setOnClickListener {
            val bundle = Bundle()
            bundle.putSerializable("RESTAURANTS", item)
            navController.navigate(SearchFragmentDirections.actionSearchFragmentToRestaurantFullFragment())
        }}

    override fun getItemCount(): Int {
        return array.size
    }}