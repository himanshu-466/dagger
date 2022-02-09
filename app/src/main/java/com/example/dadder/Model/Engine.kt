package com.example.dadder.Model

import android.util.Log
import javax.inject.Inject

class Engine {
    @Inject
    constructor()
    fun getEngine()
    {
        Log.d("eng","Engine class")
    }
}