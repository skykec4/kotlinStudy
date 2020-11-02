package step2

/*
    다형성
*/

fun main(args: Array<String>) {
    var obj1 = BaseClass()
    obj1.f1()

    var obj2 = PolyChildClass()
    obj2.f1()
    obj2.f2()
    obj2.f2("문자열 파라메터")
    obj2.f2("문자열 파라메터", 100)

    println(">>")

    var s = Student("Park")
    (0..9).forEach { _ -> s++ }
    s.printMe()

    var s2 = Student("Kim")
    s2.nScore = 50
    s2.printMe()

    println("two person plus score = ${s + s2}")
    println("two person minus score = ${s - s2}")


}

open class BaseClass {
    open var name = "base"
    open fun f1() = println("name::: ${this.name}")

    private fun onlyMyFunc() = println("클래스 내부에서만 사용11")

    constructor() {
        onlyMyFunc()
        println("이건 그대로 사용하나보네요?")
    }
}

class PolyChildClass : BaseClass() {

    // override
    override var name = "PolyClass name"
    override fun f1() = println("name::: ${this.name} 재정의함.")

    fun f2() = println("f2")

    // overloading
    fun f2(s: String) = println("f2:$s ")
    fun f2(s: String, num: Int) = println("f2: $s, $num ")

}

class Student(s: String) {
    var name: String = s
    var nScore: Int = 0

    operator fun plus(student: Student): Int {
        return student.nScore + this.nScore
    }

    operator fun minus(student: Student): Int {
        return this.nScore - student.nScore
    }

    operator fun inc(): Student {
        this.nScore++
        return this
    }


    fun printMe() = println("$name -> $nScore")
}