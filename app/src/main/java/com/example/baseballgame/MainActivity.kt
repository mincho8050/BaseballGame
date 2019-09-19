package com.example.baseballgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.email
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_info_btn.setOnClickListener {
            startActivity<Information>()
            //메인->설명액티비티로 왼쪽으로 슬라이드 이동
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)
        }//

        main_start_btn.setOnClickListener {
            startActivity<NumberCreation>()
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)
        }//




    }//onCreate

    /*위에 상단 옵션메뉴 보이기*/
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }//onCreateOptionsMenu
    /*옵션메뉴 누를시.*/
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

    /*뒤로가기 버튼 두번 누르면 앱이 종료*/
    var lastTimeBackPressed = System.currentTimeMillis()

    override fun onBackPressed() {

        if(System.currentTimeMillis() - lastTimeBackPressed < 1500){
            finish()
            return
        }else{
            lastTimeBackPressed = System.currentTimeMillis()
            toast("버튼을 한 번 더 누르면 앱이 종료됩니다.")

        }

    }//onBackPressed

}//

