@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsQualifier("android.os")

package android.os

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
import java.lang.Runnable

external var fps:Int = definedExternally

external open class Bundle(copy: Bundle? = definedExternally /* null */) {
    open fun get(key: String, defaultValue: Any): Any = definedExternally
    open fun put(key: String, value: Any): Unit = definedExternally
    open fun containsKey(key: String): Boolean = definedExternally
}

external open class SystemClock {
    companion object {
        fun uptimeMillis(): Number = definedExternally
    }
}

external open class Message {
    open var mType: Any = definedExternally
    open var what: Number = definedExternally
    open var arg1: Number = definedExternally
    open var arg2: Number = definedExternally
    open var obj: Any = definedExternally
    open var `when`: Number = definedExternally
    open var target: Handler = definedExternally
    open var callback: Runnable = definedExternally
    open fun recycle(): Unit = definedExternally
    open fun copyFrom(o: Message): Unit = definedExternally
    open fun setTarget(target: Handler): Unit = definedExternally
    open fun getTarget(): Handler = definedExternally
    open fun sendToTarget(): Unit = definedExternally
    open fun clearForRecycle(): Unit = definedExternally
    open fun toString(now: Number? = definedExternally /* null */): String = definedExternally

    companion object {
        var Type_Normal: Number = definedExternally
        var Type_Traversal: Number = definedExternally
        var sPool: Any = definedExternally
        fun obtain(): Message = definedExternally
        fun obtain(orig: Message): Message = definedExternally
        fun obtain(h: Handler): Message = definedExternally
        fun obtain(h: Handler, callback: Runnable): Message = definedExternally
        fun obtain(h: Handler, what: Number): Message = definedExternally
        fun obtain(h: Handler, what: Number, obj: Any): Message = definedExternally
        fun obtain(h: Handler, what: Number, arg1: Number, arg2: Number): Message = definedExternally
        fun obtain(h: Handler, what: Number, arg1: Number, arg2: Number, obj: Any): Message = definedExternally
    }
}

external open class MessageQueue {
    companion object {
        var messages: Set<Message> = definedExternally
        fun getMessages(h: Handler, r: Runnable, `object`: Any): Array<Message> = definedExternally
        fun getMessages(h: Handler, what: Number, `object`: Any): Array<Message> = definedExternally
        fun hasMessages(h: Handler, r: Runnable, `object`: Any): Boolean = definedExternally
        fun hasMessages(h: Handler, what: Number, `object`: Any): Boolean = definedExternally
        fun enqueueMessage(msg: Message, `when`: Number): Boolean = definedExternally
        fun recycleMessage(handler: Handler, message: Message): Unit = definedExternally
        fun removeMessages(h: Handler, what: Number, `object`: Any): Any = definedExternally
        fun removeMessages(h: Handler, r: Runnable, `object`: Any): Any = definedExternally
        fun removeCallbacksAndMessages(h: Handler, `object`: Any): Unit = definedExternally
        var _loopActive: Any = definedExternally
        fun checkLoop(): Unit = definedExternally
        fun requestNextLoop(): Unit = definedExternally
        fun loop(): Unit = definedExternally
        fun dispatchMessage(msg: Any): Unit = definedExternally
    }
}

external open class Handler(callback: Handler.Callback? = definedExternally /* null */) {
    interface Callback {
        fun handleMessage(msg: Message): Boolean
    }

    open var mCallback: Handler.Callback = definedExternally
    open fun handleMessage(msg: Message): Unit = definedExternally
    open fun dispatchMessage(msg: Message): Unit = definedExternally
    open fun obtainMessage(): Message = definedExternally
    open fun obtainMessage(what: Number): Message = definedExternally
    open fun obtainMessage(what: Number, obj: Any): Message = definedExternally
    open fun obtainMessage(what: Number, arg1: Number, arg2: Number): Message = definedExternally
    open fun obtainMessage(what: Number, arg1: Number, arg2: Number, obj: Any): Message = definedExternally
    open fun post(r: Runnable): Boolean = definedExternally
    open fun postAsTraversal(r: Runnable): Boolean = definedExternally
    open fun postAtTime(r: Runnable, uptimeMillis: Number): Boolean = definedExternally
    open fun postAtTime(r: Runnable, token: Any, uptimeMillis: Number): Boolean = definedExternally
    open fun postDelayed(r: Runnable, delayMillis: Number): Boolean = definedExternally
    open fun postAtFrontOfQueue(r: Runnable): Boolean = definedExternally
    open fun removeCallbacks(r: Runnable, token: Any? = definedExternally /* null */): Unit = definedExternally
    open fun sendMessage(msg: Message): Boolean = definedExternally
    open fun sendEmptyMessage(what: Number): Boolean = definedExternally
    open fun sendEmptyMessageDelayed(what: Number, delayMillis: Number): Boolean = definedExternally
    open fun sendEmptyMessageAtTime(what: Number, uptimeMillis: Number): Boolean = definedExternally
    open fun sendMessageDelayed(msg: Message, delayMillis: Number): Boolean = definedExternally
    open fun sendMessageAtTime(msg: Message, uptimeMillis: Number): Boolean = definedExternally
    open fun sendMessageAtFrontOfQueue(msg: Message): Boolean = definedExternally
    open fun removeMessages(what: Number, `object`: Any? = definedExternally /* null */): Unit = definedExternally
    open fun removeCallbacksAndMessages(token: Any? = definedExternally /* null */): Unit = definedExternally
    open fun hasMessages(what: Number, `object`: Any? = definedExternally /* null */): Boolean = definedExternally

    companion object {
        fun getPostMessage(r: Any, token: Any? = definedExternally /* null */): Unit = definedExternally
    }
}

external open class Trace {
    companion object {
        var TAG: Any = definedExternally
        var TRACE_TAG_NEVER: Number = definedExternally
        var TRACE_TAG_ALWAYS: Number = definedExternally
        var TRACE_TAG_GRAPHICS: Number = definedExternally
        var TRACE_TAG_INPUT: Number = definedExternally
        var TRACE_TAG_VIEW: Number = definedExternally
        var TRACE_TAG_WEBVIEW: Number = definedExternally
        var TRACE_TAG_WINDOW_MANAGER: Number = definedExternally
        var TRACE_TAG_ACTIVITY_MANAGER: Number = definedExternally
        var TRACE_TAG_SYNC_MANAGER: Number = definedExternally
        var TRACE_TAG_AUDIO: Number = definedExternally
        var TRACE_TAG_VIDEO: Number = definedExternally
        var TRACE_TAG_CAMERA: Number = definedExternally
        var TRACE_TAG_HAL: Number = definedExternally
        var TRACE_TAG_APP: Number = definedExternally
        var TRACE_TAG_RESOURCES: Number = definedExternally
        var TRACE_TAG_DALVIK: Number = definedExternally
        var TRACE_TAG_RS: Number = definedExternally
        var TRACE_TAG_NOT_READY: Any = definedExternally
        var MAX_SECTION_NAME_LEN: Any = definedExternally
        var sEnabledTags: Any = definedExternally
        fun nativeGetEnabledTags(): Unit = definedExternally
        fun nativeTraceCounter(tag: Any, name: Any, value: Any): Unit = definedExternally
        fun nativeTraceBegin(tag: Any, name: Any): Unit = definedExternally
        fun nativeTraceEnd(tag: Any): Unit = definedExternally
        fun nativeAsyncTraceBegin(tag: Any, name: Any, cookie: Any): Unit = definedExternally
        fun nativeAsyncTraceEnd(tag: Any, name: Any, cookie: Any): Unit = definedExternally
        fun nativeSetAppTracingAllowed(allowed: Any): Unit = definedExternally
        fun nativeSetTracingEnabled(allowed: Any): Unit = definedExternally
        fun cacheEnabledTags(): Unit = definedExternally
        fun isTagEnabled(traceTag: Number): Boolean = definedExternally
        fun traceCounter(traceTag: Number, counterName: String, counterValue: Number): Unit = definedExternally
        fun setAppTracingAllowed(allowed: Boolean): Unit = definedExternally
        fun setTracingEnabled(enabled: Boolean): Unit = definedExternally
        fun traceBegin(traceTag: Number, methodName: String): Unit = definedExternally
        fun traceEnd(traceTag: Number): Unit = definedExternally
        fun asyncTraceBegin(traceTag: Number, methodName: String, cookie: Number): Unit = definedExternally
        fun asyncTraceEnd(traceTag: Number, methodName: String, cookie: Number): Unit = definedExternally
        fun beginSection(sectionName: String): Unit = definedExternally
        fun endSection(): Unit = definedExternally
    }
}
