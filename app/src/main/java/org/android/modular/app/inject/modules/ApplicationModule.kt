package org.android.modular.app.inject.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import org.android.modular.app.ModularApp

@Module
class ApplicationModule {

    @Provides
    fun provideApplicationContext(app: ModularApp): Context {
        return app
    }
}