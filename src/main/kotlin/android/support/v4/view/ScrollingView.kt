package android.support.v4.view

import android.graphics.drawable.ScrollBarDrawable


/**
 * An interface that can be implemented by Views to provide scroll related APIs.
 */
interface ScrollingView {
    /**
     *
     * Compute the horizontal range that the horizontal scrollbar
     * represents.
     *
     *
     * The range is expressed in arbitrary units that must be the same as the
     * units used by [.computeHorizontalScrollExtent] and
     * [.computeHorizontalScrollOffset].
     *
     *
     * The default range is the drawing width of this view.
     *
     * @return the total horizontal range represented by the horizontal
     * scrollbar
     *
     * @see .computeHorizontalScrollExtent
     * @see .computeHorizontalScrollOffset
     * @see android.widget.ScrollBarDrawable
     */
    fun computeHorizontalScrollRange(): Int

    /**
     *
     * Compute the horizontal offset of the horizontal scrollbar's thumb
     * within the horizontal range. This value is used to compute the position
     * of the thumb within the scrollbar's track.
     *
     *
     * The range is expressed in arbitrary units that must be the same as the
     * units used by [.computeHorizontalScrollRange] and
     * [.computeHorizontalScrollExtent].
     *
     *
     * The default offset is the scroll offset of this view.
     *
     * @return the horizontal offset of the scrollbar's thumb
     *
     * @see .computeHorizontalScrollRange
     * @see .computeHorizontalScrollExtent
     * @see android.widget.ScrollBarDrawable
     */
    fun computeHorizontalScrollOffset(): Int

    /**
     *
     * Compute the horizontal extent of the horizontal scrollbar's thumb
     * within the horizontal range. This value is used to compute the length
     * of the thumb within the scrollbar's track.
     *
     *
     * The range is expressed in arbitrary units that must be the same as the
     * units used by [.computeHorizontalScrollRange] and
     * [.computeHorizontalScrollOffset].
     *
     *
     * The default extent is the drawing width of this view.
     *
     * @return the horizontal extent of the scrollbar's thumb
     *
     * @see .computeHorizontalScrollRange
     * @see .computeHorizontalScrollOffset
     * @see android.widget.ScrollBarDrawable
     */
    fun computeHorizontalScrollExtent(): Int

    /**
     *
     * Compute the vertical range that the vertical scrollbar represents.
     *
     *
     * The range is expressed in arbitrary units that must be the same as the
     * units used by [.computeVerticalScrollExtent] and
     * [.computeVerticalScrollOffset].
     *
     * @return the total vertical range represented by the vertical scrollbar
     *
     *
     * The default range is the drawing height of this view.
     *
     * @see .computeVerticalScrollExtent
     * @see .computeVerticalScrollOffset
     * @see android.widget.ScrollBarDrawable
     */
    fun computeVerticalScrollRange(): Int

    /**
     *
     * Compute the vertical offset of the vertical scrollbar's thumb
     * within the horizontal range. This value is used to compute the position
     * of the thumb within the scrollbar's track.
     *
     *
     * The range is expressed in arbitrary units that must be the same as the
     * units used by [.computeVerticalScrollRange] and
     * [.computeVerticalScrollExtent].
     *
     *
     * The default offset is the scroll offset of this view.
     *
     * @return the vertical offset of the scrollbar's thumb
     *
     * @see .computeVerticalScrollRange
     * @see .computeVerticalScrollExtent
     * @see android.widget.ScrollBarDrawable
     */
    fun computeVerticalScrollOffset(): Int

    /**
     *
     * Compute the vertical extent of the vertical scrollbar's thumb
     * within the vertical range. This value is used to compute the length
     * of the thumb within the scrollbar's track.
     *
     *
     * The range is expressed in arbitrary units that must be the same as the
     * units used by [.computeVerticalScrollRange] and
     * [.computeVerticalScrollOffset].
     *
     *
     * The default extent is the drawing height of this view.
     *
     * @return the vertical extent of the scrollbar's thumb
     *
     * @see .computeVerticalScrollRange
     * @see .computeVerticalScrollOffset
     * @see android.widget.ScrollBarDrawable
     */
    fun computeVerticalScrollExtent(): Int
}
