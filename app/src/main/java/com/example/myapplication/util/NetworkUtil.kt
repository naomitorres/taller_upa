package com.example.myapplication.util

import android.content.Context
import android.net.ConnectivityManager

object NetworkUtil {

    fun checkInternetConnection(context: Context): Boolean {
        val cm: ConnectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = cm.activeNetworkInfo
        return activeNetwork != null && activeNetwork.isConnected
    }


}