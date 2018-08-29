package UKot.anko

import android.view.View
import android.view.ViewGroup


interface ViewManager {
    /**
     * Assign the passed LayoutParams to the passed View and add the view to the window.
     *
     * Throws [android.view.WindowManager.BadTokenException] for certain programming
     * errors, such as adding a second view to a window without removing the first view.
     *
     * Throws [android.view.WindowManager.InvalidDisplayException] if the window is on a
     * secondary [Display] and the specified display can't be found
     * (see [android.app.Presentation]).
     * @param view The view to be added to this window.
     * @param params The LayoutParams to assign to view.
     */
    fun addView(view: View?, params: ViewGroup.LayoutParams?)

    fun updateViewLayout(view: View, params: ViewGroup.LayoutParams)
    fun removeView(view: View)
}
