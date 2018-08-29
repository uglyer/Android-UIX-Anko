@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("java.util")
package java.util

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

external interface List<T> {
    fun size(): Number
    fun isEmpty(): Boolean
    fun contains(o: T): Any
    fun indexOf(o: T): Any
    fun lastIndexOf(o: T): Any
    fun clone(): List<T>
    fun toArray(a: Array<T>): Array<T>
    fun getArray(): Array<T>
    fun get(index: Number): T
    fun set(index: Number, element: T): T
    fun add(t: T): Any
    fun add(index: Number, t: T): Any
    fun remove(o: Number): Any
    fun remove(o: T): Any
    fun clear(): Any
    fun addAll(list: List<T>): Any
    fun addAll(index: Number, list: List<T>): Any
    fun removeAll(list: List<T>): Boolean
    fun subList(fromIndex: Number, toIndex: Number): List<T>
    fun sort(compareFn: ((a: T, b: T) -> Number)? = definedExternally /* null */): Any
}
external open class ArrayList<T>(initialCapacity: Number? = definedExternally /* null */) : List<T> {
    open var array: Array<T> = definedExternally
    override fun size(): Number = definedExternally
    override fun isEmpty(): Boolean = definedExternally
    override fun contains(o: T): Boolean = definedExternally
    override fun indexOf(o: T): Number = definedExternally
    override fun lastIndexOf(o: T): Number = definedExternally
    override fun clone(): ArrayList<T> = definedExternally
//    override fun toArray(a: Array<T>? = definedExternally /* null */): Array<T> = definedExternally
    override fun toArray(a: Array<T>): Array<T> = definedExternally
    override fun getArray(): Array<T> = definedExternally
    override fun get(index: Number): T = definedExternally
    override fun set(index: Number, element: T): T = definedExternally
    override fun add(t: T): Any = definedExternally
    override fun add(index: Number, t: T): Any = definedExternally
    override fun remove(o: Number): T = definedExternally
    override fun remove(o: T): T = definedExternally
    override fun clear(): Unit = definedExternally
    override fun addAll(list: List<T>): Any = definedExternally
    override fun addAll(index: Number, list: List<T>): Any = definedExternally
    override fun removeAll(list: List<T>): Boolean = definedExternally
    override fun subList(fromIndex: Number, toIndex: Number): ArrayList<T> = definedExternally
    override fun toString(): String = definedExternally
    override fun sort(compareFn: ((a: T, b: T) -> Number)? /* null */): Unit = definedExternally
}
external open class Arrays {
    companion object {
        fun sort(a: Array<Number>, fromIndex: Number, toIndex: Number): Unit = definedExternally
        fun rangeCheck(arrayLength: Any, fromIndex: Any, toIndex: Any): Unit = definedExternally
        fun <T> asList(array: Array<T>): List<T> = definedExternally
        fun equals(a: Array<Any>, a2: Array<Any>): Boolean = definedExternally
    }
}
external open class ArrayDeque<E> : ArrayList<E> {
    open fun addFirst(e: E): Unit = definedExternally
    open fun addLast(e: E): Unit = definedExternally
    open fun offerFirst(e: E): Boolean = definedExternally
    open fun offerLast(e: E): Boolean = definedExternally
    open fun removeFirst(): E = definedExternally
    open fun removeLast(): E = definedExternally
    open fun pollFirst(): E = definedExternally
    open fun pollLast(): E = definedExternally
    open fun getFirst(): E = definedExternally
    open fun getLast(): E = definedExternally
    open fun peekFirst(): E = definedExternally
    open fun peekLast(): E = definedExternally
    open fun removeFirstOccurrence(o: Any): Boolean = definedExternally
    open fun removeLastOccurrence(o: Any): Boolean = definedExternally
    open fun offer(e: E): Boolean = definedExternally
    open fun remove(): E = definedExternally
    open fun poll(): E = definedExternally
    open fun element(): E = definedExternally
    open fun peek(): E = definedExternally
    open fun push(e: E): Unit = definedExternally
    open fun pop(): E = definedExternally
    open fun delete(i: Any): Unit = definedExternally
}
external interface Comparator<T> {
    fun compare(o1: T, o2: T): Number
}
external open class Collections {
    companion object {
        var EMPTY_LIST: Any = definedExternally
        fun emptyList(): List<Any> = definedExternally
        fun <T> sort(list: List<T>, c: Comparator<T>? = definedExternally /* null */): Unit = definedExternally
    }
}
