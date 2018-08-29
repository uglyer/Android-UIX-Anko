@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.text.style")

package android.text.style

import android.graphics.Canvas
import android.graphics.Paint
import android.text.Layout
import android.text.TextPaint
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

external interface UpdateLayout : UpdateAppearance
external interface UpdateAppearance
external open class CharacterStyle {
    open class Passthrough_CharacterStyle(cs: CharacterStyle) : CharacterStyle {
        open var mStyle: Any = definedExternally
        override fun updateDrawState(tp: TextPaint): Unit = definedExternally
        override fun getUnderlying(): CharacterStyle = definedExternally
    }

    open var mType: dynamic /* "SymbolKeyword" kind unsupported yet here! (android-ui.d.ts:4074:15 to 4074:22) */ = definedExternally
    open fun updateDrawState(tp: TextPaint): Unit = definedExternally
    open fun getUnderlying(): CharacterStyle = definedExternally

    companion object {
        var type: dynamic /* "SymbolKeyword" kind unsupported yet here! (android-ui.d.ts:4073:21 to 4073:28) */ = definedExternally
        fun wrap(cs: CharacterStyle): CharacterStyle = definedExternally
    }
}

external open class MetricAffectingSpan : CharacterStyle, UpdateLayout {
    override var mType: dynamic /* "SymbolKeyword" kind unsupported yet here! (android-ui.d.ts:4094:15 to 4094:22) */ = definedExternally
    open fun updateMeasureState(p: TextPaint): Unit = definedExternally
    override fun getUnderlying(): MetricAffectingSpan = definedExternally
    open class Passthrough_MetricAffectingSpan(cs: MetricAffectingSpan) : MetricAffectingSpan {
        open var mStyle: Any = definedExternally
        override fun updateDrawState(tp: TextPaint): Unit = definedExternally
        override fun updateMeasureState(tp: TextPaint): Unit = definedExternally
        override fun getUnderlying(): MetricAffectingSpan = definedExternally
    }

    companion object {
        var type: dynamic /* "SymbolKeyword" kind unsupported yet here! (android-ui.d.ts:4093:21 to 4093:28) */ = definedExternally
    }
}

external open class ReplacementSpan : MetricAffectingSpan {
    override var mType: dynamic /* "SymbolKeyword" kind unsupported yet here! (android-ui.d.ts:4115:15 to 4115:22) */ = definedExternally
    open fun getSize(paint: Paint, text: String, start: Number, end: Number, fm: Paint.FontMetricsInt): Number = definedExternally
    open fun draw(canvas: Canvas, text: String, start: Number, end: Number, x: Number, top: Number, y: Number, bottom: Number, paint: Paint): Unit = definedExternally
    override fun updateMeasureState(p: TextPaint): Unit = definedExternally
    override fun updateDrawState(ds: TextPaint): Unit = definedExternally

    companion object {
        var type: dynamic /* "SymbolKeyword" kind unsupported yet here! (android-ui.d.ts:4114:21 to 4114:28) */ = definedExternally
    }
}

external open class ParagraphStyle {
    var type: dynamic /* "SymbolKeyword" kind unsupported yet here! (android-ui.d.ts:4126:18 to 4126:25) */ = definedExternally
}

external interface WrapTogetherSpan : ParagraphStyle
external open class LeadingMarginSpan : ParagraphStyle {
    fun getLeadingMargin(first: Boolean): Number
    fun drawLeadingMargin(c: Canvas, p: Paint, x: Number, dir: Number, top: Number, baseline: Number, bottom: Number, text: String, start: Number, end: Number, first: Boolean, layout: Layout)
    fun isImpl(obj: Any): Boolean = definedExternally
    override var type: dynamic /* "SymbolKeyword" kind unsupported yet here! (android-ui.d.ts:4146:18 to 4146:25) */ = definedExternally

    interface LeadingMarginSpan2 : LeadingMarginSpan, WrapTogetherSpan {
        fun getLeadingMarginLineCount(): Number
    }

    open class Standard(first: Number, rest: Number? = definedExternally /* null */) : LeadingMarginSpan {
        open var mFirst: Any = definedExternally
        open var mRest: Any = definedExternally
        open fun getSpanTypeId(): Number = definedExternally
        open fun describeContents(): Number = definedExternally
        override fun getLeadingMargin(first: Boolean): Number = definedExternally
        override fun drawLeadingMargin(c: Canvas, p: Paint, x: Number, dir: Number, top: Number, baseline: Number, bottom: Number, text: String, start: Number, end: Number, first: Boolean, layout: Layout): Unit = definedExternally
    }

}

external open class LineBackgroundSpan : ParagraphStyle {
    override var type: dynamic /* "SymbolKeyword" kind unsupported yet here! (android-ui.d.ts:4172:18 to 4172:25) */ = definedExternally
    fun drawBackground(c: Canvas, p: Paint, left: Number, right: Number, top: Number, baseline: Number, bottom: Number, text: String, start: Number, end: Number, lnum: Number)
}

external open class TabStopSpan : ParagraphStyle {
    override var type: dynamic /* "SymbolKeyword" kind unsupported yet here! (android-ui.d.ts:4181:18 to 4181:25) */ = definedExternally
    fun isImpl(obj: Any): Boolean = definedExternally
    open class Standard(where: Number) : TabStopSpan {
        override fun getTabStop(): Number = definedExternally
        open var mTab: Any = definedExternally
    }

    fun getTabStop(): Number

}

external open class LineHeightSpan : ParagraphStyle, WrapTogetherSpan {
    override var type: dynamic /* "SymbolKeyword" kind unsupported yet here! (android-ui.d.ts:5895:18 to 5895:25) */ = definedExternally

    interface WithDensity : LineHeightSpan {
        fun chooseHeight(text: String, start: Number, end: Number, spanstartv: Number, v: Number, fm: Paint.FontMetricsInt, paint: TextPaint? = definedExternally /* null */)
    }

    fun chooseHeight(text: String, start: Number, end: Number, spanstartv: Number, v: Number, fm: Paint.FontMetricsInt)
}
