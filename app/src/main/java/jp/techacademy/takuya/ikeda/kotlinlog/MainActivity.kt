package jp.techacademy.takuya.ikeda.kotlinlog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("太郎", 20,"野球") // 名前を太郎、年齢20歳で、Humanのインスタンスを作る
        human.say()
        human.think()
    }
}