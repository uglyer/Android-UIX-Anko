package UKot

import UKot.app.UKotActivity
import UKot.content.UKotContext
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.util.TypedValue
import android.widget.*
import androidui.image.NetDrawable
import android.graphics.drawable.StateListDrawable
import android.view.View
import android.view.ViewGroup
import org.w3c.dom.HTMLElement
import kotlin.browser.document
import kotlin.js.Date

fun context(): Context = UKotContext.AUI.mApplication


fun renderXML(xml: HTMLElement): View {
    return context().getLayoutInflater().inflate(xml)
}

fun getDrawable(imgData: String): Drawable {
    if (!imgData.startsWith("data:")) {
        throw Exception("not support xml yet")
    }
    return NetDrawable(imgData)
}

fun dip(value: Number): Number = TypedValue.complexToDimensionPixelSize("${value}dp", value)
//fun dip(value: Number): Number = value

fun dip(value: String): Number = TypedValue.complexToDimensionPixelSize(value, 0)

val MATCH_PARENT = ViewGroup.LayoutParams.MATCH_PARENT
val WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT
val FILL_PARENT = ViewGroup.LayoutParams.FILL_PARENT
val LATE_INIT = -100

val matchParent = ViewGroup.LayoutParams.MATCH_PARENT
val wrapContent = ViewGroup.LayoutParams.WRAP_CONTENT
val fillParent = ViewGroup.LayoutParams.FILL_PARENT


fun View.setBackgroundColor(colorStr: String) = setBackgroundColor(Color.parseColor(colorStr))
fun View.setBG(colorStr: String) = setBackgroundDrawable(buildStateDrawable(colorStr))

fun TextView.setTextColor(colorStr: String) = setTextColor(Color.parseColor(colorStr))

fun View.hide() = setVisibility(View.GONE)
fun View.show() = setVisibility(View.VISIBLE)

fun View.setPadding(number: Number) = setPadding(number, number, number, number)
fun View.defPadding() = setPadding(dip(6))

fun ViewGroup.MarginLayoutParams.setMargin(number: Number) = setMargins(number, number, number, number)
fun ViewGroup.MarginLayoutParams.defMargin() = setMargin(dip(6))

fun buildStateDrawable(colorStr: String): StateListDrawable {
    val color = Color.parseColor(colorStr)
    val colorPressed = color.toInt() - 20
    return buildStateDrawable(ColorDrawable(color), ColorDrawable(colorPressed))
}

fun buildStateDrawable(colorStr: String, colorPressed: String): StateListDrawable {
    return buildStateDrawable(ColorDrawable(Color.parseColor(colorStr)), ColorDrawable(Color.parseColor(colorPressed)))
}

fun buildStateDrawable(drawable: Drawable, drawablePressed: Drawable): StateListDrawable {
    val stateList = StateListDrawable()
    stateList.addState(arrayOf(View.VIEW_STATE_PRESSED, View.VIEW_STATE_WINDOW_FOCUSED), drawablePressed)
    stateList.addState(arrayOf(View.VIEW_STATE_FOCUSED, View.VIEW_STATE_WINDOW_FOCUSED), drawablePressed)
    stateList.addState(arrayOf(View.VIEW_STATE_SELECTED, View.VIEW_STATE_WINDOW_FOCUSED), drawablePressed)
    stateList.addState(arrayOf(), drawable)
    return stateList
}

fun View.toast(msg: String) {
    Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show()
}

fun UKotActivity.toast(msg: String) {
    Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
}

fun Context.toast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

//控件参数修改(小写)
fun View.attrChange(attr: String, value: String) = _attrBinder.onAttrChange(attr, value, getContext())

//圆角
fun View.radius() = radius(5)

fun View.radius(dp: Int) = attrChange("cornerradius", "${dp}dp")


fun View.onClick(click: () -> Unit) = setOnClickListener { click() }

fun LinearLayout.setVertical(): LinearLayout {
    setOrientation(LinearLayout.VERTICAL)
//    getLayoutParams().createClassAttrBinder()
    return this
}

//RelativeLayout.LayoutParams 扩展
fun RelativeLayout.LayoutParams.alignParentRight() {
    addRule(RelativeLayout.ALIGN_PARENT_RIGHT, "true")
}

fun RelativeLayout.LayoutParams.alignParentBottom() {
    addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, "true")
}

fun RelativeLayout.LayoutParams.alignParentLeft() {
    addRule(RelativeLayout.ALIGN_PARENT_LEFT, "true")
}

fun RelativeLayout.LayoutParams.alignParentTOP() {
    addRule(RelativeLayout.ALIGN_PARENT_TOP, "true")
}

fun RelativeLayout.LayoutParams.centerInParent() {
    addRule(RelativeLayout.CENTER_IN_PARENT, "true")
}

fun RelativeLayout.LayoutParams.centerHorizontal() {
    addRule(RelativeLayout.CENTER_HORIZONTAL, "true")
}

fun RelativeLayout.LayoutParams.centerVertical() {
    addRule(RelativeLayout.CENTER_VERTICAL, "true")
}
