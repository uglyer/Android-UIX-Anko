@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.text")

package android.text

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.Rect
import android.text.style.MetricAffectingSpan
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

external open class Spanned {
    //external interface Spanned : String {
    fun <T> getSpans(start: Number, end: Number, type: Any): Array<T>

    fun getSpanStart(tag: Any): Number
    fun getSpanEnd(tag: Any): Number
    fun getSpanFlags(tag: Any): Number
    fun nextSpanTransition(start: Number, limit: Number, type: Any): Number

    fun isImplements(obj: Any): Any = definedExternally
    var SPAN_POINT_MARK_MASK: Number = definedExternally
    var SPAN_MARK_MARK: Number = definedExternally
    var SPAN_MARK_POINT: Number = definedExternally
    var SPAN_POINT_MARK: Number = definedExternally
    var SPAN_POINT_POINT: Number = definedExternally
    var SPAN_PARAGRAPH: Number = definedExternally
    var SPAN_INCLUSIVE_EXCLUSIVE: Number = definedExternally
    var SPAN_INCLUSIVE_INCLUSIVE: Number = definedExternally
    var SPAN_EXCLUSIVE_EXCLUSIVE: Number = definedExternally
    var SPAN_EXCLUSIVE_INCLUSIVE: Number = definedExternally
    var SPAN_COMPOSING: Number = definedExternally
    var SPAN_INTERMEDIATE: Number = definedExternally
    var SPAN_USER_SHIFT: Number = definedExternally
    var SPAN_USER: Number = definedExternally
    var SPAN_PRIORITY_SHIFT: Number = definedExternally
    var SPAN_PRIORITY: Number = definedExternally

}

external open class TextPaint : android.graphics.Paint {
    open var baselineShift: Number = definedExternally
    open var bgColor: Number = definedExternally
    open var linkColor: Number = definedExternally
    open var underlineColor: Number = definedExternally
    open var underlineThickness: Number = definedExternally
    open fun set(tp: TextPaint): Unit = definedExternally
    open fun setUnderlineText(color: Number, thickness: Number): Unit = definedExternally
}

external open class SpanSet<E>(type: Any) {
    open var classType: Any = definedExternally
    open var numberOfSpans: Number = definedExternally
    open var spans: Array<E> = definedExternally
    open var spanStarts: Array<Number> = definedExternally
    open var spanEnds: Array<Number> = definedExternally
    open var spanFlags: Array<Number> = definedExternally
    open fun init(spanned: Spanned, start: Number, limit: Number): Unit = definedExternally
    open fun hasSpansIntersecting(start: Number, end: Number): Boolean = definedExternally
    open fun getNextTransition(start: Number, limit: Number): Number = definedExternally
    open fun recycle(): Unit = definedExternally
}

external interface TextDirectionHeuristic {
    fun isRtl(cs: String, start: Number, count: Number): Boolean
}

external open class TextDirectionHeuristics {
    open class TextDirectionHeuristicImpl(algorithm: TextDirectionHeuristics.TextDirectionAlgorithm) : TextDirectionHeuristic {
        open var mAlgorithm: Any = definedExternally
        open fun defaultIsRtl(): Boolean = definedExternally
        override fun isRtl(cs: String, start: Number, count: Number): Boolean = definedExternally
        open fun doCheck(cs: Any, start: Any, count: Any): Unit = definedExternally
    }

    open class TextDirectionHeuristicInternal(algorithm: TextDirectionHeuristics.TextDirectionAlgorithm, defaultIsRtl: Boolean) : TextDirectionHeuristics.TextDirectionHeuristicImpl {
        open var mDefaultIsRtl: Any = definedExternally
        override fun defaultIsRtl(): Boolean = definedExternally
    }

    interface TextDirectionAlgorithm {
        fun checkRtl(cs: String, start: Number, count: Number): Number
    }

    open class FirstStrong : TextDirectionHeuristics.TextDirectionAlgorithm {
        override fun checkRtl(cs: String, start: Number, count: Number): Number = definedExternally

        companion object {
            var INSTANCE: FirstStrong = definedExternally
        }
    }

    open class AnyStrong(lookForRtl: Boolean) : TextDirectionHeuristics.TextDirectionAlgorithm {
        open var mLookForRtl: Any = definedExternally
        override fun checkRtl(cs: String, start: Number, count: Number): Number = definedExternally

        companion object {
            var INSTANCE_RTL: AnyStrong = definedExternally
            var INSTANCE_LTR: AnyStrong = definedExternally
        }
    }

    open class TextDirectionHeuristicLocale : TextDirectionHeuristics.TextDirectionHeuristicImpl {
        override fun defaultIsRtl(): Boolean = definedExternally

        companion object {
            var INSTANCE: TextDirectionHeuristicLocale = definedExternally
        }
    }

    companion object {
        var LTR: TextDirectionHeuristic = definedExternally
        var RTL: TextDirectionHeuristic = definedExternally
        var FIRSTSTRONG_LTR: TextDirectionHeuristic = definedExternally
        var FIRSTSTRONG_RTL: TextDirectionHeuristic = definedExternally
        var ANYRTL_LTR: TextDirectionHeuristic = definedExternally
        var LOCALE: TextDirectionHeuristic = definedExternally
        var STATE_TRUE: Any = definedExternally
        var STATE_FALSE: Any = definedExternally
        var STATE_UNKNOWN: Any = definedExternally
        fun isRtlText(directionality: Any): Unit = definedExternally
        fun isRtlTextOrFormat(directionality: Any): Unit = definedExternally
    }
}

external open class TextLine {
    open var mPaint: Any = definedExternally
    open var mText: Any = definedExternally
    open var mStart: Any = definedExternally
    open var mLen: Any = definedExternally
    open var mDir: Any = definedExternally
    open var mDirections: Any = definedExternally
    open var mHasTabs: Any = definedExternally
    open var mTabs: Any = definedExternally
    open var mChars: Any = definedExternally
    open var mCharsValid: Any = definedExternally
    open var mSpanned: Any = definedExternally
    open var mWorkPaint: Any = definedExternally
    open var mMetricAffectingSpanSpanSet: Any = definedExternally
    open var mCharacterStyleSpanSet: Any = definedExternally
    open var mReplacementSpanSpanSet: Any = definedExternally
    open fun set(paint: TextPaint, text: String, start: Number, limit: Number, dir: Number, directions: Layout.Directions, hasTabs: Boolean, tabStops: Layout.TabStops): Unit = definedExternally
    open fun draw(c: Canvas, x: Number, top: Number, y: Number, bottom: Number): Unit = definedExternally
    open fun metrics(fmi: Paint.FontMetricsInt): Number = definedExternally
    open fun measure(offset: Number, trailing: Boolean, fmi: Paint.FontMetricsInt): Number = definedExternally
    open fun drawRun(c: Any, start: Any, limit: Any, runIsRtl: Any, x: Any, top: Any, y: Any, bottom: Any, needWidth: Any): Unit = definedExternally
    open fun measureRun(start: Any, offset: Any, limit: Any, runIsRtl: Any, fmi: Any): Unit = definedExternally
    open fun getOffsetToLeftRightOf(cursor: Number, toLeft: Boolean): Number = definedExternally
    open fun getOffsetBeforeAfter(runIndex: Any, runStart: Any, runLimit: Any, runIsRtl: Any, offset: Any, after: Any): Unit = definedExternally
    open fun handleText(wp: Any, start: Any, end: Any, contextStart: Any, contextEnd: Any, runIsRtl: Any, c: Any, x: Any, top: Any, y: Any, bottom: Any, fmi: Any, needWidth: Any): Unit = definedExternally
    open fun handleReplacement(replacement: Any, wp: Any, start: Any, limit: Any, runIsRtl: Any, c: Any, x: Any, top: Any, y: Any, bottom: Any, fmi: Any, needWidth: Any): Unit = definedExternally
    open fun handleRun(start: Any, measureLimit: Any, limit: Any, runIsRtl: Any, c: Any, x: Any, top: Any, y: Any, bottom: Any, fmi: Any, needWidth: Any): Unit = definedExternally
    open fun drawTextRun(c: Any, wp: Any, start: Any, end: Any, contextStart: Any, contextEnd: Any, runIsRtl: Any, x: Any, y: Any): Unit = definedExternally
    open fun ascent(pos: Number): Number = definedExternally
    open fun nextTab(h: Number): Number = definedExternally

    companion object {
        var DEBUG: Any = definedExternally
        var sCached: Any = definedExternally
        fun obtain(): TextLine = definedExternally
        fun recycle(tl: TextLine): TextLine = definedExternally
        fun expandMetricsFromPaint(fmi: Any, wp: Any): Unit = definedExternally
        fun updateMetrics(fmi: Paint.FontMetricsInt, previousTop: Number, previousAscent: Number, previousDescent: Number, previousBottom: Number, previousLeading: Number): Unit = definedExternally
        var TAB_INCREMENT: Any = definedExternally
    }
}

external interface TextWatcher {
    fun beforeTextChanged(s: String, start: Number, count: Number, after: Number)
    fun onTextChanged(s: String, start: Number, before: Number, count: Number)
    fun afterTextChanged(s: String)
}

external open class Layout(text: String, paint: TextPaint, width: Number, align: Layout.Alignment, textDir: TextDirectionHeuristic? = definedExternally /* null */, spacingMult: Number? = definedExternally /* null */, spacingAdd: Number? = definedExternally /* null */) {
    open class TabStops(increment: Number, spans: Array<Any>) {
        open var mStops: Any = definedExternally
        open var mNumStops: Any = definedExternally
        open var mIncrement: Any = definedExternally
        open fun reset(increment: Number, spans: Array<Any>): Unit = definedExternally
        open fun nextTab(h: Number): Number = definedExternally

        companion object {
            fun nextDefaultStop(h: Number, inc: Number): Number = definedExternally
        }
    }

    open class Directions(dirs: Array<Number>) {
        open var mDirections: Array<Number> = definedExternally
    }

    //    open class Ellipsizer(s: String) : String {
    open class Ellipsizer(s: String) {
        open var mText: String = definedExternally
        open var mLayout: Layout = definedExternally
        open var mWidth: Number = definedExternally
        open var mMethod: TextUtils.TruncateAt = definedExternally
        override fun toString(): String = definedExternally
    }

    interface Spanned22 : Spanned {

    }

    open class SpannedEllipsizer(display: String) : Layout.Ellipsizer, Spanned22 {
        open var mSpanned: Any = definedExternally
        override fun <T> getSpans(start: Number, end: Number, type: Any): Array<T> = definedExternally
        override fun getSpanStart(tag: Any): Number = definedExternally
        override fun getSpanEnd(tag: Any): Number = definedExternally
        override fun getSpanFlags(tag: Any): Number = definedExternally
        override fun nextSpanTransition(start: Number, limit: Number, type: Any): Number = definedExternally
    }

    enum class Alignment {
        ALIGN_NORMAL /* = 0 */,
        ALIGN_OPPOSITE /* = 1 */,
        ALIGN_CENTER /* = 2 */,
        ALIGN_LEFT /* = 3 */,
        ALIGN_RIGHT /* = 4 */
    }

    open fun replaceWith(text: String, paint: TextPaint, width: Number, align: Layout.Alignment, spacingmult: Number, spacingadd: Number): Unit = definedExternally
    open fun draw(canvas: Canvas, highlight: Path? = definedExternally /* null */, highlightPaint: Paint? = definedExternally /* null */, cursorOffsetVertical: Number? = definedExternally /* null */): Unit = definedExternally
    open fun drawText(canvas: Canvas, firstLine: Number, lastLine: Number): Unit = definedExternally
    open fun drawBackground(canvas: Canvas, highlight: Path, highlightPaint: Paint, cursorOffsetVertical: Number, firstLine: Number, lastLine: Number): Unit = definedExternally
    open fun getLineRangeForDraw(canvas: Canvas): Array<Number> = definedExternally
    open fun getLineStartPos(line: Any, left: Any, right: Any): Unit = definedExternally
    open fun getText(): String = definedExternally
    open fun getPaint(): TextPaint = definedExternally
    open fun getWidth(): Number = definedExternally
    open fun getEllipsizedWidth(): Number = definedExternally
    open fun increaseWidthTo(wid: Number): Unit = definedExternally
    open fun getHeight(): Number = definedExternally
    open fun getAlignment(): Layout.Alignment = definedExternally
    open fun getSpacingMultiplier(): Number = definedExternally
    open fun getSpacingAdd(): Number = definedExternally
    open fun getTextDirectionHeuristic(): TextDirectionHeuristic = definedExternally
    open fun getLineCount(): Number = definedExternally
    open fun getLineBounds(line: Number, bounds: Rect): Number = definedExternally
    open fun getLineTop(line: Number): Number = definedExternally
    open fun getLineDescent(line: Number): Number = definedExternally
    open fun getLineStart(line: Number): Number = definedExternally
    open fun getParagraphDirection(line: Number): Number = definedExternally
    open fun getLineContainsTab(line: Number): Boolean = definedExternally
    open fun getLineDirections(line: Number): Layout.Directions = definedExternally
    open fun getTopPadding(): Number = definedExternally
    open fun getBottomPadding(): Number = definedExternally
    open fun isLevelBoundary(offset: Number): Boolean = definedExternally
    open fun isRtlCharAt(offset: Number): Boolean = definedExternally
    open fun primaryIsTrailingPrevious(offset: Any): Unit = definedExternally
    open fun getPrimaryHorizontal(offset: Number, clamped: Boolean? = definedExternally /* null */): Number = definedExternally
    open fun getSecondaryHorizontal(offset: Number, clamped: Boolean? = definedExternally /* null */): Number = definedExternally
    open fun getHorizontal(offset: Any, trailing: Any, clamped: Any): Unit = definedExternally
    open fun getHorizontal_4(offset: Any, trailing: Any, line: Any, clamped: Any): Unit = definedExternally
    open fun getLineLeft(line: Number): Number = definedExternally
    open fun getLineRight(line: Number): Number = definedExternally
    open fun getLineMax(line: Number): Number = definedExternally
    open fun getLineWidth(line: Number): Number = definedExternally
    open fun getLineExtent(line: Any, full: Any): Unit = definedExternally
    open fun getLineExtent(line: Any, tabStops: Any, full: Any): Unit = definedExternally
    open fun getLineExtent_2(line: Any, full: Any): Unit = definedExternally
    open fun getLineExtent_3(line: Any, tabStops: Any, full: Any): Unit = definedExternally
    open fun getLineForVertical(vertical: Number): Number = definedExternally
    open fun getLineForOffset(offset: Number): Number = definedExternally
    open fun getOffsetForHorizontal(line: Number, horiz: Number): Number = definedExternally
    open fun getLineEnd(line: Number): Number = definedExternally
    open fun getLineVisibleEnd(line: Any, start: Any? = definedExternally /* null */, end: Any? = definedExternally /* null */): Unit = definedExternally
    open fun getLineBottom(line: Number): Number = definedExternally
    open fun getLineBaseline(line: Number): Number = definedExternally
    open fun getLineAscent(line: Number): Number = definedExternally
    open fun getOffsetToLeftOf(offset: Number): Number = definedExternally
    open fun getOffsetToRightOf(offset: Number): Number = definedExternally
    open fun getOffsetToLeftRightOf(caret: Any, toLeft: Any): Unit = definedExternally
    open fun getOffsetAtStartOf(offset: Any): Unit = definedExternally
    open fun shouldClampCursor(line: Number): Boolean = definedExternally
    open fun getCursorPath(point: Number, dest: Path, editingBuffer: String): Unit = definedExternally
    open fun addSelection(line: Any, start: Any, end: Any, top: Any, bottom: Any, dest: Any): Unit = definedExternally
    open fun getSelectionPath(start: Number, end: Number, dest: Path): Unit = definedExternally
    open fun getParagraphAlignment(line: Number): Layout.Alignment = definedExternally
    open fun getParagraphLeft(line: Number): Number = definedExternally
    open fun getParagraphRight(line: Number): Number = definedExternally
    open fun getParagraphLeadingMargin(line: Any): Unit = definedExternally
    open fun isSpanned(): Boolean = definedExternally
    open fun getEllipsisChar(method: Any): Unit = definedExternally
    open fun ellipsize(start: Any, end: Any, line: Any, dest: Any, destoff: Any, method: Any): Unit = definedExternally
    open fun getEllipsisStart(line: Number): Number = definedExternally
    open fun getEllipsisCount(line: Number): Number = definedExternally
    open var mText: Any = definedExternally
    open var mPaint: Any = definedExternally
    open var mWorkPaint: TextPaint = definedExternally
    open var mWidth: Any = definedExternally
    open var mAlignment: Any = definedExternally
    open var mSpacingMult: Any = definedExternally
    open var mSpacingAdd: Any = definedExternally
    open var mSpannedText: Any = definedExternally
    open var mTextDir: Any = definedExternally
    open var mLineBackgroundSpans: Any = definedExternally

    companion object {
        var NO_PARA_SPANS: Any = definedExternally
        fun getDesiredWidth(source: String, paint: TextPaint): Number = definedExternally
        fun getDesiredWidth(source: String, start: Number, end: Number, paint: TextPaint): Number = definedExternally
        fun getDesiredWidth_2(source: Any, paint: Any): Unit = definedExternally
        fun getDesiredWidth_4(source: Any, start: Any, end: Any, paint: Any): Unit = definedExternally
        fun measurePara(paint: TextPaint, text: String, start: Number, end: Number): Number = definedExternally
        fun nextTab(text: String, start: Number, end: Number, h: Number, tabs: Array<Any>): Number = definedExternally
        fun <T> getParagraphSpans(text: Spanned, start: Number, end: Number, type: Any): Array<T> = definedExternally
        var sTempRect: Any = definedExternally
        var DIR_LEFT_TO_RIGHT: Number = definedExternally
        var DIR_RIGHT_TO_LEFT: Number = definedExternally
        var DIR_REQUEST_LTR: Number = definedExternally
        var DIR_REQUEST_RTL: Number = definedExternally
        var DIR_REQUEST_DEFAULT_LTR: Number = definedExternally
        var DIR_REQUEST_DEFAULT_RTL: Number = definedExternally
        var RUN_LENGTH_MASK: Number = definedExternally
        var RUN_LEVEL_SHIFT: Number = definedExternally
        var RUN_LEVEL_MASK: Number = definedExternally
        var RUN_RTL_FLAG: Number = definedExternally
        var TAB_INCREMENT: Any = definedExternally
        var DIRS_ALL_LEFT_TO_RIGHT: Layout.Directions = definedExternally
        var DIRS_ALL_RIGHT_TO_LEFT: Layout.Directions = definedExternally
        var ELLIPSIS_NORMAL: Array<String> = definedExternally
        var ELLIPSIS_TWO_DOTS: Array<String> = definedExternally
    }
}

external open class MeasuredText {
    open var mText: String = definedExternally
    open var mTextStart: Number = definedExternally
    open var mWidths: Array<Number> = definedExternally
    open var mChars: String = definedExternally
    open var mLevels: Array<Number> = definedExternally
    open var mDir: Number = definedExternally
    open var mEasy: Boolean = definedExternally
    open var mLen: Number = definedExternally
    open var mPos: Any = definedExternally
    open var mWorkPaint: Any = definedExternally
    open fun setPos(pos: Number): Unit = definedExternally
    open fun setPara(text: String, start: Number, end: Number, textDir: TextDirectionHeuristic): Unit = definedExternally
    open fun addStyleRun(paint: TextPaint, len: Number, fm: Paint.FontMetricsInt): Number = definedExternally
    open fun addStyleRun(paint: TextPaint, spans: Array<MetricAffectingSpan>, len: Number, fm: Paint.FontMetricsInt): Number = definedExternally
    open fun addStyleRun_3(paint: Any, len: Any, fm: Any): Unit = definedExternally
    open fun addStyleRun_4(paint: Any, spans: Any, len: Any, fm: Any): Unit = definedExternally
    open fun breakText(limit: Number, forwards: Boolean, width: Number): Number = definedExternally
    open fun measure(start: Number, limit: Number): Number = definedExternally

    companion object {
        var localLOGV: Any = definedExternally
        var sLock: Any = definedExternally
        var sCached: Any = definedExternally
        fun obtain(): MeasuredText = definedExternally
        fun recycle(mt: MeasuredText): MeasuredText = definedExternally
    }
}

external open class TextUtils {
    enum class TruncateAt {
        START /* = 0 */,
        MIDDLE /* = 1 */,
        END /* = 2 */,
        MARQUEE /* = 3 */,
        END_SMALL /* = 4 */
    }

    interface EllipsizeCallback {
        fun ellipsized(start: Number, end: Number)
    }

    companion object {
        fun isEmpty(str: String): Boolean = definedExternally
        var ALIGNMENT_SPAN: Number = definedExternally
        var FIRST_SPAN: Number = definedExternally
        var FOREGROUND_COLOR_SPAN: Number = definedExternally
        var RELATIVE_SIZE_SPAN: Number = definedExternally
        var SCALE_X_SPAN: Number = definedExternally
        var STRIKETHROUGH_SPAN: Number = definedExternally
        var UNDERLINE_SPAN: Number = definedExternally
        var STYLE_SPAN: Number = definedExternally
        var BULLET_SPAN: Number = definedExternally
        var QUOTE_SPAN: Number = definedExternally
        var LEADING_MARGIN_SPAN: Number = definedExternally
        var URL_SPAN: Number = definedExternally
        var BACKGROUND_COLOR_SPAN: Number = definedExternally
        var TYPEFACE_SPAN: Number = definedExternally
        var SUPERSCRIPT_SPAN: Number = definedExternally
        var SUBSCRIPT_SPAN: Number = definedExternally
        var ABSOLUTE_SIZE_SPAN: Number = definedExternally
        var TEXT_APPEARANCE_SPAN: Number = definedExternally
        var ANNOTATION: Number = definedExternally
        var SUGGESTION_SPAN: Number = definedExternally
        var SPELL_CHECK_SPAN: Number = definedExternally
        var SUGGESTION_RANGE_SPAN: Number = definedExternally
        var EASY_EDIT_SPAN: Number = definedExternally
        var LOCALE_SPAN: Number = definedExternally
        var LAST_SPAN: Number = definedExternally
        var EMPTY_STRING_ARRAY: Any = definedExternally
        var ZWNBS_CHAR: Any = definedExternally
        var ARAB_SCRIPT_SUBTAG: Any = definedExternally
        var HEBR_SCRIPT_SUBTAG: Any = definedExternally
        fun getOffsetBefore(text: String, offset: Number): Number = definedExternally
        fun getOffsetAfter(text: String, offset: Number): Number = definedExternally
        fun ellipsize(text: String, paint: TextPaint, avail: Number, where: TextUtils.TruncateAt, preserveLength: Boolean? = definedExternally /* null */, callback: TextUtils.EllipsizeCallback? = definedExternally /* null */, textDir: TextDirectionHeuristic? = definedExternally /* null */, ellipsis: Any? = definedExternally /* null */): String = definedExternally
        fun setPara(mt: Any, paint: Any, text: Any, start: Any, end: Any, textDir: Any): Unit = definedExternally
        fun <T> removeEmptySpans(spans: Array<T>, spanned: Spanned, klass: Any): Array<T> = definedExternally
        fun packRangeInLong(start: Number, end: Number): Array<Number> = definedExternally
        fun unpackRangeStartFromLong(range: Array<Number>): Number = definedExternally
        fun unpackRangeEndFromLong(range: Array<Number>): Number = definedExternally
    }
}

external open class InputType {
    open class LimitCode {
        companion object {
            var TYPE_CLASS_NUMBER: Array<Number> = definedExternally
            var TYPE_CLASS_PHONE: Array<Number> = definedExternally
        }
    }

    companion object {
        var TYPE_MASK_CLASS: Number = definedExternally
        var TYPE_MASK_VARIATION: Number = definedExternally
        var TYPE_MASK_FLAGS: Number = definedExternally
        var TYPE_NULL: Number = definedExternally
        var TYPE_CLASS_TEXT: Number = definedExternally
        var TYPE_TEXT_FLAG_CAP_CHARACTERS: Number = definedExternally
        var TYPE_TEXT_FLAG_CAP_WORDS: Number = definedExternally
        var TYPE_TEXT_FLAG_CAP_SENTENCES: Number = definedExternally
        var TYPE_TEXT_FLAG_AUTO_CORRECT: Number = definedExternally
        var TYPE_TEXT_FLAG_AUTO_COMPLETE: Number = definedExternally
        var TYPE_TEXT_FLAG_MULTI_LINE: Number = definedExternally
        var TYPE_TEXT_FLAG_IME_MULTI_LINE: Number = definedExternally
        var TYPE_TEXT_FLAG_NO_SUGGESTIONS: Number = definedExternally
        var TYPE_TEXT_VARIATION_NORMAL: Number = definedExternally
        var TYPE_TEXT_VARIATION_URI: Number = definedExternally
        var TYPE_TEXT_VARIATION_EMAIL_ADDRESS: Number = definedExternally
        var TYPE_TEXT_VARIATION_EMAIL_SUBJECT: Number = definedExternally
        var TYPE_TEXT_VARIATION_SHORT_MESSAGE: Number = definedExternally
        var TYPE_TEXT_VARIATION_LONG_MESSAGE: Number = definedExternally
        var TYPE_TEXT_VARIATION_PERSON_NAME: Number = definedExternally
        var TYPE_TEXT_VARIATION_POSTAL_ADDRESS: Number = definedExternally
        var TYPE_TEXT_VARIATION_PASSWORD: Number = definedExternally
        var TYPE_TEXT_VARIATION_VISIBLE_PASSWORD: Number = definedExternally
        var TYPE_TEXT_VARIATION_WEB_EDIT_TEXT: Number = definedExternally
        var TYPE_TEXT_VARIATION_FILTER: Number = definedExternally
        var TYPE_TEXT_VARIATION_PHONETIC: Number = definedExternally
        var TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS: Number = definedExternally
        var TYPE_TEXT_VARIATION_WEB_PASSWORD: Number = definedExternally
        var TYPE_CLASS_NUMBER: Number = definedExternally
        var TYPE_NUMBER_FLAG_SIGNED: Number = definedExternally
        var TYPE_NUMBER_FLAG_DECIMAL: Number = definedExternally
        var TYPE_NUMBER_VARIATION_NORMAL: Number = definedExternally
        var TYPE_NUMBER_VARIATION_PASSWORD: Number = definedExternally
        var TYPE_CLASS_PHONE: Number = definedExternally
        var TYPE_CLASS_DATETIME: Number = definedExternally
        var TYPE_DATETIME_VARIATION_NORMAL: Number = definedExternally
        var TYPE_DATETIME_VARIATION_DATE: Number = definedExternally
        var TYPE_DATETIME_VARIATION_TIME: Number = definedExternally
    }
}

external open class BoringLayout(source: String, paint: TextPaint, outerwidth: Number, align: Layout.Alignment, spacingmult: Number, spacingadd: Number, metrics: BoringLayout.Metrics, includepad: Boolean, ellipsize: TextUtils.TruncateAt? = definedExternally /* null */, ellipsizedWidth: Number? = definedExternally /* null */) : Layout, TextUtils.EllipsizeCallback {
    open class Metrics : Paint.FontMetricsInt {
        open var width: Number = definedExternally
        override fun toString(): String = definedExternally
    }

    open fun replaceOrMake(source: String, paint: TextPaint, outerwidth: Number, align: Layout.Alignment, spacingmult: Number, spacingadd: Number, metrics: BoringLayout.Metrics, includepad: Boolean, ellipsize: TextUtils.TruncateAt? = definedExternally /* null */, ellipsizedWidth: Number? = definedExternally /* null */): BoringLayout = definedExternally
    open fun init(source: String, paint: TextPaint, outerwidth: Number, align: Layout.Alignment, spacingmult: Number, spacingadd: Number, metrics: BoringLayout.Metrics, includepad: Boolean, trustWidth: Boolean): Unit = definedExternally
    override fun getHeight(): Number = definedExternally
    override fun getLineCount(): Number = definedExternally
    override fun getLineTop(line: Number): Number = definedExternally
    override fun getLineDescent(line: Number): Number = definedExternally
    override fun getLineStart(line: Number): Number = definedExternally
    override fun getParagraphDirection(line: Number): Number = definedExternally
    override fun getLineContainsTab(line: Number): Boolean = definedExternally
    override fun getLineMax(line: Number): Number = definedExternally
    override fun getLineDirections(line: Number): Layout.Directions = definedExternally
    override fun getTopPadding(): Number = definedExternally
    override fun getBottomPadding(): Number = definedExternally
    override fun getEllipsisCount(line: Number): Number = definedExternally
    override fun getEllipsisStart(line: Number): Number = definedExternally
    override fun getEllipsizedWidth(): Number = definedExternally
//    override fun draw(c: Canvas, highlight: Path, highlightpaint: Paint, cursorOffset: Number): Unit = definedExternally
    fun draw(c: Canvas, highlight: Path, highlightpaint: Paint, cursorOffset: Number): Unit = definedExternally
    override fun ellipsized(start: Number, end: Number): Unit = definedExternally
    open var mDirect: Any = definedExternally
    open var mBottom: Number = definedExternally
    open var mDesc: Number = definedExternally
    open var mTopPadding: Any = definedExternally
    open var mBottomPadding: Any = definedExternally
    open var mMax: Any = definedExternally
    open var mEllipsizedWidth: Any = definedExternally
    open var mEllipsizedStart: Any = definedExternally
    open var mEllipsizedCount: Any = definedExternally

    companion object {
        fun make(source: String, paint: TextPaint, outerwidth: Number, align: Layout.Alignment, spacingmult: Number, spacingadd: Number, metrics: BoringLayout.Metrics, includepad: Boolean, ellipsize: TextUtils.TruncateAt? = definedExternally /* null */, ellipsizedWidth: Number? = definedExternally /* null */): BoringLayout = definedExternally
        fun isBoring(text: String, paint: TextPaint, textDir: TextDirectionHeuristic? = definedExternally /* null */, metrics: BoringLayout.Metrics? = definedExternally /* null */): BoringLayout.Metrics = definedExternally
        var FIRST_RIGHT_TO_LEFT: Any = definedExternally
        var sTemp: Any = definedExternally
    }
}

external open class PackedIntVector(columns: Number) {
    open var mColumns: Any = definedExternally
    open var mRows: Any = definedExternally
    open var mRowGapStart: Any = definedExternally
    open var mRowGapLength: Any = definedExternally
    open var mValues: Any = definedExternally
    open var mValueGap: Any = definedExternally
    open fun getValue(row: Number, column: Number): Number = definedExternally
    open fun setValue(row: Number, column: Number, value: Number): Unit = definedExternally
    open fun setValueInternal(row: Any, column: Any, value: Any): Unit = definedExternally
    open fun adjustValuesBelow(startRow: Number, column: Number, delta: Number): Unit = definedExternally
    open fun insertAt(row: Number, values: Array<Number>): Unit = definedExternally
    open fun deleteAt(row: Number, count: Number): Unit = definedExternally
    open fun size(): Number = definedExternally
    open fun width(): Number = definedExternally
    open fun growBuffer(): Unit = definedExternally
    open fun moveValueGapTo(column: Any, where: Any): Unit = definedExternally
    open fun moveRowGapTo(where: Any): Unit = definedExternally
}

external open class PackedObjectVector<E>(columns: Number) {
    open var mColumns: Any = definedExternally
    open var mRows: Any = definedExternally
    open var mRowGapStart: Any = definedExternally
    open var mRowGapLength: Any = definedExternally
    open var mValues: Any = definedExternally
    open fun getValue(row: Number, column: Number): E = definedExternally
    open fun setValue(row: Number, column: Number, value: E): Unit = definedExternally
    open fun insertAt(row: Number, values: Array<E>): Unit = definedExternally
    open fun deleteAt(row: Number, count: Number): Unit = definedExternally
    open fun size(): Number = definedExternally
    open fun width(): Number = definedExternally
    open fun growBuffer(): Unit = definedExternally
    open fun moveRowGapTo(where: Any): Unit = definedExternally
    open fun dump(): Unit = definedExternally
}

external abstract class Spannable : Spanned {
    open class Factory {
        open fun newSpannable(source: String): Spannable = definedExternally

        companion object {
            var sInstance: Any = definedExternally
            fun getInstance(): Spannable.Factory = definedExternally
        }
    }

    fun setSpan(what: Any, start: Number, end: Number, flags: Number)
    fun removeSpan(what: Any)
}

external open class StaticLayout(source: String, bufstart: Number, bufend: Number, paint: TextPaint, outerwidth: Number, align: Layout.Alignment, textDir: TextDirectionHeuristic, spacingmult: Number, spacingadd: Number, includepad: Boolean, ellipsize: TextUtils.TruncateAt? = definedExternally /* null */, ellipsizedWidth: Number? = definedExternally /* null */, maxLines: Number? = definedExternally /* null */) : Layout {
    open fun generate(source: String, bufStart: Number, bufEnd: Number, paint: TextPaint, outerWidth: Number, textDir: TextDirectionHeuristic, spacingmult: Number, spacingadd: Number, includepad: Boolean, trackpad: Boolean, ellipsizedWidth: Number, ellipsize: TextUtils.TruncateAt): Unit = definedExternally
    open fun out(text: Any, start: Any, end: Any, above: Any, below: Any, top: Any, bottom: Any, v: Any, spacingmult: Any, spacingadd: Any, chooseHt: Any, chooseHtv: Any, fm: Any, hasTabOrEmoji: Any, needMultiply: Any, chdirs: Any, dir: Any, easy: Any, bufEnd: Any, includePad: Any, trackPad: Any, chs: Any, widths: Any, widthStart: Any, ellipsize: Any, ellipsisWidth: Any, textWidth: Any, paint: Any, moreChars: Any): Unit = definedExternally
    open fun calculateEllipsis(lineStart: Any, lineEnd: Any, widths: Any, widthStart: Any, avail: Any, where: Any, line: Any, textWidth: Any, paint: Any, forceEllipsis: Any): Unit = definedExternally
    override fun getLineForVertical(vertical: Number): Number = definedExternally
    override fun getLineCount(): Number = definedExternally
    override fun getLineTop(line: Number): Number = definedExternally
    override fun getLineDescent(line: Number): Number = definedExternally
    override fun getLineStart(line: Number): Number = definedExternally
    override fun getParagraphDirection(line: Number): Number = definedExternally
    override fun getLineContainsTab(line: Number): Boolean = definedExternally
    override fun getLineDirections(line: Number): Layout.Directions = definedExternally
    override fun getTopPadding(): Number = definedExternally
    override fun getBottomPadding(): Number = definedExternally
    override fun getEllipsisCount(line: Number): Number = definedExternally
    override fun getEllipsisStart(line: Number): Number = definedExternally
    override fun getEllipsizedWidth(): Number = definedExternally
    open fun prepare(): Unit = definedExternally
    open fun finish(): Unit = definedExternally
    open var mLineCount: Any = definedExternally
    open var mTopPadding: Any = definedExternally
    open var mBottomPadding: Any = definedExternally
    open var mColumns: Any = definedExternally
    open var mEllipsizedWidth: Any = definedExternally
    open var mLines: Any = definedExternally
    open var mLineDirections: Any = definedExternally
    open var mMaximumVisibleLineCount: Any = definedExternally
    open var mMeasured: Any = definedExternally
    open var mFontMetricsInt: Any = definedExternally

    companion object {
        var TAG: String = definedExternally
        fun isIdeographic(c: Any, includeNonStarters: Any): Unit = definedExternally
        var COLUMNS_NORMAL: Any = definedExternally
        var COLUMNS_ELLIPSIZE: Any = definedExternally
        var START: Any = definedExternally
        var DIR: Any = definedExternally
        var TAB: Any = definedExternally
        var TOP: Any = definedExternally
        var DESCENT: Any = definedExternally
        var ELLIPSIS_START: Any = definedExternally
        var ELLIPSIS_COUNT: Any = definedExternally
        var START_MASK: Any = definedExternally
        var DIR_SHIFT: Any = definedExternally
        var TAB_MASK: Any = definedExternally
        var CHAR_FIRST_CJK: Any = definedExternally
        var CHAR_NEW_LINE: Any = definedExternally
        var CHAR_TAB: Any = definedExternally
        var CHAR_SPACE: Any = definedExternally
        var CHAR_SLASH: Any = definedExternally
        var CHAR_HYPHEN: Any = definedExternally
        var CHAR_ZWSP: Any = definedExternally
        var EXTRA_ROUNDING: Any = definedExternally
        var CHAR_FIRST_HIGH_SURROGATE: Any = definedExternally
        var CHAR_LAST_LOW_SURROGATE: Any = definedExternally
    }
}

external open class DynamicLayout(base: String, display: String, paint: TextPaint, width: Number, align: Layout.Alignment, textDir: TextDirectionHeuristic, spacingmult: Number, spacingadd: Number, includepad: Boolean, ellipsize: TextUtils.TruncateAt? = definedExternally /* null */, ellipsizedWidth: Number? = definedExternally /* null */) : Layout {
    open fun reflow(s: Any, where: Any, before: Any, after: Any): Unit = definedExternally
    open fun createBlocks(): Unit = definedExternally
    open fun addBlockAtOffset(offset: Any): Unit = definedExternally
    open fun updateBlocks(startLine: Number, endLine: Number, newLineCount: Number): Unit = definedExternally
    open fun setBlocksDataForTest(blockEndLines: Array<Number>, blockIndices: Array<Number>, numberOfBlocks: Number): Unit = definedExternally
    open fun getBlockEndLines(): Array<Number> = definedExternally
    open fun getBlockIndices(): Array<Number> = definedExternally
    open fun getNumberOfBlocks(): Number = definedExternally
    open fun getIndexFirstChangedBlock(): Number = definedExternally
    open fun setIndexFirstChangedBlock(i: Number): Unit = definedExternally
    override fun getLineCount(): Number = definedExternally
    override fun getLineTop(line: Number): Number = definedExternally
    override fun getLineDescent(line: Number): Number = definedExternally
    override fun getLineStart(line: Number): Number = definedExternally
    override fun getLineContainsTab(line: Number): Boolean = definedExternally
    override fun getParagraphDirection(line: Number): Number = definedExternally
    override fun getLineDirections(line: Number): Layout.Directions = definedExternally
    override fun getTopPadding(): Number = definedExternally
    override fun getBottomPadding(): Number = definedExternally
    override fun getEllipsizedWidth(): Number = definedExternally
    override fun getEllipsisStart(line: Number): Number = definedExternally
    override fun getEllipsisCount(line: Number): Number = definedExternally
    open var mBase: Any = definedExternally
    open var mDisplay: Any = definedExternally
    open var mWatcher: Any = definedExternally
    open var mIncludePad: Any = definedExternally
    open var mEllipsize: Any = definedExternally
    open var mEllipsizedWidth: Any = definedExternally
    open var mEllipsizeAt: Any = definedExternally
    open var mInts: Any = definedExternally
    open var mObjects: Any = definedExternally
    open var mBlockEndLines: Any = definedExternally
    open var mBlockIndices: Any = definedExternally
    open var mNumberOfBlocks: Any = definedExternally
    open var mIndexFirstChangedBlock: Any = definedExternally
    open var mTopPadding: Any = definedExternally
    open var mBottomPadding: Any = definedExternally

    companion object {
        var PRIORITY: Any = definedExternally
        var BLOCK_MINIMUM_CHARACTER_LENGTH: Any = definedExternally
        var INVALID_BLOCK_INDEX: Number = definedExternally
        var sStaticLayout: Any = definedExternally
        var sLock: Any = definedExternally
        var START: Any = definedExternally
        var DIR: Any = definedExternally
        var TAB: Any = definedExternally
        var TOP: Any = definedExternally
        var DESCENT: Any = definedExternally
        var COLUMNS_NORMAL: Any = definedExternally
        var ELLIPSIS_START: Any = definedExternally
        var ELLIPSIS_COUNT: Any = definedExternally
        var COLUMNS_ELLIPSIZE: Any = definedExternally
        var START_MASK: Any = definedExternally
        var DIR_SHIFT: Any = definedExternally
        var TAB_MASK: Any = definedExternally
        var ELLIPSIS_UNDEFINED: Any = definedExternally
    }
}

external interface SpanWatcher {
    fun onSpanAdded(text: Spannable, what: Any, start: Number, end: Number)
    fun onSpanRemoved(text: Spannable, what: Any, start: Number, end: Number)
    fun onSpanChanged(text: Spannable, what: Any, ostart: Number, oend: Number, nstart: Number, nend: Number)
}
