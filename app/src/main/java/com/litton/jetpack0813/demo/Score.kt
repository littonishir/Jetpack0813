package com.litton.jetpack0813.demo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Score:ViewModel() {
    val redNum = MutableLiveData<Int>()
    val blueNum = MutableLiveData<Int>()
    private var backNum = 0
    var backLiveData = MutableLiveData<Int>()
    init {
        redNum.value = 0
        blueNum.value = 0
    }
    fun add(liveData:MutableLiveData<Int>,score: Int){
        backNum = liveData.value!!
        backLiveData = liveData
        liveData.value = liveData.value?.plus(score)
    }
    fun back(){
        backLiveData.value = backNum
    }

    fun clean(){
        redNum.value = 0
        blueNum.value = 0
    }

}