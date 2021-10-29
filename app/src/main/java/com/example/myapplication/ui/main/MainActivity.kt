package com.example.myapplication.ui.main

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    var router: Router? = null
        @Inject set

    var navigatorHolder: NavigatorHolder? = null
        @Inject set
    private var presenter: MainPresenter? = null
    private val navigator = SupportAppNavigator(this,supportFragmentManager, R.id.container)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        loadInitialFragment()

    }


    fun loadInitialFragment() {
        presenter?.loadInitialFragment()
    }


}