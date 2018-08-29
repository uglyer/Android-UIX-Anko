package UKot.anko

import UKot.WRAP_CONTENT
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.*
import org.w3c.dom.HTMLElement

open class _WebView(ctx: Context): WebView(ctx) {

    inline fun <T: View> T.lparams(
            c: Context?,
            attrs: HTMLElement?,
            init: ViewGroup.LayoutParams.() -> Unit
    ): T {
        val layoutParams = ViewGroup.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            c: Context?,
            attrs: HTMLElement?
    ): T {
        val layoutParams = ViewGroup.LayoutParams(c!!, attrs!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            init: ViewGroup.LayoutParams.() -> Unit
    ): T {
        val layoutParams = ViewGroup.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT
    ): T {
        val layoutParams = ViewGroup.LayoutParams(width, height)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: ViewGroup.LayoutParams.() -> Unit
    ): T {
        val layoutParams = ViewGroup.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?
    ): T {
        val layoutParams = ViewGroup.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

}

open class _FrameLayout(ctx: Context): FrameLayout(ctx) {

    inline fun <T: View> T.lparams(
            c: Context?,
            attrs: HTMLElement?,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            c: Context?,
            attrs: HTMLElement?
    ): T {
        val layoutParams = FrameLayout.LayoutParams(c!!, attrs!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            gravity: Int,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height, gravity)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            gravity: Int
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height, gravity)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: FrameLayout.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: FrameLayout.LayoutParams?
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

}


open class _GridView(ctx: Context): GridView(ctx) {

    inline fun <T: View> T.lparams(
            c: Context?,
            attrs: HTMLElement?,
            init: AbsListView.LayoutParams.() -> Unit
    ): T {
        val layoutParams = AbsListView.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            c: Context?,
            attrs: HTMLElement?
    ): T {
        val layoutParams = AbsListView.LayoutParams(c!!, attrs!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            init: AbsListView.LayoutParams.() -> Unit
    ): T {
        val layoutParams = AbsListView.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT
    ): T {
        val layoutParams = AbsListView.LayoutParams(width, height)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            viewType: Int,
            init: AbsListView.LayoutParams.() -> Unit
    ): T {
        val layoutParams = AbsListView.LayoutParams(width, height, viewType)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            viewType: Int
    ): T {
        val layoutParams = AbsListView.LayoutParams(width, height, viewType)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: AbsListView.LayoutParams.() -> Unit
    ): T {
        val layoutParams = AbsListView.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?
    ): T {
        val layoutParams = AbsListView.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

}

open class _HorizontalScrollView(ctx: Context): HorizontalScrollView(ctx) {

    inline fun <T: View> T.lparams(
            c: Context?,
            attrs: HTMLElement?,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            c: Context?,
            attrs: HTMLElement?
    ): T {
        val layoutParams = FrameLayout.LayoutParams(c!!, attrs!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            gravity: Int,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height, gravity)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            gravity: Int
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height, gravity)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: FrameLayout.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: FrameLayout.LayoutParams?
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

}


open class _LinearLayout(ctx: Context): LinearLayout(ctx) {

    inline fun <T: View> T.lparams(
            c: Context?,
            attrs: HTMLElement?,
            init: LinearLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = LinearLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            c: Context?,
            attrs: HTMLElement?
    ): T {
        val layoutParams = LinearLayout.LayoutParams(c!!, attrs!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            init: LinearLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = LinearLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT
    ): T {
        val layoutParams = LinearLayout.LayoutParams(width, height)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            weight: Float,
            init: LinearLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = LinearLayout.LayoutParams(width, height, weight)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            weight: Float
    ): T {
        val layoutParams = LinearLayout.LayoutParams(width, height, weight)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            p: ViewGroup.LayoutParams?,
            init: LinearLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = LinearLayout.LayoutParams(p!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            p: ViewGroup.LayoutParams?
    ): T {
        val layoutParams = LinearLayout.LayoutParams(p!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: LinearLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = LinearLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?
    ): T {
        val layoutParams = LinearLayout.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: LinearLayout.LayoutParams?,
            init: LinearLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = LinearLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: LinearLayout.LayoutParams?
    ): T {
        val layoutParams = LinearLayout.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

}

open class _RadioGroup(ctx: Context): RadioGroup(ctx) {

    inline fun <T: View> T.lparams(
            c: Context?,
            attrs: HTMLElement?,
            init: RadioGroup.LayoutParams.() -> Unit
    ): T {
        val layoutParams = RadioGroup.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            c: Context?,
            attrs: HTMLElement?
    ): T {
        val layoutParams = RadioGroup.LayoutParams(c!!, attrs!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            init: RadioGroup.LayoutParams.() -> Unit
    ): T {
        val layoutParams = RadioGroup.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT
    ): T {
        val layoutParams = RadioGroup.LayoutParams(width, height)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            initWeight: Float,
            init: RadioGroup.LayoutParams.() -> Unit
    ): T {
        val layoutParams = RadioGroup.LayoutParams(width, height, initWeight)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            initWeight: Float
    ): T {
        val layoutParams = RadioGroup.LayoutParams(width, height, initWeight)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            p: ViewGroup.LayoutParams?,
            init: RadioGroup.LayoutParams.() -> Unit
    ): T {
        val layoutParams = RadioGroup.LayoutParams(p!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            p: ViewGroup.LayoutParams?
    ): T {
        val layoutParams = RadioGroup.LayoutParams(p!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: RadioGroup.LayoutParams.() -> Unit
    ): T {
        val layoutParams = RadioGroup.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?
    ): T {
        val layoutParams = RadioGroup.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

}

open class _RelativeLayout(ctx: Context): RelativeLayout(ctx) {

    inline fun <T: View> T.lparams(
            c: Context?,
            attrs: HTMLElement?,
            init: RelativeLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = RelativeLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            c: Context?,
            attrs: HTMLElement?
    ): T {
        val layoutParams = RelativeLayout.LayoutParams(c!!, attrs!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            init: RelativeLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = RelativeLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT
    ): T {
        val layoutParams = RelativeLayout.LayoutParams(width, height)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: RelativeLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = RelativeLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?
    ): T {
        val layoutParams = RelativeLayout.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: RelativeLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = RelativeLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?
    ): T {
        val layoutParams = RelativeLayout.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: RelativeLayout.LayoutParams?,
            init: RelativeLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = RelativeLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: RelativeLayout.LayoutParams?
    ): T {
        val layoutParams = RelativeLayout.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

}

open class _ScrollView(ctx: Context): ScrollView(ctx) {

    inline fun <T: View> T.lparams(
            c: Context?,
            attrs: HTMLElement?,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(c!!, attrs!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            c: Context?,
            attrs: HTMLElement?
    ): T {
        val layoutParams = FrameLayout.LayoutParams(c!!, attrs!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            gravity: Int,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height, gravity)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            width: Number = WRAP_CONTENT,
            height: Number = WRAP_CONTENT,
            gravity: Int
    ): T {
        val layoutParams = FrameLayout.LayoutParams(width, height, gravity)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.LayoutParams?
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: ViewGroup.MarginLayoutParams?
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: FrameLayout.LayoutParams?,
            init: FrameLayout.LayoutParams.() -> Unit
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        layoutParams.init()
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

    inline fun <T: View> T.lparams(
            source: FrameLayout.LayoutParams?
    ): T {
        val layoutParams = FrameLayout.LayoutParams(source!!)
        this@lparams.setLayoutParams(layoutParams)
        return this
    }

}
