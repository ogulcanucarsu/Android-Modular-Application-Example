package org.android.modular.app.inject.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import org.android.modular.app.ModularApp
import org.android.modular.base.data.injection.modules.CoreModule

@Module(
    includes = [CoreModule::class]
)
class ApplicationModule {

    @Provides
    fun provideApplicationContext(app: ModularApp): Context {
        return app
    }
}