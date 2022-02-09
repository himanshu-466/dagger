package com.example.dadder.Model


import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton


interface  One{
     fun getName()
 }
// We can not provide dependecy for interface like we did for classes
class ImplementOne @Inject constructor() :One
{
    override fun getName() {
        Log.d("Msg","Himasnhu")
    }

}
class Main @Inject constructor(private val one: One) {
    fun getName()
    {
        one.getName();
    }
}

// First Way of providing Dependecy to Interface
// First Way is Useful
//@Module
//@InstallIn(SingletonComponent::class)
//abstract  class  AppModule{
//    @Binds
//    @Singleton
//    abstract fun binding(implementOne: ImplementOne):One
//
//}
// Second Way of providing Dependecy to Interface

@Module
@InstallIn(SingletonComponent::class)
class AppModule{

    @Provides
    @Singleton
    fun binding():One=ImplementOne()
}