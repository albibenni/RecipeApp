package com.benni.getyourrecipe.di

import android.content.Context
import com.benni.getyourrecipe.BaseApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule{

    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app: Context): BaseApplication{
        return app as BaseApplication
    } //to open the applicationcontext everywhere in the app

    @Singleton
    @Provides
    fun provideStringRandom(): String{
        return "random string"
    } //example
}