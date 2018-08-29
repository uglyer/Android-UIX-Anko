package UKot.content

import UKot.app.UKotActivity

/**
 * Created by uglyer on 2017/10/17.
 */
class Route {
    companion object {
        val MAIN = "MAIN"
    }

    internal var map: MutableMap<String, () -> UKotActivity> = HashMap()
    fun add(k: String, v: () -> UKotActivity) {
        map.put(k, v)
    }

    operator fun get(k: String): (() -> UKotActivity)? {
        return map.get(k)
    }
}