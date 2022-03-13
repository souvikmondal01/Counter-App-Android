package com.kivous.counter

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    var num = 0
    fun inc(){
        num++
    }
    fun dec(){
        num--
    }
    fun reset(){
        num = 0
    }
}