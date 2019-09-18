package com.example.baseballgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.email
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.webView

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

    /*위에 상단 옵션메뉴 보이기*/
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.infor_copyright ->{
                return true
            }
            R.id.infor_developer ->{
                email("mincho8050@gmail.com")
                return true
            }
        }//when
        return super.onOptionsItemSelected(item)
    }//onOptionsItemSelected



}//

