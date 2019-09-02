package com.example.baseballgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_number_input.*
import kotlinx.android.synthetic.main.activity_result.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textView
import org.jetbrains.anko.toast

class Result : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //val userNum=intent.getStringExtra("userNum")
        val userNum=intent.getStringExtra("userNum").toInt()

        if(userNum>=700){
            result_image.setImageResource(R.drawable.ic_baseball_result_out)
        }




    }//
}



