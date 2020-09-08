package com.litton.jetpack0813.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    var count1 = MutableLiveData(0)
    var count2 = MutableLiveData(0)

    fun add1(int: Int) {
        count1.value = (count1.value?.plus(int))
    }

    fun add2(int: Int) {
        count2.value = (count2.value?.plus(int))
    }
}