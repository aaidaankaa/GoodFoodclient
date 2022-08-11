package com.beautyshop.goodfoodclient.api

import com.beautyshop.goodfoodclient.App
import com.beautyshop.goodfoodclient.utilities.SharedPreferences
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit


object Retrofit {
    fun retrofitModule(): Api {
        val authToken = SharedPreferences(App.getContext()).token
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .addInterceptor { chain ->
                chain.proceed(chain.request().newBuilder().also {
                    if (authToken != null) it.addHeader("Authorization", " $authToken")
                }.build())
            }
            .build()

        val retrofit by lazy {
            Retrofit.Builder()
                .baseUrl("dgbddd")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
                .create(Api::class.java)
        }
        return retrofit
    }
}