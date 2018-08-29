@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("java.lang.ref")
package java.lang.ref

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

external open class WeakReference<T>(referent: T) {
//    open var weakMap: WeakMap<Any, T> = definedExternally
    open var weakMap: HashMap<Any, T> = definedExternally
    open fun get(): T = definedExternally
    open fun set(value: T): Unit = definedExternally
    open fun clear(): Unit = definedExternally
}
