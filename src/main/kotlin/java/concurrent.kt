@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("java.lang.util.concurrent")
package java.lang.util.concurrent

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

external open class CopyOnWriteArrayList<T> {
    open var mData: Any = definedExternally
    open var isDataNew: Any = definedExternally
    open fun iterator(): Array<T> = definedExternally
    open fun checkNewData(): Unit = definedExternally
    open fun size(): Number = definedExternally
    open fun add(vararg items: T): Unit = definedExternally
    open fun addAll(array: CopyOnWriteArrayList<T>): Unit = definedExternally
    open fun remove(item: T): Unit = definedExternally
}
