package com.example.weatherforcast

import com.example.weatherforcast.data.api.WeatherForecastApi
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val networkModule = module {
//    factory { AuthInterceptor() }
//    factory { provideOkHttpClient(get()) }
    factory { provideForecastApi(get()) }
    single { provideRetrofit(get()) }
}

fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder().baseUrl("").client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create()).build()
}

//fun provideOkHttpClient(authInterceptor: AuthInterceptor): OkHttpClient {
//    return OkHttpClient().newBuilder().addInterceptor(authInterceptor).build()
//}

fun provideForecastApi(retrofit: Retrofit): WeatherForecastApi = retrofit.create(WeatherForecastApi::class.java)