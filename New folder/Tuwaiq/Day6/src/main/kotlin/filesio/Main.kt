package filesio

import java.io.File

fun main() {
    var f= File("Students.txt")
    var fwriter = File("Students_copy.txt")

     f.forEachLine { line ->
         fwriter.appendText(line +"\n")
     }

}