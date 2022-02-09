package com.example.dadder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dadder.Model.Main
import com.example.dadder.Model.NewClass
import com.example.dadder.Model.car
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var Car:car
    @Inject
    lateinit var main: Main

    @Inject
    lateinit var newClass: NewClass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Car.getCar()
        main.getName()
        newClass.getnameFull()


    }
}