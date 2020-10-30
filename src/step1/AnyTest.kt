package step1

fun main(args: Array<String>) {

    var everybody: Any


    everybody = 12.00


    when (everybody) {
        is String -> {

            println("is String")
        }
        !is Number -> {
            println("is number")
        }
        else -> {
            println("else")
        }
    }

}
