package step2

fun main(args: Array<String>) {
    // 1. 클래스 전체를 싱글톤으로 사용할 때, 마치 java의 static class
    SingleTon.showMessage("싱글톤입니다.")

    // 2. companion object
    println(StaticTest.staticMsg)
    StaticTest.staticFunc()

    val static = StaticTest()
    println("선언해서 써야됨 ${static.msg}")

    // 3. Android에서 자주사용됨
    var obj = object : fakeClickHandler() {
        override fun onClick() {
            println("fakeClick!")
        }

    }

    obj.onClick()
}


object SingleTon {
    var showMessage = { msg: String -> println(msg) }
}

class StaticTest {
    var msg: String = "스태틱 메세지"

    companion object {
        var staticMsg = "companion 스태틱 메세지"
        fun staticFunc() = println("StaticTest.staticFunc")
    }
}

//onClick()을 반드시 구현해야 한다!
abstract class fakeClickHandler {
    abstract fun onClick()
}