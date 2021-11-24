package filesio


import org.json.JSONObject
import java.net.URL

fun main() {

    var u =URL("https://jsonplaceholder.typicode.com/users/1")
    var text=u.readText()

    var obj= JSONObject(text)
    var email =obj.getString("email")

    println(email)

}