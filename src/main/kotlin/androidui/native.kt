@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("androidui.native")
package androidui.native

import android.graphics.Canvas
import android.graphics.Rect
import android.view.Surface
import android.webkit.WebView
import androidui.image.NetImage
import androidui.widget.HtmlView
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

external open class NativeCanvas : Canvas {
    open var canvasId: Any = definedExternally
    override fun initCanvasImpl(): Unit = definedExternally
    open fun createCanvasImpl(): Unit = definedExternally
    override fun recycleImpl(): Unit = definedExternally
    override fun isNativeAccelerated(): Boolean = definedExternally
    override fun translateImpl(dx: Number, dy: Number): Unit = definedExternally
    override fun scaleImpl(sx: Number, sy: Number): Unit = definedExternally
    override fun rotateImpl(degrees: Number): Unit = definedExternally
    override fun concatImpl(MSCALE_X: Number, MSKEW_X: Number, MTRANS_X: Number, MSKEW_Y: Number, MSCALE_Y: Number, MTRANS_Y: Number, MPERSP_0: Number, MPERSP_1: Number, MPERSP_2: Number): Unit = definedExternally
    override fun drawARGBImpl(a: Number, r: Number, g: Number, b: Number): Unit = definedExternally
    override fun clearColorImpl(): Unit = definedExternally
    override fun saveImpl(): Unit = definedExternally
    override fun restoreImpl(): Unit = definedExternally
    override fun clipRectImpl(left: Number, top: Number, width: Number, height: Number): Unit = definedExternally
    override fun clipRoundRectImpl(left: Number, top: Number, width: Number, height: Number, radiusTopLeft: Number, radiusTopRight: Number, radiusBottomRight: Number, radiusBottomLeft: Number): Unit = definedExternally
    override fun drawCanvasImpl(canvas: android.graphics.Canvas, offsetX: Number, offsetY: Number): Unit = definedExternally
//    override fun drawImageImpl(image: androidui.image.NetImage, srcRect: Rect?, dstRect: Rect?): Unit = definedExternally
    override fun drawImageImpl(image: androidui.image.NetImage, srcRect: Rect?, dstRect: Rect?): Unit = definedExternally
    override fun drawRectImpl(left: Number, top: Number, width: Number, height: Number, style: android.graphics.Paint.Style): Unit = definedExternally
    override fun drawOvalImpl(oval: android.graphics.RectF, style: android.graphics.Paint.Style): Unit = definedExternally
    override fun drawCircleImpl(cx: Number, cy: Number, radius: Number, style: android.graphics.Paint.Style): Unit = definedExternally
    override fun drawArcImpl(oval: android.graphics.RectF, startAngle: Number, sweepAngle: Number, useCenter: Boolean, style: android.graphics.Paint.Style): Unit = definedExternally
    override fun drawRoundRectImpl(rect: android.graphics.RectF, radiusTopLeft: Number, radiusTopRight: Number, radiusBottomRight: Number, radiusBottomLeft: Number, style: android.graphics.Paint.Style): Unit = definedExternally
    override fun drawTextImpl(text: String, x: Number, y: Number, style: android.graphics.Paint.Style): Unit = definedExternally
    override fun setColorImpl(color: Number, style: android.graphics.Paint.Style?): Unit = definedExternally
    override fun multiplyGlobalAlphaImpl(alpha: Number): Unit = definedExternally
    override fun setGlobalAlphaImpl(alpha: Number): Unit = definedExternally
    override fun setTextAlignImpl(align: String): Unit = definedExternally
    override fun setLineWidthImpl(width: Number): Unit = definedExternally
    override fun setLineCapImpl(lineCap: String): Unit = definedExternally
    override fun setLineJoinImpl(lineJoin: String): Unit = definedExternally
    override fun setShadowImpl(radius: Number, dx: Number, dy: Number, color: Number): Unit = definedExternally
    override fun setFontSizeImpl(size: Number): Unit = definedExternally
    override fun setFontImpl(fontName: String): Unit = definedExternally
    override fun isImageSmoothingEnabledImpl(): Boolean = definedExternally
    override fun setImageSmoothingEnabledImpl(enable: Boolean): Unit = definedExternally
    companion object {
        fun applyTextMeasure(cacheMeasureTextSize: Any, defaultWidth: Any, widths: Any): Unit = definedExternally
    }
}
external open class NativeSurface : Surface {
    open var surfaceId: Any = definedExternally
    open var lockedCanvas: Any = definedExternally
    override fun initImpl(): Unit = definedExternally
    override fun notifyBoundChange(): Unit = definedExternally
    override fun lockCanvasImpl(left: Number, top: Number, width: Number, height: Number): android.graphics.Canvas = definedExternally
    override fun unlockCanvasAndPost(canvas: android.graphics.Canvas): Unit = definedExternally
    override fun showFps(fps: Number): Unit = definedExternally
    companion object {
        fun notifySurfaceReady(surfaceId: Any): Unit = definedExternally
        fun notifySurfaceSupportDirtyDraw(surfaceId: Any, dirtyDrawSupport: Any): Unit = definedExternally
    }
}
external open class NativeImage : NetImage {
    open var imageId: Number = definedExternally
    open var leftBorder: Array<Number> = definedExternally
    open var topBorder: Array<Number> = definedExternally
    open var rightBorder: Array<Number> = definedExternally
    open var bottomBorder: Array<Number> = definedExternally
    open var getPixelsCallbacks: Any = definedExternally
    override fun createImage(): Unit = definedExternally
    override fun loadImage(): Unit = definedExternally
    override fun recycle(): Unit = definedExternally
    override fun getPixels(bound: Rect, callBack: (data: Array<Number>) -> Unit): Unit = definedExternally
    override open fun getBorderPixels(callBack: (leftBorder: Array<Number>, topBorder: Array<Number>, rightBorder: Array<Number>, bottomBorder: Array<Number>) -> Unit): Unit = definedExternally
    companion object {
        fun notifyLoadFinish(imageId: Any, width: Any, height: Any, leftBorder: Any, topBorder: Any, rightBorder: Any, bottomBorder: Any): Unit = definedExternally
        fun notifyLoadError(imageId: Any): Unit = definedExternally
        fun notifyGetPixels(imageId: Any, callBackIndex: Any, data: Any): Unit = definedExternally
    }
}
external open class NativeEditText : android.widget.EditText {
    open var mRectTmp: Any = definedExternally
    open fun computeTextArea(): Unit = definedExternally
    override fun onInputElementFocusChanged(focused: Boolean): Any = definedExternally
    override fun tryShowInputElement(): Any = definedExternally
    override fun tryDismissInputElement(): Any = definedExternally
    override fun _syncBoundAndScrollToElement(): Unit = definedExternally
    override fun onDetachedFromWindow(): Unit = definedExternally
}
external open class NativeWebView(context: android.content.Context, bindElement: HTMLElement, defStyle: Any) : WebView {
    open var mBoundRect: Any = definedExternally
    open var mRectTmp: Any = definedExternally
    open var mLocationTmp: Any = definedExternally
    open var mUrl: Any = definedExternally
    open var mTitle: Any = definedExternally
    open var mCanGoBack: Any = definedExternally
    override fun goBack(): Unit = definedExternally
    override fun canGoBack(): Boolean = definedExternally
    override fun loadUrl(url: String): Unit = definedExternally
    override fun reload(): Unit = definedExternally
    override fun getUrl(): String = definedExternally
    override fun getTitle(): String = definedExternally
    override fun setWebViewClient(client: android.webkit.WebViewClient): Unit = definedExternally
    override fun dependOnDebugLayout(): Boolean = definedExternally
    override fun _syncBoundAndScrollToElement(): Unit = definedExternally
    companion object {
        fun notifyLoadFinish(viewHash: Any, url: Any, title: Any): Unit = definedExternally
        fun notifyWebViewHistoryChange(viewHash: Any, currentHistoryIndex: Any, historySize: Any): Unit = definedExternally
    }
}
external open class NativeHtmlView : HtmlView {
    open var mRectDrawHTMLBoundTmp: Any = definedExternally
    override fun _syncBoundAndScrollToElement(): Unit = definedExternally
    override fun onDetachedFromWindow(): Unit = definedExternally
}
external open class NativeApi {

    open class SurfaceApi {
        open fun createSurface(surfaceId: Number, left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
        open fun onSurfaceBoundChange(surfaceId: Number, left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
        open fun lockCanvas(surfaceId: Number, canvasId: Number, left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
        open fun unlockCanvasAndPost(surfaceId: Number, canvasId: Number): Unit = definedExternally
        open fun showFps(fps: Number): Unit = definedExternally
    }
    open class CanvasApi {
        open fun createCanvas(canvasId: Number, width: Number, height: Number): Unit = definedExternally
        open fun recycleCanvas(canvasId: Number): Unit = definedExternally
        open fun translate(canvasId: Number, dx: Number, dy: Number): Unit = definedExternally
        open fun scale(canvasId: Number, sx: Number, sy: Number): Unit = definedExternally
        open fun rotate(canvasId: Number, degrees: Number): Unit = definedExternally
        open fun concat(canvasId: Number, MSCALE_X: Number, MSKEW_X: Number, MTRANS_X: Number, MSKEW_Y: Number, MSCALE_Y: Number, MTRANS_Y: Number): Unit = definedExternally
        open fun drawColor(canvasId: Number, color: Number): Unit = definedExternally
        open fun clearColor(canvasId: Number): Unit = definedExternally
        open fun drawRect(canvasId: Number, left: Number, top: Number, width: Number, height: Number, style: android.graphics.Paint.Style): Unit = definedExternally
        open fun clipRect(canvasId: Number, left: Number, top: Number, width: Number, height: Number): Unit = definedExternally
        open fun save(canvasId: Number): Unit = definedExternally
        open fun restore(canvasId: Number): Unit = definedExternally
        open fun drawCanvas(canvasId: Number, drawCanvasId: Number, offsetX: Number, offsetY: Number): Unit = definedExternally
        open fun drawText(canvasId: Number, text: String, x: Number, y: Number, fillStyle: android.graphics.Paint.Style): Unit = definedExternally
        open fun setFillColor(canvasId: Number, color: Number, style: android.graphics.Paint.Style): Unit = definedExternally
        open fun multiplyGlobalAlpha(canvasId: Number, alpha: Number): Unit = definedExternally
        open fun setGlobalAlpha(canvasId: Number, alpha: Number): Unit = definedExternally
        open fun setTextAlign(canvasId: Number, align: String): Unit = definedExternally
        open fun setLineWidth(canvasId: Number, width: Number): Unit = definedExternally
        open fun setLineCap(canvasId: Number, lineCap: String): Unit = definedExternally
        open fun setLineJoin(canvasId: Number, lineJoin: String): Unit = definedExternally
        open fun setShadow(canvasId: Number, radius: Number, dx: Number, dy: Number, color: Number): Unit = definedExternally
        open fun setFontSize(canvasId: Number, size: Number): Unit = definedExternally
        open fun setFont(canvasId: Number, fontName: String): Unit = definedExternally
        open fun drawOval(canvasId: Number, left: Number, top: Number, right: Number, bottom: Number, style: android.graphics.Paint.Style): Unit = definedExternally
        open fun drawCircle(canvasId: Number, cx: Number, cy: Number, radius: Number, style: android.graphics.Paint.Style): Unit = definedExternally
        open fun drawArc(canvasId: Number, left: Number, top: Number, right: Number, bottom: Number, startAngle: Number, sweepAngle: Number, useCenter: Boolean, style: android.graphics.Paint.Style): Unit = definedExternally
        open fun drawRoundRectImpl(canvasId: Number, left: Number, top: Number, width: Number, height: Number, radiusTopLeft: Number, radiusTopRight: Number, radiusBottomRight: Number, radiusBottomLeft: Number, style: android.graphics.Paint.Style): Unit = definedExternally
        open fun clipRoundRectImpl(canvasId: Number, left: Number, top: Number, width: Number, height: Number, radiusTopLeft: Number, radiusTopRight: Number, radiusBottomRight: Number, radiusBottomLeft: Number): Unit = definedExternally
        open fun drawImage2args(canvasId: Number, drawImageId: Number, left: Number, top: Number): Unit = definedExternally
        open fun drawImage4args(canvasId: Number, drawImageId: Number, dstLeft: Number, dstTop: Number, dstRight: Number, dstBottom: Number): Unit = definedExternally
        open fun drawImage8args(canvasId: Number, drawImageId: Number, srcLeft: Number, srcTop: Number, srcRight: Number, srcBottom: Number, dstLeft: Number, dstTop: Number, dstRight: Number, dstBottom: Number): Unit = definedExternally
    }
    interface ImageApi {
        fun createImage(imageId: Number)
        fun loadImage(imageId: Number, src: String)
        fun recycleImage(imageId: Number)
        fun getPixels(imageId: Number, callbackIndex: Number, left: Number, top: Number, right: Number, bottom: Number)
    }
    interface DrawHTMLBoundApi {
        fun showDrawHTMLBound(viewHash: Number, left: Number, top: Number, right: Number, bottom: Number)
        fun hideDrawHTMLBound(viewHash: Number)
    }
    interface WebViewApi {
        fun createWebView(viewHash: Number)
        fun destroyWebView(viewHash: Number)
        fun webViewBoundChange(viewHash: Number, left: Number, top: Number, right: Number, bottom: Number)
        fun webViewLoadUrl(viewHash: Number, url: String)
        fun webViewGoBack(viewHash: Number)
        fun webViewReload(viewHash: Number)
    }

    companion object {
        var surface: NativeApi.SurfaceApi = definedExternally
        var canvas: NativeApi.CanvasApi = definedExternally
        var image: NativeApi.ImageApi = definedExternally
        var drawHTML: NativeApi.DrawHTMLBoundApi = definedExternally
        var webView: NativeApi.WebViewApi = definedExternally
    }
}
