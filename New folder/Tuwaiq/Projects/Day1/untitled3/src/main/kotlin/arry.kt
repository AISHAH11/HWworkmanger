fun main() {
    var age= arrayOf(22.23,24,25,26,29)
   var max=0
    for (element in age){

        if(element> max)
            max= element

    }
    println(max)
}
