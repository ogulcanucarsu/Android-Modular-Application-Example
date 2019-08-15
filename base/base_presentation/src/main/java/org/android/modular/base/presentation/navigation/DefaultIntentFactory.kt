package org.android.modular.base.presentation.navigation

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.core.app.ShareCompat
import androidx.core.content.FileProvider
import org.android.modular.base.presentation.extensions.isAvailable
import java.io.File

class DefaultIntentFactory : IntentFactory {

    override fun createCallIntent(context: Context, number: String): Intent? {
        val dialIntent = Intent(Intent.ACTION_CALL)
        dialIntent.data = Uri.parse("tel:$number")
        return if (dialIntent.isAvailable(context)) {
            dialIntent
        } else null
    }

    override fun createBrowserIntent(context: Context, url: String): Intent? {
        val browserIntent = Intent(Intent.ACTION_VIEW)
        browserIntent.data = Uri.parse(url)
        return if (browserIntent.isAvailable(context)) {
            browserIntent
        } else null
    }

    override fun createShareIntent(activity: Activity, title: String?, text: String?, type: String): Intent? {
        val shareIntent = ShareCompat.IntentBuilder.from(activity)
            .setText(text)
            .setType(type)
            .setChooserTitle(title)
            .createChooserIntent()

        return if (shareIntent.isAvailable(activity)) {
            shareIntent
        } else null
    }

    override fun createShareFileIntent(
        activity: Activity,
        type: String?,
        action: String?,
        authority: String,
        path: String?,
        emailSubject: String?,
        email: String?
    ): Intent? {
        val uris = arrayListOf<Uri>()
            FileProvider.getUriForFile(activity, authority, File(path)).also { uri -> uris.add(uri) }
        val fileIntent = Intent(Intent.ACTION_SEND_MULTIPLE).also {
            it.type = type
            it.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            it.addFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION)
            it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            it.putExtra(Intent.EXTRA_SUBJECT, emailSubject)
            it.putExtra(Intent.EXTRA_EMAIL, email)
            it.putParcelableArrayListExtra(Intent.EXTRA_STREAM, uris)
            it.flags = Intent.FLAG_GRANT_READ_URI_PERMISSION
        }
        return if (fileIntent.isAvailable(activity)) fileIntent else null
    }
}