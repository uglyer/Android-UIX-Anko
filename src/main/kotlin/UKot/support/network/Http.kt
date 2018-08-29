package UKot.support.network

//import UKotWebSDK.web.JSCall
//import UKotWebSDK.web.encodeURIComponent
//import UKotWebSDK.web.parserObj2Params
import UKot.support.native.encodeURIComponent
import UKot.support.native.parserObj2Params
import android.util.Log
import org.w3c.xhr.XMLHttpRequest
import kotlin.browser.window

//import kotlin.js.Json

/**
 * Created by uglyer on 2017/9/19.
 */

@JsName("HttpGet")
fun HttpGet(url: String, init: HttpRequest.() -> Unit) = HttpRequest(url, "GET").apply(init)

@JsName("HttpPost")
fun HttpPost(url: String, init: HttpRequest.() -> Unit) = HttpRequest(url, "POST").apply(init)

class HttpRequest(val url: String, val type: String) {
    val TAG = "HttpRequest"
    //    lateinit var url: String
    private var _onSuccess: ((String) -> Unit)? = null
    private var _onError: ((String) -> Unit)? = null
    internal var postMap: MutableMap<String, String> = HashMap()
    internal var headerMap: MutableMap<String, String> = HashMap()
    var headerTypeJson = false
    var postObj: Any? = null

    fun post(key: String, value: String) {
        postMap.put(key, value)
    }

    fun post(obj: Any) {
        postObj = obj
    }

    fun header(key: String, value: String) {
        headerMap.put(key, value)
    }

    fun onSuccess(success: (String) -> Unit) {
        _onSuccess = success
    }

    fun onError(error: (String) -> Unit) {
        _onError = error
    }

//    fun rep(str: String): String {
//        var tmp = str.replace("%", "%25")
//        tmp = tmp.replace(" ", "%20")
//        tmp = tmp.replace("=", "%3D")
//        tmp = tmp.replace("#", "%23")
//        return tmp
//    }

    var param = ""
        get() {
            if (headerTypeJson) {
                if (postObj != null) {
                    return JSON.stringify(postObj)
                }
                //TODO 返回的json不对
                return JSON.stringify(postMap)
            }
            if (postObj != null) {
                val params = parserObj2Params(postObj!!)
//                console.log(params)
                return if (!params.isNullOrBlank()) params.substring(1) else ""
            }
            val sb = StringBuilder()
            postMap.forEach {
                sb.append("&")
                sb.append(encodeURIComponent(it.key))
                sb.append("=")
                sb.append(encodeURIComponent(it.value))
            }
            return if (!sb.isNullOrBlank()) sb.toString().substring(1) else ""
        }

    fun execute() {
        val request = XMLHttpRequest()
        request.open(type, url, true)
        request.onreadystatechange = {
            if (request.readyState.toString().equals("4")) {
                if (request.status.toString().equals("200")) {
                    _onSuccess?.invoke(request.responseText)
                } else {
                    _onError?.invoke("error:" + request.status.toString())
                }
            }
        }
        if (headerTypeJson) {
            request.setRequestHeader("Content-Type", "application/json")
//            request.setRequestHeader("Accept", "application/json")
        } else {
            request.overrideMimeType("text/xml")
            request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded")
        }
        headerMap.forEach {
            request.setRequestHeader(it.key, it.value)
        }
        if (postMap.isNotEmpty() || postObj != null) {
            Log.i(TAG, param)
            request.send(param)
        } else
            request.send()
    }

}