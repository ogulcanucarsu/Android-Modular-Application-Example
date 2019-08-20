package org.android.modular.base.data.injection.modules

import dagger.Module
import dagger.Provides
import org.android.modular.base.data.error.DefaultErrorFactory
import org.android.modular.base.data.error.ErrorFactory
import javax.inject.Singleton

@Module
class ErrorFactoryModule {

    @Provides
    @Singleton
    internal fun provideErrorFactory(): ErrorFactory =
        DefaultErrorFactory()

}