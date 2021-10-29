package com.example.myapplication.dagger

@Singleton
@Component(modules = [MainModule::class])
interface AppComponent {

     fun inject(mainActivity: MainActivity)

}
