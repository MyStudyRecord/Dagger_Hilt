package com.study.daggerhilt.studyone

import androidx.lifecycle.ViewModel
import javax.inject.Inject

//클래스의 생성자에서 Inject 어노테이션을 사용하여 의존성을 생성하는 방법
//생성자에 어노테이션으로 의존성 인스턴스를 생성
class MainViewModel @Inject constructor() : ViewModel() {

}