package step2

fun main(args: Array<String>) {

    // 추상화
    var obj2 = TestAbstractImp();
    obj2.testFunc()
    obj2.abstractFunc()

    // static
    println(TestAbstractImp.staticVar);
    TestAbstractImp.staticFunc()
    println(TestAbstractImp.execFun)

}


abstract class TestAbstract {
    fun testFunc() = println("abstract testFunc!!")
    abstract fun abstractFunc()
}

class TestAbstractImp : TestAbstract() {
    override fun abstractFunc() = println("TestAbstractImp abstractFunc")

    // companion object {} 안에서 구현해야 static 가능
    companion object {
        var staticVar = "companion staticVar!"
        fun staticFunc() = println("companion staticFunc!")
        val execFun = println("companion execFun!")
    }
}

/* abstract

abstract class AbstractA {
    abstract fun doA()
}


class AbstractB : AbstractA() {
    override fun doA() {
        TODO("Not yet implemented")
    }
}

*/