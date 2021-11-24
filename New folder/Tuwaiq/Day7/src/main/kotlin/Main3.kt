
fun main() {

    var l= mutableListOf<String>()

    l.add("A")
    l.add("B")
    l.add("D")

    println(l)

    l.add(2,"c")

    println(l)

    l.set(2,"C")
    println(l)



}