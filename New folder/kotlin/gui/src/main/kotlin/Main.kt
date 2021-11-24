import javax.swing.JButton
import javax.swing.JFrame

fun main() {
    var j=JFrame("My App")
    j.layout=null
    j.setLocation(300,300)
    j.setSize(600,400)

    var b=JButton("Login")
    b.setSize(50,50)
    b.setLocation(300,290)
    j.add(b)
    j.isVisible=true







}