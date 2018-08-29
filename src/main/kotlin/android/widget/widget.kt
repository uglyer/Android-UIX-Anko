@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.widget")

package android.widget

import android.content.*
import android.content.res.ColorStateList
import android.database.DataSetObserver
import android.graphics.*
import android.graphics.drawable.*
import android.os.*
import android.text.*
import android.text.method.MovementMethod
import android.text.method.TransformationMethod
import android.util.*
import android.view.*
import android.view.Window
import android.view.animation.*
import androidui.image.NetDrawable
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

external open class FrameLayout(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : ViewGroup {
    open class LayoutParams : ViewGroup.MarginLayoutParams {
        constructor(context: Context, attrs: HTMLElement)
        constructor()
        constructor(source: ViewGroup.LayoutParams)
        constructor(width: Number, height: Number, gravity: Number? = definedExternally /* null */)

        open var gravity: Number = definedExternally
        override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    }

    open var mMeasureAllChildren: Boolean = definedExternally
    open var mForeground: Drawable = definedExternally
    open var mForegroundPaddingLeft: Any = definedExternally
    open var mForegroundPaddingTop: Any = definedExternally
    open var mForegroundPaddingRight: Any = definedExternally
    open var mForegroundPaddingBottom: Any = definedExternally
    open var mSelfBounds: Any = definedExternally
    open var mOverlayBounds: Any = definedExternally
    open var mForegroundGravity: Any = definedExternally
    open var mForegroundInPadding: Boolean = definedExternally
    open var mForegroundBoundsChanged: Boolean = definedExternally
    open var mMatchParentChildren: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    open fun getForegroundGravity(): Number = definedExternally
    open fun setForegroundGravity(foregroundGravity: Number): Unit = definedExternally
    override fun verifyDrawable(who: Drawable): Boolean = definedExternally
    override fun jumpDrawablesToCurrentState(): Unit = definedExternally
    override fun drawableStateChanged(): Unit = definedExternally
    override fun generateDefaultLayoutParams(): FrameLayout.LayoutParams = definedExternally
    open fun setForeground(drawable: Drawable): Unit = definedExternally
    open fun getForeground(): Drawable = definedExternally
    open fun getPaddingLeftWithForeground(): Number = definedExternally
    open fun getPaddingRightWithForeground(): Number = definedExternally
    open fun getPaddingTopWithForeground(): Number = definedExternally
    open fun getPaddingBottomWithForeground(): Number = definedExternally
    override fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    override fun onLayout(changed: Boolean, left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
    open fun layoutChildren(left: Number, top: Number, right: Number, bottom: Number, forceLeftGravity: Boolean): Unit = definedExternally
    override fun onSizeChanged(w: Number, h: Number, oldw: Number, oldh: Number): Unit = definedExternally
    override fun draw(canvas: Canvas): Unit = definedExternally
    open fun setMeasureAllChildren(measureAll: Boolean): Unit = definedExternally
    open fun getMeasureAllChildren(): Boolean = definedExternally
    override fun generateLayoutParamsFromAttr(attrs: HTMLElement): android.view.ViewGroup.LayoutParams = definedExternally
    override fun shouldDelayChildPressedState(): Boolean = definedExternally
    override fun checkLayoutParams(p: ViewGroup.LayoutParams): Boolean = definedExternally
    override fun generateLayoutParams(p: ViewGroup.LayoutParams): FrameLayout.LayoutParams = definedExternally

    companion object {
        var DEFAULT_CHILD_GRAVITY: Number = definedExternally
    }
}

external open class LinearLayout(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : ViewGroup {
    open class LayoutParams : android.view.ViewGroup.MarginLayoutParams {
        constructor(context: Context, attrs: HTMLElement)
        constructor(width: Number, height: Number)
        constructor(source: ViewGroup.LayoutParams)
        constructor(width: Number, height: Number, weight: Number? = definedExternally /* null */)

        open var weight: Number = definedExternally
        open var gravity: Number = definedExternally
        override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    }

    open var mBaselineAligned: Any = definedExternally
    open var mBaselineAlignedChildIndex: Any = definedExternally
    open var mBaselineChildTop: Any = definedExternally
    open var mOrientation: Any = definedExternally
    open var mGravity: Any = definedExternally
    open var mTotalLength: Any = definedExternally
    open var mWeightSum: Any = definedExternally
    open var mUseLargestChild: Any = definedExternally
    open var mMaxAscent: Any = definedExternally
    open var mMaxDescent: Any = definedExternally
    open var mDivider: Any = definedExternally
    open var mDividerWidth: Any = definedExternally
    open var mDividerHeight: Any = definedExternally
    open var mShowDividers: Any = definedExternally
    open var mDividerPadding: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    open fun setShowDividers(showDividers: Number): Unit = definedExternally
    override fun shouldDelayChildPressedState(): Boolean = definedExternally
    open fun getShowDividers(): Number = definedExternally
    open fun getDividerDrawable(): Drawable = definedExternally
    open fun setDividerDrawable(divider: Drawable): Unit = definedExternally
    open fun setDividerPadding(padding: Number): Unit = definedExternally
    open fun getDividerPadding(): Number = definedExternally
    open fun getDividerWidth(): Number = definedExternally
    override fun onDraw(canvas: Canvas): Unit = definedExternally
    open fun drawDividersVertical(canvas: Canvas): Unit = definedExternally
    open fun drawDividersHorizontal(canvas: Canvas): Unit = definedExternally
    open fun drawHorizontalDivider(canvas: Canvas, top: Number): Unit = definedExternally
    open fun drawVerticalDivider(canvas: Canvas, left: Number): Unit = definedExternally
    open fun isBaselineAligned(): Boolean = definedExternally
    open fun setBaselineAligned(baselineAligned: Boolean): Unit = definedExternally
    open fun isMeasureWithLargestChildEnabled(): Boolean = definedExternally
    open fun setMeasureWithLargestChildEnabled(enabled: Boolean): Unit = definedExternally
    override fun getBaseline(): Number = definedExternally
    open fun getBaselineAlignedChildIndex(): Number = definedExternally
    open fun setBaselineAlignedChildIndex(i: Number): Unit = definedExternally
    open fun getVirtualChildAt(index: Number): View = definedExternally
    open fun getVirtualChildCount(): Number = definedExternally
    open fun getWeightSum(): Number = definedExternally
    open fun setWeightSum(weightSum: Number): Unit = definedExternally
    open fun onMeasure(widthMeasureSpec: Any, heightMeasureSpec: Any): Unit = definedExternally
    open fun hasDividerBeforeChildAt(childIndex: Number): Boolean = definedExternally
    open fun measureVertical(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    open fun forceUniformWidth(count: Number, heightMeasureSpec: Number): Unit = definedExternally
    open fun measureHorizontal(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    open fun forceUniformHeight(count: Any, widthMeasureSpec: Any): Unit = definedExternally
    open fun getChildrenSkipCount(child: View, index: Number): Number = definedExternally
    open fun measureNullChild(childIndex: Number): Number = definedExternally
    open fun measureChildBeforeLayout(child: View, childIndex: Number, widthMeasureSpec: Number, totalWidth: Number, heightMeasureSpec: Number, totalHeight: Number): Unit = definedExternally
    open fun getLocationOffset(child: View): Number = definedExternally
    open fun getNextLocationOffset(child: View): Number = definedExternally
    override fun onLayout(changed: Boolean, l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
    open fun layoutVertical(left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
    open fun layoutHorizontal(left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
    open fun setChildFrame(child: Any, left: Any, top: Any, width: Any, height: Any): Unit = definedExternally
    open fun setOrientation(orientation: Number): Unit = definedExternally
    open fun getOrientation(): Number = definedExternally
    open fun setGravity(gravity: Number): Unit = definedExternally
    open fun setHorizontalGravity(horizontalGravity: Number): Unit = definedExternally
    open fun setVerticalGravity(verticalGravity: Number): Unit = definedExternally
    override fun generateLayoutParamsFromAttr(attrs: HTMLElement): android.view.ViewGroup.LayoutParams = definedExternally
    override fun generateDefaultLayoutParams(): android.view.ViewGroup.LayoutParams = definedExternally
    override fun generateLayoutParams(p: android.view.ViewGroup.LayoutParams): android.view.ViewGroup.LayoutParams = definedExternally
    override fun checkLayoutParams(p: android.view.ViewGroup.LayoutParams): Boolean = definedExternally

    companion object {
        var HORIZONTAL: Number = definedExternally
        var VERTICAL: Number = definedExternally
        var SHOW_DIVIDER_NONE: Number = definedExternally
        var SHOW_DIVIDER_BEGINNING: Number = definedExternally
        var SHOW_DIVIDER_MIDDLE: Number = definedExternally
        var SHOW_DIVIDER_END: Number = definedExternally
        var VERTICAL_GRAVITY_COUNT: Any = definedExternally
        var INDEX_CENTER_VERTICAL: Any = definedExternally
        var INDEX_TOP: Any = definedExternally
        var INDEX_BOTTOM: Any = definedExternally
        var INDEX_FILL: Any = definedExternally
    }
}

external open class AdapterView<T : Adapter> : ViewGroup {
    interface OnItemClickListener {
        fun onItemClick(parent: AdapterView<dynamic>, view: View, position: Number, id: Number)
    }

    interface OnItemLongClickListener {
        fun onItemLongClick(parent: AdapterView<dynamic>, view: View, position: Number, id: Number): Boolean
    }

    interface OnItemSelectedListener {
        fun onItemSelected(parent: AdapterView<dynamic>, view: View, position: Number, id: Number)
        fun onNothingSelected(parent: AdapterView<dynamic>)
    }

    open class AdapterDataSetObserver(AdapterView_this: AdapterView<dynamic>) : DataSetObserver {
        open var AdapterView_this: AdapterView<dynamic> = definedExternally
        override fun onChanged(): Unit = definedExternally
        override fun onInvalidated(): Unit = definedExternally
        open fun clearSavedState(): Unit = definedExternally
    }

    open var mFirstPosition: Number = definedExternally
    open var mSpecificTop: Number = definedExternally
    open var mSyncPosition: Number = definedExternally
    open var mSyncRowId: Number = definedExternally
    open var mSyncHeight: Number = definedExternally
    open var mNeedSync: Boolean = definedExternally
    open var mSyncMode: Number = definedExternally
    open var mLayoutHeight: Any = definedExternally
    open var mInLayout: Boolean = definedExternally
    open var mOnItemSelectedListener: Any = definedExternally
    open var mOnItemClickListener: Any = definedExternally
    open var mOnItemLongClickListener: AdapterView.OnItemLongClickListener = definedExternally
    open var mDataChanged: Boolean = definedExternally
    open var mNextSelectedPosition: Number = definedExternally
    open var mNextSelectedRowId: Number = definedExternally
    open var mSelectedPosition: Number = definedExternally
    open var mSelectedRowId: Number = definedExternally
    open var mEmptyView: Any = definedExternally
    open var mItemCount: Number = definedExternally
    open var mOldItemCount: Number = definedExternally
    open var mOldSelectedPosition: Number = definedExternally
    open var mOldSelectedRowId: Number = definedExternally
    open var mDesiredFocusableState: Any = definedExternally
    open var mDesiredFocusableInTouchModeState: Any = definedExternally
    open var mSelectionNotifier: Any = definedExternally
    open var mBlockLayoutRequests: Boolean = definedExternally
    open fun setOnItemClickListener(listener: AdapterView.OnItemClickListener): Unit = definedExternally
    open fun getOnItemClickListener(): AdapterView.OnItemClickListener = definedExternally
    open fun performItemClick(view: View, position: Number, id: Number): Boolean = definedExternally
    open fun setOnItemLongClickListener(listener: AdapterView.OnItemLongClickListener): Unit = definedExternally
    open fun getOnItemLongClickListener(): AdapterView.OnItemLongClickListener = definedExternally
    open fun setOnItemSelectedListener(listener: AdapterView.OnItemSelectedListener): Unit = definedExternally
    open fun getOnItemSelectedListener(): AdapterView.OnItemSelectedListener = definedExternally
    open fun getAdapter(): T = definedExternally
    open fun setAdapter(adapter: T): Unit = definedExternally
    override fun addView(vararg args: Any): Unit = definedExternally
    override fun removeView(child: View): Unit = definedExternally
    override fun removeViewAt(index: Number): Unit = definedExternally
    override fun removeAllViews(): Unit = definedExternally
    override fun onLayout(changed: Boolean, left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
    open fun getSelectedItemPosition(): Number = definedExternally
    open fun getSelectedItemId(): Number = definedExternally
    open fun getSelectedView(): View = definedExternally
    open fun getSelectedItem(): Any = definedExternally
    open fun getCount(): Number = definedExternally
    open fun getPositionForView(view: View): Number = definedExternally
    open fun getFirstVisiblePosition(): Number = definedExternally
    open fun getLastVisiblePosition(): Number = definedExternally
    open fun setSelection(position: Number): Unit = definedExternally
    open fun setEmptyView(emptyView: View): Unit = definedExternally
    open fun getEmptyView(): View = definedExternally
    open fun isInFilterMode(): Boolean = definedExternally
    override fun setFocusable(focusable: Boolean): Unit = definedExternally
    override fun setFocusableInTouchMode(focusable: Boolean): Unit = definedExternally
    open fun checkFocus(): Unit = definedExternally
    open fun updateEmptyStatus(empty: Any): Unit = definedExternally
    open fun getItemAtPosition(position: Number): Any = definedExternally
    open fun getItemIdAtPosition(position: Number): Number = definedExternally
    //override fun setOnClickListener(l: View.OnClickListener): Unit = definedExternally
    override fun onDetachedFromWindow(): Unit = definedExternally

    open fun selectionChanged(): Unit = definedExternally
    open fun fireOnSelected(): Unit = definedExternally
    open fun performAccessibilityActionsOnSelected(): Unit = definedExternally
    open fun isScrollableForAccessibility(): Unit = definedExternally
    override fun canAnimate(): Boolean = definedExternally
    open fun handleDataChanged(): Unit = definedExternally
    open fun checkSelectionChanged(): Unit = definedExternally
    open fun findSyncPosition(): Number = definedExternally
    open fun lookForSelectablePosition(position: Number, lookDown: Boolean): Number = definedExternally
    open fun setSelectedPositionInt(position: Number): Unit = definedExternally
    open fun setNextSelectedPositionInt(position: Number): Unit = definedExternally
    open fun rememberSyncState(): Unit = definedExternally

    companion object {
        var ITEM_VIEW_TYPE_IGNORE: Number = definedExternally
        var ITEM_VIEW_TYPE_HEADER_OR_FOOTER: Number = definedExternally
        var SYNC_SELECTED_POSITION: Number = definedExternally
        var SYNC_FIRST_POSITION: Number = definedExternally
        var SYNC_MAX_DURATION_MILLIS: Number = definedExternally
        var INVALID_POSITION: Number = definedExternally
        var INVALID_ROW_ID: Number = definedExternally
    }
}

external interface Adapter {
    //    val IGNORE_ITEM_VIEW_TYPE: Number = definedExternally
//    val NO_SELECTION: Number = definedExternally
    fun registerDataSetObserver(observer: DataSetObserver)

    fun unregisterDataSetObserver(observer: DataSetObserver)
    fun getCount(): Number
    fun getItem(position: Number): Any
    fun getItemId(position: Number): Number
    fun hasStableIds(): Boolean
    fun getView(position: Number, convertView: View, parent: ViewGroup): View
    fun getItemViewType(position: Number): Number
    fun getViewTypeCount(): Number
    fun isEmpty(): Boolean
}

external open class OverScroller(interpolator: Interpolator? = definedExternally /* null */, flywheel: Boolean? = definedExternally /* null */) {
    open var mMode: Any = definedExternally
    open var mScrollerX: Any = definedExternally
    open var mScrollerY: Any = definedExternally
    open var mInterpolator: Any = definedExternally
    open var mFlywheel: Any = definedExternally
    open fun setInterpolator(interpolator: Interpolator): Unit = definedExternally
    open fun setFriction(friction: Number): Unit = definedExternally
    open fun isFinished(): Boolean = definedExternally
    open fun forceFinished(finished: Boolean): Unit = definedExternally
    open fun getCurrX(): Number = definedExternally
    open fun getCurrY(): Number = definedExternally
    open fun getCurrVelocity(): Number = definedExternally
    open fun getStartX(): Number = definedExternally
    open fun getStartY(): Number = definedExternally
    open fun getFinalX(): Number = definedExternally
    open fun getFinalY(): Number = definedExternally
    open fun getDuration(): Number = definedExternally
    open fun computeScrollOffset(): Boolean = definedExternally
    open fun startScroll(startX: Number, startY: Number, dx: Number, dy: Number, duration: Number? = definedExternally /* null */): Unit = definedExternally
    open fun springBack(startX: Number, startY: Number, minX: Number, maxX: Number, minY: Number, maxY: Number): Boolean = definedExternally
    open fun fling(startX: Number, startY: Number, velocityX: Number, velocityY: Number, minX: Number, maxX: Number, minY: Number, maxY: Number, overX: Number? = definedExternally /* null */, overY: Number? = definedExternally /* null */): Unit = definedExternally
    open fun notifyHorizontalEdgeReached(startX: Number, finalX: Number, overX: Number): Unit = definedExternally
    open fun notifyVerticalEdgeReached(startY: Number, finalY: Number, overY: Number): Unit = definedExternally
    open fun isOverScrolled(): Boolean = definedExternally
    open fun abortAnimation(): Unit = definedExternally
    open fun timePassed(): Number = definedExternally
    open fun isScrollingInDirection(xvel: Number, yvel: Number): Boolean = definedExternally

    companion object {
        var DEFAULT_DURATION: Number = definedExternally
        var SCROLL_MODE: Number = definedExternally
        var FLING_MODE: Number = definedExternally
    }
}

external open class TextView(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : View, ViewTreeObserver.OnPreDrawListener {

    open class Drawables(context: Any? = definedExternally /* null */) {
        open var mCompoundRect: Rect = definedExternally
        open var mDrawableTop: Drawable = definedExternally
        open var mDrawableBottom: Drawable = definedExternally
        open var mDrawableLeft: Drawable = definedExternally
        open var mDrawableRight: Drawable = definedExternally
        open var mDrawableStart: Drawable = definedExternally
        open var mDrawableEnd: Drawable = definedExternally
        open var mDrawableError: Drawable = definedExternally
        open var mDrawableTemp: Drawable = definedExternally
        open var mDrawableLeftInitial: Drawable = definedExternally
        open var mDrawableRightInitial: Drawable = definedExternally
        open var mIsRtlCompatibilityMode: Boolean = definedExternally
        open var mOverride: Boolean = definedExternally
        open var mDrawableSizeTop: Number = definedExternally
        open var mDrawableSizeBottom: Number = definedExternally
        open var mDrawableSizeLeft: Number = definedExternally
        open var mDrawableSizeRight: Number = definedExternally
        open var mDrawableSizeStart: Number = definedExternally
        open var mDrawableSizeEnd: Number = definedExternally
        open var mDrawableSizeError: Number = definedExternally
        open var mDrawableSizeTemp: Number = definedExternally
        open var mDrawableWidthTop: Number = definedExternally
        open var mDrawableWidthBottom: Number = definedExternally
        open var mDrawableHeightLeft: Number = definedExternally
        open var mDrawableHeightRight: Number = definedExternally
        open var mDrawableHeightStart: Number = definedExternally
        open var mDrawableHeightEnd: Number = definedExternally
        open var mDrawableHeightError: Number = definedExternally
        open var mDrawableHeightTemp: Number = definedExternally
        open var mDrawablePadding: Number = definedExternally
        open var mDrawableSaved: Number = definedExternally
        open fun resolveWithLayoutDirection(layoutDirection: Number): Unit = definedExternally
        open fun updateDrawablesLayoutDirection(layoutDirection: Any): Unit = definedExternally
        open fun setErrorDrawable(dr: Drawable, tv: TextView): Unit = definedExternally
        open fun applyErrorDrawableIfNeeded(layoutDirection: Any): Unit = definedExternally

        companion object {
            var DRAWABLE_NONE: Number = definedExternally
            var DRAWABLE_RIGHT: Number = definedExternally
            var DRAWABLE_LEFT: Number = definedExternally
        }
    }

    interface OnEditorActionListener {
        fun onEditorAction(v: TextView, actionId: Number, event: KeyEvent): Boolean
    }

    open class Marquee(v: TextView) : Handler {
        open var mView: Any = definedExternally
        open var mStatus: Any = definedExternally
        open var mScrollUnit: Any = definedExternally
        open var mMaxScroll: Any = definedExternally
        open var mMaxFadeScroll: Any = definedExternally
        open var mGhostStart: Any = definedExternally
        open var mGhostOffset: Any = definedExternally
        open var mFadeStop: Any = definedExternally
        open var mRepeatLimit: Any = definedExternally
        open var mScroll: Any = definedExternally
        override fun handleMessage(msg: Message): Unit = definedExternally
        open fun tick(): Unit = definedExternally
        open fun stop(): Unit = definedExternally
        open fun resetScroll(): Unit = definedExternally
        open fun start(repeatLimit: Number): Unit = definedExternally
        open fun getGhostOffset(): Number = definedExternally
        open fun getScroll(): Number = definedExternally
        open fun getMaxFadeScroll(): Number = definedExternally
        open fun shouldDrawLeftFade(): Boolean = definedExternally
        open fun shouldDrawGhost(): Boolean = definedExternally
        open fun isRunning(): Boolean = definedExternally
        open fun isStopped(): Boolean = definedExternally

        companion object {
            var MARQUEE_DELTA_MAX: Any = definedExternally
            var MARQUEE_DELAY: Any = definedExternally
            var MARQUEE_RESTART_DELAY: Any = definedExternally
            var MARQUEE_RESOLUTION: Any = definedExternally
            var MARQUEE_PIXELS_PER_SECOND: Any = definedExternally
            var MARQUEE_STOPPED: Any = definedExternally
            var MARQUEE_STARTING: Any = definedExternally
            var MARQUEE_RUNNING: Any = definedExternally
            var MESSAGE_START: Any = definedExternally
            var MESSAGE_TICK: Any = definedExternally
            var MESSAGE_RESTART: Any = definedExternally
        }
    }

    open class ChangeWatcher(arg: TextView) : TextWatcher, SpanWatcher {
        open var _TextView_this: TextView = definedExternally
        open var mBeforeText: Any = definedExternally
        override fun beforeTextChanged(buffer: String, start: Number, before: Number, after: Number): Unit = definedExternally
        override fun onTextChanged(buffer: String, start: Number, before: Number, after: Number): Unit = definedExternally
        override fun afterTextChanged(buffer: String): Unit = definedExternally
        override fun onSpanChanged(buf: Spannable, what: Any, s: Number, e: Number, st: Number, en: Number): Unit = definedExternally
        override fun onSpanAdded(buf: Spannable, what: Any, s: Number, e: Number): Unit = definedExternally
        override fun onSpanRemoved(buf: Spannable, what: Any, s: Number, e: Number): Unit = definedExternally
    }

    enum class BufferType {
        NORMAL /* = 0 */,
        SPANNABLE /* = 1 */,
        EDITABLE /* = 2 */
    }

    open var mTextColor: Any = definedExternally
    open var mHintTextColor: Any = definedExternally
    open var mLinkTextColor: Any = definedExternally
    open var mCurTextColor: Any = definedExternally
    open var mCurHintTextColor: Any = definedExternally
    open var mFreezesText: Any = definedExternally
    open var mTemporaryDetach: Any = definedExternally
    open var mDispatchTemporaryDetach: Any = definedExternally
    open var mSpannableFactory: Any = definedExternally
    open var mShadowRadius: Any = definedExternally
    open var mShadowDx: Any = definedExternally
    open var mShadowDy: Any = definedExternally
    open var mPreDrawRegistered: Any = definedExternally
    open var mPreventDefaultMovement: Any = definedExternally
    open var mEllipsize: Any = definedExternally
    open var mDrawables: TextView.Drawables = definedExternally
    open var mMarquee: Any = definedExternally
    open var mRestartMarquee: Any = definedExternally
    open var mMarqueeRepeatLimit: Any = definedExternally
    open var mLastLayoutDirection: Any = definedExternally
    open var mMarqueeFadeMode: Any = definedExternally
    open var mSavedMarqueeModeLayout: Any = definedExternally
    open var mText: Any = definedExternally
    open var mTransformed: Any = definedExternally
    open var mBufferType: Any = definedExternally
    open var mHint: Any = definedExternally
    open var mHintLayout: Any = definedExternally
    open var mMovement: Any = definedExternally
    open var mTransformation: Any = definedExternally
    open var mAllowTransformationLengthChange: Any = definedExternally
    open var mChangeWatcher: Any = definedExternally
    open var mListeners: Any = definedExternally
    open var mTextPaint: Any = definedExternally
    open var mUserSetTextScaleX: Any = definedExternally
    open var mLayout: Any = definedExternally
    open var mGravity: Any = definedExternally
    open var mHorizontallyScrolling: Any = definedExternally
    open var mAutoLinkMask: Any = definedExternally
    open var mLinksClickable: Any = definedExternally
    open var mSpacingMult: Any = definedExternally
    open var mSpacingAdd: Any = definedExternally
    open var mMaximum: Any = definedExternally
    open var mMaxMode: Any = definedExternally
    open var mMinimum: Any = definedExternally
    open var mMinMode: Any = definedExternally
    open var mOldMaximum: Any = definedExternally
    open var mOldMaxMode: Any = definedExternally
    open var mMaxWidthValue: Any = definedExternally
    open var mMaxWidthMode: Any = definedExternally
    open var mMinWidthValue: Any = definedExternally
    open var mMinWidthMode: Any = definedExternally
    open var mSingleLine: Any = definedExternally
    open var mDesiredHeightAtMeasure: Any = definedExternally
    open var mIncludePad: Any = definedExternally
    open var mDeferScroll: Any = definedExternally
    open var mTempRect: Any = definedExternally
    open var mLastScroll: Any = definedExternally
    open var mScroller: Any = definedExternally
    open var mBoring: Any = definedExternally
    open var mHintBoring: Any = definedExternally
    open var mSavedLayout: Any = definedExternally
    open var mSavedHintLayout: Any = definedExternally
    open var mTextDir: Any = definedExternally
    open var mFilters: Any = definedExternally
    open var mHighlightColor: Number = definedExternally
    open var mHighlightPath: Any = definedExternally
    open var mHighlightPaint: Any = definedExternally
    open var mHighlightPathBogus: Any = definedExternally
    open var mCursorDrawableRes: Number = definedExternally
    open var mTextSelectHandleLeftRes: Number = definedExternally
    open var mTextSelectHandleRightRes: Number = definedExternally
    open var mTextSelectHandleRes: Number = definedExternally
    open var mTextEditSuggestionItemLayout: Number = definedExternally
    open var mEditor: Any = definedExternally
    open var mSkipDrawText: Boolean = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    open fun setTypefaceFromAttrs(familyName: Any, typefaceIndex: Any, styleIndex: Any): Unit = definedExternally
    open fun setRelativeDrawablesIfNeeded(start: Any, end: Any): Unit = definedExternally
    override fun setEnabled(enabled: Boolean): Unit = definedExternally
    open fun setTypeface(tf: Any, style: Number): Unit = definedExternally
    open fun getDefaultEditable(): Boolean = definedExternally
    open fun getDefaultMovementMethod(): MovementMethod = definedExternally
    open fun getText(): String = definedExternally
    open fun length(): Number = definedExternally
    open fun getEditableText(): Any = definedExternally
    open fun getLineHeight(): Number = definedExternally
    open fun getLayout(): Layout = definedExternally
    open fun getHintLayout(): Layout = definedExternally
    open fun getUndoManager(): Any = definedExternally
    open fun setUndoManager(undoManager: Any, tag: String): Unit = definedExternally
    open fun getKeyListener(): Any = definedExternally
    open fun setKeyListener(input: Any): Unit = definedExternally
    open fun setKeyListenerOnly(input: Any): Unit = definedExternally
    open fun getMovementMethod(): MovementMethod = definedExternally
    open fun setMovementMethod(movement: MovementMethod): Unit = definedExternally
    open fun fixFocusableAndClickableSettings(): Unit = definedExternally
    open fun getTransformationMethod(): TransformationMethod = definedExternally
    open fun setTransformationMethod(method: TransformationMethod): Unit = definedExternally
    open fun getCompoundPaddingTop(): Number = definedExternally
    open fun getCompoundPaddingBottom(): Number = definedExternally
    open fun getCompoundPaddingLeft(): Number = definedExternally
    open fun getCompoundPaddingRight(): Number = definedExternally
    open fun getCompoundPaddingStart(): Number = definedExternally
    open fun getCompoundPaddingEnd(): Number = definedExternally
    open fun getExtendedPaddingTop(): Number = definedExternally
    open fun getExtendedPaddingBottom(): Number = definedExternally
    open fun getTotalPaddingLeft(): Number = definedExternally
    open fun getTotalPaddingRight(): Number = definedExternally
    open fun getTotalPaddingStart(): Number = definedExternally
    open fun getTotalPaddingEnd(): Number = definedExternally
    open fun getTotalPaddingTop(): Number = definedExternally
    open fun getTotalPaddingBottom(): Number = definedExternally
    open fun setCompoundDrawables(left: Drawable, top: Drawable, right: Drawable, bottom: Drawable): Unit = definedExternally
    open fun setCompoundDrawablesWithIntrinsicBounds(left: Drawable, top: Drawable, right: Drawable, bottom: Drawable): Unit = definedExternally
    open fun setCompoundDrawablesRelative(start: Drawable, top: Drawable, end: Drawable, bottom: Drawable): Unit = definedExternally
    open fun setCompoundDrawablesRelativeWithIntrinsicBounds(start: Drawable, top: Drawable, end: Drawable, bottom: Drawable): Unit = definedExternally
    open fun getCompoundDrawables(): Array<Drawable> = definedExternally
    open fun getCompoundDrawablesRelative(): Array<Drawable> = definedExternally
    open fun setCompoundDrawablePadding(pad: Number): Unit = definedExternally
    open fun getCompoundDrawablePadding(): Number = definedExternally
    override fun setPadding(left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
    open fun getAutoLinkMask(): Number = definedExternally
    open fun getTextLocale(): Any = definedExternally
    open fun setTextLocale(locale: Any): Unit = definedExternally
    open fun getTextSize(): Number = definedExternally
    open fun setTextSize(size: Number): Unit = definedExternally
    open fun setTextSize(unit: String, size: Number): Unit = definedExternally
    open fun setRawTextSize(size: Number): Unit = definedExternally
    open fun getTextScaleX(): Number = definedExternally
    open fun setTextScaleX(size: Number): Unit = definedExternally
    open fun getTypeface(): Any = definedExternally
    open fun setTextColor(colors: ColorStateList): Unit = definedExternally
    open fun setTextColor(colors: Number): Unit = definedExternally
    open fun getTextColors(): ColorStateList = definedExternally
    open fun getCurrentTextColor(): Number = definedExternally
    open fun setHighlightColor(color: Number): Unit = definedExternally
    open fun getHighlightColor(): Number = definedExternally
    open fun setShowSoftInputOnFocus(show: Boolean): Unit = definedExternally
    open fun getShowSoftInputOnFocus(): Boolean = definedExternally
    open fun setShadowLayer(radius: Number, dx: Number, dy: Number, color: Number): Unit = definedExternally
    open fun getShadowRadius(): Number = definedExternally
    open fun getShadowDx(): Number = definedExternally
    open fun getShadowDy(): Number = definedExternally
    open fun getShadowColor(): Number = definedExternally
    open fun getPaint(): TextPaint = definedExternally
    open fun setAutoLinkMask(mask: Number): Unit = definedExternally
    open fun setLinksClickable(whether: Boolean): Unit = definedExternally
    open fun getLinksClickable(): Boolean = definedExternally
    open fun getUrls(): Array<Any> = definedExternally
    open fun setHintTextColor(colors: ColorStateList): Unit = definedExternally
    open fun setHintTextColor(colors: Number): Unit = definedExternally
    open fun getHintTextColors(): ColorStateList = definedExternally
    open fun getCurrentHintTextColor(): Number = definedExternally
    open fun setLinkTextColor(colors: Number): Unit = definedExternally
    open fun setLinkTextColor(colors: ColorStateList): Unit = definedExternally
    open fun getLinkTextColors(): ColorStateList = definedExternally
    open fun setGravity(gravity: Number): Unit = definedExternally
    open fun getGravity(): Number = definedExternally
    open fun getPaintFlags(): Number = definedExternally
    open fun setPaintFlags(flags: Number): Unit = definedExternally
    open fun setHorizontallyScrolling(whether: Boolean): Unit = definedExternally
    open fun getHorizontallyScrolling(): Boolean = definedExternally
    open fun setMinLines(minlines: Number): Unit = definedExternally
    open fun getMinLines(): Number = definedExternally
    open fun setMinHeight(minHeight: Number): Unit = definedExternally
    open fun getMinHeight(): Number = definedExternally
    open fun setMaxLines(maxlines: Number): Unit = definedExternally
    open fun getMaxLines(): Number = definedExternally
    open fun setMaxHeight(maxHeight: Number): Unit = definedExternally
    open fun getMaxHeight(): Number = definedExternally
    open fun setLines(lines: Number): Unit = definedExternally
    open fun setHeight(pixels: Number): Unit = definedExternally
    open fun setMinEms(minems: Number): Unit = definedExternally
    open fun getMinEms(): Number = definedExternally
    open fun setMinWidth(minpixels: Number): Unit = definedExternally
    open fun getMinWidth(): Number = definedExternally
    open fun setMaxEms(maxems: Number): Unit = definedExternally
    open fun getMaxEms(): Number = definedExternally
    open fun setMaxWidth(maxpixels: Number): Unit = definedExternally
    open fun getMaxWidth(): Number = definedExternally
    open fun setEms(ems: Number): Unit = definedExternally
    open fun setWidth(pixels: Number): Unit = definedExternally
    open fun setLineSpacing(add: Number, mult: Number): Unit = definedExternally
    open fun getLineSpacingMultiplier(): Number = definedExternally
    open fun getLineSpacingExtra(): Number = definedExternally
    open fun updateTextColors(): Unit = definedExternally
    override fun drawableStateChanged(): Unit = definedExternally
    open fun removeMisspelledSpans(spannable: Spannable): Unit = definedExternally
    open fun setFreezesText(freezesText: Boolean): Unit = definedExternally
    open fun getFreezesText(): Boolean = definedExternally
    open fun setSpannableFactory(factory: Spannable.Factory): Unit = definedExternally
    open fun setText(text: Any, type: TextView.BufferType? = definedExternally /* null */, notifyBefore: Boolean? = definedExternally /* null */, oldlen: Number? = definedExternally /* null */): Unit = definedExternally
    open fun setHint(hint: String): Unit = definedExternally
    open fun getHint(): String = definedExternally
    open fun isSingleLine(): Boolean = definedExternally
    open fun removeSuggestionSpans(text: String): String = definedExternally
    open fun hasPasswordTransformationMethod(): Unit = definedExternally
    open fun setRawInputType(type: Number): Unit = definedExternally
    open fun setInputType(type: Number, direct: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun getInputType(): Number = definedExternally
    open fun setImeOptions(imeOptions: Number): Unit = definedExternally
    open fun getImeOptions(): Number = definedExternally
    open fun setImeActionLabel(label: String, actionId: Number): Unit = definedExternally
    open fun getImeActionLabel(): String = definedExternally
    open fun getImeActionId(): Number = definedExternally
    open fun setOnEditorActionListener(l: TextView.OnEditorActionListener): Unit = definedExternally
    override fun setFrame(l: Number, t: Number, r: Number, b: Number): Boolean = definedExternally
    open fun restartMarqueeIfNeeded(): Unit = definedExternally
    open fun setFilters(filters: Array<Any>): Unit = definedExternally
    open fun setFilters(e: Any, filters: Array<Any>): Unit = definedExternally
    open fun getFilters(): Array<Any> = definedExternally
    open fun getBoxHeight(l: Any): Unit = definedExternally
    open fun getVerticalOffset(forceNormal: Boolean): Number = definedExternally
    open fun getBottomVerticalOffset(forceNormal: Any): Unit = definedExternally
    open fun invalidateRegion(start: Number, end: Number, invalidateCursor: Boolean): Unit = definedExternally
    open fun registerForPreDraw(): Unit = definedExternally
    override fun onPreDraw(): Boolean = definedExternally
    override fun onAttachedToWindow(): Unit = definedExternally
    override fun onDetachedFromWindow(): Unit = definedExternally
    open fun isPaddingOffsetRequired(): Boolean = definedExternally
    open fun getLeftPaddingOffset(): Number = definedExternally
    open fun getTopPaddingOffset(): Number = definedExternally
    open fun getBottomPaddingOffset(): Number = definedExternally
    open fun getRightPaddingOffset(): Number = definedExternally
    override fun verifyDrawable(who: Drawable): Boolean = definedExternally
    override fun jumpDrawablesToCurrentState(): Unit = definedExternally
    override fun drawableSizeChange(d: android.graphics.drawable.Drawable): Unit = definedExternally
    override fun invalidateDrawable(drawable: Drawable): Unit = definedExternally
    open fun isTextSelectable(): Boolean = definedExternally
    open fun setTextIsSelectable(selectable: Boolean): Unit = definedExternally
    override fun onCreateDrawableState(extraSpace: Number): Array<Number> = definedExternally
    open fun getUpdatedHighlightPath(): Unit = definedExternally
    open fun getHorizontalOffsetForDrawables(): Number = definedExternally
    override fun onDraw(canvas: Canvas): Unit = definedExternally
    override fun getFocusedRect(r: Rect): Unit = definedExternally
    open fun getLineCount(): Number = definedExternally
    open fun getLineBounds(line: Number, bounds: Rect): Number = definedExternally
    override fun getBaseline(): Number = definedExternally
    open fun getFadeTop(offsetRequired: Boolean): Number = definedExternally
    open fun getFadeHeight(offsetRequired: Boolean): Number = definedExternally
    override fun onKeyDown(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    open fun shouldAdvanceFocusOnEnter(): Unit = definedExternally
    open fun shouldAdvanceFocusOnTab(): Unit = definedExternally
    open fun doKeyDown(keyCode: Any, event: Any, otherEvent: Any): Unit = definedExternally
    open fun resetErrorChangedFlag(): Unit = definedExternally
    open fun hideErrorIfUnchanged(): Unit = definedExternally
    override fun onKeyUp(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    open fun onCheckIsTextEditor(): Boolean = definedExternally
    open fun nullLayouts(): Unit = definedExternally
    open fun assumeLayout(): Unit = definedExternally
    open fun getLayoutAlignment(): Unit = definedExternally
    open fun makeNewLayout(wantWidth: Number, hintWidth: Number, boring: BoringLayout.Metrics, hintBoring: BoringLayout.Metrics, ellipsisWidth: Number, bringIntoView: Boolean): Unit = definedExternally
    open fun makeSingleLayout(wantWidth: Any, boring: Any, ellipsisWidth: Any, alignment: Any, shouldEllipsize: Any, effectiveEllipsize: Any, useSaved: Any): Unit = definedExternally
    open fun compressText(width: Any): Unit = definedExternally
    open fun setIncludeFontPadding(includepad: Boolean): Unit = definedExternally
    open fun getIncludeFontPadding(): Boolean = definedExternally
    override fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    open fun getDesiredHeight(layout: Any? = definedExternally /* null */, cap: Any? = definedExternally /* null */): Unit = definedExternally
    open fun checkForResize(): Unit = definedExternally
    open fun checkForRelayout(): Unit = definedExternally
    override fun onLayout(changed: Boolean, left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
    open fun isShowingHint(): Unit = definedExternally
    open fun bringTextIntoView(): Unit = definedExternally
    open fun bringPointIntoView(offset: Number): Boolean = definedExternally
    open fun moveCursorToVisibleOffset(): Boolean = definedExternally
    override fun computeScroll(): Unit = definedExternally
    open fun getInterestingRect(r: Any, line: Any): Unit = definedExternally
    open fun convertFromViewportToContentCoordinates(r: Any): Unit = definedExternally
    open fun viewportToContentHorizontalOffset(): Number = definedExternally
    open fun viewportToContentVerticalOffset(): Number = definedExternally
    open fun getSelectionStart(): Number = definedExternally
    open fun getSelectionEnd(): Number = definedExternally
    open fun hasSelection(): Boolean = definedExternally
    open fun setAllCaps(allCaps: Boolean): Unit = definedExternally
    open fun setSingleLine(singleLine: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun setInputTypeSingleLine(singleLine: Any): Unit = definedExternally
    open fun applySingleLine(singleLine: Any, applyTransformation: Any, changeMaxLines: Any): Unit = definedExternally
    open fun setEllipsize(where: TextUtils.TruncateAt): Unit = definedExternally
    open fun setMarqueeRepeatLimit(marqueeLimit: Number): Unit = definedExternally
    open fun getMarqueeRepeatLimit(): Number = definedExternally
    open fun getEllipsize(): TextUtils.TruncateAt = definedExternally
    open fun setSelectAllOnFocus(selectAllOnFocus: Boolean): Unit = definedExternally
    open fun setCursorVisible(visible: Boolean): Unit = definedExternally
    open fun isCursorVisible(): Boolean = definedExternally
    open fun canMarquee(): Unit = definedExternally
    open fun startMarquee(): Unit = definedExternally
    open fun stopMarquee(): Unit = definedExternally
    open fun startStopMarquee(start: Any): Unit = definedExternally
    open fun onTextChanged(text: String, start: Number, lengthBefore: Number, lengthAfter: Number): Unit = definedExternally
    open fun onSelectionChanged(selStart: Number, selEnd: Number): Unit = definedExternally
    open fun addTextChangedListener(watcher: TextWatcher): Unit = definedExternally
    open fun removeTextChangedListener(watcher: TextWatcher): Unit = definedExternally
    open fun sendBeforeTextChanged(text: Any, start: Any, before: Any, after: Any): Unit = definedExternally
    open fun removeAdjacentSuggestionSpans(pos: Number): Unit = definedExternally
    open fun sendOnTextChanged(text: String, start: Number, before: Number, after: Number): Unit = definedExternally
    open fun sendAfterTextChanged(text: Any): Unit = definedExternally
    open fun updateAfterEdit(): Unit = definedExternally
    open fun handleTextChanged(buffer: String, start: Number, before: Number, after: Number): Unit = definedExternally
    open fun spanChange(buf: Spanned, what: Any, oldStart: Number, newStart: Number, oldEnd: Number, newEnd: Number): Unit = definedExternally
    override fun dispatchFinishTemporaryDetach(): Unit = definedExternally
    override fun onStartTemporaryDetach(): Unit = definedExternally
    override fun onFinishTemporaryDetach(): Unit = definedExternally
    override fun onFocusChanged(focused: Boolean, direction: Number, previouslyFocusedRect: Rect): Unit = definedExternally
    override fun onWindowFocusChanged(hasWindowFocus: Boolean): Unit = definedExternally
    override fun onVisibilityChanged(changedView: View, visibility: Number): Unit = definedExternally
    open fun clearComposingText(): Unit = definedExternally
    override fun setSelected(selected: Boolean): Unit = definedExternally
    override fun onTouchEvent(event: MotionEvent): Boolean = definedExternally
    override fun onGenericMotionEvent(event: MotionEvent): Boolean = definedExternally
    open fun isTextEditable(): Boolean = definedExternally
    open fun didTouchFocusSelect(): Boolean = definedExternally
    override fun cancelLongPress(): Unit = definedExternally
    open fun setScroller(s: OverScroller): Unit = definedExternally
    override fun getLeftFadingEdgeStrength(): Number = definedExternally
    override fun getRightFadingEdgeStrength(): Number = definedExternally
    override fun computeHorizontalScrollRange(): Number = definedExternally
    override fun computeVerticalScrollRange(): Number = definedExternally
    override fun computeVerticalScrollExtent(): Number = definedExternally
    open fun canSelectText(): Unit = definedExternally
    open fun textCanBeSelected(): Boolean = definedExternally
    open fun getTransformedText(start: Number, end: Number): String = definedExternally
    override fun performLongClick(): Boolean = definedExternally
    open fun isSuggestionsEnabled(): Boolean = definedExternally
    open fun setCustomSelectionActionModeCallback(actionModeCallback: Any): Unit = definedExternally
    open fun getCustomSelectionActionModeCallback(): Any = definedExternally
    open fun stopSelectionActionMode(): Unit = definedExternally
    open fun canCut(): Boolean = definedExternally
    open fun canCopy(): Boolean = definedExternally
    open fun canPaste(): Boolean = definedExternally
    open fun selectAllText(): Boolean = definedExternally
    open fun getOffsetForPosition(x: Number, y: Number): Number = definedExternally
    open fun convertToLocalHorizontalCoordinate(x: Number): Number = definedExternally
    open fun getLineAtCoordinate(y: Number): Number = definedExternally
    open fun getOffsetAtCoordinate(line: Any, x: Any): Unit = definedExternally
    open fun isInBatchEditMode(): Boolean = definedExternally
    open fun getTextDirectionHeuristic(): TextDirectionHeuristic = definedExternally
    open fun onResolveDrawables(layoutDirection: Number): Unit = definedExternally
    open fun resetResolvedDrawables(): Unit = definedExternally
    open fun deleteText_internal(start: Number, end: Number): Unit = definedExternally
    open fun replaceText_internal(start: Number, end: Number, text: String): Unit = definedExternally
    open fun setSpan_internal(span: Any, start: Number, end: Number, flags: Number): Unit = definedExternally
    open fun setCursorPosition_internal(start: Number, end: Number): Unit = definedExternally
    open fun createEditorIfNeeded(): Unit = definedExternally

    companion object {
        var LOG_TAG: String = definedExternally
        var DEBUG_EXTRACT: Boolean = definedExternally
        var SANS: Any = definedExternally
        var SERIF: Any = definedExternally
        var MONOSPACE: Any = definedExternally
        var SIGNED: Any = definedExternally
        var DECIMAL: Any = definedExternally
        var MARQUEE_FADE_NORMAL: Any = definedExternally
        var MARQUEE_FADE_SWITCH_SHOW_ELLIPSIS: Any = definedExternally
        var MARQUEE_FADE_SWITCH_SHOW_FADE: Any = definedExternally
        var LINES: Any = definedExternally
        var EMS: Any = definedExternally
        var PIXELS: Any = definedExternally
        var TEMP_RECTF: Any = definedExternally
        var VERY_WIDE: Any = definedExternally
        var ANIMATED_SCROLL_GAP: Any = definedExternally
        var NO_FILTERS: Any = definedExternally
        var CHANGE_WATCHER_PRIORITY: Any = definedExternally
        var MULTILINE_STATE_SET: Any = definedExternally
        var LAST_CUT_OR_COPY_TIME: Number = definedExternally
        fun isMultilineInputType(type: Any): Unit = definedExternally
        fun isPasswordInputType(inputType: Any): Unit = definedExternally
        fun isVisiblePasswordInputType(inputType: Any): Unit = definedExternally
        fun desired(layout: Any): Unit = definedExternally
        var UNKNOWN_BORING: Any = definedExternally
        fun getTextColors(): ColorStateList = definedExternally
        fun getTextColor(def: Number): Number = definedExternally
    }
}

external open class Button(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : TextView
external interface Checkable {
    fun setChecked(checked: Boolean)
    fun isChecked(): Boolean
    fun toggle()
}

external interface ListAdapter : Adapter {
    fun areAllItemsEnabled(): Boolean
    fun isEnabled(position: Number): Boolean
    //fun isImpl(obj: Any): Any = definedExternally
}

external open class AbsListView(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : AdapterView<ListAdapter>, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnTouchModeChangeListener {
    interface OnScrollListener {
        fun onScrollStateChanged(view: AbsListView, scrollState: Number)
        fun onScroll(view: AbsListView, firstVisibleItem: Number, visibleItemCount: Number, totalItemCount: Number)
//        var SCROLL_STATE_IDLE: Number = definedExternally
//        var SCROLL_STATE_TOUCH_SCROLL: Number = definedExternally
//        var SCROLL_STATE_FLING: Number = definedExternally
    }

    interface SelectionBoundsAdjuster {
        fun adjustListItemSelectionBounds(bounds: Rect)
    }

    open class WindowRunnnable(arg: AbsListView) {
        open var _AbsListView_this: AbsListView = definedExternally
        open var mOriginalAttachCount: Any = definedExternally
        open fun rememberWindowAttachCount(): Unit = definedExternally
        open fun sameWindow(): Boolean = definedExternally
    }

    open class PerformClick(arg: AbsListView) : AbsListView.WindowRunnnable, Runnable {
        override var _AbsListView_this: AbsListView = definedExternally
        open var mClickMotionPosition: Number = definedExternally
        override fun run(): Unit = definedExternally
    }

    open class CheckForLongPress(arg: AbsListView) : AbsListView.WindowRunnnable, Runnable {
        override var _AbsListView_this: AbsListView = definedExternally
        override fun run(): Unit = definedExternally
    }

    open class CheckForKeyLongPress(arg: AbsListView) : AbsListView.WindowRunnnable, Runnable {
        override var _AbsListView_this: AbsListView = definedExternally
        override fun run(): Unit = definedExternally
    }

    open class CheckForTap(arg: AbsListView) : Runnable {
        open var _AbsListView_this: AbsListView = definedExternally
        override fun run(): Unit = definedExternally
    }

    open class FlingRunnable(arg: AbsListView) : Runnable {
        open var _AbsListView_this: AbsListView = definedExternally
        open var mScroller: OverScroller = definedExternally
        open var mLastFlingY: Any = definedExternally
        open var mCheckFlywheel: Any = definedExternally
        open fun start(initialVelocity: Number): Unit = definedExternally
        open fun startSpringback(): Unit = definedExternally
        open fun startOverfling(initialVelocity: Number): Unit = definedExternally
        open fun edgeReached(delta: Any): Unit = definedExternally
        open fun startScroll(distance: Number, duration: Number, linear: Boolean): Unit = definedExternally
        open fun endFling(): Unit = definedExternally
        open fun flywheelTouch(): Unit = definedExternally
        override fun run(): Unit = definedExternally

        companion object {
            var FLYWHEEL_TIMEOUT: Number = definedExternally
        }
    }

    open class PositionScroller(arg: AbsListView) : Runnable {
        open var _AbsListView_this: AbsListView = definedExternally
        open var mMode: Any = definedExternally
        open var mTargetPos: Any = definedExternally
        open var mBoundPos: Any = definedExternally
        open var mLastSeenPos: Any = definedExternally
        open var mScrollDuration: Any = definedExternally
        open var mExtraScroll: Any = definedExternally
        open var mOffsetFromTop: Any = definedExternally
        open fun start(position: Number, boundPosition: Number? = definedExternally /* null */): Unit = definedExternally
        open fun _start_1(position: Any): Unit = definedExternally
        open fun _start_2(position: Any, boundPosition: Any): Unit = definedExternally
        open fun startWithOffset(position: Number, offset: Number, duration: Number? = definedExternally /* null */): Unit = definedExternally
        open fun scrollToVisible(targetPos: Any, boundPos: Any, duration: Any): Unit = definedExternally
        open fun stop(): Unit = definedExternally
        override fun run(): Unit = definedExternally

        companion object {
            var SCROLL_DURATION: Any = definedExternally
            var MOVE_DOWN_POS: Any = definedExternally
            var MOVE_UP_POS: Any = definedExternally
            var MOVE_DOWN_BOUND: Any = definedExternally
            var MOVE_UP_BOUND: Any = definedExternally
            var MOVE_OFFSET: Any = definedExternally
        }
    }

    open class AdapterDataSetObserver(arg: Any) : AdapterView.AdapterDataSetObserver {
        open var _AbsListView_this: AbsListView = definedExternally
        override fun onChanged(): Unit = definedExternally
        override fun onInvalidated(): Unit = definedExternally
    }

    open class LayoutParams : ViewGroup.LayoutParams {
        constructor(context: android.content.Context, attrs: HTMLElement)
        constructor(w: Number, h: Number)
        constructor(w: Number, h: Number, viewType: Number)
        constructor(source: ViewGroup.LayoutParams)

        open var viewType: Number = definedExternally
        open var recycledHeaderFooter: Boolean = definedExternally
        open var forceAdd: Boolean = definedExternally
        open var scrappedFromPosition: Number = definedExternally
        open var itemId: Number = definedExternally
    }

    interface RecyclerListener {
        fun onMovedToScrapHeap(view: View)
    }

    open class RecycleBin(arg: AbsListView) {
        open var _AbsListView_this: AbsListView = definedExternally
        open var mRecyclerListener: AbsListView.RecyclerListener = definedExternally
        open var mFirstActivePosition: Any = definedExternally
        open var mActiveViews: Array<View> = definedExternally
        open var mScrapViews: Any = definedExternally
        open var mViewTypeCount: Any = definedExternally
        open var mCurrentScrap: Any = definedExternally
        open var mSkippedScrap: Any = definedExternally
        open var mTransientStateViews: Any = definedExternally
        open var mTransientStateViewsById: Any = definedExternally
        open fun setViewTypeCount(viewTypeCount: Number): Unit = definedExternally
        open fun markChildrenDirty(): Unit = definedExternally
        open fun shouldRecycleViewType(viewType: Number): Boolean = definedExternally
        open fun clear(): Unit = definedExternally
        open fun fillActiveViews(childCount: Number, firstActivePosition: Number): Unit = definedExternally
        open fun getActiveView(position: Number): View = definedExternally
        open fun getTransientStateView(position: Number): View = definedExternally
        open fun clearTransientStateViews(): Unit = definedExternally
        open fun getScrapView(position: Number): View = definedExternally
        open fun addScrapView(scrap: View, position: Number): Unit = definedExternally
        open fun removeSkippedScrap(): Unit = definedExternally
        open fun scrapActiveViews(): Unit = definedExternally
        open fun pruneScrapViews(): Unit = definedExternally
        open fun reclaimScrapViews(views: List<View>): Unit = definedExternally
        open fun setCacheColorHint(color: Number): Unit = definedExternally
    }

    open var mChoiceMode: Number = definedExternally
    open var mChoiceActionMode: Any = definedExternally
    open var mCheckedItemCount: Any = definedExternally
    open var mCheckStates: SparseBooleanArray = definedExternally
    open var mCheckedIdStates: Any = definedExternally
    open var mDataSetObserver: AbsListView.AdapterDataSetObserver = definedExternally
    open var mAdapter: ListAdapter = definedExternally
    open var mAdapterHasStableIds: Any = definedExternally
    open var mDeferNotifyDataSetChanged: Any = definedExternally
    open var mDrawSelectorOnTop: Any = definedExternally
    open var mSelector: Any = definedExternally
    open var mSelectorPosition: Any = definedExternally
    open var mSelectorRect: Rect = definedExternally
    open var mRecycler: AbsListView.RecycleBin = definedExternally
    open var mSelectionLeftPadding: Any = definedExternally
    open var mSelectionTopPadding: Any = definedExternally
    open var mSelectionRightPadding: Any = definedExternally
    open var mSelectionBottomPadding: Any = definedExternally
    open var mListPadding: Rect = definedExternally
    open var mWidthMeasureSpec: Number = definedExternally
    open var mScrollUp: Any = definedExternally
    open var mScrollDown: Any = definedExternally
    open var mCachingStarted: Boolean = definedExternally
    open var mCachingActive: Boolean = definedExternally
    open var mMotionPosition: Number = definedExternally
    open var mMotionViewOriginalTop: Any = definedExternally
    open var mMotionViewNewTop: Any = definedExternally
    open var mMotionX: Any = definedExternally
    open var mMotionY: Any = definedExternally
    open var mTouchMode: Number = definedExternally
    open var mLastY: Any = definedExternally
    open var mMotionCorrection: Any = definedExternally
    open var mVelocityTracker: Any = definedExternally
    open var mFlingRunnable: AbsListView.FlingRunnable = definedExternally
    open var mPositionScroller: AbsListView.PositionScroller = definedExternally
    open var mSelectedTop: Number = definedExternally
    open var mStackFromBottom: Boolean = definedExternally
    open var mScrollingCacheEnabled: Any = definedExternally
    open var mFastScrollEnabled: Any = definedExternally
    open var mFastScrollAlwaysVisible: Any = definedExternally
    open var mOnScrollListener: Any = definedExternally
    open var mSmoothScrollbarEnabled: Any = definedExternally
    open var mTextFilterEnabled: Any = definedExternally
    open var mFiltered: Any = definedExternally
    open var mTouchFrame: Any = definedExternally
    open var mResurrectToPosition: Number = definedExternally
    open var mOverscrollMax: Any = definedExternally
    open var mLastTouchMode: Any = definedExternally
    open var mScrollProfilingStarted: Any = definedExternally
    open var mFlingProfilingStarted: Any = definedExternally
    open var mPendingCheckForLongPress_List: Any = definedExternally
    open var mPendingCheckForTap_: Any = definedExternally
    open var mPendingCheckForKeyLongPress: Any = definedExternally
    open var mPerformClick_: Any = definedExternally
    open var mTouchModeReset: Runnable = definedExternally
    open var mTranscriptMode: Any = definedExternally
    open var mCacheColorHint: Any = definedExternally
    open var mIsChildViewEnabled: Any = definedExternally
    open var mLastScrollState: Any = definedExternally
    open var mGlobalLayoutListenerAddedFilter: Any = definedExternally
    open var mDensityScale: Any = definedExternally
    open var mClearScrollingCache: Any = definedExternally
    open var mPositionScrollAfterLayout: Runnable = definedExternally
    open var mMinimumVelocity: Any = definedExternally
    open var mMaximumVelocity: Any = definedExternally
    open var mVelocityScale: Any = definedExternally
    open var mIsScrap: Array<Boolean> = definedExternally
    open var mPopupHidden: Any = definedExternally
    open var mActivePointerId: Any = definedExternally
    open var mOverscrollDistance: Any = definedExternally
    open var _mOverflingDistance: Any = definedExternally
    open var mOverflingDistance: Any = definedExternally
    open var mFirstPositionDistanceGuess: Any = definedExternally
    open var mLastPositionDistanceGuess: Any = definedExternally
    open var mDirection: Any = definedExternally
    open var mForceTranscriptScroll: Any = definedExternally
    open var mGlowPaddingLeft: Any = definedExternally
    open var mGlowPaddingRight: Any = definedExternally
    open var mLastHandledItemCount: Any = definedExternally
    open var mPendingSync: Any = definedExternally
    open fun initAbsListView(): Unit = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    override fun setOverScrollMode(mode: Number): Unit = definedExternally
    override fun setAdapter(adapter: ListAdapter): Unit = definedExternally
    open fun getCheckedItemCount(): Number = definedExternally
    open fun isItemChecked(position: Number): Boolean = definedExternally
    open fun getCheckedItemPosition(): Number = definedExternally
    open fun getCheckedItemPositions(): SparseBooleanArray = definedExternally
    open fun getCheckedItemIds(): Array<Number> = definedExternally
    open fun clearChoices(): Unit = definedExternally
    open fun setItemChecked(position: Number, value: Boolean): Unit = definedExternally
    override fun performItemClick(view: View, position: Number, id: Number): Boolean = definedExternally
    open fun updateOnScreenCheckedViews(): Unit = definedExternally
    open fun getChoiceMode(): Number = definedExternally
    open fun setChoiceMode(choiceMode: Number): Unit = definedExternally
    open fun contentFits(): Unit = definedExternally
    open fun setFastScrollEnabled(enabled: Boolean): Unit = definedExternally
    open fun setFastScrollerEnabledUiThread(enabled: Any): Unit = definedExternally
    open fun setFastScrollAlwaysVisible(alwaysShow: Boolean): Unit = definedExternally
    open fun setFastScrollerAlwaysVisibleUiThread(alwaysShow: Any): Unit = definedExternally
    open fun isOwnerThread(): Unit = definedExternally
    open fun isFastScrollAlwaysVisible(): Boolean = definedExternally
    override fun getVerticalScrollbarWidth(): Number = definedExternally
    open fun isFastScrollEnabled(): Boolean = definedExternally
    override fun setVerticalScrollbarPosition(position: Number): Unit = definedExternally
    override fun setScrollBarStyle(style: Number): Unit = definedExternally
    override fun isVerticalScrollBarHidden(): Boolean = definedExternally
    open fun setSmoothScrollbarEnabled(enabled: Boolean): Unit = definedExternally
    open fun isSmoothScrollbarEnabled(): Boolean = definedExternally
    open fun setOnScrollListener(l: AbsListView.OnScrollListener): Unit = definedExternally
    open fun invokeOnItemScrollListener(): Unit = definedExternally
    open fun isScrollingCacheEnabled(): Boolean = definedExternally
    open fun setScrollingCacheEnabled(enabled: Boolean): Unit = definedExternally
    open fun setTextFilterEnabled(textFilterEnabled: Boolean): Unit = definedExternally
    open fun isTextFilterEnabled(): Boolean = definedExternally
    override fun getFocusedRect(r: Rect): Unit = definedExternally
    open fun useDefaultSelector(): Unit = definedExternally
    open fun isStackFromBottom(): Boolean = definedExternally
    open fun setStackFromBottom(stackFromBottom: Boolean): Unit = definedExternally
    open fun requestLayoutIfNecessary(): Unit = definedExternally
    override fun onFocusChanged(gainFocus: Boolean, direction: Number, previouslyFocusedRect: Rect): Unit = definedExternally
    override fun requestLayout(): Unit = definedExternally
    open fun resetList(): Unit = definedExternally
    override fun computeVerticalScrollExtent(): Number = definedExternally
    override fun computeVerticalScrollOffset(): Number = definedExternally
    override fun computeVerticalScrollRange(): Number = definedExternally
    override fun getTopFadingEdgeStrength(): Number = definedExternally
    override fun getBottomFadingEdgeStrength(): Number = definedExternally
    override fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    override fun onLayout(changed: Boolean, l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
    override fun setFrame(left: Number, top: Number, right: Number, bottom: Number): Boolean = definedExternally
    open fun layoutChildren(): Unit = definedExternally
    open fun updateScrollIndicators(): Unit = definedExternally
    override fun getSelectedView(): View = definedExternally
    open fun getListPaddingTop(): Number = definedExternally
    open fun getListPaddingBottom(): Number = definedExternally
    open fun getListPaddingLeft(): Number = definedExternally
    open fun getListPaddingRight(): Number = definedExternally
    open fun obtainView(position: Number, isScrap: Array<Boolean>): View = definedExternally
    open fun positionSelector(l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
    open fun positionSelector(position: Number, sel: View): Unit = definedExternally
    override fun dispatchDraw(canvas: Canvas): Unit = definedExternally
    open fun isPaddingOffsetRequired(): Boolean = definedExternally
    open fun getLeftPaddingOffset(): Number = definedExternally
    open fun getTopPaddingOffset(): Number = definedExternally
    open fun getRightPaddingOffset(): Number = definedExternally
    open fun getBottomPaddingOffset(): Number = definedExternally
    override fun onSizeChanged(w: Number, h: Number, oldw: Number, oldh: Number): Unit = definedExternally
    open fun touchModeDrawsInPressedState(): Boolean = definedExternally
    open fun shouldShowSelector(): Boolean = definedExternally
    open fun drawSelector(canvas: Any): Unit = definedExternally
    open fun setDrawSelectorOnTop(onTop: Boolean): Unit = definedExternally
    open fun setSelector(sel: Drawable): Unit = definedExternally
    open fun getSelector(): Drawable = definedExternally
    open fun keyPressed(): Unit = definedExternally
    open fun setScrollIndicators(up: View, down: View): Unit = definedExternally
    open fun updateSelectorState(): Unit = definedExternally
    override fun drawableStateChanged(): Unit = definedExternally
    override fun onCreateDrawableState(extraSpace: Number): Array<Number> = definedExternally
    override fun verifyDrawable(dr: Drawable): Boolean = definedExternally
    override fun jumpDrawablesToCurrentState(): Unit = definedExternally
    override fun onAttachedToWindow(): Unit = definedExternally
    override fun onDetachedFromWindow(): Unit = definedExternally
    override fun onWindowFocusChanged(hasWindowFocus: Boolean): Unit = definedExternally
    override fun onCancelPendingInputEvents(): Unit = definedExternally
    open fun performLongPress(child: Any, longPressPosition: Any, longPressId: Any): Unit = definedExternally
    override fun onKeyDown(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    override fun onKeyUp(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    override fun dispatchSetPressed(pressed: Boolean): Unit = definedExternally
    open fun pointToPosition(x: Number, y: Number): Number = definedExternally
    open fun pointToRowId(x: Number, y: Number): Number = definedExternally
    open fun checkOverScrollStartScrollIfNeeded(): Boolean = definedExternally
    open fun startScrollIfNeeded(y: Any): Unit = definedExternally
    open fun scrollIfNeeded(y: Any): Unit = definedExternally
    override fun onTouchModeChanged(isInTouchMode: Boolean): Unit = definedExternally
    override fun onTouchEvent(ev: MotionEvent): Boolean = definedExternally
    open fun onTouchDown(ev: Any): Unit = definedExternally
    open fun onTouchMove(ev: Any): Unit = definedExternally
    open fun onTouchUp(ev: Any): Unit = definedExternally
    open fun onTouchCancel(): Unit = definedExternally
    override fun onOverScrolled(scrollX: Number, scrollY: Number, clampedX: Boolean, clampedY: Boolean): Unit = definedExternally
    override fun onGenericMotionEvent(event: MotionEvent): Boolean = definedExternally
    override fun draw(canvas: Canvas): Unit = definedExternally
    open fun setOverScrollEffectPadding(leftPadding: Number, rightPadding: Number): Unit = definedExternally
    open fun initOrResetVelocityTracker(): Unit = definedExternally
    open fun initVelocityTrackerIfNotExists(): Unit = definedExternally
    open fun recycleVelocityTracker(): Unit = definedExternally
    override fun requestDisallowInterceptTouchEvent(disallowIntercept: Boolean): Unit = definedExternally
    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean = definedExternally
    open fun onSecondaryPointerUp(ev: Any): Unit = definedExternally
    override fun addTouchables(views: ArrayList<View>): Unit = definedExternally
    open fun reportScrollStateChange(newState: Any): Unit = definedExternally
    open fun setFriction(friction: Number): Unit = definedExternally
    open fun setVelocityScale(scale: Number): Unit = definedExternally
    open fun smoothScrollToPositionFromTop(position: Number, offset: Number, duration: Number? = definedExternally /* null */): Unit = definedExternally
    open fun smoothScrollToPosition(position: Number, boundPosition: Number? = definedExternally /* null */): Unit = definedExternally
    open fun smoothScrollBy(distance: Number, duration: Number, linear: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun smoothScrollByOffset(position: Number): Unit = definedExternally
    open fun createScrollingCache(): Unit = definedExternally
    open fun clearScrollingCache(): Unit = definedExternally
    open fun scrollListBy(y: Number): Unit = definedExternally
    open fun canScrollList(direction: Number): Boolean = definedExternally
    open fun trackMotionScroll(deltaY: Any, incrementalDeltaY: Any): Unit = definedExternally
    open fun getHeaderViewsCount(): Number = definedExternally
    open fun getFooterViewsCount(): Number = definedExternally
    open fun fillGap(down: Boolean): Unit = definedExternally
    open fun hideSelector(): Unit = definedExternally
    open fun reconcileSelectedPosition(): Number = definedExternally
    open fun findMotionRow(y: Number): Number = definedExternally
    open fun findClosestMotionRow(y: Any): Unit = definedExternally
    open fun invalidateViews(): Unit = definedExternally
    open fun resurrectSelectionIfNeeded(): Boolean = definedExternally
    open fun setSelectionInt(position: Number): Unit = definedExternally
    open fun resurrectSelection(): Unit = definedExternally
    open fun confirmCheckedPositionsById(): Unit = definedExternally
    override fun handleDataChanged(): Unit = definedExternally
    override fun onDisplayHint(hint: Number): Unit = definedExternally
    open fun dismissPopup(): Unit = definedExternally
    open fun showPopup(): Unit = definedExternally
    open fun positionPopup(): Unit = definedExternally
    override fun isInFilterMode(): Boolean = definedExternally
    open fun hasTextFilter(): Boolean = definedExternally
    override fun onGlobalLayout(): Unit = definedExternally
    override fun generateDefaultLayoutParams(): ViewGroup.LayoutParams = definedExternally
    override fun generateLayoutParams(p: ViewGroup.LayoutParams): ViewGroup.LayoutParams = definedExternally
    override fun generateLayoutParamsFromAttr(attrs: HTMLElement): ViewGroup.LayoutParams = definedExternally
    override fun checkLayoutParams(p: ViewGroup.LayoutParams): Boolean = definedExternally
    open fun setTranscriptMode(mode: Number): Unit = definedExternally
    open fun getTranscriptMode(): Number = definedExternally
    open fun getSolidColor(): Number = definedExternally
    open fun setCacheColorHint(color: Number): Unit = definedExternally
    open fun getCacheColorHint(): Number = definedExternally
    open fun reclaimViews(views: List<View>): Unit = definedExternally
    open fun finishGlows(): Unit = definedExternally
    open fun setVisibleRangeHint(start: Number, end: Number): Unit = definedExternally
    open fun setRecyclerListener(listener: AbsListView.RecyclerListener): Unit = definedExternally

    companion object {
        var TAG_AbsListView: String = definedExternally
        var TRANSCRIPT_MODE_DISABLED: Number = definedExternally
        var TRANSCRIPT_MODE_NORMAL: Number = definedExternally
        var TRANSCRIPT_MODE_ALWAYS_SCROLL: Number = definedExternally
        var TOUCH_MODE_REST: Number = definedExternally
        var TOUCH_MODE_DOWN: Number = definedExternally
        var TOUCH_MODE_TAP: Number = definedExternally
        var TOUCH_MODE_DONE_WAITING: Number = definedExternally
        var TOUCH_MODE_SCROLL: Number = definedExternally
        var TOUCH_MODE_FLING: Number = definedExternally
        var TOUCH_MODE_OVERSCROLL: Any = definedExternally
        var TOUCH_MODE_OVERFLING: Number = definedExternally
        var LAYOUT_NORMAL: Number = definedExternally
        var LAYOUT_FORCE_TOP: Number = definedExternally
        var LAYOUT_SET_SELECTION: Number = definedExternally
        var LAYOUT_FORCE_BOTTOM: Number = definedExternally
        var LAYOUT_SPECIFIC: Number = definedExternally
        var LAYOUT_SYNC: Number = definedExternally
        var LAYOUT_MOVE_SELECTION: Number = definedExternally
        var CHOICE_MODE_NONE: Number = definedExternally
        var CHOICE_MODE_SINGLE: Number = definedExternally
        var CHOICE_MODE_MULTIPLE: Number = definedExternally
        var CHOICE_MODE_MULTIPLE_MODAL: Number = definedExternally
        var OVERSCROLL_LIMIT_DIVISOR: Any = definedExternally
        var CHECK_POSITION_SEARCH_DISTANCE: Any = definedExternally
        var TOUCH_MODE_UNKNOWN: Any = definedExternally
        var TOUCH_MODE_ON: Any = definedExternally
        var TOUCH_MODE_OFF: Any = definedExternally
        var PROFILE_SCROLLING: Any = definedExternally
        var PROFILE_FLINGING: Boolean = definedExternally
        var INVALID_POINTER: Number = definedExternally
        var sLinearInterpolator: Interpolator = definedExternally
        fun getDistance(source: Rect, dest: Rect, direction: Number): Number = definedExternally
        fun retrieveFromScrap(scrapViews: ArrayList<View>, position: Number): View = definedExternally
    }
}

external interface WrapperListAdapter : ListAdapter {
    fun getWrappedAdapter(): ListAdapter
}

external open class HeaderViewListAdapter(headerViewInfos: ArrayList<ListView.FixedViewInfo>, footerViewInfos: ArrayList<ListView.FixedViewInfo>, adapter: ListAdapter) : WrapperListAdapter {
    open var mAdapter: Any = definedExternally
    open var mHeaderViewInfos: ArrayList<ListView.FixedViewInfo> = definedExternally
    open var mFooterViewInfos: ArrayList<ListView.FixedViewInfo> = definedExternally
    open var mAreAllFixedViewsSelectable: Boolean = definedExternally
    open var mIsFilterable: Any = definedExternally
    open fun getHeadersCount(): Number = definedExternally
    open fun getFootersCount(): Number = definedExternally
    override fun isEmpty(): Boolean = definedExternally
    open fun areAllListInfosSelectable(infos: Any): Unit = definedExternally
    open fun removeHeader(v: View): Boolean = definedExternally
    open fun removeFooter(v: View): Boolean = definedExternally
    override fun getCount(): Number = definedExternally
    override fun areAllItemsEnabled(): Boolean = definedExternally
    override fun isEnabled(position: Number): Boolean = definedExternally
    override fun getItem(position: Number): Any = definedExternally
    override fun getItemId(position: Number): Number = definedExternally
    override fun hasStableIds(): Boolean = definedExternally
    override fun getView(position: Number, convertView: View, parent: ViewGroup): View = definedExternally
    override fun getItemViewType(position: Number): Number = definedExternally
    override fun getViewTypeCount(): Number = definedExternally
    override fun registerDataSetObserver(observer: DataSetObserver): Unit = definedExternally
    override fun unregisterDataSetObserver(observer: DataSetObserver): Unit = definedExternally
    open fun getFilter(): Any = definedExternally
    override fun getWrappedAdapter(): ListAdapter = definedExternally

    companion object {
        var EMPTY_INFO_LIST: ArrayList<ListView.FixedViewInfo> = definedExternally
    }
}

external interface SpinnerAdapter : Adapter {
    fun getDropDownView(position: Number, convertView: View, parent: ViewGroup): View
}

external open class BaseAdapter : ListAdapter, SpinnerAdapter {
    open var mDataSetObservable: Any = definedExternally
    override fun hasStableIds(): Boolean = definedExternally
    override fun registerDataSetObserver(observer: DataSetObserver): Unit = definedExternally
    override fun unregisterDataSetObserver(observer: DataSetObserver): Unit = definedExternally
    open fun notifyDataSetChanged(): Unit = definedExternally
    open fun notifyDataSetInvalidated(): Unit = definedExternally
    override fun areAllItemsEnabled(): Boolean = definedExternally
    override fun isEnabled(position: Number): Boolean = definedExternally
    override fun getDropDownView(position: Number, convertView: View, parent: ViewGroup): View = definedExternally
    override fun getItemViewType(position: Number): Number = definedExternally
    override fun getViewTypeCount(): Number = definedExternally
    override fun isEmpty(): Boolean = definedExternally
    override fun getView(position: Number, convertView: View, parent: ViewGroup): View = definedExternally
    override fun getCount(): Number = definedExternally
    override fun getItem(position: Number): Any = definedExternally
    override fun getItemId(position: Number): Number = definedExternally
}

external open class ListView(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : AbsListView {
    open class FixedViewInfo(arg: ListView) {
        open var _ListView_this: ListView = definedExternally
        open var view: View = definedExternally
        open var data: Any = definedExternally
        open var isSelectable: Boolean = definedExternally
    }

    open class FocusSelector(arg: ListView) : Runnable {
        open var _ListView_this: ListView = definedExternally
        open var mPosition: Any = definedExternally
        open var mPositionTop: Any = definedExternally
        open fun setup(position: Number, top: Number): ListView.FocusSelector = definedExternally
        override fun run(): Unit = definedExternally
    }

    open class ArrowScrollFocusResult {
        open var mSelectedPosition: Any = definedExternally
        open var mAmountToScroll: Any = definedExternally
        open fun populate(selectedPosition: Number, amountToScroll: Number): Unit = definedExternally
        open fun getSelectedPosition(): Number = definedExternally
        open fun getAmountToScroll(): Number = definedExternally
    }

    open var mHeaderViewInfos: Any = definedExternally
    open var mFooterViewInfos: Any = definedExternally
    open var mDivider: Drawable = definedExternally
    open var mDividerHeight: Number = definedExternally
    open var mOverScrollHeader: Drawable = definedExternally
    open var mOverScrollFooter: Drawable = definedExternally
    open var mIsCacheColorOpaque: Any = definedExternally
    open var mDividerIsOpaque: Any = definedExternally
    open var mHeaderDividersEnabled: Any = definedExternally
    open var mFooterDividersEnabled: Any = definedExternally
    open var mAreAllItemsSelectable: Any = definedExternally
    open var mItemsCanFocus: Any = definedExternally
    open var mTempRect: Any = definedExternally
    open var mDividerPaint: Any = definedExternally
    open var mArrowScrollFocusResult: Any = definedExternally
    open var mFocusSelector: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    open fun getMaxScrollAmount(): Number = definedExternally
    open fun adjustViewsUpOrDown(): Unit = definedExternally
    open fun addHeaderView(v: View, data: Any? = definedExternally /* null */, isSelectable: Boolean? = definedExternally /* null */): Unit = definedExternally
    override fun getHeaderViewsCount(): Number = definedExternally
    open fun removeHeaderView(v: View): Boolean = definedExternally
    open fun removeFixedViewInfo(v: Any, where: Any): Unit = definedExternally
    open fun addFooterView(v: View, data: Any? = definedExternally /* null */, isSelectable: Boolean? = definedExternally /* null */): Unit = definedExternally
    override fun getFooterViewsCount(): Number = definedExternally
    open fun removeFooterView(v: View): Boolean = definedExternally
    override fun getAdapter(): ListAdapter = definedExternally
    override fun setAdapter(adapter: ListAdapter): Unit = definedExternally
    override fun resetList(): Unit = definedExternally
    open fun clearRecycledState(infos: Any): Unit = definedExternally
    open fun showingTopFadingEdge(): Unit = definedExternally
    open fun showingBottomFadingEdge(): Unit = definedExternally
    override fun requestChildRectangleOnScreen(child: View, rect: Rect, immediate: Boolean): Boolean = definedExternally
    override fun fillGap(down: Boolean): Unit = definedExternally
    open fun fillDown(pos: Any, nextTop: Any): Unit = definedExternally
    open fun fillUp(pos: Any, nextBottom: Any): Unit = definedExternally
    open fun fillFromTop(nextTop: Any): Unit = definedExternally
    open fun fillFromMiddle(childrenTop: Any, childrenBottom: Any): Unit = definedExternally
    open fun fillAboveAndBelow(sel: Any, position: Any): Unit = definedExternally
    open fun fillFromSelection(selectedTop: Any, childrenTop: Any, childrenBottom: Any): Unit = definedExternally
    open fun getBottomSelectionPixel(childrenBottom: Any, fadingEdgeLength: Any, selectedPosition: Any): Unit = definedExternally
    open fun getTopSelectionPixel(childrenTop: Any, fadingEdgeLength: Any, selectedPosition: Any): Unit = definedExternally
    override fun smoothScrollToPosition(position: Number, boundPosition: Number?): Unit = definedExternally
    override fun smoothScrollByOffset(offset: Number): Unit = definedExternally
    open fun moveSelection(oldSel: Any, newSel: Any, delta: Any, childrenTop: Any, childrenBottom: Any): Unit = definedExternally
    override fun onSizeChanged(w: Number, h: Number, oldw: Number, oldh: Number): Unit = definedExternally
    override fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    open fun measureScrapChild(child: Any, position: Any, widthMeasureSpec: Any): Unit = definedExternally
    open fun recycleOnMeasure(): Boolean = definedExternally
    open fun measureHeightOfChildren(widthMeasureSpec: Number, startPosition: Number, endPosition: Number, maxHeight: Number, disallowPartialChildPosition: Number): Number = definedExternally
    override fun findMotionRow(y: Number): Number = definedExternally
    open fun fillSpecific(position: Any, top: Any): Unit = definedExternally
    open fun correctTooHigh(childCount: Any): Unit = definedExternally
    open fun correctTooLow(childCount: Any): Unit = definedExternally
    override fun layoutChildren(): Unit = definedExternally
    open fun makeAndAddView(position: Any, y: Any, flow: Any, childrenLeft: Any, selected: Any): Unit = definedExternally
    open fun setupChild(child: Any, position: Any, y: Any, flowDown: Any, childrenLeft: Any, selected: Any, recycled: Any): Unit = definedExternally
    override fun canAnimate(): Boolean = definedExternally
    override fun setSelection(position: Number): Unit = definedExternally
    open fun setSelectionFromTop(position: Number, y: Number): Unit = definedExternally
    override fun setSelectionInt(position: Number): Unit = definedExternally
    override fun lookForSelectablePosition(position: Number, lookDown: Boolean): Number = definedExternally
    open fun lookForSelectablePositionAfter(current: Number, position: Number, lookDown: Boolean): Number = definedExternally
    open fun setSelectionAfterHeaderView(): Unit = definedExternally
    override fun dispatchKeyEvent(event: KeyEvent): Boolean = definedExternally
    override fun onKeyDown(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    open fun onKeyMultiple(keyCode: Number, repeatCount: Number, event: KeyEvent): Boolean = definedExternally
    override fun onKeyUp(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    open fun commonKey(keyCode: Any, count: Any, event: Any): Unit = definedExternally
    open fun pageScroll(direction: Number): Boolean = definedExternally
    open fun fullScroll(direction: Number): Boolean = definedExternally
    open fun handleHorizontalFocusWithinListItem(direction: Any): Unit = definedExternally
    open fun arrowScroll(direction: Number): Boolean = definedExternally
    open fun nextSelectedPositionForDirection(selectedView: Any, selectedPos: Any, direction: Any): Unit = definedExternally
    open fun arrowScrollImpl(direction: Any): Unit = definedExternally
    open fun handleNewSelectionChange(selectedView: Any, direction: Any, newSelectedPosition: Any, newFocusAssigned: Any): Unit = definedExternally
    open fun measureAndAdjustDown(child: Any, childIndex: Any, numChildren: Any): Unit = definedExternally
    open fun measureItem(child: Any): Unit = definedExternally
    open fun relayoutMeasuredItem(child: Any): Unit = definedExternally
    open fun getArrowScrollPreviewLength(): Unit = definedExternally
    open fun amountToScroll(direction: Any, nextSelectedPosition: Any): Unit = definedExternally
    open fun lookForSelectablePositionOnScreen(direction: Any): Unit = definedExternally
    open fun arrowScrollFocused(direction: Any): Unit = definedExternally
    open fun positionOfNewFocus(newFocus: Any): Unit = definedExternally
    open fun isViewAncestorOf(child: Any, parent: Any): Unit = definedExternally
    open fun amountToScrollToNewFocus(direction: Any, newFocus: Any, positionOfNewFocus: Any): Unit = definedExternally
    open fun distanceToView(descendant: Any): Unit = definedExternally
    open fun scrollListItemsBy(amount: Any): Unit = definedExternally
    open fun addViewAbove(theView: Any, position: Any): Unit = definedExternally
    open fun addViewBelow(theView: Any, position: Any): Unit = definedExternally
    open fun setItemsCanFocus(itemsCanFocus: Boolean): Unit = definedExternally
    open fun getItemsCanFocus(): Boolean = definedExternally
    override fun isOpaque(): Boolean = definedExternally
    override fun setCacheColorHint(color: Number): Unit = definedExternally
    open fun drawOverscrollHeader(canvas: Canvas, drawable: Drawable, bounds: Rect): Unit = definedExternally
    open fun drawOverscrollFooter(canvas: Canvas, drawable: Drawable, bounds: Rect): Unit = definedExternally
    override fun dispatchDraw(canvas: Canvas): Unit = definedExternally
    override fun drawChild(canvas: Canvas, child: View, drawingTime: Number): Boolean = definedExternally
    open fun drawDivider(canvas: Canvas, bounds: Rect, childIndex: Number): Unit = definedExternally
    open fun getDivider(): Drawable = definedExternally
    open fun setDivider(divider: Drawable): Unit = definedExternally
    open fun getDividerHeight(): Number = definedExternally
    open fun setDividerHeight(height: Number): Unit = definedExternally
    open fun setHeaderDividersEnabled(headerDividersEnabled: Boolean): Unit = definedExternally
    open fun areHeaderDividersEnabled(): Boolean = definedExternally
    open fun setFooterDividersEnabled(footerDividersEnabled: Boolean): Unit = definedExternally
    open fun areFooterDividersEnabled(): Boolean = definedExternally
    open fun setOverscrollHeader(header: Drawable): Unit = definedExternally
    open fun getOverscrollHeader(): Drawable = definedExternally
    open fun setOverscrollFooter(footer: Drawable): Unit = definedExternally
    open fun getOverscrollFooter(): Drawable = definedExternally
    override fun onFocusChanged(gainFocus: Boolean, direction: Number, previouslyFocusedRect: Rect): Unit = definedExternally
    override fun onFinishInflate(): Unit = definedExternally
    override fun findViewTraversal(id: String): View = definedExternally
    open fun findViewInHeadersOrFooters(where: ArrayList<ListView.FixedViewInfo>, id: String): View = definedExternally
    override fun findViewByPredicateTraversal(predicate: View.Predicate<View>, childToSkip: View): View = definedExternally
    open fun findViewByPredicateInHeadersOrFooters(where: ArrayList<ListView.FixedViewInfo>, predicate: View.Predicate<View>, childToSkip: View): View = definedExternally
    open fun getCheckItemIds(): Array<Number> = definedExternally

    companion object {
        var NO_POSITION: Number = definedExternally
        var MAX_SCROLL_FACTOR: Any = definedExternally
        var MIN_SCROLL_PREVIEW_PIXELS: Any = definedExternally
    }
}

external open class Scroller : OverScroller
external open class ScrollView(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : FrameLayout {
    open var mLastScroll: Any = definedExternally
    open var mTempRect: Any = definedExternally
    open var mScroller: Any = definedExternally
    open var mLastMotionY: Any = definedExternally
    open var mIsLayoutDirty: Any = definedExternally
    open var mChildToScrollTo: Any = definedExternally
    open var mIsBeingDragged: Any = definedExternally
    open var mVelocityTracker: Any = definedExternally
    open var mFillViewport: Any = definedExternally
    open var mSmoothScrollingEnabled: Any = definedExternally
    open var mMinimumVelocity: Any = definedExternally
    open var mMaximumVelocity: Any = definedExternally
    open var mOverscrollDistance: Any = definedExternally
    open var mOverflingDistance: Any = definedExternally
    open var mActivePointerId: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    override fun shouldDelayChildPressedState(): Boolean = definedExternally
    override fun getTopFadingEdgeStrength(): Number = definedExternally
    override fun getBottomFadingEdgeStrength(): Number = definedExternally
    open fun getMaxScrollAmount(): Number = definedExternally
    open fun initScrollView(): Unit = definedExternally
    override fun addView(vararg args: Any): Unit = definedExternally
    open fun canScroll(): Unit = definedExternally
    open fun isFillViewport(): Boolean = definedExternally
    open fun setFillViewport(fillViewport: Boolean): Unit = definedExternally
    open fun isSmoothScrollingEnabled(): Boolean = definedExternally
    open fun setSmoothScrollingEnabled(smoothScrollingEnabled: Boolean): Unit = definedExternally
    override fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    override fun dispatchKeyEvent(event: KeyEvent): Boolean = definedExternally
    open fun executeKeyEvent(event: KeyEvent): Boolean = definedExternally
    open fun inChild(x: Any, y: Any): Unit = definedExternally
    open fun initOrResetVelocityTracker(): Unit = definedExternally
    open fun initVelocityTrackerIfNotExists(): Unit = definedExternally
    open fun recycleVelocityTracker(): Unit = definedExternally
    override fun requestDisallowInterceptTouchEvent(disallowIntercept: Boolean): Unit = definedExternally
    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean = definedExternally
    override fun onTouchEvent(ev: MotionEvent): Boolean = definedExternally
    open fun onSecondaryPointerUp(ev: Any): Unit = definedExternally
    override fun onGenericMotionEvent(event: MotionEvent): Boolean = definedExternally
    override fun onOverScrolled(scrollX: Number, scrollY: Number, clampedX: Boolean, clampedY: Boolean): Unit = definedExternally
    open fun getScrollRange(): Unit = definedExternally
    open fun findFocusableViewInBounds(topFocus: Any, top: Any, bottom: Any): Unit = definedExternally
    open fun pageScroll(direction: Number): Boolean = definedExternally
    open fun fullScroll(direction: Number): Boolean = definedExternally
    open fun scrollAndFocus(direction: Any, top: Any, bottom: Any): Unit = definedExternally
    open fun arrowScroll(direction: Number): Boolean = definedExternally
    open fun isOffScreen(descendant: Any): Unit = definedExternally
    open fun isWithinDeltaOfScreen(descendant: Any, delta: Any, height: Any): Unit = definedExternally
    open fun doScrollY(delta: Any): Unit = definedExternally
    open fun smoothScrollBy(dx: Number, dy: Number): Unit = definedExternally
    open fun smoothScrollTo(x: Number, y: Number): Unit = definedExternally
    override fun computeVerticalScrollRange(): Number = definedExternally
    override fun computeVerticalScrollOffset(): Number = definedExternally
    override fun measureChild(child: View, parentWidthMeasureSpec: Number, parentHeightMeasureSpec: Number): Unit = definedExternally
    override fun measureChildWithMargins(child: View, parentWidthMeasureSpec: Number, widthUsed: Number, parentHeightMeasureSpec: Number, heightUsed: Number): Unit = definedExternally
    override fun computeScroll(): Unit = definedExternally
    open fun scrollToChild(child: Any): Unit = definedExternally
    open fun scrollToChildRect(rect: Any, immediate: Any): Unit = definedExternally
    open fun computeScrollDeltaToGetChildRectOnScreen(rect: Rect): Number = definedExternally
    override fun requestChildFocus(child: View, focused: View): Unit = definedExternally
    override fun onRequestFocusInDescendants(direction: Number, previouslyFocusedRect: Rect): Boolean = definedExternally
    override fun requestChildRectangleOnScreen(child: View, rectangle: Rect, immediate: Boolean): Boolean = definedExternally
    override fun requestLayout(): Unit = definedExternally
    override fun onLayout(changed: Boolean, l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
    override fun onSizeChanged(w: Number, h: Number, oldw: Number, oldh: Number): Unit = definedExternally
    open fun fling(velocityY: Number): Unit = definedExternally
    open fun endDrag(): Unit = definedExternally
    override fun scrollTo(x: Number, y: Number): Unit = definedExternally
    override fun draw(canvas: Canvas): Unit = definedExternally

    companion object {
        var ANIMATED_SCROLL_GAP: Number = definedExternally
        var MAX_SCROLL_FACTOR: Number = definedExternally
        var TAG: Any = definedExternally
        var INVALID_POINTER: Any = definedExternally
        fun isViewDescendantOf(child: Any, parent: Any): Unit = definedExternally
        fun clamp(n: Any, my: Any, child: Any): Unit = definedExternally
    }
}

external open class HorizontalScrollView(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : FrameLayout {
    open var mLastScroll: Any = definedExternally
    open var mTempRect: Any = definedExternally
    open var mScroller: Any = definedExternally
    open var mLastMotionX: Any = definedExternally
    open var mIsLayoutDirty: Any = definedExternally
    open var mChildToScrollTo: Any = definedExternally
    open var mIsBeingDragged: Any = definedExternally
    open var mVelocityTracker: Any = definedExternally
    open var mFillViewport: Any = definedExternally
    open var mSmoothScrollingEnabled: Any = definedExternally
    open var mMinimumVelocity: Any = definedExternally
    open var mMaximumVelocity: Any = definedExternally
    open var mOverscrollDistance: Any = definedExternally
    open var _mOverflingDistance: Any = definedExternally
    open var mOverflingDistance: Any = definedExternally
    open var mActivePointerId: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    override fun getLeftFadingEdgeStrength(): Number = definedExternally
    override fun getRightFadingEdgeStrength(): Number = definedExternally
    open fun getMaxScrollAmount(): Number = definedExternally
    open fun initScrollView(): Unit = definedExternally
    override fun addView(vararg args: Any): Any = definedExternally
    open fun canScroll(): Unit = definedExternally
    open fun isFillViewport(): Boolean = definedExternally
    open fun setFillViewport(fillViewport: Boolean): Unit = definedExternally
    open fun isSmoothScrollingEnabled(): Boolean = definedExternally
    open fun setSmoothScrollingEnabled(smoothScrollingEnabled: Boolean): Unit = definedExternally
    override fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    override fun dispatchKeyEvent(event: KeyEvent): Boolean = definedExternally
    open fun executeKeyEvent(event: KeyEvent): Boolean = definedExternally
    open fun inChild(x: Any, y: Any): Unit = definedExternally
    open fun initOrResetVelocityTracker(): Unit = definedExternally
    open fun initVelocityTrackerIfNotExists(): Unit = definedExternally
    open fun recycleVelocityTracker(): Unit = definedExternally
    override fun requestDisallowInterceptTouchEvent(disallowIntercept: Boolean): Unit = definedExternally
    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean = definedExternally
    override fun onTouchEvent(ev: MotionEvent): Boolean = definedExternally
    open fun onSecondaryPointerUp(ev: Any): Unit = definedExternally
    override fun onGenericMotionEvent(event: MotionEvent): Boolean = definedExternally
    override fun shouldDelayChildPressedState(): Boolean = definedExternally
    override fun onOverScrolled(scrollX: Number, scrollY: Number, clampedX: Boolean, clampedY: Boolean): Unit = definedExternally
    open fun getScrollRange(): Unit = definedExternally
    open fun findFocusableViewInMyBounds(leftFocus: Any, left: Any, preferredFocusable: Any): Unit = definedExternally
    open fun findFocusableViewInBounds(leftFocus: Any, left: Any, right: Any): Unit = definedExternally
    open fun pageScroll(direction: Number): Boolean = definedExternally
    open fun fullScroll(direction: Number): Boolean = definedExternally
    open fun scrollAndFocus(direction: Any, left: Any, right: Any): Unit = definedExternally
    open fun arrowScroll(direction: Number): Boolean = definedExternally
    open fun isOffScreen(descendant: Any): Unit = definedExternally
    open fun isWithinDeltaOfScreen(descendant: Any, delta: Any): Unit = definedExternally
    open fun doScrollX(delta: Any): Unit = definedExternally
    open fun smoothScrollBy(dx: Number, dy: Number): Unit = definedExternally
    open fun smoothScrollTo(x: Number, y: Number): Unit = definedExternally
    override fun computeHorizontalScrollRange(): Number = definedExternally
    override fun computeHorizontalScrollOffset(): Number = definedExternally
    override fun measureChild(child: View, parentWidthMeasureSpec: Number, parentHeightMeasureSpec: Number): Unit = definedExternally
    override fun measureChildWithMargins(child: View, parentWidthMeasureSpec: Number, widthUsed: Number, parentHeightMeasureSpec: Number, heightUsed: Number): Unit = definedExternally
    override fun computeScroll(): Unit = definedExternally
    open fun scrollToChild(child: Any): Unit = definedExternally
    open fun scrollToChildRect(rect: Any, immediate: Any): Unit = definedExternally
    open fun computeScrollDeltaToGetChildRectOnScreen(rect: Rect): Number = definedExternally
    override fun requestChildFocus(child: View, focused: View): Unit = definedExternally
    override fun onRequestFocusInDescendants(direction: Number, previouslyFocusedRect: Rect): Boolean = definedExternally
    override fun requestChildRectangleOnScreen(child: View, rectangle: Rect, immediate: Boolean): Boolean = definedExternally
    override fun requestLayout(): Unit = definedExternally
    override fun onLayout(changed: Boolean, l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
    override fun onSizeChanged(w: Number, h: Number, oldw: Number, oldh: Number): Unit = definedExternally
    open fun fling(velocityX: Number): Unit = definedExternally
    override fun scrollTo(x: Number, y: Number): Unit = definedExternally
    override fun setOverScrollMode(mode: Number): Unit = definedExternally
    override fun draw(canvas: Canvas): Unit = definedExternally

    companion object {
        var ANIMATED_SCROLL_GAP: Any = definedExternally
        var MAX_SCROLL_FACTOR: Any = definedExternally
        var TAG: Any = definedExternally
        var INVALID_POINTER: Any = definedExternally
        fun isViewDescendantOf(child: Any, parent: Any): Unit = definedExternally
        fun clamp(n: Any, my: Any, child: Any): Unit = definedExternally
    }
}

external open class RelativeLayout(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : ViewGroup {
    open class LayoutParams : ViewGroup.MarginLayoutParams {
        constructor(context: Context, attrs: HTMLElement)
        constructor(w: Number, h: Number)
        constructor(source: RelativeLayout.LayoutParams)
        constructor(source: ViewGroup.LayoutParams)
        constructor(source: ViewGroup.MarginLayoutParams)

        open var mRules: Any = definedExternally
        open var mInitialRules: Any = definedExternally
        open var mLeft: Number = definedExternally
        open var mTop: Number = definedExternally
        open var mRight: Number = definedExternally
        open var mBottom: Number = definedExternally
        open var mStart: Any = definedExternally
        open var mEnd: Any = definedExternally
        open var mRulesChanged: Any = definedExternally
        open var mIsRtlCompatibilityMode: Any = definedExternally
        open var alignWithParent: Boolean = definedExternally
        override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
        open fun addRule(verb: Number, anchor: String? = definedExternally /* null */): Unit = definedExternally
        open fun removeRule(verb: Number): Unit = definedExternally
        open fun hasRelativeRules(): Unit = definedExternally
        open fun resolveRules(layoutDirection: Any): Unit = definedExternally
        open fun getRules(layoutDirection: Number? = definedExternally /* null */): Array<String> = definedExternally
        override fun resolveLayoutDirection(layoutDirection: Number): Unit = definedExternally
    }

    open class DependencyGraph {
        open class Node {
            open var view: View = definedExternally
            open var dependents: ArrayMap<Node, RelativeLayout.DependencyGraph> = definedExternally
            open var dependencies: SparseMap<String, Node> = definedExternally
            open fun release(): Unit = definedExternally

            companion object {
                var POOL_LIMIT: Any = definedExternally
                var sPool: Any = definedExternally
                fun acquire(view: View): Node = definedExternally
            }
        }

        open var mNodes: Any = definedExternally
        open var mKeyNodes: SparseMap<String, DependencyGraph.Node> = definedExternally
        open var mRoots: Any = definedExternally
        open fun clear(): Unit = definedExternally
        open fun add(view: View): Unit = definedExternally
        open fun getSortedViews(sorted: Array<View>, rules: Array<Number>): Unit = definedExternally
        open fun findRoots(rulesFilter: Any): Unit = definedExternally
    }

    open var mBaselineView: Any = definedExternally
    open var mHasBaselineAlignedChild: Any = definedExternally
    open var mGravity: Any = definedExternally
    open var mContentBounds: Any = definedExternally
    open var mSelfBounds: Any = definedExternally
    open var mIgnoreGravity: Any = definedExternally
    open var mDirtyHierarchy: Any = definedExternally
    open var mSortedHorizontalChildren: Any = definedExternally
    open var mSortedVerticalChildren: Any = definedExternally
    open var mGraph: Any = definedExternally
    open var mAllowBrokenMeasureSpecs: Any = definedExternally
    open var mMeasureVerticalWithPaddingMargin: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    open fun queryCompatibilityModes(): Unit = definedExternally
    override fun shouldDelayChildPressedState(): Boolean = definedExternally
    open fun setIgnoreGravity(viewId: String): Unit = definedExternally
    open fun getGravity(): Number = definedExternally
    open fun setGravity(gravity: Number): Unit = definedExternally
    open fun setHorizontalGravity(horizontalGravity: Number): Unit = definedExternally
    open fun setVerticalGravity(verticalGravity: Number): Unit = definedExternally
    override fun getBaseline(): Number = definedExternally
    override fun requestLayout(): Unit = definedExternally
    open fun sortChildren(): Unit = definedExternally
    override fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    open fun alignBaseline(child: Any, params: Any): Unit = definedExternally
    open fun _measureChild(child: Any, params: Any, myWidth: Any, myHeight: Any): Unit = definedExternally
    open fun measureChildHorizontal(child: Any, params: Any, myWidth: Any, myHeight: Any): Unit = definedExternally
    open fun getChildMeasureSpec(childStart: Any, childEnd: Any, childSize: Any, startMargin: Any, endMargin: Any, startPadding: Any, endPadding: Any, mySize: Any): Unit = definedExternally
    open fun positionChildHorizontal(child: Any, params: Any, myWidth: Any, wrapContent: Any): Unit = definedExternally
    open fun positionChildVertical(child: Any, params: Any, myHeight: Any, wrapContent: Any): Unit = definedExternally
    open fun applyHorizontalSizeRules(childParams: Any, myWidth: Any, rules: Any): Unit = definedExternally
    open fun applyVerticalSizeRules(childParams: Any, myHeight: Any): Unit = definedExternally
    open fun getRelatedView(rules: Any, relation: Any): Unit = definedExternally
    open fun getRelatedViewParams(rules: Any, relation: Any): Unit = definedExternally
    open fun getRelatedViewBaseline(rules: Any, relation: Any): Unit = definedExternally
    override fun onLayout(changed: Boolean, l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
    override fun generateLayoutParamsFromAttr(attrs: HTMLElement): android.view.ViewGroup.LayoutParams = definedExternally
    override fun generateDefaultLayoutParams(): ViewGroup.LayoutParams = definedExternally
    override fun checkLayoutParams(p: ViewGroup.LayoutParams): Boolean = definedExternally
    override fun generateLayoutParams(p: ViewGroup.LayoutParams): ViewGroup.LayoutParams = definedExternally

    companion object {
        var TRUE: String = definedExternally
        var LEFT_OF: Number = definedExternally
        var RIGHT_OF: Number = definedExternally
        var ABOVE: Number = definedExternally
        var BELOW: Number = definedExternally
        var ALIGN_BASELINE: Number = definedExternally
        var ALIGN_LEFT: Number = definedExternally
        var ALIGN_TOP: Number = definedExternally
        var ALIGN_RIGHT: Number = definedExternally
        var ALIGN_BOTTOM: Number = definedExternally
        var ALIGN_PARENT_LEFT: Number = definedExternally
        var ALIGN_PARENT_TOP: Number = definedExternally
        var ALIGN_PARENT_RIGHT: Number = definedExternally
        var ALIGN_PARENT_BOTTOM: Number = definedExternally
        var CENTER_IN_PARENT: Number = definedExternally
        var CENTER_HORIZONTAL: Number = definedExternally
        var CENTER_VERTICAL: Number = definedExternally
        var START_OF: Number = definedExternally
        var END_OF: Number = definedExternally
        var ALIGN_START: Number = definedExternally
        var ALIGN_END: Number = definedExternally
        var ALIGN_PARENT_START: Number = definedExternally
        var ALIGN_PARENT_END: Number = definedExternally
        var VERB_COUNT: Number = definedExternally
        var RULES_VERTICAL: Any = definedExternally
        var RULES_HORIZONTAL: Any = definedExternally
        var DEFAULT_WIDTH: Any = definedExternally
        fun centerHorizontal(child: Any, params: Any, myWidth: Any): Unit = definedExternally
        fun centerVertical(child: Any, params: Any, myHeight: Any): Unit = definedExternally
    }
}

external open class EditText(context: Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Any? = definedExternally /* null */) : TextView {
    open var inputElement: Any = definedExternally
    open var mSingleLineInputElement: Any = definedExternally
    open var mMultiLineInputElement: Any = definedExternally
    open var mInputType: Any = definedExternally
    open var mForceDisableDraw: Any = definedExternally
    open var mMaxLength: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    override fun initBindElement(bindElement: HTMLElement?): Unit = definedExternally
    open fun onInputValueChange(e: Any): Unit = definedExternally
    open fun onDomTextInput(e: Any): Unit = definedExternally
    open fun switchToInputElement(inputElement: Any): Unit = definedExternally
    open fun switchToSingleLineInputElement(): Unit = definedExternally
    open fun switchToMultiLineInputElement(): Unit = definedExternally
    open fun tryShowInputElement(): Unit = definedExternally
    open fun tryDismissInputElement(): Unit = definedExternally
    open fun onInputElementFocusChanged(focused: Boolean): Unit = definedExternally
    open fun isInputElementShowed(): Boolean = definedExternally
    open fun performClick(): Boolean = definedExternally
    open fun performClick(event: android.view.MotionEvent): Boolean = definedExternally
    override fun onFocusChanged(focused: Boolean, direction: Number, previouslyFocusedRect: android.graphics.Rect): Unit = definedExternally
    open fun setForceDisableDrawText(disable: Boolean): Unit = definedExternally
    override fun updateTextColors(): Unit = definedExternally
    override fun onTouchEvent(event: android.view.MotionEvent): Boolean = definedExternally
    open fun filterKeyEvent(event: Any): Unit = definedExternally
    open fun filterKeyCodeByInputType(keyCode: Number): Boolean = definedExternally
    open fun filterKeyCodeOnInput(keyCode: Number): Boolean = definedExternally
    open fun checkFilterKeyEventToDom(event: Any): Unit = definedExternally
    override fun onKeyDown(keyCode: Number, event: android.view.KeyEvent): Boolean = definedExternally
    override fun onKeyUp(keyCode: Number, event: android.view.KeyEvent): Boolean = definedExternally
    override fun requestSyncBoundToElement(immediately: Boolean?): Unit = definedExternally
    override fun setRawTextSize(size: Number): Unit = definedExternally
    override fun onTextChanged(text: String, start: Number, lengthBefore: Number, lengthAfter: Number): Unit = definedExternally
    override fun onLayout(changed: Boolean, left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
    override fun setGravity(gravity: Number): Unit = definedExternally
    override fun setSingleLine(singleLine: Boolean?): Unit = definedExternally
    open fun _setInputType(value: String): Unit = definedExternally
    open fun setInputType(type: Number): Unit = definedExternally
    override fun getInputType(): Number = definedExternally
    open fun syncTextBoundInfoToInputElement(): Unit = definedExternally
    override fun dependOnDebugLayout(): Boolean = definedExternally
    override fun setEllipsize(ellipsis: TextUtils.TruncateAt): Unit = definedExternally
}

external open class ImageView(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : View {
    enum class ScaleType {
        MATRIX /* = 0 */,
        FIT_XY /* = 1 */,
        FIT_START /* = 2 */,
        FIT_CENTER /* = 3 */,
        FIT_END /* = 4 */,
        CENTER /* = 5 */,
        CENTER_CROP /* = 6 */,
        CENTER_INSIDE /* = 7 */
    }

    open var mUri: Any = definedExternally
    open var mMatrix: Any = definedExternally
    open var mScaleType: Any = definedExternally
    open var mHaveFrame: Any = definedExternally
    open var mAdjustViewBounds: Any = definedExternally
    open var mMaxWidth: Any = definedExternally
    open var mMaxHeight: Any = definedExternally
    open var mAlpha: Any = definedExternally
    open var mViewAlphaScale: Any = definedExternally
    open var mColorMod: Any = definedExternally
    open var mDrawable: Any = definedExternally
    open var mState: Any = definedExternally
    open var mMergeState: Any = definedExternally
    open var mLevel: Any = definedExternally
    open var mDrawableWidth: Any = definedExternally
    open var mDrawableHeight: Any = definedExternally
    open var mDrawMatrix: Any = definedExternally
    open var mTempSrc: Any = definedExternally
    open var mTempDst: Any = definedExternally
    open var mCropToPadding: Any = definedExternally
    open var mBaseline: Any = definedExternally
    open var mBaselineAlignBottom: Any = definedExternally
    open var mAdjustViewBoundsCompat: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    open fun initImageView(): Unit = definedExternally
    override fun verifyDrawable(dr: Drawable): Boolean = definedExternally
    override fun jumpDrawablesToCurrentState(): Unit = definedExternally
    override fun invalidateDrawable(dr: Drawable): Unit = definedExternally
    override fun drawableSizeChange(who: Drawable): Unit = definedExternally
    override fun hasOverlappingRendering(): Boolean = definedExternally
    open fun getAdjustViewBounds(): Boolean = definedExternally
    open fun setAdjustViewBounds(adjustViewBounds: Boolean): Unit = definedExternally
    open fun getMaxWidth(): Number = definedExternally
    open fun setMaxWidth(maxWidth: Number): Unit = definedExternally
    open fun getMaxHeight(): Number = definedExternally
    open fun setMaxHeight(maxHeight: Number): Unit = definedExternally
    open fun getDrawable(): Drawable = definedExternally
    open fun setImageURI(uri: String): Unit = definedExternally
    open fun setImageDrawable(drawable: Drawable): Unit = definedExternally
    open fun setImageState(state: Array<Number>, merge: Boolean): Unit = definedExternally
    override fun setSelected(selected: Boolean): Unit = definedExternally
    open fun setImageLevel(level: Number): Unit = definedExternally
    open fun setScaleType(scaleType: ImageView.ScaleType): Unit = definedExternally
    open fun getScaleType(): ImageView.ScaleType = definedExternally
    open fun getImageMatrix(): Matrix = definedExternally
    open fun setImageMatrix(matrix: Matrix): Unit = definedExternally
    open fun getCropToPadding(): Boolean = definedExternally
    open fun setCropToPadding(cropToPadding: Boolean): Unit = definedExternally
    open fun resolveUri(): Unit = definedExternally
    override fun onCreateDrawableState(extraSpace: Number): Array<Number> = definedExternally
    open fun updateDrawable(d: Any): Unit = definedExternally
    open fun resizeFromDrawable(): Boolean = definedExternally
    override fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    open fun resolveAdjustedSize(desiredSize: Any, maxSize: Any, measureSpec: Any): Unit = definedExternally
    override fun setFrame(l: Number, t: Number, r: Number, b: Number): Boolean = definedExternally
    open fun configureBounds(): Unit = definedExternally
    override fun drawableStateChanged(): Unit = definedExternally
    override fun onDraw(canvas: Canvas): Unit = definedExternally
    override fun getBaseline(): Number = definedExternally
    open fun setBaseline(baseline: Number): Unit = definedExternally
    open fun setBaselineAlignBottom(aligned: Boolean): Unit = definedExternally
    open fun getBaselineAlignBottom(): Boolean = definedExternally
    open fun getImageAlpha(): Number = definedExternally
    open fun setImageAlpha(alpha: Number): Unit = definedExternally
    open fun applyColorMod(): Unit = definedExternally
    override fun setVisibility(visibility: Number): Unit = definedExternally
    override fun onAttachedToWindow(): Unit = definedExternally
    override fun onDetachedFromWindow(): Unit = definedExternally

    companion object {
        var sS2FArray: Any = definedExternally
        fun scaleTypeToScaleToFit(st: Any): Unit = definedExternally
        fun parseScaleType(s: String, defaultType: ImageView.ScaleType): ImageView.ScaleType = definedExternally
    }
}

external open class ImageButton(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : ImageView
external open class GridView(context: android.content.Context, attrs: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : AbsListView {
    open var mNumColumns: Any = definedExternally
    open var mHorizontalSpacing: Any = definedExternally
    open var mRequestedHorizontalSpacing: Any = definedExternally
    open var mVerticalSpacing: Any = definedExternally
    open var mStretchMode: Any = definedExternally
    open var mColumnWidth: Any = definedExternally
    open var mRequestedColumnWidth: Any = definedExternally
    open var mRequestedNumColumns: Any = definedExternally
    open var mReferenceView: Any = definedExternally
    open var mReferenceViewInSelectedRow: Any = definedExternally
    open var mGravity: Any = definedExternally
    open var mTempRect: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    override fun getAdapter(): ListAdapter = definedExternally
    override fun setAdapter(adapter: ListAdapter): Unit = definedExternally
    override fun lookForSelectablePosition(position: Number, lookDown: Boolean): Number = definedExternally
    override fun fillGap(down: Boolean): Unit = definedExternally
    open fun fillDown(pos: Any, nextTop: Any): Unit = definedExternally
    open fun makeRow(startPos: Any, y: Any, flow: Any): Unit = definedExternally
    open fun fillUp(pos: Any, nextBottom: Any): Unit = definedExternally
    open fun fillFromTop(nextTop: Any): Unit = definedExternally
    open fun fillFromBottom(lastPosition: Any, nextBottom: Any): Unit = definedExternally
    open fun fillSelection(childrenTop: Any, childrenBottom: Any): Unit = definedExternally
    open fun pinToTop(childrenTop: Any): Unit = definedExternally
    open fun pinToBottom(childrenBottom: Any): Unit = definedExternally
    override fun findMotionRow(y: Number): Number = definedExternally
    open fun fillSpecific(position: Any, top: Any): Unit = definedExternally
    open fun correctTooHigh(numColumns: Any, verticalSpacing: Any, childCount: Any): Unit = definedExternally
    open fun correctTooLow(numColumns: Any, verticalSpacing: Any, childCount: Any): Unit = definedExternally
    open fun fillFromSelection(selectedTop: Any, childrenTop: Any, childrenBottom: Any): Unit = definedExternally
    open fun getBottomSelectionPixel(childrenBottom: Any, fadingEdgeLength: Any, numColumns: Any, rowStart: Any): Unit = definedExternally
    open fun getTopSelectionPixel(childrenTop: Any, fadingEdgeLength: Any, rowStart: Any): Unit = definedExternally
    open fun adjustForBottomFadingEdge(childInSelectedRow: Any, topSelectionPixel: Any, bottomSelectionPixel: Any): Unit = definedExternally
    open fun adjustForTopFadingEdge(childInSelectedRow: Any, topSelectionPixel: Any, bottomSelectionPixel: Any): Unit = definedExternally
    open fun smoothScrollToPosition(position: Number): Unit = definedExternally
    override fun smoothScrollByOffset(offset: Number): Unit = definedExternally
    open fun moveSelection(delta: Any, childrenTop: Any, childrenBottom: Any): Unit = definedExternally
    open fun determineColumns(availableSpace: Any): Unit = definedExternally
    override fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    override fun layoutChildren(): Unit = definedExternally
    open fun makeAndAddView(position: Any, y: Any, flow: Any, childrenLeft: Any, selected: Any, where: Any): Unit = definedExternally
    open fun setupChild(child: Any, position: Any, y: Any, flow: Any, childrenLeft: Any, selected: Any, recycled: Any, where: Any): Unit = definedExternally
    override fun setSelection(position: Number): Unit = definedExternally
    override fun setSelectionInt(position: Number): Unit = definedExternally
    override fun onKeyDown(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    open fun onKeyMultiple(keyCode: Number, repeatCount: Number, event: KeyEvent): Boolean = definedExternally
    override fun onKeyUp(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    open fun commonKey(keyCode: Any, count: Any, event: Any): Unit = definedExternally
    open fun pageScroll(direction: Number): Boolean = definedExternally
    open fun fullScroll(direction: Number): Boolean = definedExternally
    open fun arrowScroll(direction: Number): Boolean = definedExternally
    open fun sequenceScroll(direction: Number): Boolean = definedExternally
    override fun onFocusChanged(gainFocus: Boolean, direction: Number, previouslyFocusedRect: Rect): Unit = definedExternally
    open fun isCandidateSelection(childIndex: Any, direction: Any): Unit = definedExternally
    open fun setGravity(gravity: Number): Unit = definedExternally
    open fun getGravity(): Number = definedExternally
    open fun setHorizontalSpacing(horizontalSpacing: Number): Unit = definedExternally
    open fun getHorizontalSpacing(): Number = definedExternally
    open fun getRequestedHorizontalSpacing(): Number = definedExternally
    open fun setVerticalSpacing(verticalSpacing: Number): Unit = definedExternally
    open fun getVerticalSpacing(): Number = definedExternally
    open fun setStretchMode(stretchMode: Number): Unit = definedExternally
    open fun getStretchMode(): Number = definedExternally
    open fun setColumnWidth(columnWidth: Number): Unit = definedExternally
    open fun getColumnWidth(): Number = definedExternally
    open fun getRequestedColumnWidth(): Number = definedExternally
    open fun setNumColumns(numColumns: Number): Unit = definedExternally
    open fun getNumColumns(): Number = definedExternally
    open fun adjustViewsUpOrDown(): Unit = definedExternally
    override fun computeVerticalScrollExtent(): Number = definedExternally
    override fun computeVerticalScrollOffset(): Number = definedExternally
    override fun computeVerticalScrollRange(): Number = definedExternally

    companion object {
        var NO_STRETCH: Number = definedExternally
        var STRETCH_SPACING: Number = definedExternally
        var STRETCH_COLUMN_WIDTH: Number = definedExternally
        var STRETCH_SPACING_UNIFORM: Number = definedExternally
        var AUTO_FIT: Number = definedExternally
    }
}

external open class NumberPicker(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : LinearLayout {

    open class TwoDigitFormatter : NumberPicker.Formatter {
        override fun format(value: Number): String = definedExternally
    }

    interface OnValueChangeListener {
        fun onValueChange(picker: NumberPicker, oldVal: Number, newVal: Number)
    }

    interface OnScrollListener {
        fun onScrollStateChange(view: NumberPicker, scrollState: Number)
//        var SCROLL_STATE_IDLE: Number = definedExternally
//        var SCROLL_STATE_TOUCH_SCROLL: Number = definedExternally
//        var SCROLL_STATE_FLING: Number = definedExternally

    }

    interface Formatter {
        fun format(value: Number): String
    }

    open class PressedStateHelper(arg: NumberPicker) : Runnable {
        open var _NumberPicker_this: NumberPicker = definedExternally
        open var MODE_PRESS: Any = definedExternally
        open var MODE_TAPPED: Any = definedExternally
        open var mManagedButton: Any = definedExternally
        open var mMode: Any = definedExternally
        open fun cancel(): Unit = definedExternally
        open fun buttonPressDelayed(button: Number): Unit = definedExternally
        open fun buttonTapped(button: Number): Unit = definedExternally
        override fun run(): Unit = definedExternally

        companion object {
            var BUTTON_INCREMENT: Number = definedExternally
            var BUTTON_DECREMENT: Number = definedExternally
        }
    }

    open class SetSelectionCommand(arg: NumberPicker) : Runnable {
        open var _NumberPicker_this: NumberPicker = definedExternally
        open var mSelectionStart: Any = definedExternally
        open var mSelectionEnd: Any = definedExternally
        override fun run(): Unit = definedExternally
    }

    open class ChangeCurrentByOneFromLongPressCommand(arg: NumberPicker) : Runnable {
        open var _NumberPicker_this: NumberPicker = definedExternally
        open var mIncrement: Any = definedExternally
        open fun setStep(increment: Boolean): Unit = definedExternally
        override fun run(): Unit = definedExternally
    }

    open class BeginSoftInputOnLongPressCommand(arg: NumberPicker) : Runnable {
        open var _NumberPicker_this: NumberPicker = definedExternally
        override fun run(): Unit = definedExternally
    }

    open var SELECTOR_WHEEL_ITEM_COUNT: Any = definedExternally
    open var SELECTOR_MIDDLE_ITEM_INDEX: Any = definedExternally
    open var mSelectionDividersDistance: Any = definedExternally
    open var mMinHeight_: Any = definedExternally
    open var mMaxHeight: Any = definedExternally
    open var mMinWidth_: Any = definedExternally
    open var mMaxWidth: Any = definedExternally
    open var mComputeMaxWidth: Any = definedExternally
    open var mTextSize: Any = definedExternally
    open var mSelectorTextGapHeight: Any = definedExternally
    open var mDisplayedValues: Any = definedExternally
    open var mMinValue: Any = definedExternally
    open var mMaxValue: Any = definedExternally
    open var mValue: Any = definedExternally
    open var mOnValueChangeListener: Any = definedExternally
    open var mOnScrollListener: Any = definedExternally
    open var mFormatter: Any = definedExternally
    open var mLongPressUpdateInterval: Any = definedExternally
    open var mSelectorIndexToStringCache: Any = definedExternally
    open var mSelectorIndices: Any = definedExternally
    open var mSelectorWheelPaint: Any = definedExternally
    open var mVirtualButtonPressedDrawable: Any = definedExternally
    open var mSelectorElementHeight: Any = definedExternally
    open var mInitialScrollOffset: Any = definedExternally
    open var mCurrentScrollOffset: Any = definedExternally
    open var mFlingScroller: Any = definedExternally
    open var mAdjustScroller: Any = definedExternally
    open var mPreviousScrollerY: Any = definedExternally
    open var mSetSelectionCommand: Any = definedExternally
    open var mChangeCurrentByOneFromLongPressCommand: Any = definedExternally
    open var mBeginSoftInputOnLongPressCommand: Any = definedExternally
    open var mLastDownEventY: Any = definedExternally
    open var mLastDownEventTime: Any = definedExternally
    open var mLastDownOrMoveEventY: Any = definedExternally
    open var mVelocityTracker: Any = definedExternally
    open var mMinimumFlingVelocity: Any = definedExternally
    open var mMaximumFlingVelocity: Any = definedExternally
    open var mWrapSelectorWheel: Any = definedExternally
    open var mSolidColor: Any = definedExternally
    open var mHasSelectorWheel: Any = definedExternally
    open var mSelectionDivider: Any = definedExternally
    open var mSelectionDividerHeight: Any = definedExternally
    open var mScrollState: Any = definedExternally
    open var mIngonreMoveEvents: Any = definedExternally
    open var mShowSoftInputOnTap: Any = definedExternally
    open var mTopSelectionDividerTop: Any = definedExternally
    open var mBottomSelectionDividerBottom: Any = definedExternally
    open var mLastHoveredChildVirtualViewId: Any = definedExternally
    open var mIncrementVirtualButtonPressed: Any = definedExternally
    open var mDecrementVirtualButtonPressed: Any = definedExternally
    open var mPressedStateHelper: Any = definedExternally
    open var mLastHandledDownDpadKeyCode: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    override fun onLayout(changed: Boolean, left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
    override fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    open fun moveToFinalScrollerPosition(scroller: Any): Unit = definedExternally
    override fun onInterceptTouchEvent(event: MotionEvent): Boolean = definedExternally
    override fun onTouchEvent(event: MotionEvent): Boolean = definedExternally
    override fun dispatchTouchEvent(event: MotionEvent): Boolean = definedExternally
    override fun dispatchKeyEvent(event: KeyEvent): Boolean = definedExternally
    override fun computeScroll(): Unit = definedExternally
    override fun setEnabled(enabled: Boolean): Unit = definedExternally
    override fun scrollBy(x: Number, y: Number): Unit = definedExternally
    override fun computeVerticalScrollOffset(): Number = definedExternally
    override fun computeVerticalScrollRange(): Number = definedExternally
    override fun computeVerticalScrollExtent(): Number = definedExternally
    open fun getSolidColor(): Number = definedExternally
    open fun setOnValueChangedListener(onValueChangedListener: NumberPicker.OnValueChangeListener): Unit = definedExternally
    open fun setOnScrollListener(onScrollListener: NumberPicker.OnScrollListener): Unit = definedExternally
    open fun setFormatter(formatter: NumberPicker.Formatter): Unit = definedExternally
    open fun setValue(value: Number): Unit = definedExternally
    open fun showSoftInput(): Unit = definedExternally
    open fun hideSoftInput(): Unit = definedExternally
    open fun tryComputeMaxWidth(): Unit = definedExternally
    open fun getWrapSelectorWheel(): Boolean = definedExternally
    open fun setWrapSelectorWheel(wrapSelectorWheel: Boolean): Unit = definedExternally
    open fun setOnLongPressUpdateInterval(intervalMillis: Number): Unit = definedExternally
    open fun getValue(): Number = definedExternally
    open fun getMinValue(): Number = definedExternally
    open fun setMinValue(minValue: Number): Unit = definedExternally
    open fun getMaxValue(): Number = definedExternally
    open fun setMaxValue(maxValue: Number): Unit = definedExternally
    open fun getDisplayedValues(): Array<String> = definedExternally
    open fun setDisplayedValues(displayedValues: Array<String>): Unit = definedExternally
    override fun getTopFadingEdgeStrength(): Number = definedExternally
    override fun getBottomFadingEdgeStrength(): Number = definedExternally
    override fun onDetachedFromWindow(): Unit = definedExternally
    override fun onDraw(canvas: Canvas): Unit = definedExternally
    open fun makeMeasureSpec(measureSpec: Any, maxSize: Any): Unit = definedExternally
    open fun resolveSizeAndStateRespectingMinSize(minSize: Any, measuredSize: Any, measureSpec: Any): Unit = definedExternally
    open fun initializeSelectorWheelIndices(): Unit = definedExternally
    open fun setValueInternal(current: Any, notifyChange: Any): Unit = definedExternally
    open fun changeValueByOne(increment: Any): Unit = definedExternally
    open fun initializeSelectorWheel(): Unit = definedExternally
    open fun initializeFadingEdges(): Unit = definedExternally
    open fun onScrollerFinished(scroller: Any): Unit = definedExternally
    open fun onScrollStateChange(scrollState: Any): Unit = definedExternally
    open fun fling(velocityY: Any): Unit = definedExternally
    open fun getWrappedSelectorIndex(selectorIndex: Any): Unit = definedExternally
    open fun incrementSelectorIndices(selectorIndices: Any): Unit = definedExternally
    open fun decrementSelectorIndices(selectorIndices: Any): Unit = definedExternally
    open fun ensureCachedScrollSelectorValue(selectorIndex: Any): Unit = definedExternally
    open fun formatNumber(value: Any): Unit = definedExternally
    open fun validateInputTextView(v: Any): Unit = definedExternally
    open fun updateInputTextView(): Unit = definedExternally
    open fun notifyChange(previous: Any, current: Any): Unit = definedExternally
    open fun postChangeCurrentByOneFromLongPress(increment: Any, delayMillis: Any): Unit = definedExternally
    open fun removeChangeCurrentByOneFromLongPress(): Unit = definedExternally
    open fun postBeginSoftInputOnLongPressCommand(): Unit = definedExternally
    open fun removeBeginSoftInputCommand(): Unit = definedExternally
    open fun removeAllCallbacks(): Unit = definedExternally
    open fun getSelectedPos(value: Any): Unit = definedExternally
    open fun postSetSelectionCommand(selectionStart: Any, selectionEnd: Any): Unit = definedExternally
    open fun ensureScrollWheelAdjusted(): Unit = definedExternally

    companion object {
        var DEFAULT_LONG_PRESS_UPDATE_INTERVAL: Any = definedExternally
        var SELECTOR_MAX_FLING_VELOCITY_ADJUSTMENT: Any = definedExternally
        var SELECTOR_ADJUSTMENT_DURATION_MILLIS: Any = definedExternally
        var SNAP_SCROLL_DURATION: Any = definedExternally
        var TOP_AND_BOTTOM_FADING_EDGE_STRENGTH: Any = definedExternally
        var UNSCALED_DEFAULT_SELECTION_DIVIDER_HEIGHT: Any = definedExternally
        var UNSCALED_DEFAULT_SELECTION_DIVIDERS_DISTANCE: Any = definedExternally
        var SIZE_UNSPECIFIED: Any = definedExternally
        var sTwoDigitFormatter: Any = definedExternally
        fun getTwoDigitFormatter(): NumberPicker.Formatter = definedExternally
        fun formatNumberWithLocale(value: Any): Unit = definedExternally
    }
}

external open class ProgressBar(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : View {
    open class RefreshData {
        open var id: String = definedExternally
        open var progress: Number = definedExternally
        open var fromUser: Boolean = definedExternally
        open fun recycle(): Unit = definedExternally

        companion object {
            var POOL_MAX: Any = definedExternally
            var sPool: Any = definedExternally
            fun obtain(id: String, progress: Number, fromUser: Boolean): RefreshData = definedExternally
        }
    }

    override var mMinWidth: Number = definedExternally
    open var mMaxWidth: Number = definedExternally
    override var mMinHeight: Number = definedExternally
    open var mMaxHeight: Number = definedExternally
    open var mProgress: Any = definedExternally
    open var mSecondaryProgress: Any = definedExternally
    open var mMax: Any = definedExternally
    open var mBehavior: Any = definedExternally
    open var mDuration: Any = definedExternally
    open var mIndeterminate: Any = definedExternally
    open var mOnlyIndeterminate: Any = definedExternally
    open var mTransformation: Any = definedExternally
    open var mAnimation: Any = definedExternally
    open var mHasAnimation: Any = definedExternally
    open var mIndeterminateDrawable: Any = definedExternally
    open var mProgressDrawable: Any = definedExternally
    open var mCurrentDrawable: Any = definedExternally
    open var mSampleTile: NetDrawable = definedExternally
    open var mNoInvalidate: Any = definedExternally
    open var mInterpolator: Any = definedExternally
    open var mShouldStartAnimationDrawable: Any = definedExternally
    open var mInDrawing: Any = definedExternally
    open var mAttached: Any = definedExternally
    open var mRefreshIsPosted: Any = definedExternally
    open var mMirrorForRtl: Boolean = definedExternally
    open var mRefreshData: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    open fun tileify(drawable: Any, clip: Any): Unit = definedExternally
    open fun tileifyIndeterminate(drawable: Any): Unit = definedExternally
    open fun initProgressBar(): Unit = definedExternally
    open fun isIndeterminate(): Boolean = definedExternally
    open fun setIndeterminate(indeterminate: Boolean): Unit = definedExternally
    open fun getIndeterminateDrawable(): Drawable = definedExternally
    open fun setIndeterminateDrawable(d: Drawable): Unit = definedExternally
    open fun getProgressDrawable(): Drawable = definedExternally
    open fun setProgressDrawable(d: Drawable): Unit = definedExternally
    open fun getCurrentDrawable(): Drawable = definedExternally
    override fun verifyDrawable(who: Drawable): Boolean = definedExternally
    override fun jumpDrawablesToCurrentState(): Unit = definedExternally
    open fun postInvalidate(): Unit = definedExternally
    open fun doRefreshProgress(id: Any, progress: Any, fromUser: Any, callBackToApp: Any): Unit = definedExternally
    open fun onProgressRefresh(scale: Number, fromUser: Boolean): Unit = definedExternally
    open fun refreshProgress(id: Any, progress: Any, fromUser: Any): Unit = definedExternally
    open fun setProgress(progress: Number, fromUser: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun setSecondaryProgress(secondaryProgress: Number): Unit = definedExternally
    open fun getProgress(): Number = definedExternally
    open fun getSecondaryProgress(): Number = definedExternally
    open fun getMax(): Number = definedExternally
    open fun setMax(max: Number): Unit = definedExternally
    open fun incrementProgressBy(diff: Number): Unit = definedExternally
    open fun incrementSecondaryProgressBy(diff: Number): Unit = definedExternally
    open fun startAnimation(): Unit = definedExternally
    open fun stopAnimation(): Unit = definedExternally
    open fun setInterpolator(interpolator: Interpolator): Unit = definedExternally
    open fun getInterpolator(): Interpolator = definedExternally
    override fun setVisibility(v: Number): Unit = definedExternally
    override fun onVisibilityChanged(changedView: View, visibility: Number): Unit = definedExternally
    override fun invalidateDrawable(dr: Drawable): Unit = definedExternally
    override fun onSizeChanged(w: Number, h: Number, oldw: Number, oldh: Number): Unit = definedExternally
    open fun updateDrawableBounds(w: Any, h: Any): Unit = definedExternally
    override fun onDraw(canvas: Canvas): Unit = definedExternally
    override fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    override fun drawableStateChanged(): Unit = definedExternally
    open fun updateDrawableState(): Unit = definedExternally
    override fun onAttachedToWindow(): Unit = definedExternally
    override fun onDetachedFromWindow(): Unit = definedExternally

    companion object {
        var MAX_LEVEL: Any = definedExternally
        var TIMEOUT_SEND_ACCESSIBILITY_EVENT: Any = definedExternally
    }
}

external open class CompoundButton(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : Button, Checkable {
    interface OnCheckedChangeListener {
        fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean)
    }

    open var mChecked: Any = definedExternally
    open var mButtonResource: Any = definedExternally
    open var mBroadcasting: Any = definedExternally
    open var mButtonDrawable: Any = definedExternally
    open var mOnCheckedChangeListener: Any = definedExternally
    open var mOnCheckedChangeWidgetListener: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    override fun toggle(): Unit = definedExternally
    open fun performClick(): Boolean = definedExternally
    override fun isChecked(): Boolean = definedExternally
    override fun setChecked(checked: Boolean): Unit = definedExternally
    open fun setOnCheckedChangeListener(listener: CompoundButton.OnCheckedChangeListener): Unit = definedExternally
    open fun setOnCheckedChangeWidgetListener(listener: CompoundButton.OnCheckedChangeListener): Unit = definedExternally
    open fun setButtonDrawable(d: Drawable): Unit = definedExternally
    override fun getCompoundPaddingLeft(): Number = definedExternally
    override fun getCompoundPaddingRight(): Number = definedExternally
    override fun getHorizontalOffsetForDrawables(): Number = definedExternally
    override fun onDraw(canvas: Canvas): Unit = definedExternally
    override fun onCreateDrawableState(extraSpace: Number): Array<Number> = definedExternally
    override fun drawableStateChanged(): Unit = definedExternally
    override fun drawableSizeChange(d: android.graphics.drawable.Drawable): Unit = definedExternally
    override fun verifyDrawable(who: Drawable): Boolean = definedExternally
    override fun jumpDrawablesToCurrentState(): Unit = definedExternally

    companion object {
        var CHECKED_STATE_SET: Any = definedExternally
    }
}

external open class CheckBox(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : CompoundButton
external open class RadioButton(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : CompoundButton {
    override fun toggle(): Unit = definedExternally
}

external open class RadioGroup(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : LinearLayout {
    open class LayoutParams : LinearLayout.LayoutParams {
        constructor(width: Number, height: Number)
        constructor(context: Context,attrs: HTMLElement)
        constructor(width: Number, height: Number, weight: Number? = definedExternally /* null */)
        constructor(source: ViewGroup.LayoutParams)
        override fun setBaseAttributes(a: android.content.res.TypedArray, widthAttr: String, heightAttr: String): Unit = definedExternally
    }

    interface OnCheckedChangeListener {
        fun onCheckedChanged(group: RadioGroup, checkedId: String)
    }

    open class CheckedStateTracker(arg: RadioGroup) : CompoundButton.OnCheckedChangeListener {
        open var _RadioGroup_this: RadioGroup = definedExternally
        override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean): Unit = definedExternally
    }

    open class PassThroughHierarchyChangeListener(arg: RadioGroup) : ViewGroup.OnHierarchyChangeListener {
        open var _RadioGroup_this: RadioGroup = definedExternally
        open var mOnHierarchyChangeListener: Any = definedExternally
        override fun onChildViewAdded(parent: View, child: View): Unit = definedExternally
        override fun onChildViewRemoved(parent: View, child: View): Unit = definedExternally
    }

    open var mCheckedId: Any = definedExternally
    open var mChildOnCheckedChangeListener: Any = definedExternally
    open var mProtectFromCheckedChange: Any = definedExternally
    open var mOnCheckedChangeListener: Any = definedExternally
    open var mPassThroughListener: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    open fun init(): Unit = definedExternally
    override fun setOnHierarchyChangeListener(listener: ViewGroup.OnHierarchyChangeListener): Unit = definedExternally
    override fun onFinishInflate(): Unit = definedExternally
    override fun addView(vararg args: Any): Unit = definedExternally
    open fun check(id: String): Unit = definedExternally
    open fun setCheckedId(id: Any): Unit = definedExternally
    open fun setCheckedStateForView(viewId: Any, checked: Any): Unit = definedExternally
    open fun getCheckedRadioButtonId(): String = definedExternally
    open fun clearCheck(): Unit = definedExternally
    open fun setOnCheckedChangeListener(listener: RadioGroup.OnCheckedChangeListener): Unit = definedExternally
    override fun generateLayoutParamsFromAttr(attrs: HTMLElement): android.view.ViewGroup.LayoutParams = definedExternally
    override fun checkLayoutParams(p: ViewGroup.LayoutParams): Boolean = definedExternally
    override fun generateDefaultLayoutParams(): LinearLayout.LayoutParams = definedExternally
}

external open class CheckedTextView(context: Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : TextView, Checkable {
    open var mChecked: Any = definedExternally
    open var mCheckMarkResource: Any = definedExternally
    open var mCheckMarkDrawable: Any = definedExternally
    open var mBasePadding: Any = definedExternally
    open var mCheckMarkWidth: Any = definedExternally
    open var mNeedRequestlayout: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    override fun toggle(): Unit = definedExternally
    override fun isChecked(): Boolean = definedExternally
    override fun setChecked(checked: Boolean): Unit = definedExternally
    open fun setCheckMarkDrawable(d: Drawable): Unit = definedExternally
    open fun getCheckMarkDrawable(): Drawable = definedExternally
    override fun setPadding(left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
    open fun updatePadding(): Unit = definedExternally
    open fun setBasePadding(isLayoutRtl: Any): Unit = definedExternally
    override fun onDraw(canvas: Canvas): Unit = definedExternally
    override fun onCreateDrawableState(extraSpace: Number): Array<Number> = definedExternally
    override fun drawableStateChanged(): Unit = definedExternally

    companion object {
        var CHECKED_STATE_SET: Any = definedExternally
    }
}

external open class AbsSeekBar(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : ProgressBar {
    interface OnSeekBarChangeListener {
        fun onProgressChanged(seekBar: SeekBar, progress: Number, fromUser: Boolean)
        fun onStartTrackingTouch(seekBar: SeekBar)
        fun onStopTrackingTouch(seekBar: SeekBar)
    }

    open var mThumb: Any = definedExternally
    open var mThumbOffset: Any = definedExternally
    open var mTouchProgressOffset: Number = definedExternally
    open var mIsUserSeekable: Boolean = definedExternally
    open var mKeyProgressIncrement: Any = definedExternally
    open var mDisabledAlpha: Any = definedExternally
    open var mTouchDownX: Any = definedExternally
    open var mIsDragging: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    open fun setThumb(thumb: Drawable): Unit = definedExternally
    open fun getThumb(): Drawable = definedExternally
    open fun getThumbOffset(): Number = definedExternally
    open fun setThumbOffset(thumbOffset: Number): Unit = definedExternally
    open fun setKeyProgressIncrement(increment: Number): Unit = definedExternally
    open fun getKeyProgressIncrement(): Number = definedExternally
    override fun setMax(max: Number): Unit = definedExternally
    override fun verifyDrawable(who: Drawable): Boolean = definedExternally
    override fun jumpDrawablesToCurrentState(): Unit = definedExternally
    override fun drawableStateChanged(): Unit = definedExternally
    override fun onProgressRefresh(scale: Number, fromUser: Boolean): Unit = definedExternally
    override fun onSizeChanged(w: Number, h: Number, oldw: Number, oldh: Number): Unit = definedExternally
    open fun updateThumbPos(w: Any, h: Any): Unit = definedExternally
    open fun setThumbPos(w: Any, thumb: Any, scale: Any, gap: Any): Unit = definedExternally
    override fun onDraw(canvas: Canvas): Unit = definedExternally
    override fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    override fun onTouchEvent(event: MotionEvent): Boolean = definedExternally
    open fun trackTouchEvent(event: Any): Unit = definedExternally
    open fun attemptClaimDrag(): Unit = definedExternally
    open fun onStartTrackingTouch(): Unit = definedExternally
    open fun onStopTrackingTouch(): Unit = definedExternally
    open fun onKeyChange(): Unit = definedExternally
    override fun onKeyDown(keyCode: Number, event: KeyEvent): Boolean = definedExternally

    companion object {
        var NO_ALPHA: Any = definedExternally
    }
}

external open class SeekBar(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : AbsSeekBar {
    interface OnSeekBarChangeListener {
        fun onProgressChanged(seekBar: SeekBar, progress: Number, fromUser: Boolean)
        fun onStartTrackingTouch(seekBar: SeekBar)
        fun onStopTrackingTouch(seekBar: SeekBar)
    }

    open var mOnSeekBarChangeListener: Any = definedExternally
    override fun onProgressRefresh(scale: Number, fromUser: Boolean): Unit = definedExternally
    open fun setOnSeekBarChangeListener(l: SeekBar.OnSeekBarChangeListener): Unit = definedExternally
    override fun onStartTrackingTouch(): Unit = definedExternally
    override fun onStopTrackingTouch(): Unit = definedExternally
}

external open class RatingBar(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : AbsSeekBar {
    interface OnRatingBarChangeListener {
        fun onRatingChanged(ratingBar: RatingBar, rating: Number, fromUser: Boolean)
    }

    open var mNumStars: Any = definedExternally
    open var mProgressOnStartTracking: Any = definedExternally
    open var mOnRatingBarChangeListener: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    open fun setOnRatingBarChangeListener(listener: RatingBar.OnRatingBarChangeListener): Unit = definedExternally
    open fun getOnRatingBarChangeListener(): RatingBar.OnRatingBarChangeListener = definedExternally
    open fun setIsIndicator(isIndicator: Boolean): Unit = definedExternally
    open fun isIndicator(): Boolean = definedExternally
    open fun setNumStars(numStars: Number): Unit = definedExternally
    open fun getNumStars(): Number = definedExternally
    open fun setRating(rating: Number): Unit = definedExternally
    open fun getRating(): Number = definedExternally
    open fun setStepSize(stepSize: Number): Unit = definedExternally
    open fun getStepSize(): Number = definedExternally
    open fun getProgressPerStar(): Unit = definedExternally
    override fun onProgressRefresh(scale: Number, fromUser: Boolean): Unit = definedExternally
    open fun updateSecondaryProgress(progress: Any): Unit = definedExternally
    override fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    override fun onStartTrackingTouch(): Unit = definedExternally
    override fun onStopTrackingTouch(): Unit = definedExternally
    override fun onKeyChange(): Unit = definedExternally
    open fun dispatchRatingChange(fromUser: Boolean): Unit = definedExternally
    override fun setMax(max: Number): Unit = definedExternally
}

external interface ExpandableListAdapter {
    fun registerDataSetObserver(observer: DataSetObserver)
    fun unregisterDataSetObserver(observer: DataSetObserver)
    fun getGroupCount(): Number
    fun getChildrenCount(groupPosition: Number): Number
    fun getGroup(groupPosition: Number): Any
    fun getChild(groupPosition: Number, childPosition: Number): Any
    fun getGroupId(groupPosition: Number): Number
    fun getChildId(groupPosition: Number, childPosition: Number): Number
    fun hasStableIds(): Boolean
    fun getGroupView(groupPosition: Number, isExpanded: Boolean, convertView: View, parent: ViewGroup): View
    fun getChildView(groupPosition: Number, childPosition: Number, isLastChild: Boolean, convertView: View, parent: ViewGroup): View
    fun isChildSelectable(groupPosition: Number, childPosition: Number): Boolean
    fun areAllItemsEnabled(): Boolean
    fun isEmpty(): Boolean
    fun onGroupExpanded(groupPosition: Number)
    fun onGroupCollapsed(groupPosition: Number)
    fun getCombinedChildId(groupId: Number, childId: Number): Number
    fun getCombinedGroupId(groupId: Number): Number
}

external open class ExpandableListPosition {
    open var groupPos: Number = definedExternally
    open var childPos: Number = definedExternally
    open var flatListPos: Number = definedExternally
    open var type: Number = definedExternally
    open fun resetState(): Unit = definedExternally
    open fun getPackedPosition(): Number = definedExternally
    open fun recycle(): Unit = definedExternally

    companion object {
        var MAX_POOL_SIZE: Any = definedExternally
        var sPool: Any = definedExternally
        var CHILD: Number = definedExternally
        var GROUP: Number = definedExternally
        fun obtainGroupPosition(groupPosition: Number): ExpandableListPosition = definedExternally
        fun obtainChildPosition(groupPosition: Number, childPosition: Number): ExpandableListPosition = definedExternally
        fun obtainPosition(packedPosition: Number): ExpandableListPosition = definedExternally
        fun obtain(type: Number, groupPos: Number, childPos: Number, flatListPos: Number): ExpandableListPosition = definedExternally
        fun getRecycledOrCreate(): Unit = definedExternally
    }
}

//external open class HeterogeneousExpandableListIsImpl(){
//    fun isImpl(obj: Any): Boolean = definedExternally
//}
external interface HeterogeneousExpandableList {
    fun getGroupType(groupPosition: Number): Number
    fun getChildType(groupPosition: Number, childPosition: Number): Number
    fun getGroupTypeCount(): Number
    fun getChildTypeCount(): Number
    //fun isImpl(obj: Any): Boolean = definedExternally
}

external open class ExpandableListConnector(expandableListAdapter: ExpandableListAdapter) : BaseAdapter {
    open class MyDataSetObserver(arg: ExpandableListConnector) : DataSetObserver {
        open var _ExpandableListConnector_this: ExpandableListConnector = definedExternally
        override fun onChanged(): Unit = definedExternally
        override fun onInvalidated(): Unit = definedExternally
    }

    open class GroupMetadata : java.lang.Comparable<GroupMetadata> {
        open var flPos: Number = definedExternally
        open var lastChildFlPos: Number = definedExternally
        open var gPos: Number = definedExternally
        open var gId: Number = definedExternally
        override fun compareTo(another: GroupMetadata): Number = definedExternally

        companion object {
            var REFRESH: Number = definedExternally
            fun obtain(flPos: Number, lastChildFlPos: Number, gPos: Number, gId: Number): GroupMetadata = definedExternally
        }
    }

    open class PositionMetadata {
        open var position: ExpandableListPosition = definedExternally
        open var groupMetadata: ExpandableListConnector.GroupMetadata = definedExternally
        open var groupInsertIndex: Number = definedExternally
        open fun resetState(): Unit = definedExternally
        open fun recycle(): Unit = definedExternally
        open fun isExpanded(): Boolean = definedExternally

        companion object {
            var MAX_POOL_SIZE: Any = definedExternally
            var sPool: Any = definedExternally
            fun obtain(flatListPos: Number, type: Number, groupPos: Number, childPos: Number, groupMetadata: ExpandableListConnector.GroupMetadata, groupInsertIndex: Number): PositionMetadata = definedExternally
            fun getRecycledOrCreate(): Unit = definedExternally
        }
    }

    open var mExpandableListAdapter: Any = definedExternally
    open var mExpGroupMetadataList: Any = definedExternally
    open var mTotalExpChildrenCount: Any = definedExternally
    open var mMaxExpGroupCount: Any = definedExternally
    open var mDataSetObserver: Any = definedExternally
    open fun setExpandableListAdapter(expandableListAdapter: ExpandableListAdapter): Unit = definedExternally
    open fun getUnflattenedPos(flPos: Number): ExpandableListConnector.PositionMetadata = definedExternally
    open fun getFlattenedPos(pos: ExpandableListPosition): ExpandableListConnector.PositionMetadata = definedExternally
    override fun areAllItemsEnabled(): Boolean = definedExternally
    override fun isEnabled(flatListPos: Number): Boolean = definedExternally
    override fun getCount(): Number = definedExternally
    override fun getItem(flatListPos: Number): Any = definedExternally
    override fun getItemId(flatListPos: Number): Number = definedExternally
    override fun getView(flatListPos: Number, convertView: View, parent: ViewGroup): View = definedExternally
    override fun getItemViewType(flatListPos: Number): Number = definedExternally
    override fun getViewTypeCount(): Number = definedExternally
    override fun hasStableIds(): Boolean = definedExternally
    open fun refreshExpGroupMetadataList(forceChildrenCountRefresh: Any, syncGroupPositions: Any): Unit = definedExternally
    open fun collapseGroup(groupPos: Number): Boolean = definedExternally
    open fun collapseGroupWithMeta(posMetadata: ExpandableListConnector.PositionMetadata): Boolean = definedExternally
    open fun expandGroup(groupPos: Number): Boolean = definedExternally
    open fun expandGroupWithMeta(posMetadata: ExpandableListConnector.PositionMetadata): Boolean = definedExternally
    open fun isGroupExpanded(groupPosition: Number): Boolean = definedExternally
    open fun setMaxExpGroupCount(maxExpGroupCount: Number): Unit = definedExternally
    open fun getAdapter(): ExpandableListAdapter = definedExternally
    open fun getExpandedGroupMetadataList(): ArrayList<ExpandableListConnector.GroupMetadata> = definedExternally
    open fun setExpandedGroupMetadataList(expandedGroupMetadataList: ArrayList<ExpandableListConnector.GroupMetadata>): Unit = definedExternally
    override fun isEmpty(): Boolean = definedExternally
    open fun findGroupPosition(groupIdToMatch: Number, seedGroupPosition: Number): Number = definedExternally
}

external open class ExpandableListView(context: android.content.Context, attrs: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : ListView {
    interface OnGroupCollapseListener {
        fun onGroupCollapse(groupPosition: Number)
    }

    interface OnGroupExpandListener {
        fun onGroupExpand(groupPosition: Number)
    }

    interface OnGroupClickListener {
        fun onGroupClick(parent: ExpandableListView, v: View, groupPosition: Number, id: Number): Boolean
    }

    interface OnChildClickListener {
        fun onChildClick(parent: ExpandableListView, v: View, groupPosition: Number, childPosition: Number, id: Number): Boolean
    }

    open var mConnector: Any = definedExternally
    open var mExpandAdapter: Any = definedExternally
    open var mIndicatorLeft: Any = definedExternally
    open var mIndicatorRight: Any = definedExternally
    open var mIndicatorStart: Any = definedExternally
    open var mIndicatorEnd: Any = definedExternally
    open var mChildIndicatorLeft: Any = definedExternally
    open var mChildIndicatorRight: Any = definedExternally
    open var mChildIndicatorStart: Any = definedExternally
    open var mChildIndicatorEnd: Any = definedExternally
    open var mGroupIndicator: Any = definedExternally
    open var mChildIndicator: Any = definedExternally
    open var mChildDivider: Any = definedExternally
    open var mIndicatorRect: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    open fun isRtlCompatibilityMode(): Unit = definedExternally
    open fun hasRtlSupport(): Unit = definedExternally
    open fun onRtlPropertiesChanged(layoutDirection: Number): Unit = definedExternally
    open fun resolveIndicator(): Unit = definedExternally
    open fun resolveChildIndicator(): Unit = definedExternally
    override fun dispatchDraw(canvas: Canvas): Unit = definedExternally
    open fun getIndicator(pos: Any): Unit = definedExternally
    open fun setChildDivider(childDivider: Drawable): Unit = definedExternally
    override fun drawDivider(canvas: Canvas, bounds: Rect, childIndex: Number): Unit = definedExternally
    override fun setAdapter(adapter: ListAdapter): Unit = definedExternally
    override fun getAdapter(): ListAdapter = definedExternally
    override fun setOnItemClickListener(l: AdapterView.OnItemClickListener): Unit = definedExternally
    open fun setExpandableAdapter(adapter: ExpandableListAdapter): Unit = definedExternally
    open fun getExpandableListAdapter(): ExpandableListAdapter = definedExternally
    open fun isHeaderOrFooterPosition(position: Any): Unit = definedExternally
    open fun getFlatPositionForConnector(flatListPosition: Any): Unit = definedExternally
    open fun getAbsoluteFlatPosition(flatListPosition: Any): Unit = definedExternally
    override fun performItemClick(v: View, position: Number, id: Number): Boolean = definedExternally
    open fun handleItemClick(v: View, position: Number, id: Number): Boolean = definedExternally
    open fun expandGroup(groupPos: Number, animate: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun collapseGroup(groupPos: Number): Boolean = definedExternally
    open var mOnGroupCollapseListener: Any = definedExternally
    open fun setOnGroupCollapseListener(onGroupCollapseListener: ExpandableListView.OnGroupCollapseListener): Unit = definedExternally
    open var mOnGroupExpandListener: Any = definedExternally
    open fun setOnGroupExpandListener(onGroupExpandListener: ExpandableListView.OnGroupExpandListener): Unit = definedExternally
    open var mOnGroupClickListener: Any = definedExternally
    open fun setOnGroupClickListener(onGroupClickListener: ExpandableListView.OnGroupClickListener): Unit = definedExternally
    open var mOnChildClickListener: Any = definedExternally
    open fun setOnChildClickListener(onChildClickListener: ExpandableListView.OnChildClickListener): Unit = definedExternally
    open fun getExpandableListPosition(flatListPosition: Number): Number = definedExternally
    open fun getFlatListPosition(packedPosition: Number): Number = definedExternally
    open fun getSelectedPosition(): Number = definedExternally
    open fun getSelectedId(): Number = definedExternally
    open fun setSelectedGroup(groupPosition: Number): Unit = definedExternally
    open fun setSelectedChild(groupPosition: Number, childPosition: Number, shouldExpandGroup: Boolean): Boolean = definedExternally
    open fun isGroupExpanded(groupPosition: Number): Boolean = definedExternally
    open fun getChildOrGroupId(position: Any): Unit = definedExternally
    open fun setChildIndicator(childIndicator: Drawable): Unit = definedExternally
    open fun setChildIndicatorBounds(left: Number, right: Number): Unit = definedExternally
    open fun setChildIndicatorBoundsRelative(start: Number, end: Number): Unit = definedExternally
    open fun setGroupIndicator(groupIndicator: Drawable): Unit = definedExternally
    open fun setIndicatorBounds(left: Number, right: Number): Unit = definedExternally
    open fun setIndicatorBoundsRelative(start: Number, end: Number): Unit = definedExternally

    companion object {
        var PACKED_POSITION_TYPE_GROUP: Number = definedExternally
        var PACKED_POSITION_TYPE_CHILD: Number = definedExternally
        var PACKED_POSITION_TYPE_NULL: Number = definedExternally
        var PACKED_POSITION_VALUE_NULL: Number = definedExternally
        var PACKED_POSITION_MASK_CHILD: Any = definedExternally
        var PACKED_POSITION_MASK_GROUP: Any = definedExternally
        var PACKED_POSITION_MASK_TYPE: Any = definedExternally
        var PACKED_POSITION_SHIFT_GROUP: Any = definedExternally
        var PACKED_POSITION_SHIFT_TYPE: Any = definedExternally
        var PACKED_POSITION_INT_MASK_CHILD: Any = definedExternally
        var PACKED_POSITION_INT_MASK_GROUP: Any = definedExternally
        var CHILD_INDICATOR_INHERIT: Number = definedExternally
        var INDICATOR_UNDEFINED: Any = definedExternally
        var GROUP_EXPANDED_STATE_SET: Any = definedExternally
        var GROUP_EMPTY_STATE_SET: Any = definedExternally
        var GROUP_EXPANDED_EMPTY_STATE_SET: Any = definedExternally
        var GROUP_STATE_SETS: Any = definedExternally
        var CHILD_LAST_STATE_SET: Any = definedExternally
        fun getPackedPositionType(packedPosition: Number): Number = definedExternally
        fun getPackedPositionGroup(packedPosition: Number): Number = definedExternally
        fun getPackedPositionChild(packedPosition: Number): Number = definedExternally
        fun getPackedPositionForChild(groupPosition: Number, childPosition: Number): Number = definedExternally
        fun getPackedPositionForGroup(groupPosition: Number): Number = definedExternally
    }
}

external open class BaseExpandableListAdapter : ExpandableListAdapter, HeterogeneousExpandableList {
    open var mDataSetObservable: Any = definedExternally
    override fun registerDataSetObserver(observer: DataSetObserver): Unit = definedExternally
    override fun unregisterDataSetObserver(observer: DataSetObserver): Unit = definedExternally
    open fun notifyDataSetInvalidated(): Unit = definedExternally
    open fun notifyDataSetChanged(): Unit = definedExternally
    override fun areAllItemsEnabled(): Boolean = definedExternally
    override fun onGroupCollapsed(groupPosition: Number): Unit = definedExternally
    override fun onGroupExpanded(groupPosition: Number): Unit = definedExternally
    override fun getCombinedChildId(groupId: Number, childId: Number): Number = definedExternally
    override fun getCombinedGroupId(groupId: Number): Number = definedExternally
    override fun isEmpty(): Boolean = definedExternally
    override fun getChildType(groupPosition: Number, childPosition: Number): Number = definedExternally
    override fun getChildTypeCount(): Number = definedExternally
    override fun getGroupType(groupPosition: Number): Number = definedExternally
    override fun getGroupTypeCount(): Number = definedExternally
    override fun getGroupCount(): Number = definedExternally
    override fun getChildrenCount(groupPosition: Number): Number = definedExternally
    override fun getGroup(groupPosition: Number): Any = definedExternally
    override fun getChild(groupPosition: Number, childPosition: Number): Any = definedExternally
    override fun getGroupId(groupPosition: Number): Number = definedExternally
    override fun getChildId(groupPosition: Number, childPosition: Number): Number = definedExternally
    override fun hasStableIds(): Boolean = definedExternally
    override fun getGroupView(groupPosition: Number, isExpanded: Boolean, convertView: android.view.View, parent: android.view.ViewGroup): android.view.View = definedExternally
    override fun getChildView(groupPosition: Number, childPosition: Number, isLastChild: Boolean, convertView: android.view.View, parent: android.view.ViewGroup): android.view.View = definedExternally
    override fun isChildSelectable(groupPosition: Number, childPosition: Number): Boolean = definedExternally
}

external open class Toast(context: Context) {
    open class TN {
        open var mShow: Runnable = definedExternally
        open var mHide: Runnable = definedExternally
        open var mHandler: Handler = definedExternally
        open var mGravity: Number = definedExternally
        open var mX: Number = definedExternally
        open var mY: Number = definedExternally
        open var mView: View = definedExternally
        open var mWindow: Window = definedExternally
        open var mNextView: View = definedExternally
        open var mWM: WindowManager = definedExternally
        open fun show(): Unit = definedExternally
        open fun hide(): Unit = definedExternally
        open fun handleShow(): Unit = definedExternally
        open fun handleHide(): Unit = definedExternally
    }

    open var mContext: Context = definedExternally
    open var mTN: Toast.TN = definedExternally
    open var mDuration: Number = definedExternally
    open var mNextView: View = definedExternally
    open var mHandler: Any = definedExternally
    open var mDelayHide: Any = definedExternally
    open fun show(): Unit = definedExternally
    open fun cancel(): Unit = definedExternally
    open fun setView(view: View): Unit = definedExternally
    open fun getView(): View = definedExternally
    open fun setDuration(duration: Number): Unit = definedExternally
    open fun getDuration(): Number = definedExternally
    open fun setGravity(gravity: Number, xOffset: Number, yOffset: Number): Unit = definedExternally
    open fun getGravity(): Number = definedExternally
    open fun getXOffset(): Number = definedExternally
    open fun getYOffset(): Number = definedExternally
    open fun setText(s: String): Unit = definedExternally

    companion object {
        var TAG: String = definedExternally
        var localLOGV: Boolean = definedExternally
        var LENGTH_SHORT: Number = definedExternally
        var LENGTH_LONG: Number = definedExternally
        fun makeText(context: Context, text: String, duration: Number): Toast = definedExternally
    }
}

external open class ArrayAdapter<T> : BaseAdapter {
    constructor(context: Context, resource: String)
    constructor(context: Context, resource: String, textViewResourceId: String)
    constructor(context: Context, resource: String, objects: Array<T>)
    constructor(context: Context, resource: String, textViewResourceId: String, objects: Array<T>)
    constructor(context: Context, resource: String, textViewResourceId: String, objects: List<T>)

    open var mObjects: Any = definedExternally
    open var mResource: Any = definedExternally
    open var mDropDownResource: Any = definedExternally
    open var mFieldId: Any = definedExternally
    open var mNotifyOnChange: Any = definedExternally
    open var mContext: Any = definedExternally
    open var mInflater: Any = definedExternally
    open fun add(`object`: T): Unit = definedExternally
    open fun addAll(collection: List<T>): Unit = definedExternally
    open fun insert(`object`: T, index: Number): Unit = definedExternally
    open fun remove(`object`: T): Unit = definedExternally
    open fun clear(): Unit = definedExternally
    open fun sort(comparator: Comparator<T>): Unit = definedExternally
    override fun notifyDataSetChanged(): Unit = definedExternally
    open fun setNotifyOnChange(notifyOnChange: Boolean): Unit = definedExternally
    open fun init(context: Any, resource: Any, textViewResourceId: Any, objects: Any): Unit = definedExternally
    open fun getContext(): Context = definedExternally
    override fun getCount(): Number = definedExternally
    override fun getItem(position: Number): T = definedExternally
    open fun getPosition(item: T): Number = definedExternally
    override fun getItemId(position: Number): Number = definedExternally
    override fun getView(position: Number, convertView: View, parent: ViewGroup): View = definedExternally
    open fun createViewFromResource(position: Any, convertView: Any, parent: Any, resource: Any): Unit = definedExternally
    open fun setDropDownViewResource(resource: String): Unit = definedExternally
    override fun getDropDownView(position: Number, convertView: View, parent: ViewGroup): View = definedExternally
}

external open class AbsSpinner(context: Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : AdapterView<SpinnerAdapter> {
    open class RecycleBin(arg: AbsSpinner) {
        open var _AbsSpinner_this: AbsSpinner = definedExternally
        open var mScrapHeap: Any = definedExternally
        open fun put(position: Number, v: View): Unit = definedExternally
        open fun get(position: Number): View = definedExternally
        open fun clear(): Unit = definedExternally
    }

    open var mAdapter: SpinnerAdapter = definedExternally
    open var mHeightMeasureSpec: Number = definedExternally
    open var mWidthMeasureSpec: Number = definedExternally
    open var mSelectionLeftPadding: Number = definedExternally
    open var mSelectionTopPadding: Number = definedExternally
    open var mSelectionRightPadding: Number = definedExternally
    open var mSelectionBottomPadding: Number = definedExternally
    open var mSpinnerPadding: Rect = definedExternally
    open var mRecycler: AbsSpinner.RecycleBin = definedExternally
    open var mDataSetObserver: Any = definedExternally
    open var mTouchFrame: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    open fun initAbsSpinner(): Unit = definedExternally
    override fun setAdapter(adapter: SpinnerAdapter): Unit = definedExternally
    open fun resetList(): Unit = definedExternally
    override fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    open fun getChildHeight(child: View): Number = definedExternally
    open fun getChildWidth(child: View): Number = definedExternally
    override fun generateDefaultLayoutParams(): ViewGroup.LayoutParams = definedExternally
    open fun recycleAllViews(): Unit = definedExternally
    open fun setSelection(position: Number, animate: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun setSelectionInt(position: Number, animate: Boolean): Unit = definedExternally
    open fun layoutSpinner(delta: Number, animate: Boolean): Unit = definedExternally
    override fun getSelectedView(): View = definedExternally
    override fun requestLayout(): Unit = definedExternally
    override fun getAdapter(): SpinnerAdapter = definedExternally
    override fun getCount(): Number = definedExternally
    open fun pointToPosition(x: Number, y: Number): Number = definedExternally
}

external open class PopupWindow : Window.Callback {
    interface OnDismissListener {
        fun onDismiss()
    }

    constructor(contentView: View, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, focusable: Boolean? = definedExternally /* null */)
    constructor(context: Context, styleAttr: Map<String, String>? = definedExternally /* null */)

    open var mContext: Any = definedExternally
    open var mWindowManager: Any = definedExternally
    open var mIsShowing: Any = definedExternally
    open var mIsDropdown: Any = definedExternally
    open var mContentView: Any = definedExternally
    open var mPopupView: Any = definedExternally
    open var mPopupWindow: Any = definedExternally
    open var mFocusable: Any = definedExternally
    open var mInputMethodMode: Any = definedExternally
    open var mTouchable: Any = definedExternally
    open var mOutsideTouchable: Any = definedExternally
    open var mSplitTouchEnabled: Any = definedExternally
    open var mClipToScreen: Any = definedExternally
    open var mAllowScrollingAnchorParent: Any = definedExternally
    open var mNotTouchModal: Any = definedExternally
    open var mTouchInterceptor: Any = definedExternally
    open var mWidthMode: Any = definedExternally
    open var mWidth: Any = definedExternally
    open var mLastWidth: Any = definedExternally
    open var mHeightMode: Any = definedExternally
    open var mHeight: Any = definedExternally
    open var mLastHeight: Any = definedExternally
    open var mPopupWidth: Any = definedExternally
    open var mPopupHeight: Any = definedExternally
    open var mDrawingLocation: Any = definedExternally
    open var mScreenLocation: Any = definedExternally
    open var mTempRect: Any = definedExternally
    open var mBackground: Any = definedExternally
    open var mAboveAnchorBackgroundDrawable: Any = definedExternally
    open var mBelowAnchorBackgroundDrawable: Any = definedExternally
    open var mAboveAnchor: Any = definedExternally
    open var mWindowLayoutType: Any = definedExternally
    open var mOnDismissListener: Any = definedExternally
    open var mDefaultDropdownAboveEnterAnimation: Any = definedExternally
    open var mDefaultDropdownBelowEnterAnimation: Any = definedExternally
    open var mDefaultDropdownAboveExitAnimation: Any = definedExternally
    open var mDefaultDropdownBelowExitAnimation: Any = definedExternally
    open var mEnterAnimation: Any = definedExternally
    open var mExitAnimation: Any = definedExternally
    open var mAnchor: Any = definedExternally
    open var mOnScrollChangedListener: Any = definedExternally
    open var mAnchorXoff: Any = definedExternally
    open var mAnchorYoff: Any = definedExternally
    open var mAnchoredGravity: Any = definedExternally
    open var mPopupViewInitialLayoutDirectionInherited: Any = definedExternally
    open fun getBackground(): Drawable = definedExternally
    open fun setBackgroundDrawable(background: Drawable): Unit = definedExternally
    open fun getEnterAnimation(): Animation = definedExternally
    open fun getExitAnimation(): Animation = definedExternally
    open fun setWindowAnimation(enterAnimation: Animation, exitAnimation: Animation): Unit = definedExternally
    open fun getContentView(): View = definedExternally
    open fun setContentView(contentView: View): Unit = definedExternally
    open fun setTouchInterceptor(l: View.OnTouchListener): Unit = definedExternally
    open fun isFocusable(): Boolean = definedExternally
    open fun setFocusable(focusable: Boolean): Unit = definedExternally
    open fun getInputMethodMode(): Number = definedExternally
    open fun setInputMethodMode(mode: Number): Unit = definedExternally
    open fun isTouchable(): Boolean = definedExternally
    open fun setTouchable(touchable: Boolean): Unit = definedExternally
    open fun isOutsideTouchable(): Boolean = definedExternally
    open fun setOutsideTouchable(touchable: Boolean): Unit = definedExternally
    open fun setClipToScreenEnabled(enabled: Boolean): Unit = definedExternally
    open fun setAllowScrollingAnchorParent(enabled: Any): Unit = definedExternally
    open fun isSplitTouchEnabled(): Boolean = definedExternally
    open fun setSplitTouchEnabled(enabled: Boolean): Unit = definedExternally
    open fun setWindowLayoutType(layoutType: Number): Unit = definedExternally
    open fun getWindowLayoutType(): Number = definedExternally
    open fun setTouchModal(touchModal: Boolean): Unit = definedExternally
    open fun setWindowLayoutMode(widthSpec: Number, heightSpec: Number): Unit = definedExternally
    open fun getHeight(): Number = definedExternally
    open fun setHeight(height: Number): Unit = definedExternally
    open fun getWidth(): Number = definedExternally
    open fun setWidth(width: Number): Unit = definedExternally
    open fun isShowing(): Boolean = definedExternally
    open fun showAtLocation(parent: View, gravity: Number, x: Number, y: Number): Unit = definedExternally
    open fun showAsDropDown(anchor: View, xoff: Number? = definedExternally /* null */, yoff: Number? = definedExternally /* null */, gravity: Number? = definedExternally /* null */): Unit = definedExternally
    open fun updateAboveAnchor(aboveAnchor: Any): Unit = definedExternally
    open fun isAboveAnchor(): Boolean = definedExternally
    open fun preparePopup(p: Any): Unit = definedExternally
    open fun invokePopup(p: Any): Unit = definedExternally
    open fun setLayoutDirectionFromAnchor(): Unit = definedExternally
    open fun createPopupLayout(): Unit = definedExternally
    open fun computeFlags(curFlags: Any): Unit = definedExternally
    open fun computeWindowEnterAnimation(): Unit = definedExternally
    open fun computeWindowExitAnimation(): Unit = definedExternally
    open fun findDropDownPosition(anchor: Any, p: Any, xoff: Any, yoff: Any, gravity: Any): Unit = definedExternally
    open fun getMaxAvailableHeight(anchor: View, yOffset: Number? = definedExternally /* null */, ignoreBottomDecorations: Boolean? = definedExternally /* null */): Number = definedExternally
    open fun dismiss(): Unit = definedExternally
    open fun setOnDismissListener(onDismissListener: PopupWindow.OnDismissListener): Unit = definedExternally
    open fun update(): Unit = definedExternally
    open fun update(width: Number, height: Number): Unit = definedExternally
    open fun update(anchor: View, width: Number, height: Number): Unit = definedExternally
    open fun update(x: Number, y: Number, width: Number, height: Number, force: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun update(anchor: View, xoff: Number, yoff: Number, width: Number, height: Number): Unit = definedExternally
    open fun _update(): Unit = definedExternally
    open fun _update_w_h(width: Any, height: Any): Unit = definedExternally
    open fun _update_x_y_w_h_f(x: Any, y: Any, width: Any, height: Any, force: Any? = definedExternally /* null */): Unit = definedExternally
    open fun _update_a_w_h(anchor: Any, width: Any, height: Any): Unit = definedExternally
    open fun _update_a_x_y_w_h(anchor: Any, xoff: Any, yoff: Any, width: Any, height: Any): Unit = definedExternally
    open fun _update_all_args(anchor: Any, updateLocation: Any, xoff: Any, yoff: Any, updateDimension: Any, width: Any, height: Any, gravity: Any): Unit = definedExternally
    open fun unregisterForScrollChanged(): Unit = definedExternally
    open fun registerForScrollChanged(anchor: Any, xoff: Any, yoff: Any, gravity: Any): Unit = definedExternally
    open fun onTouchEvent(event: MotionEvent): Boolean = definedExternally
    open fun onGenericMotionEvent(event: MotionEvent): Boolean = definedExternally
    override fun onWindowAttributesChanged(params: WindowManager.LayoutParams): Unit = definedExternally
    override fun onContentChanged(): Unit = definedExternally
    override fun onWindowFocusChanged(hasFocus: Boolean): Unit = definedExternally
    override fun onAttachedToWindow(): Unit = definedExternally
    override fun onDetachedFromWindow(): Unit = definedExternally
    override fun dispatchKeyEvent(event: KeyEvent): Boolean = definedExternally
    override fun dispatchTouchEvent(ev: MotionEvent): Boolean = definedExternally
    override fun dispatchGenericMotionEvent(ev: MotionEvent): Boolean = definedExternally

    companion object {
        var INPUT_METHOD_FROM_FOCUSABLE: Number = definedExternally
        var INPUT_METHOD_NEEDED: Number = definedExternally
        var INPUT_METHOD_NOT_NEEDED: Number = definedExternally
        var DEFAULT_ANCHORED_GRAVITY: Any = definedExternally
    }
}

external open class ListPopupWindow(context: Context, styleAttr: Map<String, String>? = definedExternally /* null */) {

    open class ForwardingListener(src: View) : View.OnTouchListener, View.OnAttachStateChangeListener {
        open class DisallowIntercept(arg: ForwardingListener) : Runnable {
            open var _ForwardingListener_this: ForwardingListener = definedExternally
            override fun run(): Unit = definedExternally
        }

        open var mScaledTouchSlop: Any = definedExternally
        open var mTapTimeout: Any = definedExternally
        open var mSrc: Any = definedExternally
        open var mDisallowIntercept: Any = definedExternally
        open var mForwarding: Any = definedExternally
        open var mActivePointerId: Any = definedExternally
        open fun getPopup(): ListPopupWindow = definedExternally
        override fun onTouch(v: View, event: MotionEvent): Boolean = definedExternally
        override fun onViewAttachedToWindow(v: View): Unit = definedExternally
        override fun onViewDetachedFromWindow(v: View): Unit = definedExternally
        open fun onForwardingStarted(): Boolean = definedExternally
        open fun onForwardingStopped(): Boolean = definedExternally
        open fun onTouchObserved(srcEvent: Any): Unit = definedExternally
        open fun onTouchForwarded(srcEvent: Any): Unit = definedExternally
    }

    open class DropDownListView(context: Context, hijackFocus: Boolean) : ListView {
        open var mListSelectionHidden: Any = definedExternally
        open var mHijackFocus: Any = definedExternally
        open var mDrawsInPressedState: Any = definedExternally
        open fun onForwardedEvent(event: MotionEvent, activePointerId: Number): Boolean = definedExternally
        open fun clickPressedItem(child: Any, position: Any): Unit = definedExternally
        open fun clearPressedItem(): Unit = definedExternally
        open fun setPressedItem(child: Any, position: Any): Unit = definedExternally
        override fun touchModeDrawsInPressedState(): Boolean = definedExternally
        override fun obtainView(position: Number, isScrap: Array<Boolean>): View = definedExternally
        override fun isInTouchMode(): Boolean = definedExternally
        override fun hasWindowFocus(): Boolean = definedExternally
        override fun isFocused(): Boolean = definedExternally
        override fun hasFocus(): Boolean = definedExternally

        companion object {
            var CLICK_ANIM_DURATION: Any = definedExternally
            var CLICK_ANIM_ALPHA: Any = definedExternally
        }
    }

    open class PopupDataSetObserver(arg: ListPopupWindow) : DataSetObserver {
        open var _ListPopupWindow_this: ListPopupWindow = definedExternally
        override fun onChanged(): Unit = definedExternally
        override fun onInvalidated(): Unit = definedExternally
    }

    open class ListSelectorHider(arg: ListPopupWindow) : Runnable {
        open var _ListPopupWindow_this: ListPopupWindow = definedExternally
        override fun run(): Unit = definedExternally
    }

    open class ResizePopupRunnable(arg: ListPopupWindow) : Runnable {
        open var _ListPopupWindow_this: ListPopupWindow = definedExternally
        override fun run(): Unit = definedExternally
    }

    open class PopupTouchInterceptor(arg: ListPopupWindow) : View.OnTouchListener {
        open var _ListPopupWindow_this: ListPopupWindow = definedExternally
        override fun onTouch(v: View, event: MotionEvent): Boolean = definedExternally
    }

    open class PopupScrollListener(arg: ListPopupWindow) : AbsListView.OnScrollListener {
        open var _ListPopupWindow_this: ListPopupWindow = definedExternally
        override fun onScroll(view: AbsListView, firstVisibleItem: Number, visibleItemCount: Number, totalItemCount: Number): Unit = definedExternally
        override fun onScrollStateChanged(view: AbsListView, scrollState: Number): Unit = definedExternally
    }

    open var mContext: Any = definedExternally
    open var mPopup: Any = definedExternally
    open var mAdapter: Any = definedExternally
    open var mDropDownList: Any = definedExternally
    open var mDropDownHeight: Any = definedExternally
    open var mDropDownWidth: Any = definedExternally
    open var mDropDownHorizontalOffset: Any = definedExternally
    open var mDropDownVerticalOffset: Any = definedExternally
    open var mDropDownVerticalOffsetSet: Any = definedExternally
    open var mDropDownGravity: Any = definedExternally
    open var mDropDownAlwaysVisible: Any = definedExternally
    open var mForceIgnoreOutsideTouch: Any = definedExternally
    open var mListItemExpandMaximum: Number = definedExternally
    open var mPromptView: Any = definedExternally
    open var mPromptPosition: Any = definedExternally
    open var mObserver: Any = definedExternally
    open var mDropDownAnchorView: Any = definedExternally
    open var mDropDownListHighlight: Any = definedExternally
    open var mItemClickListener: Any = definedExternally
    open var mItemSelectedListener: Any = definedExternally
    open var mResizePopupRunnable: Any = definedExternally
    open var mTouchInterceptor: Any = definedExternally
    open var mScrollListener: Any = definedExternally
    open var mHideSelector: Any = definedExternally
    open var mShowDropDownRunnable: Any = definedExternally
    open var mHandler: Any = definedExternally
    open var mTempRect: Any = definedExternally
    open var mModal: Any = definedExternally
    open var mLayoutDirection: Any = definedExternally
    open fun setAdapter(adapter: ListAdapter): Unit = definedExternally
    open fun setPromptPosition(position: Number): Unit = definedExternally
    open fun getPromptPosition(): Number = definedExternally
    open fun setModal(modal: Boolean): Unit = definedExternally
    open fun isModal(): Boolean = definedExternally
    open fun setForceIgnoreOutsideTouch(forceIgnoreOutsideTouch: Boolean): Unit = definedExternally
    open fun setDropDownAlwaysVisible(dropDownAlwaysVisible: Boolean): Unit = definedExternally
    open fun isDropDownAlwaysVisible(): Boolean = definedExternally
    open fun getBackground(): Drawable = definedExternally
    open fun setBackgroundDrawable(d: Drawable): Unit = definedExternally
    open fun setWindowAnimation(enterAnimation: Animation, exitAnimation: Animation): Unit = definedExternally
    open fun getEnterAnimation(): Animation = definedExternally
    open fun getExitAnimation(): Animation = definedExternally
    open fun getAnchorView(): View = definedExternally
    open fun setAnchorView(anchor: View): Unit = definedExternally
    open fun getHorizontalOffset(): Number = definedExternally
    open fun setHorizontalOffset(offset: Number): Unit = definedExternally
    open fun getVerticalOffset(): Number = definedExternally
    open fun setVerticalOffset(offset: Number): Unit = definedExternally
    open fun setDropDownGravity(gravity: Number): Unit = definedExternally
    open fun getWidth(): Number = definedExternally
    open fun setWidth(width: Number): Unit = definedExternally
    open fun setContentWidth(width: Number): Unit = definedExternally
    open fun getHeight(): Number = definedExternally
    open fun setHeight(height: Number): Unit = definedExternally
    open fun setOnItemClickListener(clickListener: AdapterView.OnItemClickListener): Unit = definedExternally
    open fun setOnItemSelectedListener(selectedListener: AdapterView.OnItemSelectedListener): Unit = definedExternally
    open fun setPromptView(prompt: View): Unit = definedExternally
    open fun postShow(): Unit = definedExternally
    open fun show(): Unit = definedExternally
    open fun dismiss(): Unit = definedExternally
    open fun setOnDismissListener(listener: PopupWindow.OnDismissListener): Unit = definedExternally
    open fun removePromptView(): Unit = definedExternally
    open fun setInputMethodMode(mode: Number): Unit = definedExternally
    open fun getInputMethodMode(): Number = definedExternally
    open fun setSelection(position: Number): Unit = definedExternally
    open fun clearListSelection(): Unit = definedExternally
    open fun isShowing(): Boolean = definedExternally
    open fun isInputMethodNotNeeded(): Boolean = definedExternally
    open fun performItemClick(position: Number): Boolean = definedExternally
    open fun getSelectedItem(): Any = definedExternally
    open fun getSelectedItemPosition(): Number = definedExternally
    open fun getSelectedItemId(): Number = definedExternally
    open fun getSelectedView(): View = definedExternally
    open fun getListView(): ListView = definedExternally
    open fun setListItemExpandMax(max: Number): Unit = definedExternally
    open fun onKeyDown(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    open fun onKeyUp(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    open fun onKeyPreIme(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    open fun createDragToOpenListener(src: View): View.OnTouchListener = definedExternally
    open fun buildDropDown(): Unit = definedExternally

    companion object {
        var TAG: Any = definedExternally
        var DEBUG: Any = definedExternally
        var EXPAND_LIST_TIMEOUT: Any = definedExternally
        var POSITION_PROMPT_ABOVE: Number = definedExternally
        var POSITION_PROMPT_BELOW: Number = definedExternally
        var MATCH_PARENT: Number = definedExternally
        var WRAP_CONTENT: Number = definedExternally
        var INPUT_METHOD_FROM_FOCUSABLE: Number = definedExternally
        var INPUT_METHOD_NEEDED: Number = definedExternally
        var INPUT_METHOD_NOT_NEEDED: Number = definedExternally
    }
}

external open class Spinner(context: Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */, mode: Number? = definedExternally /* null */) : AbsSpinner, View.OnClickListener {


    open class DropDownAdapter(adapter: SpinnerAdapter) : ListAdapter, SpinnerAdapter {
        open var mAdapter: Any = definedExternally
        open var mListAdapter: Any = definedExternally
        override fun getCount(): Number = definedExternally
        override fun getItem(position: Number): Any = definedExternally
        override fun getItemId(position: Number): Number = definedExternally
        override fun getView(position: Number, convertView: View, parent: ViewGroup): View = definedExternally
        override fun getDropDownView(position: Number, convertView: View, parent: ViewGroup): View = definedExternally
        override fun hasStableIds(): Boolean = definedExternally
        override fun registerDataSetObserver(observer: DataSetObserver): Unit = definedExternally
        override fun unregisterDataSetObserver(observer: DataSetObserver): Unit = definedExternally
        override fun areAllItemsEnabled(): Boolean = definedExternally
        override fun isEnabled(position: Number): Boolean = definedExternally
        override fun getItemViewType(position: Number): Number = definedExternally
        override fun getViewTypeCount(): Number = definedExternally
        override fun isEmpty(): Boolean = definedExternally
    }

    interface SpinnerPopup {
        fun setAdapter(adapter: ListAdapter)
        fun showPopup(textDirection: Number, textAlignment: Number)
        fun dismiss()
        fun isShowing(): Boolean
        fun setPromptText(hintText: String)
        fun getHintText(): String
        fun setBackgroundDrawable(bg: Drawable)
        fun setVerticalOffset(px: Number)
        fun setHorizontalOffset(px: Number)
        fun getBackground(): Drawable
        fun getVerticalOffset(): Number
        fun getHorizontalOffset(): Number
    }

    open class DialogPopup(arg: Spinner) : Spinner.SpinnerPopup, DialogInterface.OnClickListener {
        open var _Spinner_this: Spinner = definedExternally
        open var mPopup: Any = definedExternally
        open var mListAdapter: Any = definedExternally
        open var mPrompt: Any = definedExternally
        override fun dismiss(): Unit = definedExternally
        override fun isShowing(): Boolean = definedExternally
        override fun setAdapter(adapter: ListAdapter): Unit = definedExternally
        override fun setPromptText(hintText: String): Unit = definedExternally
        override fun getHintText(): String = definedExternally
        override fun showPopup(textDirection: Number, textAlignment: Number): Unit = definedExternally
        override fun onClick(dialog: DialogInterface, which: Number): Unit = definedExternally
        override fun setBackgroundDrawable(bg: Drawable): Unit = definedExternally
        override fun setVerticalOffset(px: Number): Unit = definedExternally
        override fun setHorizontalOffset(px: Number): Unit = definedExternally
        override fun getBackground(): Drawable = definedExternally
        override fun getVerticalOffset(): Number = definedExternally
        override fun getHorizontalOffset(): Number = definedExternally
    }

    open class DropdownPopup(context: Context, defStyleRes: Map<String, String>, arg: Spinner) : ListPopupWindow, Spinner.SpinnerPopup {
        open var _Spinner_this: Spinner = definedExternally
        open var mHintText: Any = definedExternally
        override fun setAdapter(adapter: ListAdapter): Unit = definedExternally
        override fun getHintText(): String = definedExternally
        override fun setPromptText(hintText: String): Unit = definedExternally
        open fun computeContentWidth(): Unit = definedExternally
        override fun showPopup(textDirection: Number, textAlignment: Number): Unit = definedExternally
    }

    open var mPopup: Any = definedExternally
    open var mTempAdapter: Any = definedExternally
    open var mDropDownWidth: Number = definedExternally
    open var mGravity: Any = definedExternally
    open var mDisableChildrenWhenDisabled: Any = definedExternally
    open var mTempRect: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    open fun setPopupBackgroundDrawable(background: Drawable): Unit = definedExternally
    open fun getPopupBackground(): Drawable = definedExternally
    open fun setDropDownVerticalOffset(pixels: Number): Unit = definedExternally
    open fun getDropDownVerticalOffset(): Number = definedExternally
    open fun setDropDownHorizontalOffset(pixels: Number): Unit = definedExternally
    open fun getDropDownHorizontalOffset(): Number = definedExternally
    open fun setDropDownWidth(pixels: Number): Unit = definedExternally
    open fun getDropDownWidth(): Number = definedExternally
    override fun setEnabled(enabled: Boolean): Unit = definedExternally
    open fun setGravity(gravity: Number): Unit = definedExternally
    open fun getGravity(): Number = definedExternally
    override fun setAdapter(adapter: SpinnerAdapter): Unit = definedExternally
    override fun getBaseline(): Number = definedExternally
    override fun onDetachedFromWindow(): Unit = definedExternally
    override fun setOnItemClickListener(l: AdapterView.OnItemClickListener): Unit = definedExternally
    open fun setOnItemClickListenerInt(l: AdapterView.OnItemClickListener): Unit = definedExternally
    override fun onMeasure(widthMeasureSpec: Number, heightMeasureSpec: Number): Unit = definedExternally
    override fun onLayout(changed: Boolean, l: Number, t: Number, r: Number, b: Number): Unit = definedExternally
    override fun layoutSpinner(delta: Number, animate: Boolean): Unit = definedExternally
    open fun makeView(position: Any, addChild: Any): Unit = definedExternally
    open fun setUpChild(child: Any, addChild: Any): Unit = definedExternally
    open fun performClick(): Boolean = definedExternally
    override fun onClick(v: View): Unit = definedExternally
    //    override fun onClick(dialog: View, which: Number): Unit = definedExternally
    open fun onClick(dialog: DialogInterface, which: Number): Unit = definedExternally

    open fun setPrompt(prompt: String): Unit = definedExternally
    open fun getPrompt(): String = definedExternally
    open fun measureContentWidth(adapter: SpinnerAdapter, background: Drawable): Number = definedExternally

    companion object {
        var TAG: String = definedExternally
        var MAX_ITEMS_MEASURED: Any = definedExternally
        var MODE_DIALOG: Number = definedExternally
        var MODE_DROPDOWN: Number = definedExternally
        var MODE_THEME: Any = definedExternally
    }
}
