package com.example.myapplication.data.remote.api

import com.example.myapplication.data.model.WeatherResponse
import java.util.*
import retrofit2.Response
import retrofit2.http.*
import rx.Observable

interface WeatherAPI {

    @GET("/weather?")
    fun getWeather(@Query("zip") zipcode : String,
                   @Query("country_code") countryCode : String) : Observable<WeatherResponse>


}