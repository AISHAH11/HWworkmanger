package empty

import java.util.*

fun main() {
    var e=Empty()
    var d1=Date(1990,10,10)
    var d2=Date(1990,10,10)

    println(d1 == d2)

   var s1= Student("Aly",20,3.2f)
   var s2= Student("Aly",20,3.2f)

    println(s1 == s2)
}