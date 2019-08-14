package org.android.modular.base.data.modules

import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import org.android.modular.base.data.providers.DefaultSessionKeyProvider
import org.android.modular.base.data.providers.SessionKeyProvider

@Module
class CoreDataModule {

    @Provides
    fun provideSessionKeyProvider(prefs: SharedPreferences): SessionKeyProvider = DefaultSessionKeyProvider(prefs)
}