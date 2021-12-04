package com.example.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel:  ViewModel()  {
    private var _viwemodel: MutableLiveData<Int> = MutableLiveData(0)
    val viewModel: LiveData<Int> get() = _viwemodel

    fun printViewModel(){
        _viwemodel.value= _viwemodel.value?.plus(1)
    }
}