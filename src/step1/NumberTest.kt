package step1

fun main(args: Array<String>) {

    var doubleV: Double = 110.1111
    var float: Float = 110.1f
    var longV: Long = 110
    var intV: Int = 20
    var shortV: Short = 38
    var byteV: Byte = 101

    doubleV = intV.toDouble()
    doubleV = longV.toDouble()

    var string:String = "123"

    string.toInt()
    println("$doubleV")
    println("$float $longV")
    println("string : ${string.toInt() + 10}")
}