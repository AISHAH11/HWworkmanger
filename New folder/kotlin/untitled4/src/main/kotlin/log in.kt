import org.w3c.dom.Text
import java.awt.BorderLayout
import java.awt.FlowLayout
import javax.swing.*

fun main() {
    var f= JFrame("My App")
    f.layout=BorderLayout()

    var btnLogin = JButton("Login")
    var btnReset = JButton("Reset")


    var labelUSername=JLabel("Username")
    labelUSername.setBounds(20,100,80,20)
    var txtFieldUsername=JTextField(20)
    txtFieldUsername.setBounds(100,100,200,20)

    var labelPassword=JLabel("Password")
    labelPassword.setBounds(20,160,100,20)
    var passwordField=JPasswordField(20)
    passwordField.setBounds(100,160,200,20)



    var jpanelCenter=JPanel()
    jpanelCenter.layout=null
    jpanelCenter.add(labelUSername)
    jpanelCenter.add(txtFieldUsername)
    jpanelCenter.add(labelPassword)
    jpanelCenter.add(passwordField)








    var jpanelSouth=JPanel()
    jpanelSouth.layout=FlowLayout()
    jpanelSouth.add(btnLogin)
    jpanelSouth.add(btnReset)

    f.add(jpanelSouth,BorderLayout.SOUTH)
    f.add(jpanelCenter,BorderLayout.CENTER)

    f.setSize(600,400)
    f.setLocation(300,300)
    btnLogin.addActionListener {
        //JOptionPane.showMessageDialog(f,"welcome to event")

        var userName=txtFieldUsername.text
        var password=passwordField.text
        if (userName.equals("Aishah")&& password.equals("456")) {
            JOptionPane.showMessageDialog(f, "secuss")
        }else JOptionPane.showMessageDialog(f,"faild")

        btnReset.addActionListener {
            txtFieldUsername.text=""

        }
    }
    f.isVisible=true
//
//btnLogin.addActionListener {
//    var secForm = JFrame("second")
//    secForm.setSize(680, 480)
//    secForm.setLocation(300, 300)
//
//    secForm.show()

//}
//
//
//}
btnLogin.addActionListener {

    var secForm=JFrame("second")
    secForm.setLocation(300,450)
    secForm.setSize(350,450)
    var text=JTextField()
    text
}
}