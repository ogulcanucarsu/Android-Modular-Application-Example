package org.android.modular.app.base.navigation

import android.content.Intent
import android.os.Bundle

const val PACKAGE_NAME = "org.android.modular.app"

private fun intentTo(className: String): Intent =
    Intent(Intent.ACTION_VIEW).setClassName(PACKAGE_NAME, className)

inline fun intentTo(className: String, crossinline extras: Bundle.() -> Unit = {}): Intent =
    Intent(Intent.ACTION_VIEW).putExtras(Bundle().apply(extras)).setClassName(PACKAGE_NAME, className)

internal fun String.loadIntentOrReturnNull(): Intent? =
    try {
        Class.forName(this).run { intentTo(this@loadIntentOrReturnNull) }
    } catch (e: ClassNotFoundException) {
        e.printStackTrace()
        null
    }

inline fun String.loadIntentOrReturnNull(crossinline extras: Bundle.() -> Unit = {}): Intent? =
    try {
        Class.forName(this).run { intentTo(this@loadIntentOrReturnNull, extras) }
    } catch (e: ClassNotFoundException) {
        e.printStackTrace()
        null
    }

