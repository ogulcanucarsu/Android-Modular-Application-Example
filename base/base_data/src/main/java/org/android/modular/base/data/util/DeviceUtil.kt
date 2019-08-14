package org.android.modular.base.data.util

import android.os.Build

class DeviceUtil {
    companion object {
        fun isDeviceIsEmulator() = Build.FINGERPRINT.contains(GENERIC)

        fun getDeviceName(): String {
            val manufacturer = Build.MANUFACTURER
            val model = Build.MODEL
            return if (model.startsWith(manufacturer)) {
                model.capitalize()
            } else {
                manufacturer.capitalize() + " " + model
            }
        }

        private const val GENERIC = "generic"
    }
}