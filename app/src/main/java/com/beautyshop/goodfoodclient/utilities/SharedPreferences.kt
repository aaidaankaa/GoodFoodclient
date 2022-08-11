package com.beautyshop.goodfoodclient.utilities

import android.content.Context
import android.content.SharedPreferences

class SharedPreferences (context: Context){
    private val APP_NAME = "SharedPreferences"
    private var pref: SharedPreferences? =
        context.getSharedPreferences(APP_NAME, Context.MODE_PRIVATE)
//    var token: String?
//        get() = pref?.getString("token", null)
//        set(value) = pref?.edit()?.putString("token", value)!!.apply()

    var name: String?
        get() = pref?.getString("name", null)
        set(value) = pref?.edit()?.putString("name", value)!!.apply()

    var mail: String?
        get() = pref?.getString("mail", null)
        set(value) = pref?.edit()?.putString("mail", value)!!.apply()


    fun clean() {
        pref?.edit()?.clear()?.apply()
    }
}