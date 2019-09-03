package com.example.baseballgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_number_creation.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import java.util.*
import kotlin.collections.ArrayList
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.app.ComponentActivity
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T






class NumberCreation : AppCompatActivity() {

    var computerNum= mutableListOf<Int>(0,0,0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_creation)

        num_create_btn.setOnClickListener {
            num_create_btn.text = "생성 완료"
            num_image.setImageResource(R.drawable.ic_baseball_num_after)
            num_start_btn.setVisibility(View.VISIBLE)
            makeNum()
            toast("$computerNum")
        }

        num_start_btn.setOnClickListener {
            startActivity<NumberInput>(
                "computerNum" to computerNum
            )
        }

    }//onCreate

    /*
    Random()함수 java.util 패키지로 해야 오류가 안남 잘보고 하자
    java코드를 kotlin으로 변환해줌. 그 이후에는 편집하면됨.
    */
    /*3자리 랜덤번호 발생 (0으로 시작X)*/
    fun makeNum() {

        val size = computerNum.size
        var a = 0
        while (a < size) {

            computerNum[a] = Random().nextInt(10)
            for (b in 0 until a) {
                if (computerNum[a] === computerNum[b] || computerNum[0]==0) {
                    a--
                    break
                }//if
            }//for
            a++
        }//while


    }//makeNum

}//