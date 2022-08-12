package com.beautyshop.goodfoodclient.models

import java.io.Serializable

data class Restaurants(
    val nameOfRestaurants: String,
    val address: String,
    val image: Int,
    ): Serializable
