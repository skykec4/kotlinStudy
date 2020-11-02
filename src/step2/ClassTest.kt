package step2

/*
    - 생성자 constructor()를 사용 (class이름{}로 사용하기도 함)
    - kotlin은 기본 상속 금지
*/

fun main(args: Array<String>) {
    Test1().showInfo()
    Test1("PSW", 50).showInfo()

    Test2("나다").showInfo()
    Test2("PSW", 50).showInfo()

    ChildClass("Hi").sayHello()
}

class Test1 {
    var sName: String = "Test1"
    var nAge: Int = 10

    constructor() {
        println(this.toString())
    }

    constructor(name: String, age: Int) {
        sName = name
        nAge = age
    }

    fun showInfo() = println("sName : $sName, nAge : $nAge")
}

class Test2(name: String) {
    var sName: String = "Test2"
    var nAge: Int = 10

    init {
        sName = name
    }

    constructor(name: String, age: Int) : this(name) {
        sName = name
        nAge = age
    }

    fun showInfo() = println("sName : $sName, nAge : $nAge")
}


//상속을 하기 위해서는 open을 써야 함.
open class ParentClass(msg: String) {
    var message = msg
    fun sayHello() = println(message)
}


class ChildClass(m: String) : ParentClass(m) {

}