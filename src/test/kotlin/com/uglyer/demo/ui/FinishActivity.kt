package com.uglyer.demo.ui

import UKot.app.UKotActivity
import UKot.centerInParent
import UKot.content.UKotIntent
import UKot.dip
import UKot.onClick
import UKot.widget.UKotUI
import android.view.View
import org.jetbrains.anko.button
import org.jetbrains.anko.relativeLayout
import org.jetbrains.anko.textView

/**
 * des
 * @Date: Created by uglyer in 2018/8/30.
 */

class FinishActivity : UKotActivity() {
    companion object {
        val ROUTE = "com.uglyer.demo.ui.FinishActivity"
    }

    override val scroll: Boolean = false
    override fun route(): String = ROUTE

    override fun render(): View = UKotUI {
        relativeLayout {
            button("close") {
                onClick {
                    finish()
                }
                setTextSize(dip(10))
            }.lparams { centerInParent() }
        }
    }.view
}
