package interfaces

class Bird(name:String,age:Int):Animal(name,age),Flyer {
    override fun fly() {
    }

    override fun land() {
    }

    override fun takeoff() {
    }
}