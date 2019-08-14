package org.android.modular.base.data.util

import android.content.Context
import android.net.ConnectivityManager

object NetworkUtil {
    const val TYPE_WIFI = 1
    const val TYPE_MOBILE = 2
    const val TYPE_NOT_CONNECTED = 0

    //This method necessary ACCESS_NETWORK_STATE permissions
    fun getConnectivityStatus(context: Context): Int {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        cm.activeNetworkInfo?.let {
            if (it.type == ConnectivityManager.TYPE_WIFI) return TYPE_WIFI

            if (it.type == ConnectivityManager.TYPE_MOBILE) return TYPE_MOBILE
        }
        return TYPE_NOT_CONNECTED
    }
}