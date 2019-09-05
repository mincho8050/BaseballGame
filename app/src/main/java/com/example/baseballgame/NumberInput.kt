package com.example.baseballgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_number_input.*
import kotlinx.android.synthetic.main.activity_result.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textView
import org.jetbrains.anko.toast
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T








class NumberInput : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_input)
        /*배열하나는 Char형 같다. ''이렇게 해줘야 함. java와 같이*/

        val computerNum=intent.getCharArrayExtra("computerNum").toMutableList()
        var first=computerNum[0]


        input_result_btn.setOnClickListener {
            /*List로 저장 자료형 Char*/
            var userNum =input_text.text.toMutableList()

            toast("$first")

/*
            var strike = 0
            var ball = 0
            var out = 0

            val it = computerNum.iterator().iterator()
            val it2  = userNum.iterator().iterator()


            while (it.hasNext()) {

                val comnum = it.next()
                val usernum = it2.next()


                if (comnum == usernum) {
                    strike++
                } else {
                    if (userNum.contains(comnum) == true) {
                        ball++
                    } else {
                        out++
                    }
                }

                if (strike == 3 || ball == 3 || out == 3 ||
                    ball + strike == 3 || ball + out == 3 ||
                    strike + out == 3
                ) break

            }//while

            toast("strike: $strike ball: $ball out:$out")*/

        }//clickEvent


    }//onCreate




}//



