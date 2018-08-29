@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("java.lang")
package java.lang

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

external open class StringBuilder {
    constructor()
    constructor(capacity: Number)
    constructor(str: String)
    open var array: Array<String> = definedExternally
    open fun length(): Number = definedExternally
    open fun append(a: Any): StringBuilder = definedExternally
    open fun deleteCharAt(index: Number): StringBuilder = definedExternally
    open fun replace(start: Number, end: Number, str: String): StringBuilder = definedExternally
    open fun setLength(length: Number): Unit = definedExternally
    override fun toString(): String = definedExternally
}
external interface Runnable {
    fun run(): Any
    //fun of(func: () -> Any): Runnable = definedExternally
}
external interface `T$0` {
    fun println(any: Any? = definedExternally /* null */)
    fun print(any: Any)
}
external open class System {
    companion object {
        var out: `T$0` = definedExternally
        fun currentTimeMillis(): Number = definedExternally
        fun arraycopy(src: Array<Any>, srcPos: Number, dest: Array<Any>, destPos: Number, length: Number): Unit = definedExternally
    }
}
external open class JavaObject {
    open var hash: Any = definedExternally
    override fun hashCode(): Number = definedExternally
    open fun getClass(): Class = definedExternally
    fun equals(o: Any): Boolean = definedExternally
//    override fun equals(o: Any): Boolean = definedExternally
    companion object {
        var `class`: Class = definedExternally
    }
}
external open class Class(clazz: Function<*>) {
    open var clazz: Function<*> = definedExternally
    open fun getName(): String = definedExternally
    open fun getSimpleName(): String = definedExternally
    companion object {
        var classCache: Any = definedExternally
        fun getClass(clazz: Any): Unit = definedExternally
    }
}
external open class Float {
    companion object {
        var MIN_VALUE: Number = definedExternally
        var MAX_VALUE: Number = definedExternally
        fun parseFloat(value: String): Number = definedExternally
    }
}
external open class Long {
    companion object {
        var MIN_VALUE: Number = definedExternally
        var MAX_VALUE: Number = definedExternally
    }
}
external open class Integer {
    companion object {
        var MIN_VALUE: Number = definedExternally
        var MAX_VALUE: Number = definedExternally
        fun parseInt(value: String): Number = definedExternally
        fun toHexString(n: Number): String = definedExternally
    }
}
external interface Comparable<T> {
    fun compareTo(o: T): Number
    //fun isImpl(obj: Any): Any = definedExternally
}
