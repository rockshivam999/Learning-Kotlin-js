import kotlinx.html.BUTTON
import kotlinx.html.dom.append
import kotlinx.html.id
import kotlinx.html.js.button
import kotlinx.html.js.h1
import kotlinx.html.js.onClickFunction
import kotlinx.html.js.style
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.events.EventListener
import kotlin.browser.document
import kotlin.browser.window

fun main() {
    document.write("<h1>I am  so excited</h1>")
    document.bgColor="#997"

    val root= document.getElementById("root") as HTMLDivElement

    root.append {
        button {
            +"click me to change"
                id="mybtn"

        }
    }

    val mybyn= document.getElementById("mybtn")

    mybyn!!.addEventListener("click",{
        window.alert("hello")
        document.bgColor="#FF00FF"
    })

}

