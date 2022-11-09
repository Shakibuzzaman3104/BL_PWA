package com.media365.pwa

import android.app.Activity
import android.util.Log
import android.webkit.JavascriptInterface

class JavascriptInterface(private val activity: Activity) {

    @JavascriptInterface
    fun checkAuth(status: Boolean) {
        Log.d("MyInterface", "checkAuth: $status")
    }

}