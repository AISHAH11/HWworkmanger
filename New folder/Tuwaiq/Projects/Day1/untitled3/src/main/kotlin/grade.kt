import javax.print.attribute.IntegerSyntax

fun main() {
    println("inter your grade")
    var score =Integer.valueOf(readLine())
    var mesasage =""
    if (score >=95){
        mesasage ="A+"

    }  else if (score>=90){
        mesasage="A"

    } else if (score>=85){
        mesasage="B+"

    }
    println("you got"+ mesasage)
}