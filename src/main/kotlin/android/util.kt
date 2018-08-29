@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.util")

package android.util

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

external open class SparseMap<K, T>(initialCapacity: Number? = definedExternally /* null */) {
    open var map: Map<K, T> = definedExternally
    open fun clone(): SparseMap<K, T> = definedExternally
    open fun get(key: K, valueIfKeyNotFound: T? = definedExternally /* null */): T = definedExternally
    open fun delete(key: K): Unit = definedExternally
    open fun remove(key: K): Unit = definedExternally
    open fun removeAt(index: Number): Unit = definedExternally
    open fun removeAtRange(index: Number, size: Number? = definedExternally /* null */): Unit = definedExternally
    open fun put(key: K, value: T): Unit = definedExternally
    open fun size(): Number = definedExternally
    open fun keyAt(index: Number): K = definedExternally
    open fun valueAt(index: Number): T = definedExternally
    open fun setValueAt(index: Number, value: T): Unit = definedExternally
    open fun indexOfKey(key: K): Number = definedExternally
    open fun indexOfValue(value: T): Number = definedExternally
    open fun clear(): Unit = definedExternally
    open fun append(key: Any, value: Any): Unit = definedExternally
}

external open class SparseArray<T> : SparseMap<Number, T>
external open class Log {
    companion object {
        var View_DBG: Boolean = definedExternally
        var VelocityTracker_DBG: Boolean = definedExternally
        var DBG_DrawableContainer: Boolean = definedExternally
        var DBG_StateListDrawable: Boolean = definedExternally
        var VERBOSE: Number = definedExternally
        var DEBUG: Number = definedExternally
        var INFO: Number = definedExternally
        var WARN: Number = definedExternally
        var ERROR: Number = definedExternally
        var ASSERT: Number = definedExternally
        var PriorityString: Array<String> = definedExternally
        fun getPriorityString(priority: Number): String = definedExternally
        fun v(tag: String, msg: String, tr: Error? = definedExternally /* null */): Unit = definedExternally
        fun d(tag: String, msg: String): Unit = definedExternally
        fun i(tag: String, msg: String, tr: Error? = definedExternally /* null */): Unit = definedExternally
        fun w(tag: String, msg: String, tr: Error? = definedExternally /* null */): Unit = definedExternally
        fun e(tag: String, msg: String, tr: Error? = definedExternally /* null */): Unit = definedExternally
        fun getLogMsg(priority: Any, tag: Any, msg: Any): Unit = definedExternally
    }
}

external open class StateSet {
    companion object {
        var WILD_CARD: Array<Number> = definedExternally
        var NOTHING: Array<Number> = definedExternally
        fun isWildCard(stateSetOrSpec: Array<Number>): Boolean = definedExternally
        fun stateSetMatches(stateSpec: Array<Number>, stateSetOrState: Array<Number>): Boolean = definedExternally
        fun stateSetMatches(stateSpec: Array<Number>, stateSetOrState: Number): Boolean = definedExternally
        fun _stateSetMatches_single(stateSpec: Any, state: Any): Unit = definedExternally
        fun trimStateSet(states: Array<Number>, newSize: Number): Array<Number> = definedExternally
    }
}

external open class Pools {
    interface Pool<T> {
        fun acquire(): T
        fun release(instance: T): Boolean
    }

    open class SimplePool<T>(maxPoolSize: Number) : Pools.Pool<T> {
        open var mPool: Array<T> = definedExternally
        open var mPoolSize: Number = definedExternally
        override fun acquire(): T = definedExternally
        override open fun release(instance: T): Boolean = definedExternally
        open fun isInPool(instance: Any): Unit = definedExternally
    }

    open class SynchronizedPool<T> : SimplePool<T>

    open var a: Pools.SimplePool<String> = definedExternally
}

external open class CopyOnWriteArray<T> {
    open var mData: Any = definedExternally
    open var mDataCopy: Any = definedExternally
    open var mAccess: Any = definedExternally
    open var mStart: Any = definedExternally
    open fun getArray(): Unit = definedExternally
    open fun start(): Array<T> = definedExternally
    open fun end(): Unit = definedExternally
    open fun size(): Number = definedExternally
    open fun add(vararg items: T): Unit = definedExternally
    open fun addAll(array: CopyOnWriteArray<T>): Unit = definedExternally
    open fun remove(item: T): Unit = definedExternally
}

external open class DisplayMetrics {
    open var widthPixels: Number = definedExternally
    open var heightPixels: Number = definedExternally
    open var density: Int = definedExternally
    open var densityDpi: Number = definedExternally
    open var scaledDensity: Number = definedExternally
    open var xdpi: Number = definedExternally
    open var ydpi: Number = definedExternally

    companion object {
        var DENSITY_LOW: Number = definedExternally
        var DENSITY_MEDIUM: Number = definedExternally
        var DENSITY_HIGH: Number = definedExternally
        var DENSITY_XHIGH: Number = definedExternally
        var DENSITY_XXHIGH: Number = definedExternally
        var DENSITY_XXXHIGH: Number = definedExternally
        var DENSITY_DEFAULT: Number = definedExternally
    }
}

external open class TypedValue {
    companion object {
        var COMPLEX_UNIT_PX: String = definedExternally
        var COMPLEX_UNIT_DP: String = definedExternally
        var COMPLEX_UNIT_DIP: String = definedExternally
        var COMPLEX_UNIT_SP: String = definedExternally
        var COMPLEX_UNIT_PT: String = definedExternally
        var COMPLEX_UNIT_IN: String = definedExternally
        var COMPLEX_UNIT_MM: String = definedExternally
        var COMPLEX_UNIT_EM: String = definedExternally
        var COMPLEX_UNIT_REM: String = definedExternally
        var COMPLEX_UNIT_VH: String = definedExternally
        var COMPLEX_UNIT_VW: String = definedExternally
        var COMPLEX_UNIT_FRACTION: String = definedExternally
        var UNIT_SCALE_MAP: Any = definedExternally
        fun initUnit(): Unit = definedExternally
        fun applyDimension(unit: String, size: Number, dm: DisplayMetrics): Number = definedExternally
        fun isDynamicUnitValue(valueWithUnit: String): Boolean = definedExternally
        fun complexToDimension(valueWithUnit: String, baseValue: Number? = definedExternally /* null */, metrics: DisplayMetrics? = definedExternally /* null */): Number = definedExternally
        fun complexToDimensionPixelOffset(valueWithUnit: String, baseValue: Number? = definedExternally /* null */, metrics: DisplayMetrics? = definedExternally /* null */): Number = definedExternally
        fun complexToDimensionPixelSize(valueWithUnit: String, baseValue: Number? = definedExternally /* null */, metrics: DisplayMetrics? = definedExternally /* null */): Number = definedExternally
    }
}

external open class LayoutDirection {
    companion object {
        var LTR: Number = definedExternally
        var RTL: Number = definedExternally
        var INHERIT: Number = definedExternally
        var LOCALE: Number = definedExternally
    }
}

external open class MathUtils {
    companion object {
        var DEG_TO_RAD: Any = definedExternally
        var RAD_TO_DEG: Any = definedExternally
        fun abs(v: Number): Number = definedExternally
        fun constrain(amount: Number, low: Number, high: Number): Number = definedExternally
        fun log(a: Number): Number = definedExternally
        fun exp(a: Number): Number = definedExternally
        fun pow(a: Number, b: Number): Number = definedExternally
        fun max(a: Number, b: Number, c: Number? = definedExternally /* null */): Number = definedExternally
        fun min(a: Number, b: Number, c: Number? = definedExternally /* null */): Number = definedExternally
        fun dist(x1: Number, y1: Number, x2: Number, y2: Number): Number = definedExternally
        fun dist3(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number): Number = definedExternally
        fun mag(a: Number, b: Number, c: Number? = definedExternally /* null */): Number = definedExternally
        fun sq(v: Number): Number = definedExternally
        fun radians(degrees: Number): Number = definedExternally
        fun degrees(radians: Number): Number = definedExternally
        fun acos(value: Number): Number = definedExternally
        fun asin(value: Number): Number = definedExternally
        fun atan(value: Number): Number = definedExternally
        fun atan2(a: Number, b: Number): Number = definedExternally
        fun tan(angle: Number): Number = definedExternally
        fun lerp(start: Number, stop: Number, amount: Number): Number = definedExternally
        fun norm(start: Number, stop: Number, value: Number): Number = definedExternally
        fun map(minStart: Number, minStop: Number, maxStart: Number, maxStop: Number, value: Number): Number = definedExternally
        fun random(howbig: Number): Number = definedExternally
        fun random(howsmall: Number, howbig: Number): Number = definedExternally
    }
}

external open class SparseBooleanArray : SparseArray<Boolean>
external open class LongSparseArray<T> : SparseArray<T>
external open class ArrayMap<K, V>(capacity: Number? = definedExternally /* null */) {
    open var map: Any = definedExternally
    open fun clear(): Unit = definedExternally
    open fun erase(): Unit = definedExternally
    open fun ensureCapacity(minimumCapacity: Number): Unit = definedExternally
    open fun containsKey(key: K): Boolean = definedExternally
    open fun indexOfValue(value: V): Number = definedExternally
    open fun containsValue(value: V): Boolean = definedExternally
    open fun get(key: K): V = definedExternally
    open fun keyAt(index: Number): K = definedExternally
    open fun valueAt(index: Number): V = definedExternally
    open fun setValueAt(index: Number, value: V): V = definedExternally
    open fun isEmpty(): Boolean = definedExternally
    open fun put(key: K, value: V): V = definedExternally
    open fun append(key: K, value: V): Unit = definedExternally
    open fun remove(key: K): V = definedExternally
    open fun removeAt(index: Number): V = definedExternally
    open fun keySet(): Set<K> = definedExternally
    open fun size(): Number = definedExternally
}
