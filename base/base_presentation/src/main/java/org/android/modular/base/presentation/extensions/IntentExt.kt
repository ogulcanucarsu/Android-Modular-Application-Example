package org.android.modular.base.presentation.extensions

import android.content.Context
import android.content.Intent

fun Intent.isAvailable(context: Context): Boolean {
    var result = true
    val manager = context.packageManager
    val infos = manager.queryIntentActivities(this, 0)
    if (infos.size <= 0) {
        result = false
    }
    return result
}