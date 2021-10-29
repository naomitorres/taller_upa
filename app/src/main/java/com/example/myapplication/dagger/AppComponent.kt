package com.example.myapplication.dagger

import com.example.myapplication.dagger.module.MainModule
import com.example.myapplication.ui.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MainModule::class])
interface AppComponent {

     fun inject(mainActivity: MainActivity)

}
