@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.view.animation")
package android.view.animation

import android.graphics.Matrix
import android.graphics.RectF
import android.os.Handler
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

external interface Interpolator {
    fun getInterpolation(input: Number): Number
}
external open class LinearInterpolator : Interpolator {
    override fun getInterpolation(input: Number): Number = definedExternally
}
external open class AnimationUtils {
    companion object {
        fun currentAnimationTimeMillis(): Number = definedExternally
        fun loadAnimation(context: android.content.Context, id: String): Animation = definedExternally
    }
}
external open class AccelerateDecelerateInterpolator : Interpolator {
    override fun getInterpolation(input: Number): Number = definedExternally
}
external open class DecelerateInterpolator(factor: Number? = definedExternally /* null */) : Interpolator {
    open var mFactor: Any = definedExternally
    override fun getInterpolation(input: Number): Number = definedExternally
}
external open class Transformation {
    open var mMatrix: Matrix = definedExternally
    open var mAlpha: Number = definedExternally
    open var mTransformationType: Number = definedExternally
    open fun clear(): Unit = definedExternally
    open fun getTransformationType(): Number = definedExternally
    open fun setTransformationType(transformationType: Number): Unit = definedExternally
    open fun set(t: Transformation): Unit = definedExternally
    open fun compose(t: Transformation): Unit = definedExternally
    open fun postCompose(t: Transformation): Unit = definedExternally
    open fun getMatrix(): Matrix = definedExternally
    open fun setAlpha(alpha: Number): Unit = definedExternally
    open fun getAlpha(): Number = definedExternally
    override fun toString(): String = definedExternally
    open fun toShortString(sb: StringBuilder? = definedExternally /* null */): Unit = definedExternally
    companion object {
        var TYPE_IDENTITY: Number = definedExternally
        var TYPE_ALPHA: Number = definedExternally
        var TYPE_MATRIX: Number = definedExternally
        var TYPE_BOTH: Number = definedExternally
    }
}
external open class Animation {
    open class Description {
        open var type: Number = definedExternally
        open var value: Number = definedExternally
        companion object {
            fun parseValue(value: String): Description = definedExternally
        }
    }
    interface AnimationListener {
        fun onAnimationStart(animation: Animation)
        fun onAnimationEnd(animation: Animation)
        fun onAnimationRepeat(animation: Animation)
    }

    open var mEnded: Boolean = definedExternally
    open var mStarted: Boolean = definedExternally
    open var mCycleFlip: Boolean = definedExternally
    open var mInitialized: Boolean = definedExternally
    open var mFillBefore: Boolean = definedExternally
    open var mFillAfter: Boolean = definedExternally
    open var mFillEnabled: Boolean = definedExternally
    open var mStartTime: Number = definedExternally
    open var mStartOffset: Number = definedExternally
    open var mDuration: Number = definedExternally
    open var mRepeatCount: Number = definedExternally
    open var mRepeated: Number = definedExternally
    open var mRepeatMode: Number = definedExternally
    open var mInterpolator: Interpolator = definedExternally
    open var mListener: Animation.AnimationListener = definedExternally
    open var mZAdjustment: Any = definedExternally
    open var mBackgroundColor: Any = definedExternally
    open var mScaleFactor: Any = definedExternally
    open var mDetachWallpaper: Any = definedExternally
    open var mMore: Any = definedExternally
    open var mOneMoreTime: Any = definedExternally
    open var mPreviousRegion: RectF = definedExternally
    open var mRegion: RectF = definedExternally
    open var mTransformation: Transformation = definedExternally
    open var mPreviousTransformation: Transformation = definedExternally
    open var mListenerHandler: Any = definedExternally
    open var mOnStart: Any = definedExternally
    open var mOnRepeat: Any = definedExternally
    open var mOnEnd: Any = definedExternally
    open fun reset(): Unit = definedExternally
    open fun cancel(): Unit = definedExternally
    open fun detach(): Unit = definedExternally
    open fun isInitialized(): Boolean = definedExternally
    open fun initialize(width: Number, height: Number, parentWidth: Number, parentHeight: Number): Unit = definedExternally
    open fun setListenerHandler(handler: Handler): Unit = definedExternally
    open fun setInterpolator(i: Interpolator): Unit = definedExternally
    open fun setStartOffset(startOffset: Number): Unit = definedExternally
    open fun setDuration(durationMillis: Number): Unit = definedExternally
    open fun restrictDuration(durationMillis: Number): Unit = definedExternally
    open fun scaleCurrentDuration(scale: Number): Unit = definedExternally
    open fun setStartTime(startTimeMillis: Number): Unit = definedExternally
    open fun start(): Unit = definedExternally
    open fun startNow(): Unit = definedExternally
    open fun setRepeatMode(repeatMode: Number): Unit = definedExternally
    open fun setRepeatCount(repeatCount: Number): Unit = definedExternally
    open fun isFillEnabled(): Boolean = definedExternally
    open fun setFillEnabled(fillEnabled: Boolean): Unit = definedExternally
    open fun setFillBefore(fillBefore: Boolean): Unit = definedExternally
    open fun setFillAfter(fillAfter: Boolean): Unit = definedExternally
    open fun setZAdjustment(zAdjustment: Number): Unit = definedExternally
    open fun setBackgroundColor(bg: Number): Unit = definedExternally
    open fun getScaleFactor(): Number = definedExternally
    open fun setDetachWallpaper(detachWallpaper: Boolean): Unit = definedExternally
    open fun getInterpolator(): Interpolator = definedExternally
    open fun getStartTime(): Number = definedExternally
    open fun getDuration(): Number = definedExternally
    open fun getStartOffset(): Number = definedExternally
    open fun getRepeatMode(): Number = definedExternally
    open fun getRepeatCount(): Number = definedExternally
    open fun getFillBefore(): Boolean = definedExternally
    open fun getFillAfter(): Boolean = definedExternally
    open fun getZAdjustment(): Number = definedExternally
    open fun getBackgroundColor(): Number = definedExternally
    open fun getDetachWallpaper(): Boolean = definedExternally
    open fun willChangeTransformationMatrix(): Boolean = definedExternally
    open fun willChangeBounds(): Boolean = definedExternally
    open fun setAnimationListener(listener: Animation.AnimationListener): Unit = definedExternally
    open fun ensureInterpolator(): Unit = definedExternally
    open fun computeDurationHint(): Number = definedExternally
    open fun getTransformation(currentTime: Number, outTransformation: Transformation, scale: Number? = definedExternally /* null */): Boolean = definedExternally
    open fun fireAnimationStart(): Unit = definedExternally
    open fun fireAnimationRepeat(): Unit = definedExternally
    open fun fireAnimationEnd(): Unit = definedExternally
    open fun hasStarted(): Boolean = definedExternally
    open fun hasEnded(): Boolean = definedExternally
    open fun applyTransformation(interpolatedTime: Number, t: Transformation): Unit = definedExternally
    open fun resolveSize(type: Number, value: Number, size: Number, parentSize: Number): Number = definedExternally
    open fun getInvalidateRegion(left: Number, top: Number, right: Number, bottom: Number, invalidate: RectF, transformation: Transformation): Unit = definedExternally
    open fun initializeInvalidateRegion(left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
    open fun hasAlpha(): Boolean = definedExternally
    companion object {
        var INFINITE: Number = definedExternally
        var RESTART: Number = definedExternally
        var REVERSE: Number = definedExternally
        var START_ON_FIRST_FRAME: Number = definedExternally
        var ABSOLUTE: Number = definedExternally
        var RELATIVE_TO_SELF: Number = definedExternally
        var RELATIVE_TO_PARENT: Number = definedExternally
        var ZORDER_NORMAL: Number = definedExternally
        var ZORDER_TOP: Number = definedExternally
        var ZORDER_BOTTOM: Number = definedExternally
        var USE_CLOSEGUARD: Any = definedExternally
    }
}
external open class TranslateAnimation : Animation {
    constructor(fromXDelta: Number, toXDelta: Number, fromYDelta: Number, toYDelta: Number)
    constructor(fromXType: Number, fromXValue: Number, toXType: Number, toXValue: Number, fromYType: Number, fromYValue: Number, toYType: Number, toYValue: Number)
    open var mFromXType: Any = definedExternally
    open var mToXType: Any = definedExternally
    open var mFromYType: Any = definedExternally
    open var mToYType: Any = definedExternally
    open var mFromXValue: Any = definedExternally
    open var mToXValue: Any = definedExternally
    open var mFromYValue: Any = definedExternally
    open var mToYValue: Any = definedExternally
    open var mFromXDelta: Any = definedExternally
    open var mToXDelta: Any = definedExternally
    open var mFromYDelta: Any = definedExternally
    open var mToYDelta: Any = definedExternally
    override fun applyTransformation(interpolatedTime: Number, t: Transformation): Unit = definedExternally
    override fun initialize(width: Number, height: Number, parentWidth: Number, parentHeight: Number): Unit = definedExternally
}
external open class AlphaAnimation(fromAlpha: Number, toAlpha: Number) : Animation {
    open var mFromAlpha: Any = definedExternally
    open var mToAlpha: Any = definedExternally
    override fun applyTransformation(interpolatedTime: Number, t: Transformation): Unit = definedExternally
    override fun willChangeTransformationMatrix(): Boolean = definedExternally
    override fun willChangeBounds(): Boolean = definedExternally
    override fun hasAlpha(): Boolean = definedExternally
}
external open class ScaleAnimation(fromX: Number, toX: Number, fromY: Number, toY: Number, pivotXType: Number? = definedExternally /* null */, pivotXValue: Number? = definedExternally /* null */, pivotYType: Number? = definedExternally /* null */, pivotYValue: Number? = definedExternally /* null */) : Animation {
    open var mResources: Any = definedExternally
    open var mFromX: Any = definedExternally
    open var mToX: Any = definedExternally
    open var mFromY: Any = definedExternally
    open var mToY: Any = definedExternally
    open var mFromXData: Any = definedExternally
    open var mToXData: Any = definedExternally
    open var mFromYData: Any = definedExternally
    open var mToYData: Any = definedExternally
    open var mPivotXType: Any = definedExternally
    open var mPivotYType: Any = definedExternally
    open var mPivotXValue: Any = definedExternally
    open var mPivotYValue: Any = definedExternally
    open var mPivotX: Any = definedExternally
    open var mPivotY: Any = definedExternally
    open fun initializePivotPoint(): Unit = definedExternally
    override fun applyTransformation(interpolatedTime: Number, t: Transformation): Unit = definedExternally
    override fun initialize(width: Number, height: Number, parentWidth: Number, parentHeight: Number): Unit = definedExternally
}
external open class AnimationSet(shareInterpolator: Boolean? = definedExternally /* null */) : Animation {
    open var mFlags: Any = definedExternally
    open var mDirty: Any = definedExternally
    open var mHasAlpha: Any = definedExternally
    open var mAnimations: Any = definedExternally
    open var mTempTransformation: Any = definedExternally
    open var mLastEnd: Any = definedExternally
    open var mStoredOffsets: Any = definedExternally
    open fun setFlag(mask: Any, value: Any): Unit = definedExternally
    open fun init(): Unit = definedExternally
    override fun setFillAfter(fillAfter: Boolean): Unit = definedExternally
    override fun setFillBefore(fillBefore: Boolean): Unit = definedExternally
    override fun setRepeatMode(repeatMode: Number): Unit = definedExternally
    override fun setStartOffset(startOffset: Number): Unit = definedExternally
    override fun hasAlpha(): Boolean = definedExternally
    override fun setDuration(durationMillis: Number): Unit = definedExternally
    open fun addAnimation(a: Animation): Unit = definedExternally
    override fun setStartTime(startTimeMillis: Number): Unit = definedExternally
    override fun getStartTime(): Number = definedExternally
    override fun restrictDuration(durationMillis: Number): Unit = definedExternally
    override fun getDuration(): Number = definedExternally
    override fun computeDurationHint(): Number = definedExternally
    override fun initializeInvalidateRegion(left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
    open fun getTransformation(currentTime: Number, t: Transformation): Boolean = definedExternally
    override fun scaleCurrentDuration(scale: Number): Unit = definedExternally
    override fun initialize(width: Number, height: Number, parentWidth: Number, parentHeight: Number): Unit = definedExternally
    override fun reset(): Unit = definedExternally
    open fun restoreChildrenStartOffset(): Unit = definedExternally
    open fun getAnimations(): List<Animation> = definedExternally
    override fun willChangeTransformationMatrix(): Boolean = definedExternally
    override fun willChangeBounds(): Boolean = definedExternally
    companion object {
        var PROPERTY_FILL_AFTER_MASK: Any = definedExternally
        var PROPERTY_FILL_BEFORE_MASK: Any = definedExternally
        var PROPERTY_REPEAT_MODE_MASK: Any = definedExternally
        var PROPERTY_START_OFFSET_MASK: Any = definedExternally
        var PROPERTY_SHARE_INTERPOLATOR_MASK: Any = definedExternally
        var PROPERTY_DURATION_MASK: Any = definedExternally
        var PROPERTY_MORPH_MATRIX_MASK: Any = definedExternally
        var PROPERTY_CHANGE_BOUNDS_MASK: Any = definedExternally
    }
}
external open class AccelerateInterpolator(factor: Number? = definedExternally /* null */) : Interpolator {
    open var mFactor: Any = definedExternally
    open var mDoubleFactor: Any = definedExternally
    override fun getInterpolation(input: Number): Number = definedExternally
}
external open class AnticipateInterpolator(tension: Number? = definedExternally /* null */) : Interpolator {
    open var mTension: Any = definedExternally
    override fun getInterpolation(t: Number): Number = definedExternally
}
external open class AnticipateOvershootInterpolator(tension: Number? = definedExternally /* null */, extraTension: Number? = definedExternally /* null */) : Interpolator {
    open var mTension: Any = definedExternally
    override fun getInterpolation(t: Number): Number = definedExternally
    companion object {
        fun a(t: Any, s: Any): Unit = definedExternally
        fun o(t: Any, s: Any): Unit = definedExternally
    }
}
external open class BounceInterpolator : Interpolator {
    override fun getInterpolation(t: Number): Number = definedExternally
    companion object {
        fun bounce(t: Any): Unit = definedExternally
    }
}
external open class CycleInterpolator(mCycles: Number) : Interpolator {
    open var mCycles: Any = definedExternally
    override fun getInterpolation(input: Number): Number = definedExternally
}
external open class OvershootInterpolator(tension: Number? = definedExternally /* null */) : Interpolator {
    open var mTension: Any = definedExternally
    override fun getInterpolation(t: Number): Number = definedExternally
}
external open class RotateAnimation(fromDegrees: Number, toDegrees: Number, pivotXType: Number? = definedExternally /* null */, pivotXValue: Number? = definedExternally /* null */, pivotYType: Number? = definedExternally /* null */, pivotYValue: Number? = definedExternally /* null */) : Animation {
    open var mFromDegrees: Any = definedExternally
    open var mToDegrees: Any = definedExternally
    open var mPivotXType: Any = definedExternally
    open var mPivotYType: Any = definedExternally
    open var mPivotXValue: Any = definedExternally
    open var mPivotYValue: Any = definedExternally
    open var mPivotX: Any = definedExternally
    open var mPivotY: Any = definedExternally
    open fun initializePivotPoint(): Unit = definedExternally
    override fun applyTransformation(interpolatedTime: Number, t: Transformation): Unit = definedExternally
    override fun initialize(width: Number, height: Number, parentWidth: Number, parentHeight: Number): Unit = definedExternally
}
