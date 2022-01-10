package com.danik.distancetrackerapp.ui.maps

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MapsViewModel @Inject constructor(): ViewModel() {

    private val _showHint = MutableLiveData(true)
    val showHint get() = _showHint

    fun hideHint(){
        _showHint.value = false
    }
}