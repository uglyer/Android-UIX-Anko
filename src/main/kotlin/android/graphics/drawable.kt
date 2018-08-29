@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.graphics.drawable")

package android.graphics.drawable

import android.content.res.Resources
import android.graphics.*
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
import java.lang.Runnable
import java.lang.ref.WeakReference

external open class Drawable {
    interface Callback {
        fun invalidateDrawable(who: Drawable)
//        val drawableSizeChange: ((who: Drawable) -> Unit)? get() = definedExternally
        fun drawableSizeChange(who: Drawable)
        fun scheduleDrawable(who: Drawable, what: Runnable, `when`: Number)
        fun unscheduleDrawable(who: Drawable, what: Runnable)
    }

    interface ConstantState {
        fun newDrawable(): Drawable
    }

    open var mBounds: Rect = definedExternally
    open var mStateSet: Array<Number> = definedExternally
    open var mLevel: Number = definedExternally
    open var mVisible: Boolean = definedExternally
    open var mCallback: WeakReference<Callback> = definedExternally
    open var mIgnoreNotifySizeChange: Any = definedExternally
    open fun draw(canvas: Canvas): Any = definedExternally
    open fun setBounds(rect: Rect): Any = definedExternally
    open fun setBounds(left: Any, top: Any, right: Any, bottom: Any): Any = definedExternally
    open fun copyBounds(bounds: Rect? = definedExternally /* null */): Rect = definedExternally
    open fun getBounds(): Rect = definedExternally
    open fun setDither(dither: Boolean): Unit = definedExternally
    open fun setCallback(cb: Drawable.Callback): Unit = definedExternally
    open fun getCallback(): Drawable.Callback = definedExternally
    open fun setIgnoreNotifySizeChange(isIgnore: Boolean): Unit = definedExternally
    open fun notifySizeChangeSelf(): Unit = definedExternally
    open fun invalidateSelf(): Unit = definedExternally
    open fun scheduleSelf(what: Any, `when`: Any): Unit = definedExternally
    open fun unscheduleSelf(what: Any): Unit = definedExternally
    open fun setAlpha(alpha: Number): Unit = definedExternally
    open fun getAlpha(): Number = definedExternally
    open fun isStateful(): Boolean = definedExternally
    open fun setState(stateSet: Array<Number>): Boolean = definedExternally
    open fun getState(): Array<Number> = definedExternally
    open fun jumpToCurrentState(): Unit = definedExternally
    open fun getCurrent(): Drawable = definedExternally
    open fun setLevel(level: Number): Boolean = definedExternally
    open fun getLevel(): Number = definedExternally
    open fun setVisible(visible: Boolean, restart: Boolean): Boolean = definedExternally
    open fun isVisible(): Boolean = definedExternally
    open fun setAutoMirrored(mirrored: Boolean): Unit = definedExternally
    open fun isAutoMirrored(): Boolean = definedExternally
    open fun getOpacity(): Number = definedExternally
    open fun onStateChange(state: Array<Number>): Boolean = definedExternally
    open fun onLevelChange(level: Number): Boolean = definedExternally
    open fun onBoundsChange(bounds: Rect): Unit = definedExternally
    open fun getIntrinsicWidth(): Number = definedExternally
    open fun getIntrinsicHeight(): Number = definedExternally
    open fun getMinimumWidth(): Number = definedExternally
    open fun getMinimumHeight(): Number = definedExternally
    open fun getPadding(padding: Rect): Boolean = definedExternally
    open fun mutate(): Drawable = definedExternally
    open fun getConstantState(): Drawable.ConstantState = definedExternally
    open fun inflate(r: Resources, parser: HTMLElement): Unit = definedExternally

    companion object {
        var ZERO_BOUNDS_RECT: Any = definedExternally
        fun resolveOpacity(op1: Number, op2: Number): Number = definedExternally
        fun createFromXml(r: Resources, parser: HTMLElement): Drawable = definedExternally
    }
}

external open class ColorDrawable(color: Number? = definedExternally /* null */) : Drawable {
    open var mState: Any = definedExternally
    open var mMutated: Any = definedExternally
    open var mPaint: Any = definedExternally
    open fun _setStateCopyFrom(state: Any): Unit = definedExternally
    override fun mutate(): Drawable = definedExternally
    override fun draw(canvas: Canvas): Unit = definedExternally
    open fun getColor(): Number = definedExternally
    open fun setColor(color: Number): Unit = definedExternally
    override fun getAlpha(): Number = definedExternally
    override fun setAlpha(alpha: Number): Unit = definedExternally
    override fun getOpacity(): Number = definedExternally
    override fun inflate(r: android.content.res.Resources, parser: HTMLElement): Unit = definedExternally
    override fun getConstantState(): Drawable.ConstantState = definedExternally
}

external open class ScrollBarDrawable : Drawable {
    open var mVerticalTrack: Any = definedExternally
    open var mHorizontalTrack: Any = definedExternally
    open var mVerticalThumb: Any = definedExternally
    open var mHorizontalThumb: Any = definedExternally
    open var mRange: Any = definedExternally
    open var mOffset: Any = definedExternally
    open var mExtent: Any = definedExternally
    open var mVertical: Any = definedExternally
    open var mChanged: Any = definedExternally
    open var mRangeChanged: Any = definedExternally
    open var mTempBounds: Any = definedExternally
    open var mAlwaysDrawHorizontalTrack: Any = definedExternally
    open var mAlwaysDrawVerticalTrack: Any = definedExternally
    open fun setAlwaysDrawHorizontalTrack(alwaysDrawTrack: Boolean): Unit = definedExternally
    open fun setAlwaysDrawVerticalTrack(alwaysDrawTrack: Boolean): Unit = definedExternally
    open fun getAlwaysDrawVerticalTrack(): Boolean = definedExternally
    open fun getAlwaysDrawHorizontalTrack(): Boolean = definedExternally
    open fun setParameters(range: Number, offset: Number, extent: Number, vertical: Boolean): Unit = definedExternally
    open fun draw(canvas: Any): Unit = definedExternally
    override fun onBoundsChange(bounds: android.graphics.Rect): Unit = definedExternally
    open fun drawTrack(canvas: Canvas, bounds: Rect, vertical: Boolean): Unit = definedExternally
    open fun drawThumb(canvas: Canvas, bounds: Rect, offset: Number, length: Number, vertical: Boolean): Unit = definedExternally
    open fun setVerticalThumbDrawable(thumb: Drawable): Unit = definedExternally
    open fun setVerticalTrackDrawable(track: Drawable): Unit = definedExternally
    open fun setHorizontalThumbDrawable(thumb: Drawable): Unit = definedExternally
    open fun setHorizontalTrackDrawable(track: Drawable): Unit = definedExternally
    open fun getSize(vertical: Boolean): Number = definedExternally
    override fun setAlpha(alpha: Number): Unit = definedExternally
    override fun getAlpha(): Number = definedExternally
    override fun getOpacity(): Number = definedExternally
    override fun toString(): String = definedExternally
}

external open class InsetDrawable(drawable: Drawable, insetLeft: Number, insetTop: Number? = definedExternally /* null */, insetRight: Number? = definedExternally /* null */, insetBottom: Number? = definedExternally /* null */) : Drawable, Drawable.Callback {
    open var mInsetState: Any = definedExternally
    open var mTmpRect: Any = definedExternally
    open var mMutated: Any = definedExternally
    override fun inflate(r: android.content.res.Resources, parser: HTMLElement): Unit = definedExternally
//    open fun drawableSizeChange(who: android.graphics.drawable.Drawable): Any = definedExternally
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
    override fun onBoundsChange(bounds: android.graphics.Rect): Unit = definedExternally
    override fun getIntrinsicWidth(): Number = definedExternally
    override fun getIntrinsicHeight(): Number = definedExternally
    override fun getConstantState(): Drawable.ConstantState = definedExternally
    override fun mutate(): Drawable = definedExternally
    open fun getDrawable(): Drawable = definedExternally
}

external open class ShadowDrawable(drawable: Drawable, radius: Number, dx: Number, dy: Number, color: Number) : Drawable {
    open var mState: Any = definedExternally
    open var mMutated: Any = definedExternally
    open fun setShadow(radius: Number, dx: Number, dy: Number, color: Number): Unit = definedExternally
    open fun drawableSizeChange(who: android.graphics.drawable.Drawable): Any = definedExternally
    open fun invalidateDrawable(who: android.graphics.drawable.Drawable): Unit = definedExternally
    open fun scheduleDrawable(who: android.graphics.drawable.Drawable, what: java.lang.Runnable, `when`: Number): Unit = definedExternally
    open fun unscheduleDrawable(who: android.graphics.drawable.Drawable, what: java.lang.Runnable): Unit = definedExternally
    override fun draw(canvas: Canvas): Unit = definedExternally
    override fun getPadding(padding: Rect): Boolean = definedExternally
    override fun setVisible(visible: Boolean, restart: Boolean): Boolean = definedExternally
    override fun setAlpha(alpha: Number): Unit = definedExternally
    override fun getAlpha(): Number = definedExternally
    override fun getOpacity(): Number = definedExternally
    override fun isStateful(): Boolean = definedExternally
    override fun onStateChange(state: Array<Number>): Boolean = definedExternally
    override fun onBoundsChange(bounds: android.graphics.Rect): Unit = definedExternally
    override fun getIntrinsicWidth(): Number = definedExternally
    override fun getIntrinsicHeight(): Number = definedExternally
    override fun getConstantState(): Drawable.ConstantState = definedExternally
    override fun mutate(): Drawable = definedExternally
    open fun getDrawable(): Drawable = definedExternally
}

external open class RoundRectDrawable(color: Number, radiusTopLeft: Number, radiusTopRight: Number? = definedExternally /* null */, radiusBottomRight: Number? = definedExternally /* null */, radiusBottomLeft: Number? = definedExternally /* null */) : Drawable {
    open var mState: Any = definedExternally
    open var mMutated: Any = definedExternally
    open var mPaint: Any = definedExternally
    override fun mutate(): Drawable = definedExternally
    override fun draw(canvas: Canvas): Unit = definedExternally
    open fun getColor(): Number = definedExternally
    open fun setColor(color: Number): Unit = definedExternally
    override fun getAlpha(): Number = definedExternally
    override fun setAlpha(alpha: Number): Unit = definedExternally
    override fun getOpacity(): Number = definedExternally
    override fun getConstantState(): Drawable.ConstantState = definedExternally
}

external open class LayerDrawable(layers: Array<Drawable>, state: LayerDrawable.LayerState? = definedExternally /* null */) : Drawable, Drawable.Callback {
    open class ChildDrawable {
        open var mDrawable: Drawable = definedExternally
        open var mInsetL: Number = definedExternally
        open var mInsetT: Number = definedExternally
        open var mInsetR: Number = definedExternally
        open var mInsetB: Number = definedExternally
        open var mId: String = definedExternally
    }
    open class LayerState(orig: LayerState, owner: LayerDrawable) : Drawable.ConstantState {
        open var mNum: Number = definedExternally
        open var mChildren: Array<LayerDrawable.ChildDrawable> = definedExternally
        open var mHaveOpacity: Any = definedExternally
        open var mOpacity: Any = definedExternally
        open var mHaveStateful: Any = definedExternally
        open var mStateful: Any = definedExternally
        open var mCheckedConstantState: Any = definedExternally
        open var mCanConstantState: Any = definedExternally
        open var mAutoMirrored: Any = definedExternally
        override fun newDrawable(): Drawable = definedExternally
        open fun getOpacity(): Number = definedExternally
        open fun isStateful(): Boolean = definedExternally
        open fun canConstantState(): Boolean = definedExternally
    }

    open var mLayerState: LayerDrawable.LayerState = definedExternally
    open var mOpacityOverride: Any = definedExternally
    open var mPaddingL: Any = definedExternally
    open var mPaddingT: Any = definedExternally
    open var mPaddingR: Any = definedExternally
    open var mPaddingB: Any = definedExternally
    open var mTmpRect: Any = definedExternally
    open var mMutated: Any = definedExternally
    open fun createConstantState(state: LayerDrawable.LayerState): LayerDrawable.LayerState = definedExternally
    override fun inflate(r: Resources, parser: HTMLElement): Unit = definedExternally
    open fun addLayer(layer: Any, id: Any, left: Any? = definedExternally /* null */, top: Any? = definedExternally /* null */, right: Any? = definedExternally /* null */, bottom: Any? = definedExternally /* null */): Unit = definedExternally
    open fun findDrawableByLayerId(id: String): Drawable = definedExternally
    open fun setId(index: Number, id: String): Unit = definedExternally
    open fun getNumberOfLayers(): Number = definedExternally
    open fun getDrawable(index: Number): Drawable = definedExternally
    open fun getId(index: Number): String = definedExternally
    open fun setDrawableByLayerId(id: String, drawable: Drawable): Boolean = definedExternally
    open fun setLayerInset(index: Number, l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
    override fun drawableSizeChange(who: android.graphics.drawable.Drawable): Unit = definedExternally
//    fun drawableSizeChange(who: android.graphics.drawable.Drawable): Unit = definedExternally
    override fun invalidateDrawable(who: Drawable): Unit = definedExternally
    override fun scheduleDrawable(who: Drawable, what: Runnable, `when`: Number): Unit = definedExternally
    override fun unscheduleDrawable(who: Drawable, what: Runnable): Unit = definedExternally
    override fun draw(canvas: Canvas): Unit = definedExternally
    override fun getPadding(padding: Rect): Boolean = definedExternally
    override fun setVisible(visible: Boolean, restart: Boolean): Boolean = definedExternally
    override fun setDither(dither: Boolean): Unit = definedExternally
    override fun setAlpha(alpha: Number): Unit = definedExternally
    override fun getAlpha(): Number = definedExternally
    open fun setOpacity(opacity: Number): Unit = definedExternally
    override fun getOpacity(): Number = definedExternally
    override fun setAutoMirrored(mirrored: Boolean): Unit = definedExternally
    override fun isAutoMirrored(): Boolean = definedExternally
    override fun isStateful(): Boolean = definedExternally
    override fun onStateChange(state: Array<Number>): Boolean = definedExternally
    override fun onLevelChange(level: Number): Boolean = definedExternally
    override fun onBoundsChange(bounds: Rect): Unit = definedExternally
    override fun getIntrinsicWidth(): Number = definedExternally
    override fun getIntrinsicHeight(): Number = definedExternally
    open fun reapplyPadding(i: Any, r: Any): Unit = definedExternally
    open fun ensurePadding(): Unit = definedExternally
    override fun getConstantState(): Drawable.ConstantState = definedExternally
    override fun mutate(): Drawable = definedExternally
}

external open class RotateDrawable(rotateState: RotateDrawable.RotateState? = definedExternally /* null */) : Drawable, Drawable.Callback {
    open class RotateState(source: RotateState, owner: RotateDrawable) : Drawable.ConstantState {
        open var mDrawable: Drawable = definedExternally
        open var mPivotXRel: Boolean = definedExternally
        open var mPivotX: Number = definedExternally
        open var mPivotYRel: Boolean = definedExternally
        open var mPivotY: Number = definedExternally
        open var mFromDegrees: Number = definedExternally
        open var mToDegrees: Number = definedExternally
        open var mCurrentDegrees: Number = definedExternally
        open var mCanConstantState: Any = definedExternally
        open var mCheckedConstantState: Any = definedExternally
        override fun newDrawable(): Drawable = definedExternally
        open fun canConstantState(): Boolean = definedExternally
    }

    open var mState: Any = definedExternally
    open var mMutated: Any = definedExternally
    override fun draw(canvas: Canvas): Unit = definedExternally
    open fun getDrawable(): Drawable = definedExternally
    override fun setAlpha(alpha: Number): Unit = definedExternally
    override fun getAlpha(): Number = definedExternally
    override fun getOpacity(): Number = definedExternally
    override fun drawableSizeChange(who: android.graphics.drawable.Drawable): Unit = definedExternally
//    open fun drawableSizeChange(who: android.graphics.drawable.Drawable): Unit = definedExternally
    override fun invalidateDrawable(who: Drawable): Unit = definedExternally
    override fun scheduleDrawable(who: Drawable, what: Runnable, `when`: Number): Unit = definedExternally
    override fun unscheduleDrawable(who: Drawable, what: Runnable): Unit = definedExternally
    override fun getPadding(padding: Rect): Boolean = definedExternally
    override fun setVisible(visible: Boolean, restart: Boolean): Boolean = definedExternally
    override fun isStateful(): Boolean = definedExternally
    override fun onStateChange(state: Array<Number>): Boolean = definedExternally
    override fun onLevelChange(level: Number): Boolean = definedExternally
    override fun onBoundsChange(bounds: Rect): Unit = definedExternally
    override fun getIntrinsicWidth(): Number = definedExternally
    override fun getIntrinsicHeight(): Number = definedExternally
    override fun getConstantState(): Drawable.ConstantState = definedExternally
    override fun inflate(r: Resources, parser: HTMLElement): Unit = definedExternally
    override fun mutate(): Drawable = definedExternally

    companion object {
        var MAX_LEVEL: Any = definedExternally
    }
}

external open class ScaleDrawable : Drawable, Drawable.Callback {
    open class ScaleState(orig: ScaleState, owner: ScaleDrawable) : Drawable.ConstantState {
        open var mDrawable: Drawable = definedExternally
        open var mScaleWidth: Number = definedExternally
        open var mScaleHeight: Number = definedExternally
        open var mGravity: Number = definedExternally
        open var mUseIntrinsicSizeAsMin: Boolean = definedExternally
        open var mCheckedConstantState: Any = definedExternally
        open var mCanConstantState: Any = definedExternally
        override fun newDrawable(): Drawable = definedExternally
        open fun canConstantState(): Boolean = definedExternally
    }

    constructor(drawable: Drawable, gravity: Number, scaleWidth: Number, scaleHeight: Number)
    constructor(state: ScaleDrawable.ScaleState? = definedExternally /* null */)

    open var mScaleState: Any = definedExternally
    open var mMutated: Any = definedExternally
    open var mTmpRect: Any = definedExternally
    open fun getDrawable(): Drawable = definedExternally
    override fun inflate(r: Resources, parser: HTMLElement): Unit = definedExternally
//    open fun drawableSizeChange(who: android.graphics.drawable.Drawable): Unit = definedExternally
    override fun drawableSizeChange(who: android.graphics.drawable.Drawable): Unit = definedExternally
    override fun invalidateDrawable(who: Drawable): Unit = definedExternally
    override fun scheduleDrawable(who: Drawable, what: Runnable, `when`: Number): Unit = definedExternally
    override fun unscheduleDrawable(who: Drawable, what: Runnable): Unit = definedExternally
    override fun draw(canvas: Canvas): Unit = definedExternally
    override fun getPadding(padding: Rect): Boolean = definedExternally
    override fun setVisible(visible: Boolean, restart: Boolean): Boolean = definedExternally
    override fun setAlpha(alpha: Number): Unit = definedExternally
    override fun getAlpha(): Number = definedExternally
    override fun getOpacity(): Number = definedExternally
    override fun isStateful(): Boolean = definedExternally
    override fun onStateChange(state: Array<Number>): Boolean = definedExternally
    override fun onLevelChange(level: Number): Boolean = definedExternally
    override fun onBoundsChange(bounds: Rect): Unit = definedExternally
    override fun getIntrinsicWidth(): Number = definedExternally
    override fun getIntrinsicHeight(): Number = definedExternally
    override fun getConstantState(): Drawable.ConstantState = definedExternally
    override fun mutate(): Drawable = definedExternally
}

external interface Animatable {
    fun start()
    fun stop()
    fun isRunning(): Boolean
    //    fun isImpl(obj: Any): Any = definedExternally
//    fun isImpl(obj: Any): Any
}

external open class DrawableContainer : Drawable, Drawable.Callback {
    open class DrawableContainerState(orig: DrawableContainerState, owner: DrawableContainer) : Drawable.ConstantState {
        open var mOwner: DrawableContainer = definedExternally
        open var mDrawableFutures: Any = definedExternally
        open var mDrawables: Array<Drawable> = definedExternally
        open var mNumChildren: Number = definedExternally
        open var mVariablePadding: Boolean = definedExternally
        open var mPaddingChecked: Boolean = definedExternally
        open var mConstantPadding: Rect = definedExternally
        open var mConstantSize: Boolean = definedExternally
        open var mComputedConstantSize: Boolean = definedExternally
        open var mConstantWidth: Number = definedExternally
        open var mConstantHeight: Number = definedExternally
        open var mConstantMinimumWidth: Number = definedExternally
        open var mConstantMinimumHeight: Number = definedExternally
        open var mCheckedOpacity: Boolean = definedExternally
        open var mOpacity: Number = definedExternally
        open var mCheckedStateful: Boolean = definedExternally
        open var mStateful: Boolean = definedExternally
        open var mCheckedConstantState: Boolean = definedExternally
        open var mCanConstantState: Boolean = definedExternally
        open var mDither: Boolean = definedExternally
        open var mMutated: Boolean = definedExternally
        open var mEnterFadeDuration: Number = definedExternally
        open var mExitFadeDuration: Number = definedExternally
        open var mAutoMirrored: Boolean = definedExternally
        open fun addChild(dr: Drawable): Number = definedExternally
        open fun getCapacity(): Number = definedExternally
        open fun createAllFutures(): Unit = definedExternally
        open fun getChildCount(): Number = definedExternally
        open fun getChildren(): Array<Drawable> = definedExternally
        open fun getChild(index: Number): Drawable = definedExternally
        open fun mutate(): Unit = definedExternally
        open fun setVariablePadding(variable: Boolean): Unit = definedExternally
        open fun getConstantPadding(): Rect = definedExternally
        open fun setConstantSize(constant: Boolean): Unit = definedExternally
        open fun isConstantSize(): Boolean = definedExternally
        open fun getConstantWidth(): Number = definedExternally
        open fun getConstantHeight(): Number = definedExternally
        open fun getConstantMinimumWidth(): Number = definedExternally
        open fun getConstantMinimumHeight(): Number = definedExternally
        open fun computeConstantSize(): Unit = definedExternally
        open fun setEnterFadeDuration(duration: Number): Unit = definedExternally
        open fun getEnterFadeDuration(): Number = definedExternally
        open fun setExitFadeDuration(duration: Number): Unit = definedExternally
        open fun getExitFadeDuration(): Number = definedExternally
        open fun getOpacity(): Number = definedExternally
        open fun isStateful(): Boolean = definedExternally
        open fun canConstantState(): Boolean = definedExternally
        override fun newDrawable(): android.graphics.drawable.Drawable = definedExternally
    }

    open var mDrawableContainerState: Any = definedExternally
    open var mCurrDrawable: Any = definedExternally
    open var mAlpha: Any = definedExternally
    open var mCurIndex: Any = definedExternally
    open var mMutated: Boolean = definedExternally
    open var mAnimationRunnable: Any = definedExternally
    open var mEnterAnimationEnd: Any = definedExternally
    open var mExitAnimationEnd: Any = definedExternally
    open var mLastDrawable: Any = definedExternally
    override fun draw(canvas: Canvas): Unit = definedExternally
    open fun needsMirroring(): Unit = definedExternally
    override fun getPadding(padding: android.graphics.Rect): Boolean = definedExternally
    override fun setAlpha(alpha: Number): Unit = definedExternally
    override fun getAlpha(): Number = definedExternally
    override fun setDither(dither: Boolean): Unit = definedExternally
    open fun setEnterFadeDuration(ms: Number): Unit = definedExternally
    open fun setExitFadeDuration(ms: Number): Unit = definedExternally
    override fun onBoundsChange(bounds: android.graphics.Rect): Unit = definedExternally
    override fun isStateful(): Boolean = definedExternally
    override fun setAutoMirrored(mirrored: Boolean): Unit = definedExternally
    override fun isAutoMirrored(): Boolean = definedExternally
    override fun jumpToCurrentState(): Unit = definedExternally
    override fun onStateChange(state: Array<Number>): Boolean = definedExternally
    override fun onLevelChange(level: Number): Boolean = definedExternally
    override fun getIntrinsicWidth(): Number = definedExternally
    override fun getIntrinsicHeight(): Number = definedExternally
    override fun getMinimumWidth(): Number = definedExternally
    override fun getMinimumHeight(): Number = definedExternally
    override fun drawableSizeChange(who: android.graphics.drawable.Drawable): Unit = definedExternally
//    open fun drawableSizeChange(who: android.graphics.drawable.Drawable): Unit = definedExternally
    override fun invalidateDrawable(who: android.graphics.drawable.Drawable): Unit = definedExternally
    override fun scheduleDrawable(who: android.graphics.drawable.Drawable, what: java.lang.Runnable, `when`: Number): Unit = definedExternally
    override fun unscheduleDrawable(who: android.graphics.drawable.Drawable, what: java.lang.Runnable): Unit = definedExternally
    override fun setVisible(visible: Boolean, restart: Boolean): Boolean = definedExternally
    override fun getOpacity(): Number = definedExternally
    open fun selectDrawable(idx: Number): Boolean = definedExternally
    open fun animate(schedule: Boolean): Unit = definedExternally
    override fun getCurrent(): Drawable = definedExternally
    override fun getConstantState(): Drawable.ConstantState = definedExternally
    override fun mutate(): Drawable = definedExternally
    open fun setConstantState(state: DrawableContainer.DrawableContainerState): Unit = definedExternally

    companion object {
        var DEBUG: Any = definedExternally
        var TAG: Any = definedExternally
        var DEFAULT_DITHER: Boolean = definedExternally
    }
}

external open class AnimationDrawable(state: AnimationDrawable.AnimationState? = definedExternally /* null */) : DrawableContainer, Runnable, Animatable {
    open class AnimationState(orig: AnimationState, owner: AnimationDrawable) : DrawableContainer.DrawableContainerState {
        open var mDurations: Any = definedExternally
        open var mOneShot: Any = definedExternally
        override fun newDrawable(): Drawable = definedExternally
        open fun addFrame(dr: Drawable, dur: Number): Unit = definedExternally
    }

    open var mAnimationState: Any = definedExternally
    open var mCurFrame: Any = definedExternally
    override fun setVisible(visible: Boolean, restart: Boolean): Boolean = definedExternally
    override fun start(): Unit = definedExternally
    override fun stop(): Unit = definedExternally
    override fun isRunning(): Boolean = definedExternally
    override fun run(): Unit = definedExternally
    open fun unscheduleSelf(what: Runnable): Unit = definedExternally
    open fun getNumberOfFrames(): Number = definedExternally
    open fun getFrame(index: Number): Drawable = definedExternally
    open fun getDuration(i: Number): Number = definedExternally
    open fun isOneShot(): Boolean = definedExternally
    open fun setOneShot(oneShot: Boolean): Unit = definedExternally
    open fun addFrame(frame: Drawable, duration: Number): Unit = definedExternally
    open fun nextFrame(unschedule: Any): Unit = definedExternally
    open fun setFrame(frame: Any, unschedule: Any, animate: Any): Unit = definedExternally
    override fun inflate(r: Resources, parser: HTMLElement): Unit = definedExternally
    override fun mutate(): Drawable = definedExternally
}

external open class StateListDrawable : DrawableContainer {
    open var mStateListState: Any = definedExternally
    open fun initWithState(state: Any): Unit = definedExternally
    open fun addState(stateSet: Array<Number>, drawable: Drawable): Unit = definedExternally
    override fun isStateful(): Boolean = definedExternally
    override fun onStateChange(stateSet: Array<Number>): Boolean = definedExternally
    override fun inflate(r: android.content.res.Resources, parser: HTMLElement): Unit = definedExternally
    open fun getStateListState(): Unit = definedExternally
    open fun getStateCount(): Number = definedExternally
    open fun getStateSet(index: Number): Array<Number> = definedExternally
    open fun getStateDrawable(index: Number): Drawable = definedExternally
    open fun getStateDrawableIndex(stateSet: Array<Number>): Number = definedExternally
    override fun mutate(): Drawable = definedExternally
}

external open class ClipDrawable : Drawable, Drawable.Callback {
    open class ClipState(orig: ClipState, owner: ClipDrawable) : Drawable.ConstantState {
        open var mDrawable: Drawable = definedExternally
        open var mOrientation: Number = definedExternally
        open var mGravity: Number = definedExternally
        open var mCheckedConstantState: Any = definedExternally
        open var mCanConstantState: Any = definedExternally
        override fun newDrawable(): Drawable = definedExternally
        open fun canConstantState(): Boolean = definedExternally
    }

    constructor(state: ClipDrawable.ClipState? = definedExternally /* null */)
    constructor(drawable: Drawable, gravity: Number, orientation: Number)

    open var mClipState: Any = definedExternally
    open var mTmpRect: Any = definedExternally
    override fun inflate(r: Resources, parser: HTMLElement): Unit = definedExternally
//    open fun drawableSizeChange(who: android.graphics.drawable.Drawable): Unit = definedExternally
    override fun drawableSizeChange(who: android.graphics.drawable.Drawable): Unit = definedExternally
    override fun invalidateDrawable(who: Drawable): Unit = definedExternally
    override fun scheduleDrawable(who: Drawable, what: Runnable, `when`: Number): Unit = definedExternally
    override fun unscheduleDrawable(who: Drawable, what: Runnable): Unit = definedExternally
    override fun getPadding(padding: Rect): Boolean = definedExternally
    override fun setVisible(visible: Boolean, restart: Boolean): Boolean = definedExternally
    override fun setAlpha(alpha: Number): Unit = definedExternally
    override fun getAlpha(): Number = definedExternally
    override fun getOpacity(): Number = definedExternally
    override fun isStateful(): Boolean = definedExternally
    override fun onStateChange(state: Array<Number>): Boolean = definedExternally
    override fun onLevelChange(level: Number): Boolean = definedExternally
    override fun onBoundsChange(bounds: Rect): Unit = definedExternally
    override fun draw(canvas: Canvas): Unit = definedExternally
    override fun getIntrinsicWidth(): Number = definedExternally
    override fun getIntrinsicHeight(): Number = definedExternally
    override fun getConstantState(): Drawable.ConstantState = definedExternally

    companion object {
        var HORIZONTAL: Number = definedExternally
        var VERTICAL: Number = definedExternally
    }
}
