package com.example.baseballgame



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_victory.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class Victory : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_victory)

        val count=intent.getStringExtra("count").toInt()

        //victory_title.text="${count}번만에 도전을 성공했습니다!"
        if(count==1){
            victory_title.text="한 번에 맞춘 당신은 MVP!!"
        }else{
            victory_title.text="${count}번만에 도전을 성공했습니다!"
        }

        victory_main_btn.setOnClickListener {
            startActivity<MainActivity>()
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)
        }


    }//onCreate

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity<MainActivity>()
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right)
    }//

}//
