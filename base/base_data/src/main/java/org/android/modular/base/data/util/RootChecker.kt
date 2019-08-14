package org.android.modular.base.data.util

import java.io.File

/*
 * Checks the device is rooted or not
 */
object RootChecker {

    private const val KEY_SU = "su"

    private val pathList = listOf(
        "/sbin/",
        "/system/bin/",
        "/system/xbin/",
        "/data/local/xbin/",
        "/data/local/bin/",
        "/system/sd/xbin/",
        "/system/bin/failsafe/",
        "/data/local/"
    )

    val isRootedDevice: Boolean

    init {
        isRootedDevice = isDeviceRooted()
    }

    /*
     * Checks if the device is rooted.
     */
    private fun isDeviceRooted() = doesFileExists(KEY_SU)

    /*
     * Checks if file exists
     */
    private fun doesFileExists(value: String): Boolean {
        var result = false
        for (path in pathList) {
            val file = File("$path/$value")
            result = file.exists()
            if (result) {
                break
            }
        }
        return result
    }

    /*
     * Checks if the command can be executed
     */
    private fun canExecuteCommand(command: String): Boolean {
        return try {
            Runtime.getRuntime().exec(command)
            true
        } catch (e: Exception) {
            false
        }
    }
}