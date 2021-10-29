package com.example.myapplication.ui.main

interface MainContract {

    interface View{

       fun showWeather(climate : String)

    }


    interface Presenter{
        fun loadInitialFragment()

        fun getWeather()

    }

    }