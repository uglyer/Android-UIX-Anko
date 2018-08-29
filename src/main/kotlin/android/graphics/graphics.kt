@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.graphics")
package android.graphics

import androidui.image.NetImage
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

external open class Rect {
    constructor()
    constructor(r: Rect)
    constructor(left: Number, top: Number, right: Number, bottom: Number)
    open var left: Number = definedExternally
    open var top: Number = definedExternally
    open var right: Number = definedExternally
    open var bottom: Number = definedExternally
    open fun equals(r: Rect): Boolean = definedExternally
    override fun toString(): String = definedExternally
    open fun toShortString(sb: StringBuilder? = definedExternally /* null */): String = definedExternally
    open fun flattenToString(): String = definedExternally
    open fun isEmpty(): Boolean = definedExternally
    open fun width(): Number = definedExternally
    open fun height(): Number = definedExternally
    open fun centerX(): Number = definedExternally
    open fun centerY(): Number = definedExternally
    open fun exactCenterX(): Number = definedExternally
    open fun exactCenterY(): Number = definedExternally
    open fun setEmpty(): Unit = definedExternally
    open fun set(src: Rect): Any = definedExternally
    open fun set(left: Any, top: Any, right: Any, bottom: Any): Any = definedExternally
    open fun offset(dx: Any, dy: Any): Unit = definedExternally
    open fun offsetTo(newLeft: Any, newTop: Any): Unit = definedExternally
    open fun inset(dx: Any, dy: Any): Unit = definedExternally
    open fun contains(x: Number, y: Number): Boolean = definedExternally
    open fun contains(left: Number, top: Number, right: Number, bottom: Number): Boolean = definedExternally
    open fun contains(r: Rect): Boolean = definedExternally
    open fun intersect(r: Rect): Boolean = definedExternally
    open fun intersect(left: Number, top: Number, right: Number, bottom: Number): Boolean = definedExternally
    open fun setIntersect(a: Rect, b: Rect): Boolean = definedExternally
    open fun intersects(rect: Rect): Boolean = definedExternally
    open fun intersects(left: Number, top: Number, right: Number, bottom: Number): Boolean = definedExternally
    open fun union(r: Rect): Any = definedExternally
    open fun union(x: Number, y: Number): Any = definedExternally
    open fun union(left: Number, top: Number, right: Number, bottom: Number): Any = definedExternally
    open fun sort(): Unit = definedExternally
    open fun scale(scale: Number): Unit = definedExternally
    companion object {
        fun unflattenFromString(str: String): Rect = definedExternally
        fun intersects(a: Rect, b: Rect): Boolean = definedExternally
    }
}
external open class PixelFormat {
    companion object {
        var UNKNOWN: Number = definedExternally
        var TRANSLUCENT: Number = definedExternally
        var TRANSPARENT: Number = definedExternally
        var OPAQUE: Number = definedExternally
        var RGBA_8888: Number = definedExternally
        var RGBX_8888: Number = definedExternally
        var RGB_888: Number = definedExternally
        var RGB_565: Number = definedExternally
    }
}
external open class Color {
    companion object {
        var BLACK: Number = definedExternally
        var DKGRAY: Number = definedExternally
        var GRAY: Number = definedExternally
        var LTGRAY: Number = definedExternally
        var WHITE: Number = definedExternally
        var RED: Number = definedExternally
        var GREEN: Number = definedExternally
        var BLUE: Number = definedExternally
        var YELLOW: Number = definedExternally
        var CYAN: Number = definedExternally
        var MAGENTA: Number = definedExternally
        var TRANSPARENT: Number = definedExternally
        fun alpha(color: Number): Number = definedExternally
        fun red(color: Number): Number = definedExternally
        fun green(color: Number): Number = definedExternally
        fun blue(color: Number): Number = definedExternally
        fun rgb(red: Number, green: Number, blue: Number): Number = definedExternally
        fun argb(alpha: Number, red: Number, green: Number, blue: Number): Number = definedExternally
        fun rgba(red: Number, green: Number, blue: Number, alpha: Number): Number = definedExternally
        fun parseColor(colorString: String, defaultColor: Number? = definedExternally /* null */): Number = definedExternally
        fun toARGBHex(color: Number): String = definedExternally
        fun toRGBAFunc(color: Number): String = definedExternally
        fun getHtmlColor(color: String): Number = definedExternally
        var sColorNameMap: Map<String, Number> = definedExternally
    }
}
external open class Paint(flag: Number? = definedExternally /* null */) {
    enum class Align {
        LEFT /* = 0 */,
        CENTER /* = 1 */,
        RIGHT /* = 2 */
    }
    open class FontMetrics {
        open var top: Number = definedExternally
        open var ascent: Number = definedExternally
        open var descent: Number = definedExternally
        open var bottom: Number = definedExternally
        open var leading: Number = definedExternally
    }
    open class FontMetricsInt {
        open var top: Number = definedExternally
        open var ascent: Number = definedExternally
        open var descent: Number = definedExternally
        open var bottom: Number = definedExternally
        open var leading: Number = definedExternally
        override fun toString(): String = definedExternally
    }
    enum class Style {
        FILL /* = 0 */,
        STROKE /* = 1 */,
        FILL_AND_STROKE /* = 2 */
    }
    enum class Cap {
        BUTT /* = 0 */,
        ROUND /* = 1 */,
        SQUARE /* = 2 */
    }
    enum class Join {
        MITER /* = 0 */,
        ROUND /* = 1 */,
        BEVEL /* = 2 */
    }

    open var mTextStyle: Any = definedExternally
    open var mColor: Any = definedExternally
    open var mStrokeWidth: Any = definedExternally
    open var align: Any = definedExternally
    open var mStrokeCap: Any = definedExternally
    open var mStrokeJoin: Any = definedExternally
    open var textSize: Any = definedExternally
    open var textScaleX: Any = definedExternally
    open var mFlag: Any = definedExternally
    open var hasShadow: Boolean = definedExternally
    open var shadowDx: Number = definedExternally
    open var shadowDy: Number = definedExternally
    open var shadowRadius: Number = definedExternally
    open var shadowColor: Number = definedExternally
    open var drawableState: Array<Number> = definedExternally
    open fun set(src: Paint): Unit = definedExternally
    open fun setClassVariablesFrom(paint: Any): Unit = definedExternally
    open fun getStyle(): Paint.Style = definedExternally
    open fun setStyle(style: Paint.Style): Unit = definedExternally
    open fun getFlags(): Number = definedExternally
    open fun setFlags(flags: Number): Unit = definedExternally
    open fun getTextScaleX(): Number = definedExternally
    open fun setTextScaleX(scaleX: Number): Unit = definedExternally
    open fun getColor(): Number = definedExternally
    open fun setColor(color: Number): Unit = definedExternally
    open fun setARGB(a: Number, r: Number, g: Number, b: Number): Unit = definedExternally
    open fun getAlpha(): Number = definedExternally
    open fun setAlpha(alpha: Number): Unit = definedExternally
    open fun getStrokeWidth(): Number = definedExternally
    open fun setStrokeWidth(width: Number): Unit = definedExternally
    open fun getStrokeCap(): Paint.Cap = definedExternally
    open fun setStrokeCap(cap: Paint.Cap): Unit = definedExternally
    open fun getStrokeJoin(): Paint.Join = definedExternally
    open fun setStrokeJoin(join: Paint.Join): Unit = definedExternally
    open fun setAntiAlias(enable: Boolean): Unit = definedExternally
    open fun isAntiAlias(): Boolean = definedExternally
    open fun setShadowLayer(radius: Number, dx: Number, dy: Number, color: Number): Unit = definedExternally
    open fun clearShadowLayer(): Unit = definedExternally
    open fun getTextAlign(): Paint.Align = definedExternally
    open fun setTextAlign(align: Paint.Align): Unit = definedExternally
    open fun getTextSize(): Number = definedExternally
    open fun setTextSize(textSize: Number): Unit = definedExternally
    open fun ascent(): Number = definedExternally
    open fun descent(): Number = definedExternally
    open fun getFontMetricsInt(fmi: Paint.FontMetricsInt): Number = definedExternally
    open fun getFontMetrics(metrics: Paint.FontMetrics): Number = definedExternally
    open fun measureText(text: String, index: Number? = definedExternally /* null */, count: Number? = definedExternally /* null */): Number = definedExternally
    open fun getTextWidths_count(text: String, index: Number, count: Number, widths: Array<Number>): Number = definedExternally
    open fun getTextWidths_end(text: String, start: Number, end: Number, widths: Array<Number>): Number = definedExternally
    open fun getTextWidths_2(text: String, widths: Array<Number>): Number = definedExternally
    open fun getTextRunAdvances_count(chars: String, index: Number, count: Number, contextIndex: Number, contextCount: Number, flags: Number, advances: Array<Number>, advancesIndex: Number): Number = definedExternally
    open fun getTextRunAdvances_end(text: String, start: Number, end: Number, contextStart: Number, contextEnd: Number, flags: Number, advances: Array<Number>, advancesIndex: Number): Number = definedExternally
    open fun getTextRunCursor_len(text: String, contextStart: Number, contextLength: Number, flags: Number, offset: Number, cursorOpt: Number): Number = definedExternally
    open fun getTextRunCursor_end(text: String, contextStart: Number, contextEnd: Number, flags: Number, offset: Number, cursorOpt: Number): Number = definedExternally
    open fun isEmpty(): Boolean = definedExternally
    open fun applyToCanvas(canvas: Canvas): Unit = definedExternally
    companion object {
        var FontMetrics_Size_Ascent: Any = definedExternally
        var FontMetrics_Size_Bottom: Any = definedExternally
        var FontMetrics_Size_Descent: Any = definedExternally
        var FontMetrics_Size_Leading: Any = definedExternally
        var FontMetrics_Size_Top: Any = definedExternally
        var DIRECTION_LTR: Number = definedExternally
        var DIRECTION_RTL: Number = definedExternally
        var CURSOR_AFTER: Number = definedExternally
        var CURSOR_AT_OR_AFTER: Number = definedExternally
        var CURSOR_BEFORE: Number = definedExternally
        var CURSOR_AT_OR_BEFORE: Number = definedExternally
        var CURSOR_AT: Number = definedExternally
        var CURSOR_OPT_MAX_VALUE: Any = definedExternally
        var ANTI_ALIAS_FLAG: Number = definedExternally
        var FILTER_BITMAP_FLAG: Number = definedExternally
        var DITHER_FLAG: Number = definedExternally
        var UNDERLINE_TEXT_FLAG: Number = definedExternally
        var STRIKE_THRU_TEXT_FLAG: Number = definedExternally
        var FAKE_BOLD_TEXT_FLAG: Number = definedExternally
        var LINEAR_TEXT_FLAG: Number = definedExternally
        var SUBPIXEL_TEXT_FLAG: Number = definedExternally
        var DEV_KERN_TEXT_FLAG: Number = definedExternally
        var LCD_RENDER_TEXT_FLAG: Number = definedExternally
        var EMBEDDED_BITMAP_TEXT_FLAG: Number = definedExternally
        var AUTO_HINTING_TEXT_FLAG: Number = definedExternally
        var VERTICAL_TEXT_FLAG: Number = definedExternally
        var DEFAULT_PAINT_FLAGS: Number = definedExternally
    }
}
external open class Path {
    open fun reset(): Unit = definedExternally
}
external open class Point {
    constructor()
    constructor(x: Number, y: Number)
    constructor(src: Point)
    open var x: Number = definedExternally
    open var y: Number = definedExternally
    open fun set(x: Number, y: Number): Unit = definedExternally
    open fun negate(): Unit = definedExternally
    open fun offset(dx: Number, dy: Number): Unit = definedExternally
    open fun equals(x: Number, y: Number): Boolean = definedExternally
    override fun equals(o: Any?): Boolean = definedExternally
    override fun toString(): String = definedExternally
}
external open class RectF : Rect
external open class Matrix {
    enum class ScaleToFit {
        FILL /* = 0 */,
        START /* = 1 */,
        CENTER /* = 2 */,
        END /* = 3 */
    }

    constructor()
    constructor(src: Matrix)
    constructor(values: Array<Number>)
    open var mValues: Any = definedExternally
    open fun isIdentity(): Boolean = definedExternally
    open fun hasPerspective(): Boolean = definedExternally
    open fun rectStaysRect(): Boolean = definedExternally
    open fun set(src: Matrix): Unit = definedExternally
    override fun equals(obj: Any?): Boolean = definedExternally
    override fun hashCode(): Number = definedExternally
    open fun reset(): Unit = definedExternally
    open fun setTranslate(dx: Number, dy: Number): Unit = definedExternally
    open fun setScale(sx: Number, sy: Number, px: Number? = definedExternally /* null */, py: Number? = definedExternally /* null */): Unit = definedExternally
    open fun setRotate(degrees: Number, px: Number? = definedExternally /* null */, py: Number? = definedExternally /* null */): Unit = definedExternally
    open fun setSinCos(sinValue: Number, cosValue: Number, px: Number? = definedExternally /* null */, py: Number? = definedExternally /* null */): Unit = definedExternally
    open fun setSkew(kx: Number, ky: Number, px: Number? = definedExternally /* null */, py: Number? = definedExternally /* null */): Unit = definedExternally
    open fun setConcat(a: Matrix, b: Matrix): Boolean = definedExternally
    open fun preTranslate(dx: Number, dy: Number): Boolean = definedExternally
    open fun preScale(sx: Number, sy: Number, px: Number? = definedExternally /* null */, py: Number? = definedExternally /* null */): Boolean = definedExternally
    open fun preRotate(degrees: Number, px: Number? = definedExternally /* null */, py: Number? = definedExternally /* null */): Boolean = definedExternally
    open fun preSkew(kx: Number, ky: Number, px: Number? = definedExternally /* null */, py: Number? = definedExternally /* null */): Boolean = definedExternally
    open fun preConcat(other: Matrix): Boolean = definedExternally
    open fun postTranslate(dx: Number, dy: Number): Boolean = definedExternally
    open fun postScale(sx: Number, sy: Number, px: Number? = definedExternally /* null */, py: Number? = definedExternally /* null */): Boolean = definedExternally
    open fun postRotate(degrees: Number, px: Number? = definedExternally /* null */, py: Number? = definedExternally /* null */): Boolean = definedExternally
    open fun postSkew(kx: Number, ky: Number, px: Number? = definedExternally /* null */, py: Number? = definedExternally /* null */): Boolean = definedExternally
    open fun postConcat(other: Matrix): Boolean = definedExternally
    open fun setRectToRect(src: RectF, dst: RectF, stf: Matrix.ScaleToFit): Boolean = definedExternally
    open fun mapPoints(dst: Array<Number>, dstIndex: Number? = definedExternally /* null */, src: Array<Number>? = definedExternally /* null */, srcIndex: Number? = definedExternally /* null */, pointCount: Number? = definedExternally /* null */): Unit = definedExternally
    open fun mapVectors(dst: Array<Number>, dstIndex: Number? = definedExternally /* null */, src: Array<Number>? = definedExternally /* null */, srcIndex: Number? = definedExternally /* null */, ptCount: Number? = definedExternally /* null */): Unit = definedExternally
    open fun mapRect(dst: RectF, src: RectF? = definedExternally /* null */): Boolean = definedExternally
    open fun mapRadius(radius: Number): Number = definedExternally
    open fun getValues(values: Array<Number>): Unit = definedExternally
    open fun setValues(values: Array<Number>): Unit = definedExternally
    override fun toString(): String = definedExternally
    open fun toShortString(sb: StringBuilder): Unit = definedExternally
    open fun postTransform(matrix: Any): Unit = definedExternally
    open fun preTransform(matrix: Any): Unit = definedExternally
    open fun computeTypeMask(): Unit = definedExternally
    companion object {
        var MSCALE_X: Number = definedExternally
        var MSKEW_X: Number = definedExternally
        var MTRANS_X: Number = definedExternally
        var MSKEW_Y: Number = definedExternally
        var MSCALE_Y: Number = definedExternally
        var MTRANS_Y: Number = definedExternally
        var MPERSP_0: Number = definedExternally
        var MPERSP_1: Number = definedExternally
        var MPERSP_2: Number = definedExternally
        var MATRIX_SIZE: Any = definedExternally
        var IDENTITY_MATRIX: Matrix = definedExternally
        fun checkPointArrays(src: Any, srcIndex: Any, dst: Any, dstIndex: Any, pointCount: Any): Unit = definedExternally
        fun getPointLength(src: Any, index: Any): Unit = definedExternally
        fun multiply(dest: Array<Number>, a: Array<Number>, b: Array<Number>): Unit = definedExternally
        fun getTranslate(dx: Number, dy: Number): Array<Number> = definedExternally
        fun setTranslate(dest: Array<Number>, dx: Number, dy: Number): Array<Number> = definedExternally
        fun getScale(sx: Number, sy: Number, px: Number? = definedExternally /* null */, py: Number? = definedExternally /* null */): Array<Number> = definedExternally
        fun getRotate_1(degrees: Number): Array<Number> = definedExternally
        fun getRotate_2(sin: Number, cos: Number): Array<Number> = definedExternally
        fun setRotate_1(dest: Array<Number>, degrees: Number): Array<Number> = definedExternally
        fun setRotate_2(dest: Array<Number>, sin: Number, cos: Number): Array<Number> = definedExternally
        fun getRotate_3(degrees: Number, px: Number, py: Number): Array<Number> = definedExternally
        fun getSkew(kx: Number, ky: Number, px: Number? = definedExternally /* null */, py: Number? = definedExternally /* null */): Array<Number> = definedExternally
        fun reset(mtx: Any): Unit = definedExternally
        var kIdentity_Mask: Any = definedExternally
        var kTranslate_Mask: Any = definedExternally
        var kScale_Mask: Any = definedExternally
        var kAffine_Mask: Any = definedExternally
        var kPerspective_Mask: Any = definedExternally
        var kRectStaysRect_Mask: Any = definedExternally
        var kUnknown_Mask: Any = definedExternally
        var kAllMasks: Any = definedExternally
        var kTranslate_Shift: Any = definedExternally
        var kScale_Shift: Any = definedExternally
        var kAffine_Shift: Any = definedExternally
        var kPerspective_Shift: Any = definedExternally
        var kRectStaysRect_Shift: Any = definedExternally
    }
}
external open class Canvas(width: Number, height: Number) {
    open var mCanvasElement: HTMLCanvasElement = definedExternally
    open var mWidth: Any = definedExternally
    open var mHeight: Any = definedExternally
    open var _mCanvasContent: Any = definedExternally
    open var _saveCount: Any = definedExternally
    open var mCurrentClip: Rect = definedExternally
    open var mClipStateMap: Any = definedExternally
    open fun initCanvasImpl(): Unit = definedExternally
    open fun recycle(): Unit = definedExternally
    open fun recycleImpl(): Unit = definedExternally
    open fun getHeight(): Number = definedExternally
    open fun getWidth(): Number = definedExternally
    open fun isNativeAccelerated(): Boolean = definedExternally
    open fun translate(dx: Number, dy: Number): Unit = definedExternally
    open fun translateImpl(dx: Number, dy: Number): Unit = definedExternally
    open fun scale(sx: Number, sy: Number, px: Number? = definedExternally /* null */, py: Number? = definedExternally /* null */): Unit = definedExternally
    open fun scaleImpl(sx: Number, sy: Number): Unit = definedExternally
    open fun rotate(degrees: Number, px: Number? = definedExternally /* null */, py: Number? = definedExternally /* null */): Unit = definedExternally
    open fun rotateImpl(degrees: Number): Unit = definedExternally
    open fun concat(m: android.graphics.Matrix): Unit = definedExternally
    open fun concatImpl(MSCALE_X: Number, MSKEW_X: Number, MTRANS_X: Number, MSKEW_Y: Number, MSCALE_Y: Number, MTRANS_Y: Number, MPERSP_0: Number, MPERSP_1: Number, MPERSP_2: Number): Unit = definedExternally
    open fun drawRGB(r: Number, g: Number, b: Number): Unit = definedExternally
    open fun drawARGB(a: Number, r: Number, g: Number, b: Number): Unit = definedExternally
    open fun drawColor(color: Number): Unit = definedExternally
    open fun drawARGBImpl(a: Number, r: Number, g: Number, b: Number): Unit = definedExternally
    open fun clearColor(): Unit = definedExternally
    open fun clearColorImpl(): Unit = definedExternally
    open fun save(): Number = definedExternally
    open fun saveImpl(): Unit = definedExternally
    open fun restore(): Unit = definedExternally
    open fun restoreImpl(): Unit = definedExternally
    open fun restoreToCount(saveCount: Number): Unit = definedExternally
    open fun getSaveCount(): Number = definedExternally
    open fun clipRect(rect: Rect): Boolean = definedExternally
    open fun clipRect(left: Number, top: Number, right: Number, bottom: Number): Boolean = definedExternally
    open fun clipRect(left: Number, top: Number, right: Number, bottom: Number, radiusTopLeft: Number, radiusTopRight: Number, radiusBottomRight: Number, radiusBottomLeft: Number): Boolean = definedExternally
    open fun clipRectImpl(left: Number, top: Number, width: Number, height: Number): Unit = definedExternally
    open fun clipRoundRect(r: Rect, radiusTopLeft: Number, radiusTopRight: Number, radiusBottomRight: Number, radiusBottomLeft: Number): Boolean = definedExternally
    open fun clipRoundRectImpl(left: Number, top: Number, width: Number, height: Number, radiusTopLeft: Number, radiusTopRight: Number, radiusBottomRight: Number, radiusBottomLeft: Number): Unit = definedExternally
    open fun doRoundRectPath(left: Any, top: Any, width: Any, height: Any, radiusTopLeft: Any, radiusTopRight: Any, radiusBottomRight: Any, radiusBottomLeft: Any): Unit = definedExternally
    open fun getClipBounds(bounds: Rect? = definedExternally /* null */): Rect = definedExternally
    open fun quickReject(rect: Rect): Boolean = definedExternally
    open fun quickReject(left: Number, top: Number, right: Number, bottom: Number): Boolean = definedExternally
    open fun drawCanvas(canvas: Canvas, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): Unit = definedExternally
    open fun drawCanvasImpl(canvas: Canvas, offsetX: Number, offsetY: Number): Unit = definedExternally
    open fun drawImage(image: NetImage, srcRect: Rect? = definedExternally /* null */, dstRect: Rect? = definedExternally /* null */, paint: Paint? = definedExternally /* null */): Unit = definedExternally
    open fun drawImageImpl(image: NetImage, srcRect: Rect? = definedExternally /* null */, dstRect: Rect? = definedExternally /* null */): Unit = definedExternally
    open fun drawRect(rect: Rect, paint: Paint): Any = definedExternally
    open fun drawRect(left: Number, top: Number, right: Number, bottom: Number, paint: Paint): Any = definedExternally
    open fun drawRectImpl(left: Number, top: Number, width: Number, height: Number, style: Paint.Style): Unit = definedExternally
    open fun applyFillOrStrokeToContent(style: Any): Unit = definedExternally
    open fun drawOval(oval: RectF, paint: Paint): Unit = definedExternally
    open fun drawOvalImpl(oval: RectF, style: Paint.Style): Unit = definedExternally
    open fun drawCircle(cx: Number, cy: Number, radius: Number, paint: Paint): Unit = definedExternally
    open fun drawCircleImpl(cx: Number, cy: Number, radius: Number, style: Paint.Style): Unit = definedExternally
    open fun drawArc(oval: RectF, startAngle: Number, sweepAngle: Number, useCenter: Boolean, paint: Paint): Unit = definedExternally
    open fun drawArcImpl(oval: RectF, startAngle: Number, sweepAngle: Number, useCenter: Boolean, style: Paint.Style): Unit = definedExternally
    open fun drawRoundRect(rect: RectF, radiusTopLeft: Number, radiusTopRight: Number, radiusBottomRight: Number, radiusBottomLeft: Number, paint: Paint): Unit = definedExternally
    open fun drawRoundRectImpl(rect: RectF, radiusTopLeft: Number, radiusTopRight: Number, radiusBottomRight: Number, radiusBottomLeft: Number, style: Paint.Style): Unit = definedExternally
    open fun drawPath(path: Path, paint: Paint): Unit = definedExternally
    open fun drawText_count(text: String, index: Number, count: Number, x: Number, y: Number, paint: Paint): Unit = definedExternally
    open fun drawText_end(text: String, start: Number, end: Number, x: Number, y: Number, paint: Paint): Unit = definedExternally
    open fun drawText(text: String, x: Number, y: Number, paint: Paint): Unit = definedExternally
    open fun drawTextImpl(text: String, x: Number, y: Number, style: Paint.Style): Unit = definedExternally
    open fun drawTextRun_count(text: String, index: Number, count: Number, contextIndex: Number, contextCount: Number, x: Number, y: Number, dir: Number, paint: Paint): Unit = definedExternally
    open fun drawTextRun_end(text: String, start: Number, end: Number, contextStart: Number, contextEnd: Number, x: Number, y: Number, dir: Number, paint: Paint): Unit = definedExternally
    open fun setColor(color: Number, style: Paint.Style? = definedExternally /* null */): Unit = definedExternally
    open fun setColorImpl(color: Number, style: Paint.Style? = definedExternally /* null */): Unit = definedExternally
    open fun multiplyGlobalAlpha(alpha: Number): Unit = definedExternally
    open fun multiplyGlobalAlphaImpl(alpha: Number): Unit = definedExternally
    open fun setGlobalAlpha(alpha: Number): Unit = definedExternally
    open fun setGlobalAlphaImpl(alpha: Number): Unit = definedExternally
    open fun setTextAlign(align: String): Unit = definedExternally
    open fun setTextAlignImpl(align: String): Unit = definedExternally
    open fun setLineWidth(width: Number): Unit = definedExternally
    open fun setLineWidthImpl(width: Number): Unit = definedExternally
    open fun setLineCap(lineCap: String): Unit = definedExternally
    open fun setLineCapImpl(lineCap: String): Unit = definedExternally
    open fun setLineJoin(lineJoin: String): Unit = definedExternally
    open fun setLineJoinImpl(lineJoin: String): Unit = definedExternally
    open fun setShadow(radius: Number, dx: Number, dy: Number, color: Number): Unit = definedExternally
    open fun setShadowImpl(radius: Number, dx: Number, dy: Number, color: Number): Unit = definedExternally
    open fun setFontSize(size: Number): Unit = definedExternally
    open fun setFontSizeImpl(size: Number): Unit = definedExternally
    open fun setFont(fontName: String): Unit = definedExternally
    open fun setFontImpl(fontName: String): Unit = definedExternally
    open fun isImageSmoothingEnabled(): Boolean = definedExternally
    open fun isImageSmoothingEnabledImpl(): Boolean = definedExternally
    open fun setImageSmoothingEnabled(enable: Boolean): Unit = definedExternally
    open fun setImageSmoothingEnabledImpl(enable: Boolean): Unit = definedExternally
    companion object {
        var TempMatrixValue: Array<Number> = definedExternally
        var DIRECTION_LTR: Number = definedExternally
        var DIRECTION_RTL: Number = definedExternally
        var sRectPool: Any = definedExternally
        fun obtainRect(copy: Any? = definedExternally /* null */): Unit = definedExternally
        fun recycleRect(rect: Any): Unit = definedExternally
        fun measureText(text: String, textSize: Number): Number = definedExternally
        var _measureTextContext: Any = definedExternally
        var _measureCacheTextSize: Any = definedExternally
        var _static: Any = definedExternally
        var _measureCacheMap: Any = definedExternally
        fun measureTextImpl(text: String, textSize: Number): Number = definedExternally
        fun getMeasureTextFontFamily(): String = definedExternally
    }
}
