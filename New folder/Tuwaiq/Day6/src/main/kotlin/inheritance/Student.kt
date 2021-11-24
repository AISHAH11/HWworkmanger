package inheritance

class Student(name:String,age:Int,var gpa:Float):Human(name,age) {

    override fun printInformation() {

        super.printInformation()
        println(gpa)
    }
}