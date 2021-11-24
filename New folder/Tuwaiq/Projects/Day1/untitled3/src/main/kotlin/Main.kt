fun main() {
    println("please enter number")
    var x = Integer.valueOf(readLine())
    if (x >= 100 && x <= 200 && x%2 == 0) {
        println("you picked a valid number")
    } else {
        println("حظ اوفر")
    }

}