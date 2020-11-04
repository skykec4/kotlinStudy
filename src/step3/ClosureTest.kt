package step3

fun main(args: Array<String>) {
    var fn = closure1(10)

    println(fn(10))
    println(fn(10))
    println(fn(10))


    var decByOne = closure2 { num -> num - 1 }
    println(decByOne())
    println(decByOne())

    fun Add(num: Int) = num + 10
    var addByTen = closure2(::Add)
    println(addByTen())
    println(addByTen())


}


fun closure1(num: Int): (Int) -> Int {
    var sum: Int = num
    return fun(num2: Int): Int {
        sum += num2
        return sum
    }
}

fun closure2(pFunc: (Int) -> Int): () -> Int {
    var result: Int = 0
    return {
        result = pFunc(result)
        result
    }
}