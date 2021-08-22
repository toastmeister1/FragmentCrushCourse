package com.joseph.fragmentcrushcourse.util

import android.app.Activity
import android.content.Context
import android.content.Intent

inline fun <reified T: Activity> Activity.startActivity(context: Context) {
    val intent = Intent(context, T::class.java)
}