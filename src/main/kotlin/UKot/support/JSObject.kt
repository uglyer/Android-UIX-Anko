package UKot.support


fun ___initJsObj(obj: JSObject) {
    obj.___jsObject = obj
}

class JSObject {
    var ___jsObject: dynamic = null
}

fun <T> JSObject.get(key: dynamic): T {
    if (___jsObject == null) ___initJsObj(this)
    return ___jsObject[key] as T
}

fun JSObject.containsKey(key: dynamic): Boolean {
    if (___jsObject == null) ___initJsObj(this)
    return ___jsObject[key] != undefined
}