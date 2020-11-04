package step3

fun main(args: Array<String>) {
    var myCompany = RankMyCompany()
    myCompany addPoint "일이좋다"
    myCompany addPoint "자부심"
    myCompany addPoint "높은연봉"
    myCompany addPoint "유명회사"
    myCompany addPoint "야근당연"

    println(myCompany.Rank)

    var a: String? = "aszd"



    println(a!!)
}


class RankMyCompany {
    val m = mapOf<String, Int>(
            "일이좋다" to 25,
            "자부심" to 30,
            "높은연봉" to 25,
            "유명회사" to 20,
            "야근당연" to -60
    )

    var Rank: Int = 0

    // infix는 확장함수나 멤버함수로 구현되어야 한다.
    infix fun addPoint(s: String): Int {
        this.Rank += m[s]!!
        return this.Rank
    }
}