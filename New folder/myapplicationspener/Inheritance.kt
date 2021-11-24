// inheritance
/*
Inheritance enables code re-usability, it allows all the features from an existing
class(base class)to be inherited by a new class(derived class).


/////////// Is-A Relationship /////////////////
An Is-A relationship depends on inheritance. Further inheritance is of two types,
class inheritance and interface inheritance. It is used for code reusability in Java.
For example, a Potato is a vegetable, a Bus is a vehicle and so on. One of the properties of inheritance is
that inheritance is unidirectional in nature. Like we can say that a house is a building. But not all buildings
are houses.We can easily determine an Is-A relationship in Kotlin.When there is a ":" after class name in the class
declaration in Kotlin,then the specific class is said to be following the Is-A relationship.


////////// Has-A relationship /////////////////
A Has-A relationship simply means that an instance of one class has a reference to an instance of another class or
an other instance of the same class. For example, a car has an engine, a dog has a tail and so on.


 */


// Parent class (Superclass)
open class Person(var name: String ,var age:Int) {


    // Open function
    open fun printInfo(){
        println("name: $name , age: $age")
    }

}

// Child class
class Student(name:String,age:Int,var gpa:Double):Person(name, age ){

    // Override function
    override fun printInfo() {
        super.printInfo()
        println(gpa)
    }
}



fun main() {

    var stu = Student("Sam",32,3.2)
    stu.printInfo()

}