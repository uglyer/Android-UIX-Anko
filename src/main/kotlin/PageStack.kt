@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("PageStack")
package PageStack

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

external var DEBUG: Boolean = definedExternally
external var currentStack: StateStack = definedExternally
external var backListener: () -> Boolean = definedExternally
external var pageOpenHandler: (pageId: String, pageExtra: Any? /*= null*/, isRestore: Boolean? /*= null*/) -> Any = definedExternally
external var pagePushHandler: (pageId: String, pageExtra: Any? /*= null*/) -> Any = definedExternally
external var pageCloseHandler: (pageId: String, pageExtra: Any? /*= null*/) -> Any = definedExternally
external fun init(): Unit = definedExternally
external fun go(delta: Number, pageAlreadyClose: Boolean? = definedExternally /* null */): Unit = definedExternally
external fun back(pageAlreadyClose: Boolean? = definedExternally /* null */): Unit = definedExternally
external fun openPage(pageId: String, extra: Any? = definedExternally /* null */): Any = definedExternally
external fun backToPage(pageId: String): Unit = definedExternally
external fun historyGo(delta: Number, ensureFaked: Boolean? = definedExternally /* null */): Unit = definedExternally
external fun notifyPageClosed(pageId: String): Unit = definedExternally
external fun notifyNewPageOpened(pageId: String, extra: Any? = definedExternally /* null */): Unit = definedExternally
external fun getPageExtra(pageId: String? = definedExternally /* null */): Any = definedExternally
external fun setPageExtra(extra: Any, pageId: String? = definedExternally /* null */): Unit = definedExternally
external fun preClosePageHasIFrame(historyLengthWhenInitIFrame: Number): Unit = definedExternally
external interface StateStack {
    var pageId: String
    var isRoot: Boolean? get() = definedExternally; set(value) = definedExternally
    var stack: Array<StateSaved>
}
external interface StateSaved {
    var pageId: String
    var extra: Any? get() = definedExternally; set(value) = definedExternally
}
