package com.example.myapplication.ui.main

import android.content.Context
import com.example.myapplication.Screens
import com.example.myapplication.data.manager.DataManager
import com.example.myapplication.data.model.WeatherResponse
import com.example.myapplication.util.SharedPreferencesConnector
import ru.terrakok.cicerone.Router
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.util.*

class MainPresenter(
    private val view: MainContract.View, private val router: Router,
    private val context: Context
) : MainContract.Presenter {
    private val connector = SharedPreferencesConnector.getInstance(context)
    private val dataManager = DataManager(context)


    private val fragmentIds = Stack<Int>()


    override fun loadInitialFragment() {
        if (fragmentIds.isEmpty()) {
            router.navigateTo(Screens.PrincipalScreen())
            fragmentIds.push(PRINCIPAL_FRAGMENT)
        } else {
            if (fragmentIds.peek() != PRINCIPAL_FRAGMENT) {
                router.navigateTo(Screens.PrincipalScreen())
                fragmentIds.push(PRINCIPAL_FRAGMENT)
            }
        }
    }

    override fun getWeather() {
        val observable = dataManager.getWeather()
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Subscriber<WeatherResponse>() {

                override fun onError(e: Throwable?) {
                    e?.printStackTrace()
                }

                override fun onNext(t: WeatherResponse) {
                    view.showWeather(t.main!!.feels_like.toString())
                }

                override fun onCompleted() {
                    // no necesario
                }
            })
    }

    companion object {
        private const val PRINCIPAL_FRAGMENT = 1

    }
}