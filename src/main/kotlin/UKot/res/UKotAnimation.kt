package UKot.res

import android.view.animation.Animation
import android.view.animation.TranslateAnimation


object UKotAnimation {
    val activity_close_enter_ios: Animation
        get() {
            val anim = TranslateAnimation(Animation.RELATIVE_TO_PARENT, -0.25, Animation.RELATIVE_TO_PARENT, 0, 0, 0, 0, 0)
            anim.setDuration(300)
            return anim
        }

    val activity_close_exit_ios: Animation
        get() {

            val anim = TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 1, 0, 0, 0, 0)
            anim.setDuration(300)
            return anim
        }

    val activity_open_enter_ios: Animation
        get() {

            val anim = TranslateAnimation(Animation.RELATIVE_TO_PARENT, 1, Animation.RELATIVE_TO_PARENT, 0, 0, 0, 0, 0)
            anim.setDuration(300)
            return anim
        }

    val activity_open_exit_ios: Animation
        get() {
            val anim = TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, -0.25, 0, 0, 0, 0)
            anim.setDuration(300)
            return anim
        }

    val view_exit_top:Animation
        get() {
            val anim = TranslateAnimation(1, 0, 0, 1, Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, -0.3)
            anim.setDuration(1000)
            return anim
        }
    val view_enter_top:Animation
        get() {
            val anim = TranslateAnimation(1, 0, 0, 1, Animation.RELATIVE_TO_PARENT, -0.3, Animation.RELATIVE_TO_PARENT, 0)
            anim.setDuration(1000)
            return anim
        }
}