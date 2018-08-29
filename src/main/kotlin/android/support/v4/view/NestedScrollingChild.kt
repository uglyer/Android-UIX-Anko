package android.support.v4.view

import android.view.ViewConfiguration
import android.view.VelocityTracker
//import com.sun.istack.internal.Nullable
import android.view.ViewParent
import android.view.MotionEvent


/**
 * This interface should be implemented by [View][android.view.View] subclasses that wish
 * to support dispatching nested scrolling operations to a cooperating parent
 * [ViewGroup][android.view.ViewGroup].
 *
 *
 * Classes implementing this interface should create a final instance of a
 * [NestedScrollingChildHelper] as a field and delegate any View methods to the
 * `NestedScrollingChildHelper` methods of the same signature.
 *
 *
 * Views invoking nested scrolling functionality should always do so from the relevant
 * [ViewCompat], [ViewGroupCompat] or [ViewParentCompat] compatibility
 * shim static methods. This ensures interoperability with nested scrolling views on Android
 * 5.0 Lollipop and newer.
 */
interface NestedScrollingChild {

    /**
     * Returns true if nested scrolling is enabled for this view.
     *
     *
     * If nested scrolling is enabled and this View class implementation supports it,
     * this view will act as a nested scrolling child view when applicable, forwarding data
     * about the scroll operation in progress to a compatible and cooperating nested scrolling
     * parent.
     *
     * @return true if nested scrolling is enabled
     *
     * @see .setNestedScrollingEnabled
     */
    /**
     * Enable or disable nested scrolling for this view.
     *
     *
     * If this property is set to true the view will be permitted to initiate nested
     * scrolling operations with a compatible parent view in the current hierarchy. If this
     * view does not implement nested scrolling this will have no effect. Disabling nested scrolling
     * while a nested scroll is in progress has the effect of [stopping][.stopNestedScroll]
     * the nested scroll.
     *
     * @param enabled true to enable nested scrolling, false to disable
     *
     * @see .isNestedScrollingEnabled
     */
    var isNestedScrollingEnabled: Boolean

    /**
     * Begin a nestable scroll operation along the given axes.
     *
     *
     * A view starting a nested scroll promises to abide by the following contract:
     *
     *
     * The view will call startNestedScroll upon initiating a scroll operation. In the case
     * of a touch scroll this corresponds to the initial [MotionEvent.ACTION_DOWN].
     * In the case of touch scrolling the nested scroll will be terminated automatically in
     * the same manner as [ViewParent.requestDisallowInterceptTouchEvent].
     * In the event of programmatic scrolling the caller must explicitly call
     * [.stopNestedScroll] to indicate the end of the nested scroll.
     *
     *
     * If `startNestedScroll` returns true, a cooperative parent was found.
     * If it returns false the caller may ignore the rest of this contract until the next scroll.
     * Calling startNestedScroll while a nested scroll is already in progress will return true.
     *
     *
     * At each incremental step of the scroll the caller should invoke
     * [dispatchNestedPreScroll][.dispatchNestedPreScroll]
     * once it has calculated the requested scrolling delta. If it returns true the nested scrolling
     * parent at least partially consumed the scroll and the caller should adjust the amount it
     * scrolls by.
     *
     *
     * After applying the remainder of the scroll delta the caller should invoke
     * [dispatchNestedScroll][.dispatchNestedScroll], passing
     * both the delta consumed and the delta unconsumed. A nested scrolling parent may treat
     * these values differently. See
     * [NestedScrollingParent.onNestedScroll].
     *
     *
     * @param axes Flags consisting of a combination of [ViewCompat.SCROLL_AXIS_HORIZONTAL]
     * and/or [ViewCompat.SCROLL_AXIS_VERTICAL].
     * @return true if a cooperative parent was found and nested scrolling has been enabled for
     * the current gesture.
     *
     * @see .stopNestedScroll
     * @see .dispatchNestedPreScroll
     * @see .dispatchNestedScroll
     */
    fun startNestedScroll(axes: Int): Boolean

    /**
     * Stop a nested scroll in progress.
     *
     *
     * Calling this method when a nested scroll is not currently in progress is harmless.
     *
     * @see .startNestedScroll
     */
    fun stopNestedScroll()

    /**
     * Returns true if this view has a nested scrolling parent.
     *
     *
     * The presence of a nested scrolling parent indicates that this view has initiated
     * a nested scroll and it was accepted by an ancestor view further up the view hierarchy.
     *
     * @return whether this view has a nested scrolling parent
     */
    fun hasNestedScrollingParent(): Boolean

    /**
     * Dispatch one step of a nested scroll in progress.
     *
     *
     * Implementations of views that support nested scrolling should call this to report
     * info about a scroll in progress to the current nested scrolling parent. If a nested scroll
     * is not currently in progress or nested scrolling is not
     * [enabled][.isNestedScrollingEnabled] for this view this method does nothing.
     *
     *
     * Compatible View implementations should also call
     * [dispatchNestedPreScroll][.dispatchNestedPreScroll] before
     * consuming a component of the scroll event themselves.
     *
     * @param dxConsumed Horizontal distance in pixels consumed by this view during this scroll step
     * @param dyConsumed Vertical distance in pixels consumed by this view during this scroll step
     * @param dxUnconsumed Horizontal scroll distance in pixels not consumed by this view
     * @param dyUnconsumed Horizontal scroll distance in pixels not consumed by this view
     * @param offsetInWindow Optional. If not null, on return this will contain the offset
     * in local view coordinates of this view from before this operation
     * to after it completes. View implementations may use this to adjust
     * expected input coordinate tracking.
     * @return true if the event was dispatched, false if it could not be dispatched.
     * @see .dispatchNestedPreScroll
     */
    fun dispatchNestedScroll(dxConsumed: Int, dyConsumed: Int,
                             dxUnconsumed: Int, dyUnconsumed: Int, offsetInWindow: IntArray): Boolean

    /**
     * Dispatch one step of a nested scroll in progress before this view consumes any portion of it.
     *
     *
     * Nested pre-scroll events are to nested scroll events what touch intercept is to touch.
     * `dispatchNestedPreScroll` offers an opportunity for the parent view in a nested
     * scrolling operation to consume some or all of the scroll operation before the child view
     * consumes it.
     *
     * @param dx Horizontal scroll distance in pixels
     * @param dy Vertical scroll distance in pixels
     * @param consumed Output. If not null, consumed[0] will contain the consumed component of dx
     * and consumed[1] the consumed dy.
     * @param offsetInWindow Optional. If not null, on return this will contain the offset
     * in local view coordinates of this view from before this operation
     * to after it completes. View implementations may use this to adjust
     * expected input coordinate tracking.
     * @return true if the parent consumed some or all of the scroll delta
     * @see .dispatchNestedScroll
     */
    fun dispatchNestedPreScroll(dx: Int, dy: Int, consumed: IntArray,
                                offsetInWindow: IntArray): Boolean

    /**
     * Dispatch a fling to a nested scrolling parent.
     *
     *
     * This method should be used to indicate that a nested scrolling child has detected
     * suitable conditions for a fling. Generally this means that a touch scroll has ended with a
     * [velocity][VelocityTracker] in the direction of scrolling that meets or exceeds
     * the [minimum fling velocity][ViewConfiguration.getScaledMinimumFlingVelocity]
     * along a scrollable axis.
     *
     *
     * If a nested scrolling child view would normally fling but it is at the edge of
     * its own content, it can use this method to delegate the fling to its nested scrolling
     * parent instead. The parent may optionally consume the fling or observe a child fling.
     *
     * @param velocityX Horizontal fling velocity in pixels per second
     * @param velocityY Vertical fling velocity in pixels per second
     * @param consumed true if the child consumed the fling, false otherwise
     * @return true if the nested scrolling parent consumed or otherwise reacted to the fling
     */
    fun dispatchNestedFling(velocityX: Float, velocityY: Float, consumed: Boolean): Boolean

    /**
     * Dispatch a fling to a nested scrolling parent before it is processed by this view.
     *
     *
     * Nested pre-fling events are to nested fling events what touch intercept is to touch
     * and what nested pre-scroll is to nested scroll. `dispatchNestedPreFling`
     * offsets an opportunity for the parent view in a nested fling to fully consume the fling
     * before the child view consumes it. If this method returns `true`, a nested
     * parent view consumed the fling and this view should not scroll as a result.
     *
     *
     * For a better user experience, only one view in a nested scrolling chain should consume
     * the fling at a time. If a parent view consumed the fling this method will return false.
     * Custom view implementations should account for this in two ways:
     *
     *
     *  * If a custom view is paged and needs to settle to a fixed page-point, do not
     * call `dispatchNestedPreFling`; consume the fling and settle to a valid
     * position regardless.
     *  * If a nested parent does consume the fling, this view should not scroll at all,
     * even to settle back to a valid idle position.
     *
     *
     *
     * Views should also not offer fling velocities to nested parent views along an axis
     * where scrolling is not currently supported; a [ScrollView][android.widget.ScrollView]
     * should not offer a horizontal fling velocity to its parents since scrolling along that
     * axis is not permitted and carrying velocity along that motion does not make sense.
     *
     * @param velocityX Horizontal fling velocity in pixels per second
     * @param velocityY Vertical fling velocity in pixels per second
     * @return true if a nested scrolling parent consumed the fling
     */
    fun dispatchNestedPreFling(velocityX: Float, velocityY: Float): Boolean
}
