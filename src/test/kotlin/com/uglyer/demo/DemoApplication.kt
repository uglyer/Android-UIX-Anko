package com.uglyer.demo

import UKot.content.UKotContext
import com.uglyer.demo.ui.MainActivity
import com.uglyer.demo.ui.ChildActivity
import org.w3c.dom.Element
import kotlin.browser.document

class DemoApplication(rootDom: Element) : UKotContext(rootDom) {
    init {
        context.appColor = R.color
        route.add(MainActivity.ROUTE, ::MainActivity)
//        route.add(ChildActivity.ROUTE, ::ChildActivity)
    }
}

fun main(args: Array<String>) {
    DemoApplication(document.getElementById("UKot") as Element).run()
//    GLView().run()
}