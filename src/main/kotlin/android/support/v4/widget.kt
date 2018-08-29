@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.support.v4.widget")
package android.support.v4.widget

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
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

external open class ViewDragHelper(forParent: ViewGroup, cb: ViewDragHelper.Callback) {
    open class Callback {
        open fun onViewDragStateChanged(state: Number): Unit = definedExternally
        open fun onViewPositionChanged(changedView: View, left: Number, top: Number, dx: Number, dy: Number): Unit = definedExternally
        open fun onViewCaptured(capturedChild: View, activePointerId: Number): Unit = definedExternally
        open fun onViewReleased(releasedChild: View, xvel: Number, yvel: Number): Unit = definedExternally
        open fun onEdgeTouched(edgeFlags: Number, pointerId: Number): Unit = definedExternally
        open fun onEdgeLock(edgeFlags: Number): Boolean = definedExternally
        open fun onEdgeDragStarted(edgeFlags: Number, pointerId: Number): Unit = definedExternally
        open fun getOrderedChildIndex(index: Number): Number = definedExternally
        open fun getViewHorizontalDragRange(child: View): Number = definedExternally
        open fun getViewVerticalDragRange(child: View): Number = definedExternally
        open fun tryCaptureView(child: View, pointerId: Number): Boolean = definedExternally
        open fun clampViewPositionHorizontal(child: View, left: Number, dx: Number): Number = definedExternally
        open fun clampViewPositionVertical(child: View, top: Number, dy: Number): Number = definedExternally
    }

    open var mDragState: Any = definedExternally
    open var mTouchSlop: Any = definedExternally
    open var mActivePointerId: Any = definedExternally
    open var mInitialMotionX: Any = definedExternally
    open var mInitialMotionY: Any = definedExternally
    open var mLastMotionX: Any = definedExternally
    open var mLastMotionY: Any = definedExternally
    open var mInitialEdgesTouched: Any = definedExternally
    open var mEdgeDragsInProgress: Any = definedExternally
    open var mEdgeDragsLocked: Any = definedExternally
    open var mPointersDown: Any = definedExternally
    open var mVelocityTracker: Any = definedExternally
    open var mMaxVelocity: Any = definedExternally
    open var mMinVelocity: Any = definedExternally
    open var mEdgeSize: Any = definedExternally
    open var mTrackingEdges: Any = definedExternally
    open var mScroller: Any = definedExternally
    open var mCallback: Any = definedExternally
    open var mCapturedView: Any = definedExternally
    open var mReleaseInProgress: Any = definedExternally
    open var mParentView: Any = definedExternally
    open var mSetIdleRunnable: Any = definedExternally
    open fun setMinVelocity(minVel: Number): Unit = definedExternally
    open fun getMinVelocity(): Number = definedExternally
    open fun getViewDragState(): Number = definedExternally
    open fun setEdgeTrackingEnabled(edgeFlags: Number): Unit = definedExternally
    open fun getEdgeSize(): Number = definedExternally
    open fun captureChildView(childView: View, activePointerId: Number): Unit = definedExternally
    open fun getCapturedView(): View = definedExternally
    open fun getActivePointerId(): Number = definedExternally
    open fun getTouchSlop(): Number = definedExternally
    open fun cancel(): Unit = definedExternally
    open fun abort(): Unit = definedExternally
    open fun smoothSlideViewTo(child: View, finalLeft: Number, finalTop: Number): Boolean = definedExternally
    open fun settleCapturedViewAt(finalLeft: Number, finalTop: Number): Boolean = definedExternally
    open fun forceSettleCapturedViewAt(finalLeft: Any, finalTop: Any, xvel: Any, yvel: Any): Unit = definedExternally
    open fun computeSettleDuration(child: Any, dx: Any, dy: Any, xvel: Any, yvel: Any): Unit = definedExternally
    open fun computeAxisDuration(delta: Any, velocity: Any, motionRange: Any): Unit = definedExternally
    open fun clampMag(value: Any, absMin: Any, absMax: Any): Unit = definedExternally
    open fun distanceInfluenceForSnapDuration(f: Any): Unit = definedExternally
    open fun flingCapturedView(minLeft: Number, minTop: Number, maxLeft: Number, maxTop: Number): Unit = definedExternally
    open fun continueSettling(deferCallbacks: Boolean): Boolean = definedExternally
    open fun dispatchViewReleased(xvel: Any, yvel: Any): Unit = definedExternally
    open fun clearMotionHistory(pointerId: Any? = definedExternally /* null */): Unit = definedExternally
    open fun ensureMotionHistorySizeForId(pointerId: Any): Unit = definedExternally
    open fun saveInitialMotion(x: Any, y: Any, pointerId: Any): Unit = definedExternally
    open fun saveLastMotion(ev: Any): Unit = definedExternally
    open fun isPointerDown(pointerId: Number): Boolean = definedExternally
    open fun setDragState(state: Number): Unit = definedExternally
    open fun tryCaptureViewForDrag(toCapture: View, pointerId: Number): Boolean = definedExternally
    open fun canScroll(v: View, checkV: Boolean, dx: Number, dy: Number, x: Number, y: Number): Boolean = definedExternally
    open fun shouldInterceptTouchEvent(ev: MotionEvent): Boolean = definedExternally
    open fun processTouchEvent(ev: MotionEvent): Unit = definedExternally
    open fun reportNewEdgeDrags(dx: Any, dy: Any, pointerId: Any): Unit = definedExternally
    open fun checkNewEdgeDrag(delta: Any, odelta: Any, pointerId: Any, edge: Any): Unit = definedExternally
    open fun checkTouchSlop(child: View, dx: Number, dy: Number): Boolean = definedExternally
    open fun checkTouchSlop(directions: Number): Boolean = definedExternally
    open fun checkTouchSlop(directions: Number, pointerId: Number): Boolean = definedExternally
    open fun _checkTouchSlop_3(child: Any, dx: Any, dy: Any): Unit = definedExternally
    open fun _checkTouchSlop_1(directions: Any): Unit = definedExternally
    open fun _checkTouchSlop_2(directions: Any, pointerId: Any): Unit = definedExternally
    open fun isEdgeTouched(edges: Number, pointerId: Number? = definedExternally /* null */): Boolean = definedExternally
    open fun releaseViewForPointerUp(): Unit = definedExternally
    open fun dragTo(left: Any, top: Any, dx: Any, dy: Any): Unit = definedExternally
    open fun isCapturedViewUnder(x: Number, y: Number): Boolean = definedExternally
    open fun isViewUnder(view: View, x: Number, y: Number): Boolean = definedExternally
    open fun findTopChildUnder(x: Number, y: Number): View = definedExternally
    open fun getEdgesTouched(x: Any, y: Any): Unit = definedExternally
    companion object {
        var TAG: Any = definedExternally
        var INVALID_POINTER: Number = definedExternally
        var STATE_IDLE: Number = definedExternally
        var STATE_DRAGGING: Number = definedExternally
        var STATE_SETTLING: Number = definedExternally
        var EDGE_LEFT: Number = definedExternally
        var EDGE_RIGHT: Number = definedExternally
        var EDGE_TOP: Number = definedExternally
        var EDGE_BOTTOM: Number = definedExternally
        var EDGE_ALL: Number = definedExternally
        var DIRECTION_HORIZONTAL: Number = definedExternally
        var DIRECTION_VERTICAL: Number = definedExternally
        var DIRECTION_ALL: Number = definedExternally
        var EDGE_SIZE: Any = definedExternally
        var BASE_SETTLE_DURATION: Any = definedExternally
        var MAX_SETTLE_DURATION: Any = definedExternally
        var sInterpolator: Any = definedExternally
        fun create(forParent: ViewGroup, cb: ViewDragHelper.Callback): ViewDragHelper = definedExternally
        fun create(forParent: ViewGroup, sensitivity: Number, cb: ViewDragHelper.Callback): ViewDragHelper = definedExternally
    }
}
external open class DrawerLayout(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : ViewGroup {
    interface DrawerListener {
        fun onDrawerSlide(drawerView: View, slideOffset: Number)
        fun onDrawerOpened(drawerView: View)
        fun onDrawerClosed(drawerView: View)
        fun onDrawerStateChanged(newState: Number)
    }
    open class SimpleDrawerListener : DrawerLayout.DrawerListener {
        override fun onDrawerSlide(drawerView: View, slideOffset: Number): Unit = definedExternally
        override fun onDrawerOpened(drawerView: View): Unit = definedExternally
        override fun onDrawerClosed(drawerView: View): Unit = definedExternally
        override fun onDrawerStateChanged(newState: Number): Unit = definedExternally
    }
    open class ViewDragCallback(arg: DrawerLayout, gravity: Number) : ViewDragHelper.Callback {
        open var _DrawerLayout_this: DrawerLayout = definedExternally
        open var mAbsGravity: Any = definedExternally
        open var mDragger: Any = definedExternally
        open var mPeekRunnable: Any = definedExternally
        open fun setDragger(dragger: ViewDragHelper): Unit = definedExternally
        open fun removeCallbacks(): Unit = definedExternally
        override fun tryCaptureView(child: View, pointerId: Number): Boolean = definedExternally
        override fun onViewDragStateChanged(state: Number): Unit = definedExternally
        override fun onViewPositionChanged(changedView: View, left: Number, top: Number, dx: Number, dy: Number): Unit = definedExternally
        override fun onViewCaptured(capturedChild: View, activePointerId: Number): Unit = definedExternally
        open fun closeOtherDrawer(): Unit = definedExternally
        override fun onViewReleased(releasedChild: View, xvel: Number, yvel: Number): Unit = definedExternally
        override fun onEdgeTouched(edgeFlags: Number, pointerId: Number): Unit = definedExternally
        open fun peekDrawer(): Unit = definedExternally
        override fun onEdgeLock(edgeFlags: Number): Boolean = definedExternally
        override fun onEdgeDragStarted(edgeFlags: Number, pointerId: Number): Unit = definedExternally
        override fun getViewHorizontalDragRange(child: View): Number = definedExternally
        override fun clampViewPositionHorizontal(child: View, left: Number, dx: Number): Number = definedExternally
        override fun clampViewPositionVertical(child: View, top: Number, dy: Number): Number = definedExternally
    }
    open class LayoutParams : ViewGroup.MarginLayoutParams {
        constructor(context: Context, attrs: HTMLElement)
        constructor(width: Number, height: Number)
        constructor(width: Number, height: Number, gravity: Number)
        constructor(source: ViewGroup.LayoutParams)
        constructor(source: ViewGroup.MarginLayoutParams)
        constructor(source: LayoutParams)
        open var gravity: Number = definedExternally
        open var onScreen: Number = definedExternally
        open var isPeeking: Boolean = definedExternally
        open var knownOpen: Boolean = definedExternally
        override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    }

    open var mMinDrawerMargin: Any = definedExternally
    open var mScrimColor: Any = definedExternally
    open var mScrimOpacity: Any = definedExternally
    open var mScrimPaint: Any = definedExternally
    open var mLeftDragger: Any = definedExternally
    open var mRightDragger: Any = definedExternally
    open var mLeftCallback: Any = definedExternally
    open var mRightCallback: Any = definedExternally
    open var mDrawerState: Any = definedExternally
    open var mInLayout: Any = definedExternally
    open var mFirstLayout: Any = definedExternally
    open var mLockModeLeft: Any = definedExternally
    open var mLockModeRight: Any = definedExternally
    open var mDisallowInterceptRequested: Any = definedExternally
    open var mChildrenCanceledTouch: Any = definedExternally
    open var mListener: Any = definedExternally
    open var mInitialMotionX: Any = definedExternally
    open var mInitialMotionY: Any = definedExternally
    open var mShadowLeft: Any = definedExternally
    open var mShadowRight: Any = definedExternally
    open fun setDrawerShadow(shadowDrawable: Drawable, gravity: Number): Unit = definedExternally
    open fun setScrimColor(color: Number): Unit = definedExternally
    open fun setDrawerListener(listener: DrawerLayout.DrawerListener): Unit = definedExternally
    open fun setDrawerLockMode(lockMode: Number, edgeGravityOrView: Number? = definedExternally /* null */): Unit = definedExternally
    open fun setDrawerLockMode(lockMode: Number, edgeGravityOrView: View? = definedExternally /* null */): Unit = definedExternally
    open fun getDrawerLockMode(edgeGravityOrView: Number): Number = definedExternally
    open fun getDrawerLockMode(edgeGravityOrView: View): Number = definedExternally
    open fun updateDrawerState(forGravity: Number, activeState: Number, activeDrawer: View): Unit = definedExternally
    open fun dispatchOnDrawerClosed(drawerView: View): Unit = definedExternally
    open fun dispatchOnDrawerOpened(drawerView: View): Unit = definedExternally
    open fun dispatchOnDrawerSlide(drawerView: View, slideOffset: Number): Unit = definedExternally
    open fun setDrawerViewOffset(drawerView: View, slideOffset: Number): Unit = definedExternally
    open fun getDrawerViewOffset(drawerView: View): Number = definedExternally
    open fun getDrawerViewAbsoluteGravity(drawerView: View): Number = definedExternally
    open fun checkDrawerViewAbsoluteGravity(drawerView: View, checkFor: Number): Boolean = definedExternally
    open fun findOpenDrawer(): View = definedExternally
    open fun moveDrawerToOffset(drawerView: View, slideOffset: Number): Unit = definedExternally
    open fun findDrawerWithGravity(gravity: Number): View = definedExternally
    override fun onDetachedFromWindow(): Unit = definedExternally
    override fun onAttachedToWindow(): Unit = definedExternally
    override fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    override fun onLayout(changed: Boolean, l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
    override fun requestLayout(): Unit = definedExternally
    override fun computeScroll(): Unit = definedExternally
    override fun drawChild(canvas: Canvas, child: View, drawingTime: Number): Boolean = definedExternally
    open fun isContentView(child: View): Boolean = definedExternally
    open fun isDrawerView(child: View): Boolean = definedExternally
    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean = definedExternally
    override fun onTouchEvent(ev: MotionEvent): Boolean = definedExternally
    override fun requestDisallowInterceptTouchEvent(disallowIntercept: Boolean): Unit = definedExternally
    open fun closeDrawers(peekingOnly: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun openDrawer(drawerView: View): Unit = definedExternally
    open fun openDrawer(gravity: Number): Unit = definedExternally
    open fun _openDrawer_view(drawerView: Any): Unit = definedExternally
    open fun _openDrawer_gravity(gravity: Any): Unit = definedExternally
    open fun closeDrawer(drawerView: View): Unit = definedExternally
    open fun closeDrawer(gravity: Number): Unit = definedExternally
    open fun _closeDrawer_view(drawerView: Any): Unit = definedExternally
    open fun _closeDrawer_gravity(gravity: Any): Unit = definedExternally
    open fun isDrawerOpen(drawer: View): Boolean = definedExternally
    open fun isDrawerOpen(drawerGravity: Number): Boolean = definedExternally
    open fun _isDrawerOpen_view(drawer: Any): Unit = definedExternally
    open fun _isDrawerOpen_gravity(drawerGravity: Any): Unit = definedExternally
    open fun isDrawerVisible(drawer: View): Boolean = definedExternally
    open fun isDrawerVisible(drawerGravity: Number): Boolean = definedExternally
    open fun _isDrawerVisible_view(drawer: Any): Unit = definedExternally
    open fun _isDrawerVisible_gravity(drawerGravity: Any): Unit = definedExternally
    open fun hasPeekingDrawer(): Unit = definedExternally
    override fun generateDefaultLayoutParams(): ViewGroup.LayoutParams = definedExternally
    override fun generateLayoutParams(p: ViewGroup.LayoutParams): ViewGroup.LayoutParams = definedExternally
    override fun checkLayoutParams(p: ViewGroup.LayoutParams): Boolean = definedExternally
    override fun generateLayoutParamsFromAttr(attrs: HTMLElement): android.view.ViewGroup.LayoutParams = definedExternally
    open fun hasVisibleDrawer(): Unit = definedExternally
    open fun findVisibleDrawer(): Unit = definedExternally
    open fun cancelChildViewTouch(): Unit = definedExternally
    override fun onKeyDown(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    override fun onKeyUp(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    companion object {
        var TAG: Any = definedExternally
        var STATE_IDLE: Number = definedExternally
        var STATE_DRAGGING: Number = definedExternally
        var STATE_SETTLING: Number = definedExternally
        var LOCK_MODE_UNLOCKED: Number = definedExternally
        var LOCK_MODE_LOCKED_CLOSED: Number = definedExternally
        var LOCK_MODE_LOCKED_OPEN: Number = definedExternally
        var MIN_DRAWER_MARGIN: Any = definedExternally
        var DEFAULT_SCRIM_COLOR: Any = definedExternally
        var PEEK_DELAY: Number = definedExternally
        var MIN_FLING_VELOCITY: Any = definedExternally
        var ALLOW_EDGE_LOCK: Boolean = definedExternally
        var CHILDREN_DISALLOW_INTERCEPT: Any = definedExternally
        var TOUCH_SLOP_SENSITIVITY: Any = definedExternally
        fun gravityToString(gravity: Number): String = definedExternally
        fun hasOpaqueBackground(v: Any): Unit = definedExternally
    }
}
