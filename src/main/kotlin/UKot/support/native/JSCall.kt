package UKot.support.native

import UKot.content.UKotContext
import kotlin.browser.document

/**
 * JSCall
 * @Date: Created by uglyer in 2017/11/6.
 */

fun Double.toFixed(num: Int): Double {
    val tmpV = this
    return js("tmpV.toFixed(num)")
}

external fun encodeURIComponent(value: String): String

external fun parserObj2Params(value: Any): String

class JSCall {
    companion object {
        val parserObj2Params: String = "function parserObj2Params(obj){var sb = '';for(var i in obj){if(typeof obj[i] != 'function')sb+='&'+encodeURIComponent(i)+'='+encodeURIComponent(obj[i])}return sb}"

        fun runJS(fakeContext: UKotContext, js: String) {
            val script = document.createElement("script")
            script.innerHTML = js
            fakeContext.rootDom.append(script)
            fakeContext.rootDom.removeChild(script)
        }

        fun getNativeJS(): String {
            return parserObj2Params
        }
    }
}