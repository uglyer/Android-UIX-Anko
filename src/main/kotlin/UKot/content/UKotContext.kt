package UKot.content

import UKot.app.UKotActivity
import UKot.support.native.JSCall
import android.content.Context
import android.view.ViewGroup
import androidui.AndroidUI
import androidui.UKotNative
import org.w3c.dom.Element
import kotlin.browser.document
import kotlin.browser.window

/**
 * Created by uglyer on 2017/10/17.
 */
open class UKotContext {
    var rootDom: Element
    var app: AndroidUI
    val context: Context
        get() = app.mApplication

    constructor(rootDom: Element) {
        this.rootDom = rootDom
        initJS()
        app = UKotNative.initElement(rootDom)
        AUI = app
    }

    companion object {
        lateinit var AUI: AndroidUI
    }

    val width: Int
        get() = rootDom.scrollWidth
    val height: Int
        get() = rootDom.scrollWidth

    private val fakeActivityList: MutableList<UKotActivity> = ArrayList()
    val route = Route()

    init {

    }

    fun run() {
        val activity = route.get(Route.MAIN)
        if (activity == null) {
            throw Exception("undefined Route.MAIN")
        }
        val fakeIntent = UKotIntent(this, activity)
        fakeActivityList.add(fakeIntent.fakeActivity)
//        fakeIntent.realActivity().setContentView(fakeIntent.fakeActivity.cacheView!!)
        app.startLaunchActivity(fakeIntent.intent!!)
//        android.os.MessageQueue.requestNextLoop()
//        window.setInterval({
//            android.os.MessageQueue.loop()
//        },1000/60)
    }

    fun startActivity(fakeIntent: UKotIntent) {
        //startActivity的时候会把intent.activity清除
//        fakeIntent.realActivity().setContentView(fakeIntent.fakeActivity.cacheView!!)
        //从最后一个fakeActivity中得 fakeIntent=>realActivity=>startActivity(intent.realIntent)
        fakeActivityList.last().activity.startActivity(fakeIntent.intent!!)
        fakeActivityList.add(fakeIntent.fakeActivity)
    }

//    fun renderInChildView(childView: ViewGroup, intent: UKotIntent) {
//        childView.removeAllViews()
//        childView.addView(intent.fakeActivity.cacheView!!)
//    }

    fun createActivity(factory: () -> UKotActivity): UKotActivity {
        return factory()
    }

    fun initJS() {
        val script = document.createElement("script")
        script.innerHTML = JSCall.getNativeJS()
        this.rootDom.appendChild(script)
    }
}