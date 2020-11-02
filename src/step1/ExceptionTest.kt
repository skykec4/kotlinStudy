package step1

fun main(args: Array<String>) {
    var divNumber = 0

    try {
        707 / divNumber
    } catch (e: Exception) {
        println(e)
    } finally {
        println("finally")
    }

    var addNumber: Int? = null

    //에러남
    //var sum = addNumber +100

    //처리방법1
    if (addNumber != null) {
        var sum = addNumber + 100
    }

    //처리방법2
    //var sum = addNumber!! + 100

    //처리방법3
    //? -> null인 경우 실행하지 않음
    var sum = addNumber?.let {
        println("not null")
        it + 100
    }


}