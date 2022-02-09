package com.example.dadder.Model

import android.util.Log
import javax.inject.Inject

class Wheel {
    @Inject
    constructor()

    fun  getWheel(){
        Log.d("Msg","Wheel Messgae")
    }
}