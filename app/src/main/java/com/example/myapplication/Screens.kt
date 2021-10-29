package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment
import com.example.myapplication.ui.main.MainActivity
import com.example.myapplication.ui.principal.PrincipalFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

object Screens {

    class MainScreen: SupportAppScreen(){
        override fun getActivityIntent(context: Context): Intent? {
            return Intent(context, MainActivity::class.java)
        }
    }


    class PrincipalScreen: SupportAppScreen(){
        override fun getFragment(): Fragment? {
            return PrincipalFragment()
        }
    }

}

