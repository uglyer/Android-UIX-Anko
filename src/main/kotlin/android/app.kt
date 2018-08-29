@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.app")

package android.app

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.view.*
import android.view.animation.Animation
import android.widget.*
import org.w3c.dom.HTMLElement
import java.lang.Runnable
import kotlin.js.*
//import kotlin.js.Json
//import org.khronos.webgl.*
//import org.w3c.dom.*
//import org.w3c.dom.events.*
//import org.w3c.dom.parsing.*
//import org.w3c.dom.svg.*
//import org.w3c.dom.url.*
//import org.w3c.fetch.*
//import org.w3c.files.*
//import org.w3c.notifications.*
//import org.w3c.performance.*
//import org.w3c.workers.*
//import org.w3c.xhr.*

external open class ActivityThread(androidUI: androidui.AndroidUI) {
    open var androidUI: androidui.AndroidUI = definedExternally
    open var mLaunchedActivities: Set<Activity> = definedExternally
    open var overrideExitAnimation: Animation = definedExternally
    open var overrideEnterAnimation: Animation = definedExternally
    open var overrideResumeAnimation: Animation = definedExternally
    open var overrideHideAnimation: Animation = definedExternally
    open fun initWithPageStack(): Unit = definedExternally
    open fun overrideNextWindowAnimation(enterAnimation: Animation, exitAnimation: Animation, resumeAnimation: Animation, hideAnimation: Animation): Unit = definedExternally
    open fun getOverrideEnterAnimation(): Animation = definedExternally
    open fun getOverrideExitAnimation(): Animation = definedExternally
    open fun getOverrideResumeAnimation(): Animation = definedExternally
    open fun getOverrideHideAnimation(): Animation = definedExternally
    open var scheduleApplicationHideTimeout: Any = definedExternally
    open fun scheduleApplicationHide(): Unit = definedExternally
    open fun scheduleApplicationShow(): Unit = definedExternally
    open fun execStartActivity(callActivity: Activity, intent: Intent, options: android.os.Bundle? = definedExternally /* null */): Unit = definedExternally
    open var activityResumeTimeout: Any = definedExternally
    open fun scheduleActivityResume(): Unit = definedExternally
    open fun scheduleLaunchActivity(callActivity: Activity, intent: Intent, options: android.os.Bundle? = definedExternally /* null */): Unit = definedExternally
    open fun scheduleDestroyActivityByRequestCode(requestCode: Number): Unit = definedExternally
    open fun scheduleDestroyActivity(activity: Activity, finishing: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun scheduleBackTo(intent: Intent): Boolean = definedExternally
    open fun canBackTo(intent: Intent): Boolean = definedExternally
    open fun scheduleBackToRoot(): Unit = definedExternally
    open fun handlePauseActivity(activity: Any): Unit = definedExternally
    open fun performPauseActivity(activity: Any): Unit = definedExternally
    open fun handleStopActivity(activity: Any, show: Any? = definedExternally /* null */): Unit = definedExternally
    open fun performStopActivity(activity: Any, saveState: Any): Unit = definedExternally
    open fun handleResumeActivity(a: Any, launching: Any): Unit = definedExternally
    open fun performResumeActivity(a: Any, launching: Any): Unit = definedExternally
    open fun handleLaunchActivity(intent: Any): Unit = definedExternally
    open fun performLaunchActivity(intent: Any): Unit = definedExternally
    open fun handleDestroyActivity(activity: Any, finishing: Any): Unit = definedExternally
    open fun performDestroyActivity(activity: Any, finishing: Any): Unit = definedExternally
    open fun updateVisibility(activity: Any, show: Any): Unit = definedExternally
    open fun getVisibleToUserActivities(): Unit = definedExternally
    open fun isRootActivity(activity: Any): Unit = definedExternally

    companion object {
        fun getActivityName(activity: Any): Unit = definedExternally
    }
}

external open class Activity(androidUI: androidui.AndroidUI) : Context, Window.Callback, KeyEvent.Callback {
    open var mCallActivity: Any = definedExternally
    open var mIntent: Any = definedExternally
    open var mCalled: Any = definedExternally
    open var mResumed: Any = definedExternally
    open var mStopped: Any = definedExternally
    open var mFinished: Any = definedExternally
    open var mStartedActivity: Any = definedExternally
    open var mDestroyed: Any = definedExternally
    open var mWindow: Window = definedExternally
    open var mWindowAdded: Any = definedExternally
    open var mVisibleFromClient: Any = definedExternally
    open var mResultCode: Any = definedExternally
    open var mResultData: Any = definedExternally
    open var mMenu: Any = definedExternally
    open var mMenuPopuoHelper: Any = definedExternally
    open fun onFakeOnCreate(foo: (savedInstanceState: Bundle?) -> Unit): Unit;
    open fun onFakeOnStart(foo: () -> Unit): Unit;
    open fun onFakeOnReStart(foo: () -> Unit): Unit;
    open fun onFakeResume(foo: () -> Unit): Unit;
    open fun onFakePause(foo: () -> Unit): Unit;
    open fun onFakeStop(foo: () -> Unit): Unit;
    open fun onFakeDestroy(foo: () -> Unit): Unit;
    open fun getIntent(): Intent = definedExternally
    open fun setIntent(newIntent: Intent): Unit = definedExternally
    open fun getApplication(): android.app.Application = definedExternally
    override fun getWindowManager(): android.view.WindowManager = definedExternally
    open fun getGlobalWindowManager(): android.view.WindowManager = definedExternally
    open fun getWindow(): Window = definedExternally
    open fun getCurrentFocus(): View = definedExternally
    open fun onCreate(savedInstanceState: Bundle? = definedExternally /* null */): Unit = definedExternally
    open fun performRestoreInstanceState(savedInstanceState: Bundle): Unit = definedExternally
    open fun onRestoreInstanceState(savedInstanceState: Bundle): Unit = definedExternally
    open fun onPostCreate(savedInstanceState: Bundle): Unit = definedExternally
    open fun onStart(): Unit = definedExternally
    open fun onRestart(): Unit = definedExternally
    open fun onResume(): Unit = definedExternally
    open fun onPostResume(): Unit = definedExternally
    open fun onNewIntent(intent: Intent): Unit = definedExternally
    open fun performSaveInstanceState(outState: Bundle): Unit = definedExternally
    open fun onSaveInstanceState(outState: Bundle): Unit = definedExternally
    open fun onPause(): Unit = definedExternally
    open fun onUserLeaveHint(): Unit = definedExternally
    open fun onStop(): Unit = definedExternally
    open fun onDestroy(): Unit = definedExternally
    open fun findViewById(id: String): View = definedExternally
    open fun setContentView(view: View, params: ViewGroup.LayoutParams? = definedExternally /* null */): Unit = definedExternally
    open fun setContentView(view: HTMLElement, params: ViewGroup.LayoutParams? = definedExternally /* null */): Unit = definedExternally
    open fun setContentView(view: String, params: ViewGroup.LayoutParams? = definedExternally /* null */): Unit = definedExternally
    open fun addContentView(view: View, params: ViewGroup.LayoutParams): Unit = definedExternally
    open fun setFinishOnTouchOutside(finish: Boolean): Unit = definedExternally
    override fun onKeyDown(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    override fun onKeyLongPress(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    override fun onKeyUp(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    open fun onBackPressed(): Unit = definedExternally
    open fun onTouchEvent(event: MotionEvent): Boolean = definedExternally
    open fun onGenericMotionEvent(event: MotionEvent): Boolean = definedExternally
    open fun onUserInteraction(): Unit = definedExternally
    override fun onWindowAttributesChanged(params: WindowManager.LayoutParams): Unit = definedExternally
    override fun onContentChanged(): Unit = definedExternally
    override fun onWindowFocusChanged(hasFocus: Boolean): Unit = definedExternally
    override fun onAttachedToWindow(): Unit = definedExternally
    override fun onDetachedFromWindow(): Unit = definedExternally
    open fun hasWindowFocus(): Boolean = definedExternally
    override fun dispatchKeyEvent(event: KeyEvent): Boolean = definedExternally
    override fun dispatchTouchEvent(ev: MotionEvent): Boolean = definedExternally
    override fun dispatchGenericMotionEvent(ev: MotionEvent): Boolean = definedExternally
    open fun takeKeyEvents(_get: Boolean): Unit = definedExternally
    open fun invalidateOptionsMenu(): Unit = definedExternally
    open fun invalidateOptionsMenuPopupHelper(menu: android.view.Menu): android.view.menu.MenuPopupHelper = definedExternally
    open fun onCreateOptionsMenu(menu: android.view.Menu): Boolean = definedExternally
    open fun onPrepareOptionsMenu(menu: android.view.Menu): Boolean = definedExternally
    open fun onOptionsItemSelected(item: android.view.MenuItem): Boolean = definedExternally
    open fun onOptionsMenuClosed(menu: android.view.Menu): Unit = definedExternally
    open fun openOptionsMenu(): Unit = definedExternally
    open fun closeOptionsMenu(): Unit = definedExternally
    open fun startActivityForResult(intent: Intent, requestCode: Number, options: Bundle? = definedExternally /* null */): Unit = definedExternally
    open fun startActivityForResult(intent: String, requestCode: Number, options: Bundle? = definedExternally /* null */): Unit = definedExternally
    open fun startActivities(intents: Array<Intent>, options: Bundle? = definedExternally /* null */): Unit = definedExternally
    //open fun startActivity(intent: Intent): Unit = definedExternally
    open fun startActivity(intent: Intent, options: Bundle? = definedExternally /* null */): Unit = definedExternally
    open fun startActivity(intent: String, options: Bundle? = definedExternally /* null */): Unit = definedExternally
    open fun startActivityIfNeeded(intent: Intent, requestCode: Number, options: Bundle? = definedExternally /* null */): Boolean = definedExternally
    open fun overrideNextTransition(enterAnimation: Animation, exitAnimation: Animation, resumeAnimation: Animation, hideAnimation: Animation): Unit = definedExternally
    open fun setResult(resultCode: Number, data: Intent? = definedExternally /* null */): Unit = definedExternally
    open fun getCallingActivity(): String = definedExternally
    open fun setVisible(visible: Boolean): Unit = definedExternally
    open fun makeVisible(): Unit = definedExternally
    open fun isFinishing(): Boolean = definedExternally
    open fun isDestroyed(): Boolean = definedExternally
    open fun finish(): Unit = definedExternally
    open fun finishActivity(requestCode: Number): Unit = definedExternally
    open fun onActivityResult(requestCode: Number, resultCode: Number, data: Intent): Unit = definedExternally
    open fun setTitle(title: String): Unit = definedExternally
    open fun getTitle(): String = definedExternally
    open fun onTitleChanged(title: String): Unit = definedExternally
    open fun onTitleChanged(title: String, color: Number? = definedExternally /* null */): Unit = definedExternally
    open fun runOnUiThread(action: Runnable): Unit = definedExternally
    open fun navigateUpTo(upIntent: Intent, upToRootIfNotFound: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun performCreate(icicle: Any): Unit = definedExternally
    open fun performStart(): Unit = definedExternally
    open fun performRestart(): Unit = definedExternally
    open fun performResume(): Unit = definedExternally
    open fun performPause(): Unit = definedExternally
    open fun performUserLeaving(): Unit = definedExternally
    open fun performStop(): Unit = definedExternally
    open fun performDestroy(): Unit = definedExternally
    open fun isResumed(): Boolean = definedExternally
    open fun dispatchActivityResult(who: String, requestCode: Number, resultCode: Number, data: Intent): Unit = definedExternally

    companion object {
        var TAG: Any = definedExternally
        var DEBUG_LIFECYCLE: Any = definedExternally
        var RESULT_CANCELED: Number = definedExternally
        var RESULT_OK: Number = definedExternally
        var RESULT_FIRST_USER: Number = definedExternally
    }
}

external open class Application : Context {
    interface ActivityLifecycleCallbacks {
        fun onActivityCreated(activity: Activity, savedInstanceState: Bundle)
        fun onActivityStarted(activity: Activity)
        fun onActivityResumed(activity: Activity)
        fun onActivityPaused(activity: Activity)
        fun onActivityStopped(activity: Activity)
        fun onActivitySaveInstanceState(activity: Activity, outState: Bundle)
        fun onActivityDestroyed(activity: Activity)
    }

    open var mActivityLifecycleCallbacks: Any = definedExternally
    open var mWindowManager: Any = definedExternally
    open fun onCreate(): Unit = definedExternally
    override fun getWindowManager(): android.view.WindowManager = definedExternally
    open fun registerActivityLifecycleCallbacks(callback: Application.ActivityLifecycleCallbacks): Unit = definedExternally
    open fun unregisterActivityLifecycleCallbacks(callback: Application.ActivityLifecycleCallbacks): Unit = definedExternally
    open fun dispatchActivityCreated(activity: Activity, savedInstanceState: Bundle): Unit = definedExternally
    open fun dispatchActivityStarted(activity: Activity): Unit = definedExternally
    open fun dispatchActivityResumed(activity: Activity): Unit = definedExternally
    open fun dispatchActivityPaused(activity: Activity): Unit = definedExternally
    open fun dispatchActivityStopped(activity: Activity): Unit = definedExternally
    open fun dispatchActivitySaveInstanceState(activity: Activity, outState: Bundle): Unit = definedExternally
    open fun dispatchActivityDestroyed(activity: Activity): Unit = definedExternally
    open fun collectActivityLifecycleCallbacks(): Unit = definedExternally
}

external open class Dialog(context: Context, cancelable: Boolean? = definedExternally /* null */, cancelListener: DialogInterface.OnCancelListener? = definedExternally /* null */) : DialogInterface, Window.Callback, KeyEvent.Callback {
    open class ListenersHandler(dialog: Dialog) : Handler {
        open var mDialog: Any = definedExternally
        override fun handleMessage(msg: Message): Unit = definedExternally
    }

    open var mContext: Context = definedExternally
    open var mWindowManager: WindowManager = definedExternally
    open var mWindow: Window = definedExternally
    open var mDecor: View = definedExternally
    open var mCancelable: Boolean = definedExternally
    open var mCancelAndDismissTaken: Any = definedExternally
    open var mCancelMessage: Any = definedExternally
    open var mDismissMessage: Any = definedExternally
    open var mShowMessage: Any = definedExternally
    open var mOnKeyListener: Any = definedExternally
    open var mCreated: Any = definedExternally
    open var mShowing: Any = definedExternally
    open var mCanceled: Any = definedExternally
    open var mHandler: Any = definedExternally
    open var mListenersHandler: Any = definedExternally
    open var mDismissAction: Any = definedExternally
    open fun getContext(): Context = definedExternally
    open fun isShowing(): Boolean = definedExternally
    open fun show(): Unit = definedExternally
    open fun hide(): Unit = definedExternally
    override fun dismiss(): Unit = definedExternally
    open fun dismissDialog(): Unit = definedExternally
    open fun sendDismissMessage(): Unit = definedExternally
    open fun sendShowMessage(): Unit = definedExternally
    open fun dispatchOnCreate(savedInstanceState: Bundle): Unit = definedExternally
    open fun onCreate(savedInstanceState: Bundle): Unit = definedExternally
    open fun onStart(): Unit = definedExternally
    open fun onStop(): Unit = definedExternally
    open fun getWindow(): Window = definedExternally
    open fun getCurrentFocus(): View = definedExternally
    open fun findViewById(id: String): View = definedExternally
    open fun setContentView(view: View, params: ViewGroup.LayoutParams? = definedExternally /* null */): Unit = definedExternally
    open fun addContentView(view: View, params: ViewGroup.LayoutParams): Unit = definedExternally
    open fun setTitle(title: String): Unit = definedExternally
    override fun onKeyDown(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    override fun onKeyLongPress(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    override fun onKeyUp(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    open fun onKeyMultiple(keyCode: Number, repeatCount: Number, event: KeyEvent): Boolean = definedExternally
    open fun onBackPressed(): Unit = definedExternally
    open fun onTouchEvent(event: MotionEvent): Boolean = definedExternally
    open fun onTrackballEvent(event: MotionEvent): Boolean = definedExternally
    open fun onGenericMotionEvent(event: MotionEvent): Boolean = definedExternally
    override fun onWindowAttributesChanged(params: WindowManager.LayoutParams): Unit = definedExternally
    override fun onContentChanged(): Unit = definedExternally
    override fun onWindowFocusChanged(hasFocus: Boolean): Unit = definedExternally
    override fun onAttachedToWindow(): Unit = definedExternally
    override fun onDetachedFromWindow(): Unit = definedExternally
    override fun dispatchKeyEvent(event: KeyEvent): Boolean = definedExternally
    override fun dispatchTouchEvent(ev: MotionEvent): Boolean = definedExternally
    override fun dispatchGenericMotionEvent(ev: MotionEvent): Boolean = definedExternally
    open fun takeKeyEvents(get: Boolean): Unit = definedExternally
    open fun getLayoutInflater(): LayoutInflater = definedExternally
    open fun setCancelable(flag: Boolean): Unit = definedExternally
    open fun setCanceledOnTouchOutside(cancel: Boolean): Unit = definedExternally
    override fun cancel(): Unit = definedExternally
    open fun setOnCancelListener(listener: DialogInterface.OnCancelListener): Unit = definedExternally
    open fun setCancelMessage(msg: Message): Unit = definedExternally
    open fun setOnDismissListener(listener: DialogInterface.OnDismissListener): Unit = definedExternally
    open fun setOnShowListener(listener: DialogInterface.OnShowListener): Unit = definedExternally
    open fun setDismissMessage(msg: Message): Unit = definedExternally
    open fun takeCancelAndDismissListeners(msg: String, cancel: DialogInterface.OnCancelListener, dismiss: DialogInterface.OnDismissListener): Boolean = definedExternally
    open fun setOnKeyListener(onKeyListener: DialogInterface.OnKeyListener): Unit = definedExternally

    companion object {
        var TAG: Any = definedExternally
        var DISMISS: Any = definedExternally
        var CANCEL: Any = definedExternally
        var SHOW: Any = definedExternally
        var DIALOG_SHOWING_TAG: Any = definedExternally
        var DIALOG_HIERARCHY_TAG: Any = definedExternally
    }
}

external open class AlertController(context: Context, di: DialogInterface, window: Window) {

    open class ButtonHandler(dialog: DialogInterface) : Handler {
        open var mDialog: Any = definedExternally
        override fun handleMessage(msg: Message): Unit = definedExternally

        companion object {
            var MSG_DISMISS_DIALOG: Any = definedExternally
        }
    }

    open class RecycleListView(context: Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Map<String, String>? = definedExternally /* null */) : ListView {
        open var mRecycleOnMeasure: Boolean = definedExternally
        override fun recycleOnMeasure(): Boolean = definedExternally
    }

    open class AlertParams(context: Context) {
        interface OnPrepareListViewListener {
            fun onPrepareListView(listView: ListView)
        }

        open var mContext: Context = definedExternally
        open var mInflater: LayoutInflater = definedExternally
        open var mIconId: Number = definedExternally
        open var mIcon: Drawable = definedExternally
        open var mTitle: String = definedExternally
        open var mCustomTitleView: View = definedExternally
        open var mMessage: String = definedExternally
        open var mPositiveButtonText: String = definedExternally
        open var mPositiveButtonListener: DialogInterface.OnClickListener = definedExternally
        open var mNegativeButtonText: String = definedExternally
        open var mNegativeButtonListener: DialogInterface.OnClickListener = definedExternally
        open var mNeutralButtonText: String = definedExternally
        open var mNeutralButtonListener: DialogInterface.OnClickListener = definedExternally
        open var mCancelable: Boolean = definedExternally
        open var mOnCancelListener: DialogInterface.OnCancelListener = definedExternally
        open var mOnDismissListener: DialogInterface.OnDismissListener = definedExternally
        open var mOnKeyListener: DialogInterface.OnKeyListener = definedExternally
        open var mItems: Array<String> = definedExternally
        open var mAdapter: ListAdapter = definedExternally
        open var mOnClickListener: DialogInterface.OnClickListener = definedExternally
        open var mView: View = definedExternally
        open var mViewSpacingLeft: Number = definedExternally
        open var mViewSpacingTop: Number = definedExternally
        open var mViewSpacingRight: Number = definedExternally
        open var mViewSpacingBottom: Number = definedExternally
        open var mViewSpacingSpecified: Boolean = definedExternally
        open var mCheckedItems: Array<Boolean> = definedExternally
        open var mIsMultiChoice: Boolean = definedExternally
        open var mIsSingleChoice: Boolean = definedExternally
        open var mCheckedItem: Number = definedExternally
        open var mOnCheckboxClickListener: DialogInterface.OnMultiChoiceClickListener = definedExternally
        open var mLabelColumn: String = definedExternally
        open var mIsCheckedColumn: String = definedExternally
        open var mForceInverseBackground: Boolean = definedExternally
        open var mOnItemSelectedListener: AdapterView.OnItemSelectedListener = definedExternally
        open var mOnPrepareListViewListener: AlertParams.OnPrepareListViewListener = definedExternally
        open var mRecycleOnMeasure: Boolean = definedExternally
        open fun apply(dialog: AlertController): Unit = definedExternally
        open fun createListView(dialog: Any): Unit = definedExternally
    }

    open var mContext: Any = definedExternally
    open var mDialogInterface: Any = definedExternally
    open var mWindow: Any = definedExternally
    open var mTitle: Any = definedExternally
    open var mMessage: Any = definedExternally
    open var mListView: Any = definedExternally
    open var mView: Any = definedExternally
    open var mViewSpacingLeft: Any = definedExternally
    open var mViewSpacingTop: Any = definedExternally
    open var mViewSpacingRight: Any = definedExternally
    open var mViewSpacingBottom: Any = definedExternally
    open var mViewSpacingSpecified: Any = definedExternally
    open var mButtonPositive: Any = definedExternally
    open var mButtonPositiveText: Any = definedExternally
    open var mButtonPositiveMessage: Any = definedExternally
    open var mButtonNegative: Any = definedExternally
    open var mButtonNegativeText: Any = definedExternally
    open var mButtonNegativeMessage: Any = definedExternally
    open var mButtonNeutral: Any = definedExternally
    open var mButtonNeutralText: Any = definedExternally
    open var mButtonNeutralMessage: Any = definedExternally
    open var mScrollView: Any = definedExternally
    open var mIcon: Any = definedExternally
    open var mIconView: Any = definedExternally
    open var mTitleView: Any = definedExternally
    open var mMessageView: Any = definedExternally
    open var mCustomTitleView: Any = definedExternally
    open var mForceInverseBackground: Any = definedExternally
    open var mAdapter: Any = definedExternally
    open var mCheckedItem: Any = definedExternally
    open var mAlertDialogLayout: Any = definedExternally
    open var mListLayout: Any = definedExternally
    open var mMultiChoiceItemLayout: Any = definedExternally
    open var mSingleChoiceItemLayout: Any = definedExternally
    open var mListItemLayout: Any = definedExternally
    open var mHandler: Any = definedExternally
    open var mButtonHandler: View.OnClickListener = definedExternally
    open fun installContent(): Unit = definedExternally
    open fun setTitle(title: String): Unit = definedExternally
    open fun setCustomTitle(customTitleView: View): Unit = definedExternally
    open fun setMessage(message: String): Unit = definedExternally
    open fun setView(view: View, viewSpacingLeft: Number? = definedExternally /* null */, viewSpacingTop: Number? = definedExternally /* null */, viewSpacingRight: Number? = definedExternally /* null */, viewSpacingBottom: Number? = definedExternally /* null */): Unit = definedExternally
    open fun setButton(whichButton: Number, text: String, listener: DialogInterface.OnClickListener, msg: Message): Unit = definedExternally
    open fun setIcon(icon: Drawable): Unit = definedExternally
    open fun setInverseBackgroundForced(forceInverseBackground: Boolean): Unit = definedExternally
    open fun getListView(): ListView = definedExternally
    open fun getButton(whichButton: Number): Button = definedExternally
    open fun onKeyDown(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    open fun onKeyUp(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    open fun setupView(): Unit = definedExternally
    open fun setupTitle(topPanel: Any): Unit = definedExternally
    open fun setupContent(contentPanel: Any): Unit = definedExternally
    open fun setupButtons(): Unit = definedExternally
    open fun centerButton(button: Any): Unit = definedExternally
    open fun setBackground(topPanel: Any, contentPanel: Any, customPanel: Any, hasButtons: Any, hasTitle: Any, buttonPanel: Any): Unit = definedExternally

    companion object {
        fun shouldCenterSingleButton(context: Any): Unit = definedExternally
    }
}

external open class AlertDialog(context: Context, cancelable: Boolean? = definedExternally /* null */, cancelListener: DialogInterface.OnCancelListener? = definedExternally /* null */) : Dialog, DialogInterface {
    open class Builder(context: Context) {
        open var P: Any = definedExternally
        open fun getContext(): Context = definedExternally
        open fun setTitle(title: String): Builder = definedExternally
        open fun setCustomTitle(customTitleView: View): Builder = definedExternally
        open fun setMessage(message: String): Builder = definedExternally
        open fun setIcon(icon: Drawable): Builder = definedExternally
        open fun setPositiveButton(text: String, listener: DialogInterface.OnClickListener): Builder = definedExternally
        open fun setNegativeButton(text: String, listener: DialogInterface.OnClickListener): Builder = definedExternally
        open fun setNeutralButton(text: String, listener: DialogInterface.OnClickListener): Builder = definedExternally
        open fun setCancelable(cancelable: Boolean): Builder = definedExternally
        open fun setOnCancelListener(onCancelListener: DialogInterface.OnCancelListener): Builder = definedExternally
        open fun setOnDismissListener(onDismissListener: DialogInterface.OnDismissListener): Builder = definedExternally
        open fun setOnKeyListener(onKeyListener: DialogInterface.OnKeyListener): Builder = definedExternally
        open fun setItems(items: Array<String>, listener: DialogInterface.OnClickListener): Builder = definedExternally
        open fun setAdapter(adapter: ListAdapter, listener: DialogInterface.OnClickListener): Builder = definedExternally
        open fun setMultiChoiceItems(items: Array<String>, checkedItems: Array<Boolean>, listener: DialogInterface.OnMultiChoiceClickListener): Builder = definedExternally
        open fun setSingleChoiceItems(items: Array<String>, checkedItem: Number, listener: DialogInterface.OnClickListener): Builder = definedExternally
        open fun setSingleChoiceItemsWithAdapter(adapter: ListAdapter, checkedItem: Number, listener: DialogInterface.OnClickListener): Builder = definedExternally
        open fun setOnItemSelectedListener(listener: AdapterView.OnItemSelectedListener): Builder = definedExternally
        open fun setView(view: View, viewSpacingLeft: Number? = definedExternally /* null */, viewSpacingTop: Number? = definedExternally /* null */, viewSpacingRight: Number? = definedExternally /* null */, viewSpacingBottom: Number? = definedExternally /* null */): Builder = definedExternally
        open fun setInverseBackgroundForced(useInverseBackground: Boolean): Builder = definedExternally
        open fun setRecycleOnMeasureEnabled(enabled: Boolean): Builder = definedExternally
        open fun create(): AlertDialog = definedExternally
        open fun show(): AlertDialog = definedExternally
    }

    open var mAlert: Any = definedExternally
    open fun getButton(whichButton: Number): Button = definedExternally
    open fun getListView(): ListView = definedExternally
    override fun setTitle(title: String): Unit = definedExternally
    open fun setCustomTitle(customTitleView: View): Unit = definedExternally
    open fun setMessage(message: String): Unit = definedExternally
    open fun setView(view: View, viewSpacingLeft: Number? = definedExternally /* null */, viewSpacingTop: Number? = definedExternally /* null */, viewSpacingRight: Number? = definedExternally /* null */, viewSpacingBottom: Number? = definedExternally /* null */): Unit = definedExternally
    open fun setButton(whichButton: Number, text: String, listener: DialogInterface.OnClickListener): Unit = definedExternally
    open fun setIcon(icon: Drawable): Unit = definedExternally
    override fun onCreate(savedInstanceState: Bundle): Unit = definedExternally
    override fun onKeyDown(keyCode: Number, event: KeyEvent): Boolean = definedExternally
    override fun onKeyUp(keyCode: Number, event: KeyEvent): Boolean = definedExternally

    companion object {
        var THEME_TRADITIONAL: Number = definedExternally
        var THEME_HOLO_DARK: Number = definedExternally
        var THEME_HOLO_LIGHT: Number = definedExternally
        var THEME_DEVICE_DEFAULT_DARK: Number = definedExternally
        var THEME_DEVICE_DEFAULT_LIGHT: Number = definedExternally
    }
}

external open class ActionBar(context: android.content.Context, bindElement: HTMLElement? = definedExternally /* null */, defStyle: Any? = definedExternally /* null */) : FrameLayout {
    open var mCenterLayout: Any = definedExternally
    open var mCustomView: Any = definedExternally
    open var mTitleView: Any = definedExternally
    open var mSubTitleView: Any = definedExternally
    open var mActionLeft: Any = definedExternally
    open var mActionRight: Any = definedExternally
    open fun setCustomView(view: View, layoutParams: ViewGroup.MarginLayoutParams? = definedExternally /* null */): Unit = definedExternally
    open fun setIcon(icon: Drawable): Unit = definedExternally
    open fun setLogo(logo: Drawable): Unit = definedExternally
    open fun setTitle(title: String): Unit = definedExternally
    open fun setSubtitle(subtitle: String): Unit = definedExternally
    open fun getCustomView(): View = definedExternally
    open fun getTitle(): String = definedExternally
    open fun getSubtitle(): String = definedExternally
    open fun show(): Unit = definedExternally
    open fun hide(): Unit = definedExternally
    open fun isShowing(): Boolean = definedExternally
    open fun setActionLeft(name: String, icon: Drawable, listener: View.OnClickListener): Unit = definedExternally
    open fun hideActionLeft(): Unit = definedExternally
    open fun setActionRight(name: String, icon: Drawable, listener: View.OnClickListener): Unit = definedExternally
    open fun hideActionRight(): Unit = definedExternally
}

external open class ActionBarActivity : Activity {
    open var mActionBar: Any = definedExternally
    override fun onCreate(savedInstanceState: android.os.Bundle?): Unit = definedExternally
    open fun initActionBar(): Unit = definedExternally
    open fun initDefaultBackFinish(): Unit = definedExternally
    open fun setActionBar(actionBar: ActionBar): Unit = definedExternally
    override fun invalidateOptionsMenuPopupHelper(menu: android.view.Menu): android.view.menu.MenuPopupHelper = definedExternally
    open fun getActionBar(): ActionBar = definedExternally
    override fun onTitleChanged(title: String) = definedExternally
    override fun onTitleChanged(title: String, color: Number?) = definedExternally
}
