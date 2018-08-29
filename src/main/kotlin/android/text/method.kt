@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.text.method")
package android.text.method

import android.app.*
import android.text.*
import android.content.*
import android.graphics.*
import android.support.v4.*
import android.view.*
import android.widget.TextView

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

external interface TransformationMethod {
    fun getTransformation(source: String, view: View): String
    fun onFocusChanged(view: View, sourceText: String, focused: Boolean, direction: Number, previouslyFocusedRect: Rect)
//    fun isImpl(obj: Any): Boolean = definedExternally
//    fun isImpl(obj: Any): Boolean
}
external interface TransformationMethod2 : TransformationMethod {
    fun setLengthChangesAllowed(allowLengthChanges: Boolean)
//    fun isImpl(obj: Any): Boolean = definedExternally
//    fun isImpl(obj: Any): Boolean
}
external open class AllCapsTransformationMethod(context: Any? = definedExternally /* null */) : TransformationMethod2 {
    open var mEnabled: Any = definedExternally
    override fun getTransformation(source: String, view: View): String = definedExternally
    override fun onFocusChanged(view: View, sourceText: String, focused: Boolean, direction: Number, previouslyFocusedRect: Rect): Unit = definedExternally
    override fun setLengthChangesAllowed(allowLengthChanges: Boolean): Unit = definedExternally
    companion object {
        var TAG: Any = definedExternally
    }
}
external interface MovementMethod {
    fun initialize(widget: TextView, text: Spannable)
    fun onKeyDown(widget: TextView, text: Spannable, keyCode: Number, event: KeyEvent): Boolean
    fun onKeyUp(widget: TextView, text: Spannable, keyCode: Number, event: KeyEvent): Boolean
    fun onKeyOther(view: TextView, text: Spannable, event: KeyEvent): Boolean
    fun onTakeFocus(widget: TextView, text: Spannable, direction: Number)
    fun onTrackballEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean
    fun onTouchEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean
    fun onGenericMotionEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean
    fun canSelectArbitrarily(): Boolean
}
external open class ReplacementTransformationMethod : TransformationMethod {
//    open class ReplacementCharSequence(source: String, original: Array<String>, replacement: Array<String>) : String {
    open class ReplacementCharSequence(source: String, original: Array<String>, replacement: Array<String>) {
        open var mOriginal: Any = definedExternally
        open var mReplacement: Any = definedExternally
        fun charAt(i: Number): String = definedExternally
        override fun toString(): String = definedExternally
        fun substr(from: Number, length: Number): String = definedExternally
        fun substring(start: Number, end: Number): String = definedExternally
        open fun startReplace(start: Number, end: Number): String = definedExternally
        open var mSource: Any = definedExternally
    }

    open fun getOriginal(): Array<String> = definedExternally
    open fun getReplacement(): Array<String> = definedExternally
    override fun getTransformation(source: String, v: View): String = definedExternally
    override fun onFocusChanged(view: View, sourceText: String, focused: Boolean, direction: Number, previouslyFocusedRect: Rect): Unit = definedExternally
}
external open class SingleLineTransformationMethod : ReplacementTransformationMethod {
    override fun getOriginal(): Array<String> = definedExternally
    override fun getReplacement(): Array<String> = definedExternally
    companion object {
        var ORIGINAL: Any = definedExternally
        var REPLACEMENT: Any = definedExternally
        fun getInstance(): SingleLineTransformationMethod = definedExternally
        var sInstance: Any = definedExternally
    }
}
external open class PasswordTransformationMethod : SingleLineTransformationMethod {
    override fun getTransformation(source: String, v: android.view.View): String = definedExternally
    companion object {
        var instance: Any = definedExternally
        fun getInstance(): PasswordTransformationMethod = definedExternally
    }
}
