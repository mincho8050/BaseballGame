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
        /*배열하나는 Char형 같다. ''이렇게 해줘야 함. java와 같이*/

        //얘는 Int임
        val computerNum=intent.getIntegerArrayListExtra("computerNum")



        input_result_btn.setOnClickListener {
            /*List로 저장*/
            val userNum=input_text.text.toMutableList()
            val firstNum=userNum[0] //자료형이 Char로 나옴
            toast("$firstNum")

        }//clickEvent


    }//onCreate


}//



