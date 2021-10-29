package com.example.myapplication

import android.app.Application
import com.example.myapplication.dagger.AppComponent
import com.example.myapplication.dagger.DaggerAppComponent

class BaseApplication : Application() {


    init {
        INSTANCE = this
    }

    private var appComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }

    fun getAppComponent(): AppComponent{
        if(appComponent == null){
            appComponent = DaggerAppComponent.builder().build()
        }
        return appComponent!!
    }

    companion object{
        lateinit var INSTANCE: BaseApplication
    }


}