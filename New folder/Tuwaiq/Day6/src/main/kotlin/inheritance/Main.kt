package inheritance

fun main() {

    var s=Student("Aly",20,3.2f)

    s.printInformation()

    var arr= arrayOfNulls<Human>(10)
    arr[0]= Employee("Aly",33,20000.0)
    arr[1]= Student("Aly",33,3.2f)
    arr[2]= Student("Aly",33,3.2f)
    arr[3]= Employee("Mashari",30,18000.0)
    arr[4]= Student("Aly",33,3.2f)
    arr[5]= Employee("Mashari",30,18000.0)
    arr[6]= Student("Aly",33,3.2f)
    arr[7]= Teacher("Mashari",30,18000.0,"Arabic")
    arr[8]= Student("Aly",33,3.2f)
    arr[9]= Teacher("Mashari",30,18000.0,"Math")

    var c= studentCounter(arr)

    println("The list has "+c+" Students")
}



fun studentCounter(arr:Array<Human?>):Int{
    var studentCounter=0
    for (h in arr){

        if (h  is  Student){
           studentCounter++
        }
    }

    return studentCounter
}