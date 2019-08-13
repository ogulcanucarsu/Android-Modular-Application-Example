package org.android.modular.base.data.extensions

import java.net.MalformedURLException
import java.net.URL
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

const val BLANK = ""

/*
 * Checks if the given string is a valid url
 */
fun String?.isUrl(): Boolean {
    return try {
        URL(this)
        true
    } catch (e: MalformedURLException) {
        false
    }
}

fun String.dateInFormat(format: String): String? {
    val date = Date(this.toLong())
    val dateFormat = SimpleDateFormat(format, Locale.getDefault())
    var time = BLANK
    try {
        time = dateFormat.format(date)
    } catch (ignored: ParseException) {
        ignored.printStackTrace()
    }
    return time
}

fun String?.capitalize(): String {
    if (this == null || this.isEmpty()) {
        return ""
    }

    val first = this[0]

    return if (Character.isUpperCase(first)) {
        this
    } else {
        Character.toUpperCase(first) + this.substring(1)
    }
}

