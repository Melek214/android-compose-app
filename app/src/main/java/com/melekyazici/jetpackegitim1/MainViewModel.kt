package com.melekyazici.jetpackegitim1

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    private  val _count= mutableStateOf(0)
    val count:State<Int> = _count

    fun Increment(){
        _count.value+=1
    }

}