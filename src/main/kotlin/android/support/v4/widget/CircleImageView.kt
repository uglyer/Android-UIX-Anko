//package android.support.v4.widget
//
//
//import android.content.Context
//import android.graphics.Canvas
//import android.graphics.Color
//import android.graphics.Paint
//import android.graphics.RadialGradient
//import android.graphics.Shader
//import android.graphics.drawable.ShapeDrawable
//import android.graphics.drawable.shapes.OvalShape
//import android.support.v4.content.ContextCompat
//import android.support.v4.view.ViewCompat
//import android.view.View
//import android.view.animation.Animation
//import android.widget.ImageView
//import androidui.image.NetDrawable.TileMode
////import com.sun.prism.ps.Shader
//
///**
// * Private class created to work around issues with AnimationListeners being
// * called before the animation is actually complete and support shadows on older
// * platforms.
// */
//internal class CircleImageView(context: Context, color: Int) : ImageView(context) {
//
//    private var mListener: Animation.AnimationListener? = null
//    var mShadowRadius: Int = 0
//
//    init {
//        val density = getContext().getResources().getDisplayMetrics().density
//        val shadowYOffset = (density * Y_OFFSET).toInt()
//        val shadowXOffset = (density * X_OFFSET).toInt()
//
//        mShadowRadius = (density * SHADOW_RADIUS).toInt()
//
//        val circle: ShapeDrawable
//        if (elevationSupported()) {
//            circle = ShapeDrawable(OvalShape())
//            ViewCompat.setElevation(this, SHADOW_ELEVATION * density)
//        } else {
//            val oval = OvalShadow(mShadowRadius)
//            circle = ShapeDrawable(oval)
//            setLayerType(View.LAYER_TYPE_SOFTWARE, circle.getPaint())
//            circle.getPaint().setShadowLayer(mShadowRadius, shadowXOffset, shadowYOffset,
//                    KEY_SHADOW_COLOR)
//            val padding = mShadowRadius
//            // set padding so the inner image sits correctly within the shadow.
//            setPadding(padding, padding, padding, padding)
//        }
//        circle.getPaint().setColor(color)
//        ViewCompat.setBackground(this, circle)
//    }
//
//    private fun elevationSupported(): Boolean {
//        return false
//    }
//
//    protected fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
//        if (!elevationSupported()) {
//            setMeasuredDimension(getMeasuredWidth().toInt() + mShadowRadius * 2, getMeasuredHeight().toInt() + mShadowRadius * 2)
//        }
//    }
//
//    fun setAnimationListener(listener: Animation.AnimationListener) {
//        mListener = listener
//    }
//
//    override fun onAnimationStart() {
//        super.onAnimationStart()
//        if (mListener !=
//                null) {
//            mListener!!.onAnimationStart(getAnimation())
//        }
//    }
//
//    override fun onAnimationEnd() {
//        super.onAnimationEnd()
//        if (mListener != null) {
//            mListener!!.onAnimationEnd(getAnimation())
//        }
//    }
//
//    /**
//     * Update the background color of the circle image view.
//     *
//     * @param colorRes Id of a color resource.
//     */
//    fun setBackgroundColorRes(colorRes: Int) {
//        setBackgroundColor(ContextCompat.getColor(getContext(), colorRes))
//    }
//
//    fun setBackgroundColor(color: Int) {
//        if (getBackground() is ShapeDrawable) {
//            (getBackground() as ShapeDrawable).getPaint().setColor(color)
//        }
//    }
//
//    private inner class OvalShadow internal constructor(shadowRadius: Int) : OvalShape() {
//        private var mRadialGradient: RadialGradient? = null
//        private val mShadowPaint: Paint
//
//        init {
//            mShadowPaint = Paint()
//            mShadowRadius = shadowRadius
//            updateRadialGradient(rect().width() as Int)
//        }
//
//        protected fun onResize(width: Float, height: Float) {
//            super.onResize(width, height)
//            updateRadialGradient(width.toInt())
//        }
//
//        fun draw(canvas: Canvas, paint: Paint) {
//            val viewWidth = this@CircleImageView.getWidth().toInt()
//            val viewHeight = this@CircleImageView.getHeight().toInt()
//            canvas.drawCircle(viewWidth / 2, viewHeight / 2, viewWidth / 2, mShadowPaint)
//            canvas.drawCircle(viewWidth / 2, viewHeight / 2, viewWidth / 2 - mShadowRadius, paint)
//        }
//
//        private fun updateRadialGradient(diameter: Int) {
//            mRadialGradient = RadialGradient(diameter / 2, diameter / 2,
//                    mShadowRadius, intArrayOf(FILL_SHADOW_COLOR, Color.TRANSPARENT.toInt()), null, Shader.TileMode.CLAMP)
//            mShadowPaint.setShader(mRadialGradient)
//        }
//    }
//
//    companion object {
//
//        private val KEY_SHADOW_COLOR = 0x1E000000
//        private val FILL_SHADOW_COLOR = 0x3D000000
//        // PX
//        private val X_OFFSET = 0f
//        private val Y_OFFSET = 1.75f
//        private val SHADOW_RADIUS = 3.5f
//        private val SHADOW_ELEVATION = 4
//    }
//}
