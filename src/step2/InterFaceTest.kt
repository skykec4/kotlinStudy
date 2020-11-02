package step2

fun main(args: Array<String>) {

    var whatYouWant = 1
    var inter: InterTest = if (whatYouWant == 1) InterImp2() else InterImp()

    interfaceTest(inter)
}

fun interfaceTest(pInter: InterTest) {
    pInter.testFunc()
}

interface InterTest {
    fun testFunc()
}

class InterImp : InterTest {
    override fun testFunc() = println("InterImp  InterTest")
}

class InterImp2 : InterTest {
    override fun testFunc() = println("InterImp  InterTest2")
}


/* interface
interface InterfaceA {
    fun doA()
}

interface InterfaceA1 {
    fun doA1()
}

class InterfaceB : InterfaceA, InterfaceA1 {
    override fun doA() {
        TODO("Not yet implemented")
    }

    override fun doA1() {
        TODO("Not yet implemented")
    }
}
*/