package org.android.modular.base.presentation.navigation

import android.app.Activity
import android.content.Context
import android.content.Intent

interface IntentFactory {
    fun createCallIntent(context: Context, number: String): Intent?

    fun createBrowserIntent(context: Context, url: String): Intent?

    fun createShareIntent(activity: Activity, title: String?, text: String?, type: String = DEFAULT_MIME_TYPE): Intent?

    fun createShareFileIntent(
        activity: Activity,
        type: String?,
        action: String?,
        authority: String,
        path: String?,
        emailSubject: String? = null,
        email: String? = null
    ): Intent?

    companion object {
        const val DEFAULT_MIME_TYPE = "text/plain"
    }
}