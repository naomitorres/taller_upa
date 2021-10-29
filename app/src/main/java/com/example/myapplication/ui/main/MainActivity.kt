package com.example.myapplication.ui.main

import android.os.Bundle
import android.service.autofill.TextValueSanitizer
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import com.example.myapplication.BaseApplication
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var appBarConfiguration: AppBarConfiguration

    var router: Router? = null
        @Inject set

    var navigatorHolder: NavigatorHolder? = null
        @Inject set
    private var presenter: MainPresenter? = null
    private val navigator = SupportAppNavigator(this,supportFragmentManager, R.id.container)



    override fun onCreate(savedInstanceState: Bundle?) {
        BaseApplication.INSTANCE.getAppComponent().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this,router!!,this)

        loadInitialdata()

    }

    private fun loadInitialdata() {
        presenter?.getWeather()
    }


    override fun onResume() {
        super.onResume()
        navigatorHolder?.setNavigator(navigator)

    }

    override fun onPause() {
        navigatorHolder?.removeNavigator()
        super.onPause()
    }


    fun loadInitialFragment() {
        presenter?.loadInitialFragment()
    }

    override fun showWeather(climate: String) {
        findViewById<TextView>(R.id.local_climate).text = climate
    }


}