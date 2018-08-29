package UKot.support.adapter

import UKot.widget.UI
import android.content.Context
import android.view.View
import android.view.ViewGroup
import com.jakewharton.salvage.RecyclingPagerAdapter

class UBasePagerAdapter<T, V : UI>(val context: Context, val ui: () -> V, var items: List<T>, val init: (V, T) -> Unit) : RecyclingPagerAdapter() {
    override fun getCount(): Number = items.count()

    override fun getView(position: Number, cacheView: View, parent: ViewGroup): View {
        var viewHodler: ViewHolder<T, V>? = null
        if (cacheView == null) {
            val fakeView = ui.invoke()
//            val view = context.getLayoutInflater().inflate(layoutResource, parent, false)
            viewHodler = ViewHolder(fakeView, init)

            fakeView.view.viewHodler = viewHodler
            viewHodler.bindForecast(items.get(position.toInt()))
            return fakeView.view
        } else {
            viewHodler = cacheView.viewHodler as ViewHolder<T, V>
            viewHodler.bindForecast(items.get(position.toInt()))
            return cacheView
        }
    }

    class ViewHolder<in T, V : UI>(val fakeView: V, val init: (V, T) -> Unit) {
        fun bindForecast(item: T) {
            with(item) {
                init(fakeView, item)
            }
        }
    }
}