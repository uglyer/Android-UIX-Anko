@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("androidui.util")
package androidui.util

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

external open class ArrayCreator {
    companion object {
        fun newNumberArray(size: Number): Array<Number> = definedExternally
        fun newBooleanArray(size: Number): Array<Boolean> = definedExternally
        fun fillArray(array: Array<Any>, value: Any): Unit = definedExternally
    }
}
external open class ClassFinder {
    companion object {
        fun findClass(classFullName: String, findInRoot: Any? = definedExternally /* null */): Any = definedExternally
        var _findViewClassCache: Any = definedExternally
        fun findViewClass(className: String): Any = definedExternally
    }
}
external open class PerformanceAdjuster {
    companion object {
        fun noCanvasMode(): Unit = definedExternally
    }
}
external open class Platform {
    companion object {
        var isIOS: Boolean = definedExternally
        var isAndroid: Boolean = definedExternally
        var isWeChat: Boolean = definedExternally
    }
}
external open class NumberChecker {
    companion object {
        fun warnNotNumber(vararg n: Number): Boolean = definedExternally
        fun assetNotNumber(vararg ns: Number): Unit = definedExternally
        fun checkIsNumber(vararg ns: Number): Boolean = definedExternally
    }
}
