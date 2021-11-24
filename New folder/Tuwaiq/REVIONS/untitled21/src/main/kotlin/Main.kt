import java.io.File

fun main() {
    var arr=readFile(:"student.txt")
    var oldeststudent=getOldeststuden+(arr)
    println(oldeststudent.name+""+oldeststudent.gpa+""+oldeststudent.age)

}
//returns Array of students based on the inputfile
FunreadFile(fileName:String):Array<student?>{
    var f=File(fileName)
    var lines=f.readlines().size
    var a= arrayOfNulls<student>(lines)
    var index=0
    f.forEachline{line->
        var token=line.split(delimiters :",")
        var name=tokens[0]
        var age=tokens[1].toInt()
        var age=tokens[2].to Float()
        var std=student(name,age,gpa)
        a[index]=std
        index++
}
    return a
}
fun getoldeststudent(arr:Array<student?>):student{


