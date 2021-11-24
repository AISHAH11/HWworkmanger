 import java.awt.FlowLayout
 import java.awt.event.KeyEvent
 import java.awt.event.KeyListener
 import javax.swing.JFrame
 import javax.swing.JLabel
 import javax.swing.JTextField

 fun main() {
     var f=JFrame("my app")
     f.setBounds(100,800,400,300)
     f.layout=FlowLayout()
     var text=JTextField (29)
     var labelResult=JLabel()
     f.add(text)
     f.add(labelResult)
     text.addKeyListener(object :KeyListener {
         override fun keyTyped(e: KeyEvent?) {


         }

         override fun keyPressed(e: KeyEvent?) {

         }

         override fun keyReleased(e: KeyEvent?) {
             var email = text.text
             if (email.contains("@")) {
                 labelResult.text = " valid"
             } else labelResult.text = "in valid"


         }
     })
     f.isVisible=true
         }

     }
 }