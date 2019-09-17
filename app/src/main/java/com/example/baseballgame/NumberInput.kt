package com.example.baseballgame


import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_number_input.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import android.view.inputmethod.InputMethodManager
import android.view.inputmethod.EditorInfo
import android.view.KeyEvent


class NumberInput : AppCompatActivity() {

    lateinit var userNum : EditText //이걸 선언해줘야한다.
    var userList= mutableListOf("0","0","0") //유저번호
    var computerList = mutableListOf("0","0","0")//랜덤번호
    var strike=0
    var ball=0
    var count=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_input)

        input_result_btn.setOnClickListener {
            matchNum()
            CloseKeyboard()
        }//click
    /*
    * EditText 키보드 옵션
    * actionGo -> '이동'의 의미(웹브라우저)
    * actionSearch -> '검색'의 의미(네이버 검색창)
    * actionSend -> '보내기'의 의미(메시지 작성시 사용)
    * actionNext -> '다음'의 의미(회원가입시 다음 필드로 이동)
    * actionDone -> '완료'의 의미(정보 입력창)
    * */
        input_text.setOnEditorActionListener { v, actionId, event ->
            if(actionId == EditorInfo.IME_ACTION_NEXT){
                //키보드에서 완료버튼을 누르면 번호매치 및 키보드 내린다.
                matchNum()
                CloseKeyboard()
                return@setOnEditorActionListener true
            }
            false
        }

    }//onCreate


    fun matchNum(){

        //랜덤으로 생성된 번호를 받아와 다시 computerList에 담아준다. 자료형은 String
        var computerNum=intent.getIntegerArrayListExtra("computerNum")
        //val num1=computerNum[0].toString()
        for(a in 0 until  computerList.size){
            computerList[a] = computerNum[a].toString()
        }

        //유저가 입력한 번호를 userList에 담아준다. String
        userNum=input_text as EditText
        val user=userNum.text.toString()

        if(user.lastIndex == -1){ //입력번호가 없다면
            toast("숫자를 입력해주세요")
        }else{
            for(a in 0 until userList.size){
                userList[a] = user.substring(a,a+1)
            }//for

            //번호매치
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
                val textView=TextView(this)
                textView.text="도전 ${count}회 : 입력번호 : $userList -> 3out"
                input_layout.addView(textView,0)
                count ++
            } else if (strike == 3) {
                //toast("정답")
                startActivity<Victory>(
                    "count" to "$count"
                )
            } else {
                //toast("strike:$strike ball:$ball")
                /*startActivity<Result>(
                    //그냥 값을 보낼때 "strike" to strike
                    //>받을때 잘 안받아지고 오류가 났음
                    //>그래서 보낼때 "strike" to "$strike" 보냈더니 잘 받아짐
                    "strike" to "$strike",
                    "ball" to "$ball"
                )*/
                val textView=TextView(this)
                textView.text="도전 ${count}회 : 입력번호 : $userList -> strike:$strike ball:$ball"
                input_layout.addView(textView,0)
                count ++
            }
            //여기에 적어야 번호가 리셋됨
            strike = 0
            ball = 0
        }//if

    }//matchNum

    //키보드가 내려가는 함수,
    //>버튼을 클릭해야 발동. 그냥 화면에 대고 하면 안됨
    fun CloseKeyboard() {
        var view = this.currentFocus

        if(view != null) {
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }


}//
