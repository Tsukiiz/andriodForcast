package com.example.weatherforcast

import org.koin.dsl.module

//class AppModule {

//    val appModule = module {
//        single { NetworkModule() }
//        single { ApiService(get()) }
//        single { DatabaseService() }
//        single { ProfileRepository(get(), get()) }
//    }
val applicationModule = listOf(networkModule)
//}