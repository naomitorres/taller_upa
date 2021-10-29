package com.example.myapplication.data.manager

import android.content.Context
import com.example.myapplication.data.constants
import com.example.myapplication.data.model.Weather
import com.example.myapplication.data.model.WeatherResponse
import com.example.myapplication.data.remote.api.WeatherAPI
import com.example.myapplication.data.remote.client.ServiceGenerator
import com.example.myapplication.util.SharedPreferencesConnector
import retrofit2.http.Query
import rx.Observable

class DataManager(val context: Context) {

        private val connector = SharedPreferencesConnector.getInstance(context)

        fun getWeather()  : Observable<WeatherResponse> {

            return ServiceGenerator.createService(WeatherAPI::class.java,context).getWeather("92243","us")

        }


}