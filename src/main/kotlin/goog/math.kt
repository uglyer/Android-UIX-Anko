@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("goog.math")
package goog.math

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

external open class Long(low: Number, high: Number) {
    open var low_: Any = definedExternally
    open var high_: Any = definedExternally
    open fun toInt(): Number = definedExternally
    open fun toNumber(): Number = definedExternally
    open fun toString(opt_radix: Number): String = definedExternally
    open fun getHighBits(): Number = definedExternally
    open fun getLowBits(): Number = definedExternally
    open fun getLowBitsUnsigned(): Number = definedExternally
    open fun getNumBitsAbs(): Number = definedExternally
    open fun isZero(): Boolean = definedExternally
    open fun isNegative(): Boolean = definedExternally
    open fun isOdd(): Boolean = definedExternally
    open fun equals(other: Long): Boolean = definedExternally
    open fun notEquals(other: Long): Boolean = definedExternally
    open fun lessThan(other: Long): Boolean = definedExternally
    open fun lessThanOrEqual(other: Long): Boolean = definedExternally
    open fun greaterThan(other: Long): Boolean = definedExternally
    open fun greaterThanOrEqual(other: Long): Boolean = definedExternally
    open fun compare(other: Long): Number = definedExternally
    open fun negate(): Long = definedExternally
    open fun add(other: Long): Long = definedExternally
    open fun subtract(other: Long): Long = definedExternally
    open fun multiply(other: Long): Long = definedExternally
    open fun div(other: Long): Long = definedExternally
    open fun modulo(other: Long): Long = definedExternally
    open fun not(): Long = definedExternally
    open fun and(other: Long): Long = definedExternally
    open fun or(other: Long): Long = definedExternally
    open fun xor(other: Long): Long = definedExternally
    open fun shiftLeft(numBits: Number): Long = definedExternally
    open fun shiftRight(numBits: Number): Long = definedExternally
    open fun shiftRightUnsigned(numBits: Number): Long = definedExternally
    companion object {
        var IntCache_: Any = definedExternally
        var TWO_PWR_16_DBL_: Any = definedExternally
        var TWO_PWR_24_DBL_: Any = definedExternally
        var TWO_PWR_32_DBL_: Any = definedExternally
        var TWO_PWR_31_DBL_: Any = definedExternally
        var TWO_PWR_48_DBL_: Any = definedExternally
        var TWO_PWR_64_DBL_: Any = definedExternally
        var TWO_PWR_63_DBL_: Any = definedExternally
        var TWO_PWR_24_: Any = definedExternally
        var ZERO: Long = definedExternally
        var ONE: Long = definedExternally
        var NEG_ONE: Long = definedExternally
        var MAX_VALUE: Long = definedExternally
        var MIN_VALUE: Long = definedExternally
        fun fromInt(value: Number): Long = definedExternally
        fun fromNumber(value: Number): Long = definedExternally
        fun fromBits(lowBits: Number, highBits: Number): Long = definedExternally
        fun fromString(str: String, opt_radix: Number): Long = definedExternally
    }
}
