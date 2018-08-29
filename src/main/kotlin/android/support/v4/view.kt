@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.support.v4.view")
package android.support.v4.view

import android.database.DataSetObserver
import android.graphics.Rect
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
import java.lang.Runnable

external open class PagerAdapter {
    open var mObservable: Any = definedExternally
    open fun getCount(): Number = definedExternally
    open fun startUpdate(container: ViewGroup): Unit = definedExternally
    open fun instantiateItem(container: ViewGroup, position: Number): Any = definedExternally
    open fun destroyItem(container: ViewGroup, position: Number, `object`: Any): Unit = definedExternally
    open fun setPrimaryItem(container: ViewGroup, position: Number, `object`: Any): Unit = definedExternally
    open fun finishUpdate(container: ViewGroup): Unit = definedExternally
    open fun isViewFromObject(view: View, `object`: Any): Boolean = definedExternally
    open fun getItemPosition(`object`: Any): Number = definedExternally
    open fun notifyDataSetChanged(): Unit = definedExternally
    open fun registerDataSetObserver(observer: DataSetObserver): Unit = definedExternally
    open fun unregisterDataSetObserver(observer: DataSetObserver): Unit = definedExternally
    open fun getPageTitle(position: Number): String = definedExternally
    open fun getPageWidth(position: Number): Number = definedExternally
    companion object {
        var POSITION_UNCHANGED: Number = definedExternally
        var POSITION_NONE: Number = definedExternally
    }
}
external open class ViewPager(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Any? = definedExternally /* null */) : ViewGroup {
//    override fun scheduleDrawable(who: Drawable, what: Runnable, `when`: Number) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }

    interface OnPageChangeListener {
        fun onPageScrolled(position: Number, positionOffset: Number, positionOffsetPixels: Number)
        fun onPageSelected(position: Number)
        fun onPageScrollStateChanged(state: Number)
    }
    open class SimpleOnPageChangeListener : OnPageChangeListener {
        override fun onPageScrolled(position: Number, positionOffset: Number, positionOffsetPixels: Number): Unit = definedExternally
        override fun onPageSelected(position: Number): Unit = definedExternally
        override fun onPageScrollStateChanged(state: Number): Unit = definedExternally
    }
    interface PageTransformer {
        fun transformPage(page: View, position: Number)
    }
    interface OnAdapterChangeListener {
        fun onAdapterChanged(oldAdapter: PagerAdapter, newAdapter: PagerAdapter)
    }
    open class LayoutParams : ViewGroup.LayoutParams {
        constructor()
        constructor(context: android.content.Context, attrs: HTMLElement)
        open var isDecor: Boolean = definedExternally
        open var gravity: Number = definedExternally
        open var widthFactor: Number = definedExternally
        open var needsMeasure: Boolean = definedExternally
        open var position: Number = definedExternally
        open var childIndex: Number = definedExternally
        override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    }

    open var mExpectedAdapterCount: Any = definedExternally
    open var mItems: Any = definedExternally
    open var mTempItem: Any = definedExternally
    open var mTempRect: Any = definedExternally
    open var mAdapter: Any = definedExternally
    open var mCurItem: Any = definedExternally
    open var mRestoredCurItem: Any = definedExternally
    open var mScroller: Any = definedExternally
    open var mObserver: Any = definedExternally
    open var mPageMargin: Any = definedExternally
    open var mMarginDrawable: Any = definedExternally
    open var mTopPageBounds: Any = definedExternally
    open var mBottomPageBounds: Any = definedExternally
    open var mFirstOffset: Any = definedExternally
    open var mLastOffset: Any = definedExternally
    open var mChildWidthMeasureSpec: Any = definedExternally
    open var mChildHeightMeasureSpec: Any = definedExternally
    open var mInLayout: Any = definedExternally
    open var mScrollingCacheEnabled: Any = definedExternally
    open var mPopulatePending: Any = definedExternally
    open var mOffscreenPageLimit: Any = definedExternally
    open var mIsBeingDragged: Any = definedExternally
    open var mIsUnableToDrag: Any = definedExternally
    open var mDefaultGutterSize: Any = definedExternally
    open var mGutterSize: Any = definedExternally
    open var mLastMotionX: Any = definedExternally
    open var mLastMotionY: Any = definedExternally
    open var mInitialMotionX: Any = definedExternally
    open var mInitialMotionY: Any = definedExternally
    open var mActivePointerId: Any = definedExternally
    open var mVelocityTracker: Any = definedExternally
    open var mMinimumVelocity: Any = definedExternally
    open var mMaximumVelocity: Any = definedExternally
    open var mFlingDistance: Any = definedExternally
    open var mCloseEnough: Any = definedExternally
    open var mFakeDragging: Any = definedExternally
    open var mFakeDragBeginTime: Any = definedExternally
    open var mFirstLayout: Any = definedExternally
    open var mNeedCalculatePageOffsets: Any = definedExternally
    open var mCalledSuper: Any = definedExternally
    open var mDecorChildCount: Any = definedExternally
    open var mOnPageChangeListeners: Any = definedExternally
    open var mOnPageChangeListener: Any = definedExternally
    open var mInternalPageChangeListener: Any = definedExternally
    open var mAdapterChangeListener: Any = definedExternally
    open var mPageTransformer: Any = definedExternally
    open var mDrawingOrder: Any = definedExternally
    open var mDrawingOrderedChildren: Any = definedExternally
    open var mEndScrollRunnable: Any = definedExternally
    open var mScrollState: Any = definedExternally
    open fun initViewPager(): Unit = definedExternally
    override fun onDetachedFromWindow(): Unit = definedExternally
    open fun setScrollState(newState: Any): Unit = definedExternally
    open fun setAdapter(adapter: PagerAdapter): Unit = definedExternally
    open fun removeNonDecorViews(): Unit = definedExternally
    open fun getAdapter(): PagerAdapter = definedExternally
    open fun setOnAdapterChangeListener(listener: ViewPager.OnAdapterChangeListener): Unit = definedExternally
    open fun getClientWidth(): Unit = definedExternally
    open fun setCurrentItem(item: Number, smoothScroll: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun getCurrentItem(): Number = definedExternally
    open fun setCurrentItemInternal(item: Number, smoothScroll: Boolean, always: Boolean, velocity: Number? = definedExternally /* null */): Unit = definedExternally
    open fun scrollToItem(item: Any, smoothScroll: Any, velocity: Any, dispatchSelected: Any): Unit = definedExternally
    open fun setOnPageChangeListener(listener: ViewPager.OnPageChangeListener): Unit = definedExternally
    open fun addOnPageChangeListener(listener: ViewPager.OnPageChangeListener): Unit = definedExternally
    open fun removeOnPageChangeListener(listener: ViewPager.OnPageChangeListener): Unit = definedExternally
    open fun clearOnPageChangeListeners(): Unit = definedExternally
    open fun setPageTransformer(reverseDrawingOrder: Boolean, transformer: ViewPager.PageTransformer): Unit = definedExternally
    open fun setChildrenDrawingOrderEnabledCompat(enable: Boolean? = definedExternally /* null */): Unit = definedExternally
    override fun getChildDrawingOrder(childCount: Number, i: Number): Number = definedExternally
    open fun setInternalPageChangeListener(listener: ViewPager.OnPageChangeListener): ViewPager.OnPageChangeListener = definedExternally
    open fun getOffscreenPageLimit(): Number = definedExternally
    open fun setOffscreenPageLimit(limit: Number): Unit = definedExternally
    open fun setPageMargin(marginPixels: Number): Unit = definedExternally
    open fun getPageMargin(): Number = definedExternally
    open fun setPageMarginDrawable(d: Drawable): Unit = definedExternally
    override fun verifyDrawable(who: Drawable): Boolean = definedExternally
    override fun drawableStateChanged(): Unit = definedExternally
    open fun distanceInfluenceForSnapDuration(f: Number): Number = definedExternally
    open fun smoothScrollTo(x: Number, y: Number, velocity: Number? = definedExternally /* null */): Unit = definedExternally
    open fun addNewItem(position: Any, index: Any): Unit = definedExternally
    open fun dataSetChanged(): Unit = definedExternally
    open fun populate(newCurrentItem: Number? = definedExternally /* null */): Unit = definedExternally
    open fun sortChildDrawingOrder(): Unit = definedExternally
    open fun calculatePageOffsets(curItem: Any, curIndex: Any, oldCurInfo: Any): Unit = definedExternally
    override fun addView(view: View): Any = definedExternally
    override fun addView(view: View, index: Number): Any = definedExternally
    override fun addView(view: View, params: ViewGroup.LayoutParams): Any = definedExternally
    override fun addView(view: View, index: Number, params: ViewGroup.LayoutParams): Any = definedExternally
    override fun addView(view: View, width: Number, height: Number): Any = definedExternally
    open fun _addViewOverride(child: Any, index: Any, params: Any): Unit = definedExternally
    override fun removeView(view: android.view.View): Unit = definedExternally
    open fun infoForChild(child: Any): Unit = definedExternally
    open fun infoForAnyChild(child: Any): Unit = definedExternally
    open fun infoForPosition(position: Any): Unit = definedExternally
    override fun onAttachedToWindow(): Unit = definedExternally
    open fun onMeasure(widthMeasureSpec: Any, heightMeasureSpec: Any): Unit = definedExternally
    override fun onSizeChanged(w: Number, h: Number, oldw: Number, oldh: Number): Unit = definedExternally
    open fun recomputeScrollPosition(width: Any, oldWidth: Any, margin: Any, oldMargin: Any): Unit = definedExternally
    override fun onLayout(changed: Boolean, l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
    override fun computeScroll(): Unit = definedExternally
    open fun pageScrolled(xpos: Any): Unit = definedExternally
    open fun onPageScrolled(position: Number, offset: Number, offsetPixels: Number): Unit = definedExternally
    open fun dispatchOnPageScrolled(position: Any, offset: Any, offsetPixels: Any): Unit = definedExternally
    open fun dispatchOnPageSelected(position: Any): Unit = definedExternally
    open fun dispatchOnScrollStateChanged(state: Any): Unit = definedExternally
    open fun completeScroll(postEvents: Any): Unit = definedExternally
    open fun isGutterDrag(x: Any, dx: Any): Unit = definedExternally
    open fun enableLayers(enable: Any): Unit = definedExternally
    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean = definedExternally
    override fun onTouchEvent(ev: android.view.MotionEvent): Boolean = definedExternally
    open fun resetTouch(): Unit = definedExternally
    open fun requestParentDisallowInterceptTouchEvent(disallowIntercept: Any): Unit = definedExternally
    open fun performDrag(x: Any): Unit = definedExternally
    open fun infoForCurrentScrollPosition(): Unit = definedExternally
    open fun determineTargetPage(currentPage: Any, pageOffset: Any, velocity: Any, deltaX: Any): Unit = definedExternally
    override fun draw(canvas: android.graphics.Canvas): Unit = definedExternally
    override fun onDraw(canvas: android.graphics.Canvas): Unit = definedExternally
    open fun beginFakeDrag(): Boolean = definedExternally
    open fun endFakeDrag(): Unit = definedExternally
    open fun fakeDragBy(xOffset: Number): Unit = definedExternally
    open fun isFakeDragging(): Boolean = definedExternally
    open fun onSecondaryPointerUp(ev: Any): Unit = definedExternally
    open fun endDrag(): Unit = definedExternally
    open fun setScrollingCacheEnabled(enabled: Any): Unit = definedExternally
    override fun canScrollHorizontally(direction: Number): Boolean = definedExternally
    open fun canScroll(v: View, checkV: Boolean, dx: Number, x: Number, y: Number): Boolean = definedExternally
    override fun dispatchKeyEvent(event: android.view.KeyEvent): Boolean = definedExternally
    open fun executeKeyEvent(event: KeyEvent): Boolean = definedExternally
    open fun arrowScroll(direction: Number): Boolean = definedExternally
    open fun getChildRectInPagerCoordinates(outRect: Any, child: Any): Unit = definedExternally
    open fun pageLeft(): Boolean = definedExternally
    open fun pageRight(): Boolean = definedExternally
    open fun addFocusables(views: ArrayList<View>): Unit = definedExternally
    open fun addFocusables(views: ArrayList<View>, direction: Number?): Unit = definedExternally
    override fun addFocusables(views: ArrayList<View>, direction: Number, focusableMode: Number?): Unit = definedExternally
    override fun addTouchables(views: java.util.ArrayList<android.view.View>): Unit = definedExternally
    override fun onRequestFocusInDescendants(direction: Number, previouslyFocusedRect: Rect): Boolean = definedExternally
    override fun generateDefaultLayoutParams(): android.view.ViewGroup.LayoutParams = definedExternally
    override fun generateLayoutParams(p: android.view.ViewGroup.LayoutParams): android.view.ViewGroup.LayoutParams = definedExternally
    override fun checkLayoutParams(p: android.view.ViewGroup.LayoutParams): Boolean = definedExternally
    override fun generateLayoutParamsFromAttr(attrs: HTMLElement): android.view.ViewGroup.LayoutParams = definedExternally
    companion object {
        var COMPARATOR: Any = definedExternally
        var USE_CACHE: Any = definedExternally
        var DEFAULT_OFFSCREEN_PAGES: Any = definedExternally
        var MAX_SETTLE_DURATION: Any = definedExternally
        var MIN_DISTANCE_FOR_FLING: Any = definedExternally
        var DEFAULT_GUTTER_SIZE: Any = definedExternally
        var MIN_FLING_VELOCITY: Any = definedExternally
        var sInterpolator: Any = definedExternally
        var INVALID_POINTER: Any = definedExternally
        var CLOSE_ENOUGH: Any = definedExternally
        var DRAW_ORDER_DEFAULT: Any = definedExternally
        var DRAW_ORDER_FORWARD: Any = definedExternally
        var DRAW_ORDER_REVERSE: Any = definedExternally
        var sPositionComparator: Any = definedExternally
        var SCROLL_STATE_IDLE: Number = definedExternally
        var SCROLL_STATE_DRAGGING: Number = definedExternally
        var SCROLL_STATE_SETTLING: Number = definedExternally
        fun isImplDecor(view: Any): Unit = definedExternally
        fun setClassImplDecor(clazz: Function<*>): Unit = definedExternally
    }
}
