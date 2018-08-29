@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("androidui.widget")
package androidui.widget

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.FrameLayout
import android.widget.ProgressBar
import android.widget.TextView
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

external interface HtmlDataAdapter {
    fun onInflateAdapter(bindElement: HTMLElement, context: Context? = definedExternally /* null */, parent: ViewGroup? = definedExternally /* null */)
}
external open class HtmlBaseView(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : View {
    open var mHtmlTouchAble: Any = definedExternally
    override fun onTouchEvent(event: android.view.MotionEvent): Boolean = definedExternally
    open fun setHtmlTouchAble(enable: Boolean): Unit = definedExternally
    open fun isHtmlTouchAble(): Boolean = definedExternally
    override fun dependOnDebugLayout(): Boolean = definedExternally
}
external open class HtmlView(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : HtmlBaseView {
    open fun onMeasure(widthMeasureSpec: Any, heightMeasureSpec: Any): Unit = definedExternally
    open fun setHtml(html: String): Unit = definedExternally
    open fun getHtml(): String = definedExternally
}
external open class HtmlImageView(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : HtmlBaseView {
    open var mScaleType: Any = definedExternally
    open var mHaveFrame: Any = definedExternally
    open var mAdjustViewBounds: Any = definedExternally
    open var mMaxWidth: Any = definedExternally
    open var mMaxHeight: Any = definedExternally
    open var mAlpha: Any = definedExternally
    open var mDrawableWidth: Any = definedExternally
    open var mDrawableHeight: Any = definedExternally
    open var mAdjustViewBoundsCompat: Any = definedExternally
    open var mImgElement: Any = definedExternally
    override fun createClassAttrBinder(): androidui.attr.AttrBinder.ClassBinderMap = definedExternally
    open fun initImageView(): Unit = definedExternally
    open fun getAdjustViewBounds(): Boolean = definedExternally
    open fun setAdjustViewBounds(adjustViewBounds: Boolean): Unit = definedExternally
    open fun getMaxWidth(): Number = definedExternally
    open fun setMaxWidth(maxWidth: Number): Unit = definedExternally
    open fun getMaxHeight(): Number = definedExternally
    open fun setMaxHeight(maxHeight: Number): Unit = definedExternally
    open fun setImageURI(uri: String): Unit = definedExternally
    open fun setScaleType(scaleType: android.widget.ImageView.ScaleType): Unit = definedExternally
    open fun getScaleType(): android.widget.ImageView.ScaleType = definedExternally
    open fun onMeasure(widthMeasureSpec: Any, heightMeasureSpec: Any): Unit = definedExternally
    open fun resolveAdjustedSize(desiredSize: Any, maxSize: Any, measureSpec: Any): Unit = definedExternally
    override fun setFrame(left: Number, top: Number, right: Number, bottom: Number): Boolean = definedExternally
    open fun configureBounds(): Unit = definedExternally
    open fun getImageAlpha(): Number = definedExternally
    open fun setImageAlpha(alpha: Number): Unit = definedExternally
}
external open class HtmlDataListAdapter : BaseAdapter, HtmlDataAdapter {
    open var bindElementData: HTMLElement = definedExternally
    open var mContext: Context = definedExternally
    override fun onInflateAdapter(bindElement: HTMLElement, context: Context?, parent: android.view.ViewGroup?): Unit = definedExternally
    open fun registerHtmlDataObserver(): Unit = definedExternally
    override fun getItemViewType(position: Number): Number = definedExternally
    override fun getView(position: Number, convertView: View, parent: ViewGroup): View = definedExternally
    override fun getCount(): Number = definedExternally
    override fun getItem(position: Number): Element = definedExternally
    open fun checkReplaceWithRef(element: Any): Unit = definedExternally
    open fun removeElementRefAndRestoreToAdapter(childElement: Any): Unit = definedExternally
    open fun notifyDataSizeWillChange(): Unit = definedExternally
    override fun getItemId(position: Number): Number = definedExternally
    companion object {
        var RefElementTag: String = definedExternally
        var RefElementProperty: String = definedExternally
        var BindAdapterProperty: String = definedExternally
    }
}
external open class HtmlDataPagerAdapter : PagerAdapter, HtmlDataAdapter {
    open var bindElementData: HTMLElement = definedExternally
    open var mContext: Context = definedExternally
    override fun onInflateAdapter(bindElement: HTMLElement, context: Context?, parent: android.view.ViewGroup?): Unit = definedExternally
    open fun registerHtmlDataObserver(): Unit = definedExternally
    override fun getCount(): Number = definedExternally
    override fun instantiateItem(container: android.view.ViewGroup, position: Number): Any = definedExternally
    open fun getItem(position: Number): Element = definedExternally
    open fun checkReplaceWithRef(element: Any): Unit = definedExternally
    open fun removeElementRefAndRestoreToAdapter(childElement: Any): Unit = definedExternally
    open fun notifyDataSizeWillChange(): Unit = definedExternally
    override fun destroyItem(container: android.view.ViewGroup, position: Number, `object`: Any): Unit = definedExternally
    override fun isViewFromObject(view: android.view.View, `object`: Any): Boolean = definedExternally
    override fun getItemPosition(`object`: Any): Number = definedExternally
    companion object {
        var RefElementTag: String = definedExternally
        var RefElementProperty: String = definedExternally
        var BindAdapterProperty: String = definedExternally
    }
}
external open class HtmlDataPickerAdapter : HtmlDataAdapter {
    open var bindElementData: HTMLElement = definedExternally
    override fun onInflateAdapter(bindElement: HTMLElement, context: Context?, parent: android.view.ViewGroup?): Unit = definedExternally
}

external interface OverScrollLocker {
    fun lockOverScrollTop(lockTop: Number)
    fun lockOverScrollBottom(lockBottom: Number)
    fun getScrollContentBottom(): Number
    //fun getFrom(view: View): OverScrollLocker = definedExternally
}
external interface `T$2` {
    @nativeGetter
    operator fun get(x: Number): Array<Number>?
    @nativeSetter
    operator fun set(x: Number, value: Array<Number>)
}
external open class PullRefreshLoadLayout(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : FrameLayout {


    interface RefreshLoadListener {
        fun onRefresh(prll: PullRefreshLoadLayout)
        fun onLoadMore(prll: PullRefreshLoadLayout)
    }
    open class HeaderView : FrameLayout {
        open var state: Any = definedExternally
        open var stateBeforeReady: Any = definedExternally
        open fun setStateInner(prll: PullRefreshLoadLayout, state: Number): Unit = definedExternally
        open fun onStateChange(newState: Number, oldState: Number): Unit = definedExternally
    }
    open class FooterView : FrameLayout {
        open var state: Any = definedExternally
        open var stateBeforeReady: Any = definedExternally
        open fun setStateInner(prll: PullRefreshLoadLayout, state: Number): Unit = definedExternally
        open fun onStateChange(newState: Number, oldState: Number): Unit = definedExternally
    }
    open class DefaultHeaderView(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : HeaderView {
        open var textView: TextView = definedExternally
        open var progressBar: ProgressBar = definedExternally
        override fun onStateChange(newState: Number, oldState: Number): Unit = definedExternally
    }
    open class DefaultFooterView(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : FooterView {
        open var textView: TextView = definedExternally
        open var progressBar: ProgressBar = definedExternally
        override fun onStateChange(newState: Number, oldState: Number): Unit = definedExternally
    }

    open var autoLoadScrollAtBottom: Any = definedExternally
    open var headerView: Any = definedExternally
    open var footerView: Any = definedExternally
    open var footerViewReadyDistance: Any = definedExternally
    open var contentView: Any = definedExternally
    open var contentOverY: Any = definedExternally
    open var overScrollLocker: Any = definedExternally
    open var refreshLoadListener: Any = definedExternally
    override fun onViewAdded(child: View): Unit = definedExternally
    open fun configHeaderView(): Unit = definedExternally
    open fun configFooterView(): Unit = definedExternally
    open fun configContentView(): Unit = definedExternally
    open fun onContentOverScroll(scrollRangeY: Any, maxOverScrollY: Any, isTouchEvent: Any): Unit = definedExternally
    open fun setHeaderView(headerView: PullRefreshLoadLayout.HeaderView): Unit = definedExternally
    open fun setFooterView(footerView: PullRefreshLoadLayout.FooterView): Unit = definedExternally
    open fun setContentView(contentView: View): Unit = definedExternally
    open fun setHeaderState(newState: Number): Unit = definedExternally
    open fun getHeaderState(): Number = definedExternally
    open fun setFooterState(newState: Number): Unit = definedExternally
    open fun getFooterState(): Number = definedExternally
    open fun checkLockOverScroll(): Unit = definedExternally
    open fun checkHeaderFooterPosition(): Unit = definedExternally
    open fun setHeaderViewAppearDistance(distance: Any): Unit = definedExternally
    open fun setFooterViewAppearDistance(distance: Any): Unit = definedExternally
    override fun onLayout(changed: Boolean, left: Number, top: Number, right: Number, bottom: Number): Unit = definedExternally
    open fun setAutoLoadMoreWhenScrollBottom(autoLoad: Boolean): Unit = definedExternally
    open fun setRefreshEnable(enable: Boolean): Unit = definedExternally
    open fun setLoadEnable(enable: Boolean): Unit = definedExternally
    open fun setRefreshLoadListener(refreshLoadListener: PullRefreshLoadLayout.RefreshLoadListener): Unit = definedExternally
    open fun startRefresh(): Unit = definedExternally
    open fun startLoadMore(): Unit = definedExternally
    companion object {
        var State_Disable: Number = definedExternally
        var State_Header_Normal: Number = definedExternally
        var State_Header_Refreshing: Number = definedExternally
        var State_Header_ReadyToRefresh: Number = definedExternally
        var State_Header_RefreshFail: Number = definedExternally
        var State_Footer_Normal: Number = definedExternally
        var State_Footer_Loading: Number = definedExternally
        var State_Footer_ReadyToLoad: Number = definedExternally
        var State_Footer_LoadFail: Number = definedExternally
        var State_Footer_NoMoreToLoad: Number = definedExternally
        var StateChangeLimit: `T$2` = definedExternally
    }
}
