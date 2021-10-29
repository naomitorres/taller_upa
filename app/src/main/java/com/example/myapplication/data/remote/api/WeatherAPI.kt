package com.example.myapplication.data.remote.api

import com.downloader.Response
import java.util.*

interface WeatherAPI {


    fun getWeather: Observable<Response<List<Board>>>



}