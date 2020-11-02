package step1

fun main(args: Array<String>) {
    /*
        C의 goto문 같은 개념??

        return 반환값 : 값만 있으면 호출된 함수로 이동.
        return@레이블 반환값 ... : 해당 레이블로 값을 가지고 복귀한다.

     */

    exitLoop()
    println(lamdaReturn())

    (0..10).forEach {
        if (it > 3) return@forEach else println(it)
    }

    println(myExitTest())
}

fun exitLoop() {
    HereToExit@ for (i in 0..2) {
        for (j in 0..10) {
            if (j == 5) break@HereToExit
            println("i -> $i, j -> $j")
        }

        println("j loop end")
    }
    println("i loop end")
}


var lamdaReturn = Exit@{
    return@Exit 3
    1000
}


fun myExitTest() {
    myExit@ for (i in 0..9) {
        println("for $i")
        if (i == 5) {
            println("myExit $i")
            break@myExit
        }
    }

    (0..9).forEach {
        println("for $it")
        if (it == 5) {
            return@forEach
        }
    }
}