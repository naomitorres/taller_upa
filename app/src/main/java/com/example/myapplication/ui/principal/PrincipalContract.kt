package com.example.myapplication.ui.principal

interface PrincipalContract {

    interface View{
        fun showWeather(weather : String)


    }


    interface Presenter{
        fun getWeather()
    }

}