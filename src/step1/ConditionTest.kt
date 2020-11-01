package step1

fun main(args: Array<String>) {
    ifTest("Test")
    ifTest(17.0f)
    loopTest(8)
    caseTest(3)

    // 비교의 결과를 대입
    var a = "ABCDE"
    val result = when (a){
        is String -> {true}
        else -> {false}
    }
    println(result)

    // 리턴되는 형이 달라도 처리가능하다.
    println ( if("AAA".length > 3) true else "짧아요"  )
}

fun loopTest(count: Int) {
    for (i in (0..count)) {
        println("i -> $i")
    }

    (0..count).forEach { println("forEach : $it ") }

    var i: Int = 0
    while (i < count) {
        i++
        println("$i 입니다.")
    }
}

fun caseTest(o: Any?) {
    when (o) {
        "Test" ->
            println("문자: $o")

        is Float ->
            println("Float: $o")

        in (0..9) ->
            println("0-10까지 숫자: $o ")

        else ->
            println("???")

    }
}

fun ifTest(a: Any?) {
    if (a == "Test") {
        println("String Test :  $a")
    } else if (a is Float) {
        println("Float")
    } else if (a in (0..9)) {
        println("0~10까지 숫자 : $a")
    } else if (a == null) {
        println("null")
    }
}