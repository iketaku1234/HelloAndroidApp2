package jp.techacademy.takuya.ikeda.kotlinlog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("太郎", 20,"野球") // 名前を太郎、年齢20歳で、趣味が野球のHumanのインスタンスを作る
        val human2 = Human("花子", 25,"手芸")//名前を花子、年齢25歳で、趣味が手芸のHumanのインスタンスを作る

        human.say()
        human2.think()
    }
}