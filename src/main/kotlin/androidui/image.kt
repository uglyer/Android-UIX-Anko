@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("androidui.image")
package androidui.image

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.drawable.Drawable
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

external open class NetImage(src: String, overrideImageRatio: Number? = definedExternally /* null */) {
    open var browserImage: Any = definedExternally
    open var mSrc: Any = definedExternally
    open var mImageWidth: Any = definedExternally
    open var mImageHeight: Any = definedExternally
    open var mOnLoads: Any = definedExternally
    open var mOnErrors: Any = definedExternally
    open var mImageLoaded: Any = definedExternally
    open var mOverrideImageRatio: Any = definedExternally
    open fun init(src: String): Unit = definedExternally
    open fun createImage(): Unit = definedExternally
    open fun loadImage(): Unit = definedExternally
    open var src: String = definedExternally
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open fun getImageRatio(): Number = definedExternally
    open fun isImageLoaded(): Boolean = definedExternally
    open fun fireOnLoad(): Unit = definedExternally
    open fun fireOnError(): Unit = definedExternally
    open fun addLoadListener(onload: () -> Unit, onerror: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
    open fun removeLoadListener(onload: (() -> Unit)? = definedExternally /* null */, onerror: (() -> Unit)? = definedExternally /* null */): Unit = definedExternally
    open fun recycle(): Unit = definedExternally
    open fun getBorderPixels(callBack: (leftBorder: Array<Number>, topBorder: Array<Number>, rightBorder: Array<Number>, bottomBorder: Array<Number>) -> Unit): Unit = definedExternally
    open fun getPixels(bound: Rect, callBack: (data: Array<Number>) -> Unit): Unit = definedExternally
}
external open class NetDrawable : Drawable {
    interface LoadListener {
        fun onLoad(drawable: NetDrawable): Any
        fun onError(drawable: NetDrawable): Any
    }
    enum class TileMode {
        DEFAULT /* = 0 */,
        REPEAT /* = 1 */
    }

    constructor(src: String, paint: Paint? = definedExternally /* null */, overrideImageRatio: Number? = definedExternally /* null */)
    constructor(src: NetImage, paint: Paint? = definedExternally /* null */, overrideImageRatio: Number? = definedExternally /* null */)
    open var mState: Any = definedExternally
    open var mLoadListener: Any = definedExternally
    open var mImageWidth: Number = definedExternally
    open var mImageHeight: Number = definedExternally
    open var mTileModeX: Any = definedExternally
    open var mTileModeY: Any = definedExternally
    open var mTmpTileBound: Any = definedExternally
    open fun initBoundWithLoadedImage(image: NetImage): Unit = definedExternally
    open fun setURL(url: String, hiddenWhenLoading: Boolean? = definedExternally /* null */): Unit = definedExternally
    override fun draw(canvas: Canvas): Unit = definedExternally
    open fun drawTile(canvas: Any): Unit = definedExternally
    override fun setAlpha(alpha: Number): Unit = definedExternally
    override fun getAlpha(): Number = definedExternally
    override fun getIntrinsicWidth(): Number = definedExternally
    override fun getIntrinsicHeight(): Number = definedExternally
    open fun onLoad(): Unit = definedExternally
    open fun onError(): Unit = definedExternally
    open fun isImageSizeEmpty(): Boolean = definedExternally
    open fun getImage(): NetImage = definedExternally
    open fun setLoadListener(loadListener: NetDrawable.LoadListener): Unit = definedExternally
    open fun setTileMode(tileX: NetDrawable.TileMode, tileY: NetDrawable.TileMode): Unit = definedExternally
    override fun getConstantState(): Drawable.ConstantState = definedExternally
}
external open class NinePatchDrawable : NetDrawable {
    open var mTmpRect: Any = definedExternally
    open var mTmpRect2: Any = definedExternally
    open var mNinePatchBorderInfo: Any = definedExternally
    open var mNinePatchDrawCache: Any = definedExternally
    override fun initBoundWithLoadedImage(image: NetImage): Unit = definedExternally
    open fun initNinePatchBorderInfo(image: Any): Unit = definedExternally
    override fun onLoad(): Unit = definedExternally
    override fun draw(canvas: Canvas): Unit = definedExternally
    open fun getNinePatchCache(): Unit = definedExternally
    open fun drawNinePatch(canvas: Any): Unit = definedExternally
    override fun getPadding(padding: android.graphics.Rect): Boolean = definedExternally
    companion object {
        var GlobalBorderInfoCache: Any = definedExternally
    }
}
external open class ChangeImageSizeDrawable(drawable: Drawable, overrideWidth: Number, overrideHeight: Number? = definedExternally /* null */) : Drawable, Drawable.Callback {
    open var mState: Any = definedExternally
    open var mTmpRect: Any = definedExternally
    open var mMutated: Any = definedExternally
//    override fun drawableSizeChange(who: android.graphics.drawable.Drawable): Any = definedExternally
    override fun drawableSizeChange(who: android.graphics.drawable.Drawable): Any = definedExternally
    override fun invalidateDrawable(who: android.graphics.drawable.Drawable): Unit = definedExternally
    override fun scheduleDrawable(who: android.graphics.drawable.Drawable, what: java.lang.Runnable, `when`: Number): Unit = definedExternally
    override fun unscheduleDrawable(who: android.graphics.drawable.Drawable, what: java.lang.Runnable): Unit = definedExternally
    override fun draw(canvas: Canvas): Unit = definedExternally
    override fun getPadding(padding: android.graphics.Rect): Boolean = definedExternally
    override fun setVisible(visible: Boolean, restart: Boolean): Boolean = definedExternally
    override fun setAlpha(alpha: Number): Unit = definedExternally
    override fun getAlpha(): Number = definedExternally
    override fun getOpacity(): Number = definedExternally
    override fun isStateful(): Boolean = definedExternally
    override fun onStateChange(state: Array<Number>): Boolean = definedExternally
    override fun onBoundsChange(r: android.graphics.Rect): Unit = definedExternally
    override fun getIntrinsicWidth(): Number = definedExternally
    override fun getIntrinsicHeight(): Number = definedExternally
    override fun getConstantState(): Drawable.ConstantState = definedExternally
    override fun mutate(): Drawable = definedExternally
    open fun getDrawable(): Drawable = definedExternally
}
