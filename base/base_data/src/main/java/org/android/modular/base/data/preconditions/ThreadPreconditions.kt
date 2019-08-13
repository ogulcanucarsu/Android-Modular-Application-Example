package org.android.modular.base.data.preconditions

import android.os.Looper

fun Thread.isMainThread() = Looper.getMainLooper().thread == this

fun Thread.assertMainThread() = this.isMainThread()


fun Thread.assertUiThread() = this.isMainThread()


fun Thread.assertWorkerThread() = !this.isMainThread()