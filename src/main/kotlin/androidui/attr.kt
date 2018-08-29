@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("androidui.attr")
package androidui.attr

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.view.View
import android.view.ViewGroup
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

external open class AttrValueParser {
    companion object {
        fun parseString(r: android.content.res.Resources, value: String, defValue: String? = definedExternally /* null */): String = definedExternally
        fun parseBoolean(r: android.content.res.Resources, value: String, defValue: Boolean): Boolean = definedExternally
        fun parseInt(r: android.content.res.Resources, value: String, defValue: Number): Number = definedExternally
        fun parseFloat(r: android.content.res.Resources, value: String, defValue: Number): Number = definedExternally
        fun parseColor(r: android.content.res.Resources, value: String, defValue: Number): Number = definedExternally
        fun parseColorStateList(r: android.content.res.Resources, value: String): android.content.res.ColorStateList = definedExternally
        fun parseDimension(r: android.content.res.Resources, value: String, defValue: Number, baseValue: Number? = definedExternally /* null */): Number = definedExternally
        fun parseDimensionPixelOffset(r: android.content.res.Resources, value: String, defValue: Number, baseValue: Number? = definedExternally /* null */): Number = definedExternally
        fun parseDimensionPixelSize(r: android.content.res.Resources, value: String, defValue: Number, baseValue: Number? = definedExternally /* null */): Number = definedExternally
        fun parseDrawable(r: android.content.res.Resources, value: String): android.graphics.drawable.Drawable = definedExternally
        fun parseTextArray(r: android.content.res.Resources, value: String): Array<String> = definedExternally
    }
}
external open class StateAttr(state: Array<Number>) {
    open var stateSpec: Any = definedExternally
    open var attributes: Any = definedExternally
    open fun clone(): StateAttr = definedExternally
    open fun setAttr(name: String, value: String): Unit = definedExternally
    open fun hasAttr(name: String): Boolean = definedExternally
    open fun getAttrMap(): Map<String, String> = definedExternally
    open fun putAll(stateAttr: StateAttr): Unit = definedExternally
    open fun isDefaultState(): Boolean = definedExternally
    open fun isStateEquals(state: Array<Number>): Boolean = definedExternally
    open fun isStateMatch(state: Array<Number>): Boolean = definedExternally
    open fun createDiffKeyAsNullValueAttrMap(another: StateAttr): Map<String, String> = definedExternally
}
external open class StateAttrList(view: View) {
    open var originStateAttrList: Any = definedExternally
    open var matchedStateAttrList: Any = definedExternally
    open var mView: Any = definedExternally
    open fun addStatedAttr(attrName: String, attrValue: String): Unit = definedExternally
    open fun addStatedAttrImpl(attrName: Any, attrValue: Any, inParseState: Any): Unit = definedExternally
    open fun getStateAttr(state: Any): Unit = definedExternally
    open fun getOrCreateStateAttr(state: Any): Unit = definedExternally
    open fun getMatchedStateAttr(state: Array<Number>): StateAttr = definedExternally
    open fun removeAttrAllState(attrName: String): Unit = definedExternally
    companion object {
        fun getViewStateValue(attrName: String): Number = definedExternally
    }
}
external open class AttrBinder {
    open class ClassBinderMap(copyBinderMap: Map<String, androidui.attr.AttrBinder.ClassBinderValue>? = definedExternally /* null */) {
        open var binderMap: Map<String, ClassBinderValue> = definedExternally
        open fun set(key: String, value: androidui.attr.AttrBinder.ClassBinderValue? = definedExternally /* null */): ClassBinderMap = definedExternally
        open fun get(key: String): androidui.attr.AttrBinder.ClassBinderValue = definedExternally
        open fun callSetter(attrName: Any, host: Any, attrValue: Any, attrBinder: Any): Unit = definedExternally
        open fun callGetter(attrName: Any, host: Any): Unit = definedExternally
    }
    interface ClassBinderValue {
        var setter: (host: dynamic /* android.view.View | android.view.ViewGroup.LayoutParams */, attrValue: Any, attrBinder: AttrBinder) -> Unit
        var getter: ((host: dynamic /* android.view.View | android.view.ViewGroup.LayoutParams */) -> Any)? get() = definedExternally; set(value) = definedExternally
    }

    constructor(host: View)
    constructor(host: ViewGroup.LayoutParams)
    open var host: Any = definedExternally
    open var attrChangeMap: Any = definedExternally
    open var attrStashMap: Any = definedExternally
    open var classAttrBindMap: Any = definedExternally
    open var objectRefs: Any = definedExternally
    open var mContext: Any = definedExternally
    open fun setClassAttrBind(classAttrBind: AttrBinder.ClassBinderMap): Unit = definedExternally
    open fun addAttr(attrName: String, onAttrChange: (newValue: Any) -> Unit, stashAttrValueWhenStateChange: (() -> Any)? = definedExternally /* null */): Unit = definedExternally
    open fun onAttrChange(attrName: String, attrValue: Any, context: Context): Unit = definedExternally
    open fun getAttrValue(attrName: String): String = definedExternally
    open fun getRefObject(ref: Any): Unit = definedExternally
    open fun setRefObject(obj: Any): Unit = definedExternally
    open fun parsePaddingMarginTRBL(value: Any): Array<Number> = definedExternally
    open fun parseEnum(value: Any, enumMap: Map<String, Number>, defaultValue: Number): Number = definedExternally
    open fun parseBoolean(value: Any, defaultValue: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun parseGravity(s: String, defaultValue: Number? = definedExternally /* null */): Number = definedExternally
    open fun parseDrawable(s: String): Drawable = definedExternally
    open fun parseColor(value: String, defaultValue: Number? = definedExternally /* null */): Number = definedExternally
    open fun parseColorList(value: String): ColorStateList = definedExternally
    open fun parseInt(value: Any, defaultValue: Number? = definedExternally /* null */): Number = definedExternally
    open fun parseFloat(value: Any, defaultValue: Number? = definedExternally /* null */): Number = definedExternally
    open fun parseDimension(value: Any, defaultValue: Number? = definedExternally /* null */, baseValue: Number? = definedExternally /* null */): Number = definedExternally
    open fun parseNumberPixelOffset(value: Any, defaultValue: Number? = definedExternally /* null */, baseValue: Number? = definedExternally /* null */): Number = definedExternally
    open fun parseNumberPixelSize(value: Any, defaultValue: Number? = definedExternally /* null */, baseValue: Number? = definedExternally /* null */): Number = definedExternally
    open fun parseString(value: Any, defaultValue: String? = definedExternally /* null */): String = definedExternally
    open fun parseStringArray(value: Any): Array<String> = definedExternally
}
