package oop

open class Human(var name:String,var age:Int) {

    open fun printInformation(){
        println(name)
        println(age)
    }
}