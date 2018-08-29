package UKot.support

import UKot.renderXML
import android.view.View
import org.w3c.dom.HTMLElement
import kotlin.browser.document

class ViewBuilder<T : View> {
    val element: HTMLElement

    constructor(tag: String) {
        element = document.createElement(tag) as HTMLElement
        set("layout_height", "wrap_content")
        set("layout_width", "wrap_content")
    }

    fun set(key: String, value: String) {
        element.setAttribute(key, value)
    }

    fun reader(xml: String): T {
        element.innerHTML = xml
        val e = element.firstElementChild
        element.removeChild(e!!)
        element.remove()
        return renderXML(e as HTMLElement) as T
    }

    fun build(): T {
        return renderXML(element) as T
    }
}