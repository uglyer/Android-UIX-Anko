@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("uk.co.senab.photoview")
package uk.co.senab.photoview

import android.graphics.*
import android.graphics.drawable.Drawable
import android.view.*
import android.view.animation.Interpolator
import android.widget.*
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

external open class GestureDetector {
    interface OnGestureListener {
        fun onDrag(dx: Number, dy: Number)
        fun onFling(startX: Number, startY: Number, velocityX: Number, velocityY: Number)
        fun onScale(scaleFactor: Number, focusX: Number, focusY: Number)
    }
    interface OnDoubleTapListener {
        fun onSingleTapConfirmed(e: MotionEvent): Boolean;
        fun onDoubleTap(e: MotionEvent): Boolean;
        fun onDoubleTapEvent(e: MotionEvent): Boolean;
    }

    open var mListener: GestureDetector.OnGestureListener = definedExternally
    open var mActivePointerId: Any = definedExternally
    open var mActivePointerIndex: Any = definedExternally
    open var mLastTouchX: Number = definedExternally
    open var mLastTouchY: Number = definedExternally
    open var mTouchSlop: Number = definedExternally
    open var mMinimumVelocity: Number = definedExternally
    open var mScaleDetector: ScaleGestureDetector = definedExternally
    open fun setOnGestureListener(listener: GestureDetector.OnGestureListener): Unit = definedExternally
    open var mVelocityTracker: Any = definedExternally
    open var mIsDragging: Any = definedExternally
    open fun getActiveX(ev: MotionEvent): Number = definedExternally
    open fun getActiveY(ev: MotionEvent): Number = definedExternally
    open fun isScaling(): Boolean = definedExternally
    open fun isDragging(): Boolean = definedExternally
    open fun onTouchEvent(ev: MotionEvent): Boolean = definedExternally
    companion object {
        var LOG_TAG: Any = definedExternally
        var INVALID_POINTER_ID: Any = definedExternally
    }
}
external interface IPhotoView {
//    external var DEFAULT_MAX_SCALE: Number = definedExternally
//    external var DEFAULT_MID_SCALE: Number = definedExternally
//    external var DEFAULT_MIN_SCALE: Number = definedExternally
//    external var DEFAULT_ZOOM_DURATION: Number = definedExternally
//    external fun isImpl(obj: Any): Boolean = definedExternally

    fun canZoom(): Boolean
    fun getDisplayRect(): RectF
    fun setDisplayMatrix(finalMatrix: Matrix): Boolean
    fun getDisplayMatrix(): Matrix
    fun getMinScale(): Number
    fun getMinimumScale(): Number
    fun getMidScale(): Number
    fun getMediumScale(): Number
    fun getMaxScale(): Number
    fun getMaximumScale(): Number
    fun getScale(): Number
    fun getScaleType(): ImageView.ScaleType
    fun setAllowParentInterceptOnEdge(allow: Boolean)
    fun setMinScale(minScale: Number)
    fun setMinimumScale(minimumScale: Number)
    fun setMidScale(midScale: Number)
    fun setMediumScale(mediumScale: Number)
    fun setMaxScale(maxScale: Number)
    fun setMaximumScale(maximumScale: Number)
    fun setScaleLevels(minimumScale: Number, mediumScale: Number, maximumScale: Number)
    fun setOnLongClickListener(listener: View.OnLongClickListener)
    fun setOnMatrixChangeListener(listener: PhotoViewAttacher.OnMatrixChangedListener)
    fun setOnPhotoTapListener(listener: PhotoViewAttacher.OnPhotoTapListener)
    fun getOnPhotoTapListener(): PhotoViewAttacher.OnPhotoTapListener
    fun setOnViewTapListener(listener: PhotoViewAttacher.OnViewTapListener)
    fun setRotationTo(rotationDegree: Number)
    fun setRotationBy(rotationDegree: Number)
    fun getOnViewTapListener(): PhotoViewAttacher.OnViewTapListener
    fun setScale(scale: Number)
    fun setScale(scale: Number, animate: Boolean)
    fun setScale(scale: Number, focalX: Number, focalY: Number, animate: Boolean)
    fun setScaleType(scaleType: ImageView.ScaleType)
    fun setZoomable(zoomable: Boolean)
    fun setPhotoViewRotation(rotationDegree: Number)
    fun getVisibleRectangleBitmap(): Canvas
    fun setZoomTransitionDuration(milliseconds: Number)
    fun getIPhotoViewImplementation(): IPhotoView
    fun setOnDoubleTapListener(newOnDoubleTapListener: GestureDetector.OnDoubleTapListener)
    fun setOnScaleChangeListener(onScaleChangeListener: PhotoViewAttacher.OnScaleChangeListener)
}
external open class PhotoViewAttacher(imageView: ImageView, zoomable: Boolean? = definedExternally /* null */) : IPhotoView, View.OnTouchListener, GestureDetector.OnGestureListener, ViewTreeObserver.OnGlobalLayoutListener {

    interface OnMatrixChangedListener {
        fun onMatrixChanged(rect: RectF)
    }
    interface OnScaleChangeListener {
        fun onScaleChange(scaleFactor: Number, focusX: Number, focusY: Number)
    }
    interface OnPhotoTapListener {
        fun onPhotoTap(view: View, x: Number, y: Number)
    }
    interface OnViewTapListener {
        fun onViewTap(view: View, x: Number, y: Number)
    }
    open class AnimatedZoomRunnable(arg: PhotoViewAttacher, currentZoom: Number, targetZoom: Number, focalX: Number, focalY: Number) : Runnable {
        open var _PhotoViewAttacher_this: PhotoViewAttacher = definedExternally
        open var mFocalX: Any = definedExternally
        open var mFocalY: Any = definedExternally
        open var mStartTime: Any = definedExternally
        open var mZoomStart: Any = definedExternally
        open var mZoomEnd: Any = definedExternally
        override fun run(): Unit = definedExternally
        open fun interpolate(): Unit = definedExternally
    }
    open class FlingRunnable(arg: PhotoViewAttacher) : Runnable {
        open var _PhotoViewAttacher_this: PhotoViewAttacher = definedExternally
        open var mScroller: Any = definedExternally
        open var mCurrentX: Any = definedExternally
        open var mCurrentY: Any = definedExternally
        open fun cancelFling(): Unit = definedExternally
        open fun fling(viewWidth: Number, viewHeight: Number, velocityX: Number, velocityY: Number): Unit = definedExternally
        override fun run(): Unit = definedExternally
    }
    open class DefaultOnDoubleTapListener(photoViewAttacher: PhotoViewAttacher) : android.view.GestureDetector.OnDoubleTapListener {
        open var photoViewAttacher: Any = definedExternally
        open fun setPhotoViewAttacher(newPhotoViewAttacher: PhotoViewAttacher): Unit = definedExternally
        override fun onSingleTapConfirmed(e: MotionEvent): Boolean = definedExternally
        override fun onDoubleTap(ev: MotionEvent): Boolean = definedExternally
        override fun onDoubleTapEvent(e: MotionEvent): Boolean = definedExternally
    }

    open var ZOOM_DURATION: Number = definedExternally
    open var mMinScale: Any = definedExternally
    open var mMidScale: Any = definedExternally
    open var mMaxScale: Any = definedExternally
    open var mAllowParentInterceptOnEdge: Any = definedExternally
    open var mBlockParentIntercept: Any = definedExternally
    open var mImageView: Any = definedExternally
    open var mGestureDetector: Any = definedExternally
    open var mScaleDragDetector: Any = definedExternally
    open var mBaseMatrix: Any = definedExternally
    open var mDrawMatrix: Any = definedExternally
    open var mSuppMatrix: Any = definedExternally
    open var mDisplayRect: Any = definedExternally
    open var mMatrixValues: Any = definedExternally
    open var mMatrixChangeListener: Any = definedExternally
    open var mPhotoTapListener: Any = definedExternally
    open var mViewTapListener: Any = definedExternally
    open var mLongClickListener: Any = definedExternally
    open var mScaleChangeListener: Any = definedExternally
    open var mIvTop: Any = definedExternally
    open var mIvRight: Any = definedExternally
    open var mIvBottom: Any = definedExternally
    open var mIvLeft: Any = definedExternally
    open var mCurrentFlingRunnable: Any = definedExternally
    open var mScrollEdge: Any = definedExternally
    open var mZoomEnabled: Any = definedExternally
    open var mScaleType: Any = definedExternally
    override fun setOnDoubleTapListener(newOnDoubleTapListener: GestureDetector.OnDoubleTapListener) = definedExternally
    override fun setOnScaleChangeListener(onScaleChangeListener: PhotoViewAttacher.OnScaleChangeListener): Unit = definedExternally
    override fun canZoom(): Boolean = definedExternally
    open fun cleanup(): Unit = definedExternally
    override fun getDisplayRect(): RectF = definedExternally
    override fun setDisplayMatrix(finalMatrix: Matrix): Boolean = definedExternally
    override fun setPhotoViewRotation(degrees: Number): Unit = definedExternally
    override fun setRotationTo(degrees: Number): Unit = definedExternally
    override fun setRotationBy(degrees: Number): Unit = definedExternally
    open fun getImageView(): ImageView = definedExternally
    override fun getMinScale(): Number = definedExternally
    override fun getMinimumScale(): Number = definedExternally
    override fun getMidScale(): Number = definedExternally
    override fun getMediumScale(): Number = definedExternally
    override fun getMaxScale(): Number = definedExternally
    override fun getMaximumScale(): Number = definedExternally
    override fun getScale(): Number = definedExternally
    override fun getScaleType(): ImageView.ScaleType = definedExternally
    override fun onDrag(dx: Number, dy: Number): Unit = definedExternally
    override fun onFling(startX: Number, startY: Number, velocityX: Number, velocityY: Number): Unit = definedExternally
    override fun onGlobalLayout(): Unit = definedExternally
    override fun onScale(scaleFactor: Number, focusX: Number, focusY: Number): Unit = definedExternally
    override fun onTouch(v: View, ev: MotionEvent): Boolean = definedExternally
    override fun setAllowParentInterceptOnEdge(allow: Boolean): Unit = definedExternally
    override fun setMinScale(minScale: Number): Unit = definedExternally
    override fun setMinimumScale(minimumScale: Number): Unit = definedExternally
    override fun setMidScale(midScale: Number): Unit = definedExternally
    override fun setMediumScale(mediumScale: Number): Unit = definedExternally
    override fun setMaxScale(maxScale: Number): Unit = definedExternally
    override fun setMaximumScale(maximumScale: Number): Unit = definedExternally
    override fun setScaleLevels(minimumScale: Number, mediumScale: Number, maximumScale: Number): Unit = definedExternally
    override fun setOnLongClickListener(listener: View.OnLongClickListener): Unit = definedExternally
    override fun setOnMatrixChangeListener(listener: PhotoViewAttacher.OnMatrixChangedListener): Unit = definedExternally
    override fun setOnPhotoTapListener(listener: PhotoViewAttacher.OnPhotoTapListener): Unit = definedExternally
    override fun getOnPhotoTapListener(): PhotoViewAttacher.OnPhotoTapListener = definedExternally
    override fun setOnViewTapListener(listener: PhotoViewAttacher.OnViewTapListener): Unit = definedExternally
    override fun getOnViewTapListener(): PhotoViewAttacher.OnViewTapListener = definedExternally
    override fun setScale(scale: Number): Unit = definedExternally
    override fun setScale(scale: Number, animate: Boolean): Unit = definedExternally
    override fun setScale(scale: Number, focalX: Number, focalY: Number, animate: Boolean): Unit = definedExternally
    open fun setScale_2(scale: Any, animate: Any? = definedExternally /* null */): Unit = definedExternally
    open fun setScale_4(scale: Any, focalX: Any, focalY: Any, animate: Any? = definedExternally /* null */): Unit = definedExternally
    override fun setScaleType(scaleType: ImageView.ScaleType): Unit = definedExternally
    override fun setZoomable(zoomable: Boolean): Unit = definedExternally
    open fun update(): Unit = definedExternally
    override fun getDisplayMatrix(): Matrix = definedExternally
    open fun getDrawMatrix(): Matrix = definedExternally
    open fun cancelFling(): Unit = definedExternally
    open fun checkAndDisplayMatrix(): Unit = definedExternally
    open fun checkImageViewScaleType(): Unit = definedExternally
    open fun checkMatrixBounds(): Unit = definedExternally
    open fun _getDisplayRect(matrix: Any): Unit = definedExternally
    override fun getVisibleRectangleBitmap(): Canvas = definedExternally
    override fun setZoomTransitionDuration(milliseconds: Number): Unit = definedExternally
    override fun getIPhotoViewImplementation(): IPhotoView = definedExternally
    open fun getValue(matrix: Any, whichValue: Any): Unit = definedExternally
    open fun resetMatrix(): Unit = definedExternally
    open fun setImageViewMatrix(matrix: Any): Unit = definedExternally
    open fun updateBaseMatrix(d: Any): Unit = definedExternally
    open fun getImageViewWidth(imageView: Any): Unit = definedExternally
    open fun getImageViewHeight(imageView: Any): Unit = definedExternally
    companion object {
        var LOG_TAG: Any = definedExternally
        var DEBUG: Any = definedExternally
        var sInterpolator: Interpolator = definedExternally
        var EDGE_NONE: Number = definedExternally
        var EDGE_LEFT: Number = definedExternally
        var EDGE_RIGHT: Number = definedExternally
        var EDGE_BOTH: Number = definedExternally
        fun checkZoomLevels(minZoom: Any, midZoom: Any, maxZoom: Any): Unit = definedExternally
        fun hasDrawable(imageView: Any): Unit = definedExternally
        fun isSupportedScaleType(scaleType: Any): Unit = definedExternally
        fun setImageViewScaleTypeMatrix(imageView: Any): Unit = definedExternally
    }
}
external open class PhotoView(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : ImageView, IPhotoView {
    open var mAttacher: Any = definedExternally
    open var mPendingScaleType: Any = definedExternally
    open fun init(): Unit = definedExternally
    override fun setPhotoViewRotation(rotationDegree: Number): Unit = definedExternally
    override fun setRotationTo(rotationDegree: Number): Unit = definedExternally
    override fun setRotationBy(rotationDegree: Number): Unit = definedExternally
    override fun canZoom(): Boolean = definedExternally
    override fun getDisplayRect(): RectF = definedExternally
    override fun getDisplayMatrix(): Matrix = definedExternally
    override fun setDisplayMatrix(finalRectangle: Matrix): Boolean = definedExternally
    override fun getMinScale(): Number = definedExternally
    override fun getMinimumScale(): Number = definedExternally
    override fun getMidScale(): Number = definedExternally
    override fun getMediumScale(): Number = definedExternally
    override fun getMaxScale(): Number = definedExternally
    override fun getMaximumScale(): Number = definedExternally
    override fun getScale(): Number = definedExternally
    override fun getScaleType(): ScaleType = definedExternally
    override fun setAllowParentInterceptOnEdge(allow: Boolean): Unit = definedExternally
    override fun setMinScale(minScale: Number): Unit = definedExternally
    override fun setMinimumScale(minimumScale: Number): Unit = definedExternally
    override fun setMidScale(midScale: Number): Unit = definedExternally
    override fun setMediumScale(mediumScale: Number): Unit = definedExternally
    override fun setMaxScale(maxScale: Number): Unit = definedExternally
    override fun setMaximumScale(maximumScale: Number): Unit = definedExternally
    override fun setScaleLevels(minimumScale: Number, mediumScale: Number, maximumScale: Number): Unit = definedExternally
    override fun setImageDrawable(drawable: Drawable): Unit = definedExternally
    override fun setImageURI(uri: String): Unit = definedExternally
    override fun resizeFromDrawable(): Boolean = definedExternally
    override fun setOnMatrixChangeListener(listener: PhotoViewAttacher.OnMatrixChangedListener): Unit = definedExternally
    override fun setOnLongClickListener(l: View.OnLongClickListener): Unit = definedExternally
    override fun setOnPhotoTapListener(listener: PhotoViewAttacher.OnPhotoTapListener): Unit = definedExternally
    override fun getOnPhotoTapListener(): PhotoViewAttacher.OnPhotoTapListener = definedExternally
    override fun setOnViewTapListener(listener: PhotoViewAttacher.OnViewTapListener): Unit = definedExternally
    override fun getOnViewTapListener(): PhotoViewAttacher.OnViewTapListener = definedExternally
    override fun setScale(scale: Number): Unit = definedExternally
    override fun setScale(scale: Number, animate: Boolean): Unit = definedExternally
    override fun setScale(scale: Number, focalX: Number, focalY: Number, animate: Boolean): Unit = definedExternally
    override fun setScaleType(scaleType: ScaleType): Unit = definedExternally
    override fun setZoomable(zoomable: Boolean): Unit = definedExternally
    override fun getVisibleRectangleBitmap(): Canvas = definedExternally
    override fun setZoomTransitionDuration(milliseconds: Number): Unit = definedExternally
    override fun getIPhotoViewImplementation(): IPhotoView = definedExternally
    override fun setOnDoubleTapListener(newOnDoubleTapListener: GestureDetector.OnDoubleTapListener): Unit = definedExternally
    override fun setOnScaleChangeListener(onScaleChangeListener: PhotoViewAttacher.OnScaleChangeListener): Unit = definedExternally
    override fun onDetachedFromWindow(): Unit = definedExternally
    override fun onAttachedToWindow(): Unit = definedExternally
}
