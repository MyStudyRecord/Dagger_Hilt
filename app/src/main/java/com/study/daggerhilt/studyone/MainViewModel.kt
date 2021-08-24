package com.study.daggerhilt.studyone

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


//HiltViewModel과 Inject를 사용하면 간단하게 viewModel 의존성 주입을 활성화 가능
@HiltViewModel
class MainViewModel
//클래스의 생성자에서 Inject 어노테이션을 사용하여 의존성을 생성하는 방법
//생성자에 어노테이션으로 의존성 인스턴스를 생성
@Inject constructor(private val savedStateHandle: SavedStateHandle) : ViewModel() {

}