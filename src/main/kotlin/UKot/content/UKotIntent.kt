package UKot.content

import UKot.app.UKotActivity
import android.app.Activity
import android.content.Intent

/**
 * Created by uglyer on 2017/10/17.
 */

class UKotIntent {
    var fakeActivity: UKotActivity
    var fakeContext: UKotContext
    var intent: Intent? = null
    var activity: Activity? = null

    constructor(fakeActivity: UKotActivity) {
        this.fakeContext = fakeActivity.fakeContext
        this.fakeActivity = fakeActivity
        initRealIntent()
    }

    constructor(fakeContext: UKotContext, activityClazz: () -> UKotActivity) {
        this.fakeContext = fakeContext
        this.fakeActivity = fakeContext.createActivity(activityClazz)
        this.fakeActivity.fakeContext = fakeContext
        initRealIntent()
    }

    fun initRealIntent() {
        if (intent == null)
            intent = Intent(fakeActivity.route())
        if (intent!!.getActivity() == null) {
            intent!!.setActivity(Activity(fakeContext.app))
        }
        activity = intent!!.getActivity()
        fakeActivity.fakeIntent = this
//        console.log(this)
    }

    fun realActivity(): Activity {
        return activity!!
    }
}