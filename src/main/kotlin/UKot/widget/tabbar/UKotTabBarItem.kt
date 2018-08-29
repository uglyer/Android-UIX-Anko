package UKot.widget.tabbar

import UKot.dip
import UKot.wrapContent
import android.app.Activity
import android.content.Context
import android.graphics.drawable.Drawable
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import org.jetbrains.anko.AnkoViewDslMarker
import org.jetbrains.anko.custom.ankoFakeViewGroup
import org.jetbrains.anko.imageView
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout


class UKotTabBarItem(ctx: Context, title: String, icon: Drawable) : FrameLayout(ctx) {
    var root: LinearLayout
    lateinit var textView: TextView
    lateinit var clickEvent: () -> Unit

    init {
        root = verticalLayout {
            imageView(icon) { }.lparams(width = dip(27), height = dip(27)) { gravity = Gravity.CENTER }
            textView = textView(title) {
                setTextSize(12)
            }.lparams(wrapContent, wrapContent) { gravity = Gravity.CENTER }
        }
    }

    fun onClick(clickEvent: () -> Unit) {
        this.clickEvent = clickEvent
    }
}

inline fun UKotTabBar.item(title: String, icon: Drawable, init: (@AnkoViewDslMarker UKotTabBarItem).() -> Unit): UKotTabBarItem {
    val view = ankoFakeViewGroup({ ctx -> UKotTabBarItem(ctx, title, icon) }, theme = 0) { init() }
    val lp = view.getLayoutParams() as LinearLayout.LayoutParams
    lp.weight = 1
    lp.gravity = Gravity.CENTER
    lp.topMargin = dip(2)
    view.setLayoutParams(lp)
//    val rootLp = view.root.getLayoutParams() as RelativeLayout.LayoutParams
//    console.log(view.root.getLayoutParams())
    return view
}