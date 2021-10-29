package com.example.myapplication.dagger.module

@Module
class MainModule {

    private val cicerone: Cicerone<Router> = Cicerone.create()

    @Provides
    @Singleton
    fun provideRouter(): Router {
        return cicerone.router
    }

    @Provides
    @Singleton
    fun provideNavigationHolder(): NavigatorHolder {
        return cicerone.navigatorHolder
    }

}
