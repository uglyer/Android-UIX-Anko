package UKot.widget

import UKot.app.UKotActivity
import android.content.Context
import android.view.ViewGroup
import android.widget.FrameLayout
import org.jetbrains.anko.AnkoViewDslMarker
import org.jetbrains.anko.custom.ankoView

/**
 * UKotPanel
 * @Date: Created by uglyer in 2017/10/30.
 */
class UKotPanel(ctx: Context) : FrameLayout(ctx) {
    var lastActivity: UKotActivity? = null
    fun renderHere(uKotActivity: UKotActivity) {
        if (uKotActivity.fakeContext == null) {
            throw Exception("activity need initActivity")
        }
        removeAllViews()
        lastActivity?.onPause()
//        console.log(uKotActivity.renderInChildView())
        lastActivity = uKotActivity
        addView(uKotActivity.renderInChildView())
    }
}

inline fun ViewGroup.panel(init: (@AnkoViewDslMarker UKotPanel).() -> Unit): UKotPanel {
    return ankoView({ ctx -> UKotPanel(ctx) }, theme = 0) { init() }
}