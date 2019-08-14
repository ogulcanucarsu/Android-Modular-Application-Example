package org.android.modular.base.data.util

import android.os.Build

object OsUtil {
    fun hasNougat() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N
    fun hasLollipop() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP
    fun hasOreo() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O
}