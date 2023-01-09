package com.example.weatherforcast

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        //initiate koin
        startKoin{
            // declare used Android context
            androidContext(this@MainApplication)
            // declare modules
            modules(applicationModule)  //flag why can't find applicationModule
        }
    }

}

