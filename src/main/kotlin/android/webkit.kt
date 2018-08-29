@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.webkit")
package android.webkit

import androidui.widget.HtmlBaseView
import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external open class WebViewClient {
    open fun onPageFinished(view: WebView, url: String): Unit = definedExternally
    open fun onReceivedTitle(view: WebView, title: String): Unit = definedExternally
}
external open class WebView(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : HtmlBaseView {
    open var iFrameElement: Any = definedExternally
    open var mClient: WebViewClient = definedExternally
    open var initIFrameHistoryLength: Any = definedExternally
    open fun initIFrameElement(url: Any): Unit = definedExternally
    open fun checkActivityResume(): Unit = definedExternally
    open fun goBack(): Unit = definedExternally
    open fun canGoBack(): Boolean = definedExternally
    open fun loadUrl(url: String): Unit = definedExternally
    open fun reload(): Unit = definedExternally
    open fun getUrl(): String = definedExternally
    open fun getTitle(): String = definedExternally
    open fun setWebViewClient(client: WebViewClient): Unit = definedExternally
}
