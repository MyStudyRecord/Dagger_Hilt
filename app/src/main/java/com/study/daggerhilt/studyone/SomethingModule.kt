package com.study.daggerhilt.studyone

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SomethingModule {

    @Provides
    @Singleton
    //ApplicationContext을 통해 Context가 필요한 경우에 간편하게 사용할수 있도록 한정자를 제공
    fun provideSomething(@ApplicationContext context: Context) {
        //context 사용
    }
}