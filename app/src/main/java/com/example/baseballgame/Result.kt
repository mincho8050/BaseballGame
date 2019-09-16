package com.example.baseballgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast


class Result : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val out=intent.getStringExtra("out")
        val strike=intent.getStringExtra("strike")
        val ball=intent.getStringExtra("ball")


        if(out==null){
            result_text.text="${strike}strike ${ball}ball"
        }else{
            result_text.text="3out"
            result_image.setImageResource(R.drawable.ic_baseball_result_out)
            //result_btn.visibility = View.INVISIBLE
        }

        /*result_btn.setOnClickListener {
            startActivity<NumberInput>()
        }*/

    }//onCreate

    override fun onBackPressed() {
        super.onBackPressed()
    }//onBackPressed

}//

