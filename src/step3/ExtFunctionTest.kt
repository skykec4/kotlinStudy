package step3

fun main(args: Array<String>) {
//    1.let

    var a = 0
    var b = 0
    f1().let {
        println(a)
        a = it
        a
    }.let {
        b = it
        it
    }.let { println(it);println(b) }
    f1().let { value -> println(value) }
    f1().let { println(it) }

    1232.let { it + 1 }.let { it * 3 }.let { println(it) }
    var add = { a: Int, b: Int -> a + b }
    add(1, 2).let { println(it) }

    var bug: () -> Any? = { null }
    //?는 null이면 실행하지 않음.
    bug()?.let { println(it) }


    //2.apply()
    //객체생성하면서 초기화하면서 사용
    var obj = Test().apply { sName = "박모씨"; nAge = 49; }
    obj.aboutMe()

    var obj2 = Test2("김씨",20)
    obj2.aboutMe()
    obj2++
    obj2.aboutMe()

    //3.run()
    //실행하는 함수 개념?
    obj.run { sName = "김모씨"; aging(); sName }.let { println(it) }
    obj.aboutMe()

    run { 333 + 4 }.let { println(it) }

    //실행결과를리턴
    //4.also
    //값을 넘기지 않고 실행만 함.
    100.let { println(it); it }
            .also { println(it + 1000) }
            .also { println(it + 20) }
            .let { println(it) }

}

fun f1() = 10
class Test {
    var sName: String = "무명씨"
    var nAge: Int = 49
    fun aboutMe() = println("이름은 \"$sName\"이고 나이는 $nAge 입니다. ")
    fun aging() = nAge++
}


data class Test2(var sName: String, val nAge: Int) {
    fun aboutMe() = println("DATA CLASS 이름은 \"$sName\"이고 나이는 $nAge 입니다. ")
    operator fun inc() = Test2(this.sName,this.nAge+1)
}