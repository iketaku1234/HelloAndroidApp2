package jp.techacademy.takuya.ikeda.kotlinlog
import android.util.Log

open class Dog: Animal {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int) : super(name, age)

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}