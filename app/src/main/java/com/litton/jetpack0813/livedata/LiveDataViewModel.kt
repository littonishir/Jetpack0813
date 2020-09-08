package com.litton.jetpack0813.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel:ViewModel() {
    val likeNum = MutableLiveData<Int>()
    init {
        likeNum.value = 0
    }

    fun add(x:Int){
        likeNum.value = likeNum.value?.plus(x)
    }

}