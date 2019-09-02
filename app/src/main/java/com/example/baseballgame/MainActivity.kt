package com.example.baseballgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ToggleButton
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_info_btn.setOnClickListener {
            startActivity<Information>()
        }

        main_start_btn.setOnClickListener {
            startActivity<NumberCreation>()
        }


    }//onCreate



}//
