@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.view")

package android.view

import android.content.Context
import android.content.res.Resources
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.Matrix
import android.graphics.Point
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.Transformation
import androidui.attr.AttrBinder
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
import java.lang.JavaObject
import java.lang.Runnable
import java.lang.util.concurrent.CopyOnWriteArrayList


external open class View(context: Context, bindElement: HTMLElement? = definedExternally /* null */, defStyleAttr: Map<String, String>? = definedExternally /* null */) : JavaObject, Drawable.Callback, KeyEvent.Callback {
//    override fun unscheduleDrawable(who: Drawable, what: Runnable) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }

    open class TransformationInfo {
        open var mMatrix: Matrix = definedExternally
        open var mInverseMatrix: Any = definedExternally
        open var mMatrixDirty: Boolean = definedExternally
        open var mInverseMatrixDirty: Boolean = definedExternally
        open var mMatrixIsIdentity: Boolean = definedExternally
        open var mPrevWidth: Number = definedExternally
        open var mPrevHeight: Number = definedExternally
        open var mRotation: Number = definedExternally
        open var mTranslationX: Number = definedExternally
        open var mTranslationY: Number = definedExternally
        open var mScaleX: Number = definedExternally
        open var mScaleY: Number = definedExternally
        open var mPivotX: Number = definedExternally
        open var mPivotY: Number = definedExternally
        open var mAlpha: Number = definedExternally
        open var mTransitionAlpha: Number = definedExternally
    }

    open class MeasureSpec {
        companion object {
            var MODE_SHIFT: Number = definedExternally
            var MODE_MASK: Number = definedExternally
            var UNSPECIFIED: Number = definedExternally
            var EXACTLY: Number = definedExternally
            var AT_MOST: Number = definedExternally
            fun makeMeasureSpec(size: Any, mode: Any): Number = definedExternally
            fun getMode(measureSpec: Any): Number = definedExternally
            fun getSize(measureSpec: Any): Number = definedExternally
            fun adjust(measureSpec: Any, delta: Any): Number = definedExternally
            fun toString(measureSpec: Any): String = definedExternally
        }
    }

    open class AttachInfo(mViewRootImpl: ViewRootImpl, mHandler: Handler) {
        open class InvalidateInfo {
            open var target: View = definedExternally
            open var left: Number = definedExternally
            open var top: Number = definedExternally
            open var right: Number = definedExternally
            open var bottom: Number = definedExternally
            open fun recycle(): Unit = definedExternally

            companion object {
                var POOL_LIMIT: Any = definedExternally
                var sPool: Any = definedExternally
                fun obtain(): InvalidateInfo = definedExternally
            }
        }

        open var mRootView: View = definedExternally
        open var mKeyDispatchState: KeyEvent.DispatcherState = definedExternally
        open var mViewRootImpl: ViewRootImpl = definedExternally
        open var mHandler: Handler = definedExternally
        open var mTmpInvalRect: Rect = definedExternally
        open var mTmpTransformRect: Rect = definedExternally
        open var mPoint: Point = definedExternally
        open var mTmpMatrix: Matrix = definedExternally
        open var mTmpTransformation: Transformation = definedExternally
        open var mTmpTransformLocation: Array<Number> = definedExternally
        open var mScrollContainers: Set<View> = definedExternally
        open var mViewRequestingLayout: View = definedExternally
        open var mInvalidateChildLocation: Array<Number> = definedExternally
        open var mHasWindowFocus: Boolean = definedExternally
        open var mWindowVisibility: Number = definedExternally
    }

    open class ListenerInfo {
        open var mOnFocusChangeListener: OnFocusChangeListener = definedExternally
        open var mOnAttachStateChangeListeners: CopyOnWriteArrayList<OnAttachStateChangeListener> = definedExternally
        open var mOnLayoutChangeListeners: ArrayList<OnLayoutChangeListener> = definedExternally
        open var mOnClickListener: OnClickListener = definedExternally
        open var mOnLongClickListener: OnLongClickListener = definedExternally
        open var mOnTouchListener: OnTouchListener = definedExternally
        open var mOnKeyListener: OnKeyListener = definedExternally
        open var mOnGenericMotionListener: OnGenericMotionListener = definedExternally
    }

    interface OnAttachStateChangeListener {
        fun onViewAttachedToWindow(v: View): Any
        fun onViewDetachedFromWindow(v: View): Any
    }

    interface OnLayoutChangeListener {
        fun onLayoutChange(v: View, left: Number, top: Number, right: Number, bottom: Number, oldLeft: Number, oldTop: Number, oldRight: Number, oldBottom: Number)
    }

    open class OnclickListenerFormFunction() {
        open fun fromFunction(func: (v: View) -> Unit): OnClickListener = definedExternally
    }

    interface OnClickListener : OnclickListenerFormFunction {
        fun onClick(v: View)
//        fun fromFunction(func: (v: View) -> Unit): OnClickListener = definedExternally
    }

    open class OnLongClickListenerFromFunction() {
        open fun fromFunction(func: (v: View) -> Boolean): OnLongClickListener = definedExternally
    }

    interface OnLongClickListener : OnLongClickListenerFromFunction {
        fun onLongClick(v: View): Boolean
        //fun fromFunction(func: (v: View) -> Boolean): OnLongClickListener = definedExternally
    }

    open class OnFocusChangeListenerFromFunction() {
        open fun fromFunction(func: (v: View, hasFocus: Boolean) -> Unit): OnFocusChangeListener = definedExternally
    }

    interface OnFocusChangeListener : OnFocusChangeListenerFromFunction {
        fun onFocusChange(v: View, hasFocus: Boolean)
//        fun fromFunction(func: (v: View, hasFocus: Boolean) -> Unit): OnFocusChangeListener = definedExternally
    }

    open class OnTouchListenerFromFunction() {
        open fun fromFunction(func: (v: View, event: MotionEvent) -> Unit): OnTouchListener = definedExternally
    }

    interface OnTouchListener : OnTouchListenerFromFunction {
        fun onTouch(v: View, event: MotionEvent)
        //fun fromFunction(func: (v: View, event: MotionEvent) -> Unit): OnTouchListener = definedExternally
    }

    open class OnKeyListenerFromFunction() {
        open fun fromFunction(func: (v: View, keyCode: Number, event: KeyEvent) -> Unit): OnKeyListener = definedExternally
    }

    interface OnKeyListener : OnKeyListenerFromFunction {
        fun onKey(v: View, keyCode: Number, event: KeyEvent)
        //fun fromFunction(func: (v: View, keyCode: Number, event: KeyEvent) -> Unit): OnKeyListener = definedExternally
    }

    open class OnGenericMotionListenerFromFunction() {
        open fun fromFunction(func: (v: View, event: MotionEvent) -> Unit): OnGenericMotionListener = definedExternally
    }

    interface OnGenericMotionListener : OnGenericMotionListenerFromFunction {
        fun onGenericMotion(v: View, event: MotionEvent): Any
        //fun fromFunction(func: (v: View, event: MotionEvent) -> Unit): OnGenericMotionListener = definedExternally
    }

    interface Predicate<T> {
        fun apply(t: T): Boolean
    }
    open var viewHodler:Any = definedExternally
    open var mID: String = definedExternally
    open var mTag: Any = definedExternally
    open var mPrivateFlags: Number = definedExternally
    open var mPrivateFlags2: Any = definedExternally
    open var mPrivateFlags3: Any = definedExternally
    open var mContext: Context = definedExternally
    open var mCurrentAnimation: Animation = definedExternally
    open var mOldWidthMeasureSpec: Any = definedExternally
    open var mOldHeightMeasureSpec: Any = definedExternally
    open var mMeasuredWidth: Any = definedExternally
    open var mMeasuredHeight: Any = definedExternally
    open var mBackground: Any = definedExternally
    open var mBackgroundSizeChanged: Any = definedExternally
    open var mBackgroundWidth: Any = definedExternally
    open var mBackgroundHeight: Any = definedExternally
    open var mScrollCache: Any = definedExternally
    open var mDrawableState: Any = definedExternally
    open var mNextFocusLeftId: Any = definedExternally
    open var mNextFocusRightId: Any = definedExternally
    open var mNextFocusUpId: Any = definedExternally
    open var mNextFocusDownId: Any = definedExternally
    open var mNextFocusForwardId: String = definedExternally
    open var mPendingCheckForLongPress: Any = definedExternally
    open var mPendingCheckForTap: Any = definedExternally
    open var mPerformClick: Any = definedExternally
    open var mPerformClickAfterPressDraw: Any = definedExternally
    open var mUnsetPressedState: Any = definedExternally
    open var mHasPerformedLongPress: Any = definedExternally
    open var mMinWidth: Number = definedExternally
    open var mMinHeight: Number = definedExternally
    open var mTouchDelegate: Any = definedExternally
    open var mFloatingTreeObserver: Any = definedExternally
    open var mDrawingCacheBackgroundColor: Any = definedExternally
    open var mUnscaledDrawingCache: Any = definedExternally
    open var mTouchSlop: Number = definedExternally
    open var mVerticalScrollFactor: Any = definedExternally
    open var mOverScrollMode: Any = definedExternally
    open var mParent: ViewParent = definedExternally
    open var mMeasureCache: Any = definedExternally
    open var mAttachInfo: View.AttachInfo = definedExternally
    open var mLayoutParams: ViewGroup.LayoutParams = definedExternally
    open var mTransformationInfo: View.TransformationInfo = definedExternally
    open var mViewFlags: Number = definedExternally
    open var mLayerType: Number = definedExternally
    open var mLocalDirtyRect: Rect = definedExternally
    open var mCachingFailed: Boolean = definedExternally
    open var mOverlay: Any = definedExternally
    open var mWindowAttachCount: Any = definedExternally
    open var mTransientStateCount: Any = definedExternally
    open var mListenerInfo: Any = definedExternally
    open var mClipBounds: Any = definedExternally
    open var mLastIsOpaque: Any = definedExternally
    open var mMatchIdPredicate: Any = definedExternally
    open var _mLeft: Any = definedExternally
    open var _mRight: Any = definedExternally
    open var _mTop: Any = definedExternally
    open var _mBottom: Any = definedExternally
    open var mLeft: Number = definedExternally
    open var mRight: Number = definedExternally
    open var mTop: Number = definedExternally
    open var mBottom: Number = definedExternally
    open var _mScrollX: Any = definedExternally
    open var _mScrollY: Any = definedExternally
    open var mScrollX: Number = definedExternally
    open var mScrollY: Number = definedExternally
    open var mPaddingLeft: Number = definedExternally
    open var mPaddingRight: Number = definedExternally
    open var mPaddingTop: Number = definedExternally
    open var mPaddingBottom: Number = definedExternally
    open var mCornerRadiusTopLeft: Any = definedExternally
    open var mCornerRadiusTopRight: Any = definedExternally
    open var mCornerRadiusBottomRight: Any = definedExternally
    open var mCornerRadiusBottomLeft: Any = definedExternally
    open var mShadowPaint: Any = definedExternally
    open var mShadowDrawable: Any = definedExternally
    open fun getContext(): Context = definedExternally
    open fun getWidth(): Number = definedExternally
    open fun getHeight(): Number = definedExternally
    open fun getPaddingLeft(): Number = definedExternally
    open fun getPaddingTop(): Number = definedExternally
    open fun getPaddingRight(): Number = definedExternally
    open fun getPaddingBottom(): Number = definedExternally
    open fun setPaddingLeft(left: Number): Unit = definedExternally
    open fun setPaddingTop(top: Number): Unit = definedExternally
    open fun setPaddingRight(right: Number): Unit = definedExternally
    open fun setPaddingBottom(bottom: Number): Unit = definedExternally
    open fun setPadding(left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
    open fun resolvePadding(): Unit = definedExternally
    open fun setScrollX(value: Number): Unit = definedExternally
    open fun setScrollY(value: Number): Unit = definedExternally
    open fun getScrollX(): Number = definedExternally
    open fun getScrollY(): Number = definedExternally
    open fun offsetTopAndBottom(offset: Number): Unit = definedExternally
    open fun offsetLeftAndRight(offset: Number): Unit = definedExternally
    open fun getMatrix(): Matrix = definedExternally
    open fun hasIdentityMatrix(): Boolean = definedExternally
    open fun ensureTransformationInfo(): Unit = definedExternally
    open fun updateMatrix(): Unit = definedExternally
    open fun getRotation(): Number = definedExternally
    open fun setRotation(rotation: Number): Unit = definedExternally
    open fun getRotationY(): Number = definedExternally
    open fun setRotationY(rotationY: Number): Unit = definedExternally
    open fun getRotationX(): Number = definedExternally
    open fun setRotationX(rotationX: Number): Unit = definedExternally
    open fun getScaleX(): Number = definedExternally
    open fun setScaleX(scaleX: Number): Unit = definedExternally
    open fun getScaleY(): Number = definedExternally
    open fun setScaleY(scaleY: Number): Unit = definedExternally
    open fun getPivotX(): Number = definedExternally
    open fun setPivotX(pivotX: Number): Unit = definedExternally
    open fun getPivotY(): Number = definedExternally
    open fun setPivotY(pivotY: Number): Unit = definedExternally
    open fun getAlpha(): Number = definedExternally
    open fun hasOverlappingRendering(): Boolean = definedExternally
    open fun setAlpha(alpha: Number): Unit = definedExternally
    open fun setAlphaNoInvalidation(alpha: Number): Boolean = definedExternally
    open fun setTransitionAlpha(alpha: Number): Unit = definedExternally
    open fun getFinalAlpha(): Unit = definedExternally
    open fun getTransitionAlpha(): Number = definedExternally
    open fun getTop(): Number = definedExternally
    open fun setTop(top: Number): Unit = definedExternally
    open fun getBottom(): Number = definedExternally
    open fun isDirty(): Boolean = definedExternally
    open fun setBottom(bottom: Number): Unit = definedExternally
    open fun getLeft(): Number = definedExternally
    open fun setLeft(left: Number): Unit = definedExternally
    open fun getRight(): Number = definedExternally
    open fun setRight(right: Number): Unit = definedExternally
    open fun getX(): Number = definedExternally
    open fun setX(x: Number): Unit = definedExternally
    open fun getY(): Number = definedExternally
    open fun setY(y: Number): Unit = definedExternally
    open fun getTranslationX(): Number = definedExternally
    open fun setTranslationX(translationX: Number): Unit = definedExternally
    open fun getTranslationY(): Number = definedExternally
    open fun setTranslationY(translationY: Number): Unit = definedExternally
    open fun transformRect(rect: Rect): Unit = definedExternally
    open fun pointInView(localX: Number, localY: Number, slop: Number? = definedExternally /* null */): Boolean = definedExternally
    open fun getHandler(): Handler = definedExternally
    open fun getViewRootImpl(): ViewRootImpl = definedExternally
    open fun post(action: Runnable): Boolean = definedExternally
    open fun postDelayed(action: Runnable, delayMillis: Number): Boolean = definedExternally
    open fun postOnAnimation(action: Runnable): Boolean = definedExternally
    open fun postOnAnimationDelayed(action: Runnable, delayMillis: Number): Boolean = definedExternally
    open fun removeCallbacks(action: Runnable): Boolean = definedExternally
    open fun getParent(): ViewParent = definedExternally
    open fun setFlags(flags: Number, mask: Number): Unit = definedExternally
    open fun bringToFront(): Unit = definedExternally
    open fun onScrollChanged(l: Number, t: Number, oldl: Number, oldt: Number): Unit = definedExternally
    open fun onSizeChanged(w: Number, h: Number, oldw: Number, oldh: Number): Unit = definedExternally
    open fun getTouchables(): ArrayList<View> = definedExternally
    open fun addTouchables(views: ArrayList<View>): Unit = definedExternally
    open fun requestRectangleOnScreen(rectangle: Rect, immediate: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun onFocusLost(): Unit = definedExternally
    open fun resetPressedState(): Unit = definedExternally
    open fun isFocused(): Boolean = definedExternally
    open fun findFocus(): View = definedExternally
    open fun getNextFocusLeftId(): String = definedExternally
    open fun setNextFocusLeftId(nextFocusLeftId: String): Unit = definedExternally
    open fun getNextFocusRightId(): String = definedExternally
    open fun setNextFocusRightId(nextFocusRightId: String): Unit = definedExternally
    open fun getNextFocusUpId(): String = definedExternally
    open fun setNextFocusUpId(nextFocusUpId: String): Unit = definedExternally
    open fun getNextFocusDownId(): String = definedExternally
    open fun setNextFocusDownId(nextFocusDownId: String): Unit = definedExternally
    open fun getNextFocusForwardId(): String = definedExternally
    open fun setNextFocusForwardId(nextFocusForwardId: String): Unit = definedExternally
    open fun setFocusable(focusable: Boolean): Unit = definedExternally
    open fun isFocusable(): Boolean = definedExternally
    open fun setFocusableInTouchMode(focusableInTouchMode: Boolean): Unit = definedExternally
    open fun isFocusableInTouchMode(): Boolean = definedExternally
    open fun hasFocusable(): Boolean = definedExternally
    open fun clearFocus(): Unit = definedExternally
    open fun clearFocusInternal(propagate: Boolean, refocus: Boolean): Unit = definedExternally
    open fun notifyGlobalFocusCleared(oldFocus: View): Unit = definedExternally
    open fun rootViewRequestFocus(): Boolean = definedExternally
    open fun unFocus(): Unit = definedExternally
    open fun hasFocus(): Boolean = definedExternally
    open fun onFocusChanged(gainFocus: Boolean, direction: Number, previouslyFocusedRect: Rect): Unit = definedExternally
    open fun focusSearch(direction: Number): View = definedExternally
    open fun dispatchUnhandledMove(focused: View, direction: Number): Boolean = definedExternally
    open fun findUserSetNextFocus(root: View, direction: Number): View = definedExternally
    open fun findViewInsideOutShouldExist(root: Any, id: Any): Unit = definedExternally
    open fun getFocusables(direction: Number): ArrayList<View> = definedExternally
    open fun addFocusables(views: ArrayList<View>, direction: Number): Unit = definedExternally
    open fun addFocusables(views: ArrayList<View>, direction: Number, focusableMode: Number? = definedExternally /* null */): Unit = definedExternally
    open fun setOnFocusChangeListener(l: View.OnFocusChangeListener): Unit = definedExternally
    open fun setOnFocusChangeListener(l: (v: View, hasFocus: Boolean) -> Unit): Unit = definedExternally
    open fun getOnFocusChangeListener(): View.OnFocusChangeListener = definedExternally
    open fun requestFocus(direction: Number? = definedExternally /* null */, previouslyFocusedRect: Any? = definedExternally /* null */): Boolean = definedExternally
    open fun requestFocusNoSearch(direction: Any, previouslyFocusedRect: Any): Unit = definedExternally
    open fun requestFocusFromTouch(): Boolean = definedExternally
    open fun hasAncestorThatBlocksDescendantFocus(): Unit = definedExternally
    open fun handleFocusGainInternal(direction: Number, previouslyFocusedRect: Rect): Unit = definedExternally
    open fun hasTransientState(): Boolean = definedExternally
    open fun setHasTransientState(hasTransientState: Boolean): Unit = definedExternally
    open fun isScrollContainer(): Boolean = definedExternally
    open fun setScrollContainer(isScrollContainer: Boolean): Unit = definedExternally
    open fun isInTouchMode(): Boolean = definedExternally
    open fun isShown(): Boolean = definedExternally
    open fun getVisibility(): Number = definedExternally
    open fun setVisibility(visibility: Number): Unit = definedExternally
    open fun dispatchVisibilityChanged(changedView: View, visibility: Number): Unit = definedExternally
    open fun onVisibilityChanged(changedView: View, visibility: Number): Unit = definedExternally
    open fun dispatchDisplayHint(hint: Number): Unit = definedExternally
    open fun onDisplayHint(hint: Number): Unit = definedExternally
    open fun dispatchWindowVisibilityChanged(visibility: Number): Unit = definedExternally
    open fun onWindowVisibilityChanged(visibility: Number): Unit = definedExternally
    open fun getWindowVisibility(): Number = definedExternally
    open fun isEnabled(): Boolean = definedExternally
    open fun setEnabled(enabled: Boolean): Unit = definedExternally
    open fun dispatchGenericMotionEvent(event: MotionEvent): Boolean = definedExternally
    open fun dispatchGenericMotionEventInternal(event: Any): Unit = definedExternally
    open fun onGenericMotionEvent(event: MotionEvent): Boolean = definedExternally
    open fun dispatchGenericPointerEvent(event: MotionEvent): Boolean = definedExternally
    open fun dispatchKeyEvent(event: KeyEvent): Boolean = definedExternally
    open fun setOnKeyListener(l: View.OnKeyListener): Unit = definedExternally
    open fun setOnKeyListener(l: (v: View, keyCode: Number, event: KeyEvent) -> Unit): Unit = definedExternally
    open fun getKeyDispatcherState(): KeyEvent.DispatcherState = definedExternally
    override fun onKeyDown(keyCode: Number, event: android.view.KeyEvent): Boolean = definedExternally
    override fun onKeyLongPress(keyCode: Number, event: android.view.KeyEvent): Boolean = definedExternally
    override fun onKeyUp(keyCode: Number, event: android.view.KeyEvent): Boolean = definedExternally
    open fun dispatchTouchEvent(event: MotionEvent): Boolean = definedExternally
    open fun onFilterTouchEventForSecurity(event: MotionEvent): Boolean = definedExternally
    open fun onTouchEvent(event: MotionEvent): Boolean = definedExternally
    open fun isInScrollingContainer(): Boolean = definedExternally
    open fun cancelPendingInputEvents(): Unit = definedExternally
    open fun dispatchCancelPendingInputEvents(): Unit = definedExternally
    open fun onCancelPendingInputEvents(): Unit = definedExternally
    open fun removeLongPressCallback(): Unit = definedExternally
    open fun removePerformClickCallback(): Unit = definedExternally
    open fun removeUnsetPressCallback(): Unit = definedExternally
    open fun removeTapCallback(): Unit = definedExternally
    open fun cancelLongPress(): Unit = definedExternally
    open fun setTouchDelegate(delegate: TouchDelegate): Unit = definedExternally
    open fun getTouchDelegate(): TouchDelegate = definedExternally
    open fun getListenerInfo(): View.ListenerInfo = definedExternally
    open fun addOnLayoutChangeListener(listener: View.OnLayoutChangeListener): Unit = definedExternally
    open fun removeOnLayoutChangeListener(listener: View.OnLayoutChangeListener): Unit = definedExternally
    open fun addOnAttachStateChangeListener(listener: View.OnAttachStateChangeListener): Unit = definedExternally
    open fun removeOnAttachStateChangeListener(listener: View.OnAttachStateChangeListener): Unit = definedExternally
    open fun setOnClickListenerByAttrValueString(onClickAttrString: Any): Unit = definedExternally
    open fun setOnClickListener(l: View.OnClickListener): Unit = definedExternally
    open fun setOnClickListener(l: (v: View) -> Unit): Unit = definedExternally
    open fun hasOnClickListeners(): Boolean = definedExternally
    open fun setOnLongClickListener(l: View.OnLongClickListener): Unit = definedExternally
    open fun setOnLongClickListener(l: (v: View) -> Boolean): Unit = definedExternally
    open fun playSoundEffect(soundConstant: Number): Unit = definedExternally
    open fun performHapticFeedback(feedbackConstant: Number): Boolean = definedExternally
    //open fun performClick(): Boolean = definedExternally
    open fun performClick(event: MotionEvent? = definedExternally /* null */): Boolean = definedExternally
    open fun callOnClick(): Boolean = definedExternally
    open fun performLongClick(): Boolean = definedExternally
    open fun performButtonActionOnTouchDown(event: MotionEvent): Boolean = definedExternally
    open fun checkForLongClick(delayOffset: Any? = definedExternally /* null */): Unit = definedExternally
    open fun setOnTouchListener(l: View.OnTouchListener): Unit = definedExternally
    open fun setOnTouchListener(l: (v: View, event: MotionEvent) -> Unit): Unit = definedExternally
    open fun isClickable(): Boolean = definedExternally
    open fun setClickable(clickable: Boolean): Unit = definedExternally
    open fun isLongClickable(): Boolean = definedExternally
    open fun setLongClickable(longClickable: Boolean): Unit = definedExternally
    open fun setPressed(pressed: Boolean): Unit = definedExternally
    open fun dispatchSetPressed(pressed: Boolean): Unit = definedExternally
    open fun isPressed(): Boolean = definedExternally
    open fun setSelected(selected: Boolean): Unit = definedExternally
    open fun dispatchSetSelected(selected: Boolean): Unit = definedExternally
    open fun isSelected(): Boolean = definedExternally
    open fun setActivated(activated: Boolean): Unit = definedExternally
    open fun dispatchSetActivated(activated: Boolean): Unit = definedExternally
    open fun isActivated(): Boolean = definedExternally
    open fun getViewTreeObserver(): ViewTreeObserver = definedExternally
    open fun setLayoutDirection(layoutDirection: Number): Unit = definedExternally
    open fun getLayoutDirection(): Number = definedExternally
    open fun isLayoutRtl(): Boolean = definedExternally
    open fun getTextDirection(): Number = definedExternally
    open fun setTextDirection(textDirection: Number): Unit = definedExternally
    open fun getTextAlignment(): Number = definedExternally
    open fun setTextAlignment(textAlignment: Number): Unit = definedExternally
    open fun getBaseline(): Number = definedExternally
    open fun isLayoutRequested(): Boolean = definedExternally
    open fun getLayoutParams(): ViewGroup.LayoutParams = definedExternally
    open fun setLayoutParams(params: ViewGroup.LayoutParams): Unit = definedExternally
    open fun isInLayout(): Boolean = definedExternally
    open fun requestLayout(): Unit = definedExternally
    open fun forceLayout(): Unit = definedExternally
    open fun isLaidOut(): Boolean = definedExternally
    open fun layout(l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
    open fun onLayout(changed: Boolean, left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
    open fun setFrame(left: Number, top: Number, right: Number, bottom: Number): Boolean = definedExternally
    open fun sizeChange(newWidth: Any, newHeight: Any, oldWidth: Any, oldHeight: Any): Unit = definedExternally
    open fun getHitRect(outRect: Rect): Unit = definedExternally
    open fun getFocusedRect(r: Rect): Unit = definedExternally
    open fun getDrawingRect(outRect: Rect): Unit = definedExternally
    open fun getGlobalVisibleRect(r: Rect, globalOffset: Point? = definedExternally /* null */): Boolean = definedExternally
    open fun getLocationOnScreen(location: Array<Number>): Unit = definedExternally
    open fun getLocationInWindow(location: Array<Number>): Unit = definedExternally
    open fun getWindowVisibleDisplayFrame(outRect: Rect): Unit = definedExternally
    open fun isVisibleToUser(boundInView: Rect? = definedExternally /* null */): Boolean = definedExternally
    open fun getMeasuredWidth(): Number = definedExternally
    open fun getMeasuredWidthAndState(): Number = definedExternally
    open fun getMeasuredHeight(): Number = definedExternally
    open fun getMeasuredHeightAndState(): Number = definedExternally
    open fun getMeasuredState(): Number = definedExternally
    open fun measure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    open fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    open fun setMeasuredDimension(measuredWidth: Any, measuredHeight: Any): Unit = definedExternally
    open fun getSuggestedMinimumHeight(): Number = definedExternally
    open fun getSuggestedMinimumWidth(): Number = definedExternally
    open fun getMinimumHeight(): Number = definedExternally
    open fun setMinimumHeight(minHeight: Any): Unit = definedExternally
    open fun getMinimumWidth(): Number = definedExternally
    open fun setMinimumWidth(minWidth: Any): Unit = definedExternally
    open fun getAnimation(): Animation = definedExternally
    open fun startAnimation(animation: Animation): Unit = definedExternally
    open fun clearAnimation(): Unit = definedExternally
    open fun setAnimation(animation: Animation): Unit = definedExternally
    open fun onAnimationStart(): Unit = definedExternally
    open fun onAnimationEnd(): Unit = definedExternally
    open fun onSetAlpha(alpha: Number): Boolean = definedExternally
    open fun _invalidateRect(l: Any, t: Any, r: Any, b: Any): Unit = definedExternally
    open fun _invalidateCache(invalidateCache: Any? = definedExternally /* null */): Unit = definedExternally
    open fun invalidate(): Any = definedExternally
    open fun invalidate(invalidateCache: Boolean): Any = definedExternally
    open fun invalidate(dirty: Rect): Any = definedExternally
    open fun invalidate(l: Number, t: Number, r: Number, b: Number): Any = definedExternally
    open fun invalidateViewProperty(invalidateParent: Boolean, forceRedraw: Boolean): Unit = definedExternally
    open fun invalidateParentCaches(): Unit = definedExternally
    open fun invalidateParentIfNeeded(): Unit = definedExternally
    open fun postInvalidate(l: Number? = definedExternally /* null */, t: Number? = definedExternally /* null */, r: Number? = definedExternally /* null */, b: Number? = definedExternally /* null */): Unit = definedExternally
    open fun postInvalidateDelayed(delayMilliseconds: Number, left: Number? = definedExternally /* null */, top: Number? = definedExternally /* null */, right: Number? = definedExternally /* null */, bottom: Number? = definedExternally /* null */): Unit = definedExternally
    open fun postInvalidateOnAnimation(left: Number? = definedExternally /* null */, top: Number? = definedExternally /* null */, right: Number? = definedExternally /* null */, bottom: Number? = definedExternally /* null */): Unit = definedExternally
    open fun skipInvalidate(): Unit = definedExternally
    open fun isOpaque(): Boolean = definedExternally
    open fun computeOpaqueFlags(): Unit = definedExternally
    open fun setLayerType(layerType: Number): Unit = definedExternally
    open fun getLayerType(): Number = definedExternally
    open fun setClipBounds(clipBounds: Rect): Unit = definedExternally
    open fun getClipBounds(): Rect = definedExternally
    open fun setCornerRadius(radiusTopLeft: Number, radiusTopRight: Number? = definedExternally /* null */, radiusBottomRight: Number? = definedExternally /* null */, radiusBottomLeft: Number? = definedExternally /* null */): Unit = definedExternally
    open fun setCornerRadiusTopLeft(value: Number): Unit = definedExternally
    open fun getCornerRadiusTopLeft(): Number = definedExternally
    open fun setCornerRadiusTopRight(value: Number): Unit = definedExternally
    open fun getCornerRadiusTopRight(): Number = definedExternally
    open fun setCornerRadiusBottomRight(value: Number): Unit = definedExternally
    open fun getCornerRadiusBottomRight(): Number = definedExternally
    open fun setCornerRadiusBottomLeft(value: Number): Unit = definedExternally
    open fun getCornerRadiusBottomLeft(): Number = definedExternally
    open fun setShadowView(radius: Number, dx: Number, dy: Number, color: Number): Unit = definedExternally
    open fun getDrawingTime(): Number = definedExternally
    open fun drawFromParent(canvas: Canvas, parent: ViewGroup, drawingTime: Number): Boolean = definedExternally
    open fun drawShadow(canvas: Any): Unit = definedExternally
    open fun draw(canvas: Canvas): Unit = definedExternally
    open fun onDraw(canvas: Canvas): Unit = definedExternally
    open fun dispatchDraw(canvas: Canvas): Unit = definedExternally
    open fun drawAnimation(parent: Any, drawingTime: Any, a: Any, scalingRequired: Any? = definedExternally /* null */): Unit = definedExternally
    open fun onDrawScrollBars(canvas: Canvas): Unit = definedExternally
    open fun isVerticalScrollBarHidden(): Boolean = definedExternally
    open fun onDrawHorizontalScrollBar(canvas: Canvas, scrollBar: Drawable, l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
    open fun onDrawVerticalScrollBar(canvas: Canvas, scrollBar: Drawable, l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
    open fun isHardwareAccelerated(): Boolean = definedExternally
    open fun setDrawingCacheEnabled(enabled: Boolean): Unit = definedExternally
    open fun isDrawingCacheEnabled(): Boolean = definedExternally
    open fun getDrawingCache(autoScale: Boolean? = definedExternally /* null */): Canvas = definedExternally
    open fun setDrawingCacheBackgroundColor(color: Number): Unit = definedExternally
    open fun getDrawingCacheBackgroundColor(): Number = definedExternally
    open fun destroyDrawingCache(): Unit = definedExternally
    open fun buildDrawingCache(autoScale: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun setWillNotDraw(willNotDraw: Boolean): Unit = definedExternally
    open fun willNotDraw(): Boolean = definedExternally
    open fun setWillNotCacheDrawing(willNotCacheDrawing: Boolean): Unit = definedExternally
    open fun willNotCacheDrawing(): Boolean = definedExternally
    override fun drawableSizeChange(who: Drawable): Unit = definedExternally
    override fun invalidateDrawable(drawable: Drawable): Unit = definedExternally
    override fun scheduleDrawable(who: Drawable, what: Runnable, `when`: Number): Unit = definedExternally
    override fun unscheduleDrawable(who: Drawable, what: Runnable): Unit = definedExternally
    open fun verifyDrawable(who: Drawable): Boolean = definedExternally
    open fun drawableStateChanged(): Unit = definedExternally
    open fun resolveDrawables(): Unit = definedExternally
    open fun refreshDrawableState(): Unit = definedExternally
    open fun getDrawableState(): Array<Number> = definedExternally
    open fun onCreateDrawableState(extraSpace: Number): Array<Number> = definedExternally
    open fun jumpDrawablesToCurrentState(): Unit = definedExternally
    open fun setBackgroundColor(color: Number): Unit = definedExternally
    open fun setBackground(background: Drawable): Unit = definedExternally
    open fun getBackground(): Drawable = definedExternally
    open fun setBackgroundDrawable(background: Drawable): Unit = definedExternally
    open fun computeHorizontalScrollRange(): Number = definedExternally
    open fun computeHorizontalScrollOffset(): Number = definedExternally
    open fun computeHorizontalScrollExtent(): Number = definedExternally
    open fun computeVerticalScrollRange(): Number = definedExternally
    open fun computeVerticalScrollOffset(): Number = definedExternally
    open fun computeVerticalScrollExtent(): Number = definedExternally
    open fun canScrollHorizontally(direction: Number): Boolean = definedExternally
    open fun canScrollVertically(direction: Number): Boolean = definedExternally
    open fun overScrollBy(deltaX: Number, deltaY: Number, scrollX: Number, scrollY: Number, scrollRangeX: Number, scrollRangeY: Number, maxOverScrollX: Number, maxOverScrollY: Number, isTouchEvent: Boolean): Boolean = definedExternally
    open fun onOverScrolled(scrollX: Number, scrollY: Number, clampedX: Boolean, clampedY: Boolean): Unit = definedExternally
    open fun getOverScrollMode(): Number = definedExternally
    open fun setOverScrollMode(overScrollMode: Number): Unit = definedExternally
    open fun getVerticalScrollFactor(): Number = definedExternally
    open fun getHorizontalScrollFactor(): Number = definedExternally
    open fun computeScroll(): Unit = definedExternally
    open fun scrollTo(x: Number, y: Number): Unit = definedExternally
    open fun scrollBy(x: Number, y: Number): Unit = definedExternally
    open fun initialAwakenScrollBars(): Unit = definedExternally
    open fun awakenScrollBars(startDelay: Number? = definedExternally /* null */, invalidate: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun getVerticalFadingEdgeLength(): Number = definedExternally
    open fun setVerticalFadingEdgeEnabled(enable: Boolean): Unit = definedExternally
    open fun setHorizontalFadingEdgeEnabled(enable: Boolean): Unit = definedExternally
    open fun setFadingEdgeLength(length: Number): Unit = definedExternally
    open fun getHorizontalFadingEdgeLength(): Number = definedExternally
    open fun getVerticalScrollbarWidth(): Number = definedExternally
    open fun getHorizontalScrollbarHeight(): Number = definedExternally
    open fun initializeScrollbars(a: TypedArray? = definedExternally /* null */): Unit = definedExternally
    open fun initScrollCache(): Unit = definedExternally
    open fun getScrollCache(): Unit = definedExternally
    open fun isHorizontalScrollBarEnabled(): Boolean = definedExternally
    open fun setHorizontalScrollBarEnabled(horizontalScrollBarEnabled: Boolean): Unit = definedExternally
    open fun isVerticalScrollBarEnabled(): Boolean = definedExternally
    open fun setVerticalScrollBarEnabled(verticalScrollBarEnabled: Boolean): Unit = definedExternally
    open fun setScrollbarFadingEnabled(fadeScrollbars: Boolean): Unit = definedExternally
    open fun setVerticalScrollbarPosition(position: Number): Unit = definedExternally
    open fun setHorizontalScrollbarPosition(position: Number): Unit = definedExternally
    open fun setScrollBarStyle(position: Number): Unit = definedExternally
    open fun getTopFadingEdgeStrength(): Number = definedExternally
    open fun getBottomFadingEdgeStrength(): Number = definedExternally
    open fun getLeftFadingEdgeStrength(): Number = definedExternally
    open fun getRightFadingEdgeStrength(): Number = definedExternally
    open fun isScrollbarFadingEnabled(): Boolean = definedExternally
    open fun getScrollBarDefaultDelayBeforeFade(): Number = definedExternally
    open fun setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade: Number): Unit = definedExternally
    open fun getScrollBarFadeDuration(): Number = definedExternally
    open fun setScrollBarFadeDuration(scrollBarFadeDuration: Number): Unit = definedExternally
    open fun getScrollBarSize(): Number = definedExternally
    open fun setScrollBarSize(scrollBarSize: Number): Unit = definedExternally
    open fun hasOpaqueScrollbars(): Boolean = definedExternally
    open fun assignParent(parent: ViewParent): Unit = definedExternally
    open fun onFinishInflate(): Unit = definedExternally
    open fun dispatchStartTemporaryDetach(): Unit = definedExternally
    open fun onStartTemporaryDetach(): Unit = definedExternally
    open fun dispatchFinishTemporaryDetach(): Unit = definedExternally
    open fun onFinishTemporaryDetach(): Unit = definedExternally
    open fun dispatchWindowFocusChanged(hasFocus: Boolean): Unit = definedExternally
    open fun onWindowFocusChanged(hasWindowFocus: Boolean): Unit = definedExternally
    open fun hasWindowFocus(): Boolean = definedExternally
    open fun getWindowAttachCount(): Number = definedExternally
    open fun isAttachedToWindow(): Boolean = definedExternally
    open fun dispatchAttachedToWindow(info: View.AttachInfo, visibility: Number): Unit = definedExternally
    open fun onAttachedToWindow(): Unit = definedExternally
    open fun dispatchDetachedFromWindow(): Unit = definedExternally
    open fun onDetachedFromWindow(): Unit = definedExternally
    open fun cleanupDraw(): Unit = definedExternally
    open fun isInEditMode(): Boolean = definedExternally
    open fun debug(depth: Number? = definedExternally /* null */): Unit = definedExternally
    override fun toString(): String = definedExternally
    open fun getRootView(): View = definedExternally
    open fun findViewById(id: String): View = definedExternally
    open fun findViewWithTag(tag: Any): View = definedExternally
    open fun findViewTraversal(id: String): View = definedExternally
    open fun findViewWithTagTraversal(tag: Any): View = definedExternally
    open fun findViewByPredicate(predicate: View.Predicate<View>): View = definedExternally
    open fun findViewByPredicateTraversal(predicate: View.Predicate<View>, childToSkip: View): View = definedExternally
    open fun findViewByPredicateInsideOut(start: View, predicate: View.Predicate<View>): View = definedExternally
    open fun setId(id: String): Unit = definedExternally
    open fun getId(): String = definedExternally
    open fun getTag(): Any = definedExternally
    open fun setTag(tag: Any): Unit = definedExternally
    open fun setIsRootNamespace(isRoot: Boolean): Unit = definedExternally
    open fun isRootNamespace(): Boolean = definedExternally
    open fun getResources(): Resources = definedExternally
    open var bindElement: HTMLElement = definedExternally
    open var _AttrObserver: Any = definedExternally
    open var _stateAttrList: Any = definedExternally
    open var _attrBinder: AttrBinder = definedExternally
    open fun initBindElement(bindElement: HTMLElement? = definedExternally /* null */): Unit = definedExternally
    open fun initBindAttr(): Unit = definedExternally
    open fun createClassAttrBinder(): AttrBinder.ClassBinderMap = definedExternally
    open var _syncToElementLock: Any = definedExternally
    open var _syncToElementImmediatelyLock: Any = definedExternally
    open var _syncToElementRun: Any = definedExternally
    open fun requestSyncBoundToElement(immediately: Boolean? = definedExternally /* null */): Unit = definedExternally
    open var _lastSyncLeft: Any = definedExternally
    open var _lastSyncTop: Any = definedExternally
    open var _lastSyncWidth: Any = definedExternally
    open var _lastSyncHeight: Any = definedExternally
    open var _lastSyncScrollX: Any = definedExternally
    open var _lastSyncScrollY: Any = definedExternally
    open fun _syncBoundAndScrollToElement(): Unit = definedExternally
    open var _lastSyncTransform: Any = definedExternally
    open fun _syncMatrixToElement(): Unit = definedExternally
    open fun syncVisibleToElement(): Unit = definedExternally
    open fun dependOnDebugLayout(): Boolean = definedExternally
    open fun _initAttrObserver(): Unit = definedExternally
    open fun _fireStateChangeToAttribute(oldState: Any, newState: Any): Unit = definedExternally
    open fun _getBinderAttrValue(key: Any): Unit = definedExternally
    open fun onBindElementAttributeChanged(attributeName: Any, oldVal: Any, newVal: Any): Unit = definedExternally
    open fun tagName(): String = definedExternally

    companion object {
        var DBG: Boolean = definedExternally
        var VIEW_LOG_TAG: String = definedExternally
        var PFLAG_WANTS_FOCUS: Number = definedExternally
        var PFLAG_FOCUSED: Number = definedExternally
        var PFLAG_SELECTED: Number = definedExternally
        var PFLAG_IS_ROOT_NAMESPACE: Number = definedExternally
        var PFLAG_HAS_BOUNDS: Number = definedExternally
        var PFLAG_DRAWN: Number = definedExternally
        var PFLAG_DRAW_ANIMATION: Number = definedExternally
        var PFLAG_SKIP_DRAW: Number = definedExternally
        var PFLAG_ONLY_DRAWS_BACKGROUND: Number = definedExternally
        var PFLAG_REQUEST_TRANSPARENT_REGIONS: Number = definedExternally
        var PFLAG_DRAWABLE_STATE_DIRTY: Number = definedExternally
        var PFLAG_MEASURED_DIMENSION_SET: Number = definedExternally
        var PFLAG_FORCE_LAYOUT: Number = definedExternally
        var PFLAG_LAYOUT_REQUIRED: Number = definedExternally
        var PFLAG_PRESSED: Number = definedExternally
        var PFLAG_DRAWING_CACHE_VALID: Number = definedExternally
        var PFLAG_ANIMATION_STARTED: Number = definedExternally
        var PFLAG_ALPHA_SET: Number = definedExternally
        var PFLAG_SCROLL_CONTAINER: Number = definedExternally
        var PFLAG_SCROLL_CONTAINER_ADDED: Number = definedExternally
        var PFLAG_DIRTY: Number = definedExternally
        var PFLAG_DIRTY_OPAQUE: Number = definedExternally
        var PFLAG_DIRTY_MASK: Number = definedExternally
        var PFLAG_OPAQUE_BACKGROUND: Number = definedExternally
        var PFLAG_OPAQUE_SCROLLBARS: Number = definedExternally
        var PFLAG_OPAQUE_MASK: Number = definedExternally
        var PFLAG_PREPRESSED: Number = definedExternally
        var PFLAG_CANCEL_NEXT_UP_EVENT: Number = definedExternally
        var PFLAG_AWAKEN_SCROLL_BARS_ON_ATTACH: Number = definedExternally
        var PFLAG_HOVERED: Number = definedExternally
        var PFLAG_PIVOT_EXPLICITLY_SET: Number = definedExternally
        var PFLAG_ACTIVATED: Number = definedExternally
        var PFLAG_INVALIDATED: Number = definedExternally
        var PFLAG2_VIEW_QUICK_REJECTED: Number = definedExternally
        var PFLAG2_HAS_TRANSIENT_STATE: Number = definedExternally
        var PFLAG3_VIEW_IS_ANIMATING_TRANSFORM: Number = definedExternally
        var PFLAG3_VIEW_IS_ANIMATING_ALPHA: Number = definedExternally
        var PFLAG3_IS_LAID_OUT: Number = definedExternally
        var PFLAG3_MEASURE_NEEDED_BEFORE_LAYOUT: Number = definedExternally
        var PFLAG3_CALLED_SUPER: Number = definedExternally
        var NOT_FOCUSABLE: Any = definedExternally
        var FOCUSABLE: Any = definedExternally
        var FOCUSABLE_MASK: Any = definedExternally
        var NO_ID: Any = definedExternally
        var OVER_SCROLL_ALWAYS: Number = definedExternally
        var OVER_SCROLL_IF_CONTENT_SCROLLS: Number = definedExternally
        var OVER_SCROLL_NEVER: Number = definedExternally
        var MEASURED_SIZE_MASK: Number = definedExternally
        var MEASURED_STATE_MASK: Number = definedExternally
        var MEASURED_HEIGHT_STATE_SHIFT: Number = definedExternally
        var MEASURED_STATE_TOO_SMALL: Number = definedExternally
        var VISIBILITY_MASK: Number = definedExternally
        var VISIBLE: Number = definedExternally
        var INVISIBLE: Number = definedExternally
        var GONE: Number = definedExternally
        var ENABLED: Number = definedExternally
        var DISABLED: Number = definedExternally
        var ENABLED_MASK: Number = definedExternally
        var WILL_NOT_DRAW: Number = definedExternally
        var DRAW_MASK: Number = definedExternally
        var SCROLLBARS_NONE: Number = definedExternally
        var SCROLLBARS_HORIZONTAL: Number = definedExternally
        var SCROLLBARS_VERTICAL: Number = definedExternally
        var SCROLLBARS_MASK: Number = definedExternally
        var FOCUSABLES_ALL: Number = definedExternally
        var FOCUSABLES_TOUCH_MODE: Number = definedExternally
        var FOCUS_BACKWARD: Number = definedExternally
        var FOCUS_FORWARD: Number = definedExternally
        var FOCUS_LEFT: Number = definedExternally
        var FOCUS_UP: Number = definedExternally
        var FOCUS_RIGHT: Number = definedExternally
        var FOCUS_DOWN: Number = definedExternally
        var EMPTY_STATE_SET: Array<Number> = definedExternally
        var ENABLED_STATE_SET: Array<Number> = definedExternally
        var FOCUSED_STATE_SET: Array<Number> = definedExternally
        var SELECTED_STATE_SET: Array<Number> = definedExternally
        var PRESSED_STATE_SET: Array<Number> = definedExternally
        var WINDOW_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var ENABLED_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var ENABLED_SELECTED_STATE_SET: Array<Number> = definedExternally
        var ENABLED_WINDOW_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var FOCUSED_SELECTED_STATE_SET: Array<Number> = definedExternally
        var FOCUSED_WINDOW_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var SELECTED_WINDOW_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var ENABLED_FOCUSED_SELECTED_STATE_SET: Array<Number> = definedExternally
        var ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var PRESSED_WINDOW_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var PRESSED_SELECTED_STATE_SET: Array<Number> = definedExternally
        var PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var PRESSED_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var PRESSED_FOCUSED_SELECTED_STATE_SET: Array<Number> = definedExternally
        var PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var PRESSED_ENABLED_STATE_SET: Array<Number> = definedExternally
        var PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var PRESSED_ENABLED_SELECTED_STATE_SET: Array<Number> = definedExternally
        var PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var PRESSED_ENABLED_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET: Array<Number> = definedExternally
        var PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET: Array<Number> = definedExternally
        var VIEW_STATE_SETS: Array<Array<Number>> = definedExternally
        var VIEW_STATE_WINDOW_FOCUSED: Number = definedExternally
        var VIEW_STATE_SELECTED: Number = definedExternally
        var VIEW_STATE_FOCUSED: Number = definedExternally
        var VIEW_STATE_ENABLED: Number = definedExternally
        var VIEW_STATE_PRESSED: Number = definedExternally
        var VIEW_STATE_ACTIVATED: Number = definedExternally
        var VIEW_STATE_HOVERED: Number = definedExternally
        var VIEW_STATE_CHECKED: Number = definedExternally
        var VIEW_STATE_MULTILINE: Number = definedExternally
        var VIEW_STATE_EXPANDED: Number = definedExternally
        var VIEW_STATE_EMPTY: Number = definedExternally
        var VIEW_STATE_LAST: Number = definedExternally
        var VIEW_STATE_IDS: Array<Number> = definedExternally
        var _static: Any = definedExternally
        var CLICKABLE: Number = definedExternally
        var DRAWING_CACHE_ENABLED: Number = definedExternally
        var WILL_NOT_CACHE_DRAWING: Number = definedExternally
        var FOCUSABLE_IN_TOUCH_MODE: Any = definedExternally
        var LONG_CLICKABLE: Number = definedExternally
        var DUPLICATE_PARENT_STATE: Number = definedExternally
        var LAYER_TYPE_NONE: Number = definedExternally
        var LAYER_TYPE_SOFTWARE: Number = definedExternally
        var LAYOUT_DIRECTION_LTR: Number = definedExternally
        var LAYOUT_DIRECTION_RTL: Number = definedExternally
        var LAYOUT_DIRECTION_INHERIT: Number = definedExternally
        var LAYOUT_DIRECTION_LOCALE: Number = definedExternally
        var TEXT_DIRECTION_INHERIT: Number = definedExternally
        var TEXT_DIRECTION_FIRST_STRONG: Number = definedExternally
        var TEXT_DIRECTION_ANY_RTL: Number = definedExternally
        var TEXT_DIRECTION_LTR: Number = definedExternally
        var TEXT_DIRECTION_RTL: Number = definedExternally
        var TEXT_DIRECTION_LOCALE: Number = definedExternally
        var TEXT_DIRECTION_DEFAULT: Any = definedExternally
        var TEXT_DIRECTION_RESOLVED_DEFAULT: Number = definedExternally
        var TEXT_ALIGNMENT_INHERIT: Number = definedExternally
        var TEXT_ALIGNMENT_GRAVITY: Number = definedExternally
        var TEXT_ALIGNMENT_TEXT_START: Number = definedExternally
        var TEXT_ALIGNMENT_TEXT_END: Number = definedExternally
        var TEXT_ALIGNMENT_CENTER: Number = definedExternally
        var TEXT_ALIGNMENT_VIEW_START: Number = definedExternally
        var TEXT_ALIGNMENT_VIEW_END: Number = definedExternally
        var TEXT_ALIGNMENT_DEFAULT: Any = definedExternally
        var TEXT_ALIGNMENT_RESOLVED_DEFAULT: Number = definedExternally
        fun combineMeasuredStates(curState: Any, newState: Any): Number = definedExternally
        fun resolveSize(size: Any, measureSpec: Any): Number = definedExternally
        fun resolveSizeAndState(size: Any, measureSpec: Any, childMeasuredState: Any): Number = definedExternally
        fun getDefaultSize(size: Any, measureSpec: Any): Any = definedExternally
        fun mergeDrawableStates(baseState: Array<Number>, additionalState: Array<Number>): Array<Number> = definedExternally
        fun inflate(context: Context, xml: HTMLElement, root: ViewGroup? = definedExternally /* null */): View = definedExternally
        fun inflate(context: Context, xml: String, root: ViewGroup? = definedExternally /* null */): View = definedExternally
        var ViewClassAttrBinderClazzMap: Any = definedExternally
        var AndroidViewProperty: String = definedExternally
        fun _AttrObserverCallBack(arr: Any, observer: Any): Unit = definedExternally
        var TempMatrixValue: Any = definedExternally
    }
}
