package step3

import kotlin.random.Random

fun main(args: Array<String>) {
    var l: LateInitTest = LateInitTest()
    l.test()

    var l2: LazyInitTest = LazyInitTest()
    l2.test()

}


// 코틀린에서는 java와 달리 멤버필드를 반드시 초기화해야 한다.
// 아니면 abstract나 lateinit으로 선언해주어야 한다.

// 1. var만 사용가능. 자동으로 null 처리함
// 2. 늦은초기화이므로 초기화전에 사용불가
// 3. primitive 형은 불가능함.

class LateInitTest {
    var normalValue: Int = 3
    var initTest: Int

    init {
        initTest = 0
    }

    lateinit var late: String

    fun test() {
        this.late = "lateinit 초기화"
        println(this.late)
    }

}

// 1. val로 선언
// 2. 사용하는 시점에서 초기화가 1회 발생
// 3. primitive 형도 가능
class LazyInitTest {
    val lazy1: String by lazy {
        "lazyInit 초기화"
    }

    val lazy2: Int by lazy {
        println("1번실행 ")
        Random.nextInt(100)
    }

    fun test() {
        println(lazy1)
        println(lazy2)
        println(lazy2)
    }
}