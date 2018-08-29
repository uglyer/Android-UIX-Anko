package com.uglyer.demo.ui

import UKot.app.UKotActivity
import UKot.content.Route
import UKot.dip
import UKot.matchParent
import UKot.setBackgroundColor
import UKot.widget.UKotPanel
import UKot.widget.UKotUI
import UKot.widget.panel
import UKot.widget.tabbar.UKotTabBar
import UKot.widget.tabbar.item
import UKot.widget.tabbar.tabBar
import android.view.View
import org.jetbrains.anko.verticalLayout

/**
 * des
 * @Date: Created by uglyer in 2018/8/30.
 */
class MainActivity : UKotActivity() {
    companion object {
        val ROUTE = Route.MAIN
    }

    override val scroll: Boolean = false
    override fun route(): String = ROUTE

    override fun render(): View = UKotUI {
        verticalLayout {
            panelView = panel {}.lparams(matchParent, matchParent) {
                setBackgroundColor(R.color.colorDefaultBG)
                weight = 1
            }

            tabBar = tabBar {
                item("TAB1", R.drawable.icon_tabbar) {
                    onClick { panelView.renderHere(childActivity1) }
                }
                item("TAB2", R.drawable.icon_tabbar) {
                    onClick { panelView.renderHere(childActivity2) }
                }
                item("TAB3", R.drawable.icon_tabbar) {
                    onClick { panelView.renderHere(childActivity3) }
                }
            }.lparams(matchParent, dip(53))
        }
    }.view

    lateinit var panelView: UKotPanel
    lateinit var tabBar: UKotTabBar
    lateinit var childActivity1: UKotActivity
    lateinit var childActivity2: UKotActivity
    lateinit var childActivity3: UKotActivity

    override fun beforeRender() {
        childActivity1 = initActivity(NextActivity())
        childActivity2 = initActivity(ChildActivity("TAB 2"))
        childActivity3 = initActivity(ChildActivity("TAB 3"))
    }

    override fun initData() {
        tabBar.selected(0)
    }
}