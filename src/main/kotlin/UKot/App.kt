//package UKot
//
//import android.app.Activity
//import android.content.Intent
//import android.widget.LinearLayout
//import android.widget.ScrollView
//import android.widget.TextView
//import android.widget.Toast
//import androidui.UKotNative
//import androidui.util.Platform
//import org.w3c.dom.Element
//import kotlin.browser.document
//import kotlin.browser.window
//
////import androidui.attr.AttrBinder
//
//fun main(args: Array<String>) {
////    val attr = AttrBinder()
//    //println(Platform.isAndroid)
//    val app = UKotNative.initElement(document.getElementById("aui") as Element)
//
//    val activity = Activity(app)
//    val scroll = ScrollView(activity)
//    val linearLayout = LinearLayout(activity)
//    val textView = TextView(activity)
//    textView.setText("测试中文 form Kotlin")
//    linearLayout.addView(textView)
//    linearLayout.setOrientation(LinearLayout.VERTICAL)
//    scroll.addView(linearLayout)
//    textView.setOnClickListener {
//        Toast.makeText(textView.mContext, "点击事件", Toast.LENGTH_LONG).show()
//        //TODO 路由管理
//        val activity2 = Activity(app)
//        val textView2 = TextView(activity2)
//        textView2.setText("第二个，点击关闭")
//        textView2.setOnClickListener { activity2.finish() }
////        linearLayout.addView(textView2)
//        activity2.setContentView(textView2)
//        val intent2 = Intent("route.Activity2")
//        intent2.activity = activity2
//        activity.startActivity(intent2)
//    }
//    val intent = Intent("route.main")
//    intent.activity = activity
//    app.startLaunchActivity(intent)
//    activity.setContentView(scroll)
//
//    window.setInterval({
////        val textView2 = TextView(activity)
////        textView2.setText("addOne")
////        linearLayout.addView(textView2)
//    },500)
//}