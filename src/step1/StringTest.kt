package step1

import java.util.*

fun main(args: Array<String>) {

    val string:String ="""fjkdshfkjdshfkdsjfh asdjfahsdlf kja shdflhjksadl hahljk flhj ksdlh fjadslkj
        |asfdjaskhflasd
        |asdf
        |asf
        |asd
        |fasd
        |fdsa
        |fdf
        |
    """.trimMargin()
    val sName = "으악"
    var sForamatter = "$sName <-- sName의 값"
    println(string)

    println(sForamatter)

    println("지금 시간은 ? ${Date()}")
}