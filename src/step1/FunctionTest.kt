package step1

fun main(args: Array<String>) {

    //기본형 파라미터 없음
    funByNoParam()

    //기본형 파라미터 있음
    funByParameter(31, " 숫자입니다")


    println(funByReturn("Parameter"))
    println(funByInline(31, 10))

    funcVar("Function Variable 1")
    println(funcVarType("Function Variable 2"))

    higherFunc({ println("Higher Function") })
    higherFunc(::funByNoParam)
}


fun funByReturn(s: String): String {
    return s
}

fun funByParameter(i: Int, s: String) {
    println("$i + $s")
}


fun funByInline(i: Int, i1: Int) = i * i1
fun funByNoParam() {
    println("funByNoPa")
}


//함수를 넘겨서 함수를 실행
fun higherFunc(f: () -> Unit) {
    f()
}

val funcVar = { s: String -> println(s) }
var funcVarType: (String) -> Any? = ::funByReturn

//::은  함수 주소값을 의미함(포인터 개념?)