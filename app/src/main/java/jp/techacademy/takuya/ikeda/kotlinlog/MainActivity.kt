package jp.techacademy.takuya.ikeda.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class
MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("kotlintest","ログへの出力テスト")//ここを追加

        var num = 0

        while(num<10){
            Log.d("kotlintest",Integer.toString(num))
            num++
        }

    }
}