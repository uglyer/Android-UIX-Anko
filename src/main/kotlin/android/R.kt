@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.R")
package android.R

import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.graphics.drawable.InsetDrawable
import android.graphics.drawable.StateListDrawable
import android.view.animation.*
import androidui.image.ChangeImageSizeDrawable
import androidui.image.NetDrawable
import androidui.image.NinePatchDrawable
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

external open class layout {
    companion object {
        fun getLayoutData(layoutName: String): HTMLElement = definedExternally
        var action_bar: String = definedExternally
        var alert_dialog: String = definedExternally
        var alert_dialog_progress: String = definedExternally
        var popup_menu_item_layout: String = definedExternally
        var select_dialog: String = definedExternally
        var select_dialog_item: String = definedExternally
        var select_dialog_multichoice: String = definedExternally
        var select_dialog_singlechoice: String = definedExternally
        var simple_spinner_dropdown_item: String = definedExternally
        var simple_spinner_item: String = definedExternally
        var transient_notification: String = definedExternally
    }
}
external var id: Any = definedExternally
external open class drawable {
    companion object {
        var btn_default: Drawable = definedExternally
        var editbox_background: Drawable = definedExternally
        var btn_check: Drawable = definedExternally
        var btn_radio: Drawable = definedExternally
        var progress_small_holo: Drawable = definedExternally
        var progress_medium_holo: Drawable = definedExternally
        var progress_large_holo: Drawable = definedExternally
        var progress_horizontal_holo: Drawable = definedExternally
        var progress_indeterminate_horizontal_holo: Drawable = definedExternally
        var ratingbar_full_empty_holo_light: Drawable = definedExternally
        var ratingbar_full_filled_holo_light: Drawable = definedExternally
        var ratingbar_full_holo_light: Drawable = definedExternally
        var ratingbar_holo_light: Drawable = definedExternally
        var ratingbar_small_holo_light: Drawable = definedExternally
        var scrubber_control_selector_holo: Drawable = definedExternally
        var scrubber_progress_horizontal_holo_light: Drawable = definedExternally
        var scrubber_primary_holo: Drawable = definedExternally
        var scrubber_secondary_holo: Drawable = definedExternally
        var scrubber_track_holo_light: Drawable = definedExternally
        var list_selector_background: Drawable = definedExternally
        var list_divider: Drawable = definedExternally
        var divider_vertical: Drawable = definedExternally
        var divider_horizontal: Drawable = definedExternally
        var item_background: StateListDrawable = definedExternally
        var toast_frame: InsetDrawable = definedExternally
    }
}
external open class image_base64 {
    companion object {
        var actionbar_ic_back_white: Any = definedExternally
        var btn_check_off_disabled_focused_holo_light: Any = definedExternally
        var btn_check_off_disabled_holo_light: Any = definedExternally
        var btn_check_off_focused_holo_light: Any = definedExternally
        var btn_check_off_holo_light: Any = definedExternally
        var btn_check_off_pressed_holo_light: Any = definedExternally
        var btn_check_on_disabled_focused_holo_light: Any = definedExternally
        var btn_check_on_disabled_holo_light: Any = definedExternally
        var btn_check_on_focused_holo_light: Any = definedExternally
        var btn_check_on_holo_light: Any = definedExternally
        var btn_check_on_pressed_holo_light: Any = definedExternally
        var btn_default_disabled_focused_holo_light: Any = definedExternally
        var btn_default_disabled_holo_light: Any = definedExternally
        var btn_default_focused_holo_light: Any = definedExternally
        var btn_default_normal_holo_light: Any = definedExternally
        var btn_default_pressed_holo_light: Any = definedExternally
        var btn_radio_off_disabled_focused_holo_light: Any = definedExternally
        var btn_radio_off_disabled_holo_light: Any = definedExternally
        var btn_radio_off_focused_holo_light: Any = definedExternally
        var btn_radio_off_holo_light: Any = definedExternally
        var btn_radio_off_pressed_holo_light: Any = definedExternally
        var btn_radio_on_disabled_focused_holo_light: Any = definedExternally
        var btn_radio_on_disabled_holo_light: Any = definedExternally
        var btn_radio_on_focused_holo_light: Any = definedExternally
        var btn_radio_on_holo_light: Any = definedExternally
        var btn_radio_on_pressed_holo_light: Any = definedExternally
        var btn_rating_star_off_normal_holo_light: Any = definedExternally
        var btn_rating_star_off_pressed_holo_light: Any = definedExternally
        var btn_rating_star_on_normal_holo_light: Any = definedExternally
        var btn_rating_star_on_pressed_holo_light: Any = definedExternally
        var dropdown_background_dark: Any = definedExternally
        var editbox_background_focus_yellow: Any = definedExternally
        var editbox_background_normal: Any = definedExternally
        var ic_menu_moreoverflow_normal_holo_dark: Any = definedExternally
        var menu_panel_holo_dark: Any = definedExternally
        var menu_panel_holo_light: Any = definedExternally
        var popup_bottom_bright: Any = definedExternally
        var popup_center_bright: Any = definedExternally
        var popup_full_bright: Any = definedExternally
        var popup_top_bright: Any = definedExternally
        var progressbar_indeterminate_holo1: Any = definedExternally
        var progressbar_indeterminate_holo2: Any = definedExternally
        var progressbar_indeterminate_holo3: Any = definedExternally
        var progressbar_indeterminate_holo4: Any = definedExternally
        var progressbar_indeterminate_holo5: Any = definedExternally
        var progressbar_indeterminate_holo6: Any = definedExternally
        var progressbar_indeterminate_holo7: Any = definedExternally
        var progressbar_indeterminate_holo8: Any = definedExternally
        var rate_star_big_half_holo_light: Any = definedExternally
        var rate_star_big_off_holo_light: Any = definedExternally
        var rate_star_big_on_holo_light: Any = definedExternally
        var scrubber_control_disabled_holo: Any = definedExternally
        var scrubber_control_focused_holo: Any = definedExternally
        var scrubber_control_normal_holo: Any = definedExternally
        var scrubber_control_pressed_holo: Any = definedExternally
        var spinner_76_inner_holo: Any = definedExternally
        var spinner_76_outer_holo: Any = definedExternally
    }
}
external open class image {
    companion object {
        var actionbar_ic_back_white: NetDrawable = definedExternally
        var btn_check_off_disabled_focused_holo_light: NetDrawable = definedExternally
        var btn_check_off_disabled_holo_light: NetDrawable = definedExternally
        var btn_check_off_focused_holo_light: NetDrawable = definedExternally
        var btn_check_off_holo_light: NetDrawable = definedExternally
        var btn_check_off_pressed_holo_light: NetDrawable = definedExternally
        var btn_check_on_disabled_focused_holo_light: NetDrawable = definedExternally
        var btn_check_on_disabled_holo_light: NetDrawable = definedExternally
        var btn_check_on_focused_holo_light: NetDrawable = definedExternally
        var btn_check_on_holo_light: NetDrawable = definedExternally
        var btn_check_on_pressed_holo_light: NetDrawable = definedExternally
        var btn_default_disabled_focused_holo_light: NinePatchDrawable = definedExternally
        var btn_default_disabled_holo_light: NinePatchDrawable = definedExternally
        var btn_default_focused_holo_light: NinePatchDrawable = definedExternally
        var btn_default_normal_holo_light: NinePatchDrawable = definedExternally
        var btn_default_pressed_holo_light: NinePatchDrawable = definedExternally
        var btn_radio_off_disabled_focused_holo_light: NetDrawable = definedExternally
        var btn_radio_off_disabled_holo_light: NetDrawable = definedExternally
        var btn_radio_off_focused_holo_light: NetDrawable = definedExternally
        var btn_radio_off_holo_light: NetDrawable = definedExternally
        var btn_radio_off_pressed_holo_light: NetDrawable = definedExternally
        var btn_radio_on_disabled_focused_holo_light: NetDrawable = definedExternally
        var btn_radio_on_disabled_holo_light: NetDrawable = definedExternally
        var btn_radio_on_focused_holo_light: NetDrawable = definedExternally
        var btn_radio_on_holo_light: NetDrawable = definedExternally
        var btn_radio_on_pressed_holo_light: NetDrawable = definedExternally
        var btn_rating_star_off_normal_holo_light: NetDrawable = definedExternally
        var btn_rating_star_off_pressed_holo_light: NetDrawable = definedExternally
        var btn_rating_star_on_normal_holo_light: NetDrawable = definedExternally
        var btn_rating_star_on_pressed_holo_light: NetDrawable = definedExternally
        var dropdown_background_dark: NinePatchDrawable = definedExternally
        var editbox_background_focus_yellow: NinePatchDrawable = definedExternally
        var editbox_background_normal: NinePatchDrawable = definedExternally
        var ic_menu_moreoverflow_normal_holo_dark: NetDrawable = definedExternally
        var menu_panel_holo_dark: NinePatchDrawable = definedExternally
        var menu_panel_holo_light: NinePatchDrawable = definedExternally
        var popup_bottom_bright: NinePatchDrawable = definedExternally
        var popup_center_bright: NinePatchDrawable = definedExternally
        var popup_full_bright: NinePatchDrawable = definedExternally
        var popup_top_bright: NinePatchDrawable = definedExternally
        var progressbar_indeterminate_holo1: NetDrawable = definedExternally
        var progressbar_indeterminate_holo2: NetDrawable = definedExternally
        var progressbar_indeterminate_holo3: NetDrawable = definedExternally
        var progressbar_indeterminate_holo4: NetDrawable = definedExternally
        var progressbar_indeterminate_holo5: NetDrawable = definedExternally
        var progressbar_indeterminate_holo6: NetDrawable = definedExternally
        var progressbar_indeterminate_holo7: NetDrawable = definedExternally
        var progressbar_indeterminate_holo8: NetDrawable = definedExternally
        var rate_star_big_half_holo_light: NetDrawable = definedExternally
        var rate_star_big_off_holo_light: NetDrawable = definedExternally
        var rate_star_big_on_holo_light: NetDrawable = definedExternally
        var scrubber_control_disabled_holo: NetDrawable = definedExternally
        var scrubber_control_focused_holo: NetDrawable = definedExternally
        var scrubber_control_normal_holo: NetDrawable = definedExternally
        var scrubber_control_pressed_holo: NetDrawable = definedExternally
        var spinner_76_inner_holo: NetDrawable = definedExternally
        var spinner_76_outer_holo: NetDrawable = definedExternally
        var spinner_48_outer_holo: ChangeImageSizeDrawable = definedExternally
        var spinner_48_inner_holo: ChangeImageSizeDrawable = definedExternally
        var spinner_16_outer_holo: ChangeImageSizeDrawable = definedExternally
        var spinner_16_inner_holo: ChangeImageSizeDrawable = definedExternally
        var rate_star_small_off_holo_light: ChangeImageSizeDrawable = definedExternally
        var rate_star_small_half_holo_light: ChangeImageSizeDrawable = definedExternally
        var rate_star_small_on_holo_light: ChangeImageSizeDrawable = definedExternally
    }
}
external open class color {
    companion object {
        var textView_textColor: ColorStateList = definedExternally
        var primary_text_light_disable_only: ColorStateList = definedExternally
        var primary_text_dark_disable_only: ColorStateList = definedExternally
        var white: Number = definedExternally
        var black: Number = definedExternally
        var transparent: Number = definedExternally
    }
}
external open class attr {
    companion object {
        var textViewStyle: Map<String, String> = definedExternally
        var buttonStyle: Map<String, String> = definedExternally
        var editTextStyle: Map<String, String> = definedExternally
        var imageButtonStyle: Map<String, String> = definedExternally
        var checkboxStyle: Map<String, String> = definedExternally
        var radiobuttonStyle: Map<String, String> = definedExternally
        var checkedTextViewStyle: Map<String, String> = definedExternally
        var progressBarStyle: Map<String, String> = definedExternally
        var progressBarStyleHorizontal: Map<String, String> = definedExternally
        var progressBarStyleSmall: Map<String, String> = definedExternally
        var progressBarStyleLarge: Map<String, String> = definedExternally
        var seekBarStyle: Map<String, String> = definedExternally
        var ratingBarStyle: Map<String, String> = definedExternally
        var ratingBarStyleIndicator: Map<String, String> = definedExternally
        var ratingBarStyleSmall: Map<String, String> = definedExternally
        var absListViewStyle: Map<String, String> = definedExternally
        var gridViewStyle: Map<String, String> = definedExternally
        var listViewStyle: Map<String, String> = definedExternally
        var expandableListViewStyle: Map<String, String> = definedExternally
        var numberPickerStyle: Map<String, String> = definedExternally
        var popupWindowStyle: Map<String, String> = definedExternally
        var listPopupWindowStyle: Map<String, String> = definedExternally
        var popupMenuStyle: Map<String, String> = definedExternally
        var dropDownListViewStyle: Map<String, String> = definedExternally
        var spinnerStyle: Map<String, String> = definedExternally
        var actionBarStyle: Map<String, String> = definedExternally
        var scrollViewStyle: Map<String, String> = definedExternally
    }
}
external open class interpolator {
    companion object {
        var accelerate_cubic: AccelerateInterpolator = definedExternally
        var accelerate_decelerate: AccelerateDecelerateInterpolator = definedExternally
        var accelerate_quad: AccelerateInterpolator = definedExternally
        var accelerate_quint: AccelerateInterpolator = definedExternally
        var anticipate_overshoot: AnticipateOvershootInterpolator = definedExternally
        var anticipate: AnticipateInterpolator = definedExternally
        var bounce: BounceInterpolator = definedExternally
        var cycle: CycleInterpolator = definedExternally
        var decelerate_cubic: DecelerateInterpolator = definedExternally
        var decelerate_quad: DecelerateInterpolator = definedExternally
        var decelerate_quint: DecelerateInterpolator = definedExternally
        var linear: LinearInterpolator = definedExternally
        var overshoot: OvershootInterpolator = definedExternally
    }
}
external open class anim {
    companion object {
        var activity_close_enter: Animation = definedExternally
        var activity_close_exit: Animation = definedExternally
        var activity_open_enter: Animation = definedExternally
        var activity_open_exit: Animation = definedExternally
        var activity_close_enter_ios: Animation = definedExternally
        var activity_close_exit_ios: Animation = definedExternally
        var activity_open_enter_ios: Animation = definedExternally
        var activity_open_exit_ios: Animation = definedExternally
        var dialog_enter: Animation = definedExternally
        var dialog_exit: Animation = definedExternally
        var fade_in: Animation = definedExternally
        var fade_out: Animation = definedExternally
        var toast_enter: Animation = definedExternally
        var toast_exit: Animation = definedExternally
        var grow_fade_in: Animation = definedExternally
        var grow_fade_in_center: Animation = definedExternally
        var grow_fade_in_from_bottom: Animation = definedExternally
        var shrink_fade_out: Animation = definedExternally
        var shrink_fade_out_center: Animation = definedExternally
        var shrink_fade_out_from_bottom: Animation = definedExternally
    }
}
external open class string_ {
    companion object {
        var ok: String = definedExternally
        var cancel: String = definedExternally
        var close: String = definedExternally
        var back: String = definedExternally
        var crash_catch_alert: String = definedExternally
        var prll_header_state_normal: String = definedExternally
        var prll_header_state_ready: String = definedExternally
        var prll_header_state_loading: String = definedExternally
        var prll_header_state_fail: String = definedExternally
        var prll_footer_state_normal: String = definedExternally
        var prll_footer_state_loading: String = definedExternally
        var prll_footer_state_ready: String = definedExternally
        var prll_footer_state_fail: String = definedExternally
        var prll_footer_state_no_more: String = definedExternally
        fun zh(): Unit = definedExternally
    }
}
