//@file:JvmName("Sdk15ViewsKt")
package org.jetbrains.anko

import UKot.*
import UKot.anko.*
import UKot.widget.UI
import UKot.support.ViewBuilder
import org.jetbrains.anko.custom.*
//import android.view.ViewGroup
import android.app.Activity
//import android.app.Fragment
import android.content.Context
import android.graphics.Color
import android.support.v4.view.ViewPager
import android.view.ViewGroup
//import android.os.Build
import android.widget.*
import androidui.widget.HtmlView
import uk.co.senab.photoview.PhotoView

@PublishedApi
internal object `$$Anko$Factories$Sdk15View` {
    //    val GESTURE_OVERLAY_VIEW = { ctx: Context -> android.gesture.GestureOverlayView(ctx) }
//    val EXTRACT_EDIT_TEXT = { ctx: Context -> android.inputmethodservice.ExtractEditText(ctx) }
//    val G_L_SURFACE_VIEW = { ctx: Context -> android.opengl.GLSurfaceView(ctx) }
//    val SURFACE_VIEW = { ctx: Context -> android.view.SurfaceView(ctx) }
//    val TEXTURE_VIEW = { ctx: Context -> android.view.TextureView(ctx) }
    val VIEW = { ctx: Context -> android.view.View(ctx) }
    //    val VIEW_STUB = { ctx: Context -> android.view.ViewStub(ctx) }
//    val ADAPTER_VIEW_FLIPPER = { ctx: Context -> AdapterViewFlipper(ctx) }
//    val ANALOG_CLOCK = { ctx: Context -> AnalogClock(ctx) }
//    val AUTO_COMPLETE_TEXT_VIEW = { ctx: Context -> AutoCompleteTextView(ctx) }
    val BUTTON = { ctx: Context -> Button(ctx) }
    //    val CALENDAR_VIEW = { ctx: Context -> CalendarView(ctx) }
    val CHECK_BOX = { ctx: Context -> CheckBox(ctx) }
    val CHECKED_TEXT_VIEW = { ctx: Context -> CheckedTextView(ctx) }
    //    val CHRONOMETER = { ctx: Context -> Chronometer(ctx) }
//    val DATE_PICKER = { ctx: Context -> DatePicker(ctx) }
//    val DIALER_FILTER = { ctx: Context -> DialerFilter(ctx) }
//    val DIGITAL_CLOCK = { ctx: Context -> DigitalClock(ctx) }
    val EDIT_TEXT = { ctx: Context -> EditText(ctx) }
    val EXPANDABLE_LIST_VIEW = { ctx: Context -> ExpandableListView(ctx) }
    val IMAGE_BUTTON = { ctx: Context -> ImageButton(ctx) }
    val IMAGE_VIEW = { ctx: Context -> ImageView(ctx) }
    val LIST_VIEW = { ctx: Context -> ListView(ctx) }
    //    val MULTI_AUTO_COMPLETE_TEXT_VIEW = { ctx: Context -> MultiAutoCompleteTextView(ctx) }
    val NUMBER_PICKER = { ctx: Context -> NumberPicker(ctx) }
    val PROGRESS_BAR = { ctx: Context -> ProgressBar(ctx) }
    //    val QUICK_CONTACT_BADGE = { ctx: Context -> QuickContactBadge(ctx) }
    val RADIO_BUTTON = { ctx: Context -> RadioButton(ctx) }
    val RATING_BAR = { ctx: Context -> RatingBar(ctx) }
    //    val SEARCH_VIEW = { ctx: Context -> SearchView(ctx) }
    val SEEK_BAR = { ctx: Context -> SeekBar(ctx) }
    //    val SLIDING_DRAWER = { ctx: Context -> SlidingDrawer(ctx, null) }
//    val SPACE = { ctx: Context -> Space(ctx) }
    val SPINNER = { ctx: Context -> Spinner(ctx) }
    //    val STACK_VIEW = { ctx: Context -> StackView(ctx) }
//    val SWITCH = { ctx: Context -> Switch(ctx) }
//    val TAB_HOST = { ctx: Context -> TabHost(ctx) }
//    val TAB_WIDGET = { ctx: Context -> TabWidget(ctx) }
    val TEXT_VIEW = { ctx: Context -> TextView(ctx) }
//    val TIME_PICKER = { ctx: Context -> TimePicker(ctx) }
//    val TOGGLE_BUTTON = { ctx: Context -> ToggleButton(ctx) }
//    val TWO_LINE_LIST_ITEM = { ctx: Context -> TwoLineListItem(ctx) }
//    val VIDEO_VIEW = { ctx: Context -> VideoView(ctx) }
//    val VIEW_FLIPPER = { ctx: Context -> ViewFlipper(ctx) }
//    val ZOOM_BUTTON = { ctx: Context -> ZoomButton(ctx) }
//    val ZOOM_CONTROLS = { ctx: Context -> ZoomControls(ctx) }
}
//
//inline fun ViewGroup.gestureOverlayView(): android.gesture.GestureOverlayView = gestureOverlayView() {}
//inline fun ViewGroup.gestureOverlayView(init: (@AnkoViewDslMarker android.gesture.GestureOverlayView).() -> Unit): android.gesture.GestureOverlayView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.GESTURE_OVERLAY_VIEW, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedGestureOverlayView(theme: Int = 0): android.gesture.GestureOverlayView = themedGestureOverlayView(theme) {}
//inline fun ViewGroup.themedGestureOverlayView(theme: Int = 0, init: (@AnkoViewDslMarker android.gesture.GestureOverlayView).() -> Unit): android.gesture.GestureOverlayView {
//return ankoView(`$$Anko$Factories$Sdk15View`.GESTURE_OVERLAY_VIEW, theme) { init() }
//}
//
//inline fun Context.gestureOverlayView(): android.gesture.GestureOverlayView = gestureOverlayView() {}
//inline fun Context.gestureOverlayView(init: (@AnkoViewDslMarker android.gesture.GestureOverlayView).() -> Unit): android.gesture.GestureOverlayView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.GESTURE_OVERLAY_VIEW, theme = 0) { init() }
//}
//
//inline fun Context.themedGestureOverlayView(theme: Int = 0): android.gesture.GestureOverlayView = themedGestureOverlayView(theme) {}
//inline fun Context.themedGestureOverlayView(theme: Int = 0, init: (@AnkoViewDslMarker android.gesture.GestureOverlayView).() -> Unit): android.gesture.GestureOverlayView {
//return ankoView(`$$Anko$Factories$Sdk15View`.GESTURE_OVERLAY_VIEW, theme) { init() }
//}
//
//inline fun Activity.gestureOverlayView(): android.gesture.GestureOverlayView = gestureOverlayView() {}
//inline fun Activity.gestureOverlayView(init: (@AnkoViewDslMarker android.gesture.GestureOverlayView).() -> Unit): android.gesture.GestureOverlayView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.GESTURE_OVERLAY_VIEW, theme = 0) { init() }
//}
//
//inline fun Activity.themedGestureOverlayView(theme: Int = 0): android.gesture.GestureOverlayView = themedGestureOverlayView(theme) {}
//inline fun Activity.themedGestureOverlayView(theme: Int = 0, init: (@AnkoViewDslMarker android.gesture.GestureOverlayView).() -> Unit): android.gesture.GestureOverlayView {
//return ankoView(`$$Anko$Factories$Sdk15View`.GESTURE_OVERLAY_VIEW, theme) { init() }
//}
//
//inline fun ViewGroup.extractEditText(): android.inputmethodservice.ExtractEditText = extractEditText() {}
//inline fun ViewGroup.extractEditText(init: (@AnkoViewDslMarker android.inputmethodservice.ExtractEditText).() -> Unit): android.inputmethodservice.ExtractEditText {
//    return ankoView(`$$Anko$Factories$Sdk15View`.EXTRACT_EDIT_TEXT, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedExtractEditText(theme: Int = 0): android.inputmethodservice.ExtractEditText = themedExtractEditText(theme) {}
//inline fun ViewGroup.themedExtractEditText(theme: Int = 0, init: (@AnkoViewDslMarker android.inputmethodservice.ExtractEditText).() -> Unit): android.inputmethodservice.ExtractEditText {
//return ankoView(`$$Anko$Factories$Sdk15View`.EXTRACT_EDIT_TEXT, theme) { init() }
//}
//
//inline fun ViewGroup.gLSurfaceView(): android.opengl.GLSurfaceView = gLSurfaceView() {}
//inline fun ViewGroup.gLSurfaceView(init: (@AnkoViewDslMarker android.opengl.GLSurfaceView).() -> Unit): android.opengl.GLSurfaceView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.G_L_SURFACE_VIEW, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedGLSurfaceView(theme: Int = 0): android.opengl.GLSurfaceView = themedGLSurfaceView(theme) {}
//inline fun ViewGroup.themedGLSurfaceView(theme: Int = 0, init: (@AnkoViewDslMarker android.opengl.GLSurfaceView).() -> Unit): android.opengl.GLSurfaceView {
//return ankoView(`$$Anko$Factories$Sdk15View`.G_L_SURFACE_VIEW, theme) { init() }
//}
//
//inline fun ViewGroup.surfaceView(): android.view.SurfaceView = surfaceView() {}
//inline fun ViewGroup.surfaceView(init: (@AnkoViewDslMarker android.view.SurfaceView).() -> Unit): android.view.SurfaceView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.SURFACE_VIEW, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedSurfaceView(theme: Int = 0): android.view.SurfaceView = themedSurfaceView(theme) {}
//inline fun ViewGroup.themedSurfaceView(theme: Int = 0, init: (@AnkoViewDslMarker android.view.SurfaceView).() -> Unit): android.view.SurfaceView {
//return ankoView(`$$Anko$Factories$Sdk15View`.SURFACE_VIEW, theme) { init() }
//}
//
//inline fun ViewGroup.textureView(): android.view.TextureView = textureView() {}
//inline fun ViewGroup.textureView(init: (@AnkoViewDslMarker android.view.TextureView).() -> Unit): android.view.TextureView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.TEXTURE_VIEW, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedTextureView(theme: Int = 0): android.view.TextureView = themedTextureView(theme) {}
//inline fun ViewGroup.themedTextureView(theme: Int = 0, init: (@AnkoViewDslMarker android.view.TextureView).() -> Unit): android.view.TextureView {
//return ankoView(`$$Anko$Factories$Sdk15View`.TEXTURE_VIEW, theme) { init() }
//}

inline fun ViewGroup.view(): android.view.View = view() {}
inline fun ViewGroup.view(init: (@AnkoViewDslMarker android.view.View).() -> Unit): android.view.View {
    return ankoView(`$$Anko$Factories$Sdk15View`.VIEW, theme = 0) { init() }
}

inline fun ViewGroup.themedView(theme: Int = 0): android.view.View = themedView(theme) {}
inline fun ViewGroup.themedView(theme: Int = 0, init: (@AnkoViewDslMarker android.view.View).() -> Unit): android.view.View {
    return ankoView(`$$Anko$Factories$Sdk15View`.VIEW, theme) { init() }
}

//inline fun ViewGroup.viewStub(): android.view.ViewStub = viewStub() {}
//inline fun ViewGroup.viewStub(init: (@AnkoViewDslMarker android.view.ViewStub).() -> Unit): android.view.ViewStub {
//    return ankoView(`$$Anko$Factories$Sdk15View`.VIEW_STUB, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedViewStub(theme: Int = 0): android.view.ViewStub = themedViewStub(theme) {}
//inline fun ViewGroup.themedViewStub(theme: Int = 0, init: (@AnkoViewDslMarker android.view.ViewStub).() -> Unit): android.view.ViewStub {
//return ankoView(`$$Anko$Factories$Sdk15View`.VIEW_STUB, theme) { init() }
//}
//
//inline fun ViewGroup.adapterViewFlipper(): AdapterViewFlipper = adapterViewFlipper() {}
//inline fun ViewGroup.adapterViewFlipper(init: (@AnkoViewDslMarker AdapterViewFlipper).() -> Unit): AdapterViewFlipper {
//    return ankoView(`$$Anko$Factories$Sdk15View`.ADAPTER_VIEW_FLIPPER, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedAdapterViewFlipper(theme: Int = 0): AdapterViewFlipper = themedAdapterViewFlipper(theme) {}
//inline fun ViewGroup.themedAdapterViewFlipper(theme: Int = 0, init: (@AnkoViewDslMarker AdapterViewFlipper).() -> Unit): AdapterViewFlipper {
//return ankoView(`$$Anko$Factories$Sdk15View`.ADAPTER_VIEW_FLIPPER, theme) { init() }
//}
//
//inline fun Context.adapterViewFlipper(): AdapterViewFlipper = adapterViewFlipper() {}
//inline fun Context.adapterViewFlipper(init: (@AnkoViewDslMarker AdapterViewFlipper).() -> Unit): AdapterViewFlipper {
//    return ankoView(`$$Anko$Factories$Sdk15View`.ADAPTER_VIEW_FLIPPER, theme = 0) { init() }
//}
//
//inline fun Context.themedAdapterViewFlipper(theme: Int = 0): AdapterViewFlipper = themedAdapterViewFlipper(theme) {}
//inline fun Context.themedAdapterViewFlipper(theme: Int = 0, init: (@AnkoViewDslMarker AdapterViewFlipper).() -> Unit): AdapterViewFlipper {
//return ankoView(`$$Anko$Factories$Sdk15View`.ADAPTER_VIEW_FLIPPER, theme) { init() }
//}
//
//inline fun Activity.adapterViewFlipper(): AdapterViewFlipper = adapterViewFlipper() {}
//inline fun Activity.adapterViewFlipper(init: (@AnkoViewDslMarker AdapterViewFlipper).() -> Unit): AdapterViewFlipper {
//    return ankoView(`$$Anko$Factories$Sdk15View`.ADAPTER_VIEW_FLIPPER, theme = 0) { init() }
//}
//
//inline fun Activity.themedAdapterViewFlipper(theme: Int = 0): AdapterViewFlipper = themedAdapterViewFlipper(theme) {}
//inline fun Activity.themedAdapterViewFlipper(theme: Int = 0, init: (@AnkoViewDslMarker AdapterViewFlipper).() -> Unit): AdapterViewFlipper {
//return ankoView(`$$Anko$Factories$Sdk15View`.ADAPTER_VIEW_FLIPPER, theme) { init() }
//}
//
//inline fun ViewGroup.analogClock(): AnalogClock = analogClock() {}
//inline fun ViewGroup.analogClock(init: (@AnkoViewDslMarker AnalogClock).() -> Unit): AnalogClock {
//    return ankoView(`$$Anko$Factories$Sdk15View`.ANALOG_CLOCK, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedAnalogClock(theme: Int = 0): AnalogClock = themedAnalogClock(theme) {}
//inline fun ViewGroup.themedAnalogClock(theme: Int = 0, init: (@AnkoViewDslMarker AnalogClock).() -> Unit): AnalogClock {
//return ankoView(`$$Anko$Factories$Sdk15View`.ANALOG_CLOCK, theme) { init() }
//}
//
//inline fun ViewGroup.autoCompleteTextView(): AutoCompleteTextView = autoCompleteTextView() {}
//inline fun ViewGroup.autoCompleteTextView(init: (@AnkoViewDslMarker AutoCompleteTextView).() -> Unit): AutoCompleteTextView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.AUTO_COMPLETE_TEXT_VIEW, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedAutoCompleteTextView(theme: Int = 0): AutoCompleteTextView = themedAutoCompleteTextView(theme) {}
//inline fun ViewGroup.themedAutoCompleteTextView(theme: Int = 0, init: (@AnkoViewDslMarker AutoCompleteTextView).() -> Unit): AutoCompleteTextView {
//return ankoView(`$$Anko$Factories$Sdk15View`.AUTO_COMPLETE_TEXT_VIEW, theme) { init() }
//}
inline fun ViewGroup.viewPager(): ViewPager = viewPager() {}

inline fun ViewGroup.viewPager(init: (@AnkoViewDslMarker ViewPager).() -> Unit): ViewPager {
    return ankoView({ ctx -> ViewPager(ctx) }, theme = 0) { init() }
}

inline fun ViewGroup.button(): Button = button() {}
inline fun ViewGroup.button(init: (@AnkoViewDslMarker Button).() -> Unit): Button {
    return ankoView(`$$Anko$Factories$Sdk15View`.BUTTON, theme = 0) { init() }
}

inline fun ViewGroup.themedButton(theme: Int = 0): Button = themedButton(theme) {}
inline fun ViewGroup.themedButton(theme: Int = 0, init: (@AnkoViewDslMarker Button).() -> Unit): Button {
    return ankoView(`$$Anko$Factories$Sdk15View`.BUTTON, theme) { init() }
}

inline fun ViewGroup.buttonPrimary(text: String): Button {
    return ankoView(`$$Anko$Factories$Sdk15View`.BUTTON, theme = 0) {
        setText(text)
        setTextColor(Color.WHITE)
        radius()
        setBG(context().appColor.colorPrimary)
    }
}

inline fun ViewGroup.buttonPrimary(text: String, init: (@AnkoViewDslMarker Button).() -> Unit): Button {
    return ankoView(`$$Anko$Factories$Sdk15View`.BUTTON, theme = 0) {
        init()
        setTextColor(Color.WHITE)
        radius()
        setBG(context().appColor.colorPrimary)
        setText(text)
    }
}

inline fun ViewGroup.button(text: String): Button {
    return ankoView(`$$Anko$Factories$Sdk15View`.BUTTON, theme = 0) {
        setText(text)
    }
}

inline fun ViewGroup.button(text: String, init: (@AnkoViewDslMarker Button).() -> Unit): Button {
    return ankoView(`$$Anko$Factories$Sdk15View`.BUTTON, theme = 0) {
        init()
        setText(text)
    }
}

inline fun ViewGroup.themedButton(text: String, theme: Int): Button {
    return ankoView(`$$Anko$Factories$Sdk15View`.BUTTON, theme) {
        setText(text)
    }
}

inline fun ViewGroup.themedButton(text: String, theme: Int, init: (@AnkoViewDslMarker Button).() -> Unit): Button {
    return ankoView(`$$Anko$Factories$Sdk15View`.BUTTON, theme) {
        init()
        setText(text)
    }
}

inline fun ViewGroup.button(text: Int): Button {
    return ankoView(`$$Anko$Factories$Sdk15View`.BUTTON, theme = 0) {
        setText(text)
    }
}

inline fun ViewGroup.button(text: Int, init: (@AnkoViewDslMarker Button).() -> Unit): Button {
    return ankoView(`$$Anko$Factories$Sdk15View`.BUTTON, theme = 0) {
        init()
        setText(text)
    }
}

inline fun ViewGroup.themedButton(text: Int, theme: Int): Button {
    return ankoView(`$$Anko$Factories$Sdk15View`.BUTTON, theme) {
        setText(text)
    }
}

inline fun ViewGroup.themedButton(text: Int, theme: Int, init: (@AnkoViewDslMarker Button).() -> Unit): Button {
    return ankoView(`$$Anko$Factories$Sdk15View`.BUTTON, theme) {
        init()
        setText(text)
    }
}

//inline fun ViewGroup.calendarView(): CalendarView = calendarView() {}
//inline fun ViewGroup.calendarView(init: (@AnkoViewDslMarker CalendarView).() -> Unit): CalendarView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.CALENDAR_VIEW, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedCalendarView(theme: Int = 0): CalendarView = themedCalendarView(theme) {}
//inline fun ViewGroup.themedCalendarView(theme: Int = 0, init: (@AnkoViewDslMarker CalendarView).() -> Unit): CalendarView {
//return ankoView(`$$Anko$Factories$Sdk15View`.CALENDAR_VIEW, theme) { init() }
//}
//
//inline fun Context.calendarView(): CalendarView = calendarView() {}
//inline fun Context.calendarView(init: (@AnkoViewDslMarker CalendarView).() -> Unit): CalendarView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.CALENDAR_VIEW, theme = 0) { init() }
//}
//
//inline fun Context.themedCalendarView(theme: Int = 0): CalendarView = themedCalendarView(theme) {}
//inline fun Context.themedCalendarView(theme: Int = 0, init: (@AnkoViewDslMarker CalendarView).() -> Unit): CalendarView {
//return ankoView(`$$Anko$Factories$Sdk15View`.CALENDAR_VIEW, theme) { init() }
//}
//
//inline fun Activity.calendarView(): CalendarView = calendarView() {}
//inline fun Activity.calendarView(init: (@AnkoViewDslMarker CalendarView).() -> Unit): CalendarView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.CALENDAR_VIEW, theme = 0) { init() }
//}
//
//inline fun Activity.themedCalendarView(theme: Int = 0): CalendarView = themedCalendarView(theme) {}
//inline fun Activity.themedCalendarView(theme: Int = 0, init: (@AnkoViewDslMarker CalendarView).() -> Unit): CalendarView {
//return ankoView(`$$Anko$Factories$Sdk15View`.CALENDAR_VIEW, theme) { init() }
//}

inline fun ViewGroup.checkBox(): CheckBox = checkBox() {}
inline fun ViewGroup.checkBox(init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme = 0) { init() }
}

inline fun ViewGroup.themedCheckBox(theme: Int = 0): CheckBox = themedCheckBox(theme) {}
inline fun ViewGroup.themedCheckBox(theme: Int = 0, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme) { init() }
}

inline fun ViewGroup.checkBox(text: String): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme = 0) {
        setText(text)
    }
}

inline fun ViewGroup.checkBox(text: String, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme = 0) {
        init()
        setText(text)
    }
}

inline fun ViewGroup.themedCheckBox(text: String, theme: Int): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme) {
        setText(text)
    }
}

inline fun ViewGroup.themedCheckBox(text: String, theme: Int, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme) {
        init()
        setText(text)
    }
}

inline fun ViewGroup.checkBox(text: Int): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme = 0) {
        setText(text)
    }
}

inline fun ViewGroup.checkBox(text: Int, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme = 0) {
        init()
        setText(text)
    }
}

inline fun ViewGroup.themedCheckBox(text: Int, theme: Int): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme) {
        setText(text)
    }
}

inline fun ViewGroup.themedCheckBox(text: Int, theme: Int, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme) {
        init()
        setText(text)
    }
}

inline fun ViewGroup.checkBox(text: String, checked: Boolean): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme = 0) {
        setText(text)
        setChecked(checked)
    }
}

inline fun ViewGroup.checkBox(text: String, checked: Boolean, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme = 0) {
        init()
        setText(text)
        setChecked(checked)
    }
}

inline fun ViewGroup.themedCheckBox(text: String, checked: Boolean, theme: Int): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme) {
        setText(text)
        setChecked(checked)
    }
}

inline fun ViewGroup.themedCheckBox(text: String, checked: Boolean, theme: Int, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme) {
        init()
        setText(text)
        setChecked(checked)
    }
}

inline fun ViewGroup.checkBox(text: Int, checked: Boolean): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme = 0) {
        setText(text)
        setChecked(checked)
    }
}

inline fun ViewGroup.checkBox(text: Int, checked: Boolean, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme = 0) {
        init()
        setText(text)
        setChecked(checked)
    }
}

inline fun ViewGroup.themedCheckBox(text: Int, checked: Boolean, theme: Int): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme) {
        setText(text)
        setChecked(checked)
    }
}

inline fun ViewGroup.themedCheckBox(text: Int, checked: Boolean, theme: Int, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECK_BOX, theme) {
        init()
        setText(text)
        setChecked(checked)
    }
}

inline fun ViewGroup.checkedTextView(): CheckedTextView = checkedTextView() {}
inline fun ViewGroup.checkedTextView(init: (@AnkoViewDslMarker CheckedTextView).() -> Unit): CheckedTextView {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECKED_TEXT_VIEW, theme = 0) { init() }
}

inline fun ViewGroup.themedCheckedTextView(theme: Int = 0): CheckedTextView = themedCheckedTextView(theme) {}
inline fun ViewGroup.themedCheckedTextView(theme: Int = 0, init: (@AnkoViewDslMarker CheckedTextView).() -> Unit): CheckedTextView {
    return ankoView(`$$Anko$Factories$Sdk15View`.CHECKED_TEXT_VIEW, theme) { init() }
}

//inline fun ViewGroup.chronometer(): Chronometer = chronometer() {}
//inline fun ViewGroup.chronometer(init: (@AnkoViewDslMarker Chronometer).() -> Unit): Chronometer {
//    return ankoView(`$$Anko$Factories$Sdk15View`.CHRONOMETER, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedChronometer(theme: Int = 0): Chronometer = themedChronometer(theme) {}
//inline fun ViewGroup.themedChronometer(theme: Int = 0, init: (@AnkoViewDslMarker Chronometer).() -> Unit): Chronometer {
//return ankoView(`$$Anko$Factories$Sdk15View`.CHRONOMETER, theme) { init() }
//}
//
//inline fun ViewGroup.datePicker(): DatePicker = datePicker() {}
//inline fun ViewGroup.datePicker(init: (@AnkoViewDslMarker DatePicker).() -> Unit): DatePicker {
//    return ankoView(`$$Anko$Factories$Sdk15View`.DATE_PICKER, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedDatePicker(theme: Int = 0): DatePicker = themedDatePicker(theme) {}
//inline fun ViewGroup.themedDatePicker(theme: Int = 0, init: (@AnkoViewDslMarker DatePicker).() -> Unit): DatePicker {
//return ankoView(`$$Anko$Factories$Sdk15View`.DATE_PICKER, theme) { init() }
//}
//
//inline fun Context.datePicker(): DatePicker = datePicker() {}
//inline fun Context.datePicker(init: (@AnkoViewDslMarker DatePicker).() -> Unit): DatePicker {
//    return ankoView(`$$Anko$Factories$Sdk15View`.DATE_PICKER, theme = 0) { init() }
//}
//
//inline fun Context.themedDatePicker(theme: Int = 0): DatePicker = themedDatePicker(theme) {}
//inline fun Context.themedDatePicker(theme: Int = 0, init: (@AnkoViewDslMarker DatePicker).() -> Unit): DatePicker {
//return ankoView(`$$Anko$Factories$Sdk15View`.DATE_PICKER, theme) { init() }
//}
//
//inline fun Activity.datePicker(): DatePicker = datePicker() {}
//inline fun Activity.datePicker(init: (@AnkoViewDslMarker DatePicker).() -> Unit): DatePicker {
//    return ankoView(`$$Anko$Factories$Sdk15View`.DATE_PICKER, theme = 0) { init() }
//}
//
//inline fun Activity.themedDatePicker(theme: Int = 0): DatePicker = themedDatePicker(theme) {}
//inline fun Activity.themedDatePicker(theme: Int = 0, init: (@AnkoViewDslMarker DatePicker).() -> Unit): DatePicker {
//return ankoView(`$$Anko$Factories$Sdk15View`.DATE_PICKER, theme) { init() }
//}
//
//inline fun ViewGroup.dialerFilter(): DialerFilter = dialerFilter() {}
//inline fun ViewGroup.dialerFilter(init: (@AnkoViewDslMarker DialerFilter).() -> Unit): DialerFilter {
//    return ankoView(`$$Anko$Factories$Sdk15View`.DIALER_FILTER, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedDialerFilter(theme: Int = 0): DialerFilter = themedDialerFilter(theme) {}
//inline fun ViewGroup.themedDialerFilter(theme: Int = 0, init: (@AnkoViewDslMarker DialerFilter).() -> Unit): DialerFilter {
//return ankoView(`$$Anko$Factories$Sdk15View`.DIALER_FILTER, theme) { init() }
//}
//
//inline fun Context.dialerFilter(): DialerFilter = dialerFilter() {}
//inline fun Context.dialerFilter(init: (@AnkoViewDslMarker DialerFilter).() -> Unit): DialerFilter {
//    return ankoView(`$$Anko$Factories$Sdk15View`.DIALER_FILTER, theme = 0) { init() }
//}
//
//inline fun Context.themedDialerFilter(theme: Int = 0): DialerFilter = themedDialerFilter(theme) {}
//inline fun Context.themedDialerFilter(theme: Int = 0, init: (@AnkoViewDslMarker DialerFilter).() -> Unit): DialerFilter {
//return ankoView(`$$Anko$Factories$Sdk15View`.DIALER_FILTER, theme) { init() }
//}
//
//inline fun Activity.dialerFilter(): DialerFilter = dialerFilter() {}
//inline fun Activity.dialerFilter(init: (@AnkoViewDslMarker DialerFilter).() -> Unit): DialerFilter {
//    return ankoView(`$$Anko$Factories$Sdk15View`.DIALER_FILTER, theme = 0) { init() }
//}
//
//inline fun Activity.themedDialerFilter(theme: Int = 0): DialerFilter = themedDialerFilter(theme) {}
//inline fun Activity.themedDialerFilter(theme: Int = 0, init: (@AnkoViewDslMarker DialerFilter).() -> Unit): DialerFilter {
//return ankoView(`$$Anko$Factories$Sdk15View`.DIALER_FILTER, theme) { init() }
//}
//
//inline fun ViewGroup.digitalClock(): DigitalClock = digitalClock() {}
//inline fun ViewGroup.digitalClock(init: (@AnkoViewDslMarker DigitalClock).() -> Unit): DigitalClock {
//    return ankoView(`$$Anko$Factories$Sdk15View`.DIGITAL_CLOCK, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedDigitalClock(theme: Int = 0): DigitalClock = themedDigitalClock(theme) {}
//inline fun ViewGroup.themedDigitalClock(theme: Int = 0, init: (@AnkoViewDslMarker DigitalClock).() -> Unit): DigitalClock {
//return ankoView(`$$Anko$Factories$Sdk15View`.DIGITAL_CLOCK, theme) { init() }
//}

inline fun ViewGroup.editText(): EditText = editText() {}
inline fun ViewGroup.editText(init: (@AnkoViewDslMarker EditText).() -> Unit): EditText {
    return ankoView(`$$Anko$Factories$Sdk15View`.EDIT_TEXT, theme = 0) { init() }
}

inline fun ViewGroup.themedEditText(theme: Int = 0): EditText = themedEditText(theme) {}
inline fun ViewGroup.themedEditText(theme: Int = 0, init: (@AnkoViewDslMarker EditText).() -> Unit): EditText {
    return ankoView(`$$Anko$Factories$Sdk15View`.EDIT_TEXT, theme) { init() }
}

inline fun ViewGroup.editText(text: String): EditText {
    return ankoView(`$$Anko$Factories$Sdk15View`.EDIT_TEXT, theme = 0) {
        setText(text)
    }
}

inline fun ViewGroup.editText(text: String, init: (@AnkoViewDslMarker EditText).() -> Unit): EditText {
    return ankoView(`$$Anko$Factories$Sdk15View`.EDIT_TEXT, theme = 0) {
        init()
        setText(text)
    }
}

inline fun ViewGroup.themedEditText(text: String, theme: Int): EditText {
    return ankoView(`$$Anko$Factories$Sdk15View`.EDIT_TEXT, theme) {
        setText(text)
    }
}

inline fun ViewGroup.themedEditText(text: String, theme: Int, init: (@AnkoViewDslMarker EditText).() -> Unit): EditText {
    return ankoView(`$$Anko$Factories$Sdk15View`.EDIT_TEXT, theme) {
        init()
        setText(text)
    }
}

inline fun ViewGroup.editText(text: Int): EditText {
    return ankoView(`$$Anko$Factories$Sdk15View`.EDIT_TEXT, theme = 0) {
        setText(text)
    }
}

inline fun ViewGroup.editText(text: Int, init: (@AnkoViewDslMarker EditText).() -> Unit): EditText {
    return ankoView(`$$Anko$Factories$Sdk15View`.EDIT_TEXT, theme = 0) {
        init()
        setText(text)
    }
}

inline fun ViewGroup.themedEditText(text: Int, theme: Int): EditText {
    return ankoView(`$$Anko$Factories$Sdk15View`.EDIT_TEXT, theme) {
        setText(text)
    }
}

inline fun ViewGroup.themedEditText(text: Int, theme: Int, init: (@AnkoViewDslMarker EditText).() -> Unit): EditText {
    return ankoView(`$$Anko$Factories$Sdk15View`.EDIT_TEXT, theme) {
        init()
        setText(text)
    }
}

inline fun ViewGroup.expandableListView(): ExpandableListView = expandableListView() {}
inline fun ViewGroup.expandableListView(init: (@AnkoViewDslMarker ExpandableListView).() -> Unit): ExpandableListView {
    return ankoView(`$$Anko$Factories$Sdk15View`.EXPANDABLE_LIST_VIEW, theme = 0) { init() }
}

inline fun ViewGroup.themedExpandableListView(theme: Int = 0): ExpandableListView = themedExpandableListView(theme) {}
inline fun ViewGroup.themedExpandableListView(theme: Int = 0, init: (@AnkoViewDslMarker ExpandableListView).() -> Unit): ExpandableListView {
    return ankoView(`$$Anko$Factories$Sdk15View`.EXPANDABLE_LIST_VIEW, theme) { init() }
}

inline fun Context.expandableListView(): ExpandableListView = expandableListView() {}
inline fun Context.expandableListView(init: (@AnkoViewDslMarker ExpandableListView).() -> Unit): ExpandableListView {
    return ankoView(`$$Anko$Factories$Sdk15View`.EXPANDABLE_LIST_VIEW, theme = 0) { init() }
}

inline fun Context.themedExpandableListView(theme: Int = 0): ExpandableListView = themedExpandableListView(theme) {}
inline fun Context.themedExpandableListView(theme: Int = 0, init: (@AnkoViewDslMarker ExpandableListView).() -> Unit): ExpandableListView {
    return ankoView(`$$Anko$Factories$Sdk15View`.EXPANDABLE_LIST_VIEW, theme) { init() }
}

inline fun Activity.expandableListView(): ExpandableListView = expandableListView() {}
inline fun Activity.expandableListView(init: (@AnkoViewDslMarker ExpandableListView).() -> Unit): ExpandableListView {
    return ankoView(`$$Anko$Factories$Sdk15View`.EXPANDABLE_LIST_VIEW, theme = 0) { init() }
}

inline fun Activity.themedExpandableListView(theme: Int = 0): ExpandableListView = themedExpandableListView(theme) {}
inline fun Activity.themedExpandableListView(theme: Int = 0, init: (@AnkoViewDslMarker ExpandableListView).() -> Unit): ExpandableListView {
    return ankoView(`$$Anko$Factories$Sdk15View`.EXPANDABLE_LIST_VIEW, theme) { init() }
}

inline fun ViewGroup.imageButton(): ImageButton = imageButton() {}
inline fun ViewGroup.imageButton(init: (@AnkoViewDslMarker ImageButton).() -> Unit): ImageButton {
    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_BUTTON, theme = 0) { init() }
}

inline fun ViewGroup.themedImageButton(theme: Int = 0): ImageButton = themedImageButton(theme) {}
inline fun ViewGroup.themedImageButton(theme: Int = 0, init: (@AnkoViewDslMarker ImageButton).() -> Unit): ImageButton {
    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_BUTTON, theme) { init() }
}

inline fun ViewGroup.imageButton(imageDrawable: android.graphics.drawable.Drawable): ImageButton {
    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_BUTTON, theme = 0) {
        setImageDrawable(imageDrawable)
    }
}

inline fun ViewGroup.imageButton(imageDrawable: android.graphics.drawable.Drawable, init: (@AnkoViewDslMarker ImageButton).() -> Unit): ImageButton {
    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_BUTTON, theme = 0) {
        init()
        setImageDrawable(imageDrawable)
    }
}

inline fun ViewGroup.themedImageButton(imageDrawable: android.graphics.drawable.Drawable, theme: Int): ImageButton {
    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_BUTTON, theme) {
        setImageDrawable(imageDrawable)
    }
}

inline fun ViewGroup.themedImageButton(imageDrawable: android.graphics.drawable.Drawable, theme: Int, init: (@AnkoViewDslMarker ImageButton).() -> Unit): ImageButton {
    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_BUTTON, theme) {
        init()
        setImageDrawable(imageDrawable)
    }
}

//TODO imageResource: Int
//inline fun ViewGroup.imageButton(imageResource: Int): ImageButton {
//    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_BUTTON, theme = 0) {
//        setImageResource(imageResource)
//    }
//}
//inline fun ViewGroup.imageButton(imageResource: Int, init: (@AnkoViewDslMarker ImageButton).() -> Unit): ImageButton {
//    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_BUTTON, theme = 0) {
//        init()
//        setImageResource(imageResource)
//    }
//}
//inline fun ViewGroup.themedImageButton(imageResource: Int, theme: Int): ImageButton {
//    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_BUTTON, theme) {
//        setImageResource(imageResource)
//    }
//}
//inline fun ViewGroup.themedImageButton(imageResource: Int, theme: Int, init: (@AnkoViewDslMarker ImageButton).() -> Unit): ImageButton {
//    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_BUTTON, theme) {
//        init()
//        setImageResource(imageResource)
//    }
//}

inline fun ViewGroup.imageView(): ImageView = imageView() {}
inline fun ViewGroup.imageView(init: (@AnkoViewDslMarker ImageView).() -> Unit): ImageView {
    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_VIEW, theme = 0) { init() }
}

inline fun ViewGroup.photoView(): ImageView = imageView() {}
inline fun ViewGroup.photoView(init: (@AnkoViewDslMarker ImageView).() -> Unit): ImageView {
    return ankoView({ ctx -> PhotoView(ctx) }, theme = 0) { init() }
}

inline fun ViewGroup.themedImageView(theme: Int = 0): ImageView = themedImageView(theme) {}
inline fun ViewGroup.themedImageView(theme: Int = 0, init: (@AnkoViewDslMarker ImageView).() -> Unit): ImageView {
    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_VIEW, theme) { init() }
}

inline fun ViewGroup.imageView(imageDrawable: android.graphics.drawable.Drawable): ImageView {
    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_VIEW, theme = 0) {
        setImageDrawable(imageDrawable)
    }
}

inline fun ViewGroup.imageView(imageDrawable: android.graphics.drawable.Drawable, init: (@AnkoViewDslMarker ImageView).() -> Unit): ImageView {
    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_VIEW, theme = 0) {
        init()
        setImageDrawable(imageDrawable)
    }
}

inline fun ViewGroup.themedImageView(imageDrawable: android.graphics.drawable.Drawable, theme: Int): ImageView {
    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_VIEW, theme) {
        setImageDrawable(imageDrawable)
    }
}

inline fun ViewGroup.themedImageView(imageDrawable: android.graphics.drawable.Drawable, theme: Int, init: (@AnkoViewDslMarker ImageView).() -> Unit): ImageView {
    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_VIEW, theme) {
        init()
        setImageDrawable(imageDrawable)
    }
}

//inline fun ViewGroup.imageView(imageResource: Int): ImageView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_VIEW, theme = 0) {
//        setImageResource(imageResource)
//    }
//}
//inline fun ViewGroup.imageView(imageResource: Int, init: (@AnkoViewDslMarker ImageView).() -> Unit): ImageView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_VIEW, theme = 0) {
//        init()
//        setImageResource(imageResource)
//    }
//}
//inline fun ViewGroup.themedImageView(imageResource: Int, theme: Int): ImageView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_VIEW, theme) {
//        setImageResource(imageResource)
//    }
//}
//inline fun ViewGroup.themedImageView(imageResource: Int, theme: Int, init: (@AnkoViewDslMarker ImageView).() -> Unit): ImageView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.IMAGE_VIEW, theme) {
//        init()
//        setImageResource(imageResource)
//    }
//}

inline fun ViewGroup.listView(): ListView = listView() {}
inline fun ViewGroup.listView(init: (@AnkoViewDslMarker ListView).() -> Unit): ListView {
    return ankoView(`$$Anko$Factories$Sdk15View`.LIST_VIEW, theme = 0) { init() }
}

inline fun ViewGroup.themedListView(theme: Int = 0): ListView = themedListView(theme) {}
inline fun ViewGroup.themedListView(theme: Int = 0, init: (@AnkoViewDslMarker ListView).() -> Unit): ListView {
    return ankoView(`$$Anko$Factories$Sdk15View`.LIST_VIEW, theme) { init() }
}

inline fun Context.listView(): ListView = listView() {}
inline fun Context.listView(init: (@AnkoViewDslMarker ListView).() -> Unit): ListView {
    return ankoView(`$$Anko$Factories$Sdk15View`.LIST_VIEW, theme = 0) { init() }
}

inline fun Context.themedListView(theme: Int = 0): ListView = themedListView(theme) {}
inline fun Context.themedListView(theme: Int = 0, init: (@AnkoViewDslMarker ListView).() -> Unit): ListView {
    return ankoView(`$$Anko$Factories$Sdk15View`.LIST_VIEW, theme) { init() }
}

inline fun Activity.listView(): ListView = listView() {}
inline fun Activity.listView(init: (@AnkoViewDslMarker ListView).() -> Unit): ListView {
    return ankoView(`$$Anko$Factories$Sdk15View`.LIST_VIEW, theme = 0) { init() }
}

inline fun Activity.themedListView(theme: Int = 0): ListView = themedListView(theme) {}
inline fun Activity.themedListView(theme: Int = 0, init: (@AnkoViewDslMarker ListView).() -> Unit): ListView {
    return ankoView(`$$Anko$Factories$Sdk15View`.LIST_VIEW, theme) { init() }
}

//inline fun ViewGroup.multiAutoCompleteTextView(): MultiAutoCompleteTextView = multiAutoCompleteTextView() {}
//inline fun ViewGroup.multiAutoCompleteTextView(init: (@AnkoViewDslMarker MultiAutoCompleteTextView).() -> Unit): MultiAutoCompleteTextView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.MULTI_AUTO_COMPLETE_TEXT_VIEW, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedMultiAutoCompleteTextView(theme: Int = 0): MultiAutoCompleteTextView = themedMultiAutoCompleteTextView(theme) {}
//inline fun ViewGroup.themedMultiAutoCompleteTextView(theme: Int = 0, init: (@AnkoViewDslMarker MultiAutoCompleteTextView).() -> Unit): MultiAutoCompleteTextView {
//return ankoView(`$$Anko$Factories$Sdk15View`.MULTI_AUTO_COMPLETE_TEXT_VIEW, theme) { init() }
//}

inline fun ViewGroup.numberPicker(): NumberPicker = numberPicker() {}
inline fun ViewGroup.numberPicker(init: (@AnkoViewDslMarker NumberPicker).() -> Unit): NumberPicker {
    return ankoView(`$$Anko$Factories$Sdk15View`.NUMBER_PICKER, theme = 0) { init() }
}

inline fun ViewGroup.themedNumberPicker(theme: Int = 0): NumberPicker = themedNumberPicker(theme) {}
inline fun ViewGroup.themedNumberPicker(theme: Int = 0, init: (@AnkoViewDslMarker NumberPicker).() -> Unit): NumberPicker {
    return ankoView(`$$Anko$Factories$Sdk15View`.NUMBER_PICKER, theme) { init() }
}

inline fun Context.numberPicker(): NumberPicker = numberPicker() {}
inline fun Context.numberPicker(init: (@AnkoViewDslMarker NumberPicker).() -> Unit): NumberPicker {
    return ankoView(`$$Anko$Factories$Sdk15View`.NUMBER_PICKER, theme = 0) { init() }
}

inline fun Context.themedNumberPicker(theme: Int = 0): NumberPicker = themedNumberPicker(theme) {}
inline fun Context.themedNumberPicker(theme: Int = 0, init: (@AnkoViewDslMarker NumberPicker).() -> Unit): NumberPicker {
    return ankoView(`$$Anko$Factories$Sdk15View`.NUMBER_PICKER, theme) { init() }
}

inline fun Activity.numberPicker(): NumberPicker = numberPicker() {}
inline fun Activity.numberPicker(init: (@AnkoViewDslMarker NumberPicker).() -> Unit): NumberPicker {
    return ankoView(`$$Anko$Factories$Sdk15View`.NUMBER_PICKER, theme = 0) { init() }
}

inline fun Activity.themedNumberPicker(theme: Int = 0): NumberPicker = themedNumberPicker(theme) {}
inline fun Activity.themedNumberPicker(theme: Int = 0, init: (@AnkoViewDslMarker NumberPicker).() -> Unit): NumberPicker {
    return ankoView(`$$Anko$Factories$Sdk15View`.NUMBER_PICKER, theme) { init() }
}

inline fun ViewGroup.htmlView(): HtmlView = htmlView() {}
inline fun ViewGroup.htmlView(init: (@AnkoViewDslMarker HtmlView).() -> Unit): HtmlView {
    return ankoView({ ctx -> HtmlView(ctx) }, theme = 0) { init() }
}

inline fun ViewGroup.progressBar(): ProgressBar = progressBar() {}
inline fun ViewGroup.progressBar(init: (@AnkoViewDslMarker ProgressBar).() -> Unit): ProgressBar {
    return ankoView(`$$Anko$Factories$Sdk15View`.PROGRESS_BAR, theme = 0) { init() }
}

inline fun ViewGroup.progressBarHorizontal(): ProgressBar = progressBarHorizontal() {}
inline fun ViewGroup.progressBarHorizontal(init: (@AnkoViewDslMarker ProgressBar).() -> Unit): ProgressBar {
    val viewBuilder = ViewBuilder<ProgressBar>("ProgressBar")
    viewBuilder.set("style", "@android:attr/progressBarStyleHorizontal")
//    return viewBuilder.bulid()
    //val p = viewBuilder.build()
//    console.log(viewBuilder)
    return ankoView({ ctx ->
        //        console.log(p)
        viewBuilder.build()
    }, theme = 0) { init() }
//    return renderXML("<ProgressBar android:layout_height=\"wrap_content\"\n" +
//            "             android:layout_width=\"match_parent\"\n" +
//            "             android:layout_marginBottom=\"12dp\"\n" +
//            "             style=\"@android:attr/progressBarStyleHorizontal\"\n/>") as ProgressBar
    //return ankoView(`$$Anko$Factories$Sdk15View`.PROGRESS_BAR, theme = 0) { init() }
}


inline fun ViewGroup.themedProgressBar(theme: Int = 0): ProgressBar = themedProgressBar(theme) {}
inline fun ViewGroup.themedProgressBar(theme: Int = 0, init: (@AnkoViewDslMarker ProgressBar).() -> Unit): ProgressBar {
    return ankoView(`$$Anko$Factories$Sdk15View`.PROGRESS_BAR, theme) { init() }
}

//inline fun ViewGroup.quickContactBadge(): QuickContactBadge = quickContactBadge() {}
//inline fun ViewGroup.quickContactBadge(init: (@AnkoViewDslMarker QuickContactBadge).() -> Unit): QuickContactBadge {
//    return ankoView(`$$Anko$Factories$Sdk15View`.QUICK_CONTACT_BADGE, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedQuickContactBadge(theme: Int = 0): QuickContactBadge = themedQuickContactBadge(theme) {}
//inline fun ViewGroup.themedQuickContactBadge(theme: Int = 0, init: (@AnkoViewDslMarker QuickContactBadge).() -> Unit): QuickContactBadge {
//return ankoView(`$$Anko$Factories$Sdk15View`.QUICK_CONTACT_BADGE, theme) { init() }
//}

inline fun ViewGroup.radioButton(): RadioButton = radioButton() {}
inline fun ViewGroup.radioButton(init: (@AnkoViewDslMarker RadioButton).() -> Unit): RadioButton {
    return ankoView(`$$Anko$Factories$Sdk15View`.RADIO_BUTTON, theme = 0) { init() }
}

inline fun ViewGroup.themedRadioButton(theme: Int = 0): RadioButton = themedRadioButton(theme) {}
inline fun ViewGroup.themedRadioButton(theme: Int = 0, init: (@AnkoViewDslMarker RadioButton).() -> Unit): RadioButton {
    return ankoView(`$$Anko$Factories$Sdk15View`.RADIO_BUTTON, theme) { init() }
}

inline fun ViewGroup.ratingBar(): RatingBar = ratingBar() {}
inline fun ViewGroup.ratingBar(init: (@AnkoViewDslMarker RatingBar).() -> Unit): RatingBar {
    return ankoView(`$$Anko$Factories$Sdk15View`.RATING_BAR, theme = 0) { init() }
}

inline fun ViewGroup.themedRatingBar(theme: Int = 0): RatingBar = themedRatingBar(theme) {}
inline fun ViewGroup.themedRatingBar(theme: Int = 0, init: (@AnkoViewDslMarker RatingBar).() -> Unit): RatingBar {
    return ankoView(`$$Anko$Factories$Sdk15View`.RATING_BAR, theme) { init() }
}

//inline fun ViewGroup.searchView(): SearchView = searchView() {}
//inline fun ViewGroup.searchView(init: (@AnkoViewDslMarker SearchView).() -> Unit): SearchView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.SEARCH_VIEW, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedSearchView(theme: Int = 0): SearchView = themedSearchView(theme) {}
//inline fun ViewGroup.themedSearchView(theme: Int = 0, init: (@AnkoViewDslMarker SearchView).() -> Unit): SearchView {
//return ankoView(`$$Anko$Factories$Sdk15View`.SEARCH_VIEW, theme) { init() }
//}
//
//inline fun Context.searchView(): SearchView = searchView() {}
//inline fun Context.searchView(init: (@AnkoViewDslMarker SearchView).() -> Unit): SearchView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.SEARCH_VIEW, theme = 0) { init() }
//}
//
//inline fun Context.themedSearchView(theme: Int = 0): SearchView = themedSearchView(theme) {}
//inline fun Context.themedSearchView(theme: Int = 0, init: (@AnkoViewDslMarker SearchView).() -> Unit): SearchView {
//return ankoView(`$$Anko$Factories$Sdk15View`.SEARCH_VIEW, theme) { init() }
//}
//
//inline fun Activity.searchView(): SearchView = searchView() {}
//inline fun Activity.searchView(init: (@AnkoViewDslMarker SearchView).() -> Unit): SearchView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.SEARCH_VIEW, theme = 0) { init() }
//}
//
//inline fun Activity.themedSearchView(theme: Int = 0): SearchView = themedSearchView(theme) {}
//inline fun Activity.themedSearchView(theme: Int = 0, init: (@AnkoViewDslMarker SearchView).() -> Unit): SearchView {
//return ankoView(`$$Anko$Factories$Sdk15View`.SEARCH_VIEW, theme) { init() }
//}

inline fun ViewGroup.seekBar(): SeekBar = seekBar() {}
inline fun ViewGroup.seekBar(init: (@AnkoViewDslMarker SeekBar).() -> Unit): SeekBar {
    return ankoView(`$$Anko$Factories$Sdk15View`.SEEK_BAR, theme = 0) { init() }
}

inline fun ViewGroup.themedSeekBar(theme: Int = 0): SeekBar = themedSeekBar(theme) {}
inline fun ViewGroup.themedSeekBar(theme: Int = 0, init: (@AnkoViewDslMarker SeekBar).() -> Unit): SeekBar {
    return ankoView(`$$Anko$Factories$Sdk15View`.SEEK_BAR, theme) { init() }
}

//inline fun ViewGroup.slidingDrawer(): SlidingDrawer = slidingDrawer() {}
//inline fun ViewGroup.slidingDrawer(init: (@AnkoViewDslMarker SlidingDrawer).() -> Unit): SlidingDrawer {
//    return ankoView(`$$Anko$Factories$Sdk15View`.SLIDING_DRAWER, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedSlidingDrawer(theme: Int = 0): SlidingDrawer = themedSlidingDrawer(theme) {}
//inline fun ViewGroup.themedSlidingDrawer(theme: Int = 0, init: (@AnkoViewDslMarker SlidingDrawer).() -> Unit): SlidingDrawer {
//return ankoView(`$$Anko$Factories$Sdk15View`.SLIDING_DRAWER, theme) { init() }
//}
//
//inline fun Context.slidingDrawer(): SlidingDrawer = slidingDrawer() {}
//inline fun Context.slidingDrawer(init: (@AnkoViewDslMarker SlidingDrawer).() -> Unit): SlidingDrawer {
//    return ankoView(`$$Anko$Factories$Sdk15View`.SLIDING_DRAWER, theme = 0) { init() }
//}
//
//inline fun Context.themedSlidingDrawer(theme: Int = 0): SlidingDrawer = themedSlidingDrawer(theme) {}
//inline fun Context.themedSlidingDrawer(theme: Int = 0, init: (@AnkoViewDslMarker SlidingDrawer).() -> Unit): SlidingDrawer {
//return ankoView(`$$Anko$Factories$Sdk15View`.SLIDING_DRAWER, theme) { init() }
//}
//
//inline fun Activity.slidingDrawer(): SlidingDrawer = slidingDrawer() {}
//inline fun Activity.slidingDrawer(init: (@AnkoViewDslMarker SlidingDrawer).() -> Unit): SlidingDrawer {
//    return ankoView(`$$Anko$Factories$Sdk15View`.SLIDING_DRAWER, theme = 0) { init() }
//}
//
//inline fun Activity.themedSlidingDrawer(theme: Int = 0): SlidingDrawer = themedSlidingDrawer(theme) {}
//inline fun Activity.themedSlidingDrawer(theme: Int = 0, init: (@AnkoViewDslMarker SlidingDrawer).() -> Unit): SlidingDrawer {
//return ankoView(`$$Anko$Factories$Sdk15View`.SLIDING_DRAWER, theme) { init() }
//}
//
//inline fun ViewGroup.space(): Space = space() {}
//inline fun ViewGroup.space(init: (@AnkoViewDslMarker Space).() -> Unit): Space {
//    return ankoView(`$$Anko$Factories$Sdk15View`.SPACE, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedSpace(theme: Int = 0): Space = themedSpace(theme) {}
//inline fun ViewGroup.themedSpace(theme: Int = 0, init: (@AnkoViewDslMarker Space).() -> Unit): Space {
//return ankoView(`$$Anko$Factories$Sdk15View`.SPACE, theme) { init() }
//}

inline fun ViewGroup.spinner(): Spinner = spinner() {}
inline fun ViewGroup.spinner(init: (@AnkoViewDslMarker Spinner).() -> Unit): Spinner {
    return ankoView(`$$Anko$Factories$Sdk15View`.SPINNER, theme = 0) { init() }
}

inline fun ViewGroup.themedSpinner(theme: Int = 0): Spinner = themedSpinner(theme) {}
inline fun ViewGroup.themedSpinner(theme: Int = 0, init: (@AnkoViewDslMarker Spinner).() -> Unit): Spinner {
    return ankoView(`$$Anko$Factories$Sdk15View`.SPINNER, theme) { init() }
}

inline fun Context.spinner(): Spinner = spinner() {}
inline fun Context.spinner(init: (@AnkoViewDslMarker Spinner).() -> Unit): Spinner {
    return ankoView(`$$Anko$Factories$Sdk15View`.SPINNER, theme = 0) { init() }
}

inline fun Context.themedSpinner(theme: Int = 0): Spinner = themedSpinner(theme) {}
inline fun Context.themedSpinner(theme: Int = 0, init: (@AnkoViewDslMarker Spinner).() -> Unit): Spinner {
    return ankoView(`$$Anko$Factories$Sdk15View`.SPINNER, theme) { init() }
}

inline fun Activity.spinner(): Spinner = spinner() {}
inline fun Activity.spinner(init: (@AnkoViewDslMarker Spinner).() -> Unit): Spinner {
    return ankoView(`$$Anko$Factories$Sdk15View`.SPINNER, theme = 0) { init() }
}

inline fun Activity.themedSpinner(theme: Int = 0): Spinner = themedSpinner(theme) {}
inline fun Activity.themedSpinner(theme: Int = 0, init: (@AnkoViewDslMarker Spinner).() -> Unit): Spinner {
    return ankoView(`$$Anko$Factories$Sdk15View`.SPINNER, theme) { init() }
}

//inline fun ViewGroup.stackView(): StackView = stackView() {}
//inline fun ViewGroup.stackView(init: (@AnkoViewDslMarker StackView).() -> Unit): StackView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.STACK_VIEW, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedStackView(theme: Int = 0): StackView = themedStackView(theme) {}
//inline fun ViewGroup.themedStackView(theme: Int = 0, init: (@AnkoViewDslMarker StackView).() -> Unit): StackView {
//return ankoView(`$$Anko$Factories$Sdk15View`.STACK_VIEW, theme) { init() }
//}
//
//inline fun Context.stackView(): StackView = stackView() {}
//inline fun Context.stackView(init: (@AnkoViewDslMarker StackView).() -> Unit): StackView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.STACK_VIEW, theme = 0) { init() }
//}
//
//inline fun Context.themedStackView(theme: Int = 0): StackView = themedStackView(theme) {}
//inline fun Context.themedStackView(theme: Int = 0, init: (@AnkoViewDslMarker StackView).() -> Unit): StackView {
//return ankoView(`$$Anko$Factories$Sdk15View`.STACK_VIEW, theme) { init() }
//}
//
//inline fun Activity.stackView(): StackView = stackView() {}
//inline fun Activity.stackView(init: (@AnkoViewDslMarker StackView).() -> Unit): StackView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.STACK_VIEW, theme = 0) { init() }
//}
//
//inline fun Activity.themedStackView(theme: Int = 0): StackView = themedStackView(theme) {}
//inline fun Activity.themedStackView(theme: Int = 0, init: (@AnkoViewDslMarker StackView).() -> Unit): StackView {
//return ankoView(`$$Anko$Factories$Sdk15View`.STACK_VIEW, theme) { init() }
//}
//
//inline fun ViewGroup.switch(): Switch = switch() {}
//inline fun ViewGroup.switch(init: (@AnkoViewDslMarker Switch).() -> Unit): Switch {
//    return ankoView(`$$Anko$Factories$Sdk15View`.SWITCH, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedSwitch(theme: Int = 0): Switch = themedSwitch(theme) {}
//inline fun ViewGroup.themedSwitch(theme: Int = 0, init: (@AnkoViewDslMarker Switch).() -> Unit): Switch {
//return ankoView(`$$Anko$Factories$Sdk15View`.SWITCH, theme) { init() }
//}
//
//inline fun ViewGroup.tabHost(): TabHost = tabHost() {}
//inline fun ViewGroup.tabHost(init: (@AnkoViewDslMarker TabHost).() -> Unit): TabHost {
//    return ankoView(`$$Anko$Factories$Sdk15View`.TAB_HOST, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedTabHost(theme: Int = 0): TabHost = themedTabHost(theme) {}
//inline fun ViewGroup.themedTabHost(theme: Int = 0, init: (@AnkoViewDslMarker TabHost).() -> Unit): TabHost {
//return ankoView(`$$Anko$Factories$Sdk15View`.TAB_HOST, theme) { init() }
//}
//
//inline fun Context.tabHost(): TabHost = tabHost() {}
//inline fun Context.tabHost(init: (@AnkoViewDslMarker TabHost).() -> Unit): TabHost {
//    return ankoView(`$$Anko$Factories$Sdk15View`.TAB_HOST, theme = 0) { init() }
//}
//
//inline fun Context.themedTabHost(theme: Int = 0): TabHost = themedTabHost(theme) {}
//inline fun Context.themedTabHost(theme: Int = 0, init: (@AnkoViewDslMarker TabHost).() -> Unit): TabHost {
//return ankoView(`$$Anko$Factories$Sdk15View`.TAB_HOST, theme) { init() }
//}
//
//inline fun Activity.tabHost(): TabHost = tabHost() {}
//inline fun Activity.tabHost(init: (@AnkoViewDslMarker TabHost).() -> Unit): TabHost {
//    return ankoView(`$$Anko$Factories$Sdk15View`.TAB_HOST, theme = 0) { init() }
//}
//
//inline fun Activity.themedTabHost(theme: Int = 0): TabHost = themedTabHost(theme) {}
//inline fun Activity.themedTabHost(theme: Int = 0, init: (@AnkoViewDslMarker TabHost).() -> Unit): TabHost {
//return ankoView(`$$Anko$Factories$Sdk15View`.TAB_HOST, theme) { init() }
//}
//
//inline fun ViewGroup.tabWidget(): TabWidget = tabWidget() {}
//inline fun ViewGroup.tabWidget(init: (@AnkoViewDslMarker TabWidget).() -> Unit): TabWidget {
//    return ankoView(`$$Anko$Factories$Sdk15View`.TAB_WIDGET, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedTabWidget(theme: Int = 0): TabWidget = themedTabWidget(theme) {}
//inline fun ViewGroup.themedTabWidget(theme: Int = 0, init: (@AnkoViewDslMarker TabWidget).() -> Unit): TabWidget {
//return ankoView(`$$Anko$Factories$Sdk15View`.TAB_WIDGET, theme) { init() }
//}
//
//inline fun Context.tabWidget(): TabWidget = tabWidget() {}
//inline fun Context.tabWidget(init: (@AnkoViewDslMarker TabWidget).() -> Unit): TabWidget {
//    return ankoView(`$$Anko$Factories$Sdk15View`.TAB_WIDGET, theme = 0) { init() }
//}
//
//inline fun Context.themedTabWidget(theme: Int = 0): TabWidget = themedTabWidget(theme) {}
//inline fun Context.themedTabWidget(theme: Int = 0, init: (@AnkoViewDslMarker TabWidget).() -> Unit): TabWidget {
//return ankoView(`$$Anko$Factories$Sdk15View`.TAB_WIDGET, theme) { init() }
//}
//
//inline fun Activity.tabWidget(): TabWidget = tabWidget() {}
//inline fun Activity.tabWidget(init: (@AnkoViewDslMarker TabWidget).() -> Unit): TabWidget {
//    return ankoView(`$$Anko$Factories$Sdk15View`.TAB_WIDGET, theme = 0) { init() }
//}
//
//inline fun Activity.themedTabWidget(theme: Int = 0): TabWidget = themedTabWidget(theme) {}
//inline fun Activity.themedTabWidget(theme: Int = 0, init: (@AnkoViewDslMarker TabWidget).() -> Unit): TabWidget {
//return ankoView(`$$Anko$Factories$Sdk15View`.TAB_WIDGET, theme) { init() }
//}

inline fun ViewGroup.textView(): TextView = textView() {}
inline fun ViewGroup.textView(init: (@AnkoViewDslMarker TextView).() -> Unit): TextView {
    return ankoView(`$$Anko$Factories$Sdk15View`.TEXT_VIEW, theme = 0) { init() }
}

inline fun ViewGroup.themedTextView(theme: Int = 0): TextView = themedTextView(theme) {}
inline fun ViewGroup.themedTextView(theme: Int = 0, init: (@AnkoViewDslMarker TextView).() -> Unit): TextView {
    return ankoView(`$$Anko$Factories$Sdk15View`.TEXT_VIEW, theme) { init() }
}

inline fun ViewGroup.textView(text: String): TextView {
    return ankoView(`$$Anko$Factories$Sdk15View`.TEXT_VIEW, theme = 0) {
        setText(text)
    }
}

inline fun ViewGroup.textView(text: String, init: (@AnkoViewDslMarker TextView).() -> Unit): TextView {
    return ankoView(`$$Anko$Factories$Sdk15View`.TEXT_VIEW, theme = 0) {
        init()
        setText(text)
    }
}

inline fun ViewGroup.themedTextView(text: String, theme: Int): TextView {
    return ankoView(`$$Anko$Factories$Sdk15View`.TEXT_VIEW, theme) {
        setText(text)
    }
}

inline fun ViewGroup.themedTextView(text: String, theme: Int, init: (@AnkoViewDslMarker TextView).() -> Unit): TextView {
    return ankoView(`$$Anko$Factories$Sdk15View`.TEXT_VIEW, theme) {
        init()
        setText(text)
    }
}

inline fun ViewGroup.textView(text: Int): TextView {
    return ankoView(`$$Anko$Factories$Sdk15View`.TEXT_VIEW, theme = 0) {
        setText(text)
    }
}

inline fun ViewGroup.textView(text: Int, init: (@AnkoViewDslMarker TextView).() -> Unit): TextView {
    return ankoView(`$$Anko$Factories$Sdk15View`.TEXT_VIEW, theme = 0) {
        init()
        setText(text)
    }
}

inline fun ViewGroup.themedTextView(text: Int, theme: Int): TextView {
    return ankoView(`$$Anko$Factories$Sdk15View`.TEXT_VIEW, theme) {
        setText(text)
    }
}

inline fun ViewGroup.themedTextView(text: Int, theme: Int, init: (@AnkoViewDslMarker TextView).() -> Unit): TextView {
    return ankoView(`$$Anko$Factories$Sdk15View`.TEXT_VIEW, theme) {
        init()
        setText(text)
    }
}

//inline fun ViewGroup.timePicker(): TimePicker = timePicker() {}
//inline fun ViewGroup.timePicker(init: (@AnkoViewDslMarker TimePicker).() -> Unit): TimePicker {
//    return ankoView(`$$Anko$Factories$Sdk15View`.TIME_PICKER, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedTimePicker(theme: Int = 0): TimePicker = themedTimePicker(theme) {}
//inline fun ViewGroup.themedTimePicker(theme: Int = 0, init: (@AnkoViewDslMarker TimePicker).() -> Unit): TimePicker {
//return ankoView(`$$Anko$Factories$Sdk15View`.TIME_PICKER, theme) { init() }
//}
//
//inline fun Context.timePicker(): TimePicker = timePicker() {}
//inline fun Context.timePicker(init: (@AnkoViewDslMarker TimePicker).() -> Unit): TimePicker {
//    return ankoView(`$$Anko$Factories$Sdk15View`.TIME_PICKER, theme = 0) { init() }
//}
//
//inline fun Context.themedTimePicker(theme: Int = 0): TimePicker = themedTimePicker(theme) {}
//inline fun Context.themedTimePicker(theme: Int = 0, init: (@AnkoViewDslMarker TimePicker).() -> Unit): TimePicker {
//return ankoView(`$$Anko$Factories$Sdk15View`.TIME_PICKER, theme) { init() }
//}
//
//inline fun Activity.timePicker(): TimePicker = timePicker() {}
//inline fun Activity.timePicker(init: (@AnkoViewDslMarker TimePicker).() -> Unit): TimePicker {
//    return ankoView(`$$Anko$Factories$Sdk15View`.TIME_PICKER, theme = 0) { init() }
//}
//
//inline fun Activity.themedTimePicker(theme: Int = 0): TimePicker = themedTimePicker(theme) {}
//inline fun Activity.themedTimePicker(theme: Int = 0, init: (@AnkoViewDslMarker TimePicker).() -> Unit): TimePicker {
//return ankoView(`$$Anko$Factories$Sdk15View`.TIME_PICKER, theme) { init() }
//}
//
//inline fun ViewGroup.toggleButton(): ToggleButton = toggleButton() {}
//inline fun ViewGroup.toggleButton(init: (@AnkoViewDslMarker ToggleButton).() -> Unit): ToggleButton {
//    return ankoView(`$$Anko$Factories$Sdk15View`.TOGGLE_BUTTON, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedToggleButton(theme: Int = 0): ToggleButton = themedToggleButton(theme) {}
//inline fun ViewGroup.themedToggleButton(theme: Int = 0, init: (@AnkoViewDslMarker ToggleButton).() -> Unit): ToggleButton {
//return ankoView(`$$Anko$Factories$Sdk15View`.TOGGLE_BUTTON, theme) { init() }
//}
//
//inline fun ViewGroup.twoLineListItem(): TwoLineListItem = twoLineListItem() {}
//inline fun ViewGroup.twoLineListItem(init: (@AnkoViewDslMarker TwoLineListItem).() -> Unit): TwoLineListItem {
//    return ankoView(`$$Anko$Factories$Sdk15View`.TWO_LINE_LIST_ITEM, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedTwoLineListItem(theme: Int = 0): TwoLineListItem = themedTwoLineListItem(theme) {}
//inline fun ViewGroup.themedTwoLineListItem(theme: Int = 0, init: (@AnkoViewDslMarker TwoLineListItem).() -> Unit): TwoLineListItem {
//return ankoView(`$$Anko$Factories$Sdk15View`.TWO_LINE_LIST_ITEM, theme) { init() }
//}
//
//inline fun Context.twoLineListItem(): TwoLineListItem = twoLineListItem() {}
//inline fun Context.twoLineListItem(init: (@AnkoViewDslMarker TwoLineListItem).() -> Unit): TwoLineListItem {
//    return ankoView(`$$Anko$Factories$Sdk15View`.TWO_LINE_LIST_ITEM, theme = 0) { init() }
//}
//
//inline fun Context.themedTwoLineListItem(theme: Int = 0): TwoLineListItem = themedTwoLineListItem(theme) {}
//inline fun Context.themedTwoLineListItem(theme: Int = 0, init: (@AnkoViewDslMarker TwoLineListItem).() -> Unit): TwoLineListItem {
//return ankoView(`$$Anko$Factories$Sdk15View`.TWO_LINE_LIST_ITEM, theme) { init() }
//}
//
//inline fun Activity.twoLineListItem(): TwoLineListItem = twoLineListItem() {}
//inline fun Activity.twoLineListItem(init: (@AnkoViewDslMarker TwoLineListItem).() -> Unit): TwoLineListItem {
//    return ankoView(`$$Anko$Factories$Sdk15View`.TWO_LINE_LIST_ITEM, theme = 0) { init() }
//}
//
//inline fun Activity.themedTwoLineListItem(theme: Int = 0): TwoLineListItem = themedTwoLineListItem(theme) {}
//inline fun Activity.themedTwoLineListItem(theme: Int = 0, init: (@AnkoViewDslMarker TwoLineListItem).() -> Unit): TwoLineListItem {
//return ankoView(`$$Anko$Factories$Sdk15View`.TWO_LINE_LIST_ITEM, theme) { init() }
//}
//
//inline fun ViewGroup.videoView(): VideoView = videoView() {}
//inline fun ViewGroup.videoView(init: (@AnkoViewDslMarker VideoView).() -> Unit): VideoView {
//    return ankoView(`$$Anko$Factories$Sdk15View`.VIDEO_VIEW, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedVideoView(theme: Int = 0): VideoView = themedVideoView(theme) {}
//inline fun ViewGroup.themedVideoView(theme: Int = 0, init: (@AnkoViewDslMarker VideoView).() -> Unit): VideoView {
//return ankoView(`$$Anko$Factories$Sdk15View`.VIDEO_VIEW, theme) { init() }
//}
//
//inline fun ViewGroup.viewFlipper(): ViewFlipper = viewFlipper() {}
//inline fun ViewGroup.viewFlipper(init: (@AnkoViewDslMarker ViewFlipper).() -> Unit): ViewFlipper {
//    return ankoView(`$$Anko$Factories$Sdk15View`.VIEW_FLIPPER, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedViewFlipper(theme: Int = 0): ViewFlipper = themedViewFlipper(theme) {}
//inline fun ViewGroup.themedViewFlipper(theme: Int = 0, init: (@AnkoViewDslMarker ViewFlipper).() -> Unit): ViewFlipper {
//return ankoView(`$$Anko$Factories$Sdk15View`.VIEW_FLIPPER, theme) { init() }
//}
//
//inline fun Context.viewFlipper(): ViewFlipper = viewFlipper() {}
//inline fun Context.viewFlipper(init: (@AnkoViewDslMarker ViewFlipper).() -> Unit): ViewFlipper {
//    return ankoView(`$$Anko$Factories$Sdk15View`.VIEW_FLIPPER, theme = 0) { init() }
//}
//
//inline fun Context.themedViewFlipper(theme: Int = 0): ViewFlipper = themedViewFlipper(theme) {}
//inline fun Context.themedViewFlipper(theme: Int = 0, init: (@AnkoViewDslMarker ViewFlipper).() -> Unit): ViewFlipper {
//return ankoView(`$$Anko$Factories$Sdk15View`.VIEW_FLIPPER, theme) { init() }
//}
//
//inline fun Activity.viewFlipper(): ViewFlipper = viewFlipper() {}
//inline fun Activity.viewFlipper(init: (@AnkoViewDslMarker ViewFlipper).() -> Unit): ViewFlipper {
//    return ankoView(`$$Anko$Factories$Sdk15View`.VIEW_FLIPPER, theme = 0) { init() }
//}
//
//inline fun Activity.themedViewFlipper(theme: Int = 0): ViewFlipper = themedViewFlipper(theme) {}
//inline fun Activity.themedViewFlipper(theme: Int = 0, init: (@AnkoViewDslMarker ViewFlipper).() -> Unit): ViewFlipper {
//return ankoView(`$$Anko$Factories$Sdk15View`.VIEW_FLIPPER, theme) { init() }
//}
//
//inline fun ViewGroup.zoomButton(): ZoomButton = zoomButton() {}
//inline fun ViewGroup.zoomButton(init: (@AnkoViewDslMarker ZoomButton).() -> Unit): ZoomButton {
//    return ankoView(`$$Anko$Factories$Sdk15View`.ZOOM_BUTTON, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedZoomButton(theme: Int = 0): ZoomButton = themedZoomButton(theme) {}
//inline fun ViewGroup.themedZoomButton(theme: Int = 0, init: (@AnkoViewDslMarker ZoomButton).() -> Unit): ZoomButton {
//return ankoView(`$$Anko$Factories$Sdk15View`.ZOOM_BUTTON, theme) { init() }
//}
//
//inline fun ViewGroup.zoomControls(): ZoomControls = zoomControls() {}
//inline fun ViewGroup.zoomControls(init: (@AnkoViewDslMarker ZoomControls).() -> Unit): ZoomControls {
//    return ankoView(`$$Anko$Factories$Sdk15View`.ZOOM_CONTROLS, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedZoomControls(theme: Int = 0): ZoomControls = themedZoomControls(theme) {}
//inline fun ViewGroup.themedZoomControls(theme: Int = 0, init: (@AnkoViewDslMarker ZoomControls).() -> Unit): ZoomControls {
//return ankoView(`$$Anko$Factories$Sdk15View`.ZOOM_CONTROLS, theme) { init() }
//}
//
//inline fun Context.zoomControls(): ZoomControls = zoomControls() {}
//inline fun Context.zoomControls(init: (@AnkoViewDslMarker ZoomControls).() -> Unit): ZoomControls {
//    return ankoView(`$$Anko$Factories$Sdk15View`.ZOOM_CONTROLS, theme = 0) { init() }
//}
//
//inline fun Context.themedZoomControls(theme: Int = 0): ZoomControls = themedZoomControls(theme) {}
//inline fun Context.themedZoomControls(theme: Int = 0, init: (@AnkoViewDslMarker ZoomControls).() -> Unit): ZoomControls {
//return ankoView(`$$Anko$Factories$Sdk15View`.ZOOM_CONTROLS, theme) { init() }
//}
//
//inline fun Activity.zoomControls(): ZoomControls = zoomControls() {}
//inline fun Activity.zoomControls(init: (@AnkoViewDslMarker ZoomControls).() -> Unit): ZoomControls {
//    return ankoView(`$$Anko$Factories$Sdk15View`.ZOOM_CONTROLS, theme = 0) { init() }
//}
//
//inline fun Activity.themedZoomControls(theme: Int = 0): ZoomControls = themedZoomControls(theme) {}
//inline fun Activity.themedZoomControls(theme: Int = 0, init: (@AnkoViewDslMarker ZoomControls).() -> Unit): ZoomControls {
//return ankoView(`$$Anko$Factories$Sdk15View`.ZOOM_CONTROLS, theme) { init() }
//}

@PublishedApi
internal object `$$Anko$Factories$Sdk15ViewGroup` {
    //    val APP_WIDGET_HOST_VIEW = { ctx: Context -> _AppWidgetHostView(ctx) }
    val WEB_VIEW = { ctx: Context -> _WebView(ctx) }
    //    val ABSOLUTE_LAYOUT = { ctx: Context -> _AbsoluteLayout(ctx) }
    val FRAME_LAYOUT = { ctx: Context -> _FrameLayout(ctx) }
    //    val GALLERY = { ctx: Context -> _Gallery(ctx) }
//    val GRID_LAYOUT = { ctx: Context -> _GridLayout(ctx) }
    val GRID_VIEW = { ctx: Context -> _GridView(ctx) }
    val HORIZONTAL_SCROLL_VIEW = { ctx: Context -> _HorizontalScrollView(ctx) }
    //    val IMAGE_SWITCHER = { ctx: Context -> _ImageSwitcher(ctx) }
    val LINEAR_LAYOUT = { ctx: Context -> _LinearLayout(ctx) }
    val RADIO_GROUP = { ctx: Context -> _RadioGroup(ctx) }
    val RELATIVE_LAYOUT = { ctx: Context -> _RelativeLayout(ctx) }
    val SCROLL_VIEW = { ctx: Context -> _ScrollView(ctx) }
//    val TABLE_LAYOUT = { ctx: Context -> _TableLayout(ctx) }
//    val TABLE_ROW = { ctx: Context -> _TableRow(ctx) }
//    val TEXT_SWITCHER = { ctx: Context -> _TextSwitcher(ctx) }
//    val VIEW_ANIMATOR = { ctx: Context -> _ViewAnimator(ctx) }
//    val VIEW_SWITCHER = { ctx: Context -> _ViewSwitcher(ctx) }
}

//inline fun ViewGroup.appWidgetHostView(): android.appwidget.AppWidgetHostView = appWidgetHostView() {}
//inline fun ViewGroup.appWidgetHostView(init: (@AnkoViewDslMarker _AppWidgetHostView).() -> Unit): android.appwidget.AppWidgetHostView {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.APP_WIDGET_HOST_VIEW, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedAppWidgetHostView(theme: Int = 0): android.appwidget.AppWidgetHostView = themedAppWidgetHostView(theme) {}
//inline fun ViewGroup.themedAppWidgetHostView(theme: Int = 0, init: (@AnkoViewDslMarker _AppWidgetHostView).() -> Unit): android.appwidget.AppWidgetHostView {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.APP_WIDGET_HOST_VIEW, theme) { init() }
//}
//
//inline fun Context.appWidgetHostView(): android.appwidget.AppWidgetHostView = appWidgetHostView() {}
//inline fun Context.appWidgetHostView(init: (@AnkoViewDslMarker _AppWidgetHostView).() -> Unit): android.appwidget.AppWidgetHostView {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.APP_WIDGET_HOST_VIEW, theme = 0) { init() }
//}
//
//inline fun Context.themedAppWidgetHostView(theme: Int = 0): android.appwidget.AppWidgetHostView = themedAppWidgetHostView(theme) {}
//inline fun Context.themedAppWidgetHostView(theme: Int = 0, init: (@AnkoViewDslMarker _AppWidgetHostView).() -> Unit): android.appwidget.AppWidgetHostView {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.APP_WIDGET_HOST_VIEW, theme) { init() }
//}
//
//inline fun Activity.appWidgetHostView(): android.appwidget.AppWidgetHostView = appWidgetHostView() {}
//inline fun Activity.appWidgetHostView(init: (@AnkoViewDslMarker _AppWidgetHostView).() -> Unit): android.appwidget.AppWidgetHostView {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.APP_WIDGET_HOST_VIEW, theme = 0) { init() }
//}
//
//inline fun Activity.themedAppWidgetHostView(theme: Int = 0): android.appwidget.AppWidgetHostView = themedAppWidgetHostView(theme) {}
//inline fun Activity.themedAppWidgetHostView(theme: Int = 0, init: (@AnkoViewDslMarker _AppWidgetHostView).() -> Unit): android.appwidget.AppWidgetHostView {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.APP_WIDGET_HOST_VIEW, theme) { init() }
//}
inline fun UI.webView(): android.webkit.WebView = webView() {}

inline fun UI.webView(init: (@AnkoViewDslMarker _WebView).() -> Unit): android.webkit.WebView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.WEB_VIEW, theme = 0) { init() }
}

inline fun UI.themedWebView(theme: Int = 0): android.webkit.WebView = themedWebView(theme) {}
inline fun UI.themedWebView(theme: Int = 0, init: (@AnkoViewDslMarker _WebView).() -> Unit): android.webkit.WebView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.WEB_VIEW, theme) { init() }
}

inline fun ViewGroup.webView(): android.webkit.WebView = webView() {}
inline fun ViewGroup.webView(init: (@AnkoViewDslMarker _WebView).() -> Unit): android.webkit.WebView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.WEB_VIEW, theme = 0) { init() }
}

inline fun ViewGroup.themedWebView(theme: Int = 0): android.webkit.WebView = themedWebView(theme) {}
inline fun ViewGroup.themedWebView(theme: Int = 0, init: (@AnkoViewDslMarker _WebView).() -> Unit): android.webkit.WebView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.WEB_VIEW, theme) { init() }
}

inline fun Context.webView(): android.webkit.WebView = webView() {}
inline fun Context.webView(init: (@AnkoViewDslMarker _WebView).() -> Unit): android.webkit.WebView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.WEB_VIEW, theme = 0) { init() }
}

inline fun Context.themedWebView(theme: Int = 0): android.webkit.WebView = themedWebView(theme) {}
inline fun Context.themedWebView(theme: Int = 0, init: (@AnkoViewDslMarker _WebView).() -> Unit): android.webkit.WebView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.WEB_VIEW, theme) { init() }
}

inline fun Activity.webView(): android.webkit.WebView = webView() {}
inline fun Activity.webView(init: (@AnkoViewDslMarker _WebView).() -> Unit): android.webkit.WebView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.WEB_VIEW, theme = 0) { init() }
}

inline fun Activity.themedWebView(theme: Int = 0): android.webkit.WebView = themedWebView(theme) {}
inline fun Activity.themedWebView(theme: Int = 0, init: (@AnkoViewDslMarker _WebView).() -> Unit): android.webkit.WebView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.WEB_VIEW, theme) { init() }
}

//inline fun ViewGroup.absoluteLayout(): AbsoluteLayout = absoluteLayout() {}
//inline fun ViewGroup.absoluteLayout(init: (@AnkoViewDslMarker _AbsoluteLayout).() -> Unit): AbsoluteLayout {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.ABSOLUTE_LAYOUT, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedAbsoluteLayout(theme: Int = 0): AbsoluteLayout = themedAbsoluteLayout(theme) {}
//inline fun ViewGroup.themedAbsoluteLayout(theme: Int = 0, init: (@AnkoViewDslMarker _AbsoluteLayout).() -> Unit): AbsoluteLayout {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.ABSOLUTE_LAYOUT, theme) { init() }
//}
//
//inline fun Context.absoluteLayout(): AbsoluteLayout = absoluteLayout() {}
//inline fun Context.absoluteLayout(init: (@AnkoViewDslMarker _AbsoluteLayout).() -> Unit): AbsoluteLayout {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.ABSOLUTE_LAYOUT, theme = 0) { init() }
//}
//
//inline fun Context.themedAbsoluteLayout(theme: Int = 0): AbsoluteLayout = themedAbsoluteLayout(theme) {}
//inline fun Context.themedAbsoluteLayout(theme: Int = 0, init: (@AnkoViewDslMarker _AbsoluteLayout).() -> Unit): AbsoluteLayout {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.ABSOLUTE_LAYOUT, theme) { init() }
//}
//
//inline fun Activity.absoluteLayout(): AbsoluteLayout = absoluteLayout() {}
//inline fun Activity.absoluteLayout(init: (@AnkoViewDslMarker _AbsoluteLayout).() -> Unit): AbsoluteLayout {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.ABSOLUTE_LAYOUT, theme = 0) { init() }
//}
//
//inline fun Activity.themedAbsoluteLayout(theme: Int = 0): AbsoluteLayout = themedAbsoluteLayout(theme) {}
//inline fun Activity.themedAbsoluteLayout(theme: Int = 0, init: (@AnkoViewDslMarker _AbsoluteLayout).() -> Unit): AbsoluteLayout {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.ABSOLUTE_LAYOUT, theme) { init() }
//}


inline fun UI.frameLayout(): FrameLayout = frameLayout() {}
inline fun UI.frameLayout(init: (@AnkoViewDslMarker _FrameLayout).() -> Unit): FrameLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.FRAME_LAYOUT, theme = 0) { init() }
}

inline fun UI.themedFrameLayout(theme: Int = 0): FrameLayout = themedFrameLayout(theme) {}
inline fun UI.themedFrameLayout(theme: Int = 0, init: (@AnkoViewDslMarker _FrameLayout).() -> Unit): FrameLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.FRAME_LAYOUT, theme) { init() }
}

inline fun ViewGroup.frameLayout(): FrameLayout = frameLayout() {}
inline fun ViewGroup.frameLayout(init: (@AnkoViewDslMarker _FrameLayout).() -> Unit): FrameLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.FRAME_LAYOUT, theme = 0) { init() }
}

inline fun ViewGroup.themedFrameLayout(theme: Int = 0): FrameLayout = themedFrameLayout(theme) {}
inline fun ViewGroup.themedFrameLayout(theme: Int = 0, init: (@AnkoViewDslMarker _FrameLayout).() -> Unit): FrameLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.FRAME_LAYOUT, theme) { init() }
}

inline fun Context.frameLayout(): FrameLayout = frameLayout() {}
inline fun Context.frameLayout(init: (@AnkoViewDslMarker _FrameLayout).() -> Unit): FrameLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.FRAME_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedFrameLayout(theme: Int = 0): FrameLayout = themedFrameLayout(theme) {}
inline fun Context.themedFrameLayout(theme: Int = 0, init: (@AnkoViewDslMarker _FrameLayout).() -> Unit): FrameLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.FRAME_LAYOUT, theme) { init() }
}

inline fun Activity.frameLayout(): FrameLayout = frameLayout() {}
inline fun Activity.frameLayout(init: (@AnkoViewDslMarker _FrameLayout).() -> Unit): FrameLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.FRAME_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedFrameLayout(theme: Int = 0): FrameLayout = themedFrameLayout(theme) {}
inline fun Activity.themedFrameLayout(theme: Int = 0, init: (@AnkoViewDslMarker _FrameLayout).() -> Unit): FrameLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.FRAME_LAYOUT, theme) { init() }
}

//inline fun ViewGroup.gallery(): Gallery = gallery() {}
//inline fun ViewGroup.gallery(init: (@AnkoViewDslMarker _Gallery).() -> Unit): Gallery {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GALLERY, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedGallery(theme: Int = 0): Gallery = themedGallery(theme) {}
//inline fun ViewGroup.themedGallery(theme: Int = 0, init: (@AnkoViewDslMarker _Gallery).() -> Unit): Gallery {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GALLERY, theme) { init() }
//}
//
//inline fun Context.gallery(): Gallery = gallery() {}
//inline fun Context.gallery(init: (@AnkoViewDslMarker _Gallery).() -> Unit): Gallery {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GALLERY, theme = 0) { init() }
//}
//
//inline fun Context.themedGallery(theme: Int = 0): Gallery = themedGallery(theme) {}
//inline fun Context.themedGallery(theme: Int = 0, init: (@AnkoViewDslMarker _Gallery).() -> Unit): Gallery {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GALLERY, theme) { init() }
//}
//
//inline fun Activity.gallery(): Gallery = gallery() {}
//inline fun Activity.gallery(init: (@AnkoViewDslMarker _Gallery).() -> Unit): Gallery {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GALLERY, theme = 0) { init() }
//}
//
//inline fun Activity.themedGallery(theme: Int = 0): Gallery = themedGallery(theme) {}
//inline fun Activity.themedGallery(theme: Int = 0, init: (@AnkoViewDslMarker _Gallery).() -> Unit): Gallery {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GALLERY, theme) { init() }
//}
//
//inline fun ViewGroup.gridLayout(): GridLayout = gridLayout() {}
//inline fun ViewGroup.gridLayout(init: (@AnkoViewDslMarker _GridLayout).() -> Unit): GridLayout {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GRID_LAYOUT, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedGridLayout(theme: Int = 0): GridLayout = themedGridLayout(theme) {}
//inline fun ViewGroup.themedGridLayout(theme: Int = 0, init: (@AnkoViewDslMarker _GridLayout).() -> Unit): GridLayout {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GRID_LAYOUT, theme) { init() }
//}
//
//inline fun Context.gridLayout(): GridLayout = gridLayout() {}
//inline fun Context.gridLayout(init: (@AnkoViewDslMarker _GridLayout).() -> Unit): GridLayout {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GRID_LAYOUT, theme = 0) { init() }
//}
//
//inline fun Context.themedGridLayout(theme: Int = 0): GridLayout = themedGridLayout(theme) {}
//inline fun Context.themedGridLayout(theme: Int = 0, init: (@AnkoViewDslMarker _GridLayout).() -> Unit): GridLayout {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GRID_LAYOUT, theme) { init() }
//}
//
//inline fun Activity.gridLayout(): GridLayout = gridLayout() {}
//inline fun Activity.gridLayout(init: (@AnkoViewDslMarker _GridLayout).() -> Unit): GridLayout {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GRID_LAYOUT, theme = 0) { init() }
//}
//
//inline fun Activity.themedGridLayout(theme: Int = 0): GridLayout = themedGridLayout(theme) {}
//inline fun Activity.themedGridLayout(theme: Int = 0, init: (@AnkoViewDslMarker _GridLayout).() -> Unit): GridLayout {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GRID_LAYOUT, theme) { init() }
//}

inline fun UI.gridView(): GridView = gridView() {}
inline fun UI.gridView(init: (@AnkoViewDslMarker _GridView).() -> Unit): GridView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GRID_VIEW, theme = 0) { init() }
}

inline fun UI.themedGridView(theme: Int = 0): GridView = themedGridView(theme) {}
inline fun UI.themedGridView(theme: Int = 0, init: (@AnkoViewDslMarker _GridView).() -> Unit): GridView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GRID_VIEW, theme) { init() }
}

inline fun ViewGroup.gridView(): GridView = gridView() {}
inline fun ViewGroup.gridView(init: (@AnkoViewDslMarker _GridView).() -> Unit): GridView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GRID_VIEW, theme = 0) { init() }
}

inline fun ViewGroup.themedGridView(theme: Int = 0): GridView = themedGridView(theme) {}
inline fun ViewGroup.themedGridView(theme: Int = 0, init: (@AnkoViewDslMarker _GridView).() -> Unit): GridView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GRID_VIEW, theme) { init() }
}

inline fun Context.gridView(): GridView = gridView() {}
inline fun Context.gridView(init: (@AnkoViewDslMarker _GridView).() -> Unit): GridView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GRID_VIEW, theme = 0) { init() }
}

inline fun Context.themedGridView(theme: Int = 0): GridView = themedGridView(theme) {}
inline fun Context.themedGridView(theme: Int = 0, init: (@AnkoViewDslMarker _GridView).() -> Unit): GridView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GRID_VIEW, theme) { init() }
}

inline fun Activity.gridView(): GridView = gridView() {}
inline fun Activity.gridView(init: (@AnkoViewDslMarker _GridView).() -> Unit): GridView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GRID_VIEW, theme = 0) { init() }
}

inline fun Activity.themedGridView(theme: Int = 0): GridView = themedGridView(theme) {}
inline fun Activity.themedGridView(theme: Int = 0, init: (@AnkoViewDslMarker _GridView).() -> Unit): GridView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.GRID_VIEW, theme) { init() }
}

inline fun UI.horizontalScrollView(): HorizontalScrollView = horizontalScrollView() {}
inline fun UI.horizontalScrollView(init: (@AnkoViewDslMarker _HorizontalScrollView).() -> Unit): HorizontalScrollView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.HORIZONTAL_SCROLL_VIEW, theme = 0) { init() }
}

inline fun UI.themedHorizontalScrollView(theme: Int = 0): HorizontalScrollView = themedHorizontalScrollView(theme) {}
inline fun UI.themedHorizontalScrollView(theme: Int = 0, init: (@AnkoViewDslMarker _HorizontalScrollView).() -> Unit): HorizontalScrollView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.HORIZONTAL_SCROLL_VIEW, theme) { init() }
}

inline fun ViewGroup.horizontalScrollView(): HorizontalScrollView = horizontalScrollView() {}
inline fun ViewGroup.horizontalScrollView(init: (@AnkoViewDslMarker _HorizontalScrollView).() -> Unit): HorizontalScrollView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.HORIZONTAL_SCROLL_VIEW, theme = 0) { init() }
}

inline fun ViewGroup.themedHorizontalScrollView(theme: Int = 0): HorizontalScrollView = themedHorizontalScrollView(theme) {}
inline fun ViewGroup.themedHorizontalScrollView(theme: Int = 0, init: (@AnkoViewDslMarker _HorizontalScrollView).() -> Unit): HorizontalScrollView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.HORIZONTAL_SCROLL_VIEW, theme) { init() }
}

inline fun Context.horizontalScrollView(): HorizontalScrollView = horizontalScrollView() {}
inline fun Context.horizontalScrollView(init: (@AnkoViewDslMarker _HorizontalScrollView).() -> Unit): HorizontalScrollView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.HORIZONTAL_SCROLL_VIEW, theme = 0) { init() }
}

inline fun Context.themedHorizontalScrollView(theme: Int = 0): HorizontalScrollView = themedHorizontalScrollView(theme) {}
inline fun Context.themedHorizontalScrollView(theme: Int = 0, init: (@AnkoViewDslMarker _HorizontalScrollView).() -> Unit): HorizontalScrollView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.HORIZONTAL_SCROLL_VIEW, theme) { init() }
}

inline fun Activity.horizontalScrollView(): HorizontalScrollView = horizontalScrollView() {}
inline fun Activity.horizontalScrollView(init: (@AnkoViewDslMarker _HorizontalScrollView).() -> Unit): HorizontalScrollView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.HORIZONTAL_SCROLL_VIEW, theme = 0) { init() }
}

inline fun Activity.themedHorizontalScrollView(theme: Int = 0): HorizontalScrollView = themedHorizontalScrollView(theme) {}
inline fun Activity.themedHorizontalScrollView(theme: Int = 0, init: (@AnkoViewDslMarker _HorizontalScrollView).() -> Unit): HorizontalScrollView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.HORIZONTAL_SCROLL_VIEW, theme) { init() }
}

//inline fun ViewGroup.imageSwitcher(): ImageSwitcher = imageSwitcher() {}
//inline fun ViewGroup.imageSwitcher(init: (@AnkoViewDslMarker _ImageSwitcher).() -> Unit): ImageSwitcher {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.IMAGE_SWITCHER, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedImageSwitcher(theme: Int = 0): ImageSwitcher = themedImageSwitcher(theme) {}
//inline fun ViewGroup.themedImageSwitcher(theme: Int = 0, init: (@AnkoViewDslMarker _ImageSwitcher).() -> Unit): ImageSwitcher {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.IMAGE_SWITCHER, theme) { init() }
//}
//
//inline fun Context.imageSwitcher(): ImageSwitcher = imageSwitcher() {}
//inline fun Context.imageSwitcher(init: (@AnkoViewDslMarker _ImageSwitcher).() -> Unit): ImageSwitcher {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.IMAGE_SWITCHER, theme = 0) { init() }
//}
//
//inline fun Context.themedImageSwitcher(theme: Int = 0): ImageSwitcher = themedImageSwitcher(theme) {}
//inline fun Context.themedImageSwitcher(theme: Int = 0, init: (@AnkoViewDslMarker _ImageSwitcher).() -> Unit): ImageSwitcher {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.IMAGE_SWITCHER, theme) { init() }
//}
//
//inline fun Activity.imageSwitcher(): ImageSwitcher = imageSwitcher() {}
//inline fun Activity.imageSwitcher(init: (@AnkoViewDslMarker _ImageSwitcher).() -> Unit): ImageSwitcher {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.IMAGE_SWITCHER, theme = 0) { init() }
//}
//
//inline fun Activity.themedImageSwitcher(theme: Int = 0): ImageSwitcher = themedImageSwitcher(theme) {}
//inline fun Activity.themedImageSwitcher(theme: Int = 0, init: (@AnkoViewDslMarker _ImageSwitcher).() -> Unit): ImageSwitcher {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.IMAGE_SWITCHER, theme) { init() }
//}


inline fun UI.verticalLayout(): LinearLayout = verticalLayout() {}
inline fun UI.verticalLayout(init: (@AnkoViewDslMarker _LinearLayout).() -> Unit): LinearLayout {
    val view = ankoView(`$$Anko$Factories$Sdk15ViewGroup`.LINEAR_LAYOUT, theme = 0) { init() }
    view.setVertical()
    return view
}


inline fun UI.themedVerticalLayout(theme: Int = 0): LinearLayout = themedVerticalLayout(theme) {}
inline fun UI.themedVerticalLayout(theme: Int = 0, init: (@AnkoViewDslMarker _LinearLayout).() -> Unit): LinearLayout {
    val view = ankoView(`$$Anko$Factories$Sdk15ViewGroup`.LINEAR_LAYOUT, theme) { init() }
    view.setVertical()
    return view
}

inline fun UI.linearLayout(): LinearLayout = linearLayout() {}
inline fun UI.linearLayout(init: (@AnkoViewDslMarker _LinearLayout).() -> Unit): LinearLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.LINEAR_LAYOUT, theme = 0) { init() }
}


inline fun UI.themedLinearLayout(theme: Int = 0): LinearLayout = themedLinearLayout(theme) {}
inline fun UI.themedLinearLayout(theme: Int = 0, init: (@AnkoViewDslMarker _LinearLayout).() -> Unit): LinearLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.LINEAR_LAYOUT, theme) { init() }
}

inline fun ViewGroup.verticalLayout(): LinearLayout = verticalLayout() {}
inline fun ViewGroup.verticalLayout(init: (@AnkoViewDslMarker _LinearLayout).() -> Unit): LinearLayout {
    val view = ankoView(`$$Anko$Factories$Sdk15ViewGroup`.LINEAR_LAYOUT, theme = 0) { init() }
    view.setVertical()
    return view
}

inline fun ViewGroup.linearLayout(): LinearLayout = linearLayout() {}
inline fun ViewGroup.linearLayout(init: (@AnkoViewDslMarker _LinearLayout).() -> Unit): LinearLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.LINEAR_LAYOUT, theme = 0) { init() }
}

inline fun ViewGroup.themedLinearLayout(theme: Int = 0): LinearLayout = themedLinearLayout(theme) {}
inline fun ViewGroup.themedLinearLayout(theme: Int = 0, init: (@AnkoViewDslMarker _LinearLayout).() -> Unit): LinearLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.LINEAR_LAYOUT, theme) { init() }
}

inline fun Context.linearLayout(): LinearLayout = linearLayout() {}
inline fun Context.linearLayout(init: (@AnkoViewDslMarker _LinearLayout).() -> Unit): LinearLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.LINEAR_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedLinearLayout(theme: Int = 0): LinearLayout = themedLinearLayout(theme) {}
inline fun Context.themedLinearLayout(theme: Int = 0, init: (@AnkoViewDslMarker _LinearLayout).() -> Unit): LinearLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.LINEAR_LAYOUT, theme) { init() }
}

inline fun Activity.linearLayout(): LinearLayout = linearLayout() {}
inline fun Activity.linearLayout(init: (@AnkoViewDslMarker _LinearLayout).() -> Unit): LinearLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.LINEAR_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedLinearLayout(theme: Int = 0): LinearLayout = themedLinearLayout(theme) {}
inline fun Activity.themedLinearLayout(theme: Int = 0, init: (@AnkoViewDslMarker _LinearLayout).() -> Unit): LinearLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.LINEAR_LAYOUT, theme) { init() }
}

inline fun UI.radioGroup(): RadioGroup = radioGroup() {}
inline fun UI.radioGroup(init: (@AnkoViewDslMarker _RadioGroup).() -> Unit): RadioGroup {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RADIO_GROUP, theme = 0) { init() }
}

inline fun UI.themedRadioGroup(theme: Int = 0): RadioGroup = themedRadioGroup(theme) {}
inline fun UI.themedRadioGroup(theme: Int = 0, init: (@AnkoViewDslMarker _RadioGroup).() -> Unit): RadioGroup {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RADIO_GROUP, theme) { init() }
}

inline fun ViewGroup.radioGroup(): RadioGroup = radioGroup() {}
inline fun ViewGroup.radioGroup(init: (@AnkoViewDslMarker _RadioGroup).() -> Unit): RadioGroup {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RADIO_GROUP, theme = 0) { init() }
}

inline fun ViewGroup.themedRadioGroup(theme: Int = 0): RadioGroup = themedRadioGroup(theme) {}
inline fun ViewGroup.themedRadioGroup(theme: Int = 0, init: (@AnkoViewDslMarker _RadioGroup).() -> Unit): RadioGroup {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RADIO_GROUP, theme) { init() }
}

inline fun Context.radioGroup(): RadioGroup = radioGroup() {}
inline fun Context.radioGroup(init: (@AnkoViewDslMarker _RadioGroup).() -> Unit): RadioGroup {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RADIO_GROUP, theme = 0) { init() }
}

inline fun Context.themedRadioGroup(theme: Int = 0): RadioGroup = themedRadioGroup(theme) {}
inline fun Context.themedRadioGroup(theme: Int = 0, init: (@AnkoViewDslMarker _RadioGroup).() -> Unit): RadioGroup {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RADIO_GROUP, theme) { init() }
}

inline fun Activity.radioGroup(): RadioGroup = radioGroup() {}
inline fun Activity.radioGroup(init: (@AnkoViewDslMarker _RadioGroup).() -> Unit): RadioGroup {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RADIO_GROUP, theme = 0) { init() }
}

inline fun Activity.themedRadioGroup(theme: Int = 0): RadioGroup = themedRadioGroup(theme) {}
inline fun Activity.themedRadioGroup(theme: Int = 0, init: (@AnkoViewDslMarker _RadioGroup).() -> Unit): RadioGroup {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RADIO_GROUP, theme) { init() }
}


inline fun UI.relativeLayout(): RelativeLayout = relativeLayout() {}
inline fun UI.relativeLayout(init: (@AnkoViewDslMarker _RelativeLayout).() -> Unit): RelativeLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RELATIVE_LAYOUT, theme = 0) { init() }
}

inline fun UI.themedRelativeLayout(theme: Int = 0): RelativeLayout = themedRelativeLayout(theme) {}
inline fun UI.themedRelativeLayout(theme: Int = 0, init: (@AnkoViewDslMarker _RelativeLayout).() -> Unit): RelativeLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RELATIVE_LAYOUT, theme) { init() }
}

inline fun ViewGroup.relativeLayout(): RelativeLayout = relativeLayout() {}
inline fun ViewGroup.relativeLayout(init: (@AnkoViewDslMarker _RelativeLayout).() -> Unit): RelativeLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RELATIVE_LAYOUT, theme = 0) { init() }
}

inline fun ViewGroup.themedRelativeLayout(theme: Int = 0): RelativeLayout = themedRelativeLayout(theme) {}
inline fun ViewGroup.themedRelativeLayout(theme: Int = 0, init: (@AnkoViewDslMarker _RelativeLayout).() -> Unit): RelativeLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RELATIVE_LAYOUT, theme) { init() }
}

inline fun Context.relativeLayout(): RelativeLayout = relativeLayout() {}
inline fun Context.relativeLayout(init: (@AnkoViewDslMarker _RelativeLayout).() -> Unit): RelativeLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RELATIVE_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedRelativeLayout(theme: Int = 0): RelativeLayout = themedRelativeLayout(theme) {}
inline fun Context.themedRelativeLayout(theme: Int = 0, init: (@AnkoViewDslMarker _RelativeLayout).() -> Unit): RelativeLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RELATIVE_LAYOUT, theme) { init() }
}

inline fun Activity.relativeLayout(): RelativeLayout = relativeLayout() {}
inline fun Activity.relativeLayout(init: (@AnkoViewDslMarker _RelativeLayout).() -> Unit): RelativeLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RELATIVE_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedRelativeLayout(theme: Int = 0): RelativeLayout = themedRelativeLayout(theme) {}
inline fun Activity.themedRelativeLayout(theme: Int = 0, init: (@AnkoViewDslMarker _RelativeLayout).() -> Unit): RelativeLayout {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RELATIVE_LAYOUT, theme) { init() }
}

inline fun UI.scrollView(): ScrollView = scrollView() {}
inline fun UI.scrollView(init: (@AnkoViewDslMarker _ScrollView).() -> Unit): ScrollView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.SCROLL_VIEW, theme = 0) { init() }
}

inline fun UI.themedScrollView(theme: Int = 0): ScrollView = themedScrollView(theme) {}
inline fun UI.themedScrollView(theme: Int = 0, init: (@AnkoViewDslMarker _ScrollView).() -> Unit): ScrollView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.SCROLL_VIEW, theme) { init() }
}

inline fun ViewGroup.scrollView(): ScrollView = scrollView() {}
inline fun ViewGroup.scrollView(init: (@AnkoViewDslMarker _ScrollView).() -> Unit): ScrollView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.SCROLL_VIEW, theme = 0) { init() }
}

inline fun ViewGroup.themedScrollView(theme: Int = 0): ScrollView = themedScrollView(theme) {}
inline fun ViewGroup.themedScrollView(theme: Int = 0, init: (@AnkoViewDslMarker _ScrollView).() -> Unit): ScrollView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.SCROLL_VIEW, theme) { init() }
}

inline fun Context.scrollView(): ScrollView = scrollView() {}
inline fun Context.scrollView(init: (@AnkoViewDslMarker _ScrollView).() -> Unit): ScrollView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.SCROLL_VIEW, theme = 0) { init() }
}

inline fun Context.themedScrollView(theme: Int = 0): ScrollView = themedScrollView(theme) {}
inline fun Context.themedScrollView(theme: Int = 0, init: (@AnkoViewDslMarker _ScrollView).() -> Unit): ScrollView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.SCROLL_VIEW, theme) { init() }
}

inline fun Activity.scrollView(): ScrollView = scrollView() {}
inline fun Activity.scrollView(init: (@AnkoViewDslMarker _ScrollView).() -> Unit): ScrollView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.SCROLL_VIEW, theme = 0) { init() }
}

inline fun Activity.themedScrollView(theme: Int = 0): ScrollView = themedScrollView(theme) {}
inline fun Activity.themedScrollView(theme: Int = 0, init: (@AnkoViewDslMarker _ScrollView).() -> Unit): ScrollView {
    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.SCROLL_VIEW, theme) { init() }
}

//inline fun ViewGroup.tableLayout(): TableLayout = tableLayout() {}
//inline fun ViewGroup.tableLayout(init: (@AnkoViewDslMarker _TableLayout).() -> Unit): TableLayout {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TABLE_LAYOUT, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedTableLayout(theme: Int = 0): TableLayout = themedTableLayout(theme) {}
//inline fun ViewGroup.themedTableLayout(theme: Int = 0, init: (@AnkoViewDslMarker _TableLayout).() -> Unit): TableLayout {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TABLE_LAYOUT, theme) { init() }
//}
//
//inline fun Context.tableLayout(): TableLayout = tableLayout() {}
//inline fun Context.tableLayout(init: (@AnkoViewDslMarker _TableLayout).() -> Unit): TableLayout {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TABLE_LAYOUT, theme = 0) { init() }
//}
//
//inline fun Context.themedTableLayout(theme: Int = 0): TableLayout = themedTableLayout(theme) {}
//inline fun Context.themedTableLayout(theme: Int = 0, init: (@AnkoViewDslMarker _TableLayout).() -> Unit): TableLayout {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TABLE_LAYOUT, theme) { init() }
//}
//
//inline fun Activity.tableLayout(): TableLayout = tableLayout() {}
//inline fun Activity.tableLayout(init: (@AnkoViewDslMarker _TableLayout).() -> Unit): TableLayout {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TABLE_LAYOUT, theme = 0) { init() }
//}
//
//inline fun Activity.themedTableLayout(theme: Int = 0): TableLayout = themedTableLayout(theme) {}
//inline fun Activity.themedTableLayout(theme: Int = 0, init: (@AnkoViewDslMarker _TableLayout).() -> Unit): TableLayout {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TABLE_LAYOUT, theme) { init() }
//}
//
//inline fun ViewGroup.tableRow(): TableRow = tableRow() {}
//inline fun ViewGroup.tableRow(init: (@AnkoViewDslMarker _TableRow).() -> Unit): TableRow {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TABLE_ROW, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedTableRow(theme: Int = 0): TableRow = themedTableRow(theme) {}
//inline fun ViewGroup.themedTableRow(theme: Int = 0, init: (@AnkoViewDslMarker _TableRow).() -> Unit): TableRow {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TABLE_ROW, theme) { init() }
//}
//
//inline fun Context.tableRow(): TableRow = tableRow() {}
//inline fun Context.tableRow(init: (@AnkoViewDslMarker _TableRow).() -> Unit): TableRow {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TABLE_ROW, theme = 0) { init() }
//}
//
//inline fun Context.themedTableRow(theme: Int = 0): TableRow = themedTableRow(theme) {}
//inline fun Context.themedTableRow(theme: Int = 0, init: (@AnkoViewDslMarker _TableRow).() -> Unit): TableRow {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TABLE_ROW, theme) { init() }
//}
//
//inline fun Activity.tableRow(): TableRow = tableRow() {}
//inline fun Activity.tableRow(init: (@AnkoViewDslMarker _TableRow).() -> Unit): TableRow {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TABLE_ROW, theme = 0) { init() }
//}
//
//inline fun Activity.themedTableRow(theme: Int = 0): TableRow = themedTableRow(theme) {}
//inline fun Activity.themedTableRow(theme: Int = 0, init: (@AnkoViewDslMarker _TableRow).() -> Unit): TableRow {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TABLE_ROW, theme) { init() }
//}
//
//inline fun ViewGroup.textSwitcher(): TextSwitcher = textSwitcher() {}
//inline fun ViewGroup.textSwitcher(init: (@AnkoViewDslMarker _TextSwitcher).() -> Unit): TextSwitcher {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TEXT_SWITCHER, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedTextSwitcher(theme: Int = 0): TextSwitcher = themedTextSwitcher(theme) {}
//inline fun ViewGroup.themedTextSwitcher(theme: Int = 0, init: (@AnkoViewDslMarker _TextSwitcher).() -> Unit): TextSwitcher {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TEXT_SWITCHER, theme) { init() }
//}
//
//inline fun Context.textSwitcher(): TextSwitcher = textSwitcher() {}
//inline fun Context.textSwitcher(init: (@AnkoViewDslMarker _TextSwitcher).() -> Unit): TextSwitcher {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TEXT_SWITCHER, theme = 0) { init() }
//}
//
//inline fun Context.themedTextSwitcher(theme: Int = 0): TextSwitcher = themedTextSwitcher(theme) {}
//inline fun Context.themedTextSwitcher(theme: Int = 0, init: (@AnkoViewDslMarker _TextSwitcher).() -> Unit): TextSwitcher {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TEXT_SWITCHER, theme) { init() }
//}
//
//inline fun Activity.textSwitcher(): TextSwitcher = textSwitcher() {}
//inline fun Activity.textSwitcher(init: (@AnkoViewDslMarker _TextSwitcher).() -> Unit): TextSwitcher {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TEXT_SWITCHER, theme = 0) { init() }
//}
//
//inline fun Activity.themedTextSwitcher(theme: Int = 0): TextSwitcher = themedTextSwitcher(theme) {}
//inline fun Activity.themedTextSwitcher(theme: Int = 0, init: (@AnkoViewDslMarker _TextSwitcher).() -> Unit): TextSwitcher {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.TEXT_SWITCHER, theme) { init() }
//}
//
//inline fun ViewGroup.viewAnimator(): ViewAnimator = viewAnimator() {}
//inline fun ViewGroup.viewAnimator(init: (@AnkoViewDslMarker _ViewAnimator).() -> Unit): ViewAnimator {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.VIEW_ANIMATOR, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedViewAnimator(theme: Int = 0): ViewAnimator = themedViewAnimator(theme) {}
//inline fun ViewGroup.themedViewAnimator(theme: Int = 0, init: (@AnkoViewDslMarker _ViewAnimator).() -> Unit): ViewAnimator {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.VIEW_ANIMATOR, theme) { init() }
//}
//
//inline fun Context.viewAnimator(): ViewAnimator = viewAnimator() {}
//inline fun Context.viewAnimator(init: (@AnkoViewDslMarker _ViewAnimator).() -> Unit): ViewAnimator {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.VIEW_ANIMATOR, theme = 0) { init() }
//}
//
//inline fun Context.themedViewAnimator(theme: Int = 0): ViewAnimator = themedViewAnimator(theme) {}
//inline fun Context.themedViewAnimator(theme: Int = 0, init: (@AnkoViewDslMarker _ViewAnimator).() -> Unit): ViewAnimator {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.VIEW_ANIMATOR, theme) { init() }
//}
//
//inline fun Activity.viewAnimator(): ViewAnimator = viewAnimator() {}
//inline fun Activity.viewAnimator(init: (@AnkoViewDslMarker _ViewAnimator).() -> Unit): ViewAnimator {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.VIEW_ANIMATOR, theme = 0) { init() }
//}
//
//inline fun Activity.themedViewAnimator(theme: Int = 0): ViewAnimator = themedViewAnimator(theme) {}
//inline fun Activity.themedViewAnimator(theme: Int = 0, init: (@AnkoViewDslMarker _ViewAnimator).() -> Unit): ViewAnimator {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.VIEW_ANIMATOR, theme) { init() }
//}

//inline fun ViewGroup.viewSwitcher(): ViewSwitcher = viewSwitcher() {}
//inline fun ViewGroup.viewSwitcher(init: (@AnkoViewDslMarker _ViewSwitcher).() -> Unit): ViewSwitcher {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.VIEW_SWITCHER, theme = 0) { init() }
//}
//
//inline fun ViewGroup.themedViewSwitcher(theme: Int = 0): ViewSwitcher = themedViewSwitcher(theme) {}
//inline fun ViewGroup.themedViewSwitcher(theme: Int = 0, init: (@AnkoViewDslMarker _ViewSwitcher).() -> Unit): ViewSwitcher {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.VIEW_SWITCHER, theme) { init() }
//}
//
//inline fun Context.viewSwitcher(): ViewSwitcher = viewSwitcher() {}
//inline fun Context.viewSwitcher(init: (@AnkoViewDslMarker _ViewSwitcher).() -> Unit): ViewSwitcher {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.VIEW_SWITCHER, theme = 0) { init() }
//}
//
//inline fun Context.themedViewSwitcher(theme: Int = 0): ViewSwitcher = themedViewSwitcher(theme) {}
//inline fun Context.themedViewSwitcher(theme: Int = 0, init: (@AnkoViewDslMarker _ViewSwitcher).() -> Unit): ViewSwitcher {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.VIEW_SWITCHER, theme) { init() }
//}
//
//inline fun Activity.viewSwitcher(): ViewSwitcher = viewSwitcher() {}
//inline fun Activity.viewSwitcher(init: (@AnkoViewDslMarker _ViewSwitcher).() -> Unit): ViewSwitcher {
//    return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.VIEW_SWITCHER, theme = 0) { init() }
//}
//
//inline fun Activity.themedViewSwitcher(theme: Int = 0): ViewSwitcher = themedViewSwitcher(theme) {}
//inline fun Activity.themedViewSwitcher(theme: Int = 0, init: (@AnkoViewDslMarker _ViewSwitcher).() -> Unit): ViewSwitcher {
//return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.VIEW_SWITCHER, theme) { init() }
//}

