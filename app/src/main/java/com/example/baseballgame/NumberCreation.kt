package com.example.baseballgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_number_creation.*
import org.jetbrains.anko.startActivity
import kotlin.random.Random

class NumberCreation : AppCompatActivity() {

    val computerNum= mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_creation)

        num_create_btn.setOnClickListener {
            num_create_btn.text="생성 완료"
            num_image.setImageResource(R.drawable.ic_baseball_num_after)
            num_start_btn.setVisibility(View.VISIBLE)

        }

        num_start_btn.setOnClickListener {

            startActivity<NumberInput>()
        }

    }//onCreate


}

