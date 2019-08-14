package org.android.modular.base.presentation.application

import android.app.Activity
import java.lang.ref.WeakReference

interface NavigatableApp {
    fun setForegroundActivity(activity: Activity)

    fun dropForegroundActivity()

    fun getForegroundActivity(): WeakReference<Activity>?
}