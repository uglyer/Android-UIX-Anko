@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.view.menu")

package android.view.menu

import android.content.*
import android.view.*
import android.widget.AdapterView
import android.widget.BaseAdapter
import android.widget.PopupWindow
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

external open class MenuPopupHelper(context: Context, menu: Menu, anchorView: View? = definedExternally /* null */) : AdapterView.OnItemClickListener, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, PopupWindow.OnDismissListener {
    open class MenuAdapter(menu: Menu, arg: MenuPopupHelper) : BaseAdapter {
        open var _MenuPopupHelper_this: MenuPopupHelper = definedExternally
        open var mAdapterMenu: Any = definedExternally
        override fun getCount(): Number = definedExternally
        override fun getItem(position: Number): MenuItem = definedExternally
        override fun getItemId(position: Number): Number = definedExternally
        override fun getView(position: Number, convertView: View, parent: ViewGroup): View = definedExternally
        override fun notifyDataSetChanged(): Unit = definedExternally
    }

    open var mContext: Any = definedExternally
    open var mInflater: Any = definedExternally
    open var mPopup: Any = definedExternally
    open var mMenu: Any = definedExternally
    open var mPopupMaxWidth: Any = definedExternally
    open var mAnchorView: Any = definedExternally
    open var mTreeObserver: Any = definedExternally
    open var mAdapter: Any = definedExternally
    open var mMeasureParent: Any = definedExternally
    open fun setAnchorView(anchor: View): Unit = definedExternally
    open fun show(): Unit = definedExternally
    open fun tryShow(): Boolean = definedExternally
    open fun dismiss(): Unit = definedExternally
    override fun onDismiss(): Unit = definedExternally
    open fun isShowing(): Boolean = definedExternally
    override fun onItemClick(parent: AdapterView<dynamic>, view: View, position: Number, id: Number): Unit = definedExternally
    override fun onKey(v: View, keyCode: Number, event: KeyEvent): Boolean = definedExternally
    open fun measureContentWidth(adapter: Any): Unit = definedExternally
    override fun onGlobalLayout(): Unit = definedExternally

    companion object {
        var TAG: Any = definedExternally
        var ITEM_LAYOUT: String = definedExternally
    }
}
