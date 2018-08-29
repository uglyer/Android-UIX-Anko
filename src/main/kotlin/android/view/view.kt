@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.view")

package android.view

import android.content.*
import android.graphics.*
import android.graphics.drawable.*
import android.os.*
import android.util.*
import android.view.animation.*
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

external open class Gravity {
    companion object {
        var NO_GRAVITY: Number = definedExternally
        var AXIS_SPECIFIED: Number = definedExternally
        var AXIS_PULL_BEFORE: Number = definedExternally
        var AXIS_PULL_AFTER: Number = definedExternally
        var AXIS_CLIP: Number = definedExternally
        var AXIS_X_SHIFT: Number = definedExternally
        var AXIS_Y_SHIFT: Number = definedExternally
        var TOP: Number = definedExternally
        var BOTTOM: Number = definedExternally
        var LEFT: Number = definedExternally
        var RIGHT: Number = definedExternally
        var START: Number = definedExternally
        var END: Number = definedExternally
        var CENTER_VERTICAL: Number = definedExternally
        var FILL_VERTICAL: Number = definedExternally
        var CENTER_HORIZONTAL: Number = definedExternally
        var FILL_HORIZONTAL: Number = definedExternally
        var CENTER: Number = definedExternally
        var FILL: Number = definedExternally
        var CLIP_VERTICAL: Number = definedExternally
        var CLIP_HORIZONTAL: Number = definedExternally
        var HORIZONTAL_GRAVITY_MASK: Number = definedExternally
        var VERTICAL_GRAVITY_MASK: Number = definedExternally
        var RELATIVE_HORIZONTAL_GRAVITY_MASK: Number = definedExternally
        var DISPLAY_CLIP_VERTICAL: Number = definedExternally
        var DISPLAY_CLIP_HORIZONTAL: Number = definedExternally
        fun apply(gravity: Number, w: Number, h: Number, container: Rect, outRect: Rect, layoutDirection: Number? = definedExternally /* null */): Unit = definedExternally
        fun getAbsoluteGravity(gravity: Number, layoutDirection: Number? = definedExternally /* null */): Number = definedExternally
        fun parseGravity(gravityStr: String, defaultGravity: Number? = definedExternally /* null */): Number = definedExternally
    }
}

external open class ViewTreeObserver {
    interface OnGlobalFocusChangeListener {
        fun onGlobalFocusChanged(oldFocus: android.view.View, newFocus: android.view.View): Any
    }

    interface OnGlobalLayoutListener {
        fun onGlobalLayout(): Any
    }

    interface OnPreDrawListener {
        fun onPreDraw(): Boolean
    }

    interface OnDrawListener {
        fun onDraw(): Any
    }

    interface OnScrollChangedListener {
        fun onScrollChanged(): Any
    }

    interface OnTouchModeChangeListener {
        fun onTouchModeChanged(isInTouchMode: Boolean): Any
    }

    open var mOnTouchModeChangeListeners: Any = definedExternally
    open var mOnGlobalLayoutListeners: Any = definedExternally
    open var mOnScrollChangedListeners: Any = definedExternally
    open var mOnPreDrawListeners: Any = definedExternally
    open var mOnDrawListeners: Any = definedExternally
    open var mAlive: Any = definedExternally
    open fun addOnGlobalLayoutListener(listener: ViewTreeObserver.OnGlobalLayoutListener): Unit = definedExternally
    open fun removeGlobalOnLayoutListener(victim: ViewTreeObserver.OnGlobalLayoutListener): Unit = definedExternally
    open fun removeOnGlobalLayoutListener(victim: ViewTreeObserver.OnGlobalLayoutListener): Unit = definedExternally
    open fun dispatchOnGlobalLayout(): Unit = definedExternally
    open fun addOnPreDrawListener(listener: ViewTreeObserver.OnPreDrawListener): Unit = definedExternally
    open fun removeOnPreDrawListener(victim: ViewTreeObserver.OnPreDrawListener): Unit = definedExternally
    open fun dispatchOnPreDraw(): Boolean = definedExternally
    open fun addOnTouchModeChangeListener(listener: ViewTreeObserver.OnTouchModeChangeListener): Unit = definedExternally
    open fun removeOnTouchModeChangeListener(victim: ViewTreeObserver.OnTouchModeChangeListener): Unit = definedExternally
    open fun dispatchOnTouchModeChanged(inTouchMode: Boolean): Unit = definedExternally
    open fun addOnScrollChangedListener(listener: ViewTreeObserver.OnScrollChangedListener): Unit = definedExternally
    open fun removeOnScrollChangedListener(victim: ViewTreeObserver.OnScrollChangedListener): Unit = definedExternally
    open fun dispatchOnScrollChanged(): Unit = definedExternally
    open fun addOnDrawListener(listener: ViewTreeObserver.OnDrawListener): Unit = definedExternally
    open fun removeOnDrawListener(victim: ViewTreeObserver.OnDrawListener): Unit = definedExternally
    open fun dispatchOnDraw(): Unit = definedExternally
    open fun merge(observer: ViewTreeObserver): Unit = definedExternally
    open fun checkIsAlive(): Unit = definedExternally
    open fun isAlive(): Boolean = definedExternally
    open fun kill(): Unit = definedExternally
}

external open class LayoutInflater(context: Context) {
    open var mContext: Context = definedExternally
    open fun getContext(): Context = definedExternally
    open fun inflate(layout: HTMLElement, viewParent: ViewGroup? = definedExternally /* null */, attachToRoot: Boolean? = definedExternally /* null */): View = definedExternally
    open fun inflate(layout: String, viewParent: ViewGroup? = definedExternally /* null */, attachToRoot: Boolean? = definedExternally /* null */): View = definedExternally

    companion object {
        fun from(context: Context): LayoutInflater = definedExternally
    }
}

external open class ViewConfiguration {
    open var density: Any = definedExternally
    open var sizeAndDensity: Any = definedExternally
    open var mEdgeSlop: Number = definedExternally
    open var mFadingEdgeLength: Number = definedExternally
    open var mMinimumFlingVelocity: Number = definedExternally
    open var mMaximumFlingVelocity: Number = definedExternally
    open var mScrollbarSize: Number = definedExternally
    open var mTouchSlop: Number = definedExternally
    open var mDoubleTapTouchSlop: Number = definedExternally
    open var mPagingTouchSlop: Number = definedExternally
    open var mDoubleTapSlop: Number = definedExternally
    open var mWindowTouchSlop: Number = definedExternally
    open var mOverscrollDistance: Number = definedExternally
    open var mOverflingDistance: Number = definedExternally
    open var mMaximumDrawingCacheSize: Number = definedExternally
    open fun getScaledScrollBarSize(): Number = definedExternally
    open fun getScaledFadingEdgeLength(): Number = definedExternally
    open fun getScaledEdgeSlop(): Number = definedExternally
    open fun getScaledTouchSlop(): Number = definedExternally
    open fun getScaledDoubleTapTouchSlop(): Number = definedExternally
    open fun getScaledPagingTouchSlop(): Number = definedExternally
    open fun getScaledDoubleTapSlop(): Number = definedExternally
    open fun getScaledWindowTouchSlop(): Number = definedExternally
    open fun getScaledMinimumFlingVelocity(): Number = definedExternally
    open fun getScaledMaximumFlingVelocity(): Number = definedExternally
    open fun getScaledMaximumDrawingCacheSize(): Number = definedExternally
    open fun getScaledOverscrollDistance(): Number = definedExternally
    open fun getScaledOverflingDistance(): Number = definedExternally

    companion object {
        var SCROLL_BAR_SIZE: Any = definedExternally
        var SCROLL_BAR_FADE_DURATION: Any = definedExternally
        var SCROLL_BAR_DEFAULT_DELAY: Any = definedExternally
        var FADING_EDGE_LENGTH: Any = definedExternally
        var PRESSED_STATE_DURATION: Any = definedExternally
        var DEFAULT_LONG_PRESS_TIMEOUT: Any = definedExternally
        var KEY_REPEAT_DELAY: Any = definedExternally
        var GLOBAL_ACTIONS_KEY_TIMEOUT: Any = definedExternally
        var TAP_TIMEOUT: Any = definedExternally
        var JUMP_TAP_TIMEOUT: Any = definedExternally
        var DOUBLE_TAP_TIMEOUT: Any = definedExternally
        var DOUBLE_TAP_MIN_TIME: Any = definedExternally
        var HOVER_TAP_TIMEOUT: Any = definedExternally
        var HOVER_TAP_SLOP: Any = definedExternally
        var ZOOM_CONTROLS_TIMEOUT: Any = definedExternally
        var EDGE_SLOP: Number = definedExternally
        var TOUCH_SLOP: Any = definedExternally
        var DOUBLE_TAP_TOUCH_SLOP: Any = definedExternally
        var PAGING_TOUCH_SLOP: Any = definedExternally
        var DOUBLE_TAP_SLOP: Any = definedExternally
        var WINDOW_TOUCH_SLOP: Any = definedExternally
        var MINIMUM_FLING_VELOCITY: Any = definedExternally
        var MAXIMUM_FLING_VELOCITY: Any = definedExternally
        var SCROLL_FRICTION: Any = definedExternally
        var OVERSCROLL_DISTANCE: Any = definedExternally
        var OVERFLING_DISTANCE: Any = definedExternally
        var instance: ViewConfiguration = definedExternally
        fun get(arg: Any? = definedExternally /* null */): ViewConfiguration = definedExternally
        fun getScrollBarFadeDuration(): Number = definedExternally
        fun getScrollDefaultDelay(): Number = definedExternally
        fun getPressedStateDuration(): Number = definedExternally
        fun getLongPressTimeout(): Number = definedExternally
        fun getKeyRepeatDelay(): Number = definedExternally
        fun getTapTimeout(): Number = definedExternally
        fun getJumpTapTimeout(): Number = definedExternally
        fun getDoubleTapTimeout(): Number = definedExternally
        fun getDoubleTapMinTime(): Number = definedExternally
        fun getScrollFriction(): Number = definedExternally
    }
}

external open class MotionEvent {
    open var mAction: Number = definedExternally
    open var mEdgeFlags: Number = definedExternally
    open var mDownTime: Number = definedExternally
    open var mEventTime: Number = definedExternally
    open var mActivePointerId: Number = definedExternally
    open var mTouchingPointers: Any = definedExternally
    open var mXOffset: Number = definedExternally
    open var mYOffset: Number = definedExternally
    open var _activeTouch: Any = definedExternally
    open var _axisValues: Any = definedExternally
    open fun initWithTouch(event: Any, baseAction: Number, windowBound: Rect? = definedExternally /* null */): Unit = definedExternally
    open fun initWithMouseWheel(e: WheelEvent): Unit = definedExternally
    open fun recycle(): Unit = definedExternally
    open fun getAction(): Number = definedExternally
    open fun getActionMasked(): Number = definedExternally
    open fun getActionIndex(): Number = definedExternally
    open fun getDownTime(): Number = definedExternally
    open fun getEventTime(): Number = definedExternally
    open fun getX(pointerIndex: Number? = definedExternally /* null */): Number = definedExternally
    open fun getY(pointerIndex: Number? = definedExternally /* null */): Number = definedExternally
    open fun getPointerCount(): Number = definedExternally
    open fun getPointerId(pointerIndex: Number): Number = definedExternally
    open fun findPointerIndex(pointerId: Number): Number = definedExternally
    open fun getRawX(): Number = definedExternally
    open fun getRawY(): Number = definedExternally
    open fun getHistorySize(id: Number? = definedExternally /* null */): Number = definedExternally
    open fun getHistoricalX(pointerIndex: Number, pos: Number): Number = definedExternally
    open fun getHistoricalY(pointerIndex: Number, pos: Number): Number = definedExternally
    open fun getHistoricalEventTime(pos: Number): Number = definedExternally
    open fun getHistoricalEventTime(pointerIndex: Number, pos: Number): Number = definedExternally
    open fun getTouchMajor(pointerIndex: Number? = definedExternally /* null */): Number = definedExternally
    open fun getHistoricalTouchMajor(pointerIndex: Number? = definedExternally /* null */, pos: Number? = definedExternally /* null */): Number = definedExternally
    open fun getEdgeFlags(): Number = definedExternally
    open fun setEdgeFlags(flags: Number): Unit = definedExternally
    open fun setAction(action: Number): Unit = definedExternally
    open fun isTouchEvent(): Boolean = definedExternally
    open fun isPointerEvent(): Boolean = definedExternally
    open fun offsetLocation(deltaX: Number, deltaY: Number): Unit = definedExternally
    open fun setLocation(x: Number, y: Number): Unit = definedExternally
    open fun getPointerIdBits(): Number = definedExternally
    open fun split(idBits: Number): MotionEvent = definedExternally
    open fun getAxisValue(axis: Number): Number = definedExternally
    override fun toString(): String = definedExternally

    companion object {
        var INVALID_POINTER_ID: Number = definedExternally
        var ACTION_MASK: Number = definedExternally
        var ACTION_DOWN: Number = definedExternally
        var ACTION_UP: Number = definedExternally
        var ACTION_MOVE: Number = definedExternally
        var ACTION_CANCEL: Number = definedExternally
        var ACTION_OUTSIDE: Number = definedExternally
        var ACTION_POINTER_DOWN: Number = definedExternally
        var ACTION_POINTER_UP: Number = definedExternally
        var ACTION_HOVER_MOVE: Number = definedExternally
        var ACTION_SCROLL: Number = definedExternally
        var ACTION_HOVER_ENTER: Number = definedExternally
        var ACTION_HOVER_EXIT: Number = definedExternally
        var EDGE_TOP: Number = definedExternally
        var EDGE_BOTTOM: Number = definedExternally
        var EDGE_LEFT: Number = definedExternally
        var EDGE_RIGHT: Number = definedExternally
        var ACTION_POINTER_INDEX_MASK: Number = definedExternally
        var ACTION_POINTER_INDEX_SHIFT: Number = definedExternally
        var AXIS_VSCROLL: Number = definedExternally
        var AXIS_HSCROLL: Number = definedExternally
        var HistoryMaxSize: Number = definedExternally
        var TouchMoveRecord: Any = definedExternally
        fun obtainWithTouchEvent(e: Any, action: Number): MotionEvent = definedExternally
        fun obtain(event: MotionEvent): MotionEvent = definedExternally
        fun obtainWithAction(downTime: Number, eventTime: Number, action: Number, x: Number, y: Number, metaState: Number? = definedExternally /* null */): MotionEvent = definedExternally
        var IdIndexCache: Any = definedExternally
    }
}

external open class TouchDelegate(bounds: Rect, delegateView: View) {
    open var mDelegateView: Any = definedExternally
    open var mBounds: Any = definedExternally
    open var mSlopBounds: Any = definedExternally
    open var mDelegateTargeted: Any = definedExternally
    open var mSlop: Any = definedExternally
    open fun onTouchEvent(event: MotionEvent): Boolean = definedExternally
}

external interface `T$1` {
    var noMeta: Any
    var shift: Any
    var ctrl: Any
    var alt: Any
}

external open class KeyEvent {
    interface Callback {
        fun onKeyDown(keyCode: Number, event: KeyEvent): Boolean
        fun onKeyLongPress(keyCode: Number, event: KeyEvent): Boolean
        fun onKeyUp(keyCode: Number, event: KeyEvent): Boolean
    }

    open class DispatcherState {
        open var mDownKeyCode: Number = definedExternally
        open var mDownTarget: Any = definedExternally
        open var mActiveLongPresses: SparseArray<Number> = definedExternally
        open fun reset(target: Any): Unit = definedExternally
        open fun startTracking(event: KeyEvent, target: Any): Unit = definedExternally
        open fun isTracking(event: KeyEvent): Boolean = definedExternally
        open fun performedLongPress(event: KeyEvent): Unit = definedExternally
        open fun handleUpEvent(event: KeyEvent): Unit = definedExternally
    }

    open var mFlags: Number = definedExternally
    open var mAction: Any = definedExternally
    open var mKeyCode: Any = definedExternally
    open var mDownTime: Any = definedExternally
    open var mEventTime: Any = definedExternally
    open var mAltKey: Any = definedExternally
    open var mShiftKey: Any = definedExternally
    open var mCtrlKey: Any = definedExternally
    open var mMetaKey: Any = definedExternally
    open var mIsTypingKey: Boolean = definedExternally
    open var _downingKeyEventMap: Any = definedExternally
    open fun initKeyEvent(keyEvent: KeyboardEvent, action: Number): Unit = definedExternally
    open fun isAltPressed(): Boolean = definedExternally
    open fun isShiftPressed(): Boolean = definedExternally
    open fun isCtrlPressed(): Boolean = definedExternally
    open fun isMetaPressed(): Boolean = definedExternally
    open fun getAction(): Number = definedExternally
    open fun startTracking(): Unit = definedExternally
    open fun isTracking(): Boolean = definedExternally
    open fun isLongPress(): Boolean = definedExternally
    open fun getKeyCode(): Number = definedExternally
    open fun getRepeatCount(): Number = definedExternally
    open fun getDownTime(): Number = definedExternally
    open fun getEventTime(): Number = definedExternally
    open fun dispatch(receiver: KeyEvent.Callback, state: KeyEvent.DispatcherState? = definedExternally /* null */, target: Any? = definedExternally /* null */): Boolean = definedExternally
    open fun hasNoModifiers(): Boolean = definedExternally
    open fun hasModifiers(modifiers: Number): Boolean = definedExternally
    open fun getMetaState(): Number = definedExternally
    override fun toString(): String = definedExternally
    open fun isCanceled(): Boolean = definedExternally

    companion object {
        var KEYCODE_DPAD_UP: Number = definedExternally
        var KEYCODE_DPAD_DOWN: Number = definedExternally
        var KEYCODE_DPAD_LEFT: Number = definedExternally
        var KEYCODE_DPAD_RIGHT: Number = definedExternally
        var KEYCODE_DPAD_CENTER: Number = definedExternally
        var KEYCODE_ENTER: Number = definedExternally
        var KEYCODE_TAB: Number = definedExternally
        var KEYCODE_SPACE: Number = definedExternally
        var KEYCODE_ESCAPE: Number = definedExternally
        var KEYCODE_Backspace: Number = definedExternally
        var KEYCODE_PAGE_UP: Number = definedExternally
        var KEYCODE_PAGE_DOWN: Number = definedExternally
        var KEYCODE_MOVE_HOME: Number = definedExternally
        var KEYCODE_MOVE_END: Number = definedExternally
        var KEYCODE_Digit0: Number = definedExternally
        var KEYCODE_Digit1: Number = definedExternally
        var KEYCODE_Digit2: Number = definedExternally
        var KEYCODE_Digit3: Number = definedExternally
        var KEYCODE_Digit4: Number = definedExternally
        var KEYCODE_Digit5: Number = definedExternally
        var KEYCODE_Digit6: Number = definedExternally
        var KEYCODE_Digit7: Number = definedExternally
        var KEYCODE_Digit8: Number = definedExternally
        var KEYCODE_Digit9: Number = definedExternally
        var KEYCODE_Key_a: Number = definedExternally
        var KEYCODE_Key_b: Number = definedExternally
        var KEYCODE_Key_c: Number = definedExternally
        var KEYCODE_Key_d: Number = definedExternally
        var KEYCODE_Key_e: Number = definedExternally
        var KEYCODE_Key_f: Number = definedExternally
        var KEYCODE_Key_g: Number = definedExternally
        var KEYCODE_Key_h: Number = definedExternally
        var KEYCODE_Key_i: Number = definedExternally
        var KEYCODE_Key_j: Number = definedExternally
        var KEYCODE_Key_k: Number = definedExternally
        var KEYCODE_Key_l: Number = definedExternally
        var KEYCODE_Key_m: Number = definedExternally
        var KEYCODE_Key_n: Number = definedExternally
        var KEYCODE_Key_o: Number = definedExternally
        var KEYCODE_Key_p: Number = definedExternally
        var KEYCODE_Key_q: Number = definedExternally
        var KEYCODE_Key_r: Number = definedExternally
        var KEYCODE_Key_s: Number = definedExternally
        var KEYCODE_Key_t: Number = definedExternally
        var KEYCODE_Key_u: Number = definedExternally
        var KEYCODE_Key_v: Number = definedExternally
        var KEYCODE_Key_w: Number = definedExternally
        var KEYCODE_Key_x: Number = definedExternally
        var KEYCODE_Key_y: Number = definedExternally
        var KEYCODE_Key_z: Number = definedExternally
        var KEYCODE_KeyA: Number = definedExternally
        var KEYCODE_KeyB: Number = definedExternally
        var KEYCODE_KeyC: Number = definedExternally
        var KEYCODE_KeyD: Number = definedExternally
        var KEYCODE_KeyE: Number = definedExternally
        var KEYCODE_KeyF: Number = definedExternally
        var KEYCODE_KeyG: Number = definedExternally
        var KEYCODE_KeyH: Number = definedExternally
        var KEYCODE_KeyI: Number = definedExternally
        var KEYCODE_KeyJ: Number = definedExternally
        var KEYCODE_KeyK: Number = definedExternally
        var KEYCODE_KeyL: Number = definedExternally
        var KEYCODE_KeyM: Number = definedExternally
        var KEYCODE_KeyN: Number = definedExternally
        var KEYCODE_KeyO: Number = definedExternally
        var KEYCODE_KeyP: Number = definedExternally
        var KEYCODE_KeyQ: Number = definedExternally
        var KEYCODE_KeyR: Number = definedExternally
        var KEYCODE_KeyS: Number = definedExternally
        var KEYCODE_KeyT: Number = definedExternally
        var KEYCODE_KeyU: Number = definedExternally
        var KEYCODE_KeyV: Number = definedExternally
        var KEYCODE_KeyW: Number = definedExternally
        var KEYCODE_KeyX: Number = definedExternally
        var KEYCODE_KeyY: Number = definedExternally
        var KEYCODE_KeyZ: Number = definedExternally
        var KEYCODE_Semicolon: Number = definedExternally
        var KEYCODE_LessThan: Number = definedExternally
        var KEYCODE_Equal: Number = definedExternally
        var KEYCODE_MoreThan: Number = definedExternally
        var KEYCODE_Question: Number = definedExternally
        var KEYCODE_Comma: Number = definedExternally
        var KEYCODE_Period: Number = definedExternally
        var KEYCODE_Slash: Number = definedExternally
        var KEYCODE_Quotation: Number = definedExternally
        var KEYCODE_LeftBracket: Number = definedExternally
        var KEYCODE_Backslash: Number = definedExternally
        var KEYCODE_RightBracket: Number = definedExternally
        var KEYCODE_Minus: Number = definedExternally
        var KEYCODE_Colon: Number = definedExternally
        var KEYCODE_Double_Quotation: Number = definedExternally
        var KEYCODE_Backquote: Number = definedExternally
        var KEYCODE_Tilde: Number = definedExternally
        var KEYCODE_Left_Brace: Number = definedExternally
        var KEYCODE_Or: Number = definedExternally
        var KEYCODE_Right_Brace: Number = definedExternally
        var KEYCODE_Del: Number = definedExternally
        var KEYCODE_Exclamation: Number = definedExternally
        var KEYCODE_Right_Parenthesis: Number = definedExternally
        var KEYCODE_AT: Number = definedExternally
        var KEYCODE_Sharp: Number = definedExternally
        var KEYCODE_Dollar: Number = definedExternally
        var KEYCODE_Percent: Number = definedExternally
        var KEYCODE_Power: Number = definedExternally
        var KEYCODE_And: Number = definedExternally
        var KEYCODE_Asterisk: Number = definedExternally
        var KEYCODE_Left_Parenthesis: Number = definedExternally
        var KEYCODE_Underline: Number = definedExternally
        var KEYCODE_Add: Number = definedExternally
        var KEYCODE_BACK: Number = definedExternally
        var KEYCODE_MENU: Number = definedExternally
        var KEYCODE_CHANGE_ANDROID_CHROME: `T$1` = definedExternally
        var FIX_MAP_KEYCODE: Any = definedExternally
        var ACTION_DOWN: Number = definedExternally
        var ACTION_UP: Number = definedExternally
        var META_MASK_SHIFT: Number = definedExternally
        var META_ALT_ON: Number = definedExternally
        var META_SHIFT_ON: Number = definedExternally
        var META_CTRL_ON: Number = definedExternally
        var META_META_ON: Number = definedExternally
        var FLAG_CANCELED: Number = definedExternally
        var FLAG_CANCELED_LONG_PRESS: Number = definedExternally
        var FLAG_LONG_PRESS: Any = definedExternally
        var FLAG_TRACKING: Number = definedExternally
        var FLAG_START_TRACKING: Any = definedExternally
        fun obtain(action: Number, code: Number): KeyEvent = definedExternally
        fun isConfirmKey(keyCode: Number): Boolean = definedExternally
        fun actionToString(action: Number): String = definedExternally
        fun keyCodeToString(keyCode: Number): String = definedExternally
    }
}

external interface ViewParent {
    fun requestLayout(): Any
    fun isLayoutRequested(): Boolean
    fun invalidateChild(child: View, r: Rect): Any
    fun invalidateChildInParent(location: Array<Number>, r: Rect): ViewParent
    fun getParent(): ViewParent
    fun requestChildFocus(child: View, focused: View): Any
    fun clearChildFocus(child: View): Any
    fun getChildVisibleRect(child: View, r: Rect, offset: Point): Boolean
    fun focusSearch(v: View, direction: Number): View
    fun bringChildToFront(child: View): Any
    fun focusableViewAvailable(v: View): Any
    fun childDrawableStateChanged(child: View): Any
    fun requestDisallowInterceptTouchEvent(disallowIntercept: Boolean): Any
    fun requestChildRectangleOnScreen(child: View, rectangle: Rect, immediate: Boolean): Boolean
    fun childHasTransientStateChanged(child: View, hasTransientState: Boolean): Any
}

external open class Surface(canvasElement: HTMLCanvasElement, viewRoot: ViewRootImpl) {
    open var mCanvasElement: Any = definedExternally
    open var _showFPSNode: Any = definedExternally
    open var viewRoot: Any = definedExternally
    open var mLockedRect: Any = definedExternally
    open var mCanvasBound: Rect = definedExternally
    open var mSupportDirtyDraw: Boolean = definedExternally
    open var mLockSaveCount: Any = definedExternally
    open fun initImpl(): Unit = definedExternally
    open fun isValid(): Boolean = definedExternally
    open fun notifyBoundChange(): Unit = definedExternally
    open fun initCanvasBound(): Unit = definedExternally
    open fun lockCanvas(dirty: Rect): Canvas = definedExternally
    open fun lockCanvasImpl(left: Number, top: Number, width: Number, height: Number): Canvas = definedExternally
    open fun unlockCanvasAndPost(canvas: Canvas): Unit = definedExternally
    open fun showFps(fps: Number): Unit = definedExternally

    companion object {
        var DrawToCacheFirstMode: Boolean = definedExternally
    }
}

external open class ViewRootImpl : ViewParent {
    open class RunQueue {
        open var mActions: Any = definedExternally
        open fun post(action: Runnable): Unit = definedExternally
        open fun postDelayed(action: Runnable, delayMillis: Number): Unit = definedExternally
        open fun removeCallbacks(action: Runnable): Unit = definedExternally
        open fun executeActions(handler: Handler): Unit = definedExternally
    }

    open var mView: Any = definedExternally
    open var mViewVisibility: Any = definedExternally
    open var mStopped: Any = definedExternally
    open var mWidth: Any = definedExternally
    open var mHeight: Any = definedExternally
    open var mDirty: Any = definedExternally
    open var mIsAnimating: Any = definedExternally
    open var mTempRect: Any = definedExternally
    open var mVisRect: Any = definedExternally
    open var mTraversalScheduled: Any = definedExternally
    open var mWillDrawSoon: Any = definedExternally
    open var mIsInTraversal: Any = definedExternally
    open var mLayoutRequested: Any = definedExternally
    open var mFirst: Any = definedExternally
    open var mFullRedrawNeeded: Any = definedExternally
    open var mIsDrawing: Any = definedExternally
    open var mAdded: Any = definedExternally
    open var mAddedTouchMode: Any = definedExternally
    open var mInTouchMode: Any = definedExternally
    open var mWinFrame: Any = definedExternally
    open var mInLayout: Any = definedExternally
    open var mLayoutRequesters: Any = definedExternally
    open var mHandlingLayoutInLayoutRequest: Any = definedExternally
    open var mRemoved: Any = definedExternally
    open var mHandler: Any = definedExternally
    open var mViewScrollChanged: Any = definedExternally
    open var mTreeObserver: Any = definedExternally
    open var mIgnoreDirtyState: Any = definedExternally
    open var mSetIgnoreDirtyState: Any = definedExternally
    open var mDrawingTime: Any = definedExternally
    open var mFirstInputStage: Any = definedExternally
    open var mFpsStartTime: Any = definedExternally
    open var mFpsPrevTime: Any = definedExternally
    open var mFpsNumFrames: Any = definedExternally
    open var mSurface: Any = definedExternally
    open fun initSurface(canvasElement: HTMLCanvasElement): Unit = definedExternally
    open fun notifyResized(frame: Rect): Unit = definedExternally
    open fun setView(view: View): Unit = definedExternally
    open fun getView(): View = definedExternally
    open fun getHostVisibility(): Number = definedExternally
    open var mTraversalRunnable: Any = definedExternally
    open fun scheduleTraversals(): Unit = definedExternally
    open fun unscheduleTraversals(): Unit = definedExternally
    open fun doTraversal(): Unit = definedExternally
    open fun measureHierarchy(host: Any, lp: Any, desiredWindowWidth: Any, desiredWindowHeight: Any): Unit = definedExternally
    open fun performTraversals(): Unit = definedExternally
    open fun performLayout(lp: Any, desiredWindowWidth: Any, desiredWindowHeight: Any): Unit = definedExternally
    open fun getValidLayoutRequesters(layoutRequesters: Any, secondLayoutRequests: Any): Unit = definedExternally
    open fun performMeasure(childWidthMeasureSpec: Any, childHeightMeasureSpec: Any): Unit = definedExternally
    open fun isInLayout(): Boolean = definedExternally
    open fun requestLayoutDuringLayout(view: View): Boolean = definedExternally
    open fun trackFPS(): Unit = definedExternally
    open fun performDraw(): Unit = definedExternally
    open fun draw(fullRedrawNeeded: Any): Unit = definedExternally
    open fun drawSoftware(): Unit = definedExternally
    open var _continueTraversalesCount: Any = definedExternally
    open fun checkContinueTraversalsNextFrame(): Unit = definedExternally
    override fun isLayoutRequested(): Boolean = definedExternally
    open var mInvalidateOnAnimationRunnable: Any = definedExternally
    open fun dispatchInvalidateDelayed(view: View, delayMilliseconds: Number): Unit = definedExternally
    open fun dispatchInvalidateRectDelayed(info: View.AttachInfo.InvalidateInfo, delayMilliseconds: Number): Unit = definedExternally
    open fun dispatchInvalidateOnAnimation(view: View): Unit = definedExternally
    open fun dispatchInvalidateRectOnAnimation(info: View.AttachInfo.InvalidateInfo): Unit = definedExternally
    open fun cancelInvalidate(view: View): Unit = definedExternally
    override fun getParent(): ViewParent = definedExternally
    override fun requestLayout(): Unit = definedExternally
    open fun invalidate(): Unit = definedExternally
    open fun invalidateWorld(view: View): Unit = definedExternally
    override fun invalidateChild(child: View, dirty: Rect): Unit = definedExternally
    override fun invalidateChildInParent(location: Array<Number>, dirty: Rect): ViewParent = definedExternally
    override fun requestChildFocus(child: View, focused: View): Unit = definedExternally
    override fun clearChildFocus(focused: View): Unit = definedExternally
    override fun getChildVisibleRect(child: View, r: Rect, offset: Point): Boolean = definedExternally
    override fun focusSearch(focused: View, direction: Number): View = definedExternally
    override fun bringChildToFront(child: View): Unit = definedExternally
    override fun focusableViewAvailable(v: View): Unit = definedExternally
    override fun childDrawableStateChanged(child: View): Unit = definedExternally
    override fun requestDisallowInterceptTouchEvent(disallowIntercept: Boolean): Unit = definedExternally
    override fun requestChildRectangleOnScreen(child: View, rectangle: Rect, immediate: Boolean): Boolean = definedExternally
    override fun childHasTransientStateChanged(child: View, hasTransientState: Boolean): Unit = definedExternally
    open fun dispatchInputEvent(event: MotionEvent): Boolean = definedExternally
    open fun dispatchInputEvent(event: KeyEvent): Boolean = definedExternally
    open fun dispatchInputEvent(event: Event): Boolean = definedExternally
    open fun deliverInputEvent(event: Any): Unit = definedExternally
    open fun finishInputEvent(event: Any): Unit = definedExternally
    open fun checkForLeavingTouchModeAndConsume(event: Any): Unit = definedExternally
    open fun ensureTouchMode(inTouchMode: Boolean): Boolean = definedExternally
    open fun ensureTouchModeLocally(inTouchMode: Boolean): Boolean = definedExternally
    open fun enterTouchMode(): Unit = definedExternally
    open fun leaveTouchMode(): Unit = definedExternally
    open var mRunQueue: Any = definedExternally

    companion object {
        var TAG: String = definedExternally
        var DBG: Any = definedExternally
        var LOCAL_LOGV: Boolean = definedExternally
        var DEBUG_DRAW: Boolean = definedExternally
        var DEBUG_LAYOUT: Boolean = definedExternally
        var DEBUG_INPUT_RESIZE: Boolean = definedExternally
        var DEBUG_ORIENTATION: Boolean = definedExternally
        var DEBUG_CONFIGURATION: Boolean = definedExternally
        var DEBUG_FPS: Boolean = definedExternally
        var ContinueEventToDom: dynamic /* "SymbolKeyword" kind unsupported yet here! (android-ui.d.ts:3526:35 to 3526:42) */ = definedExternally
        fun getRootMeasureSpec(windowSize: Any, rootDimension: Any): Unit = definedExternally
        fun isViewDescendantOf(child: View, parent: View): Any = definedExternally
        fun isNavigationKey(keyEvent: Any): Unit = definedExternally
        fun isTypingKey(keyEvent: Any): Unit = definedExternally
        fun findAncestorToTakeFocusInTouchMode(focused: Any): Unit = definedExternally
        var RunQueueInstance: Any = definedExternally
        fun getRunQueue(viewRoot: ViewRootImpl? = definedExternally /* null */): ViewRootImpl.RunQueue = definedExternally
    }
}

external open class FocusFinder {
    open var mFocusedRect: Rect = definedExternally
    open var mOtherRect: Rect = definedExternally
    open var mBestCandidateRect: Rect = definedExternally
    open var mSequentialFocusComparator: Any = definedExternally
    open var mTempList: Any = definedExternally
    open fun findNextFocus(root: ViewGroup, focused: View, direction: Number): View = definedExternally
    open fun findNextFocusFromRect(root: ViewGroup, focusedRect: Rect, direction: Number): View = definedExternally
    open fun _findNextFocus(root: Any, focused: Any, focusedRect: Any, direction: Any): Unit = definedExternally
    open fun findNextUserSpecifiedFocus(root: Any, focused: Any, direction: Any): Unit = definedExternally
    open fun __findNextFocus(root: Any, focused: Any, focusedRect: Any, direction: Any, focusables: Any): Unit = definedExternally
    open fun findNextFocusInRelativeDirection(focusables: Any, root: Any, focused: Any, focusedRect: Any, direction: Any): Unit = definedExternally
    open fun setFocusBottomRight(root: Any, focusedRect: Any): Unit = definedExternally
    open fun setFocusTopLeft(root: Any, focusedRect: Any): Unit = definedExternally
    open fun findNextFocusInAbsoluteDirection(focusables: Any, root: Any, focused: Any, focusedRect: Any, direction: Any): Unit = definedExternally
    open fun isBetterCandidate(direction: Number, source: Rect, rect1: Rect, rect2: Rect): Boolean = definedExternally
    open fun beamBeats(direction: Number, source: Rect, rect1: Rect, rect2: Rect): Boolean = definedExternally
    open fun getWeightedDistanceFor(majorAxisDistance: Number, minorAxisDistance: Number): Number = definedExternally
    open fun isCandidate(srcRect: Rect, destRect: Rect, direction: Number): Boolean = definedExternally
    open fun beamsOverlap(direction: Number, rect1: Rect, rect2: Rect): Boolean = definedExternally
    open fun isToDirectionOf(direction: Number, src: Rect, dest: Rect): Boolean = definedExternally
    open fun findNearestTouchable(root: ViewGroup, x: Number, y: Number, direction: Number, deltas: Array<Number>): View = definedExternally
    open fun isTouchCandidate(x: Any, y: Any, destRect: Any, direction: Any): Unit = definedExternally

    companion object {
        var sFocusFinder: Any = definedExternally
        fun getInstance(): FocusFinder = definedExternally
        fun getNextFocusable(focused: Any, focusables: Any, count: Any): Unit = definedExternally
        fun getPreviousFocusable(focused: Any, focusables: Any, count: Any): Unit = definedExternally
        fun majorAxisDistance(direction: Number, source: Rect, dest: Rect): Number = definedExternally
        fun majorAxisDistanceRaw(direction: Number, source: Rect, dest: Rect): Number = definedExternally
        fun majorAxisDistanceToFarEdge(direction: Number, source: Rect, dest: Rect): Number = definedExternally
        fun majorAxisDistanceToFarEdgeRaw(direction: Number, source: Rect, dest: Rect): Number = definedExternally
        fun minorAxisDistance(direction: Number, source: Rect, dest: Rect): Number = definedExternally
    }
}
//
//external open class ViewGroup(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : View, ViewParent {
//    open var mPersistentDrawingCache: Number = definedExternally
//    open var mDisappearingChildren: ArrayList<View> = definedExternally
//    open var mOnHierarchyChangeListener: ViewGroup.OnHierarchyChangeListener = definedExternally
//    open var mFocused: Any = definedExternally
//    open var mFirstTouchTarget: Any = definedExternally
//    open var mChildTransformation: Any = definedExternally
//    open var mInvalidateRegion: RectF = definedExternally
//    open var mLastTouchDownTime: Any = definedExternally
//    open var mLastTouchDownIndex: Any = definedExternally
//    open var mLastTouchDownX: Any = definedExternally
//    open var mLastTouchDownY: Any = definedExternally
//    open var mGroupFlags: Number = definedExternally
//    open var mLayoutMode: Number = definedExternally
//    open var mChildren: Array<View> = definedExternally
//    open var mChildrenCount: Number = definedExternally
//    open var mSuppressLayout: Boolean = definedExternally
//    open var mLayoutCalledWhileSuppressed: Any = definedExternally
//    open var mChildCountWithTransientState: Any = definedExternally
//    open fun initViewGroup(): Unit = definedExternally
//    open fun initFromAttributes(context: Any, attrs: Any, defStyle: Any? = definedExternally /* null */): Unit = definedExternally
//    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
//    open fun getDescendantFocusability(): Number = definedExternally
//    open fun setDescendantFocusability(focusability: Number): Unit = definedExternally
//    override fun handleFocusGainInternal(direction: Number, previouslyFocusedRect: Rect): Unit = definedExternally
//    override fun requestChildFocus(child: View, focused: View): Unit = definedExternally
//    override fun focusableViewAvailable(v: View): Unit = definedExternally
//    override fun focusSearch(direction: Number): View = definedExternally
//    override fun focusSearch(focused: View, direction: Number): View = definedExternally
//    override fun requestChildRectangleOnScreen(child: View, rectangle: Rect, immediate: Boolean): Boolean = definedExternally
//    override fun childHasTransientStateChanged(child: View, childHasTransientState: Boolean): Unit = definedExternally
//    override fun hasTransientState(): Boolean = definedExternally
//    override fun dispatchUnhandledMove(focused: android.view.View, direction: Number): Boolean = definedExternally
//    override fun clearChildFocus(child: View): Unit = definedExternally
//    override fun clearFocus(): Unit = definedExternally
//    override fun unFocus(): Unit = definedExternally
//    open fun getFocusedChild(): View = definedExternally
//    override fun hasFocus(): Boolean = definedExternally
//    override fun findFocus(): View = definedExternally
//    override fun hasFocusable(): Boolean = definedExternally
//    override fun addFocusables(views: ArrayList<View>, direction: Number, focusableMode: Number?): Unit = definedExternally
//    override fun requestFocus(direction: Number?, previouslyFocusedRect: Any?): Boolean = definedExternally
//    open fun onRequestFocusInDescendants(direction: Number, previouslyFocusedRect: Rect): Boolean = definedExternally
//    open fun addView(view: View): Any = definedExternally
//    open fun addView(view: View, index: Number): Any = definedExternally
//    open fun addView(view: View, params: ViewGroup.LayoutParams): Any = definedExternally
//    open fun addView(view: View, index: Number, params: ViewGroup.LayoutParams): Any = definedExternally
//    open fun addView(view: View, width: Number, height: Number): Any = definedExternally
//    open fun addView(vararg args: Any): Any = definedExternally
//    open fun checkLayoutParams(p: ViewGroup.LayoutParams): Boolean = definedExternally
//    open fun setOnHierarchyChangeListener(listener: ViewGroup.OnHierarchyChangeListener): Unit = definedExternally
//    open fun onViewAdded(child: View): Unit = definedExternally
//    open fun onViewRemoved(child: View): Unit = definedExternally
//    open fun clearCachedLayoutMode(): Unit = definedExternally
//    open fun addViewInLayout(child: View, index: Number, params: ViewGroup.LayoutParams, preventRequestLayout: Boolean? = definedExternally /* null */): Boolean = definedExternally
//    open fun cleanupLayoutState(child: View): Unit = definedExternally
//    open fun addViewInner(child: View, index: Number, params: ViewGroup.LayoutParams, preventRequestLayout: Boolean): Unit = definedExternally
//    open fun addInArray(child: Any, index: Any): Unit = definedExternally
//    open fun addToBindElement(childElement: Any, insertBeforeElement: Any): Unit = definedExternally
//    open fun removeChildElement(childElement: Any): Unit = definedExternally
//    open fun removeFromArray(index: Any, count: Any? = definedExternally /* null */): Unit = definedExternally
//    open fun removeView(view: View): Unit = definedExternally
//    open fun removeViewInLayout(view: View): Unit = definedExternally
//    open fun removeViewsInLayout(start: Number, count: Number): Unit = definedExternally
//    open fun removeViewAt(index: Number): Unit = definedExternally
//    open fun removeViews(start: Number, count: Number): Unit = definedExternally
//    open fun removeViewInternal(view: Any): Unit = definedExternally
//    open fun removeViewsInternal(start: Any, count: Any): Unit = definedExternally
//    open fun removeAllViews(): Unit = definedExternally
//    open fun removeAllViewsInLayout(): Unit = definedExternally
//    open fun detachViewFromParent(child: View): Unit = definedExternally
//    open fun detachViewFromParent(child: Number): Unit = definedExternally
//    open fun removeDetachedView(child: View, animate: Boolean): Unit = definedExternally
//    open fun attachViewToParent(child: View, index: Number, params: ViewGroup.LayoutParams): Unit = definedExternally
//    open fun detachViewsFromParent(start: Number, count: Number? = definedExternally /* null */): Unit = definedExternally
//    open fun detachAllViewsFromParent(): Unit = definedExternally
//    open fun indexOfChild(child: View): Number = definedExternally
//    open fun getChildCount(): Number = definedExternally
//    open fun getChildAt(index: Number): View = definedExternally
//    override fun bringChildToFront(child: View): Unit = definedExternally
//    open fun hasBooleanFlag(flag: Number): Boolean = definedExternally
//    open fun setBooleanFlag(flag: Number, value: Boolean): Unit = definedExternally
//    override fun dispatchGenericPointerEvent(event: MotionEvent): Boolean = definedExternally
//    open fun dispatchTransformedGenericPointerEvent(event: Any, child: Any): Unit = definedExternally
//    override fun dispatchKeyEvent(event: android.view.KeyEvent): Boolean = definedExternally
//    override fun dispatchWindowFocusChanged(hasFocus: Boolean): Unit = definedExternally
//    override fun addTouchables(views: java.util.ArrayList<android.view.View>): Unit = definedExternally
//    open fun onInterceptTouchEvent(ev: MotionEvent): Boolean = definedExternally
//    override fun dispatchTouchEvent(ev: MotionEvent): Boolean = definedExternally
//    open fun resetTouchState(): Unit = definedExternally
//    open fun clearTouchTargets(): Unit = definedExternally
//    open fun cancelAndClearTouchTargets(event: Any): Unit = definedExternally
//    open fun getTouchTarget(child: Any): Unit = definedExternally
//    open fun addTouchTarget(child: Any, pointerIdBits: Any): Unit = definedExternally
//    open fun removePointersFromTouchTargets(pointerIdBits: Any): Unit = definedExternally
//    open fun cancelTouchTarget(view: Any): Unit = definedExternally
//    open fun isTransformedTouchPointInView(x: Number, y: Number, child: View, outLocalPoint: Point): Boolean = definedExternally
//    open fun dispatchTransformedTouchEvent(event: Any, cancel: Any, child: Any, desiredPointerIdBits: Any): Unit = definedExternally
//    open fun setMotionEventSplittingEnabled(split: Boolean): Unit = definedExternally
//    open fun isMotionEventSplittingEnabled(): Boolean = definedExternally
//    open fun isAnimationCacheEnabled(): Boolean = definedExternally
//    open fun setAnimationCacheEnabled(enabled: Boolean): Unit = definedExternally
//    open fun isAlwaysDrawnWithCacheEnabled(): Boolean = definedExternally
//    open fun setAlwaysDrawnWithCacheEnabled(always: Boolean): Unit = definedExternally
//    open fun isChildrenDrawnWithCacheEnabled(): Boolean = definedExternally
//    open fun setChildrenDrawnWithCacheEnabled(enabled: Boolean): Unit = definedExternally
//    open fun setChildrenDrawingCacheEnabled(enabled: Boolean): Unit = definedExternally
//    override fun onAnimationStart(): Unit = definedExternally
//    override fun onAnimationEnd(): Unit = definedExternally
//    open fun getPersistentDrawingCache(): Number = definedExternally
//    open fun setPersistentDrawingCache(drawingCacheToKeep: Number): Unit = definedExternally
//    open fun isChildrenDrawingOrderEnabled(): Boolean = definedExternally
//    open fun setChildrenDrawingOrderEnabled(enabled: Boolean): Unit = definedExternally
//    open fun getChildDrawingOrder(childCount: Number, i: Number): Number = definedExternally
//    open fun generateLayoutParamsFromAttr(attrs: HTMLElement): ViewGroup.LayoutParams = definedExternally
//    open fun generateLayoutParams(p: ViewGroup.LayoutParams): ViewGroup.LayoutParams = definedExternally
//    open fun generateDefaultLayoutParams(): ViewGroup.LayoutParams = definedExternally
//    open fun measureChildren(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
//    open fun measureChild(child: View, parentWidthMeasureSpec: Number, parentHeightMeasureSpec: Number): Unit = definedExternally
//    open fun measureChildWithMargins(child: View, parentWidthMeasureSpec: Number, widthUsed: Number, parentHeightMeasureSpec: Number, heightUsed: Number): Unit = definedExternally
//    open fun clearDisappearingChildren(): Unit = definedExternally
//    open fun addDisappearingView(v: Any): Unit = definedExternally
//    open fun finishAnimatingView(view: View, animation: Animation): Unit = definedExternally
//    override fun dispatchAttachedToWindow(info: View.AttachInfo, visibility: Number): Unit = definedExternally
//    override fun onAttachedToWindow(): Unit = definedExternally
//    override fun onDetachedFromWindow(): Unit = definedExternally
//    override fun dispatchDetachedFromWindow(): Unit = definedExternally
//    override fun dispatchDisplayHint(hint: Number): Unit = definedExternally
//    open fun onChildVisibilityChanged(child: View, oldVisibility: Number, newVisibility: Number): Unit = definedExternally
//    override fun dispatchVisibilityChanged(changedView: View, visibility: Number): Unit = definedExternally
//    override fun dispatchSetSelected(selected: Boolean): Unit = definedExternally
//    override fun dispatchSetActivated(activated: Boolean): Unit = definedExternally
//    override fun dispatchSetPressed(pressed: Boolean): Unit = definedExternally
//    override fun dispatchCancelPendingInputEvents(): Unit = definedExternally
//    open fun offsetDescendantRectToMyCoords(descendant: View, rect: Rect): Unit = definedExternally
//    open fun offsetRectIntoDescendantCoords(descendant: View, rect: Rect): Unit = definedExternally
//    open fun offsetRectBetweenParentAndChild(descendant: View, rect: Rect, offsetFromChildToParent: Boolean, clipToBounds: Boolean): Unit = definedExternally
//    open fun offsetChildrenTopAndBottom(offset: Number): Unit = definedExternally
//    open fun suppressLayout(suppress: Boolean): Unit = definedExternally
//    open fun isLayoutSuppressed(): Boolean = definedExternally
//    override fun layout(l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
//    open fun canAnimate(): Boolean = definedExternally
//    override fun onLayout(changed: Boolean, l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
//    override fun getChildVisibleRect(child: View, r: Rect, offset: Point): Boolean = definedExternally
//    override fun dispatchDraw(canvas: Canvas): Unit = definedExternally
//    open fun drawChild(canvas: Canvas, child: View, drawingTime: Number): Boolean = definedExternally
//    override fun drawableStateChanged(): Unit = definedExternally
//    override fun jumpDrawablesToCurrentState(): Unit = definedExternally
//    override fun onCreateDrawableState(extraSpace: Number): Array<Number> = definedExternally
//    open fun setAddStatesFromChildren(addsStates: Boolean): Unit = definedExternally
//    open fun addStatesFromChildren(): Boolean = definedExternally
//    override fun childDrawableStateChanged(child: android.view.View): Unit = definedExternally
//    open fun getClipChildren(): Boolean = definedExternally
//    open fun setClipChildren(clipChildren: Boolean): Unit = definedExternally
//    open fun setClipToPadding(clipToPadding: Boolean): Unit = definedExternally
//    open fun isClipToPadding(): Boolean = definedExternally
//    override fun invalidateChild(child: View, dirty: Rect): Unit = definedExternally
//    override fun invalidateChildInParent(location: Array<Number>, dirty: Rect): ViewParent = definedExternally
//    open fun invalidateChildFast(child: View, dirty: Rect): Unit = definedExternally
//    open fun invalidateChildInParentFast(left: Number, top: Number, dirty: Rect): ViewParent = definedExternally
//    open fun getChildStaticTransformation(child: View, t: Transformation): Boolean = definedExternally
//    open fun getChildTransformation(): Transformation = definedExternally
//    override fun findViewTraversal(id: String): View = definedExternally
//    override fun findViewWithTagTraversal(tag: Any): View = definedExternally
//    override fun findViewByPredicateTraversal(predicate: View.Predicate<View>, childToSkip: View): View = definedExternally
//    override fun requestDisallowInterceptTouchEvent(disallowIntercept: Boolean): Unit = definedExternally
//    open fun shouldDelayChildPressedState(): Boolean = definedExternally
//    open fun onSetLayoutParams(child: View, layoutParams: ViewGroup.LayoutParams): Unit = definedExternally
//
//    companion object {
//        var FLAG_CLIP_CHILDREN: Number = definedExternally
//        var FLAG_CLIP_TO_PADDING: Number = definedExternally
//        var FLAG_INVALIDATE_REQUIRED: Number = definedExternally
//        var FLAG_RUN_ANIMATION: Number = definedExternally
//        var FLAG_ANIMATION_DONE: Number = definedExternally
//        var FLAG_PADDING_NOT_NULL: Number = definedExternally
//        var FLAG_ANIMATION_CACHE: Number = definedExternally
//        var FLAG_OPTIMIZE_INVALIDATE: Number = definedExternally
//        var FLAG_CLEAR_TRANSFORMATION: Number = definedExternally
//        var FLAG_NOTIFY_ANIMATION_LISTENER: Number = definedExternally
//        var FLAG_USE_CHILD_DRAWING_ORDER: Number = definedExternally
//        var FLAG_SUPPORT_STATIC_TRANSFORMATIONS: Number = definedExternally
//        var FLAG_ALPHA_LOWER_THAN_ONE: Number = definedExternally
//        var FLAG_ADD_STATES_FROM_CHILDREN: Number = definedExternally
//        var FLAG_ALWAYS_DRAWN_WITH_CACHE: Number = definedExternally
//        var FLAG_CHILDREN_DRAWN_WITH_CACHE: Number = definedExternally
//        var FLAG_NOTIFY_CHILDREN_ON_DRAWABLE_STATE_CHANGE: Number = definedExternally
//        var FLAG_MASK_FOCUSABILITY: Number = definedExternally
//        var FOCUS_BEFORE_DESCENDANTS: Number = definedExternally
//        var FOCUS_AFTER_DESCENDANTS: Number = definedExternally
//        var FOCUS_BLOCK_DESCENDANTS: Number = definedExternally
//        var FLAG_DISALLOW_INTERCEPT: Number = definedExternally
//        var FLAG_SPLIT_MOTION_EVENTS: Number = definedExternally
//        var FLAG_PREVENT_DISPATCH_ATTACHED_TO_WINDOW: Number = definedExternally
//        var FLAG_LAYOUT_MODE_WAS_EXPLICITLY_SET: Number = definedExternally
//        var PERSISTENT_NO_CACHE: Number = definedExternally
//        var PERSISTENT_ANIMATION_CACHE: Number = definedExternally
//        var PERSISTENT_SCROLLING_CACHE: Number = definedExternally
//        var PERSISTENT_ALL_CACHES: Number = definedExternally
//        var LAYOUT_MODE_UNDEFINED: Number = definedExternally
//        var LAYOUT_MODE_CLIP_BOUNDS: Number = definedExternally
//        var LAYOUT_MODE_DEFAULT: Number = definedExternally
//        var CLIP_TO_PADDING_MASK: Number = definedExternally
//        var ViewGroupClassAttrBind: Any = definedExternally
//        fun resetCancelNextUpFlag(view: Any): Unit = definedExternally
//        fun canViewReceivePointerEvents(child: Any): Unit = definedExternally
//        fun getChildMeasureSpec(spec: Number, padding: Number, childDimension: Number): Number = definedExternally
//    }
//}

external open class ViewOverlay(hostView: View) {
    open class OverlayViewGroup(hostView: View) : ViewGroup {
        open var mHostView: View = definedExternally
        open var mDrawables: Set<Drawable> = definedExternally
        open fun addDrawable(drawable: Any): Unit = definedExternally
        override fun addView(child: View): Unit = definedExternally
        open fun add(drawable: Drawable): Any = definedExternally
        open fun add(child: View): Any = definedExternally
        open fun clear(): Unit = definedExternally
        open fun isEmpty(): Boolean = definedExternally
        override fun onLayout(changed: Boolean, l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
    }

    open var mOverlayViewGroup: ViewOverlay.OverlayViewGroup = definedExternally
    open fun getOverlayView(): ViewGroup = definedExternally
    open fun add(drawable: Drawable): Unit = definedExternally
    open fun remove(drawable: Drawable): Unit = definedExternally
    open fun clear(): Unit = definedExternally
    open fun isEmpty(): Boolean = definedExternally
}

external open class WindowManager(context: Context) {
    open class Layout(context: android.content.Context, windowManager: WindowManager) : android.widget.FrameLayout {
        open var mWindowManager: Any = definedExternally
        open fun getTopFocusableWindowView(findParent: Boolean? = definedExternally /* null */): ViewGroup = definedExternally
        override fun dispatchKeyEvent(event: android.view.KeyEvent): Boolean = definedExternally
        override fun isTransformedTouchPointInView(x: Number, y: Number, child: android.view.View, outLocalPoint: android.graphics.Point): Boolean = definedExternally
        override fun onChildVisibilityChanged(child: android.view.View, oldVisibility: Number, newVisibility: Number): Unit = definedExternally
        override fun onLayout(changed: Boolean, left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
        override fun layoutChildren(left: Number, top: Number, right: Number, bottom: Number, forceLeftGravity: Boolean): Unit = definedExternally
        override fun tagName(): String = definedExternally
    }

    open class LayoutParams(_type: Number? = definedExternally /* null */) : android.widget.FrameLayout.LayoutParams {
        open var x: Number = definedExternally
        open var y: Number = definedExternally
        open var type: Number = definedExternally
        open var flags: Number = definedExternally
        open var exitAnimation: Animation = definedExternally
        open var enterAnimation: Animation = definedExternally
        open var resumeAnimation: Animation = definedExternally
        open var hideAnimation: Animation = definedExternally
        open var dimAmount: Number = definedExternally
        open fun setTitle(title: String): Unit = definedExternally
        open fun getTitle(): String = definedExternally
        open fun copyFrom(o: LayoutParams): Number = definedExternally
        open var mTitle: Any = definedExternally
        open fun isFocusable(): Unit = definedExternally
        open fun isTouchable(): Unit = definedExternally
        open fun isTouchModal(): Unit = definedExternally
        open fun isFloating(): Unit = definedExternally
        open fun isSplitTouch(): Unit = definedExternally
        open fun isWatchTouchOutside(): Unit = definedExternally

        companion object {
            var FIRST_APPLICATION_WINDOW: Number = definedExternally
            var TYPE_BASE_APPLICATION: Number = definedExternally
            var TYPE_APPLICATION: Number = definedExternally
            var TYPE_APPLICATION_STARTING: Number = definedExternally
            var LAST_APPLICATION_WINDOW: Number = definedExternally
            var FIRST_SUB_WINDOW: Number = definedExternally
            var TYPE_APPLICATION_PANEL: Number = definedExternally
            var TYPE_APPLICATION_MEDIA: Number = definedExternally
            var TYPE_APPLICATION_SUB_PANEL: Number = definedExternally
            var TYPE_APPLICATION_ATTACHED_DIALOG: Number = definedExternally
            var TYPE_APPLICATION_MEDIA_OVERLAY: Number = definedExternally
            var LAST_SUB_WINDOW: Number = definedExternally
            var FIRST_SYSTEM_WINDOW: Number = definedExternally
            var TYPE_STATUS_BAR: Number = definedExternally
            var TYPE_SEARCH_BAR: Number = definedExternally
            var TYPE_PHONE: Number = definedExternally
            var TYPE_SYSTEM_ALERT: Number = definedExternally
            var TYPE_KEYGUARD: Number = definedExternally
            var TYPE_TOAST: Number = definedExternally
            var TYPE_SYSTEM_OVERLAY: Number = definedExternally
            var TYPE_PRIORITY_PHONE: Number = definedExternally
            var TYPE_SYSTEM_DIALOG: Number = definedExternally
            var LAST_SYSTEM_WINDOW: Number = definedExternally
            var FLAG_NOT_FOCUSABLE: Number = definedExternally
            var FLAG_NOT_TOUCHABLE: Number = definedExternally
            var FLAG_NOT_TOUCH_MODAL: Number = definedExternally
            var FLAG_WATCH_OUTSIDE_TOUCH: Number = definedExternally
            var FLAG_SPLIT_TOUCH: Number = definedExternally
            var FLAG_FLOATING: Number = definedExternally
            var LAYOUT_CHANGED: Number = definedExternally
            var TYPE_CHANGED: Number = definedExternally
            var FLAGS_CHANGED: Number = definedExternally
            var FORMAT_CHANGED: Number = definedExternally
            var ANIMATION_CHANGED: Number = definedExternally
            var DIM_AMOUNT_CHANGED: Number = definedExternally
            var TITLE_CHANGED: Number = definedExternally
            var ALPHA_CHANGED: Number = definedExternally
        }
    }

    open var mWindowsLayout: Any = definedExternally
    open var mActiveWindow: Window = definedExternally
    open fun getWindowsLayout(): ViewGroup = definedExternally
    open fun addWindow(window: Window): Unit = definedExternally
    open fun updateWindowLayout(window: Window, params: ViewGroup.LayoutParams): Unit = definedExternally
    open fun removeWindow(window: Window): Unit = definedExternally

    companion object {
        var FocusViewRemember: Any = definedExternally
    }
}

external open class Window(context: Context) {
    interface Callback {
        fun dispatchKeyEvent(event: KeyEvent): Boolean
        fun dispatchTouchEvent(event: MotionEvent): Boolean
        fun dispatchGenericMotionEvent(event: MotionEvent): Boolean
        fun onWindowAttributesChanged(attrs: WindowManager.LayoutParams)
        fun onContentChanged()
        fun onWindowFocusChanged(hasFocus: Boolean)
        fun onAttachedToWindow()
        fun onDetachedFromWindow()
    }

    open var mContext: Any = definedExternally
    open var mCallback: Any = definedExternally
    open var mChildWindowManager: Any = definedExternally
    open var mContainer: Any = definedExternally
    open var mIsActive: Any = definedExternally
    open var mCloseOnTouchOutside: Any = definedExternally
    open var mSetCloseOnTouchOutside: Any = definedExternally
    open var mDestroyed: Any = definedExternally
    open var mWindowAttributes: Any = definedExternally
    open var mAttachInfo: Any = definedExternally
    open var mDecor: Any = definedExternally
    open var mContentParent: Any = definedExternally
    open fun initDecorView(): Unit = definedExternally
    open fun initAttachInfo(): Unit = definedExternally
    open fun getContext(): Context = definedExternally
    open fun setContainer(container: WindowManager): Unit = definedExternally
    open fun getContainer(): WindowManager = definedExternally
    open fun destroy(): Unit = definedExternally
    open fun isDestroyed(): Boolean = definedExternally
    open fun setChildWindowManager(wm: WindowManager): Unit = definedExternally
    open fun getChildWindowManager(): WindowManager = definedExternally
    open fun setCallback(callback: Window.Callback): Unit = definedExternally
    open fun getCallback(): Window.Callback = definedExternally
    open fun setFloating(isFloating: Boolean): Unit = definedExternally
    open fun isFloating(): Boolean = definedExternally
    open fun setLayout(width: Number, height: Number): Unit = definedExternally
    open fun setGravity(gravity: Number): Unit = definedExternally
    open fun setType(type: Number): Unit = definedExternally
    open fun setWindowAnimations(enterAnimation: Animation, exitAnimation: Animation, resumeAnimation: Animation? = definedExternally /* null */, hideAnimation: Animation? = definedExternally /* null */): Unit = definedExternally
    open fun addFlags(flags: Number): Unit = definedExternally
    open fun clearFlags(flags: Number): Unit = definedExternally
    open fun setFlags(flags: Number, mask: Number): Unit = definedExternally
    open fun setDimAmount(amount: Number): Unit = definedExternally
    open fun setAttributes(a: WindowManager.LayoutParams): Unit = definedExternally
    open fun getAttributes(): WindowManager.LayoutParams = definedExternally
    open fun setCloseOnTouchOutside(close: Boolean): Unit = definedExternally
    open fun setCloseOnTouchOutsideIfNotSet(close: Boolean): Unit = definedExternally
    open fun shouldCloseOnTouch(context: Context, event: MotionEvent): Boolean = definedExternally
    open fun isOutOfBounds(context: Any, event: Any): Unit = definedExternally
    open fun makeActive(): Unit = definedExternally
    open fun isActive(): Boolean = definedExternally
    open fun findViewById(id: String): View = definedExternally
    open fun setContentView(view: View, params: ViewGroup.LayoutParams? = definedExternally /* null */): Unit = definedExternally
    open fun addContentView(view: View, params: ViewGroup.LayoutParams): Unit = definedExternally
    open fun getContentParent(): ViewGroup = definedExternally
    open fun getCurrentFocus(): View = definedExternally
    open fun getLayoutInflater(): LayoutInflater = definedExternally
    open fun setTitle(title: String): Unit = definedExternally
    open fun setBackgroundDrawable(drawable: Drawable): Unit = definedExternally
    open fun setBackgroundColor(color: Number): Unit = definedExternally
    open fun takeKeyEvents(_get: Boolean): Unit = definedExternally
    open fun superDispatchKeyEvent(event: KeyEvent): Boolean = definedExternally
    open fun superDispatchTouchEvent(event: MotionEvent): Boolean = definedExternally
    open fun superDispatchGenericMotionEvent(event: MotionEvent): Boolean = definedExternally
    open fun getDecorView(): View = definedExternally
    open fun peekDecorView(): View = definedExternally
    open fun onActive(): Unit = definedExternally
}

external open class VelocityTracker {
    open var mPointerListHead: Any = definedExternally
    open var mLastTouchIndex: Any = definedExternally
    open var mGeneration: Any = definedExternally
    open var mNext: Any = definedExternally
    open fun recycle(): Unit = definedExternally
    open fun setNextPoolable(element: VelocityTracker): Unit = definedExternally
    open fun getNextPoolable(): VelocityTracker = definedExternally
    open fun clear(): Unit = definedExternally
    open fun addMovement(ev: MotionEvent): Unit = definedExternally
    open fun computeCurrentVelocity(units: Number, maxVelocity: Number? = definedExternally /* null */): Unit = definedExternally
    open fun getXVelocity(id: Number? = definedExternally /* null */): Number = definedExternally
    open fun getYVelocity(id: Number? = definedExternally /* null */): Number = definedExternally
    open fun getPointer(id: Any): Unit = definedExternally

    companion object {
        var TAG: Any = definedExternally
        var DEBUG: Any = definedExternally
        var localLOGV: Any = definedExternally
        var NUM_PAST: Any = definedExternally
        var MAX_AGE_MILLISECONDS: Any = definedExternally
        var POINTER_POOL_CAPACITY: Any = definedExternally
        var sPool: Any = definedExternally
        var sRecycledPointerListHead: Any = definedExternally
        var sRecycledPointerCount: Any = definedExternally
        fun obtain(): VelocityTracker = definedExternally
        fun obtainPointer(): Unit = definedExternally
        fun releasePointer(pointer: Any): Unit = definedExternally
        fun releasePointerList(pointer: Any): Unit = definedExternally
    }
}

external open class ScaleGestureDetector(listener: ScaleGestureDetector.OnScaleGestureListener, handler: Any? = definedExternally /* null */) {
    interface OnScaleGestureListener {
        fun onScale(detector: ScaleGestureDetector): Boolean
        fun onScaleBegin(detector: ScaleGestureDetector): Boolean
        fun onScaleEnd(detector: ScaleGestureDetector)
    }

    open class SimpleOnScaleGestureListener : ScaleGestureDetector.OnScaleGestureListener {
        override fun onScale(detector: ScaleGestureDetector): Boolean = definedExternally
        override fun onScaleBegin(detector: ScaleGestureDetector): Boolean = definedExternally
        override fun onScaleEnd(detector: ScaleGestureDetector): Unit = definedExternally
    }

    open var mListener: Any = definedExternally
    open var mFocusX: Any = definedExternally
    open var mFocusY: Any = definedExternally
    open var mQuickScaleEnabled: Any = definedExternally
    open var mCurrSpan: Any = definedExternally
    open var mPrevSpan: Any = definedExternally
    open var mInitialSpan: Any = definedExternally
    open var mCurrSpanX: Any = definedExternally
    open var mCurrSpanY: Any = definedExternally
    open var mPrevSpanX: Any = definedExternally
    open var mPrevSpanY: Any = definedExternally
    open var mCurrTime: Any = definedExternally
    open var mPrevTime: Any = definedExternally
    open var mInProgress: Any = definedExternally
    open var mSpanSlop: Any = definedExternally
    open var mMinSpan: Any = definedExternally
    open var mTouchUpper: Any = definedExternally
    open var mTouchLower: Any = definedExternally
    open var mTouchHistoryLastAccepted: Any = definedExternally
    open var mTouchHistoryDirection: Any = definedExternally
    open var mTouchHistoryLastAcceptedTime: Any = definedExternally
    open var mTouchMinMajor: Any = definedExternally
    open var mDoubleTapEvent: Any = definedExternally
    open var mDoubleTapMode: Any = definedExternally
    open var mHandler: Any = definedExternally
    open var mGestureDetector: Any = definedExternally
    open var mEventBeforeOrAboveStartingGestureEvent: Any = definedExternally
    open fun addTouchHistory(ev: Any): Unit = definedExternally
    open fun clearTouchHistory(): Unit = definedExternally
    open fun onTouchEvent(event: MotionEvent): Boolean = definedExternally
    open fun inDoubleTapMode(): Unit = definedExternally
    open fun setQuickScaleEnabled(scales: Boolean): Unit = definedExternally
    open fun isQuickScaleEnabled(): Boolean = definedExternally
    open fun isInProgress(): Boolean = definedExternally
    open fun getFocusX(): Number = definedExternally
    open fun getFocusY(): Number = definedExternally
    open fun getCurrentSpan(): Number = definedExternally
    open fun getCurrentSpanX(): Number = definedExternally
    open fun getCurrentSpanY(): Number = definedExternally
    open fun getPreviousSpan(): Number = definedExternally
    open fun getPreviousSpanX(): Number = definedExternally
    open fun getPreviousSpanY(): Number = definedExternally
    open fun getScaleFactor(): Number = definedExternally
    open fun getTimeDelta(): Number = definedExternally
    open fun getEventTime(): Number = definedExternally

    companion object {
        var TAG: Any = definedExternally
        var TOUCH_STABILIZE_TIME: Any = definedExternally
        var DOUBLE_TAP_MODE_NONE: Any = definedExternally
        var DOUBLE_TAP_MODE_IN_PROGRESS: Any = definedExternally
        var SCALE_FACTOR: Any = definedExternally
    }
}

external open class GestureDetector(listener: GestureDetector.OnGestureListener, handler: Any? = definedExternally /* null */) {
    interface OnGestureListener {
        fun onDown(e: MotionEvent): Boolean
        fun onShowPress(e: MotionEvent)
        fun onSingleTapUp(e: MotionEvent): Boolean
        fun onScroll(e1: MotionEvent, e2: MotionEvent, distanceX: Number, distanceY: Number): Boolean
        fun onLongPress(e: MotionEvent)
        fun onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Number, velocityY: Number): Boolean
    }

    interface OnDoubleTapListener {
        fun onSingleTapConfirmed(e: MotionEvent): Boolean
        fun onDoubleTap(e: MotionEvent): Boolean
        fun onDoubleTapEvent(e: MotionEvent): Boolean
    }

    open class SimpleOnGestureListener : GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
        override fun onSingleTapUp(e: MotionEvent): Boolean = definedExternally
        override fun onLongPress(e: MotionEvent): Unit = definedExternally
        override fun onScroll(e1: MotionEvent, e2: MotionEvent, distanceX: Number, distanceY: Number): Boolean = definedExternally
        override fun onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Number, velocityY: Number): Boolean = definedExternally
        override fun onShowPress(e: MotionEvent): Unit = definedExternally
        override fun onDown(e: MotionEvent): Boolean = definedExternally
        override fun onDoubleTap(e: MotionEvent): Boolean = definedExternally
        override fun onDoubleTapEvent(e: MotionEvent): Boolean = definedExternally
        override fun onSingleTapConfirmed(e: MotionEvent): Boolean = definedExternally
    }

    open class GestureHandler(arg: GestureDetector) : Handler {
        open var _GestureDetector_this: GestureDetector = definedExternally
        override fun handleMessage(msg: Message): Unit = definedExternally
    }

    open var mTouchSlopSquare: Any = definedExternally
    open var mDoubleTapTouchSlopSquare: Any = definedExternally
    open var mDoubleTapSlopSquare: Any = definedExternally
    open var mMinimumFlingVelocity: Any = definedExternally
    open var mMaximumFlingVelocity: Any = definedExternally
    open var mHandler: Any = definedExternally
    open var mListener: Any = definedExternally
    open var mDoubleTapListener: Any = definedExternally
    open var mStillDown: Any = definedExternally
    open var mDeferConfirmSingleTap: Any = definedExternally
    open var mInLongPress: Any = definedExternally
    open var mAlwaysInTapRegion: Any = definedExternally
    open var mAlwaysInBiggerTapRegion: Any = definedExternally
    open var mCurrentDownEvent: Any = definedExternally
    open var mPreviousUpEvent: Any = definedExternally
    open var mIsDoubleTapping: Any = definedExternally
    open var mLastFocusX: Any = definedExternally
    open var mLastFocusY: Any = definedExternally
    open var mDownFocusX: Any = definedExternally
    open var mDownFocusY: Any = definedExternally
    open var mIsLongpressEnabled: Any = definedExternally
    open var mVelocityTracker: Any = definedExternally
    open fun init(): Unit = definedExternally
    open fun setOnDoubleTapListener(onDoubleTapListener: GestureDetector.OnDoubleTapListener): Unit = definedExternally
    open fun setIsLongpressEnabled(isLongpressEnabled: Boolean): Unit = definedExternally
    open fun isLongpressEnabled(): Boolean = definedExternally
    open fun onTouchEvent(ev: MotionEvent): Boolean = definedExternally
    open fun cancel(): Unit = definedExternally
    open fun cancelTaps(): Unit = definedExternally
    open fun isConsideredDoubleTap(firstDown: Any, firstUp: Any, secondDown: Any): Unit = definedExternally
    open fun dispatchLongPress(): Unit = definedExternally

    companion object {
        var LONGPRESS_TIMEOUT: Any = definedExternally
        var TAP_TIMEOUT: Any = definedExternally
        var DOUBLE_TAP_TIMEOUT: Any = definedExternally
        var DOUBLE_TAP_MIN_TIME: Any = definedExternally
        var SHOW_PRESS: Any = definedExternally
        var LONG_PRESS: Any = definedExternally
        var TAP: Any = definedExternally
    }
}

external open class SoundEffectConstants {
    companion object {
        var CLICK: Number = definedExternally
        var NAVIGATION_LEFT: Number = definedExternally
        var NAVIGATION_UP: Number = definedExternally
        var NAVIGATION_RIGHT: Number = definedExternally
        var NAVIGATION_DOWN: Number = definedExternally
        fun getContantForFocusDirection(direction: Number): Number = definedExternally
    }
}

external open class HapticFeedbackConstants {
    companion object {
        var LONG_PRESS: Number = definedExternally
        var VIRTUAL_KEY: Number = definedExternally
        var KEYBOARD_TAP: Number = definedExternally
        var SAFE_MODE_DISABLED: Number = definedExternally
        var SAFE_MODE_ENABLED: Number = definedExternally
        var FLAG_IGNORE_VIEW_SETTING: Number = definedExternally
        var FLAG_IGNORE_GLOBAL_SETTING: Number = definedExternally
    }
}

external open class MenuItem(menu: Menu, group: Number, id: Number, categoryOrder: Number, ordering: Number, title: String) {
    interface OnMenuItemClickListener {
        fun onMenuItemClick(item: MenuItem): Boolean
    }

    open var mId: Any = definedExternally
    open var mGroup: Any = definedExternally
    open var mCategoryOrder: Any = definedExternally
    open var mOrdering: Any = definedExternally
    open var mTitle: Any = definedExternally
    open var mIntent: Any = definedExternally
    open var mIconDrawable: Any = definedExternally
    open var mVisible: Any = definedExternally
    open var mEnable: Any = definedExternally
    open var mClickListener: Any = definedExternally
    open var mActionView: Any = definedExternally
    open var mMenu: Any = definedExternally
    open fun getItemId(): Number = definedExternally
    open fun getGroupId(): Number = definedExternally
    open fun getOrder(): Number = definedExternally
    open fun setTitle(title: String): MenuItem = definedExternally
    open fun getTitle(): String = definedExternally
    open fun setIcon(icon: Drawable): MenuItem = definedExternally
    open fun getIcon(): Drawable = definedExternally
    open fun setIntent(intent: Intent): MenuItem = definedExternally
    open fun getIntent(): Intent = definedExternally
    open fun setVisible(visible: Boolean): MenuItem = definedExternally
    open fun isVisible(): Boolean = definedExternally
    open fun setEnabled(enabled: Boolean): MenuItem = definedExternally
    open fun isEnabled(): Boolean = definedExternally
    open fun setOnMenuItemClickListener(menuItemClickListener: MenuItem.OnMenuItemClickListener): MenuItem = definedExternally
    open fun setActionView(view: View): MenuItem = definedExternally
    open fun getActionView(): View = definedExternally
    open fun invoke(): Boolean = definedExternally
}

external open class Menu(context: Context) {
    interface Callback {
        fun onMenuItemSelected(menu: Menu, item: MenuItem): Boolean;
    }
    open var mItems: Any = definedExternally
    open var mVisibleItems: Any = definedExternally
    open var mCallback: Any = definedExternally
    open var mContext: Any = definedExternally
    open fun getContext(): Context = definedExternally
    open fun add(title: String): MenuItem = definedExternally
    open fun add(groupId: Number, itemId: Number, order: Number, title: String): MenuItem = definedExternally
    open fun addInternal(group: Any, id: Any, categoryOrder: Any, title: Any): Unit = definedExternally
    open fun removeItem(id: Number): Unit = definedExternally
    open fun removeGroup(groupId: Number): Unit = definedExternally
    open fun removeItemAtInt(index: Any, updateChildrenOnMenuViews: Any): Unit = definedExternally
    open fun clear(): Unit = definedExternally
    open fun setGroupVisible(group: Number, visible: Boolean): Unit = definedExternally
    open fun setGroupEnabled(group: Number, enabled: Boolean): Unit = definedExternally
    open fun hasVisibleItems(): Boolean = definedExternally
    open fun findItem(id: Number): MenuItem = definedExternally
    open fun findItemIndex(id: Number): Number = definedExternally
    open fun findGroupIndex(group: Number, start: Number? = definedExternally /* null */): Number = definedExternally
    open fun size(): Number = definedExternally
    open fun getItem(index: Number): MenuItem = definedExternally
    open fun onItemsChanged(structureChanged: Boolean): Unit = definedExternally
    open fun getRootMenu(): Menu = definedExternally
    open fun setCallback(cb: Menu.Callback): Unit = definedExternally
    open fun dispatchMenuItemSelected(menu: Menu, item: MenuItem): Boolean = definedExternally
    open fun getVisibleItems(): ArrayList<MenuItem> = definedExternally
}
