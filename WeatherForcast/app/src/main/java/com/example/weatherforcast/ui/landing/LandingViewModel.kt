package com.example.weatherforcast.ui.landing

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class LandingViewModel: ViewModel() {
    // Create a LiveData with a String
    val currentName = MutableLiveData<String>()
    fun initialize() {
        currentName.value = "Hello data biding"
    }
}