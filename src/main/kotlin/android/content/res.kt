@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.content.res")
package android.content.res

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.DisplayMetrics
import android.util.Pools
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

external open class TypedArray(res: android.content.res.Resources, attrMap: Map<String, String>) {
    open var mResources: Any = definedExternally
    open var attrMap: Any = definedExternally
    open var attrMapKeysCache: Any = definedExternally
    open var mRecycled: Any = definedExternally
    open fun checkRecycled(): Unit = definedExternally
    open fun length(): Number = definedExternally
    open fun getIndex(keyIndex: Number): String = definedExternally
    open fun getLowerCaseNoNamespaceAttrNames(): Array<String> = definedExternally
    open fun getResources(): android.content.res.Resources = definedExternally
    open fun getAttrValue(attrName: String): String = definedExternally
    open fun getResourceId(attrName: String, defaultResourceId: String): String = definedExternally
    open fun getText(attrName: String): String = definedExternally
    open fun getString(attrName: String): String = definedExternally
    open fun getBoolean(attrName: String, defValue: Boolean): Boolean = definedExternally
    open fun getInt(attrName: String, defValue: Number): Number = definedExternally
    open fun getFloat(attrName: String, defValue: Number): Number = definedExternally
    open fun getColor(attrName: String, defValue: Number): Number = definedExternally
    open fun getColorStateList(attrName: String): android.content.res.ColorStateList = definedExternally
    open fun getInteger(attrName: String, defValue: Number): Number = definedExternally
    open fun getLayoutDimension(attrName: String, defValue: Number): Number = definedExternally
    open fun getDimension(attrName: String, defValue: Number): Number = definedExternally
    open fun getDimensionPixelOffset(attrName: String, defValue: Number): Number = definedExternally
    open fun getDimensionPixelSize(attrName: String, defValue: Number): Number = definedExternally
    open fun getDrawable(attrName: String): Drawable = definedExternally
    open fun getTextArray(attrName: String): Array<String> = definedExternally
    open fun hasValue(attrName: String): Boolean = definedExternally
    open fun hasValueOrEmpty(attrName: String): Boolean = definedExternally
    open fun recycle(): Unit = definedExternally
    companion object {
        fun obtain(res: android.content.res.Resources, xml: HTMLElement, defStyleAttr: Map<String, String>? = definedExternally /* null */): TypedArray = definedExternally
    }
}
external open class Resources(context: Context? = definedExternally /* null */) {
    open var mTypedArrayPool: Pools.SynchronizedPool<TypedArray> = definedExternally
    open var displayMetrics: Any = definedExternally
    open var context: Any = definedExternally
    open fun getDisplayMetrics(): DisplayMetrics = definedExternally
    open fun fillDisplayMetrics(displayMetrics: Any): Unit = definedExternally
    open fun getDefStyle(refString: String): Any = definedExternally
    open fun getDrawable(refString: String): Drawable = definedExternally
    open fun getColor(refString: String): Number = definedExternally
    open fun getColorStateList(refString: String): ColorStateList = definedExternally
    open fun getDimension(refString: String, baseValue: Number? = definedExternally /* null */): Number = definedExternally
    open fun getDimensionPixelOffset(refString: String, baseValue: Number? = definedExternally /* null */): Number = definedExternally
    open fun getDimensionPixelSize(refString: String, baseValue: Number? = definedExternally /* null */): Number = definedExternally
    open fun getBoolean(refString: String): Boolean = definedExternally
    open fun getInteger(refString: String): Number = definedExternally
    open fun getIntArray(refString: String): Array<Number> = definedExternally
    open fun getFloat(refString: String): Number = definedExternally
    open fun getString(refString: String): String = definedExternally
    open fun getStringArray(refString: String): Array<String> = definedExternally
    open fun getLayout(refString: String): HTMLElement = definedExternally
    open fun getAnimation(refString: String): android.view.animation.Animation = definedExternally
    open fun getStyleAsMap(refString: Any): Unit = definedExternally
    open fun getXml(refString: String): HTMLElement = definedExternally
    open fun getValue(refString: String, resolveRefs: Boolean? = definedExternally /* null */): HTMLElement = definedExternally
    open fun obtainAttributes(attrs: HTMLElement): TypedArray = definedExternally
    open fun obtainStyledAttributes(attrs: HTMLElement, defStyleAttr: Map<String, String>): TypedArray = definedExternally
    companion object {
        var instance: Any = definedExternally
        var _AppBuildImageFileFinder: (refString: String) -> Drawable = definedExternally
        var _AppBuildXmlFinder: (refString: String) -> HTMLElement = definedExternally
        var _AppBuildValueFinder: (refString: String) -> HTMLElement = definedExternally
        fun getSystem(): Resources = definedExternally
        fun from(context: Any): Unit = definedExternally
        fun getDisplayMetrics(): DisplayMetrics = definedExternally
    }
}
external open class ColorStateList(states: Array<Array<Number>>, colors: Array<Number>) {
    open var mStateSpecs: Array<Array<Number>> = definedExternally
    open var mColors: Array<Number> = definedExternally
    open var mDefaultColor: Number = definedExternally
    open fun withAlpha(alpha: Number): ColorStateList = definedExternally
    open fun isStateful(): Boolean = definedExternally
    open fun getColorForState(stateSet: Array<Number>, defaultColor: Number): Number = definedExternally
    open fun getDefaultColor(): Number = definedExternally
    override fun toString(): String = definedExternally
    companion object {
        var EMPTY: Any = definedExternally
        var sCache: Any = definedExternally
        fun valueOf(color: Number): ColorStateList = definedExternally
        fun createFromXml(r: Resources, parser: HTMLElement): ColorStateList = definedExternally
    }
}
