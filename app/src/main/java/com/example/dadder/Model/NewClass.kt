package com.example.dadder.Model

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ServiceComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier
import javax.inject.Singleton


class NewClass @Inject constructor( @FName private val fName:String
,@LName private val lName:String) {

    fun getnameFull()
    {
        Log.d("Msg","My Name is $fName and $lName")
    }
}

@Module
@InstallIn(ServiceComponent::class)
class ModuleApp{
    @Provides
    @FName
    fun getNewName():String = "Himanshu"

    @Provides
    @LName
    fun getLastName():String="Agrawal"

}
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName