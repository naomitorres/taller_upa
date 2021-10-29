package com.example.myapplication.ui.main

class MainPresenter(
    private val view: MainContract.View, private val router: Router,
    private val context: Context
) : MainContract.Presenter {
    private val connector = SharedPreferencesConnector.getInstance(context)
    private val interactor = MainInteractor(this, context)

    private val fragmentIds = Stack<Int>()


    override fun loadInitialFragment() {
        TODO("Not yet implemented")
    }


}