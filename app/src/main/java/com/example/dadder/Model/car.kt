package com.example.dadder.Model

import android.util.Log
import javax.inject.Inject

class car @Inject constructor(private val wheel: Wheel,private  val engine: Engine){


    fun  getCar(){
        engine.getEngine()
        wheel.getWheel()
         Log.d("Msg","Car Messgae")
    }
}