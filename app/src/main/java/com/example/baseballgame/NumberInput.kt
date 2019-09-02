package com.example.baseballgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_number_input.*
import kotlinx.android.synthetic.main.activity_result.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textView
import org.jetbrains.anko.toast


class NumberInput : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_input)



        //input_text에 입력된 text값을 변수에 저장.

        input_result_btn.setOnClickListener {
            var userNum=input_text.text.toString().toInt()
            //toast("$userNum")

            if(userNum>=500 && userNum<800){
                startActivity<Result>(
                    "userNum" to userNum.toString()//toString()을 안붙이면 안넘어감. String값..
                )
            }else{
                startActivity<Victory>()
            }

        }//clickEvent


    }//onCreate


}//



