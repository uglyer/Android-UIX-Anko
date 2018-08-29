package UKot.widget

import UKot.interfaces.FakeViewGroup
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.RelativeLayout
import org.w3c.dom.HTMLElement


open class UI {
    lateinit var view: View

    fun setView(realView: View) {
        this.view = realView
    }
}

abstract class FakeView : UI() {
    abstract fun initView(): View

    init {
        setView(initView())
    }
}

//abstract class FakeFrameLayout(ctx: Context) : FrameLayout(ctx), FakeViewGroup {
//
//}


fun UKotUI(init: UI.() -> Unit): UI = UI().apply(init)
fun <T : View> UI.doInit(view: T, init: T.() -> Unit): T {
    //view.initView()
    view.apply(init)
    setView(view)
    return view
}