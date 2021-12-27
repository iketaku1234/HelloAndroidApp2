package jp.techacademy.takuya.ikeda.kotlinlog
import android.util.Log

open class Human// 引数付きコンストラクタ
    (
    name: String, age: Int,// プロパティ
    var hobby: String
) : Animal(name, age), Thinkable {

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。")
        Log.d("kotlintest", "年は" + this.age + "歳です。")
    }
    // Thinkableインターフェースのメソッドをオーバーライド
     override fun think() {
        Log.d("kotlintest", "私は" + this.hobby +"について考える。")
    }
}