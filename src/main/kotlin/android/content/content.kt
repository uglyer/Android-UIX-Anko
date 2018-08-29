@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.content")

package android.content

import UKot.interfaces.AppColor
import android.app.Activity
import android.content.res.TypedArray
import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
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

external open class Intent(activityName: String? = definedExternally /* null */) {
    open var mExtras: Any = definedExternally
    open var mRequestCode: Any = definedExternally
    open var mFlags: Any = definedExternally
    open var activity: Activity = definedExternally
    open var activityName: Any = definedExternally
    open fun getActivity(): Activity = definedExternally
    open fun setActivity(activity: Activity): Unit = definedExternally
    open fun getBooleanExtra(name: String, defaultValue: Boolean): Boolean = definedExternally
    open fun getIntExtra(name: String, defaultValue: Number): Number = definedExternally
    open fun getLongExtra(name: String, defaultValue: Number): Number = definedExternally
    open fun getFloatExtra(name: String, defaultValue: Number): Number = definedExternally
    open fun getDoubleExtra(name: String, defaultValue: Number): Number = definedExternally
    open fun getStringExtra(name: String, defaultValue: String? = definedExternally /* null */): String = definedExternally
    open fun getStringArrayExtra(name: String, defaultValue: Array<String>? = definedExternally /* null */): Array<String> = definedExternally
    open fun getIntegerArrayExtra(name: String, defaultValue: Array<Number>? = definedExternally /* null */): Array<Number> = definedExternally
    open fun getLongArrayExtra(name: String, defaultValue: Array<Number>? = definedExternally /* null */): Array<Number> = definedExternally
    open fun getFloatArrayExtra(name: String, defaultValue: Array<Number>? = definedExternally /* null */): Array<Number> = definedExternally
    open fun getDoubleArrayExtra(name: String, defaultValue: Array<Number>? = definedExternally /* null */): Array<Number> = definedExternally
    open fun getBooleanArrayExtra(name: String, defaultValue: Array<Boolean>? = definedExternally /* null */): Array<Boolean> = definedExternally
    open fun hasExtra(name: String): Boolean = definedExternally
    open fun putExtra(name: String, value: Any): Intent = definedExternally
    open fun getExtras(): Bundle = definedExternally
    open fun getFlags(): Number = definedExternally
    open fun setFlags(flags: Number): Intent = definedExternally
    open fun addFlags(flags: Number): Intent = definedExternally

    companion object {
        var FLAG_ACTIVITY_CLEAR_TOP: Number = definedExternally
    }
}

external open class Context(androidUI: androidui.AndroidUI) {
    open var appColor: AppColor = definedExternally
    open var androidUI: androidui.AndroidUI = definedExternally
    open var mLayoutInflater: Any = definedExternally
    open var mResources: Any = definedExternally
    open fun getWindowManager(): android.view.WindowManager = definedExternally
    open fun getApplicationContext(): android.app.Application = definedExternally
    open fun getResources(): android.content.res.Resources = definedExternally
    open fun getLayoutInflater(): LayoutInflater = definedExternally
    open fun obtainStyledAttributes(attrs: HTMLElement, defStyleAttr: Map<String, String>? = definedExternally /* null */): TypedArray = definedExternally
}

external interface DialogInterface {
    fun cancel()
    fun dismiss()

    interface OnCancelListener {
        fun onCancel(dialog: DialogInterface)
    }

    interface OnDismissListener {
        fun onDismiss(dialog: DialogInterface)
    }

    interface OnShowListener {
        fun onShow(dialog: DialogInterface)
    }

    interface OnClickListener {
        fun onClick(dialog: DialogInterface, which: Number)
    }

    interface OnMultiChoiceClickListener {
        fun onClick(dialog: DialogInterface, which: Number, isChecked: Boolean)
    }

    interface OnKeyListener {
        fun onKey(dialog: DialogInterface, keyCode: Number, event: KeyEvent): Boolean
    }
//    var BUTTON_POSITIVE: Number = definedExternally
//    var BUTTON_NEGATIVE: Number = definedExternally
//    var BUTTON_NEUTRAL: Number = definedExternally
//    var BUTTON1: Number = definedExternally
//    var BUTTON2: Number = definedExternally
//    var BUTTON3: Number = definedExternally
}
