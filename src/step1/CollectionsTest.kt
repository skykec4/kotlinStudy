package step1

fun main(args: Array<String>) {
    /*
        Collections
        List, Map

        읽기전용 List, 수정가능 List
        2가지가 있음
    */

    val list = listOf(1, 2, "sd")

    for (i in list) {
        println(i)
    }
    println(">")

    var lstEditable = mutableListOf<String>()
    // add 메소드로 추가
    lstEditable.add("A")
    lstEditable.add("B")
    lstEditable.add("C")
    lstEditable.add("D")

    for (s in lstEditable) {
        println(s)
    }
    println(">")

    // remove 메소드로 삭제
    lstEditable.removeAt(0);
    for (s in lstEditable) {
        println(s)
    }

    println(">")

    var m = hashMapOf("A" to 1, "B" to 2, "A" to 2)
    println(m["A"])
    println("m.size : ${m.size}")

    for(i in m){
        println("m.keys : ${m.entries}")
    }





}