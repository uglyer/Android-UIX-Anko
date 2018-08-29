@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("com.jakewharton.salvage")
package com.jakewharton.salvage

import android.support.v4.view.PagerAdapter
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

external open class RecyclingPagerAdapter : PagerAdapter {
    open var recycleBin: Any = definedExternally
    override fun notifyDataSetChanged(): Unit = definedExternally
    override fun instantiateItem(container: android.view.ViewGroup, position: Number): Any = definedExternally
    override fun destroyItem(container: android.view.ViewGroup, position: Number, `object`: Any): Unit = definedExternally
    override fun isViewFromObject(view: android.view.View, `object`: Any): Boolean = definedExternally
    open fun getViewTypeCount(): Number = definedExternally
    open fun getItemViewType(position: Number): Number = definedExternally
    open fun getView(position: Number, convertView: View, parent: ViewGroup): View = definedExternally
    companion object {
        var IGNORE_ITEM_VIEW_TYPE: Number = definedExternally
    }
}
