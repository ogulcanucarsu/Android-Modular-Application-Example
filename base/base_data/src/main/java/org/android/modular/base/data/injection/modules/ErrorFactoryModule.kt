package org.android.modular.base.data.injection.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import org.android.modular.base.data.error.DefaultErrorFactory
import org.android.modular.base.data.error.ErrorFactory
import javax.inject.Singleton

@Module
class ErrorFactoryModule {

    @Provides
    @Singleton
    internal fun provideErrorFactory(context: Context): ErrorFactory =
        DefaultErrorFactory(context.applicationContext)

}