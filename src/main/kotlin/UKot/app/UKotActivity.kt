package UKot.app

import UKot.content.UKotContext
import UKot.content.UKotIntent
import UKot.res.UKotAnimation
import UKot.widget.UKotPanel
import UKot.widget.UKotUI
import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ScrollView
import org.jetbrains.anko.scrollView

/**
 * Created by uglyer on 2017/10/17.
 */
abstract class UKotActivity {
    lateinit var fakeContext: UKotContext
    var _dialogWindow: Dialog? = null
    var fakeIntent: UKotIntent? = null
        set(value) {
            field = value
//            activity.mWindow.setWindowAnimations(android.R.anim.activity_open_enter_ios, android.R.anim.activity_close_exit_ios,
//                    android.R.anim.activity_close_enter_ios, android.R.anim.activity_open_exit_ios)
//            activity.mWindow.setWindowAnimations(UKotAnimation.activity_open_enter_ios, UKotAnimation.activity_close_exit_ios,
//                    UKotAnimation.activity_close_enter_ios, UKotAnimation.activity_open_exit_ios)
//            activity.mWindow.setWindowAnimations(android.R.anim.activity_open_enter_ios, android.R.anim.activity_close_exit_ios,
//                    null, null)
//            activity.mWindow.setBackgroundColor(Color.TRANSPARENT)
            activity.mWindow.setWindowAnimations(android.R.anim.activity_open_enter, android.R.anim.activity_close_exit,
                    null, null)
            activity.mWindow.setDimAmount(0)
            activity.onFakeOnCreate { savedInstanceState: Bundle? -> onCreate(savedInstanceState) }
            activity.onFakeOnStart { onStart() }
            activity.onFakeOnReStart { OnReStart() }
            activity.onFakeResume { onResume() }
            activity.onFakePause { onPause() }
            activity.onFakeStop { onStop() }
            activity.onFakeDestroy { onDestroy() }
        }
    val intent: Intent
        get() = fakeIntent!!.intent!!
    val activity: Activity
        get() = fakeIntent!!.realActivity()
    val context: Context
        get() = activity.getApplicationContext()
    open val scroll = true
    var hasInitData = false

    var cacheView: View? = null
        get() {
            if (field == null) field = startRender()
            return field
        }

    open fun onCreate(savedInstanceState: Bundle?) {
        beforeRender()
        activity.setContentView(cacheView!!)
        initData()
        hasInitData = true
    }

    open fun onStart() {
//        activity.onStart()
//        Log.i("UKotActivity","onStart")
    }

    open fun OnReStart() {
//        activity.onRestart()
//        Log.i("UKotActivity","OnReStart")
    }

    open fun onResume() {
//        activity.onResume()
//        Log.i("UKotActivity","onResume")
    }

    open fun onPause() {
//        activity.onPause()
//        Log.i("UKotActivity","onPause")
    }

    open fun onStop() {
//        activity.onStop()
//        Log.i("UKotActivity","onStop")
    }

    open fun onDestroy() {
//        activity.onDestroy()
//        Log.i("UKotActivity","onDestroy")
    }


    fun startRender(): View {
        if (scroll) {
            return UKotUI {
                scrollView {
                    addView(render())
                }
            }.view
        } else {
            return render()
        }
    }


    fun start(activityClazz: () -> UKotActivity) {
        startActivity(UKotIntent(fakeContext, activityClazz))
    }

    fun startActivity(fakeIntent: UKotIntent) {
        fakeContext.startActivity(fakeIntent)
    }

    fun finish() {
        if (_dialogWindow != null) {
            _dialogWindow!!.dismiss()
        } else {
            activity.finish()
        }
    }

    fun initActivity(uKotActivity: UKotActivity): UKotActivity {
        if (uKotActivity.fakeIntent == null || uKotActivity.fakeContext == null) {
            uKotActivity.fakeContext = fakeContext
            UKotIntent(uKotActivity)
        }
        uKotActivity.fakeIntent!!.activity = activity
        return uKotActivity
    }

    fun startInDialog(activity: UKotActivity): AlertDialog {
        initActivity(activity)
        //val view = UKotPanel(activity.context)

        val dialog = AlertDialog.Builder(this.activity)
                .setView(activity.renderInChildView())
                .create()
        dialog.show()
        activity._dialogWindow = dialog
        return dialog
    }

    fun renderInChildView(): View {
        beforeRender()
        val v = cacheView!!
        if (!hasInitData) initData()
        onStart()
        onResume()
        hasInitData = true
//        return activity.getWindow().getDecorView()
        return v
    }

    abstract fun route(): String

    abstract fun render(): View

    open fun beforeRender() {
    }

    open fun initData() {
    }
}