package org.android.modular.base.data.providers

import android.content.SharedPreferences
import java.util.*

class DefaultSessionKeyProvider(private val prefs: SharedPreferences) : SessionKeyProvider {

    override fun provideSessionKey(): String {
        var sessionKey = prefs.getString(SESSION_KEY, null)
        if (sessionKey == null) sessionKey = generateSessionKey()
        prefs.edit().putString(SESSION_KEY, sessionKey).apply()
        return sessionKey
    }

    private fun generateSessionKey() = UUID.randomUUID().toString()

    companion object {
        private const val SESSION_KEY = "session_key"
    }
}