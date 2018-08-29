package UKot.widget.tabbar

import UKot.*
import UKot.app.UKotColor
import UKot.interfaces.FakeViewGroup
import android.content.Context
import android.graphics.drawable.Drawable
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.Toast
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.ankoFakeViewGroup
import org.jetbrains.anko.custom.ankoView

/**
 * UKotTabBar
 * @Date: Created by uglyer in 2017/10/30.
 */
class UKotTabBar(ctx: Context) : FrameLayout(ctx), FakeViewGroup {

    lateinit var itemLayout: LinearLayout
    val itemList = ArrayList<UKotTabBarItem>()

    init {
        verticalLayout {
            imageView {
                setBackgroundColor(UKotColor.SPLIT_LINE)
            }.lparams(width = matchParent, height = dip(1))
            itemLayout = linearLayout {
                setBackgroundColor(UKotColor.TAB_BAR_BACKGROUND)
            }.lparams(matchParent, matchParent)
        }
    }

    override fun addRealView(view: View) {
        itemLayout.addView(view)
        bind(view as UKotTabBarItem)
    }

    fun bind(item: UKotTabBarItem) {
        itemList.add(item)
//        console.log(getContext().appColor.colorAccent)
        item.setOnClickListener { view ->
            selected(view)
//            Toast.makeText(getContext(), getContext().appColor.colorAccent, Toast.LENGTH_SHORT).show()
        }
    }

    fun selected(index: Int) {
        selected(itemList.get(0))
    }

    fun selected(view: View) {
        itemList.forEach {
            if (it.equals(view)) {
                if (it.clickEvent != null) it.clickEvent.invoke()
                it.textView.setTextColor(getContext().appColor.colorPrimary)
            } else {
                it.textView.setTextColor(UKotColor.TAB_BAR_TEXT)
            }
        }
    }
}


inline fun ViewGroup.tabBar(init: (@AnkoViewDslMarker UKotTabBar).() -> Unit): UKotTabBar {
    return ankoView({ ctx -> UKotTabBar(ctx) }, theme = 0) { init() }
}