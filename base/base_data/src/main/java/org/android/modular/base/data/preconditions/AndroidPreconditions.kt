package org.android.modular.base.data.preconditions

interface AndroidPreconditions {
    fun assertMainThread()

    fun assertUiThread()

    fun assertWorkerThread()
}