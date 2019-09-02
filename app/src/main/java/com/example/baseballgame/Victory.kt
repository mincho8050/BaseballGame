package com.example.baseballgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_victory.*
import org.jetbrains.anko.startActivity

class Victory : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_victory)


        victory_check_btn.setOnClickListener {
            startActivity<CheckResult>()
        }

        victory_main_btn.setOnClickListener {
            startActivity<MainActivity>()
        }


    }//onCreate
}
