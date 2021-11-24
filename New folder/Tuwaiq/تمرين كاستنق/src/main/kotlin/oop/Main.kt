package oop

fun main() {

    var l= mutableListOf<Human>()
    l.add(Student("Aly",20,3.2f))
    l.add(Student("Ahmed",21,3.2f))
    l.add(Student("Ahmed",21,3.2f))
    l.add(Student("Ahmed",21,3.2f))
    l.add(PostGraduate("Aly",20,3.2f,2020))
    l.add(Teacher("Ahmed",34,20000.0,"Math"))
    l.add(PostGraduate("Aly",20,3.2f,2020))
    l.add(Teacher("Ahmed",34,20000.0,"Math"))
    l.add(Student("Ahmed",21,3.2f))
    l.add(Student("Ahmed",21,3.2f))
    l.add(PostGraduate("Aly",20,3.2f,2020))
    l.add(Teacher("Ahmed",34,20000.0,"Math"))
    l.add(PostGraduate("Aly",20,3.2f,2020))
    l.add(Teacher("Ahmed",34,20000.0,"Math"))
    l.add(Teacher("Ahmed",34,20000.0,"Math"))



     println("Welcome to my app")
    var x= l.get(4) as PostGraduate
    var y= l.get(0) as Student












    println(" Student gpa average is "+ getStudentGpaAverage(l))

}


fun getStudentGpaAverage(l:MutableList<Human>):Float{

    var sum= 0f
    var counter=0

    for ( element in l){

        if(element is Student){
            sum+= element.gpa
            counter++
        }

    }

     return sum /counter
}