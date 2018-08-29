package UKot.support.native

import kotlin.js.Date


fun time(): Int = (timeMillis() / 1000).toInt()
fun timeMillis(): Double = Date().getTime()

fun timeFormat():String = timeMillis().formatDateTime()

fun Double.formatDateTime(): String {
    val inputTime = this
    return js("var date = new Date(inputTime);  \n" +
            "    var y = date.getFullYear();    \n" +
            "    var m = date.getMonth() + 1;    \n" +
            "    m = m < 10 ? ('0' + m) : m;    \n" +
            "    var d = date.getDate();    \n" +
            "    d = d < 10 ? ('0' + d) : d;    \n" +
            "    var h = date.getHours();  \n" +
            "    h = h < 10 ? ('0' + h) : h;  \n" +
            "    var minute = date.getMinutes();  \n" +
            "    var second = date.getSeconds();  \n" +
            "    minute = minute < 10 ? ('0' + minute) : minute;    \n" +
            "    second = second < 10 ? ('0' + second) : second;   \n" +
            "    return y + '-' + m + '-' + d+' '+h+':'+minute+':'+second;")
}