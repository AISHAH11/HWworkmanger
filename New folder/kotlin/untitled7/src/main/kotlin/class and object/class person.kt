package `class and object`

fun main() {
    val teacher=Person()
    teacher.name ="Aishah"
    teacher.age=32
    teacher.address= "90 street sam"
    teacher.nationality="saudi"
    teacher.job="Teacher"
    teacher.sleep()
    teacher.speak()
    teacher.walk()
}
class `class person` {
    //Attributes
    var name:String?=null
    var age:Int?=null
    var address:String?=null
    var nationlity:String?=null
    var job:String?=null
    // functions
    fun walk(){
        println("hi i am a $job and i can walk")
    }
   fun speak(){
       println("hi iam a$job and i can speak")

   }
fun sleep(){
    println("hi iam a $job and i can sleep")
}


}
