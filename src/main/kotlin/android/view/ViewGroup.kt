@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.view")

package android.view

import android.content.Context
import android.graphics.*
import android.graphics.drawable.Drawable
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


external open class ViewGroup(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : View, ViewParent {

    open class LayoutParams : java.lang.JavaObject {
        constructor(context: Context, attrs: HTMLElement)
        constructor(width: Number, height: Number)
        constructor(src: LayoutParams)
        constructor(vararg args: Any)

        open var width: Number = definedExternally
        open var height: Number = definedExternally
        open var _attrBinder: Any = definedExternally
        open fun setBaseAttributes(a: android.content.res.TypedArray, widthAttr: String, heightAttr: String): Unit = definedExternally
        open fun getAttrBinder(): AttrBinder = definedExternally
        open fun initBindAttr(): Unit = definedExternally
        open fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally

        companion object {
            var ClassAttrBinderClazzMap: Any = definedExternally
            var FILL_PARENT: Number = definedExternally
            var MATCH_PARENT: Number = definedExternally
            var WRAP_CONTENT: Number = definedExternally
        }
    }

    open class MarginLayoutParams : LayoutParams {
        constructor(context: Context, attrs: HTMLElement)
        constructor(src: MarginLayoutParams)
        constructor(src: LayoutParams)
        constructor(width: Number, height: Number)
        constructor(vararg args: Any)

        open var leftMargin: Number = definedExternally
        open var topMargin: Number = definedExternally
        open var rightMargin: Number = definedExternally
        open var bottomMargin: Number = definedExternally
        override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
        open fun setMargins(left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
        open fun setLayoutDirection(layoutDirection: Number): Unit = definedExternally
        open fun getLayoutDirection(): Number = definedExternally
        open fun isLayoutRtl(): Boolean = definedExternally
        open fun resolveLayoutDirection(layoutDirection: Number): Unit = definedExternally

        companion object {
            var DEFAULT_MARGIN_RELATIVE: Number = definedExternally
            var DEFAULT_MARGIN_RESOLVED: Number = definedExternally
            var UNDEFINED_MARGIN: Number = definedExternally
        }
    }

    interface OnHierarchyChangeListener {
        fun onChildViewAdded(parent: View, child: View): Any
        fun onChildViewRemoved(parent: View, child: View): Any
    }

    open var mPersistentDrawingCache: Number = definedExternally
    open var mDisappearingChildren: ArrayList<View> = definedExternally
    open var mOnHierarchyChangeListener: ViewGroup.OnHierarchyChangeListener = definedExternally
    open var mFocused: Any = definedExternally
    open var mFirstTouchTarget: Any = definedExternally
    open var mChildTransformation: Any = definedExternally
    open var mInvalidateRegion: RectF = definedExternally
    open var mLastTouchDownTime: Any = definedExternally
    open var mLastTouchDownIndex: Any = definedExternally
    open var mLastTouchDownX: Any = definedExternally
    open var mLastTouchDownY: Any = definedExternally
    open var mGroupFlags: Number = definedExternally
    open var mLayoutMode: Number = definedExternally
    open var mChildren: Array<View> = definedExternally
    open var mChildrenCount: Number = definedExternally
    open var mSuppressLayout: Boolean = definedExternally
    open var mLayoutCalledWhileSuppressed: Any = definedExternally
    open var mChildCountWithTransientState: Any = definedExternally
    open fun initViewGroup(): Unit = definedExternally
    open fun initFromAttributes(context: Any, attrs: Any, defStyle: Any? = definedExternally /* null */): Unit = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    open fun getDescendantFocusability(): Number = definedExternally
    open fun setDescendantFocusability(focusability: Number): Unit = definedExternally
    override fun handleFocusGainInternal(direction: Number, previouslyFocusedRect: Rect): Unit = definedExternally
    override fun requestChildFocus(child: View, focused: View): Unit = definedExternally
    override fun focusableViewAvailable(v: View): Unit = definedExternally
    override fun focusSearch(direction: Number): View = definedExternally
    override fun focusSearch(focused: View, direction: Number): View = definedExternally
    override fun requestChildRectangleOnScreen(child: View, rectangle: Rect, immediate: Boolean): Boolean = definedExternally
    override fun childHasTransientStateChanged(child: View, childHasTransientState: Boolean): Unit = definedExternally
    override fun hasTransientState(): Boolean = definedExternally
    override fun dispatchUnhandledMove(focused: android.view.View, direction: Number): Boolean = definedExternally
    override fun clearChildFocus(child: View): Unit = definedExternally
    override fun clearFocus(): Unit = definedExternally
    override fun unFocus(): Unit = definedExternally
    open fun getFocusedChild(): View = definedExternally
    override fun hasFocus(): Boolean = definedExternally
    override fun findFocus(): View = definedExternally
    override fun hasFocusable(): Boolean = definedExternally
    override fun addFocusables(views: ArrayList<View>, direction: Number): Unit = definedExternally
    override fun addFocusables(views: ArrayList<View>, direction: Number, focusableMode: Number?): Unit = definedExternally
    override fun requestFocus(direction: Number?, previouslyFocusedRect: Any?): Boolean = definedExternally
    open fun onRequestFocusInDescendants(direction: Number, previouslyFocusedRect: Rect): Boolean = definedExternally
    //    open fun addView(view: View): Any = definedExternally
    open fun addView(view: View): Unit = definedExternally

    open fun addView(view: View, index: Number): Any = definedExternally
    open fun addView(view: View, params: ViewGroup.LayoutParams): Any = definedExternally
    open fun addView(view: View, index: Number, params: ViewGroup.LayoutParams): Any = definedExternally
    open fun addView(view: View, width: Number, height: Number): Any = definedExternally
    open fun addView(vararg args: Any): Any = definedExternally
    open fun checkLayoutParams(p: ViewGroup.LayoutParams): Boolean = definedExternally
    open fun setOnHierarchyChangeListener(listener: ViewGroup.OnHierarchyChangeListener): Unit = definedExternally
    open fun onViewAdded(child: View): Unit = definedExternally
    open fun onViewRemoved(child: View): Unit = definedExternally
    open fun clearCachedLayoutMode(): Unit = definedExternally
    open fun addViewInLayout(child: View, index: Number, params: ViewGroup.LayoutParams, preventRequestLayout: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun cleanupLayoutState(child: View): Unit = definedExternally
    open fun addViewInner(child: View, index: Number, params: ViewGroup.LayoutParams, preventRequestLayout: Boolean): Unit = definedExternally
    open fun addInArray(child: Any, index: Any): Unit = definedExternally
    open fun addToBindElement(childElement: Any, insertBeforeElement: Any): Unit = definedExternally
    open fun removeChildElement(childElement: Any): Unit = definedExternally
    open fun removeFromArray(index: Any, count: Any? = definedExternally /* null */): Unit = definedExternally
    open fun removeView(view: View): Unit = definedExternally
    open fun removeViewInLayout(view: View): Unit = definedExternally
    open fun removeViewsInLayout(start: Number, count: Number): Unit = definedExternally
    open fun removeViewAt(index: Number): Unit = definedExternally
    open fun removeViews(start: Number, count: Number): Unit = definedExternally
    open fun removeViewInternal(view: Any): Unit = definedExternally
    open fun removeViewsInternal(start: Any, count: Any): Unit = definedExternally
    open fun removeAllViews(): Unit = definedExternally
    open fun removeAllViewsInLayout(): Unit = definedExternally
    open fun detachViewFromParent(child: View): Unit = definedExternally
    open fun detachViewFromParent(child: Number): Unit = definedExternally
    open fun removeDetachedView(child: View, animate: Boolean): Unit = definedExternally
    open fun attachViewToParent(child: View, index: Number, params: ViewGroup.LayoutParams): Unit = definedExternally
    open fun detachViewsFromParent(start: Number, count: Number? = definedExternally /* null */): Unit = definedExternally
    open fun detachAllViewsFromParent(): Unit = definedExternally
    open fun indexOfChild(child: View): Number = definedExternally
    open fun getChildCount(): Int = definedExternally
    open fun getChildAt(index: Number): View = definedExternally
    override fun bringChildToFront(child: View): Unit = definedExternally
    open fun hasBooleanFlag(flag: Number): Boolean = definedExternally
    open fun setBooleanFlag(flag: Number, value: Boolean): Unit = definedExternally
    override fun dispatchGenericPointerEvent(event: MotionEvent): Boolean = definedExternally
    open fun dispatchTransformedGenericPointerEvent(event: Any, child: Any): Unit = definedExternally
    override fun dispatchKeyEvent(event: android.view.KeyEvent): Boolean = definedExternally
    override fun dispatchWindowFocusChanged(hasFocus: Boolean): Unit = definedExternally
    //    override fun addTouchables(views: java.util.ArrayList<android.view.View>): Unit = definedExternally
    open fun addTouchables(views: java.util.ArrayList<android.view.View>): Unit = definedExternally

    open fun onInterceptTouchEvent(ev: MotionEvent): Boolean = definedExternally
    override fun dispatchTouchEvent(ev: MotionEvent): Boolean = definedExternally
    open fun resetTouchState(): Unit = definedExternally
    open fun clearTouchTargets(): Unit = definedExternally
    open fun cancelAndClearTouchTargets(event: Any): Unit = definedExternally
    open fun getTouchTarget(child: Any): Unit = definedExternally
    open fun addTouchTarget(child: Any, pointerIdBits: Any): Unit = definedExternally
    open fun removePointersFromTouchTargets(pointerIdBits: Any): Unit = definedExternally
    open fun cancelTouchTarget(view: Any): Unit = definedExternally
    open fun isTransformedTouchPointInView(x: Number, y: Number, child: View, outLocalPoint: Point): Boolean = definedExternally
    open fun dispatchTransformedTouchEvent(event: Any, cancel: Any, child: Any, desiredPointerIdBits: Any): Unit = definedExternally
    open fun setMotionEventSplittingEnabled(split: Boolean): Unit = definedExternally
    open fun isMotionEventSplittingEnabled(): Boolean = definedExternally
    open fun isAnimationCacheEnabled(): Boolean = definedExternally
    open fun setAnimationCacheEnabled(enabled: Boolean): Unit = definedExternally
    open fun isAlwaysDrawnWithCacheEnabled(): Boolean = definedExternally
    open fun setAlwaysDrawnWithCacheEnabled(always: Boolean): Unit = definedExternally
    open fun isChildrenDrawnWithCacheEnabled(): Boolean = definedExternally
    open fun setChildrenDrawnWithCacheEnabled(enabled: Boolean): Unit = definedExternally
    open fun setChildrenDrawingCacheEnabled(enabled: Boolean): Unit = definedExternally
    override fun onAnimationStart(): Unit = definedExternally
    override fun onAnimationEnd(): Unit = definedExternally
    open fun getPersistentDrawingCache(): Number = definedExternally
    open fun setPersistentDrawingCache(drawingCacheToKeep: Number): Unit = definedExternally
    open fun isChildrenDrawingOrderEnabled(): Boolean = definedExternally
    open fun setChildrenDrawingOrderEnabled(enabled: Boolean): Unit = definedExternally
    open fun getChildDrawingOrder(childCount: Number, i: Number): Number = definedExternally
    open fun generateLayoutParamsFromAttr(attrs: HTMLElement): ViewGroup.LayoutParams = definedExternally
    open fun generateLayoutParams(p: ViewGroup.LayoutParams): ViewGroup.LayoutParams = definedExternally
    open fun generateDefaultLayoutParams(): ViewGroup.LayoutParams = definedExternally
    open fun measureChildren(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    open fun measureChild(child: View, parentWidthMeasureSpec: Number, parentHeightMeasureSpec: Number): Unit = definedExternally
    open fun measureChildWithMargins(child: View, parentWidthMeasureSpec: Number, widthUsed: Number, parentHeightMeasureSpec: Number, heightUsed: Number): Unit = definedExternally
    open fun clearDisappearingChildren(): Unit = definedExternally
    open fun addDisappearingView(v: Any): Unit = definedExternally
    open fun finishAnimatingView(view: View, animation: Animation): Unit = definedExternally
    override fun dispatchAttachedToWindow(info: View.AttachInfo, visibility: Number): Unit = definedExternally
    override fun onAttachedToWindow(): Unit = definedExternally
    override fun onDetachedFromWindow(): Unit = definedExternally
    override fun dispatchDetachedFromWindow(): Unit = definedExternally
    override fun dispatchDisplayHint(hint: Number): Unit = definedExternally
    open fun onChildVisibilityChanged(child: View, oldVisibility: Number, newVisibility: Number): Unit = definedExternally
    override fun dispatchVisibilityChanged(changedView: View, visibility: Number): Unit = definedExternally
    override fun dispatchSetSelected(selected: Boolean): Unit = definedExternally
    override fun dispatchSetActivated(activated: Boolean): Unit = definedExternally
    override fun dispatchSetPressed(pressed: Boolean): Unit = definedExternally
    override fun dispatchCancelPendingInputEvents(): Unit = definedExternally
    open fun offsetDescendantRectToMyCoords(descendant: View, rect: Rect): Unit = definedExternally
    open fun offsetRectIntoDescendantCoords(descendant: View, rect: Rect): Unit = definedExternally
    open fun offsetRectBetweenParentAndChild(descendant: View, rect: Rect, offsetFromChildToParent: Boolean, clipToBounds: Boolean): Unit = definedExternally
    open fun offsetChildrenTopAndBottom(offset: Number): Unit = definedExternally
    open fun suppressLayout(suppress: Boolean): Unit = definedExternally
    open fun isLayoutSuppressed(): Boolean = definedExternally
    override fun layout(l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
    open fun canAnimate(): Boolean = definedExternally
    override fun onLayout(changed: Boolean, l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
    override fun getChildVisibleRect(child: View, r: Rect, offset: Point): Boolean = definedExternally
    override fun dispatchDraw(canvas: Canvas): Unit = definedExternally
    open fun drawChild(canvas: Canvas, child: View, drawingTime: Number): Boolean = definedExternally
    override fun drawableStateChanged(): Unit = definedExternally
    override fun jumpDrawablesToCurrentState(): Unit = definedExternally
    override fun onCreateDrawableState(extraSpace: Number): Array<Number> = definedExternally
    open fun setAddStatesFromChildren(addsStates: Boolean): Unit = definedExternally
    open fun addStatesFromChildren(): Boolean = definedExternally
    override fun childDrawableStateChanged(child: android.view.View): Unit = definedExternally
    open fun getClipChildren(): Boolean = definedExternally
    open fun setClipChildren(clipChildren: Boolean): Unit = definedExternally
    open fun setClipToPadding(clipToPadding: Boolean): Unit = definedExternally
    open fun isClipToPadding(): Boolean = definedExternally
    override fun invalidateChild(child: View, dirty: Rect): Unit = definedExternally
    override fun invalidateChildInParent(location: Array<Number>, dirty: Rect): ViewParent = definedExternally
    open fun invalidateChildFast(child: View, dirty: Rect): Unit = definedExternally
    open fun invalidateChildInParentFast(left: Number, top: Number, dirty: Rect): ViewParent = definedExternally
    open fun getChildStaticTransformation(child: View, t: Transformation): Boolean = definedExternally
    open fun getChildTransformation(): Transformation = definedExternally
    override fun findViewTraversal(id: String): View = definedExternally
    override fun findViewWithTagTraversal(tag: Any): View = definedExternally
    override fun findViewByPredicateTraversal(predicate: View.Predicate<View>, childToSkip: View): View = definedExternally
    override fun requestDisallowInterceptTouchEvent(disallowIntercept: Boolean): Unit = definedExternally
    open fun shouldDelayChildPressedState(): Boolean = definedExternally
    open fun onSetLayoutParams(child: View, layoutParams: ViewGroup.LayoutParams): Unit = definedExternally

    companion object {
        var FLAG_CLIP_CHILDREN: Number = definedExternally
        var FLAG_CLIP_TO_PADDING: Number = definedExternally
        var FLAG_INVALIDATE_REQUIRED: Number = definedExternally
        var FLAG_RUN_ANIMATION: Number = definedExternally
        var FLAG_ANIMATION_DONE: Number = definedExternally
        var FLAG_PADDING_NOT_NULL: Number = definedExternally
        var FLAG_ANIMATION_CACHE: Number = definedExternally
        var FLAG_OPTIMIZE_INVALIDATE: Number = definedExternally
        var FLAG_CLEAR_TRANSFORMATION: Number = definedExternally
        var FLAG_NOTIFY_ANIMATION_LISTENER: Number = definedExternally
        var FLAG_USE_CHILD_DRAWING_ORDER: Number = definedExternally
        var FLAG_SUPPORT_STATIC_TRANSFORMATIONS: Number = definedExternally
        var FLAG_ALPHA_LOWER_THAN_ONE: Number = definedExternally
        var FLAG_ADD_STATES_FROM_CHILDREN: Number = definedExternally
        var FLAG_ALWAYS_DRAWN_WITH_CACHE: Number = definedExternally
        var FLAG_CHILDREN_DRAWN_WITH_CACHE: Number = definedExternally
        var FLAG_NOTIFY_CHILDREN_ON_DRAWABLE_STATE_CHANGE: Number = definedExternally
        var FLAG_MASK_FOCUSABILITY: Number = definedExternally
        var FOCUS_BEFORE_DESCENDANTS: Number = definedExternally
        var FOCUS_AFTER_DESCENDANTS: Number = definedExternally
        var FOCUS_BLOCK_DESCENDANTS: Number = definedExternally
        var FLAG_DISALLOW_INTERCEPT: Number = definedExternally
        var FLAG_SPLIT_MOTION_EVENTS: Number = definedExternally
        var FLAG_PREVENT_DISPATCH_ATTACHED_TO_WINDOW: Number = definedExternally
        var FLAG_LAYOUT_MODE_WAS_EXPLICITLY_SET: Number = definedExternally
        var PERSISTENT_NO_CACHE: Number = definedExternally
        var PERSISTENT_ANIMATION_CACHE: Number = definedExternally
        var PERSISTENT_SCROLLING_CACHE: Number = definedExternally
        var PERSISTENT_ALL_CACHES: Number = definedExternally
        var LAYOUT_MODE_UNDEFINED: Number = definedExternally
        var LAYOUT_MODE_CLIP_BOUNDS: Number = definedExternally
        var LAYOUT_MODE_DEFAULT: Number = definedExternally
        var CLIP_TO_PADDING_MASK: Number = definedExternally
        var ViewGroupClassAttrBind: Any = definedExternally
        fun resetCancelNextUpFlag(view: Any): Unit = definedExternally
        fun canViewReceivePointerEvents(child: Any): Unit = definedExternally
        fun getChildMeasureSpec(spec: Number, padding: Number, childDimension: Number): Number = definedExternally
    }
}
