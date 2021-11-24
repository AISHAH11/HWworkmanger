import java.awt.Font
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JSlider

fun main() {
    var  f=JFrame("font txt")
    f.layout=null
    f.setLocation(300,400)
    f.setSize(400,400)
    var l=JLabel("font size")
    l.setLocation(500,500)
    l.setSize(300,300)
    f.add(l)
    var s=JSlider(16,70)
    s.setLocation(100,60)
    s.setSize(200,50)


    s.addChangeListener {
        var fontSize=s.value
        l.font= Font("",Font.PLAIN,fontSize)
    }
    f.add(s)
    f.isVisible=true



}

