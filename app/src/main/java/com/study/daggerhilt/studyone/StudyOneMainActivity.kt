package com.study.daggerhilt.studyone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.daggerhilt.R
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

/*AndroidEntryPoint : 자동으로 생명주기에 따라 적절한 시점에 Hilt 요소로 인스턴스화 되어 처리, 또한 의존성 주입의 시작점을 알림*/
@AndroidEntryPoint
class StudyOneMainActivity : AppCompatActivity() {

    //Inject : 의존성을 주입 받으려는 변수에 객체를 주입할수 있다, 이 어노테이션이 붙은 변수는 의존성을 주입받는 포인트를 선언한다는 의미
    @Inject lateinit var studyInject : String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study_one_main)

    }
}