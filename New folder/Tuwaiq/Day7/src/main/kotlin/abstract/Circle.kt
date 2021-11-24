package abstract

class Circle(var r:Double, override var name: String):Shape() {


    override fun area(): Double {
        return Math.PI * r*r
    }
}