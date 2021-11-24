package revision

import java.io.File

fun main() {
    var wWithIng= mutableListOf<String>()
    var f=File("myfile.txt")

    var text=f.readText()
    var words=text.split(" ")

    for (w in words){
        if(w.endsWith("ing")){
            wWithIng.add(w)
        }
    }

    println(wWithIng)
}