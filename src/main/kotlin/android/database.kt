@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.database")
package android.database

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

external open class DataSetObserver {
    open fun onChanged(): Unit = definedExternally
    open fun onInvalidated(): Unit = definedExternally
}
external open class Observable<T> {
    open var mObservers: ArrayList<T> = definedExternally
    open fun registerObserver(observer: T): Unit = definedExternally
    open fun unregisterObserver(observer: T): Unit = definedExternally
    open fun unregisterAll(): Unit = definedExternally
}
external open class DataSetObservable : Observable<DataSetObserver> {
    open fun notifyChanged(): Unit = definedExternally
    open fun notifyInvalidated(): Unit = definedExternally
}
