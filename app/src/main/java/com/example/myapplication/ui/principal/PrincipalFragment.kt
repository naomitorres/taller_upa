package com.example.myapplication.ui.principal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.google.android.material.snackbar.Snackbar

class PrincipalFragment : Fragment(), PrincipalContract.View {

    private var currentView: View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            if (currentView != null) {
                return currentView
            }else{
               currentView = inflater.inflate(R.layout.fragment_first, container, false)
                return currentView
            }
        }



    override fun showWeather(weather : String) {

    }
}


