package step3

fun main(args: Array<String>) {

    fun String?.myFunctions(s: String, n: Int): String? {
        var sTooManyTalk = "$this : added \n"
        (1..n).forEach {
            sTooManyTalk += "${s}\n"


        }
        return sTooManyTalk
    }

    println("hi".myFunctions("Hi", 10))
    var obj = ani {
        crying()
        eat()
        nCount++
    }
    println("TT")

    obj.setOnEvent(3, "울어") { nCount ->
        println("${nCount}번 울겠습니다.")
        (1..nCount).map { crying() }
    }

    obj.setOnEvent(2, "먹어") { nCount ->
        println("${nCount}번 먹겠습니다.")
        (1..nCount).map { eat() }
    }

}

fun ani(extFunc: Animal.() -> Unit): Animal {
    var animal = Animal()

    //매우 중요함
    animal.extFunc()

    return animal
}


class Animal {
    open var nCount = 0
    fun crying() = println("$this>> 아흥")
    fun eat() = println("$this>> 우걱우걱")
    open fun setOnEvent(nCount: Int, message: String, extFunc: Animal.(Int) -> Unit) {
        when (message) {
            "울어" -> {
                extFunc(nCount)
            }
            "먹어" -> {
                var n = if (nCount < 3) {
                    println("중간체크")
                    3
                } else nCount; extFunc(n)
            }
            else -> {
                println("알수없는 메시지: $message 입니다.")
            }
        }
    }
}