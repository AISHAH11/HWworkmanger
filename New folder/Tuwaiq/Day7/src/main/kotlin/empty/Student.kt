package empty

class Student(var name:String,var age:Int,var gpa:Float) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Student

        if (name != other.name) return false
        if (age != other.age) return false
        if (gpa != other.gpa) return false

        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }


}