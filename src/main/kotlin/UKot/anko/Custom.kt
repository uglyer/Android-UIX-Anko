/*
 * Copyright 2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("unused")

package org.jetbrains.anko.custom

import UKot.anko.ViewManager
import UKot.widget.FakeView
import UKot.widget.UI
import UKot.context
import UKot.interfaces.FakeViewGroup
import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.internals.AnkoInternals


inline fun <T : View> ViewManager.ankoView(factory: (ctx: Context) -> T, theme: Int, init: T.() -> Unit): T {
//    val ctx = AnkoInternals.wrapContextIfNeeded(AnkoInternals.getContext(this), theme)
    val ctx = context()
    val view = factory(ctx)
    view.init()
    AnkoInternals.addView(ctx, view)
    return view
}

inline fun <T : View> UI.ankoView(factory: (ctx: Context) -> T, theme: Int, init: T.() -> Unit): T {
//    val ctx = AnkoInternals.wrapContextIfNeeded(AnkoInternals.getContext(this), theme)
    val ctx = context()
    val view = factory(ctx)
    view.init()
//    console.log(this)
    this.setView(view)
//    AnkoInternals.addView(ctx, view)
    return view
}

inline fun <T : View> ViewGroup.ankoView(factory: (ctx: Context) -> T, theme: Int, init: T.() -> Unit): T {
//    val ctx = AnkoInternals.wrapContextIfNeeded(AnkoInternals.getContext(this), theme)
    val ctx = context()
    val view = factory(ctx)
    view.init()
//    console.log(this)
    this.addView(view)
//    AnkoInternals.addView(ctx, view)
    return view
}

inline fun <T : View> FakeViewGroup.ankoFakeViewGroup(factory: (ctx: Context) -> T, theme: Int, init: T.() -> Unit): T {
    val ctx = context()
    val view = factory(ctx)
    view.init()
    this.addRealView(view)
    return view
}

inline fun <T : FakeView> ViewGroup.ankoFakeView(factory: (ctx: Context) -> T, theme: Int, init: T.() -> Unit): T {
//    val ctx = AnkoInternals.wrapContextIfNeeded(AnkoInternals.getContext(this), theme)
    val ctx = context()
    val fakeView = factory(ctx)
    fakeView.init()
//    console.log(this)
    this.addView(fakeView.view)
//    AnkoInternals.addView(ctx, view)
    return fakeView
}

inline fun <T : View> Context.ankoView(factory: (ctx: Context) -> T, theme: Int, init: T.() -> Unit): T {
    val ctx = AnkoInternals.wrapContextIfNeeded(this, theme)
    val view = factory(ctx)
    view.init()
    AnkoInternals.addView(this, view)
    return view
}

inline fun <T : View> Activity.ankoView(factory: (ctx: Context) -> T, theme: Int, init: T.() -> Unit): T {
    val ctx = AnkoInternals.wrapContextIfNeeded(this, theme)
    val view = factory(ctx)
    view.apply(init)
    AnkoInternals.addView(this, view)
    return view
}
//
//inline fun <reified T : View> ViewGroup.customView(theme: Int = 0, init: T.() -> Unit): T {
//    return ankoView({ ctx -> T(ctx) }, theme) { init() }
//}
//
//inline fun <reified T : View> Context.customView(theme: Int = 0, init: T.() -> Unit): T {
//    return ankoView({ ctx -> AnkoInternals.initiateView(ctx, T::class.java) }, theme) { init() }
//}
//
//inline fun <reified T : View> Activity.customView(theme: Int = 0, init: T.() -> Unit): T {
//    return ankoView({ ctx -> AnkoInternals.initiateView(ctx, T::class.java) }, theme) { init() }
//}