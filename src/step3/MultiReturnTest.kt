package step3

fun main(args: Array<String>) {
    //Extract
    val (v1, v2, v3) = listOf("kotlin", 2, "3번째")
    println("$v1, $v2, $v3")


    //data 클래스에서 사용가능.
    //val (name, grade) = StudentB()
    val (name1, grade1) = Student("ec", 34)
    println("$name1 , $grade1")


    //파티션으로 기능
    val list = (0..10).map { Student("student$it", (it % 3)) }
    println(list)

    val (l1, l2) = list.partition { it.grade == 2 }
    println("l1")
    l1.map { println(it) }
    println("l2")
    l2.map { println(it) }

    // 3. 순위별로 가져오기
    val (n1, n2, n3) = (0..100).filter { it % 2 == 0 }.sortedByDescending { it }
    println("$n1, $n2, $n3")

    val (t1, t2) = (0..100).map { it }.partition { it % 2 == 0 }
    println("$t1, $t2")
}


data class Student(var name: String, var grade: Int)
class StudentB() {
    var name: String = ""
    var grade: Int = 0
}