package com.example.baseballgame

import android.hardware.camera2.TotalCaptureResult
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_number_input.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast





class NumberInput : AppCompatActivity() {

    lateinit var userNum : EditText //이걸 선언해줘야한다.
    var userList= mutableListOf("0","0","0") //유저번호
    var computerList = mutableListOf("0","0","0")//랜덤번호
    var strike=0
    var ball=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_input)

        input_result_btn.setOnClickListener {

            inputNumber()
            changeNum()
            matchNum()

        }//click

    }//onCreate

    //랜덤으로 생성된 번호를 받아와 다시 computerList에 담아준다. 자료형은 String
    fun changeNum() {
        var computerNum=intent.getIntegerArrayListExtra("computerNum")
        //val num1=computerNum[0].toString()
        for(a in 0 until  computerList.size){
            computerList[a] = computerNum[a].toString()
        }

    }//changeNum

    //유저가 입력한 번호를 userList에 담아준다. String
    fun inputNumber() {
        //lastIndex : 문자열이 비어있는 경우 -1을 리턴 -> 이때 번호입력 메시지 띄우기
        userNum=input_text as EditText
        val user=userNum.text.toString()

        if(user.lastIndex == -1){ //입력번호가 없다면
            toast("숫자를 입력해주세요")
        }else{
            for(a in 0 until userList.size){
                userList[a] = user.substring(a,a+1)
            }//for

        }//if

    }//inputNumber


    fun matchNum(){


        for (a in 0..2) {
            for (b in 0..2) {
                if (computerList[a].equals(userList[b])) {
                    if (a == b) {
                        strike += 1
                    } else {
                        ball += 1
                    }
                }//if
            }
        }//for

        if (strike == 0 && ball == 0) {
            //toast("아웃")
            startActivity<Result>(
                "result" to 0
            )
        } else if (strike == 3) {
            //toast("정답")
            startActivity<Victory>()
        } else {
            toast("strike:$strike ball:$ball")
            startActivity<Result>(
                "result" to 1
            )

        }
        //여기에 적어야 번호가 리셋됨
        strike = 0
        ball = 0
    }//matchNum



}//
