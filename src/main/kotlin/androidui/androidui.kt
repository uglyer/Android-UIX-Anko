@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("androidui")

package androidui

import android.app.Application
import android.content.Intent
import android.view.View
import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external open abstract class AndroidUIElement : HTMLDivElement {
    open var AndroidUI: AndroidUI = definedExternally
    open fun createdCallback(): Unit = definedExternally
    open fun attachedCallback(): Unit = definedExternally
    open fun detachedCallback(): Unit = definedExternally
    open fun attributeChangedCallback(attributeName: String, oldVal: String, newVal: String): Unit = definedExternally
}

external open abstract class UKotNative {
    companion object {
        open fun initElement(element: Element): AndroidUI = definedExternally
    }
}

external open class AndroidUI(androidUIElement: AndroidUIElement) {
    interface UIClient {
        val shouldShowAppClosed: ((androidUI: AndroidUI) -> Any)? get() = definedExternally
    }

    open var androidUIElement: AndroidUIElement = definedExternally
    open var _canvas: Any = definedExternally
    open var windowManager: android.view.WindowManager = definedExternally
    open var mActivityThread: Any = definedExternally
    open var _viewRootImpl: Any = definedExternally
    open var mApplication: Application = definedExternally
    open var appName: String = definedExternally
    open var uiClient: Any = definedExternally
    open var viewsDependOnDebugLayout: Any = definedExternally
    open var showDebugLayoutDefault: Any = definedExternally
    open var _windowBound: Any = definedExternally
    open var tempRect: Any = definedExternally
    open var windowBound: android.graphics.Rect = definedExternally
    open var touchEvent: Any = definedExternally
    open var ketEvent: Any = definedExternally
    open fun init(): Unit = definedExternally
    open fun initApplication(): Unit = definedExternally
    open fun startLaunchActivity(intent: Intent): Unit = definedExternally
    open fun initLaunchActivity(): Unit = definedExternally
    open fun initGlobalCrashHandle(): Unit = definedExternally
    open fun refreshWindowBound(): Unit = definedExternally
    open fun initAndroidUIElement(): Unit = definedExternally
    open fun initEvent(): Unit = definedExternally
    open fun initTouchEvent(): Unit = definedExternally
    open fun initMouseEvent(): Unit = definedExternally
    open fun initKeyEvent(): Unit = definedExternally
    open fun initGenericEvent(): Unit = definedExternally
    open fun initRootSizeChange(): Unit = definedExternally
    open fun initBrowserVisibleChange(): Unit = definedExternally
    open fun notifyRootSizeChange(): Unit = definedExternally
    open fun viewAttachedDependOnDebugLayout(view: View): Unit = definedExternally
    open fun viewDetachedDependOnDebugLayout(view: View): Unit = definedExternally
    open fun setDebugEnable(enable: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun setShowDebugLayout(showDebugLayoutDefault: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun showDebugLayout(): Unit = definedExternally
    open fun hideDebugLayout(): Unit = definedExternally
    open fun setUIClient(uiClient: UIClient): Unit = definedExternally
    open fun showAppClosed(): Unit = definedExternally

    companion object {
        var BindToElementName: String = definedExternally
        fun showAppClosed(androidUI: Any): Unit = definedExternally
    }
}
